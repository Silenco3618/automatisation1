package ru.netology.service;
public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test // равен 0
    public void zero() {
        org.testng.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.testng.annotations.Test // равен 1
    public void aboveZero1() {
        org.testng.Assert.assertEquals(service.remain(1), 999);
    }

    @org.testng.annotations.Test // равен лимиту//
    public void asLimit() {
        org.testng.Assert.assertEquals(service.remain(1000), 0);
    }

    @org.testng.annotations.Test // больше лимита на 1
    public void aboveLimit() {
        org.testng.Assert.assertEquals(service.remain(1001), 999);
    }

    @org.testng.annotations.Test // меньше лимита на 1
    public void beforeLimit1() {
        org.testng.Assert.assertEquals(service.remain(999), 1);
    }

    @org.testng.annotations.Test // больше лимита
    public void aboveMoreLimit() {
        org.testng.Assert.assertEquals(service.remain(1356), 644);
    }

    @org.testng.annotations.Test // меньше лимита
    public void aboveZero() {
        org.testng.Assert.assertEquals(service.remain(500), 500);
    }

    @org.testng.annotations.Test // кратно лимиту//
    public void equallyLimit() {
        org.testng.Assert.assertEquals(service.remain(2000), 0);
    }

}
