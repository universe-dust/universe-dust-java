package com.universedust.base.asm;


import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;


/**
 * 封装常用的asm操作
 */
public class AsmHelper {

    private static ClassWriter classWriter = new ClassWriter(0);

    /**
     * 创建类
     */

    public void createClass() {
        String className = "";
        String signature = "";
        classWriter.visit(Opcodes.V17, Opcodes.ACC_PUBLIC, className, signature, Object.class.getName().replace(",", "/"), null);
        classWriter.visitEnd();
        byte[] byteCode = classWriter.toByteArray();

    }


}
