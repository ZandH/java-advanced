package com.java.util;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import javafx.beans.binding.When;

import java.util.Scanner;

/**
 * Integer类的练习
 *
 * @author 屏儿
 * 2019/03/12
 */
public class IntegerDemo {

    public static void main(String[] args) {
        //将字符串转换为int类型
        int num = Integer.parseInt("456");
        //通过构造函数创建一个integer对象
        Integer iNum = Integer.valueOf("456");
        System.out.println("int数据与Integer对象的比较：" + iNum.equals(num));
        //获取数字的二进制表示
        String str2 = Integer.toBinaryString(num);
        //获取数字的十六进制表示
        String str3 = Integer.toBinaryString(num);
        //获取数字的八进制表示
        String str4 = Integer.toOctalString(num);
        //获取数字的十五进制表示
        String str5 = Integer.toString(num, 15);
        System.out.println("456的二进制表示为：" + str2);
        System.out.println("456的十六进制表示为：" + str3);
        System.out.println("456的八进制表示为：" + str4);
        System.out.println("456的十五进制表示为：" + str5);
        System.out.println("------------------分割线，以下是自定义内容----------------");
        System.out.println("转换为八进制"+convert(num,8));

    }

    private static String convert(int num, int radix) {
        //创建一个stringbuffer，用来存放结果字符串
        StringBuffer stringBuffer = new StringBuffer();
        //被除数不为0，就循环
        while (num != 0) {
            int remainder = num % radix;
            num = num / radix;
            stringBuffer.append(String.valueOf(remainder));
            num = num / radix;
        }
        //将结果串取反返回
        return stringBuffer.reverse().toString();

    }
    }

