package cn.it1995.tool;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class DataSecret {


    public static byte[] encode(byte[] txt) throws UnsupportedEncodingException {

        return Base64.encodeBase64(txt);
    }

    public static byte[] decode(String txt){

        return Base64.decodeBase64(txt);
    }

    public static byte[] int2Byte(int data){

        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(data);
        return byteBuffer.array();
    }
}
