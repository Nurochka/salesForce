package model;

public class User {
    private String url = "https://page-java-7530.my.salesforce.com";
    private String userName = "nurchik.grodno-68ww@force.com";
    private String password = "Mazda@88";

    public User(){

    }

    public User(String url, String userName, String password) {
        this.url = url;
        this.userName = userName;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
