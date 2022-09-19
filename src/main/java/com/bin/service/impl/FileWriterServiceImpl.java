package com.bin.service.impl;/*
 * @author : bin
 * @description :
 */

import com.bin.service.FileWriterService;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterServiceImpl implements FileWriterService {
    @Override
    public void writeRepeat(String str) {
        File txt=new File("D:\\repeat.txt");
        if(!txt.exists()){//如果文件不存在就创建一个
            try {
                txt.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        byte bytes[]=new byte[512];
        bytes=str.getBytes();
        int b=bytes.length;  //是字节的长度，不是字符串的长度
        FileOutputStream fos= null;
        try {
            fos = new FileOutputStream(txt);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fos.write(bytes,0,b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
