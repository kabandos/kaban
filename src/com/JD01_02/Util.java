package com.JD01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kaban on 29.09.2017.
 */
class Util {

    static String getOneLine () throws IOException{
        try(BufferedReader stin = new BufferedReader(new InputStreamReader(System.in))) {
            return stin.readLine();
        }

    }

}
