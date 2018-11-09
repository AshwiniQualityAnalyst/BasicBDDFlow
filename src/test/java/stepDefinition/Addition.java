package stepDefinition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addition {
	int a, b, c, d, e;

	@Given("^Print to check$")
	public void print_to_check() {
		System.out.println("Background Steps");
	}

	@Given("^I have a$")
	public void i_have_a() {
		a = 5;
	}

	@Given("^I have b$")
	public void i_have_b() {
		a = 5;
		b = 5;
	}

	@When("^I add a and b$")
	public void i_add_a_and_b() {
		a = 5;
		b = 5;
		c = a + b;
	}

	@Then("^I display the sum$")
	public void i_display_the_sum() {
		a = 5;
		b = 5;
		c = a + b;
		System.out.println("Perform Add: " + c);
	}

	@Then("^Print something$")
	public void print_something() {
		System.out.println("Addition done");
	}

	// ****************Another Scenario***************************//

	@Given("^I have c$")
	public void i_have_c() {
		c = 5;
	}

	@Given("^I have d$")
	public void i_have_d() {
		d = 5;
	}

	@When("^I add c and d$")
	public void i_add_c_and_d() {
		c = 5;
		d = 5;
		e = c + d;
	}

	@Then("^I display the summ$")
	public void i_display_the_summ() {
		c = 5;
		d = 5;
		e = c + d;
		System.out.println("Perform Add: " + e);
	}

	@Then("^Print somethingg$")
	public void print_somethingg() {
		System.out.println("Addition done");
	}

	// ****************Another Scenario***************************//

	@Given("^I have two numbers$")
	public void i_have_two_numbers() {
		System.out.println("Add two numbers");
	}

	@When("^I add \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_add_and(int a, int b) throws Throwable {
		System.out.println("Addition: " + (a + b));
	}

	@Then("^I display the Addition$")
	public void i_display_the_Addition() {
		System.out.println("Addition done");
	}

	// ****************Another Scenario***************************//

	@Given("^I have numbers for addition$")
	public void i_have_numbers_for_addition() {
		System.out.println("Simply Printing Add");
	}

	@When("^I enter (\\d+) and (\\d+)$")
	public void i_enter_and(int a, int b) {
		System.out.println("Parameterizing Add " + (a + b));
	}

	@Then("^Print Addition$")
	public void print_Addition() throws Throwable {
		System.out.println("Simply Printing Add done");
	}

	// ****************Another Scenario***************************//

	@Given("^You got two numbers$")
	public void you_got_two_numbers() {
		System.out.println("Checking Data tables for Add");
	}

	@When("^And You enter$")
	public void and_You_enter(DataTable Addition) {

		List<List<String>> data = Addition.raw();
		System.out.println("Check Table Data " + data.get(0).get(0));
		System.out.println("Check Table Data " + data.get(0).get(1));
		System.out.println("Check Table Data " + data.get(1).get(0));
		System.out.println("Check Table Data " + data.get(1).get(1));
	}

	@Then("^You print message$")
	public void you_print_message() {
		System.out.println("Checking Data tables for Add done");
	}

}
