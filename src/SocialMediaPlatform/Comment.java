package SocialMediaPlatform;


public class Comment {
    private User creator;
    private String commentContent;

    public Comment(User creator, String commentContent) {
        this.creator = creator;
        this.commentContent = commentContent;
    }

    public String getCommentContent() {
        return commentContent;
    }
}
