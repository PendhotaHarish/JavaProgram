package Problem.statements;

import java.util.ArrayList;
import java.util.Iterator;

public class PhoneBook
{
    ArrayList<Contact> contactList=new ArrayList<Contact>();

    public boolean isEmpty()
    {
        return contactList.isEmpty();
    }
    public void addPhone(Contact con)
    {
        contactList.add(con);
    }
    public ArrayList<Contact> viewAllContacts()
    {
        return contactList;
    }
    public Contact searchContactByGivenPhoneNo(long phoneNumber)
    {
       Iterator itr = contactList.iterator();
        while (itr.hasNext()) {
            Contact c = (Contact) itr.next();
            if (phoneNumber == c.getPhoneNo())
                return c;
        }
        return null;
    }
    public ArrayList<Contact> searchContactByFirstName(String firstName)
    {
        ArrayList<Contact> res=new ArrayList<Contact>();
        Iterator it=contactList.iterator();
        while(it.hasNext())
        {
            Contact obj=(Contact)it.next();
            if(obj.getFirstName().equalsIgnoreCase(firstName))
            {
                res.add(obj);
            }
        }
        return res;
    }
    public boolean removeContact(long phoneNumber)
    {
        boolean f=false;
        for(Contact obj2:contactList)
        {
            if(obj2.getPhoneNo()==phoneNumber)
            {
                f=true;
                contactList.remove(obj2);
                break;
            }
        }
        return f;
    }
}
