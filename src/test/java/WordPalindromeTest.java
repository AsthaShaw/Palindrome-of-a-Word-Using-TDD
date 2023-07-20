import com.project.astha.WordPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordPalindromeTest {

    @Nested
    @DisplayName("Checking the validity of the word")
    class CheckingTheValidityOfTheWord {

        @Test
        @DisplayName("Checking whether the word is null")
        void checkingWhetherTheWordIsNull() {
            String input=null;
            NullPointerException e=Assertions.assertThrows(NullPointerException.class,()->WordPalindrome.isWordValid(input),"No NullPointerException raised");
            assertEquals("Null values are not allowed",e.getMessage());
        }

        @Test
        @DisplayName("Checking whether the word is empty")
        void checkingWhetherTheWordIsEmpty() {
            String input="";
            IllegalArgumentException e=Assertions.assertThrows(IllegalArgumentException.class, ()->WordPalindrome.isWordValid(input), "No IllegalArgumentException raised");
            assertEquals("Empty word not allowed",e.getMessage());
        }

        @ParameterizedTest
        @DisplayName("Checking the result returns true or false in case the word is valid")
        @CsvSource({"rotator, True", "motom, True", "ir, False", "pollom, False"})
        void checkingTheResultReturnsTrueOrFalseInCaseTheWordIsValid(String input, boolean expected) {
            Assertions.assertEquals(expected, WordPalindrome.isWordValid(input));
        }

    }


    @Nested
    @DisplayName("Checking a word is palindrome or not through using just Strings")
    class CheckingAWordIsPalindromeOrNotUsingJustStrings {

        @ParameterizedTest
        @DisplayName("Checking if a word is a palindrome")
        @ValueSource(strings = {"rotator", "motom", "MAdam", "pollop"})
        void checkingWhetherAWordIsAPalindrome(String input) {
            Assertions.assertTrue(WordPalindrome.isPalindromeJustStringWay(input));
        }

        @ParameterizedTest
        @DisplayName("Checking if a word is not a palindrome")
        @ValueSource(strings = {"Astha", "motor"})
        void checkingWhetherAWordIsNotAPalindrome(String input) {
            Assertions.assertFalse(WordPalindrome.isPalindromeJustStringWay(input));
        }

      }

    @Nested
    @DisplayName("Checking a word is palindrome or not through using StringBuilder ")
    class CheckingAWordIsPalindromeOrNotUsingStringBuilder {
        @ParameterizedTest
        @DisplayName("Checking if a word is a palindrome ")
        @ValueSource(strings = {"rotator", "motom", "MAdam", "pollop"})
        void checkingWhetherAWordIsAPalindrome(String input) {
            Assertions.assertTrue(WordPalindrome.isPalindromeStringBuilderWay(input));
        }

        @ParameterizedTest
        @DisplayName("Checking if a word is not a palindrome ")
        @ValueSource(strings = {"Astha", "motor"})
        void checkingWhetherAWordIsNotAPalindrome(String input) {
            Assertions.assertFalse(WordPalindrome.isPalindromeStringBuilderWay(input));
        }
    }

        @Nested
        @DisplayName("Checking a word is palindrome or not through Recursions")
        class CheckingAWordIsPalindromeOrNotThroughRecursions {
            @ParameterizedTest
            @DisplayName("Checking if a word is a palindrome")
            @ValueSource(strings = {"rotator", "motom", "MAdam", "pollop"})
            void checkingWhetherAWordIsAPalindrome(String input) {
                Assertions.assertTrue(WordPalindrome.isPalindromeRecursiveWay(input));
            }

            @ParameterizedTest
            @DisplayName("Checking if a word is not a palindrome")
            @ValueSource(strings = {"Astha", "motor"})
            void checkingWhetherAWordIsNotAPalindrome(String input) {
                Assertions.assertFalse(WordPalindrome.isPalindromeRecursiveWay(input));
            }

        }







}


