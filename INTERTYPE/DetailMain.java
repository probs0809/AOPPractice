class Details{
    int var1;
    String var3;
    Details(int v1,int v2, String v3){
        this.var1 = v1;
        this.var2 = v2;
        this.var3 = v3;
    }

    public void show(){
        show_v4();
    }
}

public class DetailMain{
    public static void main(String[] args) {
        Details D1 = new Details(10, 20, "ABC");
        D1.show();
        D1.update_v1(10);
        D1.update_v2(10);
        D1.update_v3("qwertyui");
        D1.show_v3();
        D1.show();

       
    }
}