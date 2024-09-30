import java.util.*;
public class push{

    
    public static void reverse(String str){
        Stack<Character> s=new Stack<>();
        int i=0;
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
            
        }
    }

    public static void main(String[] args) {
        String str="abc";
        reverse(str);
    }
}