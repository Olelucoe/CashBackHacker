package ru.netology;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBuyBeforeMinCash(){

    int expected = 900;
    int actual = service.remain(100);

        Assert.assertEquals(expected, actual);
}
    @Test
    public void shouldBuyThousand(){

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldBuyForZero(){

        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldBuyMiddleAmount(){

        int expected = 500;
        int actual = service.remain(500);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeMinPurchaseForCash(){

        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldBuyAboveThousand(){
        int expected = 750;
        int actual = service.remain(1250);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldBuySeveralThousand(){
        int expected = 0;
        int actual = service.remain(5000);

        Assert.assertEquals(expected, actual);
    }
}