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
 * JUnit 6 test class for SpeedConverter.
 * Tests both return values and System. out output.
 */
public class SpeedConverterTest {

    // Save the original System.out stream
    private final PrintStream standardOut = System.out;

    // Buffer to capture console output
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    /**
     * Redirects System. out before each test.
     */
    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Restores System. out after each test.
     */
    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    /**
     * Parameterized test for toMilesPerHour return values.
     */
    @ParameterizedTest(name = "km/h: {0} -> mi/h: {1}")
    @CsvSource({
            "1.5, 1",
            "10.25, 6",
            "-5.6, -1",
            "25.42, 16",
            "75.114, 47"
    })
    @DisplayName("Parameterized Test: toMilesPerHour return values")
    void testToMilesPerHour(double input, long expected) {
        long result = SpeedConverter.toMilesPerHour(input);
        assertEquals(expected, result);
    }

    /**
     * Parameterized test for printConversion console output.
     */
    @ParameterizedTest(name = "km/h: {0} -> output: {1}")
    @CsvSource({
            "1.5, 1.5 km/h = 1 mi/h",
            "10.25, 10.25 km/h = 6 mi/h",
            "25.42, 25.42 km/h = 16 mi/h",
            "75.114, 75.114 km/h = 47 mi/h"
    })
    @DisplayName("Parameterized Test: printConversion valid values")
    void testPrintConversionValid(double input, String expectedOutput) {
        // ACT
        SpeedConverter.printConversion(input);

        // ASSERT
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());

        // Reset buffer for next test
        outputStreamCaptor.reset();
    }

    /**
     * Test case for invalid input (< 0).
     */
    @Test
    @DisplayName("Test Case: printConversion with invalid value")
    void testPrintConversionInvalidValue() {
        // ACT
        SpeedConverter.printConversion(-5.6);

        // ASSERT
        assertEquals("Invalid Value", outputStreamCaptor.toString().trim());
    }
}
