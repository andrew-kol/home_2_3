package Animals;

import java.util.Objects;

public class Amphibian extends Animals {

    public Amphibian(String name, Integer age) {
        super(name, age, "Суша и вода");
    }

    public void hunt() {
        System.out.println("Я охочусь");
    }

    //toString не переопределяю, т к нет свойст, отличных от родителя (новых)

    @Override
    void eat() {
        System.out.println("Я ем разную еду");
    }

    @Override
    void go() {
        System.out.println("Я передвигаюсь по воде и суше");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibian a = (Amphibian) o;
        return Objects.equals(getName(), a.getName());
    }
}
