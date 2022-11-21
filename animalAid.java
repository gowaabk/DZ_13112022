import java.util.HashSet;
import java.util.Set;

public class animalAid {
    public static Set<Cat> catsSet;

    public static void main(String[] args) {
        // Задаем объекты 
        Cat cat1 = new Cat(1,"Даша", "Дворянка", "Кошка", 15);
        Cat cat2 = new Cat(2,"Фунтик", "Мейн-кун", "Кот", 145);
        Cat cat3 = new Cat(3,"Барсик", "Британская", "Кот", 7);

        //1. Вывод информации по объектам
        System.out.println("1. Вывод информации по объектам");
        System.out.println();
        System.out.println("1. cat1 -> " + cat1);
        System.out.println("2. cat2 -> " + cat2);
        System.out.println("3. cat3 -> " + cat3);
        //System.out.println("4. cat4 -> " + cat4);
        //System.out.println("5. cat5 -> " + cat5);
        System.out.println();

        // 2. Создаем множества класса Cat
        System.out.println("2. Создаем множества класса Cat и выводим в консоль");
        catsSet = new HashSet<>();
        catsSet.add(cat1);
        catsSet.add(cat2);
        catsSet.add(cat3);
        System.out.println(catsSet.toString());
        System.out.println();

        // 3. объекты с одинаковыми значениями
        Cat cat4 = new Cat(6,"Даша", "Дворянка", "Кошка", 15);
        Cat cat5 = new Cat(7,"Даша", "Дворянка", "Кошка", 15);
        //Cat cat7 = new Cat(7,"Фроська", "Дворянка", "Кошка", 15);
        //Cat cat8 = new Cat(8,"Даша", "Дворянка", "Кошка", 15);

        catsSet.add(cat4);
        catsSet.add(cat5);


        System.out.println("3. Добавляем одинаковые объекты в множество и выводим его в консоль");
        System.out.println(catsSet + "\nsize: " + catsSet.size());
        System.out.println();

        // 4. Cравнениe объектов equals()
        System.out.println("4. Сравнение объектов: \n   cat1 = cat2 -> " + cat1.equals(cat2) + "\n   cat1 = cat4 -> " + cat1.equals(cat4));
        System.out.println();

        // 5. Метод hashCode()
        System.out.println("5. cat1 id = " + cat1.hashCode() + "\n   cat2 id = " + cat2.hashCode() + "\n   cat3 id = " + cat3.hashCode() + "\n   cat4 id = " + cat4.hashCode());
        System.out.println();

        // 6. После переопределения метода hashCode()
        System.out.println("6. " + catsSet + "\nsize: " + catsSet.size());
    }
}

