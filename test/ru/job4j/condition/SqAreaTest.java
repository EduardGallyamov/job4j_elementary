package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void squareLines() {
        int k = 2;
        int p = 6;
        double expected = 0;
        double out = SqArea.square(k, p);
        Assert.assertEquals(expected, out, 0.01);
    }
}