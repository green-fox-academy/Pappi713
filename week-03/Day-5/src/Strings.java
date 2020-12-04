public class Strings {
    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) a new string where
        // all the lowercase 'x' chars have been changed to 'y' chars.

        System.out.println(stringConverter("xxdwxkayfegbvbk xk yj0"));

    }

    public static String stringConverter(String str) {
        if(str.length()<1){
            return str;
        }
        if(str.charAt(0)=='x'){
            str="y"+str.substring(1);
        }
        return str.charAt(0)+stringConverter(str.substring(1,str.length()));

    }
}
