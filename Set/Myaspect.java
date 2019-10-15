aspect Myaspect{
    pointcut p1():set(int Book.pages);
    after() : p1(){
        System.out.println("pages set");
    }

    pointcut p2():set(int Book.price);
    after() : p2(){
        System.out.println("price set");
    }

    pointcut p3():set(String Book.author);
    after() : p3(){
        System.out.println("author set");
    }
}