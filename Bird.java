
    package Animals;

    abstract class Bird extends Animals {
        public final String moveType; // - перенесла из дочерних, т к одинаковые

        public Bird(String name, Integer age, String moveType, String envin) {
            super(name, age, envin);
            if (moveType == null || moveType.isBlank()) {
                throw new IllegalArgumentException("Некорректные данные");
            } else {
                this.moveType = moveType;
            }
        }

        public String getMoveType() {
            return moveType;
        }

        public void hunt() {
            System.out.println("Я охочусь");
        }

        @Override
        public String toString() {
            return super.toString() + ", тип передвижения " + moveType;
        }

    }

