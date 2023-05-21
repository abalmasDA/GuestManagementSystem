/**
 * Створити клас Main.
 * Реалізувати:
 * - створити любу кількість відвідувачів -- але не менше 20, щоб як мінімум було дві групи по 3 відвідувача із однієї кімнати
 * - створити вечірку(Event) з назвою на Ваш розсуд
 * - додати всіх відвідувачів на цю вечірку
 * - вивести загальну кількість відвідувачів -- Загальна кількість людей на вечірці: 42
 * - вивести всіх відвідувачів у форматі*
 * Вечірка: Паті на Хаті
 * Присутні:
 * John       із кімнати номер: 100
 * John Max   із кімнати номер:  42
 * WillSmo... із кімнати номер:   1
 * Capitan    із кімнати номер:  42
 * - видалити відвідувача за іменем -- наприклад John, і вивести на екран
 * Вечірка: Паті на Хаті
 * Вигнали: John
 * Присутні:
 * John Max   із кімнати номер:  42
 * WillSmo... із кімнати номер:   1
 * Capitan    із кімнати номер:  42
 * - видалити відвідувача за номером кімнати -- наприклад 42, і вивести на екран
 * Вечірка: Паті на Хаті
 * Вигнали: John Max, Capitan
 * Присутні:
 * WillSmo... із кімнати номер:   1
 * зверніть увага на формат - список має бути красиво надрукований як табличка
 */


public class Main {

    public static void main(String[] args) {

        Visitor visitor1 = new Visitor("Ivan", 20);
        Visitor visitor2 = new Visitor("Dmytro", 20);
        Visitor visitor3 = new Visitor("Diana", 20);
        Visitor visitor4 = new Visitor("Alex", 15);
        Visitor visitor5 = new Visitor("Michel", 15);
        Visitor visitor6 = new Visitor("Ivan", 15);
        Visitor visitor7 = new Visitor("Oleg", 17);
        Visitor visitor8 = new Visitor("Mason", 17);
        Visitor visitor9 = new Visitor("Victoria", 17);
        Visitor visitor10 = new Visitor("William", 17);
        Visitor visitor11 = new Visitor("Nik", 505);
        Visitor visitor12 = new Visitor("Mary", 555);
        Visitor visitor13 = new Visitor("Liam", 478);
        Visitor visitor14 = new Visitor("Eva", 328);
        Visitor visitor15 = new Visitor("Victoria", 11);
        Visitor visitor16 = new Visitor("Alex", 11);
        Visitor visitor17 = new Visitor("Zoe", 111);
        Visitor visitor18 = new Visitor("Dmytro", 8);
        Visitor visitor19 = new Visitor("Stepan", 81);
        Visitor visitor20 = new Visitor("Emma", 8);


        Event HomeParty = new Event("HomeParty");
        HomeParty.addingVisitorToEvent(visitor1);
        HomeParty.addingVisitorToEvent(visitor2);
        HomeParty.addingVisitorToEvent(visitor3);
        HomeParty.addingVisitorToEvent(visitor4);
        HomeParty.addingVisitorToEvent(visitor5);
        HomeParty.addingVisitorToEvent(visitor6);
        HomeParty.addingVisitorToEvent(visitor7);
        HomeParty.addingVisitorToEvent(visitor8);
        HomeParty.addingVisitorToEvent(visitor9);
        HomeParty.addingVisitorToEvent(visitor10);
        HomeParty.addingVisitorToEvent(visitor11);
        HomeParty.addingVisitorToEvent(visitor12);
        HomeParty.addingVisitorToEvent(visitor13);
        HomeParty.addingVisitorToEvent(visitor14);
        HomeParty.addingVisitorToEvent(visitor15);
        HomeParty.addingVisitorToEvent(visitor16);
        HomeParty.addingVisitorToEvent(visitor17);
        HomeParty.addingVisitorToEvent(visitor18);
        HomeParty.addingVisitorToEvent(visitor19);
        HomeParty.addingVisitorToEvent(visitor20);

        Visitor.getNumberRegisteredVisitor();

        HomeParty.getInfoEvent();

        HomeParty.removingByNameVisitorFromEvent("Ivan");
        HomeParty.getInfoEventAfterRemoveVisitor();

        HomeParty.removingByNumberRoomVisitorFromEvent(17);
        HomeParty.getInfoEventAfterRemoveVisitor();




    }


}
