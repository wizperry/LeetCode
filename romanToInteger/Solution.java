package romanToInteger;

class Solution {
    public int romanToInt(String s) {
        int total = 0;

        for(int i = 0; i<s.length(); i++) {
            int currentValue = valueOf(s.charAt(i));

            if (i < s.length() - 1) {
                int nextValue = valueOf(s.charAt(i + 1));

                if (currentValue < nextValue) {
                    total -= currentValue;
                } else {
                    total += currentValue;
                }
            } else {
                total += currentValue; // last symbol has no next symbol
            }

        }
        return total;
    }

    private int valueOf(char symbol) {
        switch (symbol) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}