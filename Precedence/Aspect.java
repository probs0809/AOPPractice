aspect req{
    pointcut p1():call(* Invite.*(..));
    before() : p1(){
        System.out.println("Request mode is set to on");
    }
}

aspect accept{
      
    pointcut p2():call(* Invite.*(..));
    before() : p2(){
        System.out.println("Request accepted, you may proceed");
    }
}

aspect metasp{
    declare precedence: req,accept;
}
