import myClass.DB_Element;
import myClass.User;
import myClass.Book;
import DataBase.LibDB;
import java.util.*;

/**
 * 도서관 대출 시스템을 실행하는 메인 클래스.
 * User 및 Book DB를 생성하고, 대출 처리 및 현황을 출력.
 *
 * @author (2022320029_이상민)
 * @version (26.10.06)
 */
public class MyApp
{
     /**
     * main - 프로그램의 주 진입점 메소드.
     *
     * @param  db  출력할 데이터베이스
     */
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
        
        System.out.println("----- 이용자 목록 출력 -----");
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
        
        System.out.println("----- 책 목록 출력 -----");
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
        Book loanBook3 = bookDB.findElement("B04");
        if(loanUser3 != null && loanBook3 != null){
            loanDB.put(loanUser3, loanBook3);
        }
        
        System.out.println("----- 대출 현황 -----");
        printLoanList(loanDB);
        System.out.println("--------------------");
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
     * printLoanList - 대출 DB에 저장된 대출 현황을 출력하는 메소드.
     *
     * @param  loanDB 출력할 대출 정보가 담긴 HashMap(Key: User, Value: Book)
     * 
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