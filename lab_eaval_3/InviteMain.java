class Invite{
    int id;
    String name;
    
    void invite(int id, String name){
        this.id = id;
        this.name = name;
    }

    void serve(int serve_id){
        this.id = serve_id;
        System.out.println("Serving: "+id);
    }

    void seeoff(int outid){
        this.id = outid;
        System.out.println("id: " + id + "is leaving");
    }
}

class InviteMain{
    public static void main(String[] args) {
        Invite i = new Invite();
        i.invite(100, "Prabodh");
        i.serve(100);
        i.seeoff(100);
    }
}