class DetailOne{
    int var1;
    int var2;

    DetailOne(int x, int y){
        var1 = x;
        var2 = y;
    }

    void show_one(){
        System.out.println("Var1 : "+var1+",Var2 : "+var2);
    }
}

class DetailTwo{
    int var3;
    int var4;

    DetailTwo(int x, int y, int a, int b){
        super(x,y);
        var3 = a;
        var4 = b;
    }

    void show_Two(){
        System.out.println("Var1 : "+var1+",Var2 : "+var2+",Var3 : "+var3+",Var4 : "+var4);
    }
}

class DetailMain{
    public static void main(String[] args) {
        
    }
}