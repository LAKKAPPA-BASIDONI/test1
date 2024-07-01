package techscore;

import org.openqa.selenium.WebDriver;

public class TechScoreLocator {
	HomePage home;
	CandidatePage candidate;
	RolesPage role;
	InvitePage invite;
	ProfilePage profile;
	LoginPage login;
	
	public TechScoreLocator(WebDriver driver) {
		this.home = new HomePage(driver);
		this.candidate = new CandidatePage(driver);
		this.role = new RolesPage(driver);
		//this.invite = new InvitePage(driver);
		this.profile = new ProfilePage(driver);
		this.login = new LoginPage(driver);
	}

}
