package Outfittery.web.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UITestFramework.OutfitteryScreens;

public class HomePage extends OutfitteryScreens  {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}	
	
	public By flag = By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[3]/a/span[2]");
	public By menu = By.xpath("//*[@id='menuLoggedIn']");
	public By edit = By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/ul/li[3]/a");
	public By radio1 = By.xpath("//*[@id='profileEdit-section']/section/div/div[2]/form[1]/div/div[1]/label[1]/input");
	public By radio2 = By.xpath("//*[@id='profileEdit-section']/section/div/div[2]/form[1]/div/div[1]/label[2]/input");
	public By customerlogin = By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[1]/a");
	public By email = By.name("j_username");
	public By password = By.name("j_password");
	public By submit = By.id("submit");
	public By billing = By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/ul/li[4]/a");
	public By ordercall=By.xpath("//*[@id='navbar']/div[2]/div[2]/ul/li[12]/a");
	public By occasion = By.cssSelector("#maSlider > div > div.question.active > div:nth-child(4) > div > div.row.cat1Occasions > div:nth-child(3) > a > div.overlay.overlay-international");
	public By nextbt1=By.xpath("//*[@id='maSlider']/div/div[1]/div[4]/div/div[5]/div[2]/input");
	public By nextbt2=By.xpath("//*[@id='maSlider']/div/div[2]/div[4]/div/div[5]/div[2]/input");
	public By cat=By.xpath("//*[@id='maSlider']/div/div[2]/div[4]/div/div[2]/div[4]/a/div[1]");
	public By txt1=By.xpath("");
	public By txt2=By.xpath("//*[@id='maSlider']/div/div[2]/div[4]/div/div[4]/div/textarea");
	public By myprofiletab=By.xpath("/html/body/span/div/nav/div/div/div/ul/li[3]/a/span");
	public By myprofile=By.xpath("//*[@id='navbar']/div[1]/div/ul/li[3]/a/span");	
	public By welcome=By.xpath("//*[@id='profileEdit-section']/section/div/div[1]");
	public By bdyht=By.id("heightInCm");
	public By weight=By.id("weightInKg"); 
	public By shirt=By.id("shirtSize");
	public By jeans=By.id("trousersSizeWidth");
	public By lth=By.id("trousersSizeLength");
	public By shoe=By.id("shoeSize");
	public By fnm = By.name("firstName");
	public By lnm = By.name("lastName");
	public By savename = By.name("Save data");
	public By pwd=By.id("password");
	public By nwpwd=By.id("newPassword");
	public By rppwd=By.id("repeatPassword");
	public By savepwd = By.name("Save password");
	public By savesize = By.xpath("//*[@id='profileEdit-section']/section/div/div[3]/div/div/a");
	public By savepopup = By.xpath("//*[@id='alertModal']/div/div/button");
	
}
