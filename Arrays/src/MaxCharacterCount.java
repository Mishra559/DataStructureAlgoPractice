import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxCharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        maxCharCount(str);
    }

    private static void maxCharCount(String str){
        int n = str.length();
        str = str.toLowerCase();
       Map<Character,Integer> map = new LinkedHashMap<>();
       for(int i=0;i<n;i++){
           char ch = str.charAt(i);
           if(map.containsKey(ch)){
               map.put(ch,map.get(ch)+1);
           }
           else{
               map.put(ch,1);
           }
       }
       int max = 0;
       char maxChar = str.charAt(0);
       for(Character key:map.keySet()){
           if(map.get(key)>max){
               max = map.get(key);
               maxChar = key;
           }
       }

       System.out.println(max);
       System.out.println(maxChar);
    }
}
