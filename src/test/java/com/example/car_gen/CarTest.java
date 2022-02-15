package com.example.car_gen;

import org.junit.*;

public class CarTest {
    @Test
    public void testAccelerateSpeed(){
        Assert.assertEquals(5,civic.accelerateSpeed());
    }
    Honda civic = new Honda();


    public void testDeclerateSpeed(){
        Assert.assertEquals(0,civic.accelerateSpeed());
    }

}
