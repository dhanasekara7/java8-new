package com.intro;

import java.io.File;
import java.io.FileFilter;

public class JavaFileFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".java");
    }

    public static void main(String[] args) {
        final File dir = new File("/Users/dhans/ws/learn-java-ws/java8-new/src/com/intro");
        final File[] files = dir.listFiles(new JavaFileFilter());
        for(final File file: files) {
            System.out.println(file.getName());
        }
    }
}
