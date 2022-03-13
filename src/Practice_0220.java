public class Practice_0220 {
    public static void main(String[] args) {
        String a1 = "boy";
        System.out.println(Plural.toPlural(a1));
    }
}

class Plural {
    public static String toPlural(String x) {
        if (isSuffix(x, "s") || isSuffix(x, "ss") || isSuffix(x, "sh") || isSuffix(x, "ch") || isSuffix(x, "x") || isSuffix(x, "z")) {
            x = x + "es";
            return x;
        } else if(isSuffix(x,"ay")==false&&isSuffix(x,"ey")==false&&isSuffix(x,"iy")==false&&isSuffix(x,"oy")==false&&isSuffix(x,"uy")==false){
            x = x.substring(0,x.length()-1);
            x = x + "ies";
        } else{
            x = x + "s";
        }
        return x;
    }

    public static boolean isSuffix(String x, String suf) {
        if (x.indexOf(suf) == x.length() - suf.length()) {
            return true;
        }
        return false;
    }
}
