/**
 * Description: 
 * It is a parent class of other two classes debit card and credit card. It has 5 private attributes .
 * It also has a constructor which takes 4 parameters(balanceAmount, cardID, bankAccount, issuerBank) and assigns the parameters with its corresponding 
   attributes. 
 * It has five getter method which returns the value of its corresponding private attribute of the class. 
 * It has 2 setter method which updates the values for its corresponding attribute when the values are passed in the parameters. 
 * Lastly, it has a display method which displays the details of the class such as, client name, card id, bank name, account number and balance amount. 
 *
 * @author (Jayavir Basnet)
 * @Java version (19.0.1)
 */

public class BankCard //Class Name
{
    //Private Attributes:
    /*
     * This class has 5 private attributes:
     * Each attributes are private with their data type and the attribute name
     */
    
    private int cardID;                 //private attribute cardID with integer data type
    private String clientName;          //private attribute clientName with String data type
    private String issuerBank;          //private attribute issuerBank with String data type
    private String bankAccount;         //private attribute bankAccount with String data type
    private double balanceAmount;       //private attribute balanceAmount with double data type
    
    
    //Constructor:
    /*
     * It accepts four parameters which are: balanceAmount with double data type, cardID with integer data type and bankAccount 
       and issuerBank with String data type.
     * It first assigns the attribute clientName as empty string.
     * Then the attributes balanceAmount, cardID, bankAccount and issuer bank is assigned with the parameter values.
     */
    
    public BankCard(double balanceAmount, int cardID, String bankAccount, String issuerBank) //Constructor with 4 parameters
    {
        this.clientName = "";                       //Assigning the attribute as empty string
        this.balanceAmount = balanceAmount;         //Assigning the attribute balanceAmount with the parameter value
        this.cardID = cardID;                       //Assigning the attribute cardID with the parameter value
        this.bankAccount = bankAccount;             //Assigning the attribute bankAccount with the parameter value
        this.issuerBank = issuerBank;               //Assigning the attribute issuerbank with the parameter value
    }
    
    
    //Accessor Method:
    /*
     * Private attributes can be accessed through this method.
     * There are 5 getter method in this class for each private attribute.
     * Each method returns the value of its corresponding private attribute.
     */
    
    public int getcardID()
    {
        return this.cardID;                 //Returns the value of the attribute cardID
    }
    public String getclientName()
    {
        return this.clientName;             //Returns the value of the attribute clientName 
    }
    public String getissuerBank()
    {
        return this.issuerBank;             //Returns the value of the attribute issuerBank
    }
    public String getbankAccount()
    {
        return this.bankAccount;            //Returns the value of the attribute bankAccount
    }
    public double getbalanceAmount()
    {
        return this.balanceAmount;          //Returns the value of the attribute balanceAmount
    }
    
    
    //Mutator method:
    /*
     * This method updates the value for its corresponding private attribute when the values are passed in the parameter.
     * This class has two setter method with parameters, one for the attribute clientName and another for the attribute balanceAmount
     * Then the attribute clientName and balanceAmount is assigned with the parameter values.
     */
    
    public void setclientName(String clientName)            //Setter method with no return type and with a parameter clientName as String data type
    {
        this.clientName = clientName;                       //Assigning the private attribute clientName with the parameter value
    }
    public void setbalanceAmount(double balanceAmount)      //Setter method with no return type and with a parameter balanceAmount as double data type.
    {
        this.balanceAmount = balanceAmount;                 //Assigning the private attribute balanceAmount with the parameter value
    }
    
    
    //display method:
    /*
     * This method displays the details of the class. It has a condition in which,
     * If the clientName is not assigned it prints a message stating "Client Name Required".
     * If the clientName is assigned then else part is executed which prints the value of the attribute clientName, cardID, issuerBank, BankAccount and 
       balanceAmount along with the text. 
     */
    
    public void display()
    {
        if (clientName=="")                                                     //If the clientName is not assigned
        {
            System.out.println("Client Name Required");                         //Output
        }
        else                                                                    //If the clientName is assigned
        {
            System.out.println("Client Name: "+this.clientName);                //Output
            System.out.println("Card ID: "+this.cardID);                        //Output
            System.out.println("Bank Name: "+this.issuerBank);                  //Output
            System.out.println("Account Number: "+this.bankAccount);            //Output
            System.out.println("Balance: "+this.balanceAmount);                 //Output
        }
    }
}