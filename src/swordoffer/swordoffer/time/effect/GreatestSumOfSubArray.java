package swordoffer.time.effect;

public class GreatestSumOfSubArray {
    /**
     * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大
     * 和,当向量全为正数的时候,问题很好解决。但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
     * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。给一个数组，返回它的最大连续子序列的和，
     * 你会不会被他忽悠住？(子向量的长度至少是1)
     * @param args 参数
     */
    public static void main(String[] args) {
        int[] test0 = new int[]{6,-3,-2,7,-15,1,2,2};
        System.out.println("test 0 = " + FindGreatestSumOfSubArray(test0));
        System.out.println(FindGreatestSumOfSubArray(null));
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        // 非空校验
        if (null == array || 0 == array.length) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int i=0 ; i< array.length; i++) {
            if (cur < 0) {
                cur = array[i];
            } else {
                cur = cur + array[i];
            }
            if (cur > max)
                max = cur;
        }
        return max;
    }
}