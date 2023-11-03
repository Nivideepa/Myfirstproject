package com.pagemanager;

import org.openqa.selenium.WebDriver;

import com.loginpage.BookCofirmation_page5;
import com.loginpage.Book_hotelpage4;
import com.loginpage.Finalpage1;
import com.loginpage.Login;
import com.loginpage.Search_hotel;
import com.loginpage.Select_hotelpage3;

public class Pagemanager
{
	private WebDriver driver;
    private Login h1;
    private Search_hotel h2; ;
   private Select_hotelpage3 h3;
   private Book_hotelpage4 h4;
   private BookCofirmation_page5 h5;
   private  Finalpage1 h6;
	
	  public Pagemanager(WebDriver driver)
	    {
	        this.driver = driver;
	        h1 = new Login(driver);
	        h2=new Search_hotel(driver);
	        h3=new Select_hotelpage3(driver);
	        h4=new Book_hotelpage4(driver);
	        h5=new BookCofirmation_page5(driver);
	        h6=new Finalpage1(driver);
	    }
	    public Login getinstancehp()
	    {
	        return h1;
	        
	    }
	    


		public Search_hotel getinstancehp1()
	    {
	        return h2;
	    }
		
		public Select_hotelpage3 getinstancehp2()
		{      return h3;
	    }
		public Book_hotelpage4 getinstancehp3()
		{     
			return h4;
	    }
		public BookCofirmation_page5 getinstancehp4()
		{     
			return h5;
	    }
		public Finalpage1 getinstancehp5()
		{     
			return h6;
	    }
	

}
