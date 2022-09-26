package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBuyBeforeMinCash(){

    int expected = 900;
    int actual = service.remain(100);

    assertEquals(actual, expected);
}

    @Test
    public void shouldBuyThousand(){

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyForZero(){

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyMiddleAmount(){

        int expected = 500;
        int actual = service.remain(500);

        assertEquals(actual, expected);
    }

    @Test
    public void makeMinPurchaseForCash(){

        int expected = 1;
        int actual = service.remain(999);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyAboveThousand(){
        int expected = 750;
        int actual = service.remain(1250);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuySeveralThousand(){
        int expected = 0;
        int actual = service.remain(5000);

        assertEquals(actual, expected);
    }
}