package myClass;

/**
 * DB_Element 추상 클래스를 상속받는 User 클래스.
 *
 * @author (2022320029_이상민)
 * @version (2026.10.06)
 */
public class User extends DB_Element
{
    private String name;
    private Integer stID;

    /**
     * User 객체를 생성하고 속성을 초기화하는 생성자.
     * 
     * @param stID 이용자의 고유 식별 번호.
     * @param name 이용자의 이름.
     */
    public User(int stID, String name)
    {
        this.stID = stID;
        this.name = name;
    }

    /**
     * getID 메소드 - stID를 문자열로 변환해 반환.
     *
     * @return   stID를 변환한 문자열.
     */
    public String getID()
    {
        return String.valueOf(stID);
    }

    /**
     * toString 메소드 - 객체의 정보를 실행 결과 화면의 형식에 맞추어 문자열로 반환.
     *
     *
     * @return    "[stID] name" 형식의 문자열.
     */
    public String toString()
    {
        return "[" + stID + "] " + name; 
    }

}