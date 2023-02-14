package com.universedust.base.constant;

import java.io.File;

public class SystemInfo {

    //当前工程所在文件夹
    public static  String userDir = System.getProperty("user.dir");

    public  static String lineSeparator = System.lineSeparator();

    //文件分隔符
    public static String fileSeparator= File.separator;
    public static char fileSeparatorChar= File.separatorChar;
}
