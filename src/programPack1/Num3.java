/**
 * 公  司:
 * 文件名: Num3
 * 创建者: Chan
 * 时  间: 2019/3/25 17:36
 * 描  述:
 */


package programPack1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3,给定一个三角形，找出自顶向底的最小路劲和。每一步只能移动到下一行中相邻的结点上。
 * 例:给定三角形；
 * [2]，
 * [3，4]，
 * [6，5，7]，
 * [4，1，8，3]
 * 自面向下的最小路径和为11（即，2+3+5+1=11）。
 * 说明：如果你能够只使用O(n)的额外空间（n为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 */
public class Num3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        list2.add(2);
        list.add(list2);

        int i = minimumTotal(list);
        System.out.println(i);
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int minLen = triangle.get(len-1).size();
        int[] min = new int[minLen+1];
        min[0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            int[] temp = new int[minLen+1];
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int lastLen = triangle.get(i-1).size();
                if (j == 0) {
                    temp[j] = min[j] + triangle.get(i).get(j);
                } else {
                    if (lastLen >= j+1) {
                        temp[j] = Math.min(min[j-1],min[j]) + triangle.get(i).get(j);
                    } else {
                        temp[j] = min[j-1] + triangle.get(i).get(j);
                    }
                }
            }

            min = temp;
        }
        int minValue = min[0];
        for (int i = 1; i < minLen; i++) {
            if (min[i] < minValue) {
                minValue = min[i];
            }
        }
        return minValue;
    }
}
