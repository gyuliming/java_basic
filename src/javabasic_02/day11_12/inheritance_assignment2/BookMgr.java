package javabasic_02.day11_12.inheritance_assignment2;

public class BookMgr {

	Book[] booklist = new Book[5];

	public BookMgr (Book[] booklist) {
		for (int i = 0; i < booklist.length; i++) {
			this.booklist[i] = booklist[i];
		}
	}

	public void printBooklist(){
        for (Book book : booklist) {
            System.out.println(book.getTitle());
        }
	}

	public void printTotalPrice(){
		int sum = 0;
        for (Book book : booklist) {
            sum += book.getPrice();
        }
		System.out.println("전체 책 가격의 합 : " + sum);
	}
}
