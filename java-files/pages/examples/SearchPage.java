package com.wipro.testing.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component // Uncomment for Spring
public class SearchPage extends AbstractPage{
	
	@FindBy(id = "lst-ib")
	private WebElement searchField;

	public SearchPage() {
		super();
		PageFactory.initElements(getDriver(), this);
	}
	
	public void typeSearchText(String searchText){
		searchField.sendKeys(searchText);
	}
	
	public void navigateToPage (){
		getDriver().get("https://www.google.com");
	}

}
