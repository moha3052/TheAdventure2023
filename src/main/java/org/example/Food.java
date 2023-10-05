package org.example;

    public class Food extends Item {
        int healthPoints;

        public Food(String name, String description, int healthPoints) {
            super(name, description);
            this.healthPoints = healthPoints;
            edible  = true;
        }

        public int getHealthPoints() {
            return healthPoints;
        }

        @Override
        public String toString() {
            return "\n"+ "Food" +
                    "healthPoints = "+ healthPoints +
                    "\n"+
                    "name = " + getName() +
                    "\n"+ "description =" + getDescription();
        }
    }



