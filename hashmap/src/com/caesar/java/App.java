package com.caesar.java;

/**
 * hashMap的底层算法：哈希算法
 * 哈希算法：也叫散列，把任意长度值（Key）通过散列算法变换成固定长度的key(地址)通过这个地址进行访问数据结构
 * 他通过一个关键码值映射到表中。位置来访问记录，以加快查找的速度
 * <p>
 * <p>
 * hashcode：通过字符串算出它的ascii码，进行mod(取模)，算出哈希表中的下标。
 * 为什么取模？当一串字符串计算出的key=429(地址)过大时，如果不取模，则数组前面的428个元素为空，造成了空间的浪费。
 */
public class App {

    //数组：采用一段连续的存储单元来存储结构
    //特点：查询时间复杂度O(1) 删除从插入时间复杂度O(N)  总结：查询快  修改慢
    public static void main(String[] args) {
        //HashMap<String, String> hashMap = new HashMap<>();
        //执行多少次都是一个hash值，哈希算法遵从一个幂等性
        App hashMap = new App();
        hashMap.put("刘一", "刘一");
        hashMap.put("张二河", "张二河");
        hashMap.put("张三", "张三");
        hashMap.put("李四", "李四");
        hashMap.put("王五", "王五");
        hashMap.put("天才小熊猫", "我是天才小熊猫");
        //System.out.println(hashMap.get("天才小熊猫"));
    }

    public void put(String key, String value) {
        System.out.printf("key:%s:::::::::::hash值:%s::::::::::::存储位置:%s\r\n", key, key.hashCode(), Math.abs(key.hashCode() % 15));
    }
}

