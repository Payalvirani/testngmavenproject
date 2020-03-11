package com.testing;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFile1 {


	
		
		PageFile1 pf = new PageFile1();
		
		@BeforeMethod
		public void beforeMethod() throws Exception {
			pf.openBrowser();
			pf.openURL();
			
		}	
				
			
		
		@AfterMethod
		public void afterMethod(ITestResult result) {
		
			pf.closeBrowser();
		}

		
		
		
        @Test(priority = 1)
        
        public void Email() throws InterruptedException {
        	
        	pf.Email();
        	
        }
       
        	
        
       
        @Test(priority =2)
       public void Id() throws InterruptedException {
        	pf.Id();
        	
        }

     
    	  
      
      
     
      
     @Test(priority =3)
     public void password() throws InterruptedException {
    	 pf.password();
     }


@Test(priority = 4)
     public void MovetoemailinTrash() throws InterruptedException {
    	 pf.MovetoemailinTrash();
     }

@Test(priority =5)
     public void totalmail() throws InterruptedException {
    	 pf.totalmail();
     }
@Test(priority =6)
     public void movetoemailininbox() throws InterruptedException {
    	 pf.movetoemailininbox();
     }

@Test(priority =7)
     public void totalMail() throws InterruptedException {
    	 pf.totalMail();
     }

@Test(priority =8)
     public void markasunreadmail() throws InterruptedException {
    	 pf.markasunreadmail();
     }

@Test(priority =9)
     public void markasreadmail() throws InterruptedException {
    	 pf.markasreadmail();
     }







































}

	
	

