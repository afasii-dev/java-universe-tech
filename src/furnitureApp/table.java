package furnitureApp;

public class table extends furniture {

        @Override
        void clean() {
            if (super.getIsCleaned() == false) {
                System.out.println("Cleaning Table!");
                super.setIsCleaned(true);
            }
        }

        @Override
        boolean build() {
            return false;
        }
    }
