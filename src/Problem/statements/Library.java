package Problem.statements;

import java.util.ArrayList;
import java.util.*;

public class Library
{
    private ArrayList<Book> bookList=new ArrayList<Book>();

    public void addBook(Book bObj)
    {
        bookList.add(bObj);
    }
    public boolean isEmpty(){
        return bookList.isEmpty();
    }
    public ArrayList<Book> viewAllBooks(){
        return bookList;
    }
    public ArrayList<Book> viewBooksByAuthor(String author){
        ArrayList<Book> result=new ArrayList<Book>();
        Iterator it=bookList.iterator();
        while(it.hasNext())
        {
            Book b=(Book)it.next();
            if(b.getAuthor().equalsIgnoreCase(author))
                result.add(b);
        }
        return result;
    }
    public int countNoOfBook(String bName){
        int count=0;
        Iterator it=bookList.iterator();
        while(it.hasNext())
        {
            Book b=(Book)it.next();
            if(b.getBookName().equalsIgnoreCase(bName))
                count++;
        }
        return count;
    }
    public Book searchIsbnNo(int isbnNo)
    {
        Iterator itr = bookList.iterator();
        while (itr.hasNext()) {
            Book b=(Book)itr.next();
            if (isbnNo ==b.getIsbnNo()) {
                return b;
            }
        }
        return null;
    }
}
