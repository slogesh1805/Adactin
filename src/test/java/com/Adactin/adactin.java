package com.Adactin;


	import java.io.File;
	import java.io.IOException;
	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class adactin {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("slogesh05");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Logesh@1805");
	driver.findElement(By.id("login")).click();
	   WebElement location = driver.findElement(By.id("location"));
	Select sl= new Select(location);
	sl.selectByVisibleText("Sydney");

	WebElement hotel = driver.findElement(By.id("hotels"));
	Select h=new Select(hotel);
	h.selectByVisibleText("Hotel Sunshine");

	WebElement roomtype = driver.findElement(By.id("room_type"));
	Select r=new Select(roomtype);
	r.selectByVisibleText("Standard");

	WebElement datein = driver.findElement(By.id("datepick_in"));
	datein.sendKeys("29/09/2022");

	WebElement dateout = driver.findElement(By.id("datepick_out"));
	dateout.sendKeys("30/09/2022");

	WebElement adultroom = driver.findElement(By.id("adult_room"));
	Select ar=new Select(adultroom);
	ar.selectByVisibleText("1 - One");
	 
	WebElement childroom = driver.findElement(By.id("child_room"));
	Select cr=new Select(childroom);
	cr.selectByVisibleText("0 - None");
	 driver.findElement(By.id("Submit")).click();
	  
	 driver.findElement(By.xpath("//input[@name=\"radiobutton_0\"]")).click();
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 
	WebElement firstname = driver.findElement(By.id("first_name"));
	firstname.sendKeys("logesh");

	WebElement lastname = driver.findElement(By.id("last_name"));
	lastname.sendKeys("shanker");

	WebElement address = driver.findElement(By.id("address"));
	address.sendKeys("no.001,yyyyy,aaaaaa");

	WebElement c_no = driver.findElement(By.id("cc_num"));
	c_no.sendKeys("12345678912345678");

	WebElement cctype =driver.findElement(By.id("cc_type"));
	Select ctype =new Select(cctype);
	ctype.selectByVisibleText("American Express");
	 
	WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
	Select cexpm=new Select(cc_exp_month);
	cexpm.selectByVisibleText("January");

	WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
	Select cexpy=new Select(cc_exp_year);
	cexpy.selectByVisibleText("2012");

	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	cvv.sendKeys("123");

	driver.findElement(By.id("book_now")).click();

	Thread.sleep(5000);

	driver.findElement(By.xpath("//input[@name='logout']")).click();

	TakesScreenshot ss=(TakesScreenshot)driver;
	File su=ss.getScreenshotAs(OutputType.FILE);
	File f=new File("C:\\Users\\HP\\Adactin\\Screenshot\\adactin.png");
	FileUtils.copyFile(su, f);
	 



	}
	}

