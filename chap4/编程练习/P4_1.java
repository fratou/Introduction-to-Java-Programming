// date:17.3.22
// author: linyang <linyang@xiaomi.com>
// 重复加法

import java.util.Scanner;

public class P4_1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int okNum = 0;
        long beginMs = System.nanoTime(); //nanoTime获取的时间单位为ns纳秒,System.nanoTime提供相对精确的计时，但是不能用他来计算当前日期
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 15); //Math.Random()函数能够返回带正号的double值，该值大于等于0.0且小于1.0
            int b = (int) (Math.random() * 15);
            System.out.println(a + "+" + b + "=？");
            int answer = in.nextInt();
            if (answer == (a + b))  {
                okNum++;
            }
        }
        
        long endMs = System.nanoTime();
        System.out.println("测试时间--" + (double)(endMs - beginMs)/1000/1000/1000 + "s");
        System.out.println("正确答案个数--" + okNum);
        in.close();
    }
}