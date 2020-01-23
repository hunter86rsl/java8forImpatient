package r03.r03_01;

public class IntSequenceDemo {
    public static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;
        while (seq.hasNext() && count < n) {
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum / count;
    }

    public static void main(String[] args) {
        SquareSequence squares = new SquareSequence();
        double avg = average(squares, 100);
        System.out.println("�rednia pierwszych 100 kwadrat�w: " + avg);
        
        IntSequence digits = new DigitSequence(1729);
        while (digits.hasNext()) System.out.print(digits.next() + " ");
        System.out.println();
        
        digits = new DigitSequence(1729);
        avg = average(digits, 100);
            // B�dzie bra�o tylko cztery pierwsze warto�ci ci�gu
        System.out.println("�rednia cyfr: " + avg);
    }
}
