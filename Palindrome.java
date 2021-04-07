public class Palindrome{
    public static boolean is_palindrome(String s1)
    {
       char ch[]=s1.toCharArray();  
    String rev="";  
    for(int i=ch.length-1;i>=0;i--){  
        rev+=ch[i];  
    }
    if(rev==s1){return true;}
    else return false;
    }
}
