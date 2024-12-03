package Tests;

import Pages.Education;
import Pages.Other;
import Pages.PersonalInformation;
import Pages.WorkingExperience;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestRegister {
    public static WebDriver driver;

    @BeforeSuite
    public static void Setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://dev-sms.rekrut.site/register");
        driver.manage().window().maximize();
    }

    @Test
    public void personalInformation() throws InterruptedException {
        PersonalInformation.uploadPhotoProfile();
        PersonalInformation.inputFullName();
        PersonalInformation.inputIdNumber();
        PersonalInformation.inputIdNumber();
        PersonalInformation.inputGender();
        PersonalInformation.inputBirthDate();
        PersonalInformation.inputEmail();
        PersonalInformation.inputPhoneNumber();
        PersonalInformation.inputPassword();
        PersonalInformation.inputPasswordConfirmation();
        PersonalInformation.inputAddressKTP();
        PersonalInformation.selectProvinceKTP();
        PersonalInformation.selectCityKTP();
        PersonalInformation.selectDistrict();
        PersonalInformation.selectVillage();
        PersonalInformation.inputPostalCode();
        PersonalInformation.sameAsKTPCheckbox();
        PersonalInformation.uploadCv();
        PersonalInformation.selectSourceInformation();
    }

    @Test(dependsOnMethods = {"personalInformation"})
    public void education() throws InterruptedException {
        Education.selectLastEducation();
        Education.selectUniversity();
        Education.selectMajor();
        Education.inputGPA();
        Education.selectStartDateEduc();
        Education.checkboxUndergraduate();
    }

    @Test(dependsOnMethods = {"education"})
    public void workExperience(){
        WorkingExperience.inputPositionName();
        WorkingExperience.inputCompanyName();
        WorkingExperience.selectJobLevel();
        WorkingExperience.selectIndustry();
        WorkingExperience.selectStartDateEx();
        WorkingExperience.inputJobDescription();
    }

    @Test(dependsOnMethods = {"workExperience"})
    public void other(){
    Other.selectMobilitas();
    Other.checkBoxTermAndCond();
    }

}
