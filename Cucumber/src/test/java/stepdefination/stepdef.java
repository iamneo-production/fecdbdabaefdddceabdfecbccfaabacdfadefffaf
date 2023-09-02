package test.java.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class stepdef {

    private WebDriver driver;

    @Given("I am on the search page")
    public void iAmOnTheSearchPage() {
        // Initialize the WebDriver (you should add logic for configuring the browser dynamically)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @When("I search for {string}")
    public void iSearchFor(String searchString) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchString);
        searchBox.submit();
    }

    @Then("I should see search results")
    public void iShouldSeeSearchResults() {
        WebElement results = driver.findElement(By.id("search"));
        Assert.assertTrue(results.isDisplayed());

        // Close the browser after the test
        driver.quit();
    }
}
