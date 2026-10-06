import myClass.DB_Element;
import myClass.User;
import myClass.Book;
import DataBase.LibDB;
import java.util.*;

/**
 * MyApp 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class MyApp
{
    public static void main(String[] args){

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
    public static void printLoanList(__ loanDB)
    {
        // 여기에 코드를 작성하세요
        return y;
    }

}