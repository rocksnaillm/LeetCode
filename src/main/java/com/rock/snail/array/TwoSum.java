package com.rock.snail.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 */
public class TwoSum {
    public static void main(String[] args) {
        /*int[] twoSumWay1 = TwoSum.twoSumWay1(new int[]{2, 7, 11, 15}, 26 );
        if(twoSumWay1 == null){
            System.out.println("未找到下标");
        }else {
            for (int i = 0; i < twoSumWay1.length; i++) {
                System.out.println("下标:"+twoSumWay1[i]);
            }
        }*/

        int[] twoSumWay2 = TwoSum.twoSumWay2(new int[]{2, 7, 11, 15}, 9 );
        if(twoSumWay2 == null){
            System.out.println("未找到下标");
        }else {
            for (int i = 0; i < twoSumWay2.length; i++) {
                System.out.println("下标:"+twoSumWay2[i]);
            }
        }
    }

    /**
     *  暴力破解
     */
    public static int[] twoSumWay1(int[] nums, int target) {
        if(nums==null) {return null;}
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if((nums[i] + nums[j]) == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static int[] twoSumWay2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int i1 = target - nums[i];
            if(map.containsKey(i1)){
                return new int[]{map.get(i1),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
