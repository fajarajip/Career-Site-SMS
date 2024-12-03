package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Tests.TestRegister.driver;

public class Other {
    public static void selectMobilitas(){
        WebElement setMobilitas = driver.findElement(By.xpath("//span[contains(text(),'Mobilitas')]"));
        setMobilitas.click();
        WebElement setValueMobilitas = driver.findElement(By.xpath("//span[contains(text(),'Kendaraan Umum')]"));
        setValueMobilitas.click();
    }

    public static void checkBoxTermAndCond(){
        driver.findElement(By.xpath("//label[contains(text(),'Saya setuju dengan')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Kirim')]")).click();
    }
}
