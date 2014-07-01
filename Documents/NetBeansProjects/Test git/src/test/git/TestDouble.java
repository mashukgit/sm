/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test.git;

/**
 *
 * @author Mashuk
 */
public class TestDouble {
    public static void main(String[] args) {
        String decimalPattern = "([0-9]*)\\.?([0-9]*)";
        String dd = "10";
        System.out.println(dd.matches(decimalPattern));
    }
}
