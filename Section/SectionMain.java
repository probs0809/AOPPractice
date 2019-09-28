class Section{
    String code;
    int block;
    String section;
    int count;

    void setCode(String code){
        this.code = code;
    }

    void setBlock(int block){
        this.block = block;
    }

    void setSection(String section){
        this.section = section;
    }

    void setCount(int count){
        this.count = count;
    }

    void getCode(){
        System.out.println("The code is " + code);
    }

    void getBlock(){
        System.out.println("The Block is " + block);

    }

    void getSection(){
        System.out.println("The Section is " + section);

    }

    int getCount(){
        System.out.println("The Count is " + count);
        return 0;
    }

}

public class SectionMain{
    public static void main(String args[]){
        Section sec = new Section();
        sec.setBlock(38);
        sec.setCode("D");
        sec.setCount(50);
        sec.setSection("D1918");

        sec.getBlock();
        sec.getCode();
        sec.getCount();
        sec.getSection();
    }
}
