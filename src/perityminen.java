import java.util.Scanner;

public class perityminen {

    public static void main(String[] args) {
        final int MAX = 10;
        int[] numero = new int[MAX];
        int kokonaisluku;
        int i = 0;
        int b = 1;

        do {
            try {
                kokonaisluku = pyydäKokonaisluku(b);


                numero[i] = kokonaisluku;
                i++;
                b++;

            } catch (NumberFormatException e) {
                System.out.println("Syötä kokonaisluku numeronäppäimillä!");
            }


        }
        while (i < MAX);
        {
            System.out.print(numero[c] + " ");

        }
        System.out.println("LUVUT:");
        for (int c = 0; c < MAX; c++)


    }

    public static int pyydäKokonaisluku(int b) throws NumberFormatException {
        Scanner input = new Scanner(System.in);
        String syöte;
        int luku = 0;

        System.out.print("Anna " + b + ". luku: ");

        try {
            syöte = input.nextLine();
            if (syöte.contains("+")) {
                syöte = "asd";
            }
            luku = Integer.parseInt(syöte);


        } catch (NumberFormatException e) {

            throw e;
        }
        return luku;


    }


}

