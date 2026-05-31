import java.time.LocalDateTime;
import java.util.Arrays;

public class Tweet {
    private String text;
    private String user;
    private LocalDateTime timestamp;
    private String[] comments;
    private int like;
    public int countc = 0;
//    public Tweet(String user, String text) {
//        this.text = text;
//        this.user = user;
//        this.timestamp = LocalDateTime.now();
//        comments = new String[100];
//        like = 0;
//    }
public Tweet(String text) {
    this.text = text;
    this.timestamp = LocalDateTime.now();
    comments = new String[100];
    like = 0;
}
public Tweet(){

    comments = new String[100];
}
    public void printComments()
    {
        for (int i = 0; i < countc; i++) {
            System.out.println(i+1 + "-" + comments[i]);
        }
    }

    public void addcomment(String comment)
    {
        comments[countc] = comment;
        countc++;
    }

    public void addLike()
    {
        like++;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String[] getComments() {
        return comments;
    }

    public void setComments(String[] comments) {
        this.comments = comments;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

}
