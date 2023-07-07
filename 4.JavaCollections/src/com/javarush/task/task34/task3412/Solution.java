package com.javarush.task.task34.task3412;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/* 
Добавление логирования в класс
*/

public class Solution {
    private static final Logger logger = LoggerFactory.getLogger(Solution.class);

    private int value1;
    private String value2;
    private Date value3;

    public Solution(int value1, String value2, Date value3) {
        logger.debug("Solution");  //1
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public static void main(String[] args) {

    }

    public void calculateAndSetValue3(long value) {

        value -= 133;
        if (value > Integer.MAX_VALUE) {
            logger.trace("calculateAndSetValue3 value > Integer.MAX_VALUE"); //1
            logger.debug("calculateAndSetValue3 v/m"); //3
            value1 = (int) (value / Integer.MAX_VALUE);
        } else {

            logger.debug("calculateAndSetValue3 -133"); //2
            value1 = (int) value;
        }
    }

    public void printString() {
        if (value2 != null) {
            logger.trace("printString value2 != null");//3
            System.out.println(value2.length());
        }
    }

    public void printDateAsLong() {
        if (value3 != null) {
            logger.trace("printDateAsLong value3 != null");//4
            System.out.println(value3.getTime());
        }
    }

    public void divide(int number1, int number2) {
        try {
            logger.trace("divide");//2
            System.out.println(number1 / number2);
        } catch (ArithmeticException e) {
            logger.error("ArithmeticException", e);
        }
    }

    public void setValue1(int value1) {
        logger.debug("setValue1"); //4
         this.value1 = value1;
    }

    public void setValue2(String value2) {
        logger.debug("setValue2"); //5
        this.value2 = value2;
    }

    public void setValue3(Date value3) {
        logger.debug("setValue3"); //6
        this.value3 = value3;
    }
}
