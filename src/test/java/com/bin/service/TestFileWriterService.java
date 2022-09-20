package com.bin.service;/*
 * @author : bin
 * @description :
 */

import com.bin.service.impl.FileWriterServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class TestFileWriterService {
    private FileWriterService fileWriterService;
    @Before
    public void set(){
        fileWriterService = new FileWriterServiceImpl();
    }

    @Test
    //是否能够正常写入
    public void testWriteRepeat(){
        fileWriterService.writeRepeat("重复率为 xxx");
    }

}
