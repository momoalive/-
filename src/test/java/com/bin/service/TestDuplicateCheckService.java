package com.bin.service;/*
 * @author : bin
 * @description :
 */

import com.bin.service.impl.DuplicateCheckServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class TestDuplicateCheckService {
    private DuplicateCheckService duplicateCheckService;

    @Before
    public void set() {
        duplicateCheckService = new DuplicateCheckServiceImpl();
    }

    @Test
    //测试两个字符串的重复率
    public void testCos() {
        float a = duplicateCheckService.cos("今天是星期天，天气晴，今天晚上我要去看电影", "今天是周天，天气晴朗，我晚上要去看电影。");
        System.out.println("testCos->" + a);
    }
}
