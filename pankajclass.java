package Pankaj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class pankajclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.29.1-win64\\geckoDriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		String tagname=" ";
		
		tagname=driver.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(1) > a")).getText();
		System.out.println(tagname);
		
		String link1=" ";
		String link6="";
		driver.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(1) > a")).click();
		Thread.sleep(2000);
		link1=driver.findElement(By.cssSelector("#link-effect-3 > ul > li.dropdown.menu__item.open > ul > li:nth-child(7) > a")).getText();
		System.out.println( "Element1 ="+link1);
		
		driver.findElement(By.cssSelector("#link-effect-3 > ul > li.dropdown.menu__item.open > ul > li:nth-child(7) > a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(1) > a")).click();
		link6=driver.findElement(By.cssSelector("li.dropdown:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")).getText();
		System.out.println("Element2 = "+link6);
		driver.findElement(By.cssSelector("li.dropdown:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")).click();
		
		
		String tagname2=" ";
		tagname2=driver.findElement(By.cssSelector("li.dropdown:nth-child(4) > a:nth-child(1)")).getText();
		System.out.println(tagname2);
		String link2="";
		String link7="";
		driver.findElement(By.cssSelector("li.dropdown:nth-child(4) > a:nth-child(1)")).click();
		
		Thread.sleep(2000);
		 link2=driver.findElement(By.cssSelector("li.dropdown:nth-child(4) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")).getText();
		System.out.println("Element3 =" +link2);
		driver.findElement(By.cssSelector("li.dropdown:nth-child(4) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li.dropdown:nth-child(4) > a:nth-child(1)")).click();
		link7=driver.findElement(By.cssSelector("li.dropdown:nth-child(4) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)")).getText();
		System.out.println("Element4 ="+link7);
		driver.findElement(By.cssSelector("li.dropdown:nth-child(4) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)")).click();
		Thread.sleep(2000);
		
		
		String tagname3=" ";
		tagname3=driver.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(2) > a")).getText();
		System.out.println(tagname3);
		String link3="";
		String link8="";
		
		driver.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(2) > a")).click();
		Thread.sleep(2000);
		link3=driver.findElement(By.cssSelector("#link-effect-3 > ul > li.dropdown.menu__item.open > ul > li:nth-child(2) > a")).getText();
		System.out.println("Element5 ="+link3);
		driver.findElement(By.cssSelector("#link-effect-3 > ul > li.dropdown.menu__item.open > ul > li:nth-child(2) > a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(2) > a")).click();
		link8=driver.findElement(By.cssSelector("li.dropdown:nth-child(2) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)")).getText();
		System.out.println("Element6 ="+link8);
		driver.findElement(By.cssSelector("li.dropdown:nth-child(2) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)")).click();
		Thread.sleep(2000);
		
		String tagname4=" ";
		tagname4=driver.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(3) > a")).getText();
		System.out.println(tagname4);
		String link4="";
		String link9="";
		
		driver.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(3) > a")).click();
		Thread.sleep(2000);
		link4=driver.findElement(By.cssSelector("#link-effect-3 > ul > li.dropdown.menu__item.open > ul > li:nth-child(2) > a")).getText();
		System.out.println("Element7 ="+link4);
		driver.findElement(By.cssSelector("#link-effect-3 > ul > li.dropdown.menu__item.open > ul > li:nth-child(2) > a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(3) > a")).click();
		link9=driver.findElement(By.cssSelector("#link-effect-3 > ul > li.dropdown.menu__item.open > ul > li:nth-child(5) > a")).getText();
		System.out.println("Element8 ="+link9);
		driver.findElement(By.cssSelector("#link-effect-3 > ul > li.dropdown.menu__item.open > ul > li:nth-child(5) > a")).click();
		Thread.sleep(2000);
		
		
		
		String tagname5=" ";
		tagname5=driver.findElement(By.cssSelector("li.dropdown:nth-child(5) > a:nth-child(1)")).getText();
		System.out.println(tagname5);
		String link5="";
		String link10="";
		
		driver.findElement(By.cssSelector("li.dropdown:nth-child(5) > a:nth-child(1)")).click();
		Thread.sleep(2000);
		link5=driver.findElement(By.cssSelector("li.dropdown:nth-child(5) > ul:nth-child(2) > li:nth-child(5) > a:nth-child(1)")).getText();
		System.out.println("Element9 ="+link5);
		driver.findElement(By.cssSelector("li.dropdown:nth-child(5) > ul:nth-child(2) > li:nth-child(5) > a:nth-child(1)")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li.dropdown:nth-child(5) > a:nth-child(1)")).click();
		link10=driver.findElement(By.cssSelector("#link-effect-3 > ul > li.dropdown.menu__item.open > ul > li:nth-child(1) > a")).getText();
		System.out.println("Element10 ="+link10);
		driver.findElement(By.cssSelector("#link-effect-3 > ul > li.dropdown.menu__item.open > ul > li:nth-child(1) > a")).click();
		Thread.sleep(2000);
		
		
	
		
	
		
	
		
		
		
		

	}

}
