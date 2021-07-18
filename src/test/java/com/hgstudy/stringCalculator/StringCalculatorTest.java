package com.hgstudy.stringCalculator;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    @DisplayName("null_또는_빈값")
    void nullOrEmpty(){
        assertEquals(StringCalculator.splitAndSum(null),0);
        assertEquals(StringCalculator.splitAndSum(""),0);
    }

    @Test
    @DisplayName("값 하나")
    void OnlyOneValue(){
        assertEquals(StringCalculator.splitAndSum("1"),1);
    }

    @Test
    @DisplayName("쉼표 구분자")
    void commaSeparator(){
        assertEquals(StringCalculator.splitAndSum("1,2"),3);
    }

    @Test
    @DisplayName("쉼표 콜론 구분자")
    void commaAndColonSeparator(){
        assertEquals(StringCalculator.splitAndSum("1,2:3"),6);
    }
}
