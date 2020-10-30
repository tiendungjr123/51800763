/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
/**
 *
 * @author Dung
 */
public class Homework1 {
 public static int so(int a){
    
    int T=0;
  
    while(a>0){
      int t=a%10;
      T=t;
      a=a/10;
    }
    return T;
     }  
public static int sum(int a){
    
    int sum=0;
  
    while(a>0){
      int t=a%10;
     sum=sum+t;
      a=a/10;
    }
    return sum;
     }
public static int tich(int a){
    
    int tich=1;
  
    while(a>0){
      int t=a%10;
     tich=tich*t;
      a=a/10;
    }
    return tich;
     }

public static int hoandoi(int a){
    
    int T=0;
  
    while(a>0){
      int t=a%10;
     T=T*10+t;
      a=a/10;
    }
    return T;
     }
public static int dem(int a){
    
    int dem=0;
  
    while(a>0){
      int t=a%10;
   dem++;
      a=a/10;
    }
    return dem;
     }
 
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("nhap vao so a: ");
       int a=scan.nextInt();
       //tim chu so
       System.out.println("so dau la: "+so(a));
       System.out.println("so cuoi la: "+(a%10));
       
       //tong cac chu so
       System.out.println("tong la: "+sum(a));
       //tich cac chu so
       System.out.println("tich la: "+tich(a));
        //hoandoi
       System.out.println("so nguoc la: "+hoandoi(a));
       //dem
       System.out.println("so chu so la: "+dem(a));
    }
    
}
