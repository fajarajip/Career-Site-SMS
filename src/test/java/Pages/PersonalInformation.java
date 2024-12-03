package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Tests.TestRegister.driver;

public class PersonalInformation {
    public static String inputImageProfile_xpath = "//input[@id='input-image']";
    public static String fullName_xpath = "//input[@id='fullName']";
    public static String idNumber_xpath = "//input[@id='nik']";
    public static String gender_xpath = "//span[contains(text(),'Jenis Kelamin')]";
    public static String selectGender_xpath = "//span[contains(text(),'Laki-laki')]";
    public static String birthDate_xpath = "//form//input[@placeholder=\"Tanggal Lahir\"]";
    public static String popupBirthDate_xpath = "//button[contains(text(),'12')]";
    public static String email_xpath = "//input[@id='email']";
    public static String phoneNumber_xpath = "//input[@id='phoneNumber']";
    public static String password_xpath = "//input[@id='password']";
    public static String passwordConfirmation_xpath = "//input[@id='passwordConfirmation']";
    public static String addressKTP_xpath = "//textarea[@id='address']";
    public static String provinceKTP_xpath = "//button[@id='provinceId']";
    public static String selectProvinceKTP_xpath = "//span[contains(text(),'Bali')]";
    public static String cityKTP_xpath = "//button[@id='cityId']";
    public static String selectCityKTP_xpath = "//span[contains(text(),'Denpasar')]";
    public static String district_xpath = "//button[@id='district']";
    public static String selectDistrict_xpath = "//span[contains(text(),'Denpasar Barat')]";
    public static String village_xpath = "//button[@id='village']";
    public static String selectVillage_xpath = "//span[contains(text(),'Dauh Puri Kauh')]";
    public static String postalCode_xpath = "//input[@id='postalCode']";
    //sameAsKTP
    public static String sameAsKTP_xpath = "//input[@id='sameAsKTP']";
    public static String uploadCV_xpath = "//input[@id='update-profile-input']";
    public static String sourceInformation_xpath = "//span[contains(text(),'Sumber Informasi')]";
    public static String selectSourceInformation_xpath = "//span[contains(text(),'Mitra get mitra')]";
    public static String referral_xpath = "//input[@id='referral']";
    public static String firstNextButton_xpath = "//span[contains(text(),'Selanjutnya')]";

    public static void uploadPhotoProfile() throws InterruptedException {
        WebElement uploadPhotoProfile = driver.findElement(By.xpath(inputImageProfile_xpath));
        String filePath = "C:\\Users\\Fajar Aji Pamungkas\\Downloads\\File Testing\\fotoorang.jpeg";
        uploadPhotoProfile.sendKeys(filePath);
        Thread.sleep(2000);
    }

    public static void inputFullName(){
        driver.findElement(By.xpath(fullName_xpath)).sendKeys("Dede Ahmrul");
    }

    public static void inputIdNumber(){
        driver.findElement(By.xpath(idNumber_xpath)).sendKeys("3320489211987773");
    }

    public static void inputGender() throws InterruptedException {
        driver.findElement(By.xpath(gender_xpath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(selectGender_xpath)).click();
    }

    public static void inputBirthDate(){
        driver.findElement(By.xpath(birthDate_xpath)).click();
        driver.findElement(By.xpath(popupBirthDate_xpath)).click();
    }

    public static void inputEmail(){
        driver.findElement(By.xpath(email_xpath)).sendKeys("dedeamrl@yopmail.com");
    }

    public static void inputPhoneNumber(){
        driver.findElement(By.xpath(phoneNumber_xpath)).sendKeys("080999837463");
    }

    public static void inputPassword(){
        driver.findElement(By.xpath(password_xpath)).sendKeys("Testing123#");
    }

    public static void inputPasswordConfirmation(){
        driver.findElement(By.xpath(passwordConfirmation_xpath)).sendKeys("Testing123#");
    }

    public static void inputAddressKTP(){
        driver.findElement(By.xpath(addressKTP_xpath)).sendKeys("Jimbaran, Jl. Karangmas Sejahtera");
    }

    public static void selectProvinceKTP() throws InterruptedException {
        driver.findElement(By.xpath(provinceKTP_xpath)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(selectProvinceKTP_xpath)).click();
    }

    public static void selectCityKTP() throws InterruptedException {
        driver.findElement(By.xpath(cityKTP_xpath)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(selectCityKTP_xpath)).click();
    }

    public static void selectDistrict() throws InterruptedException {
        driver.findElement(By.xpath(district_xpath)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(selectDistrict_xpath)).click();
    }

    public static void selectVillage() throws InterruptedException {
        driver.findElement(By.xpath(village_xpath)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(selectVillage_xpath)).click();
    }

    public static void inputPostalCode(){
        driver.findElement(By.xpath(postalCode_xpath)).sendKeys("87898");
    }

    public static void sameAsKTPCheckbox(){
        driver.findElement(By.xpath(sameAsKTP_xpath)).click();
    }

    public static void uploadCv() throws InterruptedException {
        WebElement uploadCv = driver.findElement(By.xpath(uploadCV_xpath));
        String filePath = "C:\\Users\\Fajar Aji Pamungkas\\Downloads\\File Testing\\CV_Resume.pdf";
        uploadCv.sendKeys(filePath);
        Thread.sleep(3000);
    }

    public static void selectSourceInformation() throws InterruptedException {
        driver.findElement(By.xpath(sourceInformation_xpath)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(selectSourceInformation_xpath)).click();
        driver.findElement(By.xpath(referral_xpath)).sendKeys("Andini");
        driver.findElement(By.xpath(firstNextButton_xpath)).click();
    }

}


