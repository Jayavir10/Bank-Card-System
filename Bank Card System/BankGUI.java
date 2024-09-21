import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BankGUI implements ActionListener
{
    //Declaring Instance Variables for the GUI components
    JFrame GUI_frame;
    JPanel debit_panel, credit_panel;
    JLabel DebitCard, ClientName, CardID, IssuerBank, BankAccount, PINnumber, BalanceAmount, WithdrawalAmount, WithdrawalDate, CreditCard, ClientName2, CardID2, IssuerBank2, BankAccount2, CVCNumber, ExpirationDate, BalanceAmount2, CreditLimit, InterestRate, GracePeriod;
    JTextField clientname_field, cardid_field, issuerbank_field, bankaccount_field, pinnumber_field, balanceamount_field, withdrawalamount_field, clientname2_field, cardid2_field, issuerbank2_field, bankaccount2_field, cvcnumber_field, balanceamount2_field, creditlimit_field, interestrate_field, graceperiod_field;
    JButton AddDebitCard, Withdraw, AddCreditCard, SetCreditLimit, CancelCredit, DisplayDebit, ClearDebit, DisplayCredit, ClearCredit;
    JComboBox <String> withdrawaldate, expirationdate;
    
    //Initializing array list:
    ArrayList<BankCard>BankArray = new ArrayList<BankCard>();
    
    public BankGUI()
    {
        GUI_frame = new JFrame("Bank Card Details");
        
        //Debit Card Panel:
        debit_panel = new JPanel();
        debit_panel.setSize(1350, 367);
        debit_panel.setLayout(null);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        debit_panel.setBorder(border);
        debit_panel.setBackground(new Color(178,235,242));
        
        //Debit Card Labels:
        DebitCard = new JLabel("For Debit Card");
        ClientName = new JLabel("Client Name:");
        CardID = new JLabel("Card ID:");
        IssuerBank = new JLabel("Issuer Bank:");
        BankAccount = new JLabel("Bank Account:");
        PINnumber = new JLabel("PIN Number:");
        BalanceAmount = new JLabel("Balance Amount:");
        WithdrawalAmount = new JLabel("Withdrawal Amount:");
        WithdrawalDate = new JLabel("Withdrawal Date:");
        
        //Debit Card TextFields:
        clientname_field = new JTextField("");
        cardid_field = new JTextField("");
        issuerbank_field = new JTextField("");
        bankaccount_field = new JTextField("");
        pinnumber_field = new JTextField("");
        balanceamount_field = new JTextField("");
        withdrawalamount_field = new JTextField("");
        
        //Debit Card ComboBox:
        withdrawaldate = new JComboBox<String>();
        withdrawaldate.addItem("-Select Withdrawal Date-");
        for (int month = 5; month <= 12; month++)
        {
             for (int day = 1; day <= 31; day++)
             {
                 String date = day+"/"+month+"/"+2023;
                 withdrawaldate.addItem(date);
             }
        }
        
        //Debit Card Buttons:
        DisplayDebit = new JButton("Display");
        AddDebitCard = new JButton("Add Debit Card");
        Withdraw = new JButton("Withdraw From Debit Card");
        ClearDebit = new JButton("Clear");
        
        //Debit Card Label Bounds:
        DebitCard.setBounds(576,8,210,42);
        DebitCard.setFont(new Font("Times New Roman",30,30));
        ClientName.setBounds(38,103,97,22);
        CardID.setBounds(38,165,97,22);
        IssuerBank.setBounds(38,223,97,22);
        BankAccount.setBounds(498,103,106,22);
        PINnumber.setBounds(498,160,97,22);
        BalanceAmount.setBounds(498,219,120,22);
        WithdrawalAmount.setBounds(964,103,144,22);
        WithdrawalDate.setBounds(964,160,144,22);
        
        //Debit Card TextField Bounds:
        clientname_field.setBounds(161,100,183,27);
        cardid_field.setBounds(161,160,183,27);
        issuerbank_field.setBounds(161,220,183,27);
        bankaccount_field.setBounds(646,100,183,27);
        pinnumber_field.setBounds(646,155,183,27);
        balanceamount_field.setBounds(646,214,183,27);
        withdrawalamount_field.setBounds(1135,100,183,27);
        withdrawaldate.setBounds(1135,160,183,27);

        
        //Debit Card Button Bounds:
        DisplayDebit.setBounds(97,308,155,41);
        AddDebitCard.setBounds(571,308,207,41);
        Withdraw.setBounds(1097,227,207,41);
        ClearDebit.setBounds(1097,308,155,41);
        
        
        //Adding Labels to the Panel:
        debit_panel.add(DebitCard);
        debit_panel.add(ClientName);
        debit_panel.add(CardID);
        debit_panel.add(IssuerBank);
        debit_panel.add(BankAccount);
        debit_panel.add(PINnumber);
        debit_panel.add(BalanceAmount);
        debit_panel.add(WithdrawalAmount);
        debit_panel.add(WithdrawalDate);
        
        //Adding Textfields to the Panel:
        debit_panel.add(clientname_field);
        debit_panel.add(cardid_field);
        debit_panel.add(issuerbank_field);
        debit_panel.add(bankaccount_field);
        debit_panel.add(pinnumber_field);
        debit_panel.add(balanceamount_field);
        debit_panel.add(withdrawalamount_field);
        debit_panel.add(withdrawaldate);
        
        //Adding Buttons to the panel:
        debit_panel.add(DisplayDebit);
        debit_panel.add(AddDebitCard);
        debit_panel.add(Withdraw);
        debit_panel.add(ClearDebit);
        
        //-------------------------------------------------------------------------------------------------------------------------------------------
        
        //Credit Card Panel:
        credit_panel = new JPanel();
        credit_panel.setLocation(0,367);
        credit_panel.setSize(1350,418);
        credit_panel.setLayout(null);
        Border border2 = BorderFactory.createLineBorder(Color.BLACK, 2);
        credit_panel.setBorder(border2);
        credit_panel.setBackground(new Color(255,204,188));
        
        //Credit Card Labels:
        CreditCard = new JLabel("For Credit Card");
        ClientName2 = new JLabel("Client Name:");
        CardID2 = new JLabel("Card ID:");
        IssuerBank2 = new JLabel("Issuer Bank:");
        BankAccount2 = new JLabel("Bank Account:");
        CVCNumber = new JLabel("CVC Number:");
        ExpirationDate = new JLabel("Expiration Date:");
        BalanceAmount2 = new JLabel("Balance Amount:");
        InterestRate = new JLabel("Interest Rate:");
        CreditLimit = new JLabel("Credit Limit:");
        GracePeriod = new JLabel("Grace Period:");
        
        //Credit Card TextFields:
        clientname2_field = new JTextField();
        cardid2_field = new JTextField();
        issuerbank2_field = new JTextField();
        bankaccount2_field = new JTextField();
        cvcnumber_field = new JTextField();
        balanceamount2_field = new JTextField();
        interestrate_field = new JTextField();
        creditlimit_field = new JTextField();
        graceperiod_field = new JTextField();
        
        //Credit Card ComboBox:
        expirationdate = new JComboBox<String>();
        expirationdate.addItem("-Select Expiration Date-");
        for (int year = 2024; year <= 2030; year++)
        {
             for (int month = 1; month <= 12; month++)
             {
                 String expiry = month+"/"+year;
                 expirationdate.addItem(expiry);
             }
        }
        
        //Credit Card Buttons:
        DisplayCredit = new JButton("Display");
        AddCreditCard = new JButton("Add Credit Card");
        SetCreditLimit = new JButton("Set Credit Limit");
        CancelCredit = new JButton("Cancel Credit Card");
        ClearCredit = new JButton("Clear");
        
        //Credit Card Label Bounds:
        CreditCard.setBounds(576,10,210,42);
        CreditCard.setFont(new Font("Times New Roman",30,30));
        ClientName2.setBounds(38,97,97,22);
        CardID2.setBounds(38,159,97,22);
        IssuerBank2.setBounds(38,217,97,22);
        BankAccount2.setBounds(498,93,106,25);
        CVCNumber.setBounds(498,153,99,25);
        ExpirationDate.setBounds(498,212,120,25);
        BalanceAmount2.setBounds(975,89,120,22);
        InterestRate.setBounds(975,146,106,26);
        CreditLimit.setBounds(975,208,99,26);
        GracePeriod.setBounds(975,269,120,26);
        
        //Credit Card TextFields and ComboBox Bounds:
        clientname2_field.setBounds(161,94,183,27);
        cardid2_field.setBounds(161,154,183,27);
        issuerbank2_field.setBounds(161,214,183,27);
        bankaccount2_field.setBounds(646,90,183,29);
        cvcnumber_field.setBounds(646,149,183,29);
        balanceamount2_field.setBounds(1123,84,183,27);
        interestrate_field.setBounds(1123,143,183,27);
        creditlimit_field.setBounds(1123,204,183,27);
        graceperiod_field.setBounds(1123,264,183,30);
        expirationdate.setBounds(646,211,183,29);
        
        //Credit Card Button Bounds:
        AddCreditCard.setBounds(253,330,207,38);
        SetCreditLimit.setBounds(575,330,207,38);
        CancelCredit.setBounds(891,330,207,38);
        DisplayCredit.setBounds(40,362,155,41);
        ClearCredit.setBounds(1156,362,155,41);
        
        //Adding Labels to the Panel:
        credit_panel.add(CreditCard);
        credit_panel.add(ClientName2);
        credit_panel.add(CardID2);
        credit_panel.add(IssuerBank2);
        credit_panel.add(BankAccount2);
        credit_panel.add(CVCNumber);
        credit_panel.add(ExpirationDate);
        credit_panel.add(BalanceAmount2);
        credit_panel.add(CreditLimit);
        credit_panel.add(InterestRate);
        credit_panel.add(GracePeriod);
        
        //Adding TextFields and ComboBox to the Panel:
        credit_panel.add(clientname2_field);
        credit_panel.add(cardid2_field);
        credit_panel.add(issuerbank2_field);
        credit_panel.add(bankaccount2_field);
        credit_panel.add(cvcnumber_field);
        credit_panel.add(balanceamount2_field);
        credit_panel.add(creditlimit_field);
        credit_panel.add(interestrate_field);
        credit_panel.add(graceperiod_field);
        credit_panel.add(expirationdate);
        
        //Adding Buttons to the Panel:
        credit_panel.add(AddCreditCard);
        credit_panel.add(SetCreditLimit);
        credit_panel.add(CancelCredit);
        credit_panel.add(DisplayCredit);
        credit_panel.add(ClearCredit);
        
        //----------------------------------------------------------------------------------------------------------------------------------------------
        
        //Frame:
        GUI_frame.add(debit_panel);
        GUI_frame.add(credit_panel);
        GUI_frame.setSize(1364,822);
        GUI_frame.setLayout(null);
        GUI_frame.setVisible(true);
        GUI_frame.setResizable(false);
        GUI_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //--------------------------------------------------------------------------------------------------------------------------------------------
        
        //Adding actionlistener event to debit card buttons:
        AddDebitCard.addActionListener(this);
        Withdraw.addActionListener(this);
        DisplayDebit.addActionListener(this);
        ClearDebit.addActionListener(this);
        
        //Adding actionlistener event to debit card buttons:
        AddCreditCard.addActionListener(this);
        SetCreditLimit.addActionListener(this);
        CancelCredit.addActionListener(this);
        DisplayCredit.addActionListener(this);
        ClearCredit.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent x)
    {
        // Add Debit Card Button:
        
        /* 
         * This Add Debit Card button retrieves the values from the text fields and checks whether the fields and Array list is empty or not.
         * After validating if the Array is empty then it creates a new DebitCard object and adds it to the Array List.
         * If the Array List is not empty then it checks whether the existing Card ID already exist or not, if it doesnt exist then it creates a new DebitCard object and add it to the Array List.
         * If the card already exist then it shows a error message.
         * With Try-catch block, any NumberFormatException that may occur is handled.
        */
        
        if (x.getSource() == AddDebitCard)
        {
            try
            {
                //Retrieving values from the Text Fields.
                String balanceAmount = balanceamount_field.getText();
                String cardID = cardid_field.getText();
                String BankAccount = bankaccount_field.getText();
                String IssuerBank = issuerbank_field.getText();
                String Client_Name = clientname_field.getText();
                String PIN_Number = pinnumber_field.getText();
    
                boolean isAdded = false;
                
                //Validating if the text fields are empty
                if(Client_Name.isEmpty() || balanceAmount.isEmpty() || cardID.isEmpty() || BankAccount.isEmpty() || IssuerBank.isEmpty() || PIN_Number.isEmpty()) 
                {
                    JOptionPane.showMessageDialog(GUI_frame, "Please enter the Client Name, Card ID, Issuer Bank, Bank Account, PIN Number and Balance Amount to add the Debit Card", "Empty Fields Found", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    //Validating whether the ArrayList named BankArray is empty and creating a new object of Debit Card and adding the object to the ArrayList.
                    if(BankArray.isEmpty())
                    {
                        DebitCard DebitObj = new DebitCard(Double.parseDouble (balanceAmount), Integer.parseInt(cardID), BankAccount, IssuerBank, Client_Name, Integer.parseInt(PIN_Number));
                                
                        BankArray.add(DebitObj);
                                
                        JOptionPane.showMessageDialog(GUI_frame, "Your Debit Card has been added successfully!","SUCCESS!!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    { 
                        //Validating whether the Existing Card ID of Debit Card object already exist in the Array List or not to prevent adding of duplicate Card ID
                        for(BankCard debitcheck : BankArray)
                        {
                             if(debitcheck instanceof DebitCard)
                             {
                                 if(debitcheck.getcardID() == Integer.parseInt(cardID))
                                 {
                                     JOptionPane.showMessageDialog(GUI_frame, "This Debit Card already exist","Cannot be added", JOptionPane.ERROR_MESSAGE);
                                     
                                     isAdded = true;
                                     
                                     break;
                                 }
                             }
                        }
                        //If the Debit Card object with the same Card ID doesnt exist then creating a new DebitCard object and add the object to the ArrayList.
                        if(isAdded == false)
                        {
                            DebitCard DebitObj = new DebitCard(Double.parseDouble (balanceAmount), Integer.parseInt(cardID), BankAccount, IssuerBank, Client_Name, Integer.parseInt(PIN_Number));
                                    
                            BankArray.add(DebitObj);
                                    
                            JOptionPane.showMessageDialog(GUI_frame, "Your Debit Card has been added successfully!","SUCCESS!!", JOptionPane.INFORMATION_MESSAGE);
                                
                            isAdded = true;
                        }
                    }
                }
            }catch(NumberFormatException d) //Handles NumberFormatException if invalid/unsuitable values are added to the Numeric fields.
            {
                JOptionPane.showMessageDialog(GUI_frame, "INVALID!! Please enter a valid numeric input for Card ID, PIN Number and Balance Amount","Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //Withdraw button:
        /*
         * This withdraw button retrieves the values from the fields and checks whether the ArrayList and Text fields are empty.
         * If ArrayList and Text fields are filled correctly then it checks whether the Card ID entered in the field already exist in the ArrayList.
         * If the Card ID exist then it validates that the PIN number associated with that existing ID matches, if it matches then a withdraw method is called from DebitCard class and withdrawing process gets complete.
         * If the Card ID doesn't exist in the ArrayList then the Card is not registered and Withdraw process cannot be done.
         * With Try-catch block, any NumberFormatException that may occur is handled.
         */
        else if(x.getSource() == Withdraw)
        {
            try
            {
                //Retrieves the values from the Text Fields
                String cardID = cardid_field.getText();
                String withdrawal = withdrawalamount_field.getText();
                String dateofwithdrawal = withdrawaldate.getSelectedItem().toString();
                String pin = pinnumber_field.getText();
                boolean isWithdrawn = false; 
                
                //Validates if the ArrayList named BankArray is empty.
                if(BankArray.isEmpty())
                {
                    JOptionPane.showMessageDialog(GUI_frame, "Please add the Debit Card to withdraw","",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    //Validates if the text fields are empty.
                    if(cardID.isEmpty() || withdrawal.isEmpty() || dateofwithdrawal == "-Select Withdrawal Date-" || pin.isEmpty())
                    {
                        JOptionPane.showMessageDialog(GUI_frame, "Please enter the Card ID, PIN Number, Withdrawal Amount and Date Of Withdrawal to withdraw","Empty Fields Found", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        //Validates whether the Card ID of the DebitCard object already exist in the ArrayList
                        for(BankCard WithdrawAmt : BankArray)
                        {
                            if (WithdrawAmt instanceof DebitCard)
                            {
                                //Performing Downcasting
                                DebitCard obj = (DebitCard)WithdrawAmt; 
                                
                                //Validates if the Card ID in the Text field matches with the Card ID in the Array List
                                if(obj.getcardID() == Integer.parseInt(cardID))
                                {
                                    //Validates if the PIN Number entered in the text field matches with PIN Number of the existing Card ID and calls the Withdraw method to process the Withdraw.
                                    if(obj.getPINnumber() == Integer.parseInt(pin))
                                    {
                                        obj.withdraw(Integer.parseInt(withdrawal), dateofwithdrawal, Integer.parseInt(pin));
                                    
                                        JOptionPane.showMessageDialog(GUI_frame, "Withdraw Successful!!","SUCCESS!!", JOptionPane.INFORMATION_MESSAGE);
                                        
                                        JOptionPane.showMessageDialog(GUI_frame,"Card ID: "+obj.getcardID() +"\n" + "Withdrawal Amount: "+ obj.getWithdrawalAmount() + "\n" + "Date of Withdrawal: " + obj.getDateofWithdrawal() +"\n" + "Pin Number: " + pin + "\n" + "Available Balance: " + obj.getbalanceAmount(),"Withdraw Details", JOptionPane.INFORMATION_MESSAGE);
                                        
                                        isWithdrawn = true;
                                        
                                        break; //Breaks the for-loop
                                    }
                                    // If the PIN number doesnt match with the existing Card ID
                                    else
                                    {
                                        obj.withdraw(Integer.parseInt(withdrawal), dateofwithdrawal, Integer.parseInt(pin));
                                        
                                        JOptionPane.showMessageDialog(GUI_frame, "Withdraw Failed!! Please enter the correct PIN Number","Invalid Pin Number", JOptionPane.ERROR_MESSAGE);
                                        
                                        isWithdrawn = true;
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    isWithdrawn = false;  
                                }
                            }
                        }
                        //If the Card ID entered in the text field doesnt exist in the ArrayList:
                        if(isWithdrawn == false)
                        {
                            JOptionPane.showMessageDialog(GUI_frame, "This Debit Card is not registered","Card Not Registered",JOptionPane.ERROR_MESSAGE); 
                        }
                    }
                }
            }catch(NumberFormatException d) //Handles NumberFormatException if invalid/unsuitable values are added to the Numeric fields.
            {
                JOptionPane.showMessageDialog(GUI_frame, "INVALID!! Please enter a valid numeric input for Card ID, PIN Number and Withdrawal Amount","Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // Display button of Debit Card:
        /*
         * This button retrieves the values from the Debit Card ID field and checks whether the ArrayList and Debit Card ID field is empty or not.
         * If the Array and field is filled correctly then it checks whether the Card ID entered in the field already exist in the ArrayList.
         * If it exist then Display method of the DebitCard class is called to display the details of the Debit Card.
         * If it doesnt exist in the Array then Card should be registered/add first to display its details.
         * With Try-catch block, any NumberFormatException that may occur is handled.
         */
        else if(x.getSource() == DisplayDebit)
        {
            try
            {
                //Retrieves the value from the Debit Card ID field
                String cardID = cardid_field.getText();
                boolean isDisplay = false;
                
                //Validates whether the ArrayList named BankArray is empty or not
                if (BankArray.isEmpty())
                {
                    JOptionPane.showMessageDialog(GUI_frame, "Please add the Debit Card to display the details","",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    //Validates whether the Debit Card ID field is empty or not
                    if(cardID.isEmpty())
                    {
                        JOptionPane.showMessageDialog(GUI_frame, "Please enter the Debit Card ID to display the details.","Empty Card ID", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        //Validates whether the Card ID of the DebitCard object already exist in the ArrayList
                        for(BankCard ObjDisplay : BankArray)
                        {
                            if (ObjDisplay instanceof DebitCard)
                            {
                                //Performing Downcasting
                                DebitCard obj = (DebitCard)ObjDisplay; 
                                
                                //Validates whether the Card ID entered in the field matches with the already exisitng Card ID in the ArrayList and calls the display method to display the Card details
                                if(obj.getcardID() == Integer.parseInt(cardID))
                                {
                                    obj.display();
                                    
                                    JOptionPane.showMessageDialog(GUI_frame, "Client Name: " + obj.getclientName() + "\n" + "Card ID: "+ obj.getcardID() + "\n" + "Issuer Bank: " + obj.getissuerBank() + "\n" + "Bank Account: " + obj.getbankAccount() + "\n" + "Balance Amount: " + obj.getbalanceAmount(),"Debit Card Details", JOptionPane.INFORMATION_MESSAGE);
                                    
                                    isDisplay = true;
                                    
                                    break; //Break the for-loop
                                }
                                else
                                {
                                    isDisplay = false;
                                }
                            }
                        }
                        //If the Card ID of the DebitCard object doesnt exist in the ArrayList
                        if (isDisplay == false)
                        {
                            JOptionPane.showMessageDialog(GUI_frame, "This Debit Card is not registered","Card Not Registered",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }catch(NumberFormatException d) //Handles NumberFormatException if invalid/unsuitable values are entered in the Card ID field.
            {
                JOptionPane.showMessageDialog(GUI_frame, "INVALID!! Please enter a valid numeric input for Debit Card ID.","Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
        //Clear button of Debit Card:
        // This clear button sets the text of all the fields in the Debit Card to an empty string ("").
        else if(x.getSource() == ClearDebit)
        {
            balanceamount_field.setText("");
            cardid_field.setText("");
            bankaccount_field.setText("");
            issuerbank_field.setText("");
            clientname_field.setText("");
            pinnumber_field.setText("");
            withdrawalamount_field.setText("");
        }
        //Add Credit Card button:
        /* 
         * This Add Credit Card button retrieves the values from the text fields and checks whether the fields and Array list is empty.
         * After validating, if the Array is empty then it creates a new CreditCard object and add it to the Array List.
         * If the Array List is not empty then it checks whether the existing Credit Card ID already exist or not, if it doesnt exist then it creates a new CreditCard object and add it to the Array List
         * If the Credit card already exist and is the object of the CreditCard then it shows a error message.
         * With Try-catch block, any NumberFormatException that may occur is handled.
        */
        else if(x.getSource() == AddCreditCard)
        {
            try
            {
                //Retrieves values from the Text Fields.
                String creditID = cardid2_field.getText();
                String credit_client = clientname2_field.getText();
                String credit_issuer = issuerbank2_field.getText();
                String credit_account = bankaccount2_field.getText();
                String credit_balance = balanceamount2_field.getText();
                String CVC = cvcnumber_field.getText();
                String interest = interestrate_field.getText();
                String expiration = expirationdate.getSelectedItem().toString();
                
                boolean isAdded = false;
                
                //Validating if the text fields are empty
                if(credit_client.isEmpty() || creditID.isEmpty() || credit_issuer.isEmpty() || credit_account.isEmpty() || credit_balance.isEmpty() || CVC.isEmpty() || interest.isEmpty() || expiration == "-Select Expiration Date-") 
                {
                    JOptionPane.showMessageDialog(GUI_frame, "Please enter the Client Name, Card ID, Issuer Bank, Bank Account, CVC Number, Expiration Date, Balance Amount and Interest Rate to add the Credit Card","Empty Fields Found", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    //Validating if the ArrayList named BankArray is empty and creating a new object of CreditCard and adding the object to the ArrayList.
                    if(BankArray.isEmpty())
                    {
                        CreditCard CreditObj = new CreditCard(Integer.parseInt(creditID), credit_client, credit_issuer, credit_account, Double.parseDouble(credit_balance), Integer.parseInt(CVC), Double.parseDouble(interest), expiration);
                        
                        BankArray.add(CreditObj);
                        
                        JOptionPane.showMessageDialog(GUI_frame, "Your Credit Card has been added successfully!","SUCCESS!!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        //Validating whether the Existing Card ID of Credit Card object already exist in the Array List or not to prevent adding of duplicate Card ID
                        for (BankCard creditcheck : BankArray)
                        {
                            if (creditcheck instanceof CreditCard)
                            {
                                if (creditcheck.getcardID() == Integer.parseInt(creditID))
                                {
                                    JOptionPane.showMessageDialog(GUI_frame, "This Credit Card already exist","Cannot be Added",JOptionPane.ERROR_MESSAGE);
                                    
                                    isAdded = true;
                                    
                                    break;
                                }
                            }
                        }
                        //If the Credit Card object with the same Card ID doesnt exist then creating a new CreditCard object and adding the object to the ArrayList.
                        if(isAdded == false)
                        {
                            CreditCard CreditObj = new CreditCard(Integer.parseInt(creditID), credit_client, credit_issuer, credit_account, Double.parseDouble(credit_balance), Integer.parseInt(CVC), Double.parseDouble(interest), expiration);
                            
                            BankArray.add(CreditObj);
                            
                            JOptionPane.showMessageDialog(GUI_frame, "Your Credit Card has been added successfully!","SUCCESS!!", JOptionPane.INFORMATION_MESSAGE);
                            
                            isAdded = true;
                        }
                    }
                }
            }catch(NumberFormatException c) //Handles NumberFormatException if invalid/unsuitable values are added to the Numeric fields.
            {
                JOptionPane.showMessageDialog(GUI_frame, "INVALID!! Please enter a valid numeric input for Credit Card ID, CVC Number, Balance Amount and Interest Rate.","Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //Display button of Credit Card:
        /*
         * This button retrieves the values from the Card ID field of Credit Card and checks whether the ArrayList and Card ID field is empty or not.
         * If the Array and field is filled correctly then it checks whether the Credit Card ID entered in the field already exist in the Array List.
         * If it exist then Display method of the CreditCard class is called to display the details of the Credit Card.
         * If it doesnt exist in the Array then the new Credit Card should be registered/add first to display its details.
         * With Try-catch block, any NumberFormatException that may occur is handled.
         */
        else if(x.getSource() == DisplayCredit)
        {
            try
            {
                //Retrieves the values from the Credit Card ID field
                String cardID = cardid2_field.getText();
                
                boolean isDisplayed = false;
                
                //Validates whether the ArrayList named BankArray is empty or not
                if (BankArray.isEmpty())
                {
                    JOptionPane.showMessageDialog(GUI_frame, "Please add the Credit Card to display the details","",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    //Validates whether the Credit Card ID field is empty or not
                    if(cardID.isEmpty())
                    {
                        JOptionPane.showMessageDialog(GUI_frame, "Please enter the Credit Card ID to display the details.","Empty Card ID", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        //Validates whether the Credit Card ID of the CreditCard object already exist in the ArrayList
                        for(BankCard ObjCreditDisplay : BankArray)
                        {
                            if (ObjCreditDisplay instanceof CreditCard)
                            {
                                //Performing Downcasting
                                CreditCard creditobj = (CreditCard) ObjCreditDisplay; 
                                
                                //Validates whether the Credit Card ID entered in the field matches with the already exisitng Credit Card ID in the ArrayList and calls the display method of CreditCard class.
                                if(creditobj.getcardID() == Integer.parseInt(cardID))
                                {
                                    creditobj.display();
                                    
                                    JOptionPane.showMessageDialog(GUI_frame, "Client Name: " + creditobj.getclientName() + "\n" + "Card ID: " + creditobj.getcardID() + "\n" + "Issuer Bank: "+ creditobj.getissuerBank() + "\n" + "Bank Account: " + creditobj.getbankAccount() + "\n" + "CVC Number: " + creditobj.getCVCnumber() + "\n" + "Expiration Date: " + creditobj.getExpirationDate() + "\n" + "Balance Amount: " + creditobj.getbalanceAmount() + "\n" + "Interest Rate: " + creditobj.getInterestRate() + "\n" + "Credit Limit: " + creditobj.getCreditLimit() + "\n" + "Grace period: " + creditobj.getGracePeriod(),"Credit Card Details", JOptionPane.INFORMATION_MESSAGE);
                                    
                                    isDisplayed = true;
                                    
                                    break;  //Break for-loop
                                }
                                else
                                {
                                    isDisplayed = false;
                                }
                            }
                        }
                        //If the Credit Card ID of the CreditCard object doesnt exist in the ArrayList
                        if (isDisplayed == false)
                        {
                            JOptionPane.showMessageDialog(GUI_frame, "This Credit Card is not registered","Card Not Registered",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }catch(NumberFormatException c) //Handles NumberFormatException if invalid/unsuitable values are entered in the Credit Card ID field.
            {
                JOptionPane.showMessageDialog(GUI_frame, "INVALID!! Please enter a valid numeric input for Credit Card ID","Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //Set Credit Limit button:
        /*
         * This button retrieves the values from the text fields and checks whether the ArrayList and the text fields are empty or not.
         * If the ArrayList and Text Fields are filled correctly then it checks whether the Credit Card ID entered in the text field already exist in the ArrayList.
         * If it does exist and if the Card Id is the object of the CreditCard then it calls the setCreditLimit method of the CreditCard class which will set the credit limit.
         * With Try-catch block, any NumberFormatException that may occur is handled.
         */
        else if(x.getSource() == SetCreditLimit)
        {
            try
            {
                //Retrieves the values from the Text fields.
                String cardID = cardid2_field.getText();
                String Credit_Limit = creditlimit_field.getText();
                String grace_period = graceperiod_field.getText();
                boolean isLimitSet = false;
                
                //Validates whether the ArrayList is empty or not
                if (BankArray.isEmpty())
                {
                    JOptionPane.showMessageDialog(GUI_frame, "Please add the Credit Card to set the credit limit","",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    //Validates whether the fields are empty or not
                    if(cardID.isEmpty() || Credit_Limit.isEmpty() || grace_period.isEmpty())
                    {
                        JOptionPane.showMessageDialog(GUI_frame, "Please enter the Card ID, Credit Limit and Grace Period to set credit limit","Empty Fields Found", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        //Validates whether the Credit Card ID of the CreditCard object already exist in the ArrayList by iterating over the ArrayList
                        for(BankCard ObjCreditLimit : BankArray)
                        {
                            if (ObjCreditLimit instanceof CreditCard)
                            {
                                //Performing downcasting
                                CreditCard creditobj = (CreditCard) ObjCreditLimit;
                                
                                //Validates whether the Credit Card ID entered in the field matches with the already exisitng Credit Card ID in the ArrayList and calls the setCreditLimit method of CreditCard class.
                                if(creditobj.getcardID() == Integer.parseInt(cardID))
                                {
                                    creditobj.setCreditLimit(Double.parseDouble(Credit_Limit), Integer.parseInt(grace_period));
                                    
                                    JOptionPane.showMessageDialog(GUI_frame, "Card ID: " + creditobj.getcardID() + "\n" +"Credit Limit: " + creditobj.getCreditLimit() + "\n" + "Grace Period: " + creditobj.getGracePeriod(),"Credit Limit Details", JOptionPane.INFORMATION_MESSAGE);
                                    
                                    isLimitSet = true;
                                    
                                    break;
                                }
                                else
                                {
                                    isLimitSet = false;
                                }
                            }
                        }
                        //If the Credit Card ID of the CreditCard object doesnt exist in the ArrayList
                        if (isLimitSet == false)
                        {
                            JOptionPane.showMessageDialog(GUI_frame, "This Credit Card is not registered","Card Not Registered",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }catch(NumberFormatException c) //Handles NumberFormatException if invalid/unsuitable values are entered in the Numeric fields.
            {
                JOptionPane.showMessageDialog(GUI_frame, "INVALID!! Please enter a valid numeric input for Credit Card ID, Credit Limit and Grace Period","Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //Cancel Credit Card button:
        /*
         * This button retrieves the values from the text field of Credit Card ID and checks whether the ArrayList and the Credit Card ID text field is empty or not.
         * If the ArrayList and Credit Card Id are filled correctly then it checks whether the Credit Card ID entered in the text field already exist in the ArrayList.
         * If it does exist and if the Card Id is the object of the CreditCard then it calls the CancelCreditCard method of the CreditCard class which will cancel the credit card if it has been granted.
         * With Try-catch block, any NumberFormatException that may occur is handled.
         */
        else if(x.getSource() == CancelCredit)
        {
            try
            {
                //Retrieves the values from the Credit Card ID text field
                String cardID = cardid2_field.getText();
                
                boolean isCreditCanceled = false;
                
                //Validates whether the ArrayList is empty or not
                if (BankArray.isEmpty())
                {
                    JOptionPane.showMessageDialog(GUI_frame, "Please add the Credit Card to cancel","",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    //Validates whether the Credit Card ID field is empty or not
                    if(cardID.isEmpty())
                    {
                        JOptionPane.showMessageDialog(GUI_frame, "Please enter the Credit Card ID to cancel","Empty Card ID", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        //Validates whether the Credit Card ID of the CreditCard object already exist in the ArrayList by iterating over the ArrayList
                        for(BankCard ObjCreditCancel : BankArray)
                        {
                            if (ObjCreditCancel instanceof CreditCard)
                            {
                                //Performing Downcasting
                                CreditCard creditobj = (CreditCard) ObjCreditCancel; 
                                
                                //Validates whether the Credit Card ID entered in the field matches with the already exisitng Credit Card ID in the ArrayList and calls the CancelCreditCard method of CreditCard class.
                                if(creditobj.getcardID() == Integer.parseInt(cardID))
                                {
                                    creditobj.CancelCreditCard();
                                    
                                    JOptionPane.showMessageDialog(GUI_frame, "Credit Card has been Cancelled","SUCCESS!!", JOptionPane.INFORMATION_MESSAGE);
                                    
                                    isCreditCanceled = true;
                                    
                                    break; //Break for-loop
                                }
                                else
                                {
                                    isCreditCanceled = false;
                                }
                            }
                        }
                        //If the Credit Card ID doesnt exist in the ArrayList
                        if (isCreditCanceled == false)
                        {
                            JOptionPane.showMessageDialog(GUI_frame, "This Credit Card is not registered","Card Not Registered",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }catch(NumberFormatException c) //Handles NumberFormatException if invalid/unsuitable values are entered in the Card ID field.
            {
                JOptionPane.showMessageDialog(GUI_frame, "INVALID!! Please enter a valid numeric input for Credit Card ID","Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
        //Clear button of Credit Card:
        // This clear button sets the text for all the fields in the Credit Card to an empty string ("").
        else if(x.getSource() == ClearCredit)
        {
            clientname2_field.setText("");
            cardid2_field.setText("");
            issuerbank2_field.setText("");
            bankaccount2_field.setText("");
            cvcnumber_field.setText("");
            balanceamount2_field.setText("");
            interestrate_field.setText("");
            creditlimit_field.setText("");
            graceperiod_field.setText("");
        }
    }
    
    public static void main(String[]args)
    {
        new BankGUI();
    }
}