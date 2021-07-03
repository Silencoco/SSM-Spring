package com.laj;

import java.util.Arrays;

public class demo{
    public static void main(String[] args) {
//        int[] arr = {1,11,4,2,6,23,32};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        Student[] students = {
                new Student("张三",12),
                new Student("李四",15),
                new Student("王五",2)
        };
        Arrays.sort(students);
        for(Student stu:students){
            System.out.println("姓名："+stu.getName()+"\t年龄："+stu.getAge());
        }
    };
}
