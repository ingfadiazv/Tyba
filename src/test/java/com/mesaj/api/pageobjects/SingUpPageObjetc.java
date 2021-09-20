package com.mesaj.api.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SingUpPageObjetc {

  private WebDriver driver;

  public SingUpPageObjetc(WebDriver driver) {
    this.driver = driver;
  }

  public void go(String url) {
    this.driver.get(url);
  }

  private By monthlyIncome = By.xpath("//input[@name='monthlyIncome']");
  private By termInYears = By.xpath("//select[@ng-model='termInYears']");
  private By submit = By.xpath("//button[@ng-disabled='MonthlyIncomeForm.$invalid']");

  public void writeMonthlyIncome(String monthlyIncome){
    this.driver.findElement(this.monthlyIncome).sendKeys(monthlyIncome);
  }
  public void selectTermInYears(String termInYears){
    new Select(this.driver.findElement(this.termInYears)).selectByValue(termInYears);
  }
  public void clicOnSubmit(){
    this.driver.findElement(this.submit).click();
  }
}




