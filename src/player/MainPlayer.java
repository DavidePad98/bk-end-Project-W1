package player;

import java.util.Scanner;

public class MainPlayer {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < elementi.length; i++) {
            System.out.println("cosa vuoi riprodurre? 1 audio, 2 video, 3 immagine");
            int num = scn.nextInt();
            scn.nextLine();
            System.out.println("inserici titolo:");
            String title = scn.nextLine();

            switch (num){
                case 1:
                    System.out.println("hai selezionato l' audio: " + title);
                    System.out.println("--------------");
                    System.out.println("inserisci la durata da riprodurre: ");
                    int durata = scn.nextInt();
                    System.out.println("volume: ");
                    int volume = scn.nextInt();
                    elementi[i] = new RecAudio(title, durata, volume);
                    elementi[i].play();
                    break;
                case 2:
                    System.out.println("hai selezionato il video: " + title);
                    System.out.println("--------------");
                    System.out.println("inserisci la durata da riprodurre: ");
                    int durataV = scn.nextInt();
                    System.out.println("volume: ");
                    int volumeV = scn.nextInt();
                    System.out.println("a che luminosità desideri riprodurre il video?");
                    int luminositaV = scn.nextInt();
                    elementi[i] = new Video(title, luminositaV, durataV, volumeV);
                    elementi[i].play();
                    break;
                default:
                    System.out.println("Tipo non valido!");
                    i--;
                    break;
            }

        }
        scn.close();



        }

    }