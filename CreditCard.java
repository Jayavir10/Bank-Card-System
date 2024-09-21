/**
 * Description: 
 * This class is also a subclass of BankCard class which inherits the properties of BankCard class. It has 6 private attributes.
 * It also has a constructor which accepts 8 parameters(cardID, clientName, issuerBank, bankAccount, balanceAmount, CVCnumber, InterestRate, ExpirationDate)
 * It has 6 getter method which returns the value of its corresponding private attribute of the class. 
 * It has one setter method with parameters which updates the values for its corresponding attribute when the values are passed in the parameters. 
 * The setter method also has a condition in which if the CreditLimit is less than or equal to the 2.5 times the balanceAmount then only the credit will be
   granted.
 * It has a CancelCreditCard method which cancels the credit card by setting the value of CVCnumber, CreditLimit, GracePeriod to zero and hasWithdrawn to false.
 * The display method also has a condition in which if the credit has been granted then it displays the same details as of Bank Card display method by 
   calling the display method of the BankCard class along with the value of the CreditLimit and GracePeriod.
 *
 * @author (Jayavir Basnet)
 * @Java version (19.0.1)
 */

public class CreditCard extends BankCard  //Class name which is a subclass of BankCard
{
    //Private Attributes:
    /*
     * This class has 6 private attributes:
     * Each attributes are private with their data type and the attribute name.
     */
    
    private int CVCnumber;                          //private attribute CVCnumber with integer data type
    private double CreditLimit;                     //private attribute CreditLimit with double data type
    private double InterestRate;                    //private attribute InterestRate with double data type
    private String ExpirationDate;                  //private attribute ExpirationDate with String data type
    private int GracePeriod;                        //private attribute GracePeriod with integer data type
    private boolean isGranted;                      //private attribute isGranted with boolean data type
    
    //Constructor:
    /*
     * It accepts 8 parameters which are cardID, clientName, issuerBank, bankAccount, balanceAmount, CVCnumber, InterestRate, 
       ExpirationDate.
     * It calls the constructor and setter method setclientName and setbalanceAmount of BankCard class
     * Then it assigns the attribute CVCnumber, InterestRate, ExpirationDate with the parameter values and sets the attribute isGranted to false
     */
    
    //Constructor with 8 parameters
    public CreditCard(int cardID, String clientName, String issuerBank, String bankAccount, double balanceAmount, int CVCnumber, double InterestRate, 
    String ExpirationDate)
    {
        super(balanceAmount, cardID, bankAccount, issuerBank);      //Calling the constructor of BankCard class
        super.setclientName(clientName);                            //Calling the setter method of BankCard class and passing the parameters
        super.setbalanceAmount(balanceAmount);                      //Calling the setter method of BankCard class and passing the parameters
        this.CVCnumber = CVCnumber;                                 //Assigning the attribute CVCnumber with the parameter value
        this.InterestRate = InterestRate;                           //Assigning the attribute InterestRate with the parameter value
        this.ExpirationDate = ExpirationDate;                       //Assigning the attribute ExpirationDate with the parameter value
        this.isGranted = false;                                     //Assigning the attribute hasWithdrawn to false
    }
    
    
    //Accessor Method:
    /*
     * Private attributes can be accessed through this method.
     * There are 6 getter method in this class for each private attribute.
     * Each method returns the value of its corresponding private attribute.
     */
    
    public int getCVCnumber()
    {
        return this.CVCnumber;                                  //Returns the value of the attribute CVCnumber
    }
    public double getCreditLimit()
    {
        return this.CreditLimit;                                //Returns the value of the attribute CreditLimit
    }
    public double getInterestRate()
    {
        return this.InterestRate;                               //Returns the value of the attribute InterestRate
    }
    public String getExpirationDate()
    {
        return this.ExpirationDate;                             //Returns the value of the attribute ExpirationDate
    }
    public int getGracePeriod()
    {
        return this.GracePeriod;                                //Returns the value of the attribute GracePeriod
    }
    public boolean getisGranted()
    {
        return this.isGranted;                                  //Returns the value of the attribute isGranted
    }

    
    //Mutator method to set the credit limit:
    /*
     * This method updates the value for its corresponding private attribute when the value is passed in the parameter.
     * It accepts two parameter CreditLimit and GracePeriod along with the condition in which if the credit limit less than or equal to the 2.5 times the 
       balanceAmount then only the credit will be granted.
     * If the condition is met then it assigns the attribute CreditLimit and GracePeriod with the parameter values and sets the attribute isgranted to true
       and also prints a message stating "Credit Granted"
     * If the credit limit is more than 2.5 times the balance amount then it prints a message stating "Credit cannot be issued".
     */
    
    //Setter method with no return type and with a parameter CreditLimit with double and GracePeriod with integer data type
    public void setCreditLimit(double CreditLimit, int GracePeriod) 
    {
        if(CreditLimit <= 2.5*super.getbalanceAmount())             //If the credit limit is less than or equal to 2.5 times the balance amount
        {
            this.CreditLimit = CreditLimit;                         //Assigns the private attribute CreditLimit with parameter value
            this.GracePeriod = GracePeriod;                         //Assigns the private attribute GracePeriod with parameter value
            this.isGranted = true;                                  //Sets the attribute isGranted to true
            System.out.println("Credit Granted");                   //Output
        }
        else
        {
            System.out.println("Credit cannot be issued");          //Output
        }
    }
    
    
    //CancelCreditCard Method:
    /*
     * This method cancels the credit card by setting the value of the attributes CVCnumber, CreditLimit, GracePeriod to zero and isGranted to false.
     * Then it prints a message stating "Credit Card has been canceled".
     */
    public void CancelCreditCard()                                          //Method with no return type
    {
        this.CVCnumber = 0;                                                 //Sets the value of attribute CVCnumber to zero
        this.CreditLimit = 0;                                               //Sets the value of attribute CreditLimit to zero
        this.GracePeriod = 0;                                               //Sets the value of attribute GracePeriod to zero
        this.isGranted = false;                                             //Sets the value of the attribute isGranted to false
        System.out.println("Credit Card has been cancelled");               //Output 
    }
    
    
    //Method to display the details of CreditCard:
    /*
     * It displays the details of the class and it also has a condition.
     * It first checks whether the credit has been granted or not. If it is granted then it calls the display method of BankCard class which displays the
       details of the BankCard class and additionally it also displays the value of the attribute CreditLimit and GracePeriod along with the text.
     * If the credit has not been granted then it prints a message stating "Credit Card has not been issued"
    */
    public void display()
    {
        if(this.isGranted == true)                      //If the credit has been granted
        {
            super.display();                            //Calling the display method of BankCard class
            System.out.println("Your Credit Limit is "+this.CreditLimit+" and your Grace Period is "+this.GracePeriod+" days.");    //Output
        }
        else
        {
            System.out.println("Credit Card has not been issued");              //Output
        }
    }
}
