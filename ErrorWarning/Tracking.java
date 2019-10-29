aspect Tracking{
    pointcut unsafe() : call(* Human.getAge(..));
    pointcut chk() : call(* Human.setAge(..));

    declare error : unsafe() : "Print :: this method is not safe";
    declare warning : chk() : "Print :: Enter Age > 18";

    pointcut trackMethods() : execution(* *(..));

    before() : trackMethods(){
        System.out.println("inside tracking before advice");
    }

    after() : trackMethods(){
        System.out.println("inside tracking after advice");
    }
}