package com.intro;

import java.io.File;
import java.io.FileFilter;

public class JavaFileFilterFn {

    public static void main(String[] args) {
        FileFilter ff = (File file) -> file.getName().endsWith(".java");
        final File dir = new File("/Users/dhans/ws/learn-java-ws/java8-new/src/com/intro");
        final File[] files = dir.listFiles(ff);
        for(final File file: files) {
            System.out.println(file.getName());
        }
    }
}
