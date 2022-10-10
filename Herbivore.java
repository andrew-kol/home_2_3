package Animals;

import java.util.Objects;

public class Herbivore extends Mammal{
    public Herbivore(String name, Integer age, Integer speed) {
        super(name, age, speed, "Растения");
    }

    public void graze() {
        System.out.println("Я пасусь");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivore a = (Herbivore) o;
        return Objects.equals(getName(), a.getName()); //проверяю только по имени, т к в условии нужно проверять, нет ли повторяющихся животных (н-р, 2 жирафа)
    }

    @Override
    void go() {
        System.out.println("Я перемещаюсь по суше");
    }

}
