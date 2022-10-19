/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mandirifarhan;

import java.util.Scanner;

/**
 *
 * @author mco-user
 */
public class BilPrima{
    public static void main(String[] args) {
        System.out.println("===============BILANGAN PRIMA===================");
        
        Scanner input = new Scanner(System.in);
        int angka, awal, akhir;
        
        System.out.print("Dari:");
        awal=input.nextInt();
        System.out.print("Hingga:");
        akhir=input.nextInt();
        System.out.println("================================================");
        
        for (int i=awal; i<=akhir; i++){
            angka=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    angka=angka+1;
                }
            }
            if (angka==2){
                System.out.print(i+" ");
            }     
        
    }
}}
