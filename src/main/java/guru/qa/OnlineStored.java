package guru.qa;

public class OnlineStored {

    public static void main(String[] args) {
        Book books = new Book();
        books.addNewBook("Пушкин");
        books.addNewBook("Лермонтов");
        books.addNewBook("Шекспир");
        books.removeBook("Пушкин");
        books.printBooks();
        books.searchBook("Кинг");

    }

    public static void filmsStored() {
        Film films = new Film();
        films.addFilm(1988, "Кавказкая пленница");
        films.addFilm(2000, "Крепкий орешек");
        films.addFilm(2001, "Один дома");
        films.addFilm(2001, "Один дома2");
        films.removeFilm("Кавказкая пленница");
        films.printFilms();
    }

    public static void musicStored() {
        Music songs = new Music();
        songs.addSong("Руки вверх");
        songs.addSong("Цой");
        songs.addSong("Ленинград");
        songs.removeSong("Руки вверх");
        songs.printSong();
        songs.searchSong("Цой");
    }
}
