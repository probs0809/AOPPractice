aspect Myaspect{
    // pointcut p1():set(int Book.pages);
    // after() : p1(){
    //     System.out.println("pages set");
    // }

    // pointcut p2():set(int Book.price);
    // after() : p2(){
    //     System.out.println("price set");
    // }

    // pointcut p3():set(String Book.author);
    // after() : p3(){
    //     System.out.println("author set");
    // }

    pointcut p4():get(* Book.*);
    pointcut p5():set(* Book.*);
    
    before() : p4(){
        System.out.println("The value of");

    }

    after() : p5(){
        System.out.println("Value Initialised ");
    }

}