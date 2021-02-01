package org.futureskillproblemsolution;

import StringProblemSolution.StringProblemSolution;
import org.junit.Assert;
import org.junit.Test;

public class StringProblemSolutionTest {

    @Test
    public void checkTwoStringSameOrNotHappyCase(){
        //Given
        String testSubject1 = "Sample";
        String testSubject2 = "Sample";
        boolean expectedResult = true;

        //When
        boolean actualResult = StringProblemSolution.areTwoStringsSame(testSubject1,testSubject2);

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void checkTwoStringSameOrNotSadCase(){
        //Given
        String testSubject1 = "Sample";
        String testSubject2 = "Signify";
        boolean expectedResult = false;

        //When
        boolean actualResult = StringProblemSolution.areTwoStringsSame(testSubject1,testSubject2);

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void findDiscrepancyIndexHappyCase (){
        //Given
        String testSubject1 = "Sample";
        String testSubject2 = "SaXple";
        int expectedResult = 2;

        //When
        int actualResult = StringProblemSolution.areDifferentFromPosition(testSubject1,testSubject2);

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void findDiscrepancyIndexWhereTheFirstLetterInEitherStringIsDifferent(){
        //Given
        String testSubject1 = "S";
        String testSubject2 = "Excalibre";
        int expectedResult = 0;

        //When
        int actualResult = StringProblemSolution.areDifferentFromPosition(testSubject1,testSubject2);

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void findDiscrepancyIndexWhereFromTheSecondLetterTheStringsAreDifferent(){
        //Given
        String testSubject1 = "Sam";
        String testSubject2 = "Sa";
        int expectedResult = 1;

        //When
        int actualResult = StringProblemSolution.areDifferentFromPosition(testSubject1,testSubject2);

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void findDiscrepancyIndexWhereFromTheSixthLetterTheStringsAreDifferent(){
        //Given
        String testSubject1 = "silver";
        String testSubject2 = "silveXman";
        int expectedResult = 5;

        //When
        int actualResult = StringProblemSolution.areDifferentFromPosition(testSubject1,testSubject2);

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void findDiscrepancyIndexButBothStringsAreSame(){
        //Given
        String testSubject1 = "Same";
        String testSubject2 = "Same";
        int expectedResult = -1;

        //When
        int actualResult = StringProblemSolution.areDifferentFromPosition(testSubject1,testSubject2);

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void stringContainsHappyCase(){
        //Given
        String testSubject1 = "Same";
        String testSubject2 = "Same";
        String expectedResult = "S,a,e,m"; //After Sorting

        //When
        String actualResult = StringProblemSolution.stringContains(testSubject1,testSubject2);

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void stringContainsNoIntersection(){
        //Given
        String testSubject1 = "ACDF";
        String testSubject2 = "POIU";
        String expectedResult = ""; //After Sorting

        //When
        String actualResult = StringProblemSolution.stringContains(testSubject1,testSubject2);

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void stringContainsHasIntersectionButStringLengthsAreDifferent(){
        //Given
        String testSubject1 = "Cinderella";
        String testSubject2 = "der";
        String expectedResult = "d,e,r"; //After Sorting

        //When
        String actualResult = StringProblemSolution.stringContains(testSubject1,testSubject2);

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }
}
