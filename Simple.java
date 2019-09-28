/*
inbuild java class mains always starts with a capital letter.
*/

class Cls{
    private String name;
    private int age;
    private double cgpa;

    Cls(String name, int age, double cgpa){
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    /*
    public void setData(String name, int age, double cgpa){
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }
    */


    public void getData(){
        System.out.println("The Name is " + name);
        System.out.println("The age is " + age);
        System.out.println("The CGPA is " + cgpa);
    }
} 


public class Simple{
    public static void main(String args[]){
        Cls obj = new Cls("Prabodh", 21, 8.8);
//      obj.setData("Prabodh", 21, 8.8);
        obj.getData();
    }
}