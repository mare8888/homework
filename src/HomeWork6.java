import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.format;


public class HomeWork6 {
    public static void main(String[] args) {
        System.out.println(first());
        System.out.println(second().concat("World"));
        System.out.println(trird());
        System.out.println(middle());
        System.out.println(f("Vasya %s" , "Pupkin") + " Ingeneria");
        String s = "level";
        System.out.println(isPalindrome(s) ? "Это слово Палиндром" : "Это слово не палиндром");
        System.out.println(zvezda2());

    }

    // Задание 1
    public static String first(){
        String s = "Hello ";
        String s1 = "World";
        String s2 = s + s1;
        return s2;
    }
    public static String second(){
        String s = "Hello ";
        return s;
    }
    public static String trird(){
        String s = format("Hello%s", " World");
        return s;
    }
    // Задание 2
    public static String middle(){
        String s = "Concatenation";
        String s1 = (s.substring(5 ,7));
        return s1;
    }
    // Задание 3

    public static String f(String source, Object ...arg){
            return format(source, arg);
        }
    //Задание со звездочкой 1
    public static boolean isPalindrome(String s){
        if(s.length()==1 || s.length() == 0)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return  isPalindrome(s.substring(1, s.length()-1));
        return false;
    }

    //Задание со звездочкой 2
   public static boolean zvezda2(){
    String n = "+380637777777";

    Pattern pattern = Pattern.compile("^\\+");
    Matcher matcher = pattern.matcher(n);

        boolean d = matcher.find();
        return d;
    }


}



