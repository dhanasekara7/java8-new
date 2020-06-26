package com.intro;

import java.io.File;
import java.io.FilenameFilter;

public class JavaFileNameFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String fname) {
        System.out.println(">>>" + dir.getName() + "<<<");
        return fname.endsWith(".java");
    }
    public static void main(String[] args) {
        final File dir = new File("/Users/dhans/ws/learn-java-ws/java8-new/src/com/intro");
        final File[] files = dir.listFiles(new JavaFileNameFilter());
        for(final File file: files) {
            System.out.println(file.getName());
        }
    }
}
