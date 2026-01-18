import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class Event {
    private String name;
    private LocalDate date;

    public Event(String name, String date) {
        this.name = name;
        this.date = LocalDate.parse(date); // yyyy-MM-dd format
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
}

public class EventProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Event> events = new ArrayList<>();

        // Read event data
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String date = sc.next();
            events.add(new Event(name, date));
        }

        int month = sc.nextInt();

        // 1. Sort events chronologically
        List<Event> sortedEvents = events.stream()
                .sorted(Comparator.comparing(Event::getDate))
                .collect(Collectors.toList());

        System.out.println();
        
        // Print sorted event names
        sortedEvents.forEach(e -> System.out.print(e.getName() + " "));
        System.out.println();

        // 2. Earliest event
        Event earliest = sortedEvents.get(0);
        System.out.println(earliest.getName());

        // 3. Latest event
        Event latest = sortedEvents.get(sortedEvents.size() - 1);
        System.out.println(latest.getName());

        // 4. Events in the given month
        sortedEvents.stream()
                .filter(e -> e.getDate().getMonthValue() == month)
                .forEach(e -> System.out.print(e.getName() + " "));
    }
}
