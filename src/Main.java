import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        List<Person> people = generateClient();
        Queue<Person> attr = new LinkedList<>(people);
        while (!attr.isEmpty()) {
            Person person = attr.poll();
            int quantityTickets = person.getQuantityTicket();
            quantityTickets = quantityTickets - 1;
            person.setQuantityTicket(quantityTickets);
            System.out.printf("\n %s %s прокатился на аттракционе , у него осталось %d билетов", person.getName(), person.getSureName(), quantityTickets);
            if (quantityTickets > 0) {
                attr.offer(person);
            }
        }
    }

    private static List<Person> generateClient() {
        return List.of(
                new Person("Сергей", "Смирнов", 2),
                new Person("Алексей", "Смирнов", 3),
                new Person("Юрий", "Смирнов", 4),
                new Person("Алексей", "Бородин", 8),
                new Person("Дмитрий", "Смирнов", 9)
        );

    }

}