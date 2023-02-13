package com.demo.netty;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/***
 * @Author wenLong
 * @Description
 * @Date 2023-02-11 14:11
 **/
public class Demo {
    public static void main(String[] args) throws IOException {
        /***
         *
         * NIOdemo
         */
        FileOutputStream fileOutputStream = new FileOutputStream("D://123.txt");
        FileChannel channel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        String str = "hello word";
        byteBuffer.put(str.getBytes());
        //设置写操作
        byteBuffer.flip();
        channel.write(byteBuffer);
    }


}
