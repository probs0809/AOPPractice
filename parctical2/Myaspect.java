public aspect Myaspect{
    pointcut categoryInput() : (call(* Book.input_*(..)));
    after() : categoryInput(){
        System.out.println("Category: Input");
    }

    pointcut datatypeInt() : (call(* Book.*(int)));
    before() : datatypeInt(){
        System.out.println("Datatype: Int");
    }

    pointcut datatypeString() : (call(* Book.*(String)));
    before() : datatypeString(){
        System.out.println("Datatype: String");
    }

    pointcut allMethods() : (call(* Book.output_*()));
    before() : allMethods(){
        System.out.println("Method Called");   
    }
}