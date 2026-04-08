
    abstract class Room {

        protected int numberOfBeds;
        protected int squareFeet;
        protected double pricePerNight;

        public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
            this.numberOfBeds = numberOfBeds;
            this.squareFeet = squareFeet;
            this.pricePerNight = pricePerNight;
        }

        public void displayRoomDetails() {
            System.out.println("Beds: " + numberOfBeds);
            System.out.println("Size: " + squareFeet + " sqft");
            System.out.println("Price per night: " + pricePerNight);
        }
    }

    // Single Room
    class SingleRoom extends Room {
        public SingleRoom() {
            super(1, 250, 1500.0);
        }
    }

    // Double Room
    class DoubleRoom extends Room {
        public DoubleRoom() {
            super(2, 400, 2500.0);
        }
    }

    // Suite Room
    class SuiteRoom extends Room {
        public SuiteRoom() {
            super(3, 750, 5000.0);
        }
    }

    // Main Class
    public class BookMyStay {

        public static void main(String[] args) {

            SingleRoom single = new SingleRoom();
            DoubleRoom dbl = new DoubleRoom();
            SuiteRoom suite = new SuiteRoom();

            int singleAvailable = 5;
            int doubleAvailable = 3;
            int suiteAvailable = 2;

            System.out.println("Hotel Room Initialization");

            System.out.println("\nSingle Room:");
            single.displayRoomDetails();
            System.out.println("Available: " + singleAvailable);

            System.out.println("\nDouble Room:");
            dbl.displayRoomDetails();
            System.out.println("Available: " + doubleAvailable);

            System.out.println("\nSuite Room:");
            suite.displayRoomDetails();
            System.out.println("Available: " + suiteAvailable);
        }
    }
