package com.ZTE.src1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description
 * @Author by房文辉
 * @Date 2020/4/8 12:25
 */
    public class TestDemo {
        public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
            File csv = new File("C:\\Users\\Josvin\\Desktop\\Example.csv");
            InputStreamReader isr = new InputStreamReader(new FileInputStream(csv),"gb2312");
            BufferedReader br = new BufferedReader(isr);
            String line = "";
            List<String> allString = new ArrayList<String>();
            try {
                line = br.readLine();
                while(line != null){
                    System.out.println(line);
                    line = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

