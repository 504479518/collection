package com.caesar.java;

/**
 * @author Administrator
 *
 */
public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("xiaotiancai","xiaobaitian");
        map.put("xiaotiancai1","xiaobaitian1");
        System.out.println(map.get("xiaotiancai"));
        System.out.println(map.get("xiaotiancai1"));
    }
}
