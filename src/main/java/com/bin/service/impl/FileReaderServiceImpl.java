package com.bin.service.impl;/*
 * @author : bin
 * @description :
 */

import com.bin.service.FileReaderService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileReaderServiceImpl implements FileReaderService {
    @Override
    public String readTxtFile(String filePath) {
        File file = new File(filePath);
        String encoding = "utf-8";//设置编码格式
        try (InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
             BufferedReader bufferedReader = new BufferedReader(read)) {
            //判断文件是否存在
            if (file.isFile() && file.exists()) {
                String lineTxt;
                StringBuilder stringBuilder = new StringBuilder();
                //定义正则表达式去除无意义字符
                String regex = "^[\\u4e00-\\u9fa5_a-zA-Z0-9]+$";
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    stringBuilder.append(lineTxt);
                }
                return stringBuilder.toString().replace(regex, "").replace(" ", "");
            } else {//出现其他问题会输出并且返回null
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
        }
        return null;
    }
}
