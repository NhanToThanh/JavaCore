/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vng.zte.dsa.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author nhantt4
 */
public class MapAdv {
    public static void main(String args[])
    {
        //HashMap
        //LinkedHashMap
        //TreeMap
        //Hashtable
        
        Map<Integer,String> hashMap = new HashMap<Integer,String>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();
        Map<Integer,String> hashtable = new Hashtable<Integer,String>();
        
        testMap(hashtable);
        
        //Treemap có phương thức sort tự nhiên, tự động sort các key
        //HashMap tự sắp xếp key tăng dần
        //Hashtable tự sắp xếp key giảm dần
        //linkedHashMap nhập sao xuất vậy
        
        
    }
    
    public static void testMap(Map<Integer,String> testMap)
    {
        testMap.put(11, "Ha");
        testMap.put(5, "An");
        testMap.put(6, "Hoa");
        testMap.put(7, "Binh");
        testMap.put(1, "The");
        testMap.put(4, "Gioi");
        testMap.put(3, "My");
        testMap.put(9, "Viet"); 
        testMap.put(0, "Nam");    
        
        //entrySet trả về cặp key-value
        for(Integer key: testMap.keySet())
        {
            String value = testMap.get(key);
            System.out.println(key + "-----------" + value);
        }
    }
    
    
}
