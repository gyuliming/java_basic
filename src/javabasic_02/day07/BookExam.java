package javabasic_02.day07;

public class BookExam {
    public static void main(String[] args) {
        Book 혼모노 = new Book();
        혼모노.title = "혼모노";
        혼모노.author = "성해나";
        혼모노.company = "창비";
        혼모노.price = 18000;
        혼모노.page = 368;
        혼모노.isbn = "9788936439743";

        System.out.printf("""
                제목 : %s
                저자 : %s
                회사 : %s
                가격 : %d
                페이지 : %d
                isbn : %s
                """,
                혼모노.title, 혼모노.author, 혼모노.company, 혼모노.price, 혼모노.page, 혼모노.isbn);
    }
}
