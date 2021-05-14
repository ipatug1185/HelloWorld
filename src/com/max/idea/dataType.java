package com.max.idea;
public class dataType {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        int[] numbers = {5, 2, 3, 4, 1};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = numbers[0] + numbers[2];
        }
        System.out.println(sum);
    }
}


