/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loak.mathutil.main;

import com.loak.mathutil.core.MathUtility;

/**
 *
 * @author ASUS ROG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test case 1
        int n = 0; // given n = 0, ý muốn là tính 0!
        long expected = 1; //ý muốn là hàm n! phải trả về 1
        long actual = MathUtility.getFactorial(n); // ý nói hàm chạy ra mấy, invoke, call
        System.out.println(n + "! -> expected: " + expected
                + " | actual = " + actual);
        // Test case 2:
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! -> expected: " + expected
                + " | actual = " + actual);
        // Test case 3:
        System.out.println("5! -> expected: 120"
                + " | actual = " + MathUtility.getFactorial(5));
    }

}
// TEST CASE 3: Verify getFactorial (with n = 5)
// STEPS/PROCEDURES:
//      1. Give n = 5;
//      2. Call/invoke getFactorial(n = 5)

// EXPECTED RESULT:
//      themthode must return 120 in case of 5!
// Status: Passed|Failed
// TEST CASE 2: Verify getFactorial (with n = 1)
// STEPS/PROCEDURES:
//      1. Give n = 1;
//      2. Call/invoke getFactorial(n = 1)
// EXPECTED RESULT:
//      themthode must return 1 in case of 1!
// Status: Passed|Failed
// Mình là dev, mình phải test code của mình ngon trc đã
// muốn test code (DEV) hay test app (QC/TESTER) thì cần phải chuẩn bị test case
// TEST CASE - tình huống kiểm thử, trường hợp kiểm thử - cách ta kiểm thử
// trong 1 ngữ cảnh nào đó - bàn về bộ data
// 1 test case có cấu trúc như sau:
// ID | Description | Steps/Procedures | Expected Result | Status (Passed/Failed)
// Dev em muốn kiểm thử coi hàm chính em viết getFactorial() đúng hay sai
// thì em phải thiết kế các test case
// Test case 1: Verify getFactorial(with n = 0)
// Steps - Procedures: các bước để run app
//      1. Given n = 0;
//      2. Execute/Call/Invoke function getFactorial(0)
// Expected result: the function must return 1 (standing for 0! = 1)
// Status: PASSED, or FAILED, ai biết, chờ run app/hàm cái đã
// Run hàm, run app, đưa test data vào, được gọi là test run 
