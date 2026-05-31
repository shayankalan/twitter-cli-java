import java.util.Scanner;

public class Database {
    private Singup[] users;
    //private Tweet[] tweets;

    private int id;
    public Database() {
        users = new Singup[100];
        //tweets = new Tweet[100];

    }

    //Tweet tweet = new Tweet("admin", "admin");

    public int count21 = 0;
    int count1 = 0;
    Scanner input = new Scanner(System.in);

    public String login(String user, String pas)
    {
        Login login = new Login(user, pas);
        for (int i = 0; i < count21; i++) {
            if (users[i].getUsername().equals(user))
            {
                if (users[i].getPassword().equals(pas)) {
                    System.out.println("welcome" + " " + users[i].getUsername() + "\n" + "your bio:" + users[i].getBio());
                    id = i;
                    return user;

                }
                else
                {
                    System.out.println("pasworde is rong" + "\n" + "try again");
                    System.out.print("enter username:");
                    String user1 = input.next();
                    System.out.print("enter pasword:");
                    String pas1 = input.next();
                    login(user1, pas1);
                }
            } else if (i==count21-1 && users[i].getUsername().equals(login.getUser())) {System.out.println("username not found" + "\n" + "try again");

                System.out.print("enter username:");
                String user1 = input.next();
                System.out.print("enter pasword:");
                String pas1 = input.next();
                login(user1, pas1);
                return null;
            }

        }
        user = "f";
        return user;

    }
//    public void meghdar()
//    {
//        for (int i = 0; i < users.length ; i++) {
//            users[i].setUsername("a");
//            users[i].setPassword("0");
//        }
//
//    }
    public String editusername(String username)
    {
        for (int i = 0; i < count21; i++) {
            if (users[i].getUsername().equals(username))
            {
                System.out.print("enter new username:");
                String user = input.next();
                users[i].setUsername(user);
                return user;
            }

        }
        return username;
    }
    public void addUser(Singup user)
    {

        users[count21] = new Singup();
        users[count21] = user;
        count21++;
    }
//    public void addTweet(Tweet tweet)
//    {
//        tweets[count1] = tweet;
//        count1++;
//    }

    public void SearchTweets(String user)
    {
        for (int i = 0; i < count21; i++) {
            if (users[i].getUsername().equals(user))
            {
                users[i].printtweets(user);
                break;
            }

        }
    }
    public int Search(String user)
    {
        for (int i = 0; i < count21; i++) {
            if (users[i].getUsername().equals(user))
            {
                System.out.println("username:" + user + "  found :)");
                System.out.println("1-Follow");
                System.out.println("2-Unfollow");
                System.out.println("3_Profile");
                System.out.println("4-Exist");
                break;
            }
            else if (i == count21 - 1)
            {

                System.out.println("user not found");
                return 1;
            }

        }

    return 0;}

    public Singup[] getUsers() {
        return users;
    }

    public void setUsers(Singup[] users) {
        this.users = users;
    }
}

