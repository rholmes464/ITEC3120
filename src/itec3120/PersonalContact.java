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
public class PersonalContact extends mainAbstract{
    private String DateOfBirth;

    public PersonalContact(String Last, String First, String Add, String PN, String EM, String DOB) {
        super(Last, First, Add, PN, EM);
        DateOfBirth = DOB;
    }
    
    private void setPersonal(String DOB)
    {
        DateOfBirth = DOB;
    }
    public void SetDOB(String DOB)
    {
        DateOfBirth = DOB;
    }
    public String getDOB()
    {
        return DateOfBirth;
    }
    @Override
    public String toString()
    {
        return String.format("%s %s", getDOB(), super.toString());
    }
}
