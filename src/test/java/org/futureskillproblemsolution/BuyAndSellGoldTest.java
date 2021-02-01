package org.futureskillproblemsolution;

import BuyAndSellGold.BuyAndSellGold;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class BuyAndSellGoldTest {
    private static final int[] prices = {2, 7, 1, 8, 2, 8, 4, 5, 9, 0, 4, 5}; // normal vector //solution 1 is 2 and 8

    private static final int[] prices2 = {9, 8, 7, 6, 5, 4, 3, 2, 1}; // less loss // solutions1 is 0 and 1

    private static final int[] prices3 = {9, 1, 8, 7, 6, 5, 4, 3, 2}; // less loss // solution1 is 1 and 2

    private static final int[] prices4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 5, 0, 0}; // best profit // solution1 is 0 and 8

    private static final int[] prices5 = {1, 9, 2, 3, 4, 5, 6, 7, 8}; // best profit// solution1 is 0 and 1

    private static final int[] prices6 = {1}; // There is no solution


    private static BuyAndSellGold buyAndSellGold;

    @Before
    public void setup() {

    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void bestProfitCase() {
        //Given
        buyAndSellGold = new BuyAndSellGold(prices5);
        int expectedBuyDay = 0;
        int expectedSellDay = 1;

        //When
        buyAndSellGold.findDays();
        int actualBuyDay = buyAndSellGold.getBuyDay();
        int actualSellDay = buyAndSellGold.getSellDay();


        //Then
        Assert.assertEquals(actualBuyDay,expectedBuyDay);
        Assert.assertEquals(actualSellDay,expectedSellDay);
    }

    @Test
    public void arrayWithLessThanTwoEntriesShouldHaveNoSolution(){
        //Given
        buyAndSellGold = new BuyAndSellGold(prices6);
        int expectedBuyDay = -1;
        int expectedSellDay = -1;

        //When
        buyAndSellGold.findDays();
        int actualBuyDay = buyAndSellGold.getBuyDay();
        int actualSellDay = buyAndSellGold.getSellDay();


        //Then
        Assert.assertEquals(actualBuyDay,expectedBuyDay);
        Assert.assertEquals(actualSellDay,expectedSellDay);
    }


}
