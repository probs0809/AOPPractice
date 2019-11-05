
class Investment{
    int id;
    int investment_amount;
    static int request_count[] = new int[5];
    static int i = 0;
    public void request(String id ,int investment_amount ,int request_count){
        this.id = Integer.parseInt(id);
        this.investment_amount = investment_amount;
        this.request_count[i++] = request_count;
        // System.out.println("Department id is " + this.id);
        // System.out.println("invest amount is " + this.investment_amount);
        // System.out.println("request count is " + this.request_count[this.i]);

    }  
}

public class Main {

    public static void main(String[] args) {
         
        
        try {
            
            new Investment().request("1", 1000, 1);
            new Investment().request("2", 1000, 2);
            new Investment().request("3", 1000, 3);
            new Investment().request("4", 1000, 4);
            new Investment().request("5", 1000, 5);
            
            //Following line is to generate maximum no exception
            new Investment().request("6", 1000, 6);
            ///following line will give name exception
            //new Investment().request("CAP", 1000, 5);
            int x = 10/Investment.request_count[0];
            //commenting above all lines will generate "No requests Exception"
        } catch (ArrayIndexOutOfBoundsException e) {
            
        }catch(NumberFormatException e){

        }catch(ArithmeticException e){

        }
        
        
    }
}