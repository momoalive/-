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
    public void testReadTxtFile() {
        System.out.println(fileReaderService.readTxtFile("D:\\code\\3120005246\\src\\main\\resources\\TestDemo\\orig.txt"));
    }
}
