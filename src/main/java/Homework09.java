/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Joshua Sherry
 */
public class Homework09 {

    public static void main(String[] args) {
        findTriangleNumByFactors(100);
    }

    public static int findTriangleNumByFactors(int factorAmount) {
        int factorCount = 0;
        int i=0;
        while(factorCount<=factorAmount) {
            i++;
            factorCount = countFactors(triangleNum(i));
        }
        System.out.println("\n" + triangleNum(i) + " is the first triangle number that has "+ factorAmount +" or more factors. " + "("+factorCount+")");
        return triangleNum(i);
    } // use 'triangleNum' as an argument for the 'countFactors' method and keep iterating until 'factorCount' surpasses the target 'factorAmount' (100).

    public static int triangleNum(int num) {
        return (num*(num+1))/2;
    } // formula for calculating triangle numbers.

    public static int countFactors(int num) {
        int count = 0;
        //System.out.print(num+": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                //System.out.print(i+" ");
                count++;
            }
        }
        //System.out.print("\n");
        return count;
    } // iterate from 1 to n and count how many numbers evenly divide in the target 'num'.
}
