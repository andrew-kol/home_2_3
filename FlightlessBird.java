

    package Animals;

import java.util.Objects;

    public class FlightlessBird extends Bird{
        public FlightlessBird(String name, Integer age) {
            super(name, age, "Ходит и бегает", "Суша и вода");
        }

        public void walk() {
            System.out.println("Я гуляю ногами");
        }

        @Override
        void eat() {
            System.out.println("Я ищу пищу на земле и ем");
        }

        @Override
        void go() {
            System.out.println("Я передвигаю ноги");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FlightlessBird a = (FlightlessBird) o;
            return Objects.equals(getName(), a.getName()); //проверяю только по имени, т к в условии нужно проверять, нет ли повторяющихся животных (н-р, 2 жирафа)
        }
    }

