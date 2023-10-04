package org.example;

    public class Food extends Item {
        int healthPoints;

        public Food(String name, String description, int healthPoints) {
            super(name, description);
            this.healthPoints = healthPoints;
        }

        public int getHealthPoints() {
            return healthPoints;
        }

        @Override
        public String toString() {
            return "\n"+ "Food" +
                    "healthPoints=" + healthPoints +
                    ", name='" + getName() + '\'' +
                    ", description='" + getDescription() + '\'' +
                    '}';
        }
    }



