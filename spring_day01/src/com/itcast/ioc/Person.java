package com.itcast.ioc;

import java.util.*;

public class Person {
    private String pName;

    private String[] arrs;

    public List<String> getPersonList() {
        return personList;
    }


    public void setPersonList(ArrayList<String> personList) {
        this.personList = personList;
    }

    private ArrayList<String> personList;

    public void setMap(HashMap<String, String> map) {
        this.map = map;
    }

    private HashMap<String, String> map;

    private Properties properties;

//    private

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }



    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void say(){
        System.out.println(pName);
    }

    public void testArrs(){
//        for(String s:arrs){
//            System.out.println(s);
//        }
        System.out.println(arrs[1]);
    }

    public void testList(){
//        for(String person:personList){
//            System.out.println(person);
//        }
        System.out.println(personList.get(1));
    }
    public void testMap(){
//        for(Map.Entry<String,String> entry:map.entrySet()){
//            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
//        }
        System.out.println(map.get("03"));
    }
    public void testProps(){
        System.out.println(properties.getProperty("userName"));
    }
}
