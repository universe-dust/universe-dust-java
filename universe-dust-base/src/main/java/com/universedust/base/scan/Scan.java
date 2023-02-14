package com.universedust.base.scan;

import java.util.Collection;
import java.util.List;

public interface Scan {

    //扫描主类所在包和子包，子类必须实现
    List<String> scan(Class mainClazz) ;

    //扫描自定义包，选择实现
//     Collection<String> scan(Collection<String> scanPkg);
}
