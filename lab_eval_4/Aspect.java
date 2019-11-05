public aspect Aspect{
    pointcut NFhandler() : handler(NumberFormatException);

    before() : NFhandler(){
        System.out.println();
        System.out.println("Please enter id instead of name");
    }

    pointcut AIOBhandler() : handler(ArrayIndexOutOfBoundsException);

    before() : AIOBhandler(){
        System.out.println();
        System.out.println("Maximum requests must be less the 5");
    }

    pointcut AEhandler() : handler(ArithmeticException);

    before() : AEhandler(){
        System.out.println();
        System.out.println("No investment requests");
    }

}