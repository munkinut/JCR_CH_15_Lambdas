package net.munki.play.lambdas;

interface StringFunc {
    String func(String n);
}

class LambdasAsArgumentsDemo {
    
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String args[]) {
        
        String inStr = "Lamdas add power to Java";
        String outStr;
        System.out.println("Here is the input string: " + inStr);

        // Simple expression lambda
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Uppercase: " + outStr);

        // Block lambda
        outStr = stringOp((str) -> {
            String result = "";
            int i;
            for (i = 0; i < str.length(); i++)
            if(str.charAt(i) != ' ')
                result += str.charAt(i);
            return result;
        }, inStr);
        System.out.println("Spaces removed: " + outStr);

        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("Reversed: " + stringOp(reverse, inStr));
    }
}
