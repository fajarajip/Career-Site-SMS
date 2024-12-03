package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Tests.TestRegister.driver;

public class Education {
    public static String lastEducation_xpath = "//span[contains(text(),'Pendidikan Terakhir')]";
    public static String selectLastEducation_xpath = "//span[contains(text(),'Sarjana')]";
    public static String university_xpath = "//span[contains(text(),'Sekolah/ Universitas')]";
    public static String selectUniversity_xpath = "//span[contains(text(),'AKADEMI MANAJEMEN PERPAJAKAN MAKASSAR')]";
    public static String major_xpath = "//span[contains(text(),'Jurusan')]";
    public static String selectMajor_xpath = "//span[contains(text(),'AKADEMI ANALIS FARMASI DAN MAKANAN')]";
    public static String gpa_xpath = "//input[@id='educations.0.gpa']";
    public static String startDateEduc_xpath = "//input[@placeholder='Tanggal Mulai']";
    public static String checkboxUdergraduate_xpath = "//label[contains(text(),'Belum Lulus')]";
    public static String buttonNext_xpath = "//span[contains(text(),'Selanjutnya')]";

    public static void selectLastEducation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement educationElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(lastEducation_xpath)));
        educationElement.click();
        WebElement selectEduc = driver.findElement(By.xpath(selectLastEducation_xpath));
        selectEduc.click();
    }

    public static void selectUniversity() throws InterruptedException {
        driver.findElement(By.xpath(university_xpath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(selectUniversity_xpath)).click();
    }

    public static void selectMajor() throws InterruptedException {
        driver.findElement(By.xpath(major_xpath)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(selectMajor_xpath)).click();
    }

    public static void inputGPA(){
        driver.findElement(By.xpath(gpa_xpath)).sendKeys("3");
    }


    public static void selectStartDateEduc() {
        WebElement startEducation = driver.findElement(By.xpath(startDateEduc_xpath));
        startEducation.sendKeys("24 Nov 2024");
        startEducation.sendKeys(Keys.RETURN);
    }


    public static void checkboxUndergraduate(){
        WebElement checkboxUnder = driver.findElement(By.xpath(checkboxUdergraduate_xpath));
        checkboxUnder.click();
        driver.findElement(By.xpath(buttonNext_xpath)).click();
    }
}