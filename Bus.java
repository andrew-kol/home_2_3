
    package Transport;

    public class Bus extends Transport{
        public Bus(String brand, String model, String color, Integer productionYear,
                   String productionCountry, Integer maxSpeed) {
            super(brand, model, color, productionYear, productionCountry, maxSpeed);
        }

        @Override
        public void refill() {
            System.out.println("Можно заправить бензином или дизелем");
        }

        @Override
        public String toString() {
            return "Автобус " + super.toString();
        }
    }

