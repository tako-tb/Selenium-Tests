import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AssignmentOne {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //ButtonClick & retrieve dynamic click  message once button is clicked

        //driver.get("https://demoqa.com/buttons");
        //driver.manage().window().maximize();

/*        WebElement buttonClickMe = driver.findElement(By.xpath("//button[text() = 'Click Me']"));
        String buttonClickMeText = buttonClickMe.getText();
        System.out.println(buttonClickMeText);
        buttonClickMe.click();
        Thread.sleep(5000);

        //String buttonClickMeTextTwo = driver.findElement(By.xpath("//*[@id = 'dynamicClickMessage']")).getText();
        String buttonClickMeTextTwo = driver.findElement(By.id("dynamicClickMessage")).getText();
        System.out.println(buttonClickMeTextTwo);*/
        //Thread.sleep(5000);
        //driver.close();



        //Click on all unselected checkboxes

/*        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();


        List<WebElement> checkBoxList = driver.findElements(By.xpath("//*[@type = 'checkbox']"));
        for (int i = 0; i < checkBoxList.size(); i++) {
            if (checkBoxList.get(i).isSelected() == false) {
                checkBoxList.get(i).click();
                System.out.println("Is Selected now:" + checkBoxList.get(i).getAttribute("Value"));
            } else {
                System.out.println(checkBoxList.get(i).getText());
            }
        }
        Thread.sleep(5000);
        driver.close();*/


        //Dropdown default meaning selection status:

/*        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();

        //Retrieve data about default meaning/text and options:
        WebElement selectTag = driver.findElement(By.xpath("//*[@id= 'dropdown']"));
        System.out.println(selectTag.getText());

        Select select = new Select(selectTag);
        String defaultTextfromDd = select.getFirstSelectedOption().getText();
        boolean defaultValueIsSelected = select.getFirstSelectedOption().isSelected();
        System.out.println("Is chosen for sure: " + defaultValueIsSelected);
        System.out.println(defaultTextfromDd);
        Thread.sleep(5000);
        driver.close();*/



        //RadioButton Click

        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement clickYesButton = driver.findElement(By.xpath("//*[@class = 'custom-control-label' and @for= 'yesRadio']"));
        clickYesButton.click();
        Thread.sleep(5000);
        driver.close();




    }


}
