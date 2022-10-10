
 package Transport;

    abstract class Transport {
        private final String brand;
        private final String model;
        private String color;
        private final Integer productionYear;
        private final String productionCountry;
        private Integer maxSpeed;

        public Transport(String brand, String model, String color, Integer productionYear,
                         String productionCountry, Integer maxSpeed) {
            if (brand == null || brand.isBlank()) {
                this.brand = "brand";
            } else {
                this.brand = brand;
            }
            if (model == null || model.isBlank()) {
                this.model = "model";
            } else {
                this.model = model;
            }
            setColor(color);
            if (productionYear == null || productionYear <= 0) {
                this.productionYear = 2000;
            } else {
                this.productionYear = productionYear;
            }
            if (productionCountry == null || productionCountry.isBlank()) {
                this.productionCountry = "productionCountry";
            } else {
                this.productionCountry = productionCountry;
            }
            setMaxSpeed(maxSpeed);
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public Integer getProductionYear() {
            return productionYear;
        }

        public String getProductionCountry() {
            return productionCountry;
        }

        public Integer getMaxSpeed() {
            return maxSpeed;
        }

        public void setColor(String color) {
            if (color == null || color.isBlank()) {
                this.color = "белый";
            } else {
                this.color = color;
            }
        }

        public void setMaxSpeed(Integer maxSpeed) {
            if (maxSpeed == null) {
                this.maxSpeed = 0;
            } else if (maxSpeed < 0) {
                System.out.println("Отрицательное значение скорости");
                this.maxSpeed = 0;
            } else {
                this.maxSpeed = maxSpeed;
            }
        }

        public abstract void refill();

        @Override
        public String toString() {
            return brand + ' ' + getModel() + "\nцвет " + color + "\nгод выпуска " + productionYear +
                    "\nстрана-производитель " + productionCountry + "\nмаксимальная скорость " + maxSpeed + " км/ч";
        }
    }

