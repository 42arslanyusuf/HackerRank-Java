package Strings._005_Anagrams;

import java.util.*;

public class Main{

public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        
        if (isAnagram(input1, input2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
        
    }
    
    public static boolean isAnagram(String input1, String input2){
        if (input1.length() != input2.length()) {
            return false;
        }
        
        HashMap<String, Integer> input1HashMap = helper(input1);
        HashMap<String, Integer> input2HashMap = helper(input2);
        
        return input1HashMap.equals(input2HashMap);
    }
    
    
    public static HashMap<String, Integer> helper(String input){
        HashMap<String, Integer> hashMap = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            String nowString = input.substring(i,i+1).toLowerCase();
            int repeatNowString = Collections.frequency(list, nowString);
            list.add(nowString);
            hashMap.put(nowString, repeatNowString);
        }
        
        return hashMap;
    }
}
