import java.util.Arrays;

/**
 * Створити клас Event.
 * Має такі дані
 * title -- назва вечірки
 * visitors -- список відвідувачів
 * Реалізувати:
 * - створення обєкту
 * - закрити прямий доступ до даних
 * - заборонити змінювати title
 * - дати можливість отримувати дані
 * - дати можливість додавати відвідувача
 * - дати можливість видаляти відвідувача по name -- якщо в списку є не одне таке імʼя, видаляємо усіх з таким імʼям
 * - дати можливість видаляти відвідувача по room -- видаляєм всіх хто з цієї кімнати прийшов (вони на халяву прийшли )) )
 * - дати можливість вивести весь список у читабельному виді - Вечірка: Паті на Хаті, присутні: 120 відвідувачів
 */


public class Event {

    private final String title;
    private Visitor[] visitors;

    private Visitor[] visitorRemove;


    public Event(String title) {
        this.title = title;
        visitors = new Visitor[0];
        visitorRemove = new Visitor[0];

    }

    public void addingVisitorToEvent(Visitor visitorToAdd) {
        Visitor[] resultAddVisitors = new Visitor[visitors.length + 1];
        for (int i = 0; i <= visitors.length; i++) {
            if (i == visitors.length) {
                resultAddVisitors[i] = visitorToAdd;
            } else {
                resultAddVisitors[i] = visitors[i];
            }
        }
        visitors = resultAddVisitors;
    }


    public void removingByNameVisitorFromEvent(String visitorToRemoveByName) {
        int counterSameName = 0;
        for (int i = 0; i < visitors.length; i++) {
            if (visitors[i].getName().equals(visitorToRemoveByName)) {
                counterSameName++;
            }
        }
        Visitor[] resultVisitorRemove = new Visitor[counterSameName];
        Visitor[] resultRemoveByNameVisitors = new Visitor[visitors.length - counterSameName];
        int indexResultRemoveByNameVisitors = 0;
        int indexResultVisitorRemove = 0;
        for (int i = 0; i < visitors.length; i++) {
            if (visitors[i].getName() != visitorToRemoveByName) {
                resultRemoveByNameVisitors[indexResultRemoveByNameVisitors] = visitors[i];
                indexResultRemoveByNameVisitors++;
            } else {
                resultVisitorRemove[indexResultVisitorRemove] = visitors[i];
                indexResultVisitorRemove++;
            }
        }
        visitors = resultRemoveByNameVisitors;
        visitorRemove = resultVisitorRemove;
    }

    public void removingByNumberRoomVisitorFromEvent(int visitorToRemoveByName) {
        int counterSameNumberRoom = 0;
        for (int i = 0; i < visitors.length; i++) {
            if (visitors[i].getRoom() == visitorToRemoveByName) {
                counterSameNumberRoom++;
            }
        }
        Visitor[] resultVisitorRemove = new Visitor[counterSameNumberRoom];
        Visitor[] resultRemoveByNumberRoomVisitorFromEvent = new Visitor[visitors.length - counterSameNumberRoom];
        int indexResultRemoveByNumberRoomVisitorFromEvent = 0;
        int indexResultVisitorRemove = 0;
        for (int i = 0; i < visitors.length; i++) {
            if (visitors[i].getRoom() != visitorToRemoveByName) {
                resultRemoveByNumberRoomVisitorFromEvent[indexResultRemoveByNumberRoomVisitorFromEvent] = visitors[i];
                indexResultRemoveByNumberRoomVisitorFromEvent++;
            } else {
                resultVisitorRemove[indexResultVisitorRemove] = visitors[i];
                indexResultVisitorRemove++;

            }
        }
        visitors = resultRemoveByNumberRoomVisitorFromEvent;
        visitorRemove = resultVisitorRemove;
    }


    public void getInfoEvent() {
        System.out.println("Party: " + this.title);
        System.out.println("There are:");
        for (int i = 0; i < visitors.length; i++) {
            System.out.println(i+1 + ") " + visitors[i].getName() + " from room number: " + visitors[i].getRoom());
        }
    }


    public void getInfoEventAfterRemoveVisitor() {
        System.out.println("Party: " + this.title);
        System.out.print("Kicked out: ");
        for (int i = 0; i < visitorRemove.length; i++) {
            System.out.print(visitorRemove[i].getName() + ", ");
        }
        System.out.println();
        System.out.println("There are:");
        for (int i = 0; i < visitors.length; i++) {
            System.out.println(i+1 + ") " + visitors[i].getName() + " from room number: " + visitors[i].getRoom());
        }
    }


    public String getTitle() {
        return title;
    }

    public Visitor[] getVisitors() {
        return visitors;
    }


}
