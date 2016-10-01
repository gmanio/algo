/**
 * Created by Park on 2016-10-01.
 */
public class BoyerMoore {
    private final String text;
    private final String pattern;
    private final int textLength;
    private final int patternLength;

    public BoyerMoore(String text, String pattern) {
        this.text = text;
        this.pattern = pattern;

        this.textLength = text.length();
        this.patternLength = pattern.length();
    }

    public boolean search() {
        char[] arrText = this.text.toCharArray();
        char[] arrPattern = this.pattern.toCharArray();

        int skip;

        for (int i = 0; i < this.textLength - this.patternLength; i += skip) {
            skip = 0;
            print(i);
            for (int j = this.patternLength - 1; j >= 0; j--) {
                if (arrText[i + j] == arrPattern[j]) {

                } else {
                    while (skip == j) {
                        skip += 1;

                        if (arrText[i + this.patternLength - 1] == arrPattern[this.patternLength - 1 - skip]){
                            break;
                        }
                    }
                }
            }

            if(skip == 0){
                return true;
            }
        }

        return false;
    }

    public void print(int blank) {
        System.out.println(this.text);
        for (int i = 0; i < blank; i++) {
            System.out.printf(" ");
        }
        System.out.println(this.pattern);
    }
}


