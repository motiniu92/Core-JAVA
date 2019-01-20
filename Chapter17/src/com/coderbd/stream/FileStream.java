package com.coderbd.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class FileStream {

    public static void main(String[] args) throws IOException {
        try (
                FileOutputStream output = new FileOutputStream("temp.dat");) {
            for (int i = 1; i <= 20; i++) {
                output.write(i);

            }

            try (
                    FileInputStream input = new FileInputStream("temp.dat");) {
                int value;
                while ((value = input.read()) != -1) {
                    int Value = 0;
                    System.out.println(value + " ");
                }
            }
        }

    }
}
