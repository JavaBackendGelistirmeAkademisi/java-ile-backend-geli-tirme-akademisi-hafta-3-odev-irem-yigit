package SocialMediaPlatform;

import java.util.HashSet;
import java.util.Set;

public class Post  {
    private int id;
    private User creator;
    private String content;
    private Set<Comment> comments;

    public Post(int id, User creator, String content) {
        this.id = id;
        this.creator = creator;
        this.content = content;
        this.comments = new HashSet<>();

    }
    public int getId(){
        return id;
    }

    public String getContent() {
        return content;
    }

    public void addComment(Comment comment){
        comments.add(comment);

    }

}
