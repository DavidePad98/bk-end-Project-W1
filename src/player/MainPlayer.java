package player;


import java.util.Objects;
import java.util.Scanner;

public class MainPlayer {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];


        for (int i = 0; i < elementi.length; i++) {
            System.out.println("cosa vuoi riprodurre? 1 audio, 2 video, 3 immagine, 0 per uscire");
            int num = scn.nextInt();
            scn.nextLine();

            if (num == 1) {
                System.out.println("hai selezionato audio");
            } else if (num == 2) {
                System.out.println("hai selezionato video");
            } else if (num == 3) {
                System.out.println("hai selezionato immagine");
            } else if (num == 0) {
                System.out.println("Arrivederci");
            } else System.out.println("errore hai selezionato un valore sbagliato! riprova");


//            if (num >= 1 && num <= 5) {
//                if ( instanceof RecAudio && elemento instanceof Video) {
//                    System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
//                    ((RecAudio) elemento).play();
//                } else if (elemento instanceof Immagine) {
//                    ((Immagine) elemento).show();
//                } else System.out.println("error 1");
//            } else if (num != 0) {
//                System.out.println("error 2");
//            }




            switch (num) {
                case 1:
                    System.out.println("inserici titolo audio:");
                    String title = scn.nextLine();
                    System.out.println("hai selezionato l' audio: " + title);
                    System.out.println("--------------");
                    System.out.println("inserisci la durata da riprodurre: ");
                    int durata = scn.nextInt();
                    System.out.println("volume: ");
                    int volume = scn.nextInt();
                    elementi[i] = new RecAudio(title, durata, volume);
                    ((RecAudio) elementi[i]).play();
                    break;
                case 2:
                    System.out.println("inserici titolo video:");
                    String titleV = scn.nextLine();
                    System.out.println("hai selezionato il video: " + titleV);
                    System.out.println("--------------");
                    System.out.println("inserisci la durata da riprodurre: ");
                    int durataV = scn.nextInt();
                    System.out.println("volume: ");
                    int volumeV = scn.nextInt();
                    System.out.println("a che luminosità desideri riprodurre il video?");
                    int luminositaV = scn.nextInt();
                    elementi[i] = new Video(titleV, luminositaV, durataV, volumeV);
                    ((Video) elementi[i]).play();


//                    System.out.println("desideri alzare il volume? S/N");
//                    String vUp = scn.nextLine();
//                    scn.nextLine();
//
//                    if (vUp == "s"){
//                        ((Video) elementi[i]).volumeUp();
//                    } else if (vUp == "n"){
//                        ((Video) elementi[i]).volumeDown();
//                    } else System.out.println("err");
//
//
//                    ((Video) elementi[i]).play();
                    
                    break;
                case 3:
                    System.out.println("inserici titolo immagine:");
                    String titleI = scn.nextLine();
                    System.out.println("hai selezionato l'immagine: " + titleI);
                    System.out.println("--------------");
                    System.out.println("a che luminosità desideri riprodurre il video?");
                    int luminositaI = scn.nextInt();
                    elementi[i] = new Immagine(titleI, luminositaI);
                    ((Immagine) elementi[i]).show();

                case 0:
                    scn.close();
                    System.out.println("Fine");
                    break;
            }
        }

        scn.close();

    }
}