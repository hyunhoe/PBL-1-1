import myClass.DB_Element;
import myClass.User;
import myClass.Book;
import DataBase.LibDB;
import java.util.*;

/**
 * 도서관 대출 시스템을 실행하는 메인 클래스.
 *
 * @author (2022320029_이상민)
 * @version (26.10.06)
 */
public class MyApp
{
    public static void main(String[] args){
        LibDB<User> userDB = new LibDB<>();
        LibDB<Book> bookDB = new LibDB<>();
        HashMap<User, Book> loanDB = new HashMap<>();
        
        User user1 = new User(2025320001, "Kim");
        User user2 = new User(2024320002, "Lee");
        User user3 = new User(2023320003, "Park");
        
        userDB.addElement(user1);
        userDB.addElement(user2);
        userDB.addElement(user3);
        
        System.out.println("이용자 목록 출력");
        printDB(userDB);
        System.out.println();
        
        Book book1 = new Book("홍길동", "B01", "ABC", "Java Programming", 2000);
        Book book2 = new Book("profsHwang", "B02", "SMU", "Software Analysis and Design", 2023);
        Book book3 = new Book("황기태", "B03", "생능출판", "명품 자바프로그래밍", 2025);
        Book book4 = new Book("profsHwang", "B04", "SMU", "소프트웨어테스트", 2024);
        
        bookDB.addElement(book1);
        bookDB.addElement(book2);
        bookDB.addElement(book3);
        bookDB.addElement(book4);
        
        System.out.println("책 목록 출력");
        printDB(bookDB);
        System.out.println();
        
        User loanUser1 = userDB.findElement("2025320001");
        Book loanBook1 = bookDB.findElement("B02");
        if(loanUser1 != null && loanBook1 != null){
            loanDB.put(loanUser1, loanBook1);
        }
        
        User loanUser2 = userDB.findElement("2024320002");
        Book loanBook2 = bookDB.findElement("B03");
        if(loanUser2 != null && loanBook2 != null){
            loanDB.put(loanUser2, loanBook2);
        }
        
        User loanUser3 = userDB.findElement("2023320003");
        Book loanBook3 = bookDB.findElement("B02");
        if(loanUser3 != null && loanBook3 != null){
            loanDB.put(loanUser3, loanBook3);
        }
        
        System.out.println("대출 현황");
        printLoanList(loanDB);

    }

    /**
     * printDB - 책 DB 또는 이용자 DB의 모든 요소를 출력하는 메소드
     *
     * @param  db  출력할 데이터베이스
     */
    public static <T extends DB_Element> void printDB(LibDB db)
    {
        db.printAllElements();
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public static void printLoanList(HashMap<User, Book> loanDB)
    {
        Iterator<User> it = loanDB.keySet().iterator();
        
        while(it.hasNext()){
            User key = it.next();
            Book value = loanDB.get(key);
            
            System.out.println(key.toString() + " ===> " + value.toString());
        }
    }

}