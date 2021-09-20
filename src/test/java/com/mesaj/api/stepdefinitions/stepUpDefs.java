package com.mesaj.api.stepdefinitions;

import com.mesaj.api.pageobjects.SingUpPageObjetc;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepUpDefs {



    @Given("^El usuario ingresa a la plataforma$")
    public void El_usuario_ingresa_a_la_plataforma() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","C:\\Users\\DONDOCTOR\\Desktop\\miProyecto\\IdeaProjects\\Tyba\\src\\test\\resources\\drivers\\windows\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
        SingUpPageObjetc singUpPageObjetc = new SingUpPageObjetc(driver);
        singUpPageObjetc.go("https://www.metrocuadrado.com/calculadora-credito-hipotecario-vivienda/");

        singUpPageObjetc.writeMonthlyIncome("10000000");
        singUpPageObjetc.selectTermInYears("number:20");
        singUpPageObjetc.clicOnSubmit();

       Thread.sleep(4000);
        //driver.quit();
    }

    @When("^Coloca el ingreso mensual 10000000$")
    public void coloca_el_ingreso_mensual(){
    }

    @Then("^El banco puede darme un credito$")
    public void el_banco_puede_darme_un_credito() {
    }


}
