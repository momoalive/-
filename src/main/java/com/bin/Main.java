package com.bin;/*
 * @author : bin
 * @description :
 */

import com.bin.service.DuplicateCheckService;
import com.bin.service.FileReaderService;
import com.bin.service.impl.DuplicateCheckServiceImpl;
import com.bin.service.impl.FileReaderServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileReaderService fileReaderService = new FileReaderServiceImpl();
        String a = fileReaderService.readTxtFile(sc.next());
        String b = fileReaderService.readTxtFile(sc.next());
        DuplicateCheckService duplicateCheckService = new DuplicateCheckServiceImpl();
        System.out.println(duplicateCheckService.cos(a,b));
    }
}
