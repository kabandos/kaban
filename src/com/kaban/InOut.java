package com.kaban;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kaban on 29.09.2017.
 */
public class InOut {

    public static String consoleRead () throws IOException{
        InputStreamReader istream = new InputStreamReader(System.in);
        BufferedReader line = new BufferedReader(istream);
        String out = line.readLine();
        return out;
    }
}
