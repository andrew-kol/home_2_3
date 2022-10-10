
    import Animals.*;
import Transport.Car;
import Transport.Train;
import Transport.Bus;

import javax.naming.ldap.PagedResultsControl;

    public class Main {
        public static void main(String[] args) {

        Car car = new Car("Лада", "Гранта", null, -2011, null, 220,
                1.6f, "МКПП", "Седан", "а111аа011", 5, true,
                "", "", "2022.12.12", 12500f, "12456789");
        System.out.println(car);
        System.out.println(car.getMaxSpeed());
        car.isRegNumberValid();
        car.changeTires("ЗИМА");
        car.isExpiredInsurance();
        System.out.println(car);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", null, null, "Германия",
                260, 3.0f, "Автомат", "Седан", "", 5, null, "есть",
                "нет", null, null, null);
        Car bmw = new Car("BMW", "Z8", "черный", 2021, "Германия", 250, -2f,
                "", "   ", "рl022а023", 5, false, "есть",
                "", "  ", 23_000f, "  ");
        Car kia = new Car(null, "Sportage 4 поколение", "красный", 2018, null, 300, 2.4f,
                "  ", "Универсал", "", 6, true, "есть",
                "есть", "2023-11.23", 22_500f, "1256");
        Car hyundai = new Car("Hyundai", "Avante", "оранжевый", null, "Южная Корея", 300, null,
                "Автомат", "Седан", "ан222с072", null, null, "нет",
                "ЕСТЬ", "2023.04.05", 16_899f, "133456789");
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        Train martin = new Train("Ласточка", "B-901", "", 2011, "Россия",
                301, 3500f, null, "Белорусский вокзал", "Минск", 11);
        Train leningrad = new Train("Ленинград", "D-125", null, 2019, "Россия",
                270, 1700f, null, "Ленинградский вокзал",
                "Ленинград-Пассажирский", 8);
        System.out.println(martin);
        System.out.println(leningrad);
        Bus schoolBus = new Bus("ПАЗ", "", "желтый", 1990, "Россия", 80);
        Bus intercityBus = new Bus("Mercedes-Benz", "Tourismo", "", 2017, "Германия", 100);
        Bus touristBus = new Bus("Mercedes-Benz", "Sprinter", "", 2017, "Германия", 160);
        System.out.println(schoolBus);
        System.out.println(intercityBus);
        System.out.println(touristBus);
            Herbivore horse = new Herbivore("Лошадь", 3, 40);
            Herbivore gazelle = new Herbivore("Газель", 2, 45);
            Herbivore giraffe = new Herbivore("Жираф", 2, 4);
            Predator hyena = new Predator("Гиена", 5, 45);
            Predator tiger = new Predator("Тигр", 5, 79);
            Predator bear = new Predator("Медведь", 3, 60);
            Amphibian frog = new Amphibian("Лягушка", 1);
            Amphibian snake = new Amphibian("Уж пресноводный", 1);
            FlightlessBird peacock = new FlightlessBird("Павлин", 2);
            FlightlessBird penguin = new FlightlessBird("Пингвин", 4);
            FlightlessBird dodo = new FlightlessBird("Птица додо", 1);
            FlyingBird gull = new FlyingBird("Чайка", 5);
            FlyingBird falcon = new FlyingBird("Сокол", 3);
            FlyingBird albatross = new FlyingBird("Альбатрос", 5);
            System.out.println(horse);
            System.out.println(tiger);
            System.out.println(snake);
            System.out.println(albatross);
            System.out.println(peacock);
            peacock.hunt();
            System.out.println(falcon.getEnvironment());


            horse.graze();
            horse.walk();
            horse.eat();
            Herbivore h = new Herbivore("Лошадь", 8, 40);
            System.out.println(horse.equals(h));
            System.out.println(horse.equals(tiger));
        }
    }



