package com.hgstudy.stringCalculator;

public class StringCalculator {

    public static int splitAndSum(String text){
        int result = 0;

        if(text == null || text.isEmpty()){
            result = 0;
        }else {
            String[] values = text.split(",|:");
            result = sum(values); // 메소드 분리 : indent 1로 변경
        }
        return result;
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
