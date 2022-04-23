package com.mkyong.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculationUtilTest {
    @Test
    public void testGetSum_when_null_arr(){
        int[] arr= null;
        int sum=CalculationUtil.getSum(arr);
        Assertions.assertEquals(0,sum);
    }

    @Test
    public void testGetSum_when_empty_arr(){
        int[] arr={};
        int sum = CalculationUtil.getSum(arr);
        Assertions.assertEquals(0,sum);
    }

    @Test
    public void testGetSum_when_non_null_arr(){
        int sum=CalculationUtil.getSum(1,2,3,4);
        Assertions.assertEquals(10,sum);
    }

    @Test
    public void testGetSum_when_null_string_arr() throws Exception{
        String[] arr= null;
        String sum=CalculationUtil.getSum(arr);
        Assertions.assertEquals("0",sum);
    }

    @Test
    public void testGetSum_when_empty_string_arr() throws Exception{
        String[] arr={};
        String sum = CalculationUtil.getSum(arr);
        Assertions.assertEquals("0",sum);
    }

    @Test
    public void testGetSum_when_non_null_string_arr_with_invalid_value() throws Exception{
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            CalculationUtil.getSum("123","123abcd");
        });

        Assertions.assertTrue(exception.getMessage().startsWith("Array contains string, having non-integer charaters : "));
    }


    @Test
    public void testGetSum_when_non_null_string_arr() throws Exception{
        String sum=CalculationUtil.getSum("123","123");
        Assertions.assertEquals("246",sum);
    }

    @Test
    public void testGetSum_when_non_null_string_arr_carry_case() throws Exception{
        String sum=CalculationUtil.getSum("999","1");
        Assertions.assertEquals("1000",sum);
    }

    @Test
    public void testGetSum_when_non_null_string_arr_contains_negative_number() throws Exception{
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            CalculationUtil.getSum("1000","-1");
        });
        Assertions.assertTrue(exception.getMessage().equals("Array contains string, having non-integer charaters : -1"));
    }


    @Test
    public void testGetSum_when_non_null_string_arr_multiple_values() throws Exception{
        String sum=CalculationUtil.getSum("9999999999999999999999999999999999","1","1","1");
        Assertions.assertEquals("10000000000000000000000000000000002",sum);
    }

}
