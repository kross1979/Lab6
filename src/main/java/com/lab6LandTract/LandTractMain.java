/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab6LandTract;

import java.util.Scanner;

/**
 *
 * @author kimbe
 */
public class LandTractMain {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        LandTract first = new LandTract();
        
        System.out.print("Enter length of first tract: ");
        first.length = keyboard.nextInt();
        System.out.print("Enter width of first tract: ");
        first.width = keyboard.nextInt();
        
        LandTract second = new LandTract();
        System.out.print("Enter length of second tract: ");
        second.length = keyboard.nextInt();
        System.out.print("Enter width of second tract: ");
        second.width = keyboard.nextInt();
        System.out.println(first);
        System.out.println(second);
        
        if (first.area() == second.area()) {
            System.out.println("They are of equal size");
        } 
        
        else 
        {
            System.out.println("They are not of equal size");
        }
    }
}
