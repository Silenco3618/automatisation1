package ru.netology.service;
public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test // равен 0
    public void zero() {
        org.junit.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.junit.Test // равен 1
    public void aboveZero1() {
        org.junit.Assert.assertEquals(service.remain(1), 999);
    }

    @org.junit.Test // равен лимиту//
    public void asLimit() {
        org.junit.Assert.assertEquals(service.remain(1000), 0);
    }

    @org.junit.Test // больше лимита на 1
    public void aboveLimit() {
        org.junit.Assert.assertEquals(service.remain(1001), 999);
    }

    @org.junit.Test // меньше лимита на 1
    public void beforeLimit1() {
        org.junit.Assert.assertEquals(service.remain(999), 1);
    }

    @org.junit.Test // больше лимита
    public void aboveMoreLimit() {
        org.junit.Assert.assertEquals(service.remain(1356), 644);
    }

    @org.junit.Test // меньше лимита
    public void aboveZero() {
        org.junit.Assert.assertEquals(service.remain(500), 500);
    }

    @org.junit.Test // кратно лимиту//
    public void equallyLimit() {
        org.junit.Assert.assertEquals(service.remain(2000), 0);
    }
}
