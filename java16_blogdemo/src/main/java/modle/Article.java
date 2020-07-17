package modle;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Article
 * @Description
 * @Author by小房
 * @Date 2020/7/15 17:51
 */
public class Article {
    private int articleId;
    private String title;
    private String content;
    private int userId;

    public int getArticleId() {
        return articleId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getUserId() {
        return userId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                '}';
    }
}
