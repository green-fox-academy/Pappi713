public class String2 {
    public static void main(String[] args) {
        // Given a string,
        // compute recursively a new string where
        // all the 'x' chars have been removed.
        System.out.println(xRemover("asfasfxewexx"));
    }

    public static String xRemover(String str) {
        if(str.length()==1 && str.charAt(0)=='x'){
            return "";
        }
        if(str.charAt(0)=='x' && str.length()!=1){
            str=""+str.substring(1);
            return xRemover(str);
        }
        if(str.length()==1){
            return str;
        }
        return str.charAt(0)+xRemover(str.substring(1,str.length()));
    }
}

