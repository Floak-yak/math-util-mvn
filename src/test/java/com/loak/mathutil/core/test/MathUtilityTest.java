/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.loak.mathutil.core.test;

import com.loak.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ASUS ROG
 */
public class MathUtilityTest {
    // Test case #1 Verify getFactorial (With n= 0)
    // Step/Procedures
    //  1. Given n=0
    //   2. Call/invoke getFactorial (n=0)
    // Expectef Result:
    //  The method must return 1 as the result of 0! = 1
    // Status: PASSED | FAILED chờ đến lúc runtime mới biết 
    @Test 
    public void verifyFactorialGivenRightArgument0ReturnOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    @Test 
    public void verifyFactorialGivenRightArgument1ReturnOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    @Test 
    public void verifyFactorialGivenRightArgument5ReturnOk(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
}
