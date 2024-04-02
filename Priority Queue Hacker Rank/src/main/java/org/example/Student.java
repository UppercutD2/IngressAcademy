package org.example;


public class Student {

    int id;
    String name;
    double cgpa;

   public Student(int id, String name, double cgpa)
    {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID()
    {return this.id;}

    public String getName()
    {return this.name;}

    public double getCGPA()
    {return this.cgpa;}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
