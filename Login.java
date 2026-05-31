public class Login {
    private String user;
    private String pasworde;

    public Login(String user, String pasworde) {
        this.user = user;
        this.pasworde = pasworde;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasworde() {
        return pasworde;
    }

    public void setPasworde(String pasworde) {
        this.pasworde = pasworde;
    }
}
