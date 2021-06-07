
public class Palindrome {

    public static void main(String args[]){
        String str="aba";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        int n=str.length();
        if(n==0)
            return true;
        return isPalRec(str,0,n-1);
    }

    private static boolean isPalRec(String str, int f, int l) {
        //if there is only one character
        if(f==l)
            return true;
        //if first and last do not match
        if(str.charAt(f)!=str.charAt(l))
            return false;
        //if there is more then two
        //characters ,check if
        //meddle substring is also palimdrome
        //or not
        if(f<l+1)
            return isPalRec(str,f+1,l-1);
        return true;
    }
}
//only one string
//two string
//more then one