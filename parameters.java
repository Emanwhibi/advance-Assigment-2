package labMagento;

import java.util.Random;

import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class prameters {

	static String creatbouttunXpath ="//div[@class='panel header']//a[normalize-space()='Create an Account']";
	static String firstXpath ="//input[@id='firstname']";
	static String lastXpath ="//input[@id='lastname']";
	static String mailXpath ="//input[@id='email_address']";
	static String paswordlXpath ="//input[@id='password']"; 
	static String confpaswordlXpath ="//input[@id='password-confirmation'] "; 
    static String doneXpath ="//button[@title='Create an Account']//span[contains(text(),'Create an Account')]";
	static String signInXpath ="//div[@class='panel header']//a[contains(text(),'Sign In')]";    
	static String emailXpath ="//input[@id='email']"; 
	static String pasXpath ="//fieldset[@class='fieldset login']//input[@id='pass']";
	static String logOutPage ="https://magento.softwaretestingboard.com/customer/account/logout/";
	 static String doneBouttunXpath ="//fieldset[@class='fieldset login']//button[@id='send2']";
