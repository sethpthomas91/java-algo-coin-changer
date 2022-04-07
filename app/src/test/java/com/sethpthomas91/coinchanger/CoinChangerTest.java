package com.sethpthomas91.coinchanger;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CoinChangerTest {
    private CoinChanger coinChanger;

    @Before
    public void setUp() throws Exception {
        coinChanger = new CoinChanger();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void makeChange() {
    }


    @Test
    public void testZeroIntegerReturnsEmptyHashMap() {
        Map<String, Integer> expected = new HashMap<>();
        Map<String, Integer> actual = coinChanger.makeChange(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void condition() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Q", 3);
        Map<String, Integer> actual = coinChanger.makeChange(75);
        Assert.assertEquals(expected, actual);
    }
}