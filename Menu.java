import java.util.Scanner;

public class Menu {
    private String singUp;
    private String logIn;
    private String user;
    private String pas;
    private String username;
    private String pasword;
    private String bio;

    Database database = new Database();
    Singup singup = new Singup("admin", "admin", " ");

    Scanner input = new Scanner(System.in);
    private String userf;

    public void Start() {
        System.out.println("1-singup");
        System.out.println("2-login");
        int n = input.nextInt();
        if (n == 1) {

            System.out.print("enter username:");
            username = input.next();
            System.out.print("enter password:");
            pasword = input.next();
            System.out.print("sett bio:");
            input.nextLine();
            bio = input.nextLine();
            database.addUser(new Singup(username, pasword, bio));
            System.out.println("welcome " + username + "\n" + "login");
            System.out.print("enter username:");
            String user = input.next();
            System.out.print("enter password:");
            String pas = input.next();
            userf = database.login(user, pas);
            Fehrest();
        } else if (n == 2) {

            System.out.print("enter username:");
            user = input.next();
            System.out.print("enter password:");
            pas = input.next();
            userf = database.login(user, pas);
            if (userf.equals("f"))
            {
                System.out.println("username or password is wrong");
                Start();
            }
            else
            {
                Fehrest();
            }

        }


    }

    public void Fehrest() {
        System.out.println("1-Tweet");
        System.out.println("2-Following");
        System.out.println("3-Followers");
        System.out.println("4-Search user");
        System.out.println("5-Settings");
        System.out.println("6-Exit");
        int x = input.nextInt();
        if (x == 1) {

            System.out.println("1-new tweet");
            System.out.println("2-show tweets");
            int x2 = input.nextInt();
            if (x2 == 1) {
                System.out.print("enter text:");
                input.nextLine();
                String text = input.nextLine();
                singup.addtweet(text);
                //database.addTweet(new Tweet(userf, text));
                Fehrest();
            } else if (x2 == 2) {
                System.out.println("\n" + "tweets:");
                singup.printtweets(userf);
                //database.SearchTweets(userf);
                System.out.println();
                Fehrest();

            }
        } else if (x == 2) {
            singup.showfollowing();
        } else if (x == 3) {

        } else if (x == 4) {
            System.out.print("enter username:");
            String searchuser = input.next();
            int f = database.Search(searchuser);
            if (f == 1) {
                Fehrest();
            } else {
                int n = input.nextInt();
                if (n == 1) {
                    //follow
                } else if (n == 2) {
                    //unfollow
                } else if (n == 3) {
                    database.SearchTweets(searchuser);
                    Fehrest();
                } else if (n == 4) {
                    Fehrest();
                }
            }


        } else if (x == 5) {
            System.out.println("1-Edit your username");
            System.out.println("2-Edit your password");
            System.out.println("3-Edit your bio");
            System.out.println("4-Exit");
            int x2 = input.nextInt();
            if (x2 == 1) {
                userf = database.editusername(userf);
                Fehrest();
            } else if (x2 == 2) {
                //password edit

            } else if (x2 == 3) {
                //bio edit

            } else if (x2 == 4) {
                Fehrest();

            }
        } else if (x == 6) {
            Start();

        }

    }
}

