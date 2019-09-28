aspect Myaspect{
    pointcut basedOnClassPromote() : (call(* Promote.*(..)));
    before() : basedOnClassPromote(){
        System.out.println("**Function of Promote class is being called**");
    }

    pointcut basedOnClassHonors() : (call(* Honors.*(..)));
    before() : basedOnClassPromote(){
        System.out.println("**Function of Honors class is being called**");
    }

    pointcut genericMessage() : (execution(* *.*(..)));
    before() : genericMessage(){
        System.out.println("**Function is being executed**");

    }

    pointcut appreciationMessage() : (call(String Honors.Show_status(..)));
    after() : appreciationMessage() {
        System.out.println("**Congrats You are eligible for honour**");
    }

}