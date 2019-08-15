package com.codewars.java;

/**
 * <pre>
 * 논리자료형변환 클래스
 * </pre>
 *
 * @author pej
 * @version 1.0
 * @date 2019. 08. 15.
 * @rank 8kyu
 *
 */
public class YesOrNo {
    
    /**
     * <pre>
     * 논리자료형변환(Convert boolean values to strings 'Yes' or 'No')
     * 
     * 부울 값을 가져 와서 "예"문자열을 true로, "아니오"문자열을 false로 리턴하는 메소드를 완료하십시오.
     * Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
     * </pre>
     * 
     * @author pej
     * @date 2019. 08. 15.
     * @param {boolean} true / false
     * @return {String} Yes / No
     * @example boolToWord(true) ==> "Yes"
     *          boolToWord(false) ==> "No"
     */
    public static String boolToWord(boolean b) {
        return (b == true) ? "Yes" : "No";
        // 방법2) 다른 사람이 한 것
        // return b ? "Yes" : "No";
    }
}
