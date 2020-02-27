package main.helloselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.imdb.com/");
        System.out.println("URL:" + driver.getCurrentUrl());
        System.out.println("Title:" + driver.getTitle());
        
        WebElement searchBox = driver.findElement(By.id("suggestion-search"));
        searchBox.sendKeys("The Matrix");
        
        WebElement searchButton = driver.findElement(By.id("suggestion-search-button"));
        searchButton.click();
                
                
                
    }
    
}
