package pagesCESL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;

public class comboMeals extends Common {
	
	 static WebDriver driver;
	 
	 @FindBy (xpath="//*[text()='4 Express Tenders Combo']/following::div[@class='card-footer'][1]/div[1]")
	 public static WebElement ComboProduct;
	 
	 public comboMeals(WebDriver rdriver)
		{
			this.driver=rdriver;
			PageFactory.initElements(driver, this);
		}
		
	
	public static void selectComboMealProduct4ExpressTendersCombo() throws InterruptedException

	{
		Thread.sleep(5000);
		WebElement ExpressTendersCombo4=driver.findElement(By.xpath("//*[text()='4 Express Tenders Combo']/following::div[@class='card-footer'][1]/div[2]"));
		ExpressTendersCombo4.click();
	}
	
	public static void selectComboMealProduct7ExpressTendersCombo() throws InterruptedException

	{
		Thread.sleep(5000);
		WebElement ExpressTendersCombo7=driver.findElement(By.xpath("//*[text()='7 Express Tenders Combo']/following::div[@class='card-footer'][1]/div[2]"));
		ExpressTendersCombo7.click();
	}

	public static void breatOptions() throws InterruptedException

	{
		Thread.sleep(5000);
		WebElement breadChoice=driver.findElement(By.xpath("//*[@class='categoryHeading active chz1 breadchoice']"));
		breadChoice.click();
		
		String[] array= {"biscuit","roll","no bread"};
		
		ArrayList<String> arraylist=new ArrayList<String>();
		
		List<WebElement> elements  = driver.findElements(By.xpath("//*[@data-subchoicename='Bread Choice:']/parent::label"));
		
		for (WebElement ele :elements)
		{
			//System.out.println(ele.getText());
			arraylist.add(ele.getText());
		}
		
		  System.out.println("Actual bread choices (including sub-items): " + Arrays.toString(arraylist.toArray()));
	      System.out.println("Expected bread choices (including sub-items): " + Arrays.toString(array));
		
		if (Arrays.asList(array).equals(arraylist))
	
			System.out.println("All bread choices and sub-items match exactly. No discrepancies found.");
		else
			System.out.println("Mismatch in bread choices or sub-items. Some items are missing or extra");
		
	}
	
	public static void tendersOptions() throws InterruptedException

	{
		WebElement tendersChoice=driver.findElement(By.xpath("//*[@class='categoryHeading chz2 tenderschoice']"));
		tendersChoice.click();
		
		String[] array= {"all regular", "all spicy", "half regular / half spicy", "1 regular / 3 spicy", "3 regular / 1 spicy"};
		
		ArrayList<String> arraylist=new ArrayList<String>();
		
		List<WebElement> elements  = driver.findElements(By.xpath("//*[@data-subchoicename='Tenders Choice:']/parent::label"));
		
		for (WebElement ele :elements)
		{
			//System.out.println(ele.getText());
			arraylist.add(ele.getText());
		}
		
		  System.out.println("Actual Tenders choices (including sub-items): " + Arrays.toString(arraylist.toArray()));
	      System.out.println("Expected Tenders choices (including sub-items): " + Arrays.toString(array));
		
		
		if (Arrays.asList(array).equals(arraylist))
	
			System.out.println("All Tenders choices and sub-items match exactly. No discrepancies found.");
		else
			System.out.println("Mismatch in Tenders choices or sub-items. Some items are missing or extra");
	
	}
	
	//Sauce Choices (Pick 2):
	
	public static void sauceChoicesPick2() throws InterruptedException

	{
		WebElement sauceChoice2=driver.findElement(By.xpath("//*[text()='Sauce Choices (Pick 2)']"));
		sauceChoice2.click();
		
		String[] array= {"bbq","ranch","jalapeno ranch","honey mustard","buffalo sauce","chipotle ranch","marinara","cocktail sauce","tartar sauce"};
		
		ArrayList<String> arraylist=new ArrayList<String>();
		
		List<WebElement> elements  = driver.findElements(By.xpath("//*[@id='saucechoicespick2']/following-sibling::label/div/div/label[@class='menu-item-label']"));
		
		for (WebElement ele :elements)
		{
			//System.out.println(ele.getText());
			arraylist.add(ele.getText());
		}
			
		System.out.println("Actual Sauce Choices Pick (2) (including sub-items): " + Arrays.toString(arraylist.toArray()));
		System.out.println("Expected Sauce Choices Pick (2) (including sub-items): " + Arrays.toString(array));

		
		if (Arrays.asList(array).equals(arraylist))
	
			System.out.println("All 'Sauce Choices Pick (2)' and sub-items match exactly. No discrepancies found.");
		else
			System.out.println("Mismatch in 'Sauce Choices Pick (2)' or sub-items. Some items are missing or extra");

	}
	
	
	public static void tenders_Choice_Pick_7() throws InterruptedException

	{
		WebElement ele=driver.findElement(By.xpath("//*[text()='Tenders Choice (Pick 7)']"));
		ele.click();
		
		String[] array= {"regular","spicy"};

		ArrayList<String> arraylist=new ArrayList<String>();

		List<WebElement> elements  = driver.findElements(By.xpath("//*[@id='tenderschoicepick7']/following-sibling::label/div/div/label[@class='menu-item-label']"));
		
		for (WebElement e :elements)
		{
		//	System.out.println(ele.getText());
			arraylist.add(e.getText());
		}
			
		System.out.println("Actual Tenders Choice (Pick 7) (including sub-items): " + Arrays.toString(arraylist.toArray()));
		System.out.println("Expected Tenders Choice (Pick 7) (including sub-items): " + Arrays.toString(array));

		
		if (Arrays.asList(array).equals(arraylist))
	
			System.out.println("All 'Tenders Choice (Pick 7)' and sub-items match exactly. No discrepancies found.");
		else
			System.out.println("Mismatch in 'Tenders Choice (Pick 7)' or sub-items. Some items are missing or extra");

		
	
	}
	
	
	
	
	
	
}
