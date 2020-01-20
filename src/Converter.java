public class Converter {
    public static Integer ConvertRomanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = GetValue(s.charAt(i));

            if (i + 1 < s.length()) {
                int s2 = GetValue(s.charAt(i + 1));

                if (s1 >= s2) {
                    result = result + s1;
                } else {
                    result = result + s2 - s1;
                    i++;
                }
            } else {
                result = result + s1;
                i++;
            }
        }

        return result;
    }

    public static String ConvertIntToRoman(Integer n) {
            String x[] = {"", "X", "XX", "XXX", "XL", "L",
                    "LX", "LXX", "LXXX", "XC"};
            String i[] = {"", "I", "II", "III", "IV", "V",
                    "VI", "VII", "VIII", "IX"};

            String tens = x[(n%100)/10];
            String ones = i[n%10];

            String s = tens + ones;

            return s;
    }

    private static Integer GetValue(char ch) {
        int x;
        switch (ch) {
            case 'I' : x = 1; break;
            case 'V' : x = 5; break;
            case 'X' : x = 10; break;
            default : x = -1;
        }
        return x;
    }
}
