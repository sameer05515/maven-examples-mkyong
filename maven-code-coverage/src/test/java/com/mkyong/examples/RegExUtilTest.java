package com.mkyong.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegExUtilTest {
    @Test
    public void testOnlyDigits_positive_case(){
        boolean b=RegExUtil.onlyDigits("1234");
        Assertions.assertTrue(b);
    }

    @Test
    public void testOnlyDigits_negative_case(){
        boolean b=RegExUtil.onlyDigits("prem");
        Assertions.assertFalse(b);
    }

    @Test
    public void testOnlyDigits_string_null(){
        String s=null;
        boolean b=RegExUtil.onlyDigits(s);
        Assertions.assertFalse(b);
    }
}
