package org.asr.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class StepDefinitions {

	private int total;

    private Calculator calculator;

    @Before
    private void init() {
        total = -999;
    }

    @Given("I have a calculator")
    public void initializeCalculator() throws Throwable {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void testAdd(int num1, int num2) throws Throwable {
        total = calculator.add(num1, num2);
    }

    @Then("the result should be {int}")
    public void validateResult(int result) throws Throwable {
    	assertEquals(total, result);
    }
}
