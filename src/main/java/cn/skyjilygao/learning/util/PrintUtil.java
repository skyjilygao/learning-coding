package cn.skyjilygao.learning.util;

/**
 * 打印工具类
 * @author skyjilygao
 * @date 20201016
 */
public class PrintUtil {
    /**
     * 打印数组
     * @param objs
     * @return
     */
    public static String arrayInt(int[] objs){
        StringBuffer sb = new StringBuffer("[");
        for (Object obj : objs) {
            if(sb.length() > 1){
                sb.append(", ");
            }
            sb.append(obj);
        }
        sb.append("]");
        return sb.toString();
    }
}
