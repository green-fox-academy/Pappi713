public class String3 {
    public static void main(String[] args) {
        System.out.println(stringExtender("alma"));
    }
    public static String stringExtender(String str) {
        if(str.length()<1){
            return str;
        }
        if(str.length()==1) {
            return str;
        }
        return str.charAt(0)+"*"+stringExtender(str.substring(1,str.length()));
    }

}

