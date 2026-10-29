import java.util.Scanner;

public class client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String mode = sc.next();
        GoogleMap googleMap = new GoogleMap(mode);

        System.out.println(googleMap.calculatePath("New Delhi", "Jaipur"));

        GoogleMap googleMap1 = new GoogleMap(mode);
        System.out.println(googleMap1.calculatePath("ABC", "XYZ"));

        System.out.printf("DEBUG");
    }
}
