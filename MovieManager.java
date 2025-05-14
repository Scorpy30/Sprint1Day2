import java.util.*;

class Movie {
    String title;
    String director;
    String genre;
    int year;
    double rating;

    public Movie(String title, String director, String genre, int year, double rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public String toString() {
        return String.format("%-20s %-15s %-10s %-6d %-4.1f", title, director, genre, year, rating);
    }
}

public class MovieManager {
    ArrayList<Movie> movies = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addMovie() {
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Director: ");
        String director = scanner.nextLine();
        System.out.print("Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Release Year: ");
        int year = scanner.nextInt();
        System.out.print("Rating: ");
        double rating = scanner.nextDouble();
        scanner.nextLine();

        movies.add(new Movie(title, director, genre, year, rating));
        System.out.println("Movie added.\n");
    }

    public void removeMovie() {
        System.out.print("Enter title to remove: ");
        String title = scanner.nextLine();

        boolean removed = movies.removeIf(m -> m.title.equalsIgnoreCase(title));
        if (removed) {
            System.out.println("Movie removed.\n");
        } else {
            System.out.println("Movie not found.\n");
        }
    }

    public void filterBy(String type) {
        System.out.print("Enter " + type + ": ");
        String value = scanner.nextLine();

        System.out.printf("%-20s %-15s %-10s %-6s %-6s\n", "Title", "Director", "Genre", "Year", "Rate");
        for (Movie m : movies) {
            if ((type.equals("genre") && m.genre.equalsIgnoreCase(value)) ||
                (type.equals("director") && m.director.equalsIgnoreCase(value)) ||
                (type.equals("year") && Integer.toString(m.year).equals(value))) {
                System.out.println(m);
            }
        }
    }

    public void sortBy(String criteria) {
        if (criteria.equals("title")) {
            movies.sort(Comparator.comparing(m -> m.title.toLowerCase()));
        } else if (criteria.equals("year")) {
            movies.sort(Comparator.comparingInt(m -> m.year));
        } else if (criteria.equals("rating")) {
            movies.sort((a, b) -> Double.compare(b.rating, a.rating));
        }
        System.out.println("Movies sorted by " + criteria + ".\n");
    }

    public void displayMovies() {
        if (movies.isEmpty()) {
            System.out.println("No movies in the collection.\n");
            return;
        }

        System.out.printf("%-20s %-15s %-10s %-6s %-6s\n", "Title", "Director", "Genre", "Year", "Rate");
        for (Movie m : movies) {
            System.out.println(m);
        }
        System.out.println();
    }

    public void menu() {
        int choice;
        do {
            System.out.println("1. Add Movie");
            System.out.println("2. Remove Movie");
            System.out.println("3. Display All Movies");
            System.out.println("4. Filter by Genre");
            System.out.println("5. Filter by Director");
            System.out.println("6. Filter by Year");
            System.out.println("7. Sort by Title");
            System.out.println("8. Sort by Year");
            System.out.println("9. Sort by Rating");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 : addMovie(); break;
                case 2 : removeMovie();break;
                case 3 : displayMovies(); break;
                case 4 : filterBy("genre"); break;
                case 5 : filterBy("director"); break;
                case 6 : filterBy("year"); break;
                case 7 : sortBy("title");break;
                case 8 : sortBy("year"); break;
                case 9 : sortBy("rating"); break;
                case 0 : System.out.println("Goodbye!"); break; 
                default : System.out.println("Invalid choice.\n"); break;
            }

        } while (choice != 0);
    }

    public static void main(String[] args) {
        new MovieManager().menu();
    }
}
