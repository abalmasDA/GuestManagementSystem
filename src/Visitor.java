/**
 * Створити клас Visitor.
 * Має такі дані
 * name -- маскимальна довжина імʼя 10, при створенні коли імʼя довше відрізаємо хвіст і додаємо три крапки: GreatAkynaMatata --> GreatAk...
 * room -- маскимальне значення 100, при вводі якоїсь єресі, наприклад: 100500, назначаємо кімнату 42: 34 -- ок --> 34 -- ок, 123 -- fail --> 42
 * Реалізувати:
 * - створення обєкту
 * - закрити прямий доступ до даних
 * - заборонити змінювати дані
 * - під час створення об’єкта підраховувати, скільки всього об’єктів було створено
 * - дати можливість отримувати дані
 * - дати можливість вивести весь обʼєкт у читабельному виді - John Doe із кімнати номер: 100
 * - дати можливість отримувати загальну кількість створених обʼєктів - Загальна кількість зареєстрованих відвідувачів: 42
 */


public class Visitor {

    private final String name;

    private final int room;

    private static int counterVisitor = 0;


    public Visitor(String name, int room) {
        if (name.length() > 7) {
            name = name.substring(0, 7) + "...";
        }
        this.name = name;

        if (room > 100) {
            room = 42;
        }
        this.room = room;

        Visitor.counterVisitor++;
    }


    public void getInfoVisitor() {
        System.out.println(name + " from room number: " + room);
    }

    static public void getNumberRegisteredVisitor() {
        System.out.println("Total number of registered visitors: " + counterVisitor);
    }

    public String getName() {
        return name;
    }

    public int getRoom() {
        return room;
    }


}
