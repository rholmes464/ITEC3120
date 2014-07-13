/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itec3120;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author richardholmes
 */
public abstract class mainAbstract {
    // This is the main Class - Abstract 
    // this is where we define the Strings that are going to be uses for each of the classes
    // This would be considered the Super class
    private String LastName;
    private String FirstName;
    private String Address;
    private String PhoneNumber;
    private String Email;
  //  private int count;
    final ArrayList bill = new ArrayList();
    
    
    
    public mainAbstract(String Last, String First, String Add, String PN, String EM)
    {
        Last =LastName;
        First = FirstName;
        Add = Address;
        PN = PhoneNumber;
        EM = Email;
       // arCount=count;
    }
    
    public void SetLN(String Last)
    {
        //this sets the last name - so that sub-classes can call it
        LastName = Last;
    }
    public void SetFN(String First) 
    {
        //this sets the first name
        FirstName = First;
    }
    public void SetAdd (String Add)
    {
        //this sets the address
        Address = Add;
    }
    public void SetPN(String PN)
    {
        // this sets the phone number
        PhoneNumber = PN;
    }
    public void SetEM (String EM)
    {
        //this sets the Email
        Email = EM;
    }
    public void SetCount(int arCount)
    {
    //    count= arCount;
    }
    public String getLastName()
    {
        //gets the lastname
        return LastName;
    }
    public String getFirstName()
    {
        //gets the first name
        return FirstName;
    }
    public String getAddress()
    {
        //gets the address
        return Address;
    }
    public String getPhoneNumber()
    {
        //gets the phone number
        return PhoneNumber;
    }
    public String getEmail() 
    {
        //gets the email
        return Email;
    }
  /*  public int getCount()
    {
    //    return count;
    }*/
    @Override
    public String toString()
    {
        // this is called by the subclasses so that they can print out the fields
        return String.format("%s %s %s", getLastName(),getFirstName(),printArray(bill));
    }
    public void printContacts(ArrayList arl)
    {
        System.out.print("this is a test");
    }
    public void setArray(ArrayList jeff)
    {
      
      bill.add(jeff);
      printArray(jeff);
        
    }
  
    public ArrayList<Integer> printArray(ArrayList Jeff)
    {
        ArrayList tom = new ArrayList(bill);
        

        for (Object tom1 : tom) {
          tom1.toString();
          
          return tom;
        }
       
          return tom;
    }
}
