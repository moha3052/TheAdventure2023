package org.example;

    public class Item {
        private String itemName;
        private String description;
        protected boolean edible;

        public Item(String name, String description) {
            this.itemName = name;
            this.description = description;
            this.edible = false;
        }

        public boolean isEdible() {
            return edible;
        }

        public String getItemname() {
            return itemName;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return
                    "\n"+ "\n"+ "Item " +
                    "name = " + itemName +
                    "." +"\n"+
                     "description = " + description;
        }
    }




