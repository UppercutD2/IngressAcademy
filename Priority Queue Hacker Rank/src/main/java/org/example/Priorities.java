package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Priorities {

    public List<Student> getStudents(List<String> events) {

        List<Student> collect = new ArrayList<>();
        for (String s : events) {
            List<String>  input= new ArrayList<>(Arrays.stream(s.split(" ")).toList());//ENTER[0] John[1] 3.75[2] 50[3]
            System.out.println(input.size());
            for(String s1 : input)
            {
                int l = s1.length();
                if(l<1)
                {
                    input.remove(s1);
                }
            }
            if(input.size()>1)
            {    int id = Integer.parseInt(input.get(3));
                String name = input.get(1);
                double cgpa = Double.parseDouble(input.get(2));

                Student stud = new Student(id,name,cgpa);
                collect.add(stud);
            }
            }
        System.out.println(collect.size());
        System.out.println(collect.get(0).toString());

        return collect;

        }





    }
