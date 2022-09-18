package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class Film {
    Map<Integer, String> storedfilm = new HashMap<>();

    public void addFilm(int year, String name) {
        storedfilm.put(year, name);
    }

    public void removeFilm(String name) {
        storedfilm.remove(name);
    }

    public void printFilms() {
        for (Map.Entry<Integer, String> entry : storedfilm.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());

        }
    }
}
