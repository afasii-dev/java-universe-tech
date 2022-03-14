import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        while (true) {
            menu();
            programingLanguage();
            System.out.println("----------------");
        }

    }

    private static void menu() {
        String menu = """
            Выберите:\n
        (1) Java\n 
        (2) Pyton\n
        (3) C++\n
        (4) Postgres
        """;
        System.out.println(menu);
    }

    private static void programingLanguage() {
        int category = getNumber();
        switch (category) {
            case 1:
                Java();
                break;
            case 2:
                python();
                break;
            case 3:
                C_plus();
                break;
            case 4:
                Postrgres();
                break;
            default:
                System.out.println("Error");
        }
    }

    private static void Postrgres() {
        System.out.println("PostgreSQL — свободная объектно-реляционная система управления \n" +
                "базами данных. Существует в реализациях для множества UNIX-подобных \n" +
                "платформ, включая AIX, различные BSD-системы, HP-UX, IRIX, Linux, macOS,\n" +
                " Solaris/OpenSolaris, Tru64, QNX, а также для Microsoft Windows. Википедия\n" +
                "Разработчик: сообщество PostgreSQL\n" +
                "Тип: реляционная СУБД и свободное и открытое программное обеспечение\n" +
                "Лицензия: лицензия PostgreSQL\n" +
                "Последняя версия: 14.2 (10 февраля 2022);\n" +
                "Автор: Майкл Стоунбрейкер\n" +
                "Первый выпуск: 1996\n" +
                "Языки программирования: PL/pgSQL, Си, PL/Python, PL/R, ЕЩЁ");
    }
    private static void C_plus() {
        System.out.println("C++ — компилируемый, статически типизированный \n" +
                "язык программирования общего назначения. Поддерживает такие \n" +
                "парадигмы программирования, как процедурное программирование, \n" +
                "объектно-ориентированное программирование, обобщённое программирование. Википедия\n" +
                "Разработчик: Бьёрн Страуструп\n" +
                "Сайт: isocpp.org\u200B (англ.)\n" +
                "Автор: Страуструп, Бьёрн\n" +
                "Появился в: 1983\n" +
                "Система типов: статическая\n" +
                "Тип исполнения: компилируемый\n" +
                "Выпуск: C++20 (декабрь 2020);");
    }

    private static void python() {
        System.out.println("Python — высокоуровневый язык программирования общего назначения \n" +
                "с динамической строгой типизацией и автоматическим управлением памятью,\n" +
                " ориентированный на повышение производительности разработчика, читаемости кода\n" +
                " и его качества, а также на обеспечение переносимости написанных на нём программ. Википедия\n" +
                "Разработчик: Гвидо ван Россум\n" +
                "ОС: кроссплатформенность\n" +
                "Сайт: python.org\u200B (англ.)\n" +
                "Выпуск: 3.10.2 (14 января 2022);\n" +
                "Расширение файлов: ,,,,, или\n" +
                "Класс языка: объектно-ориентированный язык программирования\n" +
                "Появился в: 20 февраля 1991");
    }

    private static void Java() {
        System.out.println("Java — строго типизированный объектно-ориентированный \n" +
                "язык программирования общего назначения,\n" +
                " разработанный компанией Sun Microsystems. Разработка ведётся сообществом, \n" +
                "организованным через Java Community Process; язык и основные \n" +
                "реализующие его технологии распространяются\n" +
                " по лицензии GPL. Википедия\n" +
                "Разработчик: Джеймс Гослинг\n" +
                "Сайт: oracle.com/java/\u200B (англ.)\n" +
                "Выпуск: Java SE 17 (14 сентября 2021);\n" +
                "Расширение файлов: ,, или\n" +
                "Класс языка: мультипарадигмальный язык программирования и язык JVM\n" +
                "Появился в: 1995");
    }

    private static int getNumber() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println();
        return number;
    }
}
