package com.github.kloenk.sort;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
	    int[] zahlen = new int[7];
	    for (int i = 0; i < zahlen.length; i++) {
		    zahlen[i] = (int)(Math.random()*49);
	    }
	    print(zahlen);
    }

    static void print(int[] zahlen) {
        System.out.println(Arrays.toString(zahlen));
    }
}
