package com.ibm.day1;

public class CheckAgain {
	  int a;
      int b;
      void meth(int i , int j) 
      {
          i *= 2;
          j /= 2;
      }          
  }    
  class Output 
  {
      public static void main(String args[])
      {
      	CheckAgain obj = new CheckAgain();
	    int a = 10;
          int b = 20;             
          obj.meth(a , b);
          System.out.println(a + " " + b);        
      } 
  }