aspect MyAspect{
    int Details.var2 = 10;
    
    public void Details.update_v1(int v1){
        var1 = v1;
    }

    public void Details.update_v2(int v2){
        var2 = v2;
    }

    public void Details.update_v3(String v3){
        var3 = v3;
    }
    
    public void Details.show_v3(){
        System.out.println("Var1 in aspect is:: "+var1);
        System.out.println("Var2 in aspect is:: "+var2);
        System.out.println("Var3 in aspect is:: "+var3);
    }


    
}