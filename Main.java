//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        Artist Hadi = new Artist("Afan");
        Artwork A = new Artwork("Eye",2024,Hadi);
        A.print();
        System.out.println();

        // Example of shallow copy
        Artwork B = A;
        B.print();
        System.out.println();

        // Example of deep Copy
        Artwork C = new Artwork(A);
        C.getArtist().setName("Ann e Zahra");
        C.print();
        System.out.println();
        A.print();
        }
}