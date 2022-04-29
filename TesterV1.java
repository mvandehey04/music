public class TesterV1 {
    public static void main(String args[]){
        Music[] music = new Music[10];
        music[0] = new Music("Backstabber", 2009, "Kesha");
        music[1] = new Music("deja vu", 2020, "Olivia Rodrigo");
        music[2] = new Music("Especially You", 2022, "Wallows");
        music[3] = new Music("This Love", 2014, "Taylor Swift");
        music[4] = new Music("Strangers Forever", 2022, "Maude Latour");
        music[5] = new Music("OMG Plz Don't Come Around", 2021, "THE DRIVER ERA");
        music[6] = new Music("cardigan", 2020, "Taylor Swift");
        music[7] = new Music("How to Be a Heartbreaker", 2012, "Marina and The Diamonds");
        music[8] = new Music("Happier than Ever", 2021, "Billie Eilish");
        music[9] = new Music("Teenage Dream", 2010, "Katy Perry");

        printMusic(music);
        searchBySong(music, "cardigan");
        searchByYear(music, 2021);
        searchByArtist(music, "Taylor Swift");
    }

    // a static method that traverses through the array and prints each element
    public static void printMusic(Music[] music){
        System.out.printf("%s %24s %8s", "Title", "Year", "Artist");
        System.out.println("\n---------------------------------------------------------");
        for(Music m : music){
            System.out.println(m.toString());
        }
    }

    // a method that searches the array for a particular song title
    public static void searchBySong(Music[] music, String search){
        System.out.println("\n << Searching for " + search + " >> \n");
        for(Music m : music){
            if(m.getTitle().equals(search)){
                System.out.println(m.toString());
                break;
            }
        }
    }

    // a method that searches the array for year released (the output should list all songs found from that year)
    public static void searchByYear(Music[] music, int search){
        System.out.println("\n << Searching for songs released in " + search + " >> \n");
        for(Music m : music){
            if(m.getYear() == search){
                System.out.println(m.toString());
            }
        }
    }

    // a method that searches the array for the name of the artist 
    // (the output should list all songs performed by that artist)
    public static void searchByArtist(Music[] music, String search){
        System.out.println("\n << Searching for songs by " + search + " >> \n");
        for(Music m : music){
            if(m.getArtist().equals(search)){
                System.out.println(m.toString());
            }
        }
    }
}
