package com.promineotech;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;



class TestDemoJUnitTest {
	
	//here we add a private instance variable of type TestDemo named testDemo:
	// remember --  instance variables are non-static variables which are defined
	//in a class, but outside of any method, constructor or block.
	private TestDemo testDemo;

	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo(); //this ensures that a new TestDemo
		    //object is created *before each* test
	}

	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
		
	
	
	

	if(!expectException) {
		  assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		  
	} else { assertThatThrownBy(() ->

		    testDemo.addPositive(a, b))

		        .isInstanceOf(IllegalArgumentException.class);
			  
		  }
		 
		} // end of assertThatTwoPositiveNumbersAreAddedCorrectly
	
	static Stream<Arguments> argumentsForAddPositive() {
		
		//Add as many arguments lines as needed to test the addPositive method thoroughly. 
		// Make sure to add some zero or negative arguments:
		return Stream.of(
		arguments(2, 4, 6, false),
		arguments(8, 12, 20, false),
		arguments(0, 0, 0, true),
		arguments(-1, -14, -15, true),
		arguments(-1, -14, 27, true)
		);
		
		
	} 
	  
	
	   
   @Test
   void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
   
   assertThat(testDemo.addPositive(4,5)).isEqualTo(9);

   assertThat(testDemo.addPositive(40,50)).isEqualTo(90);

   }




//can I essentially just copy and paste the above test/code and then modify it??


private TestDemo testDemo2;

@BeforeEach
void setUpTest2() throws Exception {
	testDemo2 = new TestDemo(); //this ensures that a new TestDemo
	    //object is created *before each* test
}

@ParameterizedTest
@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForMultiplyPositive")


void assertThatTwoPositiveIntegersAreMultipliedCorrectly(int x, int y, int expected, boolean expectException) {



if(!expectException) {
	  assertThat(testDemo2.multiplyPositiveIntegers(x, y)).isEqualTo(expected);
	  
} else { assertThatThrownBy(() ->

	    testDemo.multiplyPositiveIntegers(x, y))

	        .isInstanceOf(IllegalArgumentException.class);
		  
	  }
	 
	} // end of assertThatTwoPositiveNumbersAreMultipliedCorrectly


static Stream<Arguments> argumentsForMultiplyPositive() {
	
	//Add as many arguments lines as needed to test the addPositive method thoroughly. 
	// Make sure to add some zero or negative arguments:

	return Stream.of(
	arguments(2, 4, 8, false),
	arguments(8, 12, 96, false),
	arguments(0, 0, 0, true),
	arguments(-1, -14, -15, true),
	arguments(-1, -14, 14, true)
	);
	
} 

  

   
@Test
void assertThatPairsOfPositiveNumbersAreMultipliedCorrectly() {

assertThat(testDemo.multiplyPositiveIntegers(4,5)).isEqualTo(20);

assertThat(testDemo.multiplyPositiveIntegers(40,50)).isEqualTo(2000);

}


@Test
void assertThatNumberSquaredIsCorrect () {
	TestDemo mockDemo = spy(testDemo);
	doReturn(5).when(mockDemo).getRandomInt();
	int fiveSquared = mockDemo.randomNumberSquared();
	assertThat(fiveSquared).isEqualTo(25);
}
}





