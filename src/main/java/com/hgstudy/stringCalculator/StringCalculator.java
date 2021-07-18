package com.hgstudy.stringCalculator;

public class StringCalculator {

    public static int splitAndSum(String text){

        if(text == null || text.isEmpty()){
            return 0;
        }

        String[] values = text.split(",|:");
        int[] numbers = toInts(values);
        return sum(numbers);
    }

    private static int sum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    private static int[] toInts(String[] values){
        int[] numbers = new int[values.length];
        for(int i =0; i < values.length ; i++){
            numbers[i] = Integer.parseInt(values[i]);
        }
        return numbers;
    }


}
