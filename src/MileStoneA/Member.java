package MileStoneA;

public class Member extends User{
    private int borrowedBooksCount;
    final int MAX_BORROW_LIMIT=5;

    @Override
    void displayDashboard(){
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed");


    }

    @Override
    boolean canBorrowBooks(){

        return borrowedBooksCount < MAX_BORROW_LIMIT;
   }

    public void setBorrowedBooksCount(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }
}
