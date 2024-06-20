package com.sparta.bd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringKataTest {
    @Test
    void givenStringReturnsFalse(){
        String input = "";
        Assertions.assertFalse(StringKata.isPalindrome(input));


    }
    @Test
    void givenWordFewerThanThreeLettersReturnsFalse(){
        String input = "aa";
        Assertions.assertFalse(StringKata.isPalindrome(input));


    }
    @Test
    void givenPalindromeReturnTrue(){
        String input = "bob";
        Assertions.assertTrue(StringKata.isPalindrome(input));


    }
    @Test
    void givenLongWordNotPalindromeReturnsFalse(){
        String input = "bobbby";
        Assertions.assertFalse(StringKata.isPalindrome(input));


    }
    @Test
    void givenLongWordPalindromeReturnsTrue(){
        String input = "atoyotatoyota";
        Assertions.assertTrue(StringKata.isPalindrome(input));


    }
    @Test
    void givenLongerWordPalindromeReturnsTrue(){
        String input = "gohangasalamiimalasagnahog";
        Assertions.assertTrue(StringKata.isPalindrome(input));


    }
    @Test
    void givenLongerWordPalindromeCheckCaseReturnsTrue(){
        String input = "gOhangasalamiimalasagnahog";
        Assertions.assertTrue(StringKata.isPalindrome(input));





    }
    @Test
    void givenASentenceWithOnePalindromeReturnsPalindrome(){
        String input = "hello bob";
        Assertions.assertEquals("bob", StringKata.longestPalindromeInSentence(input));

    }
    @Test
    void givenASentenceWithNoPalindromeReturnsNoPaindrome(){
        String input = "hello billy";
        Assertions.assertEquals("there are no palindromes", StringKata.longestPalindromeInSentence(input));

    }
    @Test
    void givenASentenceWithMorePalindromesReturnsTheLongest(){
        String input = "hello bob the if,i,had,a,hifi bob";
        Assertions.assertEquals("ifihadahifi", StringKata.longestPalindromeInSentence(input));

    }
    @Test
    void givenASentenceWithTwoOfTheSameLengthPalindromesReturnsBoth(){
        String input = "hello bob the pop";
        Assertions.assertEquals("bob pop", StringKata.longestPalindromeInSentence(input));

    }
    @Test
    void givenASentenceWithTwoOfTheSamePalindromesReturnsOne(){
        String input = "hello bob the bob";
        Assertions.assertEquals("bob", StringKata.longestPalindromeInSentence(input));

    }
    @Test
    void removeAllNonAphaCharFromAString(){
        String input = "hello@@";
        Assertions.assertEquals("hello", StringKata.removeSpecialChar(input));


    }
    @Test
    void removeAllNonAphaCharFromAStringButNotSpaces(){
        String input = "hello@@ hello";
        Assertions.assertEquals("hello hello", StringKata.removeSpecialChar(input));


    }
    @Test
    void givenAPlaindromeAndSpecialCharactersReturnPalindrome(){
        String input = "123 @@ bo@b";
        Assertions.assertEquals("bob", StringKata.longestPalindromeInSentence(input));


    }
    @Test
    void givenALoadOfPalindromes() {
        String input = "123 @@ never,odd,or,even madam,im,adam";
        Assertions.assertEquals("neveroddoreven", StringKata.longestPalindromeInSentence(input));
    }
    @Test
    void givenALongerPalindrome() {
        String input = "123 @@ never,odd,or,even go,hang,a,salami,im,a,lasagna,hog";
        Assertions.assertEquals("gohangasalamiimalasagnahog", StringKata.longestPalindromeInSentence(input));
    }
    @Test
    void givenALoadMorePalindromesChecksIfCaseSensitve() {
        String input = "so I told him did you know theres no,X,in,Nixon? and he said are you sure about that? ";
        Assertions.assertEquals("noXinNixon", StringKata.longestPalindromeInSentence(input));
    }

}
