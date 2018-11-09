package stepDefinition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Subtraction {
	int e, f, g, h, i;

	@Given("^Print to check again$")
	public void print_to_check_again() {
		System.out.println("Background Steps Again");
	}

	@Given("^I have e$")
	public void i_have_e() {
		e = 5;
	}

	@Given("^I have f$")
	public void i_have_f() {
		f = 5;
	}

	@When("^I minus e and f$")
	public void i_minus_e_and_f() {
		e = 5;
		f = 5;
		g = e - g;
	}

	@Then("^I display the minus$")
	public void i_display_the_minus() {
		e = 5;
		f = 5;
		g = e - g;
		System.out.println("Perform Sub: " + g);
	}

	@Then("^Print message$")
	public void print_message() {
		System.out.println("Subtraction done");
	}

	// ******************************************************//

	@Given("^I have g$")
	public void i_have_g() {
		g = 5;
	}

	@Given("^I have h$")
	public void i_have_h() {
		h = 5;
	}

	@When("^I minus g and h$")
	public void i_minus_g_and_h() {
		g = 5;
		h = 5;
		i = g - h;
	}

	@Then("^I display the minuss$")
	public void i_display_the_minuss() {
		g = 5;
		h = 5;
		i = g - h;
		System.out.println("Perform Sub: " + i);
	}

	@Then("^Print messagee$")
	public void print_messagee() {
		System.out.println("Subtraction done");
	}

	// *************************************************************//

	@Given("^I agsin have two numbers$")
	public void i_agsin_have_two_numbers() {
		System.out.println("Sub two numbers");
	}

	@When("^I sub \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_sub_and(int c, int d) {
		System.out.println("Subtraction: " + (c - d));
	}

	@Then("^I display the Subtraction$")
	public void i_display_the_Subtraction() {
		System.out.println("Subtraction done");
	}

	// *************************************************************//

	@Given("^I have numbers for subtraction$")
	public void i_have_numbers_for_subtraction() {
		System.out.println("Simply Printing Sub");
	}

	@When("^I enteragain (\\d+) and (\\d+)$")
	public void i_enteragain_and(int a, int b) {
		System.out.println("Parameterizing Sub " + (a - b));
	}

	@Then("^Print Subtraction$")
	public void print_Subtraction() {
		System.out.println("Simply Printing Sub done");
	}

	// ****************Another Scenario***************************//

	@Given("^I got two numbers$")
	public void i_got_two_numbers() {
		System.out.println("Checking Data tables for Sub");
	}

	@When("^And I enter$")
	public void and_I_enter(DataTable Subtraction) {
		List<List<String>> data = Subtraction.raw();
		System.out.println("Check Table Data "+data.get(0).get(0));
		System.out.println("Check Table Data "+data.get(0).get(1));
		System.out.println("Check Table Data "+data.get(1).get(0));
		System.out.println("Check Table Data "+data.get(1).get(1));

	}

	@Then("^I print message$")
	public void i_print_message() throws Throwable {
		System.out.println("Checking Data tables for Sub done");
	}

}
