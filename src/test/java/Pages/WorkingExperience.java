package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Tests.TestRegister.driver;

public class WorkingExperience {

    public static String jobDescription = "//input[@placeholder='Deskripsi Pekerjaan']";
    public static String hardSkill = "//span[contains(text(),'Kemampuan Teknis')]";
    public static String javaHardSkill = "//li[@id='headlessui-listbox-option-:r6s:']";
    public static String softSkill = "//span[contains(text(),'Kemampuan Non-Teknis')]";
    public static String managementSoftSkill = "//input[@value='Manajemen Waktu']";
    public static String buttonNext = "//span[contains(text(),'Selanjutnya')]";

    public static void inputPositionName(){
        WebElement setPositionName = driver.findElement(By.id("workingExperiences.0.positionName"));
        setPositionName.sendKeys("Front End Developer");
    }

    public static void inputCompanyName(){
        WebElement setCompanyName = driver.findElement(By.name("workingExperiences.0.companyName"));
        setCompanyName.sendKeys("PT Refactory Jaya");
    }

    public static void selectJobLevel(){
        WebElement setJobLevel = driver.findElement(By.xpath("//span[contains(text(),'Level Pekerjaan')]"));
        setJobLevel.click();
        setJobLevel.findElement(By.xpath("//span[contains(text(),'Senior Staff')]")).click();
    }

    public static void selectIndustry(){
        WebElement setIndustry = driver.findElement(By.id("industryId"));
        setIndustry.click();
        WebElement selectValueIndustry = driver.findElement(By.xpath("//span[contains(text(),'Construction')]"));
        selectValueIndustry.click();
    }

    public static void selectStartDateEx(){
        WebElement setStartDate = driver.findElement(By.xpath("//input[@placeholder='Tanggal Mulai']"));
        setStartDate.sendKeys("12 Nov 2024");
        setStartDate.sendKeys(Keys.RETURN);
        WebElement checkboxEndDate = driver.findElement(By.xpath("//label[contains(text(),'Saat ini sedang bekerja di posisi ini')]"));
        checkboxEndDate.click();
    }

    public static void inputJobDescription(){
        WebElement setJobDescription = driver.findElement(By.name("workingExperiences.0.jobDescription"));
        setJobDescription.sendKeys("Ini deskripsi pekerjaanku");
        driver.findElement(By.xpath("//span[contains(text(),'Selanjutnya')]")).click();
    }

}
