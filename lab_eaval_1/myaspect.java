import java.util.Scanner;

public aspect myaspect{

    Scanner s = new Scanner(System.in);

    pointcut query() : (call(void Seminar.Submit_Consent(..)));
    
    before() : query(){
        System.out.println("**Are you sure you want to submit consent? ");
        char a = s.next().charAt(0);
        if(a == 'y'){
            System.out.println("**Consent given ");

        }
        else if(a == 'n'){
            System.out.println("**Consent not given ");
        }
    }

    pointcut typeChange() : (call(void Seminar.Change_Type(String)));

    before() : typeChange(){
        System.out.println("**Changing type");
    }

    pointcut denyConsent() : (call(void Seminar.Deny_Consent(int)));

    before() : denyConsent(){
        System.out.println("**Denying consent");
    } 

    after() : denyConsent(){
        System.out.println("**Consent denied");
    } 

    pointcut details() : (call(void Seminar.Show_Detail()));
    
    before() : details(){
        System.out.println("**Showing details: ");

    }
}