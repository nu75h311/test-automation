package com.wipro.testing.training.stories;

import org.junit.Test;

import com.wipro.testing.training.pages.SearchPage;

public class SeleniumRunner {
	   
	   @Test
	   public void runTest(){
		   SearchPage page = new SearchPage();
		   page.navigateToPage();
		   page.typeSearchText("search through Runner class file");
	   }

}
