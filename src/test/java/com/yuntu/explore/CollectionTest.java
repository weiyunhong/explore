package com.yuntu.explore;

import org.springframework.util.SerializationUtils;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionTest {

    void m1(){
        List<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        Vector v = new Vector();

        Set<String> treeSet = new TreeSet<String>();

        Map<String,String> map = new HashMap<String,String>();
        map.entrySet();

        Map<String,String> hashTable = new Hashtable<String,String>();
        hashTable.put("","");

        Map<String,String> linkedHashMap = new LinkedHashMap<String,String>();
        linkedHashMap.put("","");

        Map<String,String> cmap = new ConcurrentHashMap<String,String>();

        Map<String,String> treeMap = new TreeMap<String,String>();

        Object o = new Object();

        String[] strArr = new String[10];
        Arrays.sort(strArr);

        Collections.sort(list);

    }
    public static void main(String[] args) {
        /*System.out.println(10>>1);
        System.out.println((4 - 1) & 5);*/
        /*Set<String> set = new HashSet<String>();
        set.add("a");*/
        int n = 2;
        System.out.println(n |= n >>> 1);

        CollectionTest c = new CollectionTest();
        try {
            c.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

    class c1 implements Cloneable {
        String str = "abc";
        //SerializationUtils.serialize(c1);
        c1 c = new c1();

    }
}
