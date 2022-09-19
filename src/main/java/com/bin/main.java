package com.bin;/*
 * @author : bin
 * @description :
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) {
        String s = FileRead.readTxtFile("D:\\code\\3120005246\\src\\main\\resources\\TestDemo\\orig.txt");
        System.out.println(s);
    }
}
