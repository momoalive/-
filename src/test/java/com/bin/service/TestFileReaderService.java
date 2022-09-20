package com.bin.service;/*
 * @author : bin
 * @description :
 */

import com.bin.service.impl.FileReaderServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class TestFileReaderService {
    private FileReaderService fileReaderService;

    @Before
    public void set() {
        fileReaderService = new FileReaderServiceImpl();
    }

    @Test
    //是否能够正常读写
    public void testReadTxtFile() {
        System.out.println(fileReaderService.readTxtFile("D:\\code\\3120005246\\src\\main\\resources\\TestDemo\\orig.txt"));
    }

    @Test
    //文件不存在
    public void testFileNotFount(){
        System.out.println(fileReaderService.readTxtFile("adad"));
    }
}
