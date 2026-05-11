/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javabackend3.exeption;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author jawad
 */
public class Javabackend3Exeption {

    public static void main(String[] args) {
        
        
        // Run time / Uchecked exception
//        int i=8;
//        int j=0;
//        String str = null;
//        
//        try{
//            System.out.println(i/j);
//            System.out.println(str.length());
//        }catch(ArithmeticException e){
//            System.out.println("second value cannot be zero" + e);
//        }catch(NullPointerException e){
//            System.out.println("String is empty" + e);
//        }
//        System.out.println("Hello World!");


            
        // CompileTime / Checked Exception 
        try{
            File obj = new File("myfile.txt");
            Scanner sc = new Scanner(obj);
        }catch(Exception e){
            System.out.println("File not found");
        }
    }
}
