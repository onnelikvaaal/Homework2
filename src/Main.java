public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println();
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println();
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        System.out.println();
        System.out.println("Задача 4");
        var friend = 19.0;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();
        System.out.println("Задача 6");
        var athleteNumber1 = 78.2;
        var athleteNumber2 = 82.7;
        var totalWeight = athleteNumber1 + athleteNumber2;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");
        var weightDifferce = athleteNumber2 - athleteNumber1;
        System.out.println("Разница между весами бойцов " + weightDifferce + " кг");
        System.out.println();
        System.out.println("Задача 7");
        weightDifferce = athleteNumber2 - athleteNumber1;
        System.out.println("Разница между весами бойцов " + weightDifferce + " кг");
        var weightDifference1 = athleteNumber2 % athleteNumber1;
        System.out.println("Используя операцию остаток от деления, мы видим, что разница между весами бойцов составляет " + weightDifference1 + " кг");
        System.out.println();
        System.out.println("Задача 8");
        var totalWorkingTime = 640;
        var workingTimePerEmployee = 8;
        var amountOfEmployees = totalWorkingTime / workingTimePerEmployee;
        System.out.println("Всего работников в компании - " + amountOfEmployees + " человек");
        System.out.println();
        amountOfEmployees = amountOfEmployees + 94;
        totalWorkingTime = amountOfEmployees * 8;
        System.out.println("Если в компании работает " + amountOfEmployees + " человек, то всего " + totalWorkingTime + " часов работы может быть поделено между сотрудниками");
    }
}