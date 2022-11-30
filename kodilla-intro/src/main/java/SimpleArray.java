public class SimpleArray {
    public static void main (String[] args){
        String[] books = new String[5];
        books[0] = "O czym szumą wierzby";
        books[1] = "Akademia";
        books[2] = "Krzyżacy";
        books[3] = "Jesień";
        books[4] = "Lato";

        String thirdElement = books[3];
        System.out.println(thirdElement);

        int numberOfElements = books.length;
        System.out.print("Moja tablica zawiera ");
        System.out.print(numberOfElements);
        System.out.println(" elementów");
    }
}
