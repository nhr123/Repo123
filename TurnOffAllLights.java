import java.io.*;
import java.util.*;

public class TurnOffAllLights{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        
        int t,n;
		
        System.out.println("Enter the Number of Test Cases which you need to Test : ");

        t = in.nextInt();
        while(t>0){
            System.out.println("Enter the Number of Lights in this case : ");
            n = in.nextInt();
            
            System.out.println("Enter the current status of all the lights indicating 0/1 for Off/On : ");
            String s = in.next();
            char[] c = s.toCharArray();
            
            System.out.println("\nChecking the possibilities...\n");
            
            boolean skip = false;
            for(int i=0;i<n;i++){
                if(skip == false){
                    
                    int j=i;
                    
                    if(i==0){
                        while(j<2){
                            System.out.print("Toggling switch "+j+" from "+c[j]+" to ");
                            if(c[j]=='0')
                                c[j] = '1';
                            else
                                c[j] = '0';
                            System.out.println(c[j]);
                            j++;
                        }
                    }
                    else if(i<n-1){
                        for(int k=j-1;k<=j+1;k++){
                            System.out.print("Toggling switch "+k+" from "+c[k]+" to ");
                            if(c[k]=='0')
                                c[k] = '1';
                            else
                                c[k] = '0';
                            System.out.println(c[k]);
                        }
                    }
                    else{
                        for(int k=j-1;k<n;k++){
                            System.out.print("Toggling switch "+k+" from "+c[k]+" to ");
                            if(c[k]=='0')
                                c[k] = '1';
                            else
                                c[k] = '0';
                            System.out.println(c[k]);
                        }
                    }
                    
                    int cnt = 0;
                    System.out.print("\nCurrent status of the switches : ");
                    for(int k=0;k<n;k++){
                        System.out.print(c[k]);
                        if(c[k] == '0')
                            cnt++;
                    }
                    System.out.println("\n");
                    if(cnt == n){
                        System.out.println("Yes, It is possible to Turn Off all the switches");
                        skip = true;
                    }
                    if(i==n-1){
                        System.out.println("No, It is not possible to Turn off all the switches");
                    }
                }
            }
            
            t--;
        } 

     }
}