package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDayOfWeekTest {
    public static FirstAndLastDayOfWeek findFirstAndLastDayOfWeek;

    @BeforeClass
    public static void setUp()
    {
        findFirstAndLastDayOfWeek = new FirstAndLastDayOfWeek();
    }

    @AfterClass
    public static void tearDown()
    {
        findFirstAndLastDayOfWeek = null;
    }

    @Test
    public void testForFindingFirstAndLastDayOfWeek()
    {
        FirstAndLastDayOfWeek.Result result = findFirstAndLastDayOfWeek.getFirstAndLastdayOfWeek();
        assertEquals("Mon 24/06/2019",result.firstDay);
        assertEquals("Sun 30/06/2019",result.lastDay);
    }

}