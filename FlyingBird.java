

    package Animals;

import java.util.Objects;

    public class FlyingBird extends Bird{
        public FlyingBird(String name, Integer age) {
            super(name, age, "Летает", "Небо, суша и вода");
        }

        public void fly() {
            System.out.println("Я летаю");
        }

        @Override
        void eat() {
            System.out.println("Приземляюсь и ем");
        }

        @Override
        void go() {
            System.out.println("Я машу крыльями");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FlyingBird a = (FlyingBird) o;
            return Objects.equals(getName(), a.getName()); //проверяю только по имени, т к в условии нужно проверять, нет ли повторяющихся животных (н-р, 2 жирафа)
        }
    }

