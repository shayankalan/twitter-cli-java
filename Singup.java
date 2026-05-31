import java.util.Scanner;

public class Singup {
    private String username;
    private String password;
    private String bio;
    private String[] following;
    private String[] follower;
    private Tweet[] tweets;

    private int countt = 0;
    Database database = new Database();
    Scanner input = new Scanner(System.in);
    private int count = 0;
    public Singup(String username, String password, String bio) {
        this.username = username;
        this.password = password;
        this.bio = bio;
        following = new String[100];
        follower = new String[100];
        tweets = new Tweet[100];
    }

    public Singup() {
        following = new String[100];
        follower = new String[100];
        tweets = new Tweet[100];
    }

    public void Follow(String user)
    {
        for (int i = 0; i < database.count21; i++) {
            if (following[i].equals(user))
            {
                System.out.println("cant");
                break;
            } else if (i+1 == database.count21) {
                int x = input.nextInt();
                if (x==1)
                {
                    following[count] = user;
                    count++;
                    break;
                } else if (x==2) {
                    for (int j = 0; j < count; j++) {
                        if (following[j].equals(user))
                        {
                            following[i] = null;
                            break;
                        } else if (j == count-1) {
                            System.out.println("user not found");

                        }

                    }

                }


            }

        }
    }
    public void addtweet(String text)
    {
        tweets[countt]=new Tweet();
        tweets[countt].setText(text);
        countt++;
    }
    public void uprinttweets(String user)
    {

        for (int i = 0; i < countt; i++) {
            //if (database.getUsers()[i].getUsername().equals(user))

            System.out.println(i + "-" + tweets[i].getText()+ "  " + tweets[i].getTimestamp() + "\n" + "like:" +tweets[i].getLike() + "\n" + " comments:");
            tweets[i].printComments();
        }

        System.out.println("for exit enter 00");
        System.out.print("enter number of tweet:");
        int t = input.nextInt();
        if (t==00)
        {
            return;
        }
        else {
            System.out.println(tweets[t].getText() + "\n" + "1-comment" + "\n" + "2-like");
            int z = input.nextInt();
        if (z==1)
        {
            System.out.print("enter comment:");
            input.nextLine();
            String comment = input.nextLine();
            tweets[t].addcomment(comment);
        } else if (z==2) {
            tweets[t].addLike();
        }
        }
    }
    public void showfollowing()
    {
        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + "-" + following[i]);

        }
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getFollowing() {
        return following;
    }

    public void setFollowing(String[] following) {
        this.following = following;
    }

    public String[] getFollower() {
        return follower;
    }

    public void setFollower(String[] follower) {
        this.follower = follower;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Tweet[] getTweets() {
        return tweets;
    }

    public void setTweets(Tweet[] tweets) {
        this.tweets = tweets;
    }
}
