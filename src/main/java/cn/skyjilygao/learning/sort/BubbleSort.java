package cn.skyjilygao.learning.sort;

import cn.skyjilygao.learning.util.PrintUtil;

/**
 * 冒泡排序
 * @author skyjilygao
 * @date 20201016
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = new int[]{5,2,8,10,3,0,1,9};
        System.out.println(String.format("原始：%s",PrintUtil.arrayInt(nums)));
        bubbleSort(nums);
        System.out.println("冒泡排序结果："+PrintUtil.arrayInt(nums));
    }

    /**
     * 冒泡排序
     * @param nums
     */
    public static void bubbleSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                System.out.print("i="+i+", j="+j+"\t");
                if(nums[i] > nums[j]){
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                    System.out.print("交换：\t");
//                    System.out.println(PrintUtil.arrayInt(nums));
//                    break;
                }
                System.out.println(PrintUtil.arrayInt(nums));
            }
        }
    }
}
