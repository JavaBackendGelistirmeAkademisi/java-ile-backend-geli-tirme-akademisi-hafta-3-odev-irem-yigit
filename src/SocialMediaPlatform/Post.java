package SocialMediaPlatform;

public abstract class Post  {
    private int id;
    User user;
    String content;

    public Post(int id, User user, String content) {
        this.id = id;
        this.content = content;

    }

    public Post(int id) {
        this.id = id;
    }


    public int getId(){
        return id;
    }

}
