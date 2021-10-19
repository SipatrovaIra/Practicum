package zadanie;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test {
    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://google.com");
        WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        search.sendKeys("калькулятор");
        search.submit();

    }
    @org.junit.Test
    public void FirstTest(){
        driver.findElement(By.xpath("//div[@jsname='j93WEe']")).click();
        driver.findElement(By.xpath("//div[@jsname='N10B9']")).click();
        driver.findElement(By.xpath("//div[@jsname='XSr6wc']")).click();
        driver.findElement(By.xpath("//div[@jsname='lVjWed']")).click();
        driver.findElement(By.xpath("//div[@jsname='qCp9A']")).click();
        driver.findElement(By.xpath("//div[@jsname='YovRWb']")).click();
        driver.findElement(By.xpath("//div[@jsname='KN1kY']")).click();
        driver.findElement(By.xpath("//div[@jsname='pPHzQc']")).click();
        driver.findElement(By.xpath("//div[@jsname='xAP7E']")).click();
        driver.findElement(By.xpath("//div[@jsname='bkEvMb']")).click();
        driver.findElement(By.xpath("//div[@jsname='WxTTNd']")).click();
        driver.findElement(By.xpath("//div[@jsname='Ax5wH']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
        WebElement formula = driver.findElement(By.xpath("//span[@jsname='ubtiRe']"));
        String act_f= "(1 + 2) × 3 - 40 ÷ 5 =";
        String exp_f= formula.getText();
        Assert.assertEquals(act_f,exp_f);
        WebElement element = driver.findElement(By.xpath("//span[@jsname='VssY5c']"));
        String act_r= "1";
        String exp_r= element.getText();
        Assert.assertEquals(act_r,exp_r);
    }

    @org.junit.Test
    public void SecondTest(){
        driver.findElement(By.xpath("//div[@jsname='abcgof']")).click();
        driver.findElement(By.xpath("//div[@jsname='WxTTNd']")).click();
        driver.findElement(By.xpath("//div[@jsname='bkEvMb']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
        WebElement formula= driver.findElement(By.xpath("//span[@jsname='ubtiRe']"));
        String act_f="6 ÷ 0 =";
        String exp_f=formula.getText();
        Assert.assertEquals(act_f,exp_f);
        WebElement result= driver.findElement(By.xpath("//span[@jsname='VssY5c']"));
        String act_r="Infinity";
        String exp_r=result.getText();
        Assert.assertEquals(act_r,exp_r);

    }

    @org.junit.Test
    public void ThirdTest(){
        driver.findElement(By.xpath("//div[@jsname='aN1RFf']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
        WebElement formula= driver.findElement(By.xpath("//span[@jsname='ubtiRe']"));
        String act_f="sin() =";
        String exp_f=formula.getText();
        Assert.assertEquals(act_f,exp_f);
        WebElement result= driver.findElement(By.xpath("//span[@jsname='VssY5c']"));
        String act_r="Error";
        String exp_r=result.getText();
        Assert.assertEquals(act_r,exp_r);

    }

    @After
    public void close(){
        driver.quit();
    }

}

