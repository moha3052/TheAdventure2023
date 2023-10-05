package org.example;

    public class Item {
        private String name;
        private String description;
        protected boolean edible;

        public Item(String name, String description) {
            this.name = name;
            this.description = description;
            this.edible = false;

        }

        public boolean isEdible() {
            return edible;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return
                    "\n"+ "Item " +
                    "name = " + name +
                    "." +"\n"+
                     "description = " + description;
        }
    }




