package MileStoneA;

import java.awt.print.Book;

public class Librarian extends User{

    private String employeeNumber;


    @Override
    void displayDashboard(){
        System.out.println("Librarian display dashboard"+ " " +employeeNumber);
    }
    @Override
    boolean canBorrowBooks(){

        return true;
    }

    void addNewBook(Book book){
        //comme
    }
    void removeBook(Book book){
        //
    }
}
