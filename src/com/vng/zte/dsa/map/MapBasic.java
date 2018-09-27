/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vng.zte.dsa.map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nhantt4
 */
public class MapBasic {
    public static void main(String args[])
    {
        Map<Integer,String> studentMap = new HashMap<Integer,String>();
    
        studentMap.put(1, "Nhan");
        studentMap.put(2, "Minh");
        studentMap.put(3, "Tung");
        studentMap.put(4, "Khang");        
        
        
        
        System.out.println(studentMap);
        
        for(Map.Entry<Integer,String> entry: studentMap.entrySet())
            System.out.println(entry.getKey() + "---------" + entry.getValue());

        // Trùng key thì lấy giá trị sau
        studentMap.put(3, "Hoang");
        
        if(studentMap.containsKey(3))
        {
            System.out.println("Đã tồn tại key 3");
        }
        else{
            studentMap.put(3, "Toan");
        }
        
        
        System.out.println("============================");
         for(Map.Entry<Integer,String> entry: studentMap.entrySet())
            System.out.println(entry.getKey() + "---------" + entry.getValue());       
        
        System.out.println("============================");
        //Remove Key
        studentMap.remove(2);
        for(Map.Entry<Integer,String> entry: studentMap.entrySet())
            System.out.println(entry.getKey() + "---------" + entry.getValue());
    }
}
