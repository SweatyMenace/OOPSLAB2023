import java.util.Arrays;
import java.util.Comparator;

class Show implements Comparable<Show> {
    private String name;
    private double cost;

    // Constructor
    public Show(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    // Implementing compareTo method to compare by name
    @Override
    public int compareTo(Show other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Show{name='" + name + "', cost=" + cost + "}";
    }
}

class FindShow {
    public static boolean find(Object[] arr, Object item) {
        for (Object obj : arr) {
            if (obj instanceof Show && obj.equals(item)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check for reference equality
        if (obj == null || getClass() != obj.getClass()) return false; // Check for null and class type
        Show show = (Show) obj; // Cast to Show
        return Double.compare(show.cost, cost) == 0 && name.equals(show.name); // Compare name and cost
    }
}

public class ShowFinder {
    public static void main(String[] args) {
        // Create an array of Show objects
        Show[] shows = {
            new Show("Concert", 50.0),
            new Show("Theater", 30.0),
            new Show("Comedy", 20.0),
            new Show("Opera", 100.0)
        };

        // Searching for a specific show
        Show searchShow = new Show("Comedy", 20.0);
        boolean found = FindShow.find(shows, searchShow);

        if (found) {
            System.out.println("Show found: " + searchShow);
        } else {
            System.out.println("Show not found.");
        }

        // Sorting shows by cost in descending order
        Arrays.sort(shows, new Comparator<Show>() {
            @Override
            public int compare(Show s1, Show s2) {
                return Double.compare(s2.getCost(), s1.getCost()); // Descending order
            }
        });

        // Displaying sorted shows
        System.out.println("Shows sorted by cost (descending):");
        for (Show show : shows) {
            System.out.println(show);
        }
    }
}
