import java.util.function.IntUnaryOperator;

public class Main {
    // write the nextOddNum here
    public static NextOddNumInter nextOddNum = (num) -> {
        int numMutator = num+1;
        while (numMutator % 2 == 0) {
            numMutator += 1;
        }
        return numMutator;
    };

    
    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;
        int num3 = 20;

        System.out.println(nextOddNum.applyAsInt(num)); // 7
        System.out.println(nextOddNum.applyAsInt(num2)); // 11
        System.out.println(nextOddNum.applyAsInt(num3)); // 21
    }
}

@FunctionalInterface
interface NextOddNumInter {
    Integer applyAsInt(int num);
}


