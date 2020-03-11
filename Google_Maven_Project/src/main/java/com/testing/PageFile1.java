package com.testing;

import org.testng.AssertJUnit;


import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



		public class PageFile1 extends LocatorsFile1{

			public WebDriver driver;
			
			public void openBrowser() throws IOException, InterruptedException {
				
				//Opening Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:/DEV_IT_Training/DIT0002/DIT0002/Google_Maven_Project/data/chromedriver/chromedriver.exe");
				driver = new ChromeDriver();
				
				//Setup Driver Property
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
				
				PageFactory.initElements(driver, this);	

			}
			public void closeBrowser() {		
				driver.quit();
			
			}
			
			public void openURL() throws Exception {	
				driver.get("https://mail.google.com");
			}
				
			public void Email() throws InterruptedException {
				Thread.sleep(2000);
				Email.sendKeys("payal09tejani@gmail.com");
				Thread.sleep(2000);
				nextbtn.sendKeys(Keys.ENTER);
				
			
				
					Thread.sleep(2000);
			 String actual_error=InvalidEmail.getText();
			 String expected_error="Couldn't find your Google Account";
			 
			 
			 
			 AssertJUnit.assertEquals( actual_error, expected_error);
			 System.out.println("Both error msg are same - Test pass");
			 
			 
				}
			 
			
			
			
			/*public WebDriver driver1;
			
             public void openBrowser1() throws IOException, InterruptedException {
            	 Thread.sleep(7000);	
				//Opening Chrome Browser
            	  Thread.sleep(4000);
				System.setProperty("webdriver.chrome.driver", "C:/DEV_IT_Training/DIT0002/DIT0002/Google_Maven_Project/data/chromedriver/chromedriver.exe");
				driver = new ChromeDriver();
             }
             public void openURL1() throws Exception {
	             driver.get("https://mail.google.com");
	             }		*/
			
             
				
			public void Id() throws InterruptedException {
				Thread.sleep(2000);
				Id.sendKeys("payal19tejani@gmail.com");
				Thread.sleep(2000);
				Next.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				Password.sendKeys("Jig1994");
				Thread.sleep(2000);
				Nextbtn.sendKeys(Keys.ENTER);
				
			
			
			
			
			
				
			
			
				
			
			
			
		
           Thread.sleep(4000);
           String actualerrormsg=InvalidPassword.getText();
           String expectederrormsg="Wrong password. Try again or click Forgot password to reset it.";
           
           AssertJUnit.assertEquals( actualerrormsg, expectederrormsg);
           System.out.println("Both error msg are same - Test Pass");
           
				
			}
			public void password() throws InterruptedException {
				Thread.sleep(2000);
				Id.sendKeys("payal19tejani@gmail.com");
				Thread.sleep(2000);
				Next.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				password.sendKeys("Pay191994");
				Thread.sleep(2000);
				
				next.sendKeys(Keys.ENTER);
				
			
			
			
			
				
				
			Thread.sleep(2000);
			WebElement mailSize=Totalmails;
			System.out.println(" Total Number of emails : " + mailSize.getText());
			}
			
			public void MovetoemailinTrash() throws InterruptedException {
				
				Id.sendKeys("payal19tejani@gmail.com");
				Thread.sleep(2000);
				Next.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				password.sendKeys("Pay191994");
				Thread.sleep(2000);
				next.sendKeys(Keys.ENTER);
				
			Thread.sleep(2000);	
		    selectmailininbox.click();
		    System.out.println("select one mail");
			Thread.sleep(2000);
			MoveTo.click();
			System.out.println("Click on Move To");
			Thread.sleep(2000);
			Trash.click();
			System.out.println("Click on Trash");
			Thread.sleep(2000);
			
			
			}
			public void totalmail() throws InterruptedException {
				Id.sendKeys("payal19tejani@gmail.com");
				Thread.sleep(2000);
				Next.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				password.sendKeys("Pay191994");
				Thread.sleep(2000);
				next.sendKeys(Keys.ENTER);
				
		    Thread.sleep(2000);
		    
		    WebElement mailSize1=Totalmails1;
			System.out.println(" Total Number of emails : " + mailSize1.getText());
				
			}	
				
			public void movetoemailininbox() throws InterruptedException {
				Id.sendKeys("payal19tejani@gmail.com");
				Thread.sleep(2000);
				Next.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				password.sendKeys("Pay191994");
				Thread.sleep(2000);
				next.sendKeys(Keys.ENTER);
				
			Thread.sleep(2000);
			More.click();
			System.out.println("Click on More");
			Thread.sleep(2000);
			selectTrash.click();
			System.out.println("Click on Trash");
			Thread.sleep(2000);
			selectmailintrash.click();
			System.out.println("Select one mail in Trash");
			Thread.sleep(2000);
			Movetoinbox.click();
			System.out.println("Click on Move To");
			Thread.sleep(2000);
			Inbox.click();
			System.out.println("Click on Inbox");
			Thread.sleep(2000);
			
			}	
				
			public void totalMail() throws InterruptedException {
				Id.sendKeys("payal19tejani@gmail.com");
				Thread.sleep(2000);
				Next.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				password.sendKeys("Pay191994");
				Thread.sleep(2000);
				next.sendKeys(Keys.ENTER);
				
			Thread.sleep(2000);
			
			WebElement mailSize2=Totalmails;
			System.out.println(" Total Number of emails : " + mailSize2.getText());
			
			}	
			
			public void markasunreadmail() throws InterruptedException {
				Id.sendKeys("payal19tejani@gmail.com");
				Thread.sleep(2000);
				Next.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				password.sendKeys("Pay191994");
				Thread.sleep(2000);
				next.sendKeys(Keys.ENTER);
				
			Thread.sleep(2000);
			Readmail.click();
			System.out.println("Click on Read mail");
			Thread.sleep(2000);
			morebtn.click();
			System.out.println("Click on More Button");
			Thread.sleep(2000);
			UnreadBtn.click();
			System.out.println("Click on Mark as Unread Button");
			
			}
			
			public void markasreadmail() throws InterruptedException {
				Id.sendKeys("payal19tejani@gmail.com");
				Thread.sleep(2000);
				Next.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				password.sendKeys("Pay191994");
				Thread.sleep(2000);
				next.sendKeys(Keys.ENTER);
				
			Thread.sleep(2000);
			unreadmail.click();
			System.out.println("Click on Unread mail");
			Thread.sleep(2000);
			more.click();
			System.out.println("Click on more");
			Thread.sleep(2000);
			ReadBtn.click();
			System.out.println("Click on Mark as Read Button");
			
			
				
			}
				
			}
			
				
			
				
				
				
			



	

