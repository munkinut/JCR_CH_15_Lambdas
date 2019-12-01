package net.munki.play.lambdas;

// This cant be called StringFunc because StringFunc is 
// already defined in another file in this package.
interface StringFunc2 {
    String func(String n);
}

class LambdasAsArgumentsDemo {
    
    static String stringOp(StringFunc2 sf, String s) {
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

        StringFunc2 reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("Reversed: " + stringOp(reverse, inStr));
    }
}
