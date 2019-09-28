class Book{
    int pages;
    int price;
    String author;
    
    void input_pages(int pages){
        this.pages = pages;
    }

    void input_price(int price){
        this.price = price;
    }

    void input_author(String author){
        this.author = author;
    }

    void output_pages(){
        System.out.println("No of pages: " + pages);
    }

    void output_price(){
        System.out.println("Price of book: " + price);
        
    }

    void output_author(){
        System.out.println("Name of Author: " + author);

    }
}

public class BookMain{
    public static void main(String args[]) {
        Book b = new Book();
        b.input_author("Abcd Abcs44");
        b.input_pages(500);
        b.input_price(2000);
        b.output_author();
        b.output_pages();
        b.output_price();

    }
}
