package br.com.techthordev.section_05.exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit 6 Test class for PositiveNegativeOrZero.
 * This test class captures System.out.println output for validation, 
 * as the original method does not return a value.
 */
public class PositiveNegativeOrZeroTest {

    // Saves the original System.out stream
    private final PrintStream standardOut = System.out;
    // Buffer to capture the output printed by the method
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    /**
     * Sets up the environment before each test.
     * Redirects System.out to the custom ByteArrayOutputStream.
     */
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Tears down the environment after each test.
     * Restores the original System.out stream.
     */
    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
    
    /**
     * Parameterized Test to check positive, negative, and zero outputs.
     * Includes boundary cases (1 and -1).
     */
    @ParameterizedTest(name = "Input: {0} -> Expected: {1}")
    @CsvSource({
        "5, positive",
        "-10, negative",
        "0, zero",
        "1, positive",       
        "-1, negative",      
        "999, positive",
        "-999, negative"
    })
    @DisplayName("Parameterized Test: Checking all outputs via System.out")
    void testCheckNumberOutputs(int input, String expected) {
        // ACT: Execute the method, its output is captured in outputStreamCaptor.
        PositiveNegativeOrZero.checkNumber(input);

        // ASSERT: Compare the captured output (trimmed to remove newline) with the expected string.
        assertEquals(expected, outputStreamCaptor.toString().trim(), 
            "Test failed for input: " + input + ". Console output did not match.");
        
        // Reset the stream buffer for the next test execution.
        outputStreamCaptor.reset(); 
    }
    
    @Test
    @DisplayName("Test Case: Checking minimum negative int value")
    void testMinNegativeValue() {
        // ACT
        PositiveNegativeOrZero.checkNumber(Integer.MIN_VALUE);
        
        // ASSERT
        assertEquals("negative", outputStreamCaptor.toString().trim());
    }
}