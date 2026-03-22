package Methods;

public class hacx {


    /*
     * Write a class that creates instances of the Rectangle class to find the
     * total area of two rooms in a house.
     */


        public static void main(String args[]){

            /*******************
             * RECTANGLE 1
             ********************/

            //Create instance of Rectangle class
            Rectengle room1 = new Rectengle();
            room1.setWidth(25);
            room1.setLength(50);
            double areaOfRoom1 = room1.calculateArea();

            /*******************
             * RECTANGLE 2
             ********************/

            //Create instance of Rectangle class
            Rectengle room2 = new Rectengle(30, 75);
            double areaOfRoom2 = room2.calculateArea();

            double totalArea = areaOfRoom1 + areaOfRoom2;

            System.out.println("Area of both rooms: " + totalArea);
        }
    }

