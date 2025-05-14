import java.util.*;

class Event {
    String title;
    String time;
    String description;

    public Event(String title, String time, String description) {
        this.title = title;
        this.time = time;
        this.description = description;
    }

    public String toString() {
        return time + " - " + title + ": " + description;
    }
}

public class EventCalendar {
    public static void main(String[] args) {
        TreeMap<String, List<Event>> calendar = new TreeMap<>();

        addEvent(calendar, "2025-05-20", new Event("Meeting", "10:00 AM", "Team meeting"));
        addEvent(calendar, "2025-05-20", new Event("Doctor", "03:00 PM", "Visit doctor"));
        addEvent(calendar, "2025-05-22", new Event("Birthday", "All Day", "Friend's birthday"));

        System.out.println("Events on 2025-05-20:");
        showEventsOnDate(calendar, "2025-05-20");

        System.out.println("\nAll Upcoming Events:");
        listAllEvents(calendar);

        removeEvent(calendar, "2025-05-20", 0); // remove first event on that date

        System.out.println("\nAfter Removing One Event:");
        listAllEvents(calendar);
    }

    public static void addEvent(TreeMap<String, List<Event>> map, String date, Event e) {
        if (!map.containsKey(date)) {
            map.put(date, new ArrayList<>());
        }
        map.get(date).add(e);
    }

    public static void removeEvent(TreeMap<String, List<Event>> map, String date, int index) {
        if (map.containsKey(date)) {
            List<Event> events = map.get(date);
            if (index >= 0 && index < events.size()) {
                events.remove(index);
                if (events.isEmpty()) {
                    map.remove(date);
                }
            }
        }
    }

    public static void showEventsOnDate(TreeMap<String, List<Event>> map, String date) {
        if (map.containsKey(date)) {
            for (Event e : map.get(date)) {
                System.out.println(e);
            }
        } else {
            System.out.println("No events on this date.");
        }
    }

    public static void listAllEvents(TreeMap<String, List<Event>> map) {
        for (String date : map.keySet()) {
            System.out.println(date);
            for (Event e : map.get(date)) {
                System.out.println("  " + e);
            }
        }
    }
}
