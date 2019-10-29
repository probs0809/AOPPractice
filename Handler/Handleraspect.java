aspect Handleraspect{

    pointcut AEhandler() : handler(ArithmeticException);

    before() : AEhandler(){
        System.out.println("Dont enter 0 as denominator");
    }

    pointcut NFhandler() : handler(NumberFormatException);

    before() : NFhandler(){
        System.out.println("Dont Enter double");
    }

    pointcut AIOBhandler() : handler(ArrayIndexOutOfBoundsException);

    before() : AIOBhandler(){
        System.out.println("Check Index of array");
    }
}