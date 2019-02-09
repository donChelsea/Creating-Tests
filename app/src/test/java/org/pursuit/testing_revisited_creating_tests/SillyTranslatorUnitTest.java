package org.pursuit.testing_revisited_creating_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.pursuit.testing_revisited_creating_tests.translator.SillyTranslator;

public class SillyTranslatorUnitTest {

    // TODO: add setup method

    public void SillyTranslator_testGetInstance() {
        SillyTranslator result = SillyTranslator.getInstance();
        SillyTranslator result2 = SillyTranslator.getInstance();

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof SillyTranslator);
        Assert.assertEquals(result, result2);
        Assert.assertSame(result, result2);
    }

    //doubleTalk

    @Test
    public void checkDoubleTalk() {
        //Given
        String testString = "pursuit";
        String expectedResult = "Pursuit pursuit";

        //When
        String result = SillyTranslator.getInstance().doubleTalk(testString);

        //Then
        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void checkDoubleTalk2() {
        SillyTranslator.getInstance().doubleTalk(null);
    }

    @Test
    public void checkDoubleTalkWithNullString() {
        //Given
        String testString = null;
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().doubleTalk(null);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDoubleTalkWithNumberInput() {
        //Given
        String testString = "1234";
        String expectedResult = "1234 1234";

        //When
        String result = SillyTranslator.getInstance().doubleTalk(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDoubleTalkWithEmptyString() {
        //Given
        String testString = "";
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().doubleTalk(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDoubleTalkWithOneCharInput() {
        //Given
        String testString = "i";
        String expectedResult = "I i";

        //When
        String result = SillyTranslator.getInstance().doubleTalk(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    // snakeSpeak

    @Test
    public void checkSnakeSpeak() {
        //Given
        String testString = "sassy";
        String expectedResult = "sssssassy";

        //When
        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSnakeSpeakNoSInBeginning() {
        //Given
        String testString = "classy";
        String expectedResult = "classy";

        //When
        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSnakeSpeakWithNull() {
        //Given
        String testString = null;
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSnakeSpeakWithNumbers() {
        //Given
        String testString = "1234";
        String expectedResult = "1234";

        //When
        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSnakeSpeakWithEmptyString() {
        //Given
        String testString = "";
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSnakeSpeakWithCaptialLetter() {
        //Given
        String testString = "Snake";
        String expectedResult = "Snake";

        //When
        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    // caesarCypher

    @Test
    public void checkCaesarCypher() {
        //Given
        String testString = "string";
        String expectedResult = "tusjoh";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypherWithNullInput() {
        //Given
        String testString = null;
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypherEmptyString() {
        //Given
        String testString = "";
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypherWithNumbers() {
        //Given
        String testString = "1234";
        String expectedResult = "2345";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypherWithCaptialLetter() {
        //Given
        String testString = "String";
        String testString2 = "STRING";
        String expectedResult = "Tusjoh";
        String expectedResult2 = "TUSJOH";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);
        String result2 = SillyTranslator.getInstance().caesarCypher(testString2);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    // pigLatin

    @Test
    public void checkPigLatin() {
        String testString = "string";
        String expectedResult = "ingstray";

        String testString2 = "icing";
        String expectedResult2 = "icingway";

        String result = SillyTranslator.getInstance().pigLatin(testString);
        String result2 = SillyTranslator.getInstance().pigLatin(testString2);

        Assert.assertEquals(expectedResult, result);
        Assert.assertEquals(expectedResult2, result2);
    }

    @Test
    public void checkPigLatin_EmptyString() {
        String testString = "";
        String expectedResult = "";

        String result = SillyTranslator.getInstance().pigLatin(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkPigLatin_WithNullInput() {
        String testString = null;
        String expectedResult = "";

        String result = SillyTranslator.getInstance().pigLatin(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkPigLatin_WithNumbers() {
        String testString = "1234";
        String expectedResult = "";

        String result = SillyTranslator.getInstance().pigLatin(testString);

        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void checkPigLatin_WithCapital() {
        String testString = "String";
        String expectedResult = "ingStray";

        String testString2 = "Icing";
        String expectedResult2 = "Icingway";

        String result = SillyTranslator.getInstance().pigLatin(testString);
        String result2 = SillyTranslator.getInstance().pigLatin(testString2);

        Assert.assertEquals(expectedResult, result);
        Assert.assertEquals(expectedResult2,result2);
    }

    // reverse



    // TODO: add test for every method with a non-void return type in SillyTranslator.java

    // TODO: add tear down method

}
