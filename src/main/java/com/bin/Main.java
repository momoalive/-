package com.bin;/*
 * @author : bin
 * @description :
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = FileRead.readTxtFile(sc.next());
        String b = FileRead.readTxtFile(sc.next());
        System.out.println(Cos.cos(a,b));
    }
}
