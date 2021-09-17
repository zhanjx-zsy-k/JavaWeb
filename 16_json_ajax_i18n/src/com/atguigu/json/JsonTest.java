package com.atguigu.json;

import com.atguigu.pojo.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author k
 * @create 2021-06-14 23:15
 */
public class JsonTest {

    @Test
    public void test1(){
        Person person = new Person(1,"詹俊祥很帅");
        Gson gson = new Gson();

        String personJsonString = gson.toJson(person);

        System.out.println(personJsonString);

        Person person1 = gson.fromJson(personJsonString, Person.class);
        System.out.println(person1);
    }

    @Test
    public void test2(){
        List<Person> personList = new ArrayList<>();

        personList.add(new Person(1,"詹哥"));
        personList.add(new Person(2,"祥哥"));
        Gson gson = new Gson();

        String personListJsonString = gson.toJson(personList);
        System.out.println(personListJsonString);
        List<Person> list = gson.fromJson(personListJsonString,new PersonListType().getType());
        System.out.println(list);
        Person person = list.get(0);
        System.out.println(person);
    }


    @Test
    public void test3(){
        Map<Integer,Person> personMap = new HashMap<>();

        personMap.put(1,new Person(1,"詹哥"));
        personMap.put(2,new Person(2,"祥哥"));

        Gson gson = new Gson();

        String personMapJsonString = gson.toJson(personMap);
        System.out.println(personMapJsonString);

//        Map<Integer,Person> personMap2 = gson.fromJson(personMapJsonString, new PersonMapType().getType());
        Map<Integer,Person> personMap2 = gson.fromJson(personMapJsonString, new TypeToken<HashMap<Integer,Person>>(){}.getType());
        System.out.println(personMap2);
        Person person = personMap2.get(1);
        System.out.println(person);

    }



}
