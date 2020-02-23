package com.cyb.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import org.apache.commons.lang3.StringUtils;

public class TestString {

    public static void main(String[] args) {
    	String str = "My name is chnaged Shivam Garg having ip 192.168.200.9 and ip is 192.168.200.10";
    	String[] strArray =StringUtils.split(str);
    	System.out.println(strArray);
    	String[] strNewArray = Arrays.copyOfRange(strArray, 3,strArray.length);
    	
    	String[] filteredArray = Arrays.stream(strNewArray)
    		    .filter(e -> !e.equals("192.168.200.10")).toArray(String[]::new);
    	
    	List<String> strList = Arrays.asList(filteredArray);
    	System.out.println(strList);
    	
    }
}
