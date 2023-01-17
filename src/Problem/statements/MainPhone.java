package Problem.statements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainPhone
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        PhoneBook pb=new PhoneBook();
        for(int i=0;i<=50;i++)
        {
            System.out.println("1. Add Contact:");
            System.out.println("2. Display all Contacts:");
            System.out.println("3. Search Contact details by FirstName:");
            System.out.println("4. Search Contact by PhoneNumber:");
            System.out.println("5. Remove Contact");
            System.out.println("6. Exit:");
            System.out.println("Enter your choice:");
            int n=Integer.parseInt(sc.nextLine());
            if(n==1)
            {
                Contact ct=new Contact();
                System.out.println("Enter the FirstName:");
                if(sc.hasNext("[A-Za-z]{4,}"))
                {
                    ct.setFirstName(sc.nextLine());
                }
                else
                {
                    System.out.println("You enter invalid values");
                    break;
                }
                System.out.println("Enter the LastName:");
                if(sc.hasNext("[A-Za-z]{4,}"))
                {
                    ct.setLastName(sc.nextLine());
                }
                else
                {
                    System.out.println("You enter invalid values");
                    break;
                }
                System.out.println("Enter the PhoneNumber");
                if(sc.hasNext("[6,7,8,9][0-9]{9}"))
                {
                    long ph=Long.parseLong(sc.nextLine());
                    ct.setPhoneNo(ph);
                    if(pb.searchContactByGivenPhoneNo(ph)!=null)
                    {
                        System.out.println("These phone number already exist");
                        break;
                    }
                }
                 else {
                     System.out.println("Phone number should start with 6,7,8,9 and it should contain 10 numbers");
                     break;
                 }
                System.out.println("Enter the Email ID");
                if(sc.hasNext("[A-Za-z0-9]+[@][a-z]+[.][a-z]{2,3}"))
                {
                    ct.setEmailId(sc.nextLine());
                }
                else {
                    System.out.println("You enter invalid email id");
                    break;
                }
                pb.addPhone(ct);
            }
            else if(n==2)
            {
                ArrayList<Contact> res=pb.viewAllContacts();
                if(res.isEmpty())
                {
                    System.out.println("The list is empty");
                    continue;
                }
                Iterator itr=res.iterator();
                while(itr.hasNext())
                {
                    Contact ct=(Contact)itr.next();
                    System.out.println("FirstName: "+ct.getFirstName());
                    System.out.println("LastName: "+ct.getLastName());
                    System.out.println("PhoneNumber: "+ct.getPhoneNo());
                    System.out.println("EmailId: "+ct.getEmailId());
                }
            }
            else if(n==3)
            {
                System.out.println("Enter the firstname: ");
                String fName=sc.nextLine();
                ArrayList<Contact> res=pb.searchContactByFirstName(fName);
                if(res.isEmpty())
                {
                    System.out.println("No such name");
                    continue;
                }
                Iterator itr=res.iterator();
                while(itr.hasNext())
                {
                    Contact ct=(Contact)itr.next();
                    System.out.println("FirstName: "+ct.getFirstName());
                    System.out.println("LastName: "+ct.getLastName());
                    System.out.println("PhoneNumber: "+ct.getPhoneNo());
                    System.out.println("EmailId: "+ct.getEmailId());
                }
            }
            else if(n==4)
            {
                System.out.println("Enter the PhoneNo: ");
                Long pNum=Long.parseLong(sc.nextLine());
                Contact ct=pb.searchContactByGivenPhoneNo(pNum);
                    System.out.println("FirstName: "+ct.getFirstName());
                    System.out.println("LastName: "+ct.getLastName());
                    System.out.println("PhoneNumber: "+ct.getPhoneNo());
                    System.out.println("EmailId: "+ct.getEmailId());
            }
            else if(n==5)
            {
                System.out.println("Enter the Phone number to remove:");
                Long n1=Long.parseLong(sc.nextLine());
                System.out.println("Do you want to remove the contact(Y/N):");
                char ch=sc.nextLine().charAt(0);
                if(ch=='Y')
                {
                    boolean f1= pb.removeContact(n1);
                    if(f1)
                        System.out.println("The contact is successfully deleted");
                    else
                        System.out.println("Contact is not found");
                }
                if(ch=='N')
                {
                    System.out.println("ok");
                }
            } else if (n==6)
            {
                System.exit(0);
            }
            else{
                System.out.println("invalid number");
            }
        }
    }
}
