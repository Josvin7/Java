package api;

import modle.Article;
import modle.ArticleDao;
import modle.User;
import view.HtmlGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName DeleteArticleServlet
 * @Description
 * @Author by小房
 * @Date 2020/7/21 18:08
 */
public class DeleteArticleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        // 1、验证用户的登录状态，如果未登录，肯定不能删除
        HttpSession httpSession = req.getSession(false);
        if (httpSession == null) {
            String html = HtmlGenerator.getMessagePage("您尚未登陆！", "login.html");
            resp.getWriter().write(html);
            return;
        }
        User user = (User) httpSession.getAttribute("user");

        // 2、根据请求内容， 获取要删除的文章id
        String articleIdStr = req.getParameter("articleId");
        if (articleIdStr == null || "".equals(articleIdStr)) {
            String html = HtmlGenerator.getMessagePage("要删除的文章不存在", "article");
            resp.getWriter().write(html);
            return;
        }

        // 3、根据文章id 查到文章的作者，只有当文章作者是当前用户才可以进行删除操作
        ArticleDao articleDao = new ArticleDao();
        Article article = articleDao.selectById(Integer.parseInt(articleIdStr));
        if (article.getUserId() != user.getUserId()) {
            String html = HtmlGenerator.getMessagePage("您只能删除自己的文章！", "article");
            resp.getWriter().write(html);
            return;
        }
        // 4、真正执行删除操作
        articleDao.delete(Integer.parseInt(articleIdStr));
        // 5、返回一个删除成功的页面
        String html = HtmlGenerator.getMessagePage("删除成功!",
                "article");
        resp.getWriter().write(html);
    }
}
