package com.uniovi.tests.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.uniovi.util.SeleniumUtils;

public class PO_PrivateView extends PO_NavView {
	
	static public void searchByText(WebDriver driver,String searchTextp) {
		// Esperamos 5 segundo a que carge el DOM porque en algunos equipos falla
		SeleniumUtils.esperarSegundos(driver, 5);
		// Rellenemos el campo de descripción
		WebElement searchText = driver.findElement(By.name("searchText"));
		searchText.clear();
		searchText.sendKeys(searchTextp);
		By boton = By.className("btn");
		driver.findElement(boton).click();
	}
}