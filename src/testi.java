import java.util.*;
import java.text.DecimalFormat;
public class Hakulistalta2 {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        ArrayList<String> sanat = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {

            System.out.println("Kirjoita sana " + i +"/5: ");
            sanat.add(lukija.nextLine());


            //System.out.println("Löytyi " + kaikkiOsumat + " osumaa: " + osuma);


        }
        System.out.println("Anna etsittävä termi:" );
        String termi = lukija.nextLine();

        int j = 0;
        String[] lista = new String[j];

        for(int i = 0; i <= 5; i++) {


            if(termi.contains(sanat.get(i))) {

                j++;
                lista[j] = termi;
                System.out.println(sanat.get(i));


            }
        }

    }

}



