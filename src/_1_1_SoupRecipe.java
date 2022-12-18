public class _1_1_SoupRecipe {
    public static void main(String[] args) {

        int eaters = 5; // сколько людей будут есть

        int water = 3004; // миллилитров воды
        int potatoes = 7; // картофелин
        int chicken = 6; // куриных бёдер
        int spices = 8; // ложек специй

        System.out.println("Сварили суп. На одного человека вышло:");
        System.out.println((water / eaters) + " миллилитров воды");
        System.out.println((potatoes / eaters) + " картофелин(а)");
        System.out.println((chicken / eaters) + " куриных(ое) бёдер(ро)");
        System.out.println((spices / eaters) + " ложек(ка) специй");

    }
}
/*
#Описание
        Расчетное количество любого ингредиента на одну порцию округляется до целого числа.

        #Локация дефекта
        https://github.com/AndresKorvin/NetologySoupRecipe/blob/main/src/Main.java

        #Шаги воспроизведения
        1. Открыть код программы https://github.com/AndresKorvin/NetologySoupRecipe/blob/584983b29525038ff3f77944efa331d282340456/src/Main.java#L6-L9
        2. Ввести значения переменных:
        water = 3004
        potatoes = 7
        chicken = 6
        spices = 8
        3. Запустить программу
        4. Посмотреть на вывод консоли

        *Ожидаемый результат:* Вывод сообщения о количестве ингредиентов со значением десятичных дробей.
        *Фактический результат:* Вывод сообщения о количестве ингредиентов со значением, округленным до целого числа.

        #Скриншот
        ![Soup](https://user-images.githubusercontent.com/113539640/206909411-77223820-ec98-4356-aee0-e729bffe19bd.png)

        #Окружение
        * **Операционная система** Windows 11 Pro 21H2 22000.978
        * **IDE** IntelliJ IDEA 2022.3 (Community Edition)
        * * **Java.** OpenJDK 11

        #Рекомендация
        Для указанных переменных использовать тип данных Float.
*/