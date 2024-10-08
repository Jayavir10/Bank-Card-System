/**
 * Description:
 * It is a subclass of BankCard class which inherits the properties of BankCard class. It has 4 private attributes. 
 * It also has a constructor with 6 parameters(balanceAmount, cardID, bankAccount, issuerBank, clientName, PINnumber)
 * It has 4 getter method which returns the value of its corresponding private attribute of the class.
 * It also has a setter method which updates the value for its corresponding attribute when the value is passed in the parameter. 
 * It has a withdraw method with 3 parameters and also with a condition in which when the amount is withdrawn new balance will be updated and the amount 
   deducted will be showed 
 * The display method displays the same details as of Bank Card display method and if the amount has been withdrawn then it will also display additional 
   details like amount withdrawn and date of withdrawal. 
   
 * @author (Jayavir Basnet)
 * @Java version (19.0.1)
 */

public class DebitCard extends BankCard //Class name which is a subclass of BankCard
{
    //Private attributes:
    /*
     * This class has 4 private attributes:
     * Each attributes are private with their data type and the attribute name 
     */
    
    private int PINnumber;                  //private attribute PINnumber with integer data type
    private int WithdrawalAmount;           //private attribute WithdrawalAmount with integer data type
    private String DateofWithdrawal;        //private attribute DateofWithdrawal with String data type
    private boolean hasWithdrawn;           //private attribute hasWithdrawn with boolean data type
    
    
    //Constructor:
    /*
     * It accepts six parameters
     * It calls the constructor and setter method setclientName of BankCard class
     * The parameterised clientName is then passed in parameter of the setter method
     * Then it assigns the attribute PINnumber with the parameterised PINnumber and assigns the attribute hasWithdrawn to false
     */

    //Constructor with 6 parameters
    public DebitCard(double balanceAmount, int cardID, String bankAccount, String issuerBank, String clientName, int PINnumber)
    {
        super(balanceAmount, cardID, bankAccount, issuerBank);      //Calling the constructor of BankCard class
        super.setclientName(clientName);                            //Calling the setter method of BankCard class and passing the parameter
        this.PINnumber = PINnumber;                                 //Assigning the attribute PINnumber with the parameter value
        this.hasWithdrawn = false;                                  //Assigning the attribute hasWithdrawn to false
    }
    
    
    //Accessor Method:
    /*
     * Private attributes can be accessed through this method.
     * There are 4 getter method in this class for each private attribute.
     * Each method returns the value of its corresponding private attribute.
     */
    
    public int getPINnumber()
    {
        return this.PINnumber;                      //Returns the value of the attribute PINnumber
    }
    public int getWithdrawalAmount()
    {
        return this.WithdrawalAmount;               //Returns the value of the attribute WithdrawalAmount
    }
    public String getDateofWithdrawal()
    {
        return this.DateofWithdrawal;               //Returns the value of the attribute DateofWithdrawal
    }
    public boolean gethasWithdrawn()
    {
        return this.hasWithdrawn;                   //Returns the value of the attribute hasWithdrawn
    }
    
    
    //Mutator Method:
    /*
     * This method updates the value for its corresponding private attribute when the value is passed in the parameter.
     * This class has one setter method with a parameter WithdrawalAmount in which the attribute WithdrawalAmount is assigned with the parameter value.
     */
    
    public void setWithdrawalAmount(int WithdrawalAmount) //Setter method with no return type and with a parameter WithdrawalAmount with integer data type
    {
        this.WithdrawalAmount = WithdrawalAmount;         //Assigning the private attribute WithdrawalAmount with parameter the value
    }
    
    
    //Withdraw Method:
    /*
     * It has accepts parameters.
     * It first checks the condition whether the attribute PINnumber is equal to the parameterised PINnumber or not.
     * If it matches the condition then it checks that whether the parameterised WithdrawalAmount is less than or equal to the balanceAmount.
     * If both conditions are met then it updates the new balance amount by deducting the withdrawl amount from current balance amount.
     * Then it sets the value for the attribute hasWithdrawn to true and assigns the attribute WithdrawalAmount and DateofWithdrawal with the parameter 
       value.
     * Then it prints a message stating "Withdraw Successfull" and also prints the value of the attribute WithdrawalAmount, DateofWithdrawal and 
       BalanceAmount along with a text.
     * If the WithdrawalAmount is more than the balanceAmount then it prints a message stating "Insufficient Balance"
     * At last, if the the attribute PINnumber doesn't matches with the parameterised PINnumber then it prints a messsage stating "Invalid Pin Number"
     */
    
    public void withdraw(int WithdrawalAmount, String DateofWithdrawal, int PINnumber)  //Withdraw Method with 3 parameters
    {
        if(this.PINnumber==PINnumber)                                   //If the the attribute PINnumber is equal to the parameterised PINnumber or not.
        {
            if(WithdrawalAmount <= super.getbalanceAmount())            //If the parameterised WithdrawalAmount is less than or equal to the balanceAmount
            {
                super.setbalanceAmount(super.getbalanceAmount()-WithdrawalAmount);  //New balance is updated
                this.hasWithdrawn = true;                                           //Updates the value for the attribute hasWithdrawn to true
                this.WithdrawalAmount = WithdrawalAmount;                           //Assigns the private attribute WithdrawalAmount with parameter value
                this.DateofWithdrawal = DateofWithdrawal;                           //Assigns the private attribute DateofWithdrawal with parameter value
                System.out.println("Withdraw Successful!!");                        //Output
                System.out.println(this.WithdrawalAmount+" has been debited from your account on "+this.DateofWithdrawal+", your new balance is "
                +super.getbalanceAmount());                                         //Output
            }
            else
            {
                System.out.println("Insufficient Balance");                         //Output
            }
        }
        else
        {
            System.out.println("Invalid Pin Number");                               //Output
        }
    }
    
    
    //Display Method:
    /*
     * It displays the details of the class.
     * It first calls the display method which displays the details of the BankCard class and additionally it also displays the value of the attribute 
       PINnumber along with a text.
     * It also has if and else condition.
     * As per the question, PINnumber should have displayed only when the withdrawn has been made but without knowing the PINnumber the amount cannot be
       withdrawn therefore the value of the attribute PINnumber is diplayed outside of the if and else condition.
     * If the attribute hasWithdrawn is true then it displays the value of attribute WithdrawalAmount and DateofWithdrawal along with a text.
     * If the attribute hasWithdrawn is false then it doesn't print anything.
     * As per the question the else should have displayed the balance amount only but the display method which has been called from BankCard class will 
       already display the balance amount therefore instead of displaying the same thing twice now it will only display the balance amount once.
     */
    
    public void display()                                                              //Display method with no return type
    {
        super.display();                                                               //Calling the display method of BankCard class
        System.out.println("Pin Number: "+ this.PINnumber);                            //Output
        if(this.hasWithdrawn == true)                                                  //If withdrawn has been made
        {
            System.out.println("Amount Withdrawn: "+this.WithdrawalAmount);            //Output
            System.out.println("Date of Withdrawal: "+this.DateofWithdrawal);          //Output
        }
        else
        {
            System.out.println("");                                                    //Output
        }
    }
}

