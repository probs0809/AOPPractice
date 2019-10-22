aspect request{                                 //Precedence level 1
    pointcut p1() : call(* Invite.*(..));
    before() : p1(){
        System.out.println("**Before Request Mode 1");
    }

    after() : p1(){
        System.out.println("**After Request Over 1");
    }
}

aspect acknowledge{                             //Precedence level 2
    pointcut p2() : call(* Invite.*(..));
    before() : p2(){
        System.out.println("**Before acknowledge: before advice for acknowledegment 2");
    }

    after() : p2(){
        System.out.println("**After Acknowledge: After advice for acknowledegment 2");
    }
}

aspect confirm{                                 //Precedence level 3
    pointcut p3() : call(* Invite.*(..));
    after() : p3(){
        System.out.println("**After Confirmation 3");
    }

    before() : p3(){
        System.out.println("**Before Confirmation 3");
    }
}

aspect feedback{                                //Precedence level 4
    pointcut p4() : call(* Invite.*(..));
    after() : p4(){
        System.out.println("**After Feedback 4");
    }

    before() : p4(){
        System.out.println("**Before Feedback 4");
    }
}

aspect MyAspect{
    declare precedence : request, acknowledge, confirm, feedback;
}