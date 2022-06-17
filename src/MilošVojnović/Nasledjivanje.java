package MilošVojnović;

public class Nasledjivanje {
    interface Car {
        public void operationA();
        public void operationB();
    }

    interface Bike {
        public void lights();
    }

    public class ModelA implements Car, Bike {

        public void operationA() {
            System.out.println("Operation A");
        }

        public void operationB() {
            System.out.println("Operation B");
        }

        public void lights() {
            System.out.println("Generic Lights Starts");
        }
    }
    public void main(String[] args) {

        ModelA firstObj = new ModelA();
        firstObj.operationA();
        firstObj.operationB();
        firstObj.lights();
    }
}
