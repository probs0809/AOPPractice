//evaluate cgpa
/*return decision */

class Promote{
    String name;
    String section;
    double cgpa = 0;
    int year = 0;

    public void appoint(String name, String section,double cgpa,int year){
        this.name = name;
        this.section = section;
        this.cgpa = cgpa;
        this.year = year;
    }

    public double evaluate(String name, String section, double cgpa){
        this.cgpa = cgpa;
        return this.cgpa;        
    }

    public String decision(String name){
        if(cgpa > 6.0){
            year++;
            return "Yes";
        }
        return "No";
    }

    public void Show_status(){
        System.out.println("Name: "+ name);
        System.out.println("Section: "+ section);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Year: " + year);
    }

}

class Honors{
    public static String Show_status(Promote p){
        System.out.println("Name: "+ p.name);
        System.out.println("Section: "+ p.section);
        System.out.println("CGPA: " + p.cgpa);
        System.out.println("Year: " + p.year);
        if(p.cgpa > 9.0){
            System.out.println(p.name + " is eligible");
            return "Yes";

        }
        else{
            System.out.println(p.name + " is not eligible");
            return "No";

        }
    }
}

public class PromoteMain{
    public static void main(String[] args) {
        Promote p = new Promote();
        p.appoint("Prabodh", "D1918", 7.8, 1);
        p.evaluate("Prabodh", "D1918", 9.8);
        p.decision("Prabodh");
        p.Show_status();
        Honors.Show_status(p);
    }
}