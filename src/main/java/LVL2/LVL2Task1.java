package LVL2;

import java.util.Scanner;
import java.util.Stack;

public class LVL2Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string to validate, if you want to stop press S");
        while (true) {
            String line = in.nextLine();
            if (line.equals("S")) {
                break;
            }
            if (isValid(line) == true) {
                System.out.println("Input string is valid");
            } else System.out.println("Input string is invalid");
        }
    }
    public static boolean isValid(String input) {
        Stack stack = new Stack();
        String[] symbols = input.split("");
        for (String symb : symbols
        ) {
            if ((symb.equals("(")) || (symb.equals(")")) || (symb.equals("{"))
                    || (symb.equals("}")) || (symb.equals("[")) || (symb.equals("]"))) {
                if ((symb.equals("(")) || (symb.equals("{")) || (symb.equals("["))) {
                    stack.push(symb);
                } else {
                    switch (symb) {
                        case ")":
                            symb = "(";
                            break;
                        case "}":
                            symb = "{";
                            break;
                        case "]":
                            symb = "[";
                            break;
                    }
                    if (stack.empty()) {
                        return false;
                    }
                    if (stack.lastElement().equals(symb)) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }

}
