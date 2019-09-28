class School{
    String code;
    int block;

    School(String code, int block){
        this.code = code;
        this.block = block;
    }

    void sch_show(){
        System.out.println("School code: " + code);
        System.out.println("Block: " + block);
    }

}

class Section extends School{
    String section;
    int strength;
    Section(String code, int block, String section, int strength){
        super(code , block);
        this.section = section;
        this.strength = strength;
    }

    void show(){
        System.out.println("The section : " + section);
        System.out.println("The strength : " + strength);
        sch_show();
    }
}

public class SchoolMain{
    public static void main(String args[]){
        Section obj = new Section("D",38,"D1918",50);
        obj.show();
    }
}