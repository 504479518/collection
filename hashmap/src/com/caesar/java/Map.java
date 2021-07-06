package com.caesar.java;

public interface Map <K,V>{
    V put(K k,V v);
    V get(K K);
    int size();

    interface Entry<K, V> {
        K getKey();
        V getValue();
    }

}
