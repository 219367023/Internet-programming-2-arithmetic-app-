/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

/**
 *
 * @author Jacob
 */
public class ArithmeticOperations implements ArithmeticOperationsInterface{

    @Override
    public int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    @Override
    public int determinRemainder(int num1, int num2) {
        int remainder = num1%num2;
        return remainder;
    
    }
    
}
