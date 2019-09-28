class Seminar{
    private int id;
    private String name;
    private String type;
    public void Submit_Consent(String name, int id , String type){
        this.type = type;
        this.name = name;
        this.id = id;
    }

    public void Change_Type(String type){
        this.type = type;
    }

    public void Deny_Consent(int id){
        
    }

    public void Show_Detail(){
        System.out.println("____________________________________");
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Consent Type: " + this.type);
        System.out.println("____________________________________");


    }
}

public class SeminarMain{
    public static void main(String[] args) {
        Seminar s = new Seminar();
        s.Submit_Consent("Prabodh", 55, "Coming");
        s.Show_Detail();
        s.Change_Type("Not Coming");
        s.Show_Detail();
        s.Deny_Consent(55);
    }
}