/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loak.mathutil.core;

/**
 *
 * @author ASUS ROG
 */
// class này sẽ chứa 1 loạt các hàm static dùng để làm thư viện cho các nơi khác dùng
public class MathUtility {
    public static final double Pi= 3.14;
    // C# public const double Pi = 3.14;
    // hàm tính n! = 1.2.3...n
    // 0! = 0! = 1 - quy ước
    // n! tăng rất nhanh, 20! vừa đủ full kiểu long 18 số 0
    // vậy 21! ko chưa trong long được, tràn kiểu dữ liệu
    //quy ước < 0! và > 20! ném ngoại lệ, hok tính dc
//        public static long getFactorial(int n){
//        if (n < 0 || n > 20 )
//            throw new IllegalArgumentException("Invalid n. n must be 0..20");
//        if (n == 0 || n == 1)
//            return 1; // kết thúc sớm nếu có thể 
//        long result = 1; // biến tích lũy, gom dồn việc nhân, biến con heo đất 
//                         //acc accumulation
//        // sống sót đến for, sure n =2..20
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//                 
//    }
    //5! =1.2.3.4.5
    //5! = 4! * 5 = 5x4
    //4! = 1.2.3.4
    //đệ quy luôn phải dừng
    // N! = N X (N - 1) đệ quy là gọi lại chính mình với quy mô nhỏ hơn
    //
        public static long getFactorial(int n){
        if (n < 0 || n > 20 )
            throw new IllegalArgumentException("Invalid n. n must be 0..20");
        if (n == 0 || n == 1)
            return 1; // kết thúc sớm nếu có thể 
        
        return n * getFactorial(n-1);
        // Dùng đệ quy 
        // kĩ thuật kiểm thử gọi là regession testing kiểm thử hồi quy - test lại những thứ đã từng test
        // Trong thực tế làm dự án, code của ta sẽ liên tục đc chỉnh sửa vì:
        // Fix bug thì phải sửa code, sửa hàm, thêm hàm, thêm tính năng. tối ưu hàm cũ gọn hơn, dễ đọc hơn, chạy nhanh hơn
        // Hàm đang ngon - màu xanh, nếu ta sửa hàm vì lí do gì đó 
        // liệu rằng hàm còn xanh hay ko, thì phải text lại 
        // nếu test = tay, bằng logic thì phải cực kì tốn thời gian, mất sức, nếu code của ta có sẵn test script - code kiểm thử
        // ta chỉ việc run lại cái test script này 
        // nếu hàm sửa ngon, nó phải ra màu xanh
        // nếu hàm sửa ko ngon, bị màu đỏ
        // nhờ test script ta vẻify lại 1 hàm rất nhanh -> kiểm thử lại
        // thứ đã từng kiểm thử để dẩm bảo nó còn ngon so với trước khi sửa dc gọi là kiểm thử hồi quy
        // nhờ CI, hồi quy liên tục 
        // Bài này mình thử gồi quy = bằng cách sửa lại hàm theo thuật toán
        // đệ quy - recursion
        
    }
}
