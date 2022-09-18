package guru.qa;

import java.util.HashSet;
import java.util.Set;

public class Music {
    Set<String> storedSongs = new HashSet<>();

    public void addSong(String song) {
        storedSongs.add(song);
    }

    public void removeSong(String song) {
        storedSongs.remove(song);
    }

    public void printSong() {
        int i = 0;
        while (i <= storedSongs.size()) {
            i++;
            System.out.println(storedSongs);
        }
    }

    public void searchSong(String song) {
        for (String storedSong : storedSongs) {
            if (storedSongs.contains(song)) {
                System.out.println("Песня доступна для прослушивания");
            } else System.out.println("Песня не доступна для прослушивания");
        }
    }
}
