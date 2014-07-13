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
        LastName = Last;
    }
    public void SetFN(String First) 
    {
        FirstName = First;
    }
    public void SetAdd (String Add)
    {
        Address = Add;
    }
    public void SetPN(String PN)
    {
        PhoneNumber = PN;
    }
    public void SetEM (String EM)
    {
        Email = EM;
    }
    public void SetCount(int arCount)
    {
    //    count= arCount;
    }
    public String getLastName()
    {
        return LastName;
    }
    public String getFirstName()
    {
        return FirstName;
    }
    public String getAddress()
    {
        return Address;
    }
    public String getPhoneNumber()
    {
        return PhoneNumber;
    }
    public String getEmail() 
    {
        return Email;
    }
  /*  public int getCount()
    {
    //    return count;
    }*/
    @Override
    public String toString()
    {
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
