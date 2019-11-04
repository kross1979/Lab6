/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab6LandTract;

/**
 *
 * @author kimbe
 */
public class LandTract {

    int length, width;

    int area() {

        return length * width;

    }

    public String toString() {

        return "Length: " + length + " | Width: " + width + " | Area: " + area();

    }
}
