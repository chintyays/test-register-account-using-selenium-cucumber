import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Step {

    WebDriver webDriver;

    @Given("^Open Chrome browser$")
    public void open_Chrome_browser() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chintya\\Desktop\\SARAH\\chromedriver_win32 (2)\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://www.cermati.com/gabung");
    }

    @Then("^User input \"([^\"]*)\" on field email$")
    public void user_input_on_field_email(String email) throws Throwable {
        webDriver.findElement(By.id("email")).sendKeys(email);
    }

    @Then("^User input \"([^\"]*)\" on field kata sandi$")
    public void user_input_on_field_kata_sandi(String password) throws Throwable {
        webDriver.findElement(By.id("password")).sendKeys(password);
    }

    @Then("^User input \"([^\"]*)\" on field konfirmasi kata sandi$")
    public void user_input_on_field_konfirmasi_kata_sandi(String confirm_password) throws Throwable {
        webDriver.findElement(By.id("confirm-password")).sendKeys(confirm_password);
    }

    @Then("^User input \"([^\"]*)\" on field nama depan$")
    public void user_input_on_field_nama_depan(String first_name) throws Throwable {
        webDriver.findElement(By.id("first-name")).sendKeys(first_name);
    }

    @Then("^User input \"([^\"]*)\" on field nama belakang$")
    public void user_input_on_field_nama_belakang(String last_name) throws Throwable {
        webDriver.findElement(By.id("last-name")).sendKeys(last_name);
    }

    @Then("^User input \"([^\"]*)\" on field nomor telepon$")
    public void user_input_on_field_nomor_telepon(String mobile_phone) throws Throwable {
        webDriver.findElement(By.id("mobile-phone")).sendKeys(mobile_phone);
    }

    @Then("^User input \"([^\"]*)\" on field kabupaten/kota$")
    public void user_input_on_field_kabupaten_kota(String residence_city) throws Throwable {
        webDriver.findElement(By.id("residence-city")).sendKeys(residence_city);
        webDriver.findElement(By.id("residence-city")).sendKeys(Keys.ENTER);
    }

    @Then("^User click button submit$")
    public void user_click_button_submit() throws Throwable {
        webDriver.findElement(By.xpath("//*[@id=\"join-container\"]//*[text()='Daftar Akun']")).click();
    }
}
