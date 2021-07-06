package com.caesar.java;

/**
 * @author Administrator
 */
public class HashMap<K, V> implements Map<K, V> {

    private Entry<K, V> table[] = null;
    int size = 0;

    public HashMap() {
        this.table = new Entry[16];
    }

    /**
     * 通过key hash算法计算hash值
     * index下标数组 当前下标对象
     * 判断当前对象是否为空，如空，直接存储对象
     * 如果不为空，hash冲突，next链表解决冲突
     * 返回当前节点
     *
     * @param k
     * @param v
     * @return
     */
    @Override
    public V put(K k, V v) {
        int index = hash(k);
        Entry<K, V> entry = table[index];
        if (null == entry) {
            table[index] = new Entry(k, v, index, null);
            size++;
        } else {
            table[index] = new Entry(k, v, index, entry);
        }
        return table[index].getValue();
    }

    private int hash(K k) {
        int index = k.hashCode() % 16;
        return index > 0 ? index : -index;
    }

    /**
     * 通过Key 进行hash
     * index  小标数组对象
     * 判断当前对象是否为null 如果不为空
     * 判断是否相等 如果不相等
     * 判断next是否为空，如果不为空
     * 判断是否相等，知道相等或者为空
     * 返回结果
     *
     * @param k
     * @return
     */
    @Override
    public V get(K k) {
        if (size == 0) {
            return null;
        }
        int index = hash(k);
        Entry<K, V> entry = findValue(table[index], k);
        return null == entry ? null : entry.getValue();
    }

    private Entry<K, V> findValue(Entry<K, V> entry, K k) {
        if (k.equals(entry.getKey()) || k == entry.getKey()) {
            return entry;
        } else {
            if (null != entry.next) {
                return findValue(entry, k);
            }
        }
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    class Entry<K, V> implements Map.Entry<K, V> {
        K k;
        V v;
        int hash;
        Entry<K, V> next;


        public Entry(K k, V v, int hash, Entry<K, V> next) {
            this.k = k;
            this.v = v;
            this.hash = hash;
            this.next = next;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }
    }
}
