package cn.skyjilygao.learning.sort;

import cn.skyjilygao.learning.util.PrintUtil;

public class HeapSort {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 2, 8, 10, 3, 0, 1, 1, 9};
        System.out.println(String.format("原始：%s", PrintUtil.arrayInt(nums)));
        heapSort(nums);
        System.out.println("快速排序结果：" + PrintUtil.arrayInt(nums));
    }

    private static void heapSort(int[] nums) {
        // 1. 构建最大堆
        int len = nums.length;
        buildMaxHeap(nums, len);
        for (int i = nums.length - 1; i >= 0; i--) {
            // todo: https://www.cnblogs.com/chengxiao/p/6129630.html
            // todo: https://www.runoob.com/w3cnote/heap-sort.html
        }
    }

    private static void buildMaxHeap(int[] nums, int len) {
        for (int i = (int)Math.floor(len / 2); i >= 0; i--) {
            heapify(nums, i, len);
        }
    }

    private static void heapify(int[] nums, int i, int len) {
        int left = 2 * i + 1;
        int right = 2 * i +2;
        int largest = i;
        if(left < right && nums[left] > nums[right]){
            largest = left;
        }
        if(right < left && nums[left] < nums[right]){
            largest = right;
        }
        if(largest != i){
            swap(nums, i, largest);
            heapify(nums, largest, len);
        }

    }

    private static void swap(int[] nums, int i, int largest) {
        int t = nums[i];
        nums[i] = nums[largest];
        nums[largest] = t;
    }
}
