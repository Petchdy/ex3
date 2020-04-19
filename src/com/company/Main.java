package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int roundsum;
        while (true){
            int n = scan.nextInt();
            if (n>0){
                int price = scan.nextInt();
                int take_away = scan.nextInt();
                if (take_away==1){
                    roundsum = (n*price)+10;
                }
                else {
                    roundsum = n*price;
                }
                System.out.printf("%d \n",roundsum);
                sum = sum+roundsum;
            }
            else {
                break;
            }
        }
        System.out.printf("%d",sum);
    }
}
