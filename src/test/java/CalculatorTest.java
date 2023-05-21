//Student ID: B201202023
//Name: Ömer Faruk
//Surname: Aydın
//Course Name: Software Verification and Validation
//Homework 1
//https://github.com/ofaydn/TDDExample
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDivision6() {

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5, 0),
                "IllegalArgumentException expected."
        );

    }
    @ParameterizedTest
    @CsvSource(value = {"10,2,5", "10,4,2.5", "12.5,5,2.5", "10,2.5,4", "12.5,2.5,5"})
    public void ParamTest(float a,float b,float expected){
        assertEquals(expected,Calculator.divide(a,b));
    }

}