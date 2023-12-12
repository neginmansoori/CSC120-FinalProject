import java.util.Random; 

/** 
 *  This is the Customer class
 *  Customers are contained in Table which is contained in Restaurant
 */ 
 
public class Customer{

    //attributes
    public String name; //name of customer
    public Food order;  //order of customer
    public Boolean hasQuestion; //Boolean telling if the customer has a question
    public Integer finalTip; //amount of final tip for the table
    
     
    /** 
    *  Constructs a customer
    *  @param name name of customer
    *  @param order order of customer
    *  @param hasQuestion Boolean telling if the customer has a question
    *  @param finalTip amount of final tip
    */
 
    public Customer(String name, Food order, Boolean hasQuestion, Integer finalTip) {
        this.name = name; 
        this.order = order;
        this.hasQuestion = false;
        this.finalTip = 10;
    }


    /** 
    *  accessors
    *  Returns the name of the customer 
    *  @return name : name of the customer
    */

    public String getName(){
        return this.name;
    }
    
    
    /** 
    *  Returns the final tip 
    *  @return finalTip : final tip amount for the waiter
    */

    public Integer finalTip(){
        //accessing the table's total tip 
        return this.finalTip;
    }

    
    /** 
    *  Returns the order with the customer's name 
    *  @return order : order that the customer chose 
    */

    public Food order(){
        //print customers order
        System.out.println(this.name + ": I'll have the " + order.name + ".");
        return order;
    }


    /** 
    *  methods
    *  Customer sits at a table
    *  @param table table that the customer will sit 
    */

    public void sit(Table table){
        table.customers.add(this);
    }


    /** 
    *  Returns the question that the customer chose randomly 
    *  @return chosenQ : question that the customer is asking 
    */

    public String askQuestion(){
        //get random number
        Random rand2 = new Random();
        int randomQ = rand2.nextInt(Restaurant.questionKeys.size());
        
        //picks randomly from the list of questions 
        String chosenQ = Restaurant.questionKeys.get(randomQ);

        return chosenQ;
    }


    /** 
    *  Adds the tip amount to the current tip amount 
    *  @param amount amount of tip that is going to be add
    */

    public void tip(int amount){
        //updates the amount of final tip
        finalTip = finalTip + amount;
    }
}
