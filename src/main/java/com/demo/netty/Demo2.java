package com.demo.netty;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/***
 * @Author wenLong
 * @Description
 * @Date 2023-02-13 22:08
 **/
public class Demo2 {

    /**
     * 实现文件的拷贝
     *
     * @param args
     */

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D://123.txt");
        //获取输入流的Channel
        FileChannel channel = fileInputStream.getChannel();
        //设置缓存 将channel的数据读入到缓存
        ByteBuffer byteBuffer = ByteBuffer.allocate(5);

        FileOutputStream fileOutputStream = new FileOutputStream("D://456.txt");

        while (true) {
            //重置 postion 和 limit位置
            byteBuffer.clear();
            int read = channel.read(byteBuffer);
            if (read == -1) {
                break;
            }
            byteBuffer.flip();
            FileChannel writeChannel = fileOutputStream.getChannel();
            writeChannel.write(byteBuffer);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

}
