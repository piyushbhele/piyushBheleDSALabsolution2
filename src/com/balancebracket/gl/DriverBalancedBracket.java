package com.balancebracket.gl;

import java.util.Scanner;

public class DriverBalancedBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();

        BalancedBracket bb = new BalancedBracket();

        if (bb.areBracketsBalanced(expr)){
            System.out.println("The entered String has Balanced Brackets");
        }
        else {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }

    }
}
