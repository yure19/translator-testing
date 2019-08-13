package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(id="source")
    WebElement input_source;

    @FindBy(id="target")
    WebElement input_target;

    @FindBy(id="esPhrase")
    WebElement input_esPhrase;

    @FindBy(css="#input > table >tbody > tr:nth-child(4) > td > input")
    WebElement btn_translate;

    @FindBy(css="#input > table >tbody > tr > td > h4")
    WebElement h4_translated_phrase;

    public HomePage(WebDriver driver) {
        this.driver = driver;

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    public void setSource(String pSource){
        input_source.clear();
        input_source.sendKeys(pSource);
    }

    public void setTarget(String pTarget) {
        input_target.clear();
        input_target.sendKeys(pTarget);
    }

    public void setEsPhrase(String pTarget){
        input_esPhrase.clear();
        input_esPhrase.sendKeys(pTarget);
    }

    public void translate(){
        btn_translate.click();
    }

    public String getTranslatedPhrase(){
        String word = h4_translated_phrase.getText().split(":")[1].trim();
        return word;
    }
}
