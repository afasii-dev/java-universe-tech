package furnitureApp;

public class Sofa extends Furniture {

        @Override
        void clean() {
            if (super.getIsCleaned() == false) {
                System.out.println("Cleaning Sofa!");
                super.setIsCleaned(true);
            }
        }

        @Override
        boolean build() {
            return false;
        }
    }
