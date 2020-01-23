package r04.r04_03;

import java.util.Scanner;

public class Calculator2 {
    

    public static int eval(Operation op, int arg1, int arg2) {
        int result = 0;
        switch (op) { // UWAGA: brak 'break' wiêc zawsze wynikiem bêdzie dzielenie
            case ADD: result = arg1 + arg2;
            case SUBTRACT: result = arg1 - arg2;
            case MULTIPLY: result = arg1 * arg2;
            case DIVIDE: result = arg1 / arg2;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Pierwszy operand: ");
        int a = in.nextInt();
        System.out.print("Operator: ");
        String opSymbol = in.next();
        System.out.print("Drugi operand: ");
        int b = in.nextInt();
        for (Operation op : Operation.values()) {
            if (op.getSymbol().equals(opSymbol)) {
                System.out.println(eval(op, a, b));
            } 
        }
    }
}
