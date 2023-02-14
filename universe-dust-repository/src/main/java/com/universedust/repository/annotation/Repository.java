package com.universedust.repository.annotation;

import java.lang.annotation.*;

/**
 * 声明一个仓库
 */

// 作用在类上
@Target(ElementType.TYPE)
//运行时
@Retention(RetentionPolicy.RUNTIME)

@Documented
public @interface Repository {

}
