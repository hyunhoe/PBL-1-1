package myClass;

/**
 * DB_Element 추상 클래스를 상속받는 Book 클래스.
 *
 * @author (2022320029_이상민)
 * @version (26.10.06)
 */
public class Book extends DB_Element
{
    private String author; 
    private String bookID; 
    private String publisher;
    private String title;
    private int year;

    /**
     * Book 객체를 생성하고 속성을 초기화하는 생성자.
     * 
     * @param author 책의 저자
     * @param bookID 책의 고유 식별 번호
     * @param publisher 출판사
     * @param title 책 제목
     * @param year 출판년도
    */
    public Book(String author, String bookID, 
    String publisher, String title, int year)
    {
        this.author = author;
        this.bookID = bookID;
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }

    /**
     * getID 메소드 - 책의 고유 식별자를 반환.
     * @return    bookID 문자열
     */
    public String getID()
    {
        return bookID;
    }

    /**
     * toString 메소드 - 객체의 정보를 실행 결과 화면의 형식에 맞추어 문자열로 반환.
     *
     * @return    "(bookID) title, author, publisher, year" 형식의 문자열.
     */
    public String toString()
    {
        return "(" + bookID + ") " + title + ", " + 
                author + ", " + publisher + ", " + year;
    }

}