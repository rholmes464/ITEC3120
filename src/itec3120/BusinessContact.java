/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itec3120;

/**
 *
 * @author richardholmes
 */
public class BusinessContact extends mainAbstract{
    private String JobTitle;
    private String Organization;

    public BusinessContact(String Last, String First, String Add, String PN, String EM,String JT, String ORG) {
        super(Last, First, Add, PN, EM);
        JobTitle = JT;
        Organization = ORG;
    }
    

    public void SetJT(String JT)
    {
        JobTitle = JT;
    }
    public void SetORG(String ORG)
    {
        Organization = ORG;
    }
    public String getJT()
    {
        return JobTitle;
    }
    public String getORG()
    {
        return Organization;
    }

    @Override
    public String toString()
    {
        return String.format("%s %s ", getJT(), getORG(), super.toString());
    
        
    }
}
