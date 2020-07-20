package com.sigma.godalin;

public class Alphabet {

    private char[] letters;

    private static boolean isVaild(String letters) {
        char[] ls = letters.toCharArray();
        for(int i=0;i<ls.length;i++) {
            for (int j = i + 1; j < ls.length; j++) {
                if (ls[i] == ls[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public Alphabet(String letters) throws Exception {
        if (isVaild(letters)) {
            this.letters = letters.toCharArray();
        }else {
            throw new Exception("invalid alphabet");
        }
    }

    public char[] getLs() {
        return  this.letters;
    }
}
