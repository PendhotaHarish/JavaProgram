package Problem.statements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Library lib=new Library();
        for(int i=0;i<50;i++){
            System.out.println("1.Add Book");
            System.out.println("2.Display all book details");
            System.out.println("3.Search Book by author");
            System.out.println("4.Count number of books - by book name");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            int choice=Integer.parseInt(s.nextLine());
            if(choice==1){
                Book b=new Book();
                System.out.println("Enter the isbn no:");
                int isb=Integer.parseInt(s.nextLine());
                b.setIsbnNo(isb);
                if(lib.searchIsbnNo(isb)!=null)
                {
                    System.out.println("These IsbnNo already exist");
                    break;
                }
                System.out.println("Enter the book name:");
                b.setBookName(s.nextLine());
                System.out.println("Enter the author name:");
                b.setAuthor(s.nextLine());
                lib.addBook(b);
            }
            else if(choice==2){
                ArrayList<Book> result=lib.viewAllBooks();
                if(result.isEmpty())
                {
                    System.out.println("The list is empty");
                    continue;
                }
                Iterator it=result.iterator();
                while(it.hasNext())
                {
                    Book b=(Book)it.next();
                    System.out.println("Isbn No: "+b.getIsbnNo());
                    System.out.println("Book name:"+b.getBookName());
                    System.out.println("Author name: "+b.getAuthor());
                }
            }
            else if(choice==3){
                System.out.println("Enter the author name:");

                String name=s.nextLine();
                ArrayList<Book> result=lib.viewBooksByAuthor(name);
                if(result.isEmpty()){
                    System.out.println("None of the book published by the author "+name);
                    continue;
                }
                Iterator it=result.iterator();
                while(it.hasNext()){

                    Book b=(Book)it.next();
                    System.out.println("Isbn no: "+b.getIsbnNo());
                    System.out.println("Book name: "+b.getBookName());
                    System.out.println("Author name: "+b.getAuthor());
                }
            }
            else if(choice==4){
                System.out.println("Enter the book name");
                String name=s.nextLine();
                System.out.println("Count is "+lib.countNoOfBook(name));
            }
            else if(choice==5)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("invalid choice");
            }
        }
    }
}