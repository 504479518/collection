package com.caesar.java.node;

/**
 * @author qings
 */
public class Node {
    public Node next;
    private Object data;

    public Node(Object data) {
        this.data = data;
    }

    //链表：链表是一种物理存储单元上非连续、非顺序的存储结构
    //特点：插入、删除时间复杂度O(1) 查找遍历时间复杂度O(N)  总结：查询快  修改慢
    public static void main(String[] args) {
        Node head = new Node("天才小熊猫");
        head.next = new Node("张二河");
        head.next.next = new Node("张二河他爹");
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
    }
}
