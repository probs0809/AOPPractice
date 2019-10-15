aspect req{
    pointcut p1():call(* Invite.*(..));
    before() : p1(){
        System.out.println("Request mode is set to on");
    }
}

aspect feedback{
    pointcut p2():call(* Invite.*(..));
    after() : p2(){
        System.out.println("Provide feedback before leaving");
    }
}

aspect metasp{
    declare precedence: req,feedback;
}
