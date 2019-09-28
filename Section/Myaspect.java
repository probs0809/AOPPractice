public aspect Myaspect{
    //pointcut pt1() :(call(void Section.setCode(..)));
    pointcut pt1() :(execution(int Section.getCount()));
    //pointcut pt1() :(execution(* SectionMain.*(..)));

    pointcut pt2() : (call(* Section.getCount(..)));
    before() : pt2(){
        
    }
    before() : pt1(){
        System.out.println("Going to call input method");
    }

    after() : pt1(){
        System.out.println("after Calling input method");
    }
}