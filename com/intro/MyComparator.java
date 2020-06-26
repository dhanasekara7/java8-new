package com.intro;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator {

    public static void main(String[] args) {
        Comparator<String> myComp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        List<String> list = Arrays.asList("this", "is", "fun");
        list.sort(myComp);
        for(String str: list) {
            System.out.println(">>>>>>" + str);
        }

        Comparator<String> comparator = (s1, s2) ->  Integer.compare(s1.length(), s2.length());
        List<String> list2 = Arrays.asList("this", "is", "fun");
        Collections.sort(list2, comparator);
        for(String str: list2) {
            System.out.println(">>>>>>" + str);
        }


    }
}
