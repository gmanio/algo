/**
 * Created by Park on 2016-09-30.
 */
public class ReverseString {
    public char[] reverse(String src) {
        char[] srcArray = src.toCharArray();

        int length = srcArray.length;

        for (int i = 0; i < length / 2; i++) {
            char temp;

            temp = srcArray[i];
            srcArray[i] = srcArray[length - i - 1];
            srcArray[length - i - 1] = temp;
        }

        return srcArray;
    }
}
