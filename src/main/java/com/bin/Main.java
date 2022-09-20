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
//        Scanner sc = new Scanner(System.in);
        FileReaderService fileReaderService = new FileReaderServiceImpl();
        String aPlace = "D:\\code\\3120005246\\src\\main\\resources\\TestDemo\\orig.txt";
        String bPlaace = "D:\\code\\3120005246\\src\\main\\resources\\TestDemo\\orig_0.8_add.txt";
        String a = fileReaderService.readTxtFile(aPlace);
        String b = fileReaderService.readTxtFile(bPlaace);
        DuplicateCheckService duplicateCheckService = new DuplicateCheckServiceImpl();
        System.out.println(duplicateCheckService.cos(a,b));
        FileWriterService fileWriterService = new FileWriterServiceImpl();
        fileWriterService.writeRepeat("文件A:"+aPlace+" 与 文件B "+bPlaace+" 相似度为 -> "+String.format("%.2f", duplicateCheckService.cos(a,b)));//浮点数保留两位小数,并且写入文件
    }
}
