package com.pdt.decorator.javaio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read()throws IOException{
        int c = in.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int c;
        try{
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(Files.newInputStream(Paths.get("src/main/java/com/pdt/decorators/javaio/LowerCaseInputStream.java"))));
            while ((c = in.read()) >= 0) {
                System.out.println((char)c);
            }
            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
