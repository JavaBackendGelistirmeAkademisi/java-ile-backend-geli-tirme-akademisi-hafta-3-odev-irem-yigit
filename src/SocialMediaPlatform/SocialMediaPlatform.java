package SocialMediaPlatform;

public class SocialMediaPlatform {
    public static void main(String[] args) {

        User user1 = new User("Ali");
        user1.createPost("Merhaba Dünya!");
        Post post1 = user1.getPost(0); // İlk gönderiyi al

        User user2 = new User("Ayşe");
        user2.follow(user1);
        user2.addCommentToPost(user1, 0, "Güzel bir gönderi!");

        user2.showFeed();

    }
}