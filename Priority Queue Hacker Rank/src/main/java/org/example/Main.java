package org.example;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = 12;
        List<String> events = new ArrayList<>();

        System.out.println("Hello world");

        try {

            Scanner scanner = new Scanner(new File("C:\\Users\\Tima\\IdeaProjects\\Hitler\\src\\Students"));
            System.out.println(scanner.nextLine());
            while (totalEvents-- != 0 && scanner.hasNextLine()) {

                String event = scanner.nextLine();

                events.add(event);
            }

            List<Student> students = priorities.getStudents(events);

            if (students.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                for (Student st : students) {
                    System.out.println(st.getName());
                }
            }
        }
        catch(Exception ex)
        {

        }
    }





}


