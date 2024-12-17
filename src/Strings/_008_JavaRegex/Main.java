package Strings._008_JavaRegex;


public class Main {

}
class MyRegex {
    String regexString = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
    public String pattern = regexString + "\\." + regexString + "\\." + regexString + "\\." + regexString;

}
