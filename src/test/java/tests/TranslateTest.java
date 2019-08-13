package tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;

public class TranslateTest {
    private WebDriver driver;
    private HomePage homePage;

    @Before
    public void initialize(){
        String url = "http://localhost:8080/translator-web";
        System.setProperty("webdriver.gecko.driver", TranslateTest.class.getResource("/geckodriver.exe").getPath());

        driver = new FirefoxDriver();

        driver.navigate().to(url);

        homePage = new HomePage(driver);
    }

    @After
    public void closeDriver(){
        driver.quit();
    }

    @Given("^a source as \"([^\"]+)\", a target as \"([^\"]+)\" and a word as \"([^\"]+)\"$")
    public void a_source_as_a_target_as_and_a_word_as(String source, String target, String esPhrase) {
        homePage.setSource(source);
        homePage.setTarget(target);
        homePage.setEsPhrase(esPhrase);
    }

    @When("^i translate the word$")
    public void i_translate_the_word() {
        homePage.translate();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^i can view the translated word as \"([^\"]+)\"$")
    public void i_can_view_the_translated_word(String translatedPhrase) {
        Assert.assertEquals(homePage.getTranslatedPhrase(), translatedPhrase);
    }
}
