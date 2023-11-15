package com.example.junit_demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTests {
    Validator validator = new Validator();
    @Test
    void shouldReturnTrueWithValidPhoneNumber(){
        String phoneNumber = "0739246347";
        boolean result =Validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertTrue(result);

    }

    @Test
    void shouldReturnFalseWhenPhoneNumberNotStartWithZero() {
        String phoneNumber = "9412364871";

        boolean result = Validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertFalse(result);
    }

@Test
    void shouldReturnFalseWhenPhoneNumberLengthIsLessThan6() {
    String phoneNumber = "09412";

    boolean result = Validator.isPhoneNumberValid(phoneNumber);
    Assertions.assertFalse(result);
}
@Test
void shouldReturnFalseWhenPhoneNumberLengthIsGreaterThan10() {
    String phoneNumber = "09412364871";

    boolean result = Validator.isPhoneNumberValid(phoneNumber);
    Assertions.assertFalse(result);
}
@Test
void shouldReturnTrueWhenPhoneNumberLengthIsBetween7to10() {
    String phoneNumber = "09412364";

    boolean result = Validator.isPhoneNumberValid(phoneNumber);
    Assertions.assertTrue(result);
}
@Test
void shouldReturnTrueWhenPhoneNumberLengthExact6() {
    String phoneNumber = "094123";

    boolean result = Validator.isPhoneNumberValid(phoneNumber);
    Assertions.assertTrue(result);
}
@Test
void shouldReturnTruePhoneNumberLengthExact10() {
        String phoneNumber = "0941236487";

        boolean result = Validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertTrue(result);
    }
    @Test
    void shouldReturnFalseWhenPhoneNumberIncludeAlphabet() {
        String phoneNumber = "09A41";

        boolean result = Validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertFalse(result);
    }
@Test
    void shouldReturnTrueWithValidEmail() {
    String email = "sushma.mandoli@iths.se";

    boolean result = Validator.isEmailValid(email);
    Assertions.assertTrue(result);
}
@Test
void shouldReturnFalseWithMissingAtSign() {
    String email = "sushma.mandoliiths.se";

    boolean result = Validator.isEmailValid(email);
    Assertions.assertFalse(result);
}
@Test
    void shouldReturnFalseWithMissingName() {
    String email = "@iths.se";

    boolean result =Validator.isEmailValid(email);
    Assertions.assertFalse(result);
}
@Test
    void shouldReturnFalseWithMissingDomainName() {
    String email = "sushma.se";


    boolean result = Validator.isEmailValid(email);
    Assertions.assertFalse(result);
}
@Test
    void shouldReturnFalseWithMissingTopLevelDomain() {
    String email = "sushma@ithgs";

    boolean result = Validator.isEmailValid(email);
    Assertions.assertFalse(result);
}
@Test
    void shouldReturnFalseWithMissingDot() {
    String email = "mandoli@ithsse";

    boolean result = Validator.isEmailValid(email);
    Assertions.assertFalse(result);
}
}