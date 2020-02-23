package com.cyb.test;

import java.util.Scanner;

public class TestFirst {
public static void main(String[] args) {
    
   Scanner sc=new Scanner(System.in);
    String a=sc.next();
    String b=sc.next();
    /* Enter your code here. Print output to STDOUT. */
    
    
    System.out.println(a.length()+b.length());
    int x=a.compareTo(b);
    if(x<0 || x==0){
        System.out.println("No");
}
    else{
    	 System.out.println("Yes");
    }
   StringBuffer auffer = new StringBuffer();
StringBuffer buffer = new StringBuffer();
int len = 1; 
while(len<=a.length()-1){
auffer.append(a.charAt(len++));
}
int lenb = 1; 
while(lenb<=b.length()-1){
buffer.append(b.charAt(lenb++));
}
System.out.print(a.toUpperCase().charAt(0)+""+auffer+" "+b.toUpperCase().charAt(0)+""+buffer);  
     
   

}
}

