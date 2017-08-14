/* program to find valid pan card numbers in a paragraph */

import java.io.*;
import java.util.*;
public class PanCard{
public static void main(String args[]) throws IOException{
	BufferedReader r=new BufferedReader(new FileReader("C:\\Users\\Hanumanth\\Desktop\\panDetails.txt"));
	String s=r.readLine();
	while(s != null){
	String s1[]=s.split(" ");
	for(int i=0;i < s1.length ;i++){
   		boolean flag0=true;
   		boolean flag1=false,flag2=false,flag3=false;
   		if(s1[i].length() ==10){
     			String s2=s1[i].substring(0,5);   
      		 	flag1= fiveLetters(s2);
                 	if(flag1){
        			s2=s1[i].substring(5,9);
        			flag2= fourNumbers(s2);

         			if(flag2){
           			s2=s1[i].substring(9,10);
           			flag3=lastLetter(s2.charAt(0)); 
         			}   
      			}

    			if(flag1 == false  || flag2 == false || flag3== false){
     				System.out.println(s1[i]+" <==== Invalid Pan");    
     				flag0=false;
    			}     
   		}
	   else{
    		if(s1[i].length()>1){
   		   System.out.println(s1[i]+" <==== Invalid Pan");    
   	    }
       		flag0=false;
	 }
	  if(flag0){
     		System.out.println(s1[i]+" <==== valid Pan");
  	}
	}
	s=r.readLine();
	}
		r.close();
}

static boolean lastLetter(char ch){
  	if(!((ch >= 65 && ch <=90) || (ch >= 90 && ch <= 122))){
   	return false;
  	}
	return true;
}
static boolean fourNumbers(String s){
	boolean a=true;
	int i=0;
	while(i < s.length()){
		 char ch=s.charAt(i);
 	if( !(ch >= 48 && ch <= 57)){
	  return false;
 	}
	i++;
	}
	return a;
}
static boolean fiveLetters(String s){
	boolean a=true;
	int i=0;
	while(i < s.length()){
  		char ch=s.charAt(i);
  	if(!((ch >= 65 && ch <=90) || (ch >= 90 && ch <= 122))){
   
   	return false;
  	}
	i++;
	}
	return a;
	}
}
