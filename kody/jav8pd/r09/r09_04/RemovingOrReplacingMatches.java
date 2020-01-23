package r09.r09_04;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemovingOrReplacingMatches {
    public static void main(String[] args) {
        Pattern commas = Pattern.compile("\\s*,\\s*");
        CharSequence input = "Piotr , Pawe³,  Maria";
        String[] tokens = commas.split(input);
        System.out.println(Arrays.toString(tokens));
        
        Stream<String> tokenStream = commas.splitAsStream(input);
        System.out.println(tokenStream.collect(Collectors.toList()));
        
        Matcher matcher = commas.matcher(input);
        String result = matcher.replaceAll(",");
        System.out.println(result);
        
        Pattern time = Pattern.compile("(\\d{1,2}):(\\d{2})");
        matcher = time.matcher("3:45");
        result = matcher.replaceAll("$1 godzin i $2 minut");
        System.out.println(result);
        
        result = "3:45".replaceAll(
                "(?<godzin>\\d{1,2}):(?<minut>\\d{2})", 
                "${godzin} godzin i ${minut} minut");
        System.out.println(result);        
    }
}
