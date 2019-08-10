package java;

/**
 * <pre>
 * 보완 DNA(Complementary DNA) 클래스
 * </pre>
 *
 * @author pej
 * @version 1.0
 * @date 2019. 08. 10.
 * @rank 7kyu
 *
 */
public class DnaStrand {

    /**
     * <pre>
     * 보완 DNA(Complementary DNA)
     * 
     * DNA 스트링에서, 기호 "A"및 "T"는 "C"및 "G"와 같이 서로 상보 적이다.
     * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
     * </pre>
     * 
     * @author pej
     * @date 2019. 08. 10.
     * @param {String}
     *            문자열
     * @return {String} 문자열
     * @example DnaStrand.makeComplement("ATTGC") ==> "TAACG"
     *          DnaStrand.makeComplement("GTAT") ==> "CATA"
     */
    public static String makeComplement(String dna) {
        StringBuffer sb = new StringBuffer(dna);
        
        for (int i = 0; i < dna.length(); i++) {
            if ('A' == dna.charAt(i)) {
                sb.setCharAt(i, 'T');
            }
            
            if ('T' == dna.charAt(i)) {
                sb.setCharAt(i, 'A');
            }

            if ('C' == dna.charAt(i)) {
                sb.setCharAt(i, 'G');
            }

            if ('G' == dna.charAt(i)) {
                sb.setCharAt(i, 'C');
            }
        }

        return sb.toString();
    }
}
