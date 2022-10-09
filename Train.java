

    package Transport;

import java.time.LocalDate;
import java.util.Objects;

    public class Train extends Transport {
        private Float tripPrice;
        private LocalDate departureTime;
        private String departurePoint;
        private String destination;
        private Integer numberOfWagons;

        public Train(String brand, String model, String color, Integer productionYear, String productionCountry,
                     Integer maxSpeed, Float tripPrice, String departureTime, String departurePoint, String destination,
                     Integer numberOfWagons) {
            super(brand, model, color, productionYear, productionCountry, maxSpeed);
            setTripPrice(tripPrice);
            setDepartureTime(departureTime);
            setDeparturePoint(departurePoint);
            setDestination(destination);
            setNumberOfWagons(numberOfWagons);
        }

        public Float getTripPrice() {
            return tripPrice;
        }

        public void setTripPrice(Float tripPrice) {
            if (tripPrice == null || tripPrice < 0) {
                this.tripPrice = 0f;
            } else this.tripPrice = tripPrice;
        }

        public LocalDate getDepartureTime() {
            return departureTime;
        }

        public void setDepartureTime(String departureTime) {
            if (departureTime == null || departureTime.isBlank() || departureTime.length() != 10) {
                this.departureTime = LocalDate.parse("1900-01-01");
                System.out.println("Некорректная дата");
            } else {
                this.departureTime = LocalDate.parse(departureTime.replace('.', '-'));
            }
        }

        public String getDeparturePoint() {
            return departurePoint;
        }

        public void setDeparturePoint(String departurePoint) {
            if (departurePoint == null || departurePoint.isBlank()) {
                this.departurePoint = "Не указано";
            } else {
                this.departurePoint = departurePoint;
            }
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            if (destination == null || destination.isBlank()) {
                this.destination = "Не указано";
            } else {
                this.destination = destination;
            }
        }

        public Integer getNumberOfWagons() {
            return numberOfWagons;
        }

        public void setNumberOfWagons(Integer numberOfWagons) {
            this.numberOfWagons = Objects.requireNonNullElse(numberOfWagons, 10);
        }

        @Override
        public void refill() {
            System.out.println("Можно заправить дизелем");
        }

        @Override
        public String toString() {
            return "Поезд " + super.toString() +
                    "\nцена поездки " + String.format("%.2f", tripPrice) + " руб.\nдата отправления " + departureTime + "\nпункт отправления "
                    + departurePoint + "\nпункт назначения " + destination + "\nколичество вагонов " + numberOfWagons;
        }
    }

