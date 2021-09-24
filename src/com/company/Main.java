package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Max Mark");
        int maxMark = input.nextInt();
        int loopInt = 1;
        while (loopInt == 1) {
            System.out.println("To Break Enter 909");
            System.out.println("Enter Mark: ");
            int studentMark = input.nextInt();
            if (studentMark < 0 || studentMark > maxMark) {
                System.out.println("Enter Valid Mark");
            }
            if (studentMark == 909) {
                break;
            }
            if (((double) studentMark / maxMark) >= 0.8 && (studentMark <= maxMark)){
                System.out.println("Grade Acheived: A");
            } else {
                if (((double) studentMark / maxMark) <= 0.79 && ((double) studentMark / maxMark) >= 0.7) {
                    System.out.println("Grade Acheived: B");
                } else {
                    if (((double) studentMark / maxMark) <= 0.69 && ((double) studentMark / maxMark) >= 0.6) {
                        System.out.println("Grade Acheived: C");
                    } else {
                        if (((double) studentMark / maxMark) <= 0.59 && ((double) studentMark / maxMark) >= 0.5) {
                            System.out.println("Grade Acheived: D");
                        } else {
                            if (((double) studentMark / maxMark) <= 0.49 && ((double) studentMark / maxMark) >= 0.4) {
                                System.out.println("Grade Acheived: E");
                            } else {
                                if (((double) studentMark / maxMark) < 0.4 && studentMark >= 0) {
                                    System.out.println("Grade Acheived: U");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}