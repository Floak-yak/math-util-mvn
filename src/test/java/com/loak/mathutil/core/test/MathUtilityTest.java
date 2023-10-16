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
    // 3 test case treen ko đẹp, bốc mùi vì chỉ khác nhau phần data
    // trong nghề kiểm thử có 1 kĩ thuật đó là tách hẳn data kiểm thử ra
    // 1 chỗ, cho dễ nhìn, dễ quản lí dc data thiếu đủ hay ko
    // sau đó ta đưa bộ data này vào trong câu lệnh so sánh assert()
    // qua các tham số (parameter)
    // tức là asertedquals (expected, actual) là 2 tham số 
    // ứng với bộ data dc tách ra 
    // 120  5!
    // 720  6!
    // 24   4!
    
    // mảng [5][2](0,1) (1,1) (2,2) (3,6)
    // code nhìn gọn, phát hiện dc thiếu đủ test data, test case
    // kĩ thuật tách data kiểm thử ra khỏi câu lệnh so sánh -> được gọi 
    // là DDT - DATA druven testing - kiểm thử theo hướng tách data riêng rẽ
}
