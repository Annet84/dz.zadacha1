package ru.skypro;

public class Main {

    public static void main(String[] args) {

	// Задание 1
        int dog = 7;
        byte cat = 1;
        short mouse = 3;
        long elephant = 100L;
        double sugarWight = 4.5;
        float saltWight = 1.5F;
        boolean dogIsAdult = false;
        char bar = 35;
        System.out.println(dogIsAdult);


    // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weightOfAllBoxers);
        System.out.println("Разница в весе боксеров " + weightDifference);

    // Задание 3
        byte bananas = 5;
        byte bananasWeightGr = 80;
        int vesBananas = bananas * bananasWeightGr;
        byte milk100Ml = 105;
        int vesMilk200ML = milk100Ml + milk100Ml;
        byte iceCream1Brik = 100;
        int vesIceCream2Brik = iceCream1Brik + iceCream1Brik;
        byte eggWeightGr = 70;
        int vesEgg = eggWeightGr * 4;
        int Breakfast = vesBananas + vesMilk200ML + vesIceCream2Brik + vesEgg;
        float BreakfastKg = Breakfast / 1000F;
        System.out.println("Общий вес завтрака в граммах " + "- " + Breakfast);
        System.out.println("Общий вес завтрака в килограммах " + "- " + BreakfastKg);

        // Задание 4
        short needSbrosKg = 7;
        short oneKG = 1000;
        int vesVGd = needSbrosKg * oneKG;
        short variant1 = 250;
        short variant2 = 500;
        int skDneyPo250Gr = vesVGd / variant1;
        int skDneyPo500Gr = vesVGd / variant2;
        int srednee = skDneyPo250Gr + skDneyPo500Gr;
        int sredneeDays = srednee / 2;
        int needsredneeDays = vesVGd / sredneeDays;
        System.out.println("Если худеть по 250 грамм в день, то 7 кг сбросит за " + skDneyPo250Gr + " дней");
        System.out.println("Если худеть по 500 грамм в день, то 7 кг сбросит за " + skDneyPo500Gr + " дней");
        System.out.println("Столько в среднем потребуется дней чтобы похудеть на 7 кг " + "- " + needsredneeDays);


        // Задача 5
        int zpMasha = 67760;
        int zpDenis = 83690;
        int zpKristina = 76230;
        int increaseZp = 10;
        int increaseZpMash = zpMasha * increaseZp / 100;
        int newZpMashi = zpMasha + increaseZpMash;
        int zpMashaGod = zpMasha * 12;
        int newZpMashaGod = newZpMashi * 12;
        int increaseNewZpMashaGod = newZpMashaGod - zpMashaGod;

        System.out.println("Маш теперь получает" + newZpMashi + " рублей в месяц");
        System.out.println("Зарплата Маши увеличилась на" + "- " + increaseZpMash + " рублей в месяц");
        System.out.println("Годовой доход Маши в прошлом году был " + "- " + zpMashaGod + " рублей");
        System.out.println("Годовой доход Маши тепер составляет " + "- " + newZpMashaGod + " рублей");
        System.out.println("Годовой доход Маши увеличился на " + "- " + increaseNewZpMashaGod + " рублей");


        int increaseZpDenis = zpDenis * increaseZp / 100;
        int newZpDenis = zpDenis + increaseZpDenis;
        int zpDenisGod = zpDenis * 12;
        int newZpDenisGod = newZpDenis * 12;
        int increaseNewZpDenisGod = newZpDenisGod - zpDenisGod;

        System.out.println("Денис теперь получает " + "- " + newZpDenis + " рублей в месяц");
        System.out.println("Зарплата Дениса увеличилась на " + "- " + increaseZpDenis + " рублей в месяц");
        System.out.println("Годовой доход Дениса в прошлом году был " + "- " + zpDenisGod + " рублей" );
        System.out.println("Годовой доход Дениса теперь составляет " + "- " + newZpDenisGod + " рублей");
        System.out.println("Годовой доход Дениса увеличился на " + "- " + increaseNewZpDenisGod + " рублей");


        int increaseZpKristina = zpKristina * increaseZp / 100;
        int newZpKristina = zpKristina + increaseZpKristina;
        int zpKristinaGod = zpKristina * 12;
        int newZpKristinaGod = newZpKristina * 12;
        int increaseNewZpKristina = newZpKristinaGod - zpKristinaGod;

        System.out.println("Кристина теперь получает " + "- " + newZpKristina + " рублей в месяц");
        System.out.println("Зарплата Крестины увеличилась на " + "- " + increaseZpKristina + "рублей");
        System.out.println("Годовой доход Крестины в прошлом году был " + "- " + zpKristinaGod + " рублей");
        System.out.println("Годовой доход Крестины теперь составляет" + "- " + newZpKristinaGod + " рублей");
        System.out.println("Годовй доход Крестины увеличился на " + "- " + increaseNewZpKristina + " рублей");





    }
}
