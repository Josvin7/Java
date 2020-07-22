package api;

import modle.Article;
import modle.ArticleDao;
import modle.User;
import modle.UserDao;
import view.HtmlGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName ArticleServlet
 * @Description
 * @Author by小房
 * @Date 2020/7/21 15:34
 */
public class ArticleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        // 1、验证用户是否已经登录，如果尚未登录，就提示用户进行登录操作
        HttpSession httpSession = req.getSession(false);
        if (httpSession == null) {
            // 当前状态就是未登录状态
            String html = HtmlGenerator.getMessagePage("请先进行登录！", "login.html");
            resp.getWriter().write(html);
            return;
        }
        User user = (User) httpSession.getAttribute("user");
        // 2、判断请求是否存在 articleId 参数
        String articleIdStr = req.getParameter("articleId");
        if (articleIdStr == null) {
            // a）没有这个参数就去执行获取文章列表操作
            getAllArticle(user, resp);
        } else {
            // b) 有这个参数就去执行获取文章具体内容
            getOneArticle(Integer.parseInt(articleIdStr), user, resp);
        }
    }

    private void getOneArticle(int articleId, User user, HttpServletResponse resp) throws IOException {
        // 1、查找数据库
        ArticleDao articleDao = new ArticleDao();
        Article article = articleDao.selectById(articleId);
        if (article == null) {
            // 文章未找到
            String html = HtmlGenerator.getMessagePage("文章不存在", "article");
            resp.getWriter().write(html);
            return;
        }
        // 2、根据作者 id 找到作者信息，进一步得到作者姓名
        UserDao userDao = new UserDao();
        User author = userDao.selectById(article.getUserId());   //在这里刚才错误  在这里是根据用户id 获得作者信息
        // 3、构造页面
        String html = HtmlGenerator.getArticleDetailPage(article, user, author);
        resp.getWriter().write(html);
    }

    private void getAllArticle(User user, HttpServletResponse resp) throws IOException {
        // 1、查找数据库
        ArticleDao articleDao = new ArticleDao();
        List<Article> articles = articleDao.selectAll();
        // 2、构造页面
        String html = HtmlGenerator.getArticleListPage(articles, user);
        resp.getWriter().write(html);
    }

    // 实现新增文章的逻辑

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");
        // 1、判断用户登录状态，如果用户上未登录，就要提醒用户登录
        HttpSession httpSession = req.getSession(false);
        if (httpSession == null) {
            String html = HtmlGenerator.getMessagePage("您尚未登录", "login.html");
            resp.getWriter().write(html);
            return;
        }
        User user = (User) httpSession.getAttribute("user");
        // 2、从请求中读取浏览器提交的数据（title ， content） ，并进行简单的校验
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        if (title == null || "".equals(title)
                || content == null ||"".equals(content)) {
            String html = HtmlGenerator.getMessagePage("提交的标题或者内容为空", "article");
            resp.getWriter().write(html);
            return;
        }
        // 3、把数据放在数据库中
        ArticleDao articleDao = new ArticleDao();
        Article article = new Article();
        article.setUserId(user.getUserId());
        article.setContent(content);
        article.setTitle(title);
        articleDao.add(article);
        // 4、返回一个插入成功的页面
        String html = HtmlGenerator.getMessagePage("发布成功！", "article");
        resp.getWriter().write(html);
        return;
    }
}
