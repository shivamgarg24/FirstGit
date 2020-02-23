package com.cyb.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        List <Integer> list=new ArrayList<Integer>();
        while(scan.hasNextInt() && list.size()<size){
         int input=scan.nextInt();
         list.add(input);
        }

        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = scan.next();
            if (action.equalsIgnoreCase("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } if(action.equalsIgnoreCase("delete")) { // "Delete"
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();
        
        /* Print our updated Linked List */
        for (Integer num : list) {
            System.out.print(num + " ");
        }     
    }
}