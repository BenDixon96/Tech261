package com.sparta.bd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckForNeighboursKataTest {
    @Test
    void givenEmptyListReturnsFalse(){
        int[] input = {};

        Assertions.assertFalse(CheckForNeighboursKata.checkForThreeInNeighbours(input));


    }
    @Test
    void givenListWithFewerThanThreeNumbersReturnFalse(){
        int[] input = {1, 2};

        Assertions.assertFalse(CheckForNeighboursKata.checkForThreeInNeighbours(input));


    }
    @Test
    void givenListHasThreeIdenticalNumbersReturnTrue(){
        int[] input = {1, 1, 1};


        Assertions.assertEquals(true,CheckForNeighboursKata.checkForThreeInNeighbours(input));


    }
    @Test
    void givenListHasThreeIdenticalNumbersWithFillerNumbersReturnTrue(){
        int[] input = {2, 2, 1, 1, 1,3 ,3};


        Assertions.assertEquals(true,CheckForNeighboursKata.checkForThreeInNeighbours(input));


    }
    @Test
    void givenListHasThreeIdenticalNumbersWithBiggerListReturnTrue(){
        int[] input = {2,4,3,2,1,5,1,7,8,3,1,2,3,3,3,1,5,5,6,3,4,6,3,1,3,4,6,2,3,6,6,4,5,7,4,1};


        Assertions.assertEquals(true,CheckForNeighboursKata.checkForThreeInNeighbours(input));


    }
    @Test
    void givenListHasThreeIdenticalNumbersAtEnd(){
        int[] input = {2,4,3,2,1,5,1,7,8,3,1,2,3,3,1,5,5,6,3,4,6,3,1,3,4,6,2,3,6,6,4,5,7,4,1,1,1};


        Assertions.assertEquals(true,CheckForNeighboursKata.checkForThreeInNeighbours(input));


    }
    @Test
    void givenListHasThreeIdenticalNumbersAtBeginning(){
        int[] input = {2,2,2,4,3,2,1,5,1,7,8,3,1,2,3,3,1,5,5,6,3,4,6,3,1,3,4,6,2,3,6,6,4,5,7,4,1,1};


        Assertions.assertEquals(true,CheckForNeighboursKata.checkForThreeInNeighbours(input));


    }
    @Test
    void givenLongListDoseNotHaveThreeIdenticalNumbers(){
        int[] input = {2,2,4,3,2,1,5,1,7,8,3,1,2,3,3,1,5,5,6,3,4,6,3,1,3,4,6,2,3,6,6,4,5,7,4,1,1};


        Assertions.assertEquals(false,CheckForNeighboursKata.checkForThreeInNeighbours(input));


    }



}
