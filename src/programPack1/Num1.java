package programPack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 公  司:
 * 文件名: Num1
 * 创建者: Chan
 * 时  间: 2019/3/25 16:01
 * 描  述:
 */

/**
 * Java面试题1.给定一个整数数组nums和一个目标值target，请你在该数组中找出和为目标值的个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。示例：给定nums=【2，7，11，15】，
 * target=9因为nums【e】+nums【1】=2+7=9所以返回【e，1】
 * class Solution{public intl twosum（int】nums，int target）{
 */
public class Num1 {
    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
        int[] nums = {2,7,1,8};
        int target=9;
        List<int[]> result = solution(nums,target);
        for (int[] ints : result) {

        }


    }

    private static List<int[]> solution(int[] nums, int target) {
        List array = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            for (int j =1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
//                    array.add(new int[]{nums[i],nums[j]});
                    array.add(new int[]{i,j});
                }

            }
        }
        return array;
    }


}
