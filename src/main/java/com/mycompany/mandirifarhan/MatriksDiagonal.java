/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mandirifarhan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author mco-user
 */
public class MatriksDiagonal {
    public static void main(String[] args) throws IOException {
        int baris, kolom, nilai;
        int x, y;
        int A[][] = new int [3][3];
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println("=====Input Matriks=====");
        for (baris = 0; baris <3; baris++){
            for (kolom = 0; kolom <3; kolom++){
                System.out.print("Nilai A ["+baris+"]["+kolom+"] adalah = ");
                nilai = Integer.parseInt(br.readLine());
                
                A[baris][kolom] = nilai;
            }
            
            System.out.println(" ");
        }
        
        System.out.println("=====Output Matriks=====");
        for (baris = 0; baris < A.length; baris++){
            for (kolom = 0; kolom < A[0].length; kolom++){
                System.out.print(A[baris][kolom]+" ");
            }
            System.out.println(" ");
        }
        
        System.out.println("=====Penjumlahan Diagonal=====");
        System.out.println(x = A[0][0] + A[1][1] + A[2][2]);
        System.out.println(y = A[0][2] + A[1][1] + A[2][0]);
        //System.out.println((A[0][0] + A[1][1] + A[2][2]) - (A[0][2] + A[1][1] + A[2][0]));
        System.out.println(x-y);
        
    }
}
