
    package Animals;

    abstract class Animals {
        private String name;
        private Integer age;
        private final String environment; //вынесла это сюда из дочерних классов, т к поле одинаковое для каждого из них


        public Animals(String name, Integer age, String environment) {
            setName(name);
            setAge(age);
            if (environment == null || environment.isBlank()) {
                throw new IllegalArgumentException("Некорректные данные");
            } else {
                this.environment = environment;
            }
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public String getEnvironment() {
            return environment;
        }

        public void setName(String name) {
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException("Некорректные данные");// т к данных по умолчанию в задаче нет, пришлось сделать так
            } else {
                this.name = name;
            }
        }

        public void setAge(Integer age) {
            if (age == null || age < 0) {
                throw new IllegalArgumentException("Некорректные данные");
            } else {
                this.age = age;
            }
        }

        public void sleep() {
            System.out.println("Я сплю");
        }

        abstract void eat();

        abstract void go();

        @Override
        public String toString() {
            return "Класс " + getClass() + ", " + name + ", возраст " + age + ", среда обитания " + environment;
        }
    }

