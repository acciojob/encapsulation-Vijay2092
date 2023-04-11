package com.driver;

import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        RWOnly reOnly = new RWOnly();

        reOnly.setName("Vijay");
        String ans = reOnly.getName();

        System.out.println(ans);
    }
}