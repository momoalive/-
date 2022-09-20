package com.bin;/*
 * @author : bin
 * @description :
 */

import com.bin.service.DuplicateCheckService;
import com.bin.service.FileReaderService;
import com.bin.service.FileWriterService;
import com.bin.service.impl.DuplicateCheckServiceImpl;
import com.bin.service.impl.FileReaderServiceImpl;
import com.bin.service.impl.FileWriterServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileReaderService fileReaderService = new FileReaderServiceImpl();
        System.out.println("A文件的绝对地址");
        String aPlace = sc.nextLine();
        System.out.println("B文件的绝对地址");
        String bPlace = sc.nextLine();
        String a = fileReaderService.readTxtFile(aPlace);
        String b = fileReaderService.readTxtFile(bPlace);
        DuplicateCheckService duplicateCheckService = new DuplicateCheckServiceImpl();
        System.out.println("结果写入文件: D:\\repeatXXXXXXXXX.txt");
        FileWriterService fileWriterService = new FileWriterServiceImpl();
        //浮点数保留两位小数,并且写入文件
        String result = "文件A:" + aPlace + " 与 文件B " + bPlace + " 相似度为 -> " + String.format("%.2f", duplicateCheckService.cos(a, b));
        fileWriterService.writeRepeat(result);
        System.out.println(result);
    }
}
