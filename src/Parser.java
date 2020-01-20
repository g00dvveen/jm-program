import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class Parser {
    public static String HandleInput() throws Exception {

        String s = "0 / 9";

        s = s.replaceAll(" ", "");

        Pattern pattern = Pattern.compile("(\\d+)([*/+-])(\\d+)");

        Matcher matcher = pattern.matcher(s);

        if ( matcher.matches() ) {
            if (matcher.end() == 3) {
                int x = parseInt(matcher.group(1));
                int y = parseInt(matcher.group(3));
                Integer result = 0;
               switch( matcher.group(2) ) {
                    case ("+") : result = Operation.Addition(x, y); break;
                    case ("-") : result = Operation.Subtraction(x, y); break;
                    case ("/") : result = Operation.Division(x, y); break;
                    case ("*") : result = Operation.Multiplication(x, y); break;
                }
                System.out.println(result);
            }
        } else {
            pattern = Pattern.compile("(\\w+)([*/+-])(\\w+)");
            matcher = pattern.matcher(s);
            if ( matcher.matches() ) {
                int x = Converter.ConvertRomanToInt(matcher.group(1));
                int y = Converter.ConvertRomanToInt(matcher.group(3));
                Integer result = 0;
                switch (matcher.group(2)) {
                    case ("+"):
                        result = Operation.Addition(x, y);
                        break;
                    case ("-"):
                        result = Operation.Subtraction(x, y);
                        break;
                    case ("/"):
                        result = Operation.Division(x, y);
                        break;
                    case ("*"):
                        result = Operation.Multiplication(x, y);
                        break;
                }
                System.out.println(Converter.ConvertIntToRoman(result));
            }
        }
    }
}
