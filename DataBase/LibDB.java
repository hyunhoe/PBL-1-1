package DataBase;
import java.util.*;

/**
 * LibDB : USer, Book 클래스에 사용될 데이터 베이스 생성ㅇ아이고
 *
 * @author (2023320023 이현회)
 * @version (2026.10.06)
 */
public class LibDB<T>
{
    private ArrayList<T> db;

    /**
     * LibDB 클래스의 객체 생성자
     */
    public LibDB()
    {
        this.db = new ArrayList<T>();
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public void addElement(T element)
    {
        db.add(element);
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public T findElement(String ID)
    {
        Iterator<T>it = db.iterator();
        while(it.hasNext()){
            T element = it.next();
            if(ID == element){
                return element;
            }
        }
        return null; // 아무것도 반환이 안됨
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void printAllElements()
    {
        System.out.println();
    }

}