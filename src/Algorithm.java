import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

/**
 * Created by Park on 2016-09-30.
 */
public class Algorithm {
    public static void main(String args[]) {
//        printReverse();
//        printBinarySearch();
        printBoyerMoore();
    }

    public static void printReverse() {
        String src = "abcdefgh";
        ReverseString rs = new ReverseString();

        for (int i = 0; i < src.length(); i++) {
            System.out.println(i + " " + String.valueOf(rs.reverse(src)[i]));
        }
    }

    public static void printBinarySearch() {
        BinarySearch bs = new BinarySearch();

        int[] src = bs.generateRandomArray(5);


        bs.sort(src);
        System.out.printf(String.valueOf(bs.binarySearch(5, 0, src.length, src)));
    }

    public static void printBoyerMoore(){
        String text = "GCAGAABCDEFGATGCAGAGAG";
        String pattern = "GCAGAGAG";

        BoyerMoore bm = new BoyerMoore(text, pattern);

        System.out.println(String.valueOf(bm.search()));

    }
}
