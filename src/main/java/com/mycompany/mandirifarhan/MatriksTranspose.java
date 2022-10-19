/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mandirifarhan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mco-user
 */
public class MatriksTranspose {
    public static void main(String args[]) {

        int x[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
 
        int y[][] = new int[3][3]; 

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                y[i][j] = x[j][i];
            }
        }

        System.out.println("=====Sebelum Transpose=====");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();   
        }
        System.out.println("=====Sesudah Transpose=====");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println();   
        }
    }
}
