public class Loops {
    public static void main(String[] args){
        int[] numbers = new int[] {1,5,7,9,12};

        System.out.println(sumOfTable(numbers));
    }
    public static int sumOfTable (int table[]){
        int sumOfNumbers = 0;
        for (int i = 0; i < table.length; i++) {
            sumOfNumbers = sumOfNumbers + table[i];
        }
        return sumOfNumbers;
    }
}
