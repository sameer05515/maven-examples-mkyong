package com.mkyong.examples;

public class CalculationUtil {
    public static int getSum(int... numbers) {
        int sum = 0;
        if (numbers == null || numbers.length <= 0) {
            return sum;
        }

        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static String getSum(String... numbers) throws Exception {
        String sum="0";
        if (numbers == null || numbers.length <= 0) {
            return sum;
        }
        for (String num : numbers) {
            if(!RegExUtil.onlyDigits(num)){
                throw new Exception("Array contains string, having non-integer charaters : "+num);
            }
        }

        for (String num : numbers) {
            sum = add(sum,num);
        }
        return sum;
    }

    private static String add(String num1, String num2) {
        String summation="";
        int carry=0;
        int diff=num1.length()-num2.length();
        if(diff>0){
            for(int i=0;i<diff;i++){
                num2="0"+num2;
            }
        }else if(diff<0){
            for(int i=0;i<diff*-1;i++){
                num1="0"+num1;
            }
        }

        for(int i=num1.length()-1;i>=0;i--){
            int n1=Integer.parseInt(num1.charAt(i)+"");
            int n2=Integer.parseInt(num2.charAt(i)+"");
            int sum=n1+n2+carry;
            summation=(sum%10)+summation;
            carry=sum/10;
        }

        if(carry>0){
            summation=carry+summation;
        }

        return summation;
    }
}
