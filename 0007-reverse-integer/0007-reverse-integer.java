class Solution {
public int reverse(int x) {
    int reversednum = 0;

    while (x != 0) {
        int digit = x % 10;
        x = x / 10;

        if (reversednum > Integer.MAX_VALUE / 10 || 
            (reversednum == Integer.MAX_VALUE / 10 && digit > 7)) {
            return 0;
        }
        if (reversednum < Integer.MIN_VALUE / 10 || 
            (reversednum == Integer.MIN_VALUE / 10 && digit < -8)) {
            return 0;
        }

        reversednum = reversednum * 10 + digit;
    }

    return reversednum;
}

}