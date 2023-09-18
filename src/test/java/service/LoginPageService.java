package service;

import model.User;
import pages.LoginPage;

public class LoginPageService {

    private LoginPage loginPage = new LoginPage();

    public void loginWithUser(User user){
        loginPage.openPage(user.getUrl())
                .fillInUserName(user.getUserName())
                .fillInPassword(user.getPassword())
                .clickLoginButton(); //вызываются цепочкой, т.к. в методах есть return this и они опрокидываюся дальше
    }
}
