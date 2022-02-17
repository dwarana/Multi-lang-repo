/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java_assignment;
import java.io.*;  

/**
 *
 * @author sunali
 */
public class question12 {
    //try and catch block
    class NegTest {
        public static void main (String a[]) {
            try {
                int a1[] = new int [-2];
                System.out.println("First element: " + a1[0]);
            }
            catch (NegativeArraySizeException n) {
                System.out.println("Generated exception: " + n);
            }
            System.out.println("After the try block");
        }
    }
    
    //multiple catch statements
    public class MultiCatchEx1 {
        public static void main(String[] args) { 
            try { 
                int arr[] = new int[6]; 
                arr[3] = 20/0; // Exception occurred. 
                   System.out.println("I am in try block"); 
            } 
            catch (ArithmeticException ae) { 
                System.out.println("A number cannot be divided by zero, Illegal operation in java"); 
            } 
            catch(ArrayIndexOutOfBoundsException e) { 
                System.out.println("Accessing array element outside of specified limit"); 
            } 
            catch(Exception e) { 
                System.out.println(e.getMessage()); 
            } 
            System.out.println("I am out of try-catch block"); 
        } 
    }
    
    //exception precedence over base class
    class BaseSubException {
        public static void main(String a[]) {
            if(a.length == 0) {
                System.out.println("invalid usage");
                System.out.println("usage : Java file1 file2 file3 …");
                return;
            }
            for(int I=0;I<a.length; I++) {
                //File f = new File(a[I]);
                try {
                    String line;
                    DataInput d = new DataInputStream(new FileInputStream(a[I]));
                    if (f.exists() && f.isFile()) {
                        System.out.println("file exists");
                        System.out.println(f + "is ordinary file");
                        System.out.println("printing the contents of file named : " + a[I]);
                        System.out.println("========================");
                        
                        while((line = d.readLine()) != null) {
                            System.out.println(line);
                        }
                    }
                } catch (FileNotFoundException e) {
                    if(f.exists() && f.isDirectory()) {
                        System.out.println("======================");
                        System.out.println("Name : " + f + "is a directory");
                        System.out.println("inside catch of FileNotFoundException");
                        System.out.println("========================");
                    }
                    else {
                        System.out.println("=====================");
                        System.out.println("Name : " + a[I] + "does not exists");
                        System.out.println("generated exception : " + e);
                        System.out.println("======================");
                    }
                } catch (IOException p) {
                    System.out.println("super class is higher up in the program");
                }
            }
        }
    }
    
    //try/catch with finally clause
    public static void main (String args[]) {
        //try block 
        try
        {
            System.out.println ("Try Block");
            int data = 125 / 5;
            System.out.println ("Result:" + data);
        } 
        //catch block
        catch (NullPointerException e) {
            System.out.println ("Catch Block");
            System.out.println (e);
        } 
        //finally block
        finally {
            System.out.println ("inally Block");
            System.out.println ("No Exception::finally block executed");
        } 
        System.out.println ("rest of the code...");
    }
    
    //throws clause
    class ThrowExample{  
        void method()throws IOException {  
            throw new IOException("device error");  
        }  
    }  
    public class Testthrows2 {  
        public static void main(String args[]) {  
            try {  
                ThrowExample m = new ThrowExample();  
                m.method();  
            } 
            catch(Exception e){
                System.out.println("exception handled");
            }     
            System.out.println("normal flow...");  
        }  
    }  
    
    class JavaException {
        public static void main(String args[]) {
            try {
                throw new MyException(2);
            }
            catch(MyException e) {
                System.out.println(e);
            }
        }
    }
    
    //user defined exception
    class MyException extends Exception {
        int a;
        MyException(int b) {
            a=b;
        }
        public String toString() {
            return ("Exception Number =  " + a);
        }
    }
}
