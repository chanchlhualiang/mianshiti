/**
 * 公  司:
 * 文件名: Num2
 * 创建者: Chan
 * 时  间: 2019/3/25 16:55
 * 描  述:
 */


package programPack1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 给出一个32位的有符号整数,你需要将这个整数中每位上的数字进行反转.
 * 示例1:123  >>>>>  321
 * 示例2:-123 >>>>>  -321
 * 示例3:120  >>>>>   21
 * <p>
 * <p>
 * 假如我们的环境只能存贮得下32位的有符号整数,则其数值范围为[-2^31,2^31-1],
 * 请根据这个假设,如果反转后整数溢出,那么返回0
 */
public class Num2 {
    public static void main(String[] args) {
        int num1 = 125;
        int num2 = -1252222229;
        int num3 = -125222;
        int num4 = -125222;
        int num5 = -4555;
        int reserveNum = reserve(num3);
        System.out.println(reserveNum);
    }

    private static int reserve(int num) {
        String numStr = num + "";
        if (numStr.startsWith("-")) {
            String[] split = numStr.split("-");
            numStr = split[1];
        }

        String reverse = new StringBuilder(numStr).reverse().toString();

        int dealNum = 0;
        try {
            dealNum = Integer.parseInt(reverse);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }


        return dealNum;
    }

}
