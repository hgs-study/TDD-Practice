package com.hgstudy.stringCalculator;

public class StringCalculator {

    public static int splitAndSum(String text){

        if(text == null || text.isEmpty()){
            return 0;
        }

        String[] values = text.split(",|:");
        return sum(values); // 메소드 분리 : indent 1로 변경
    }

    // 메소드 분리 : indent 1로 변경
    private static int sum(String[] values) {
        int result = 0;
        for (String value : values) {
            result += Integer.parseInt(value);
        }
        return result;
    }


}
