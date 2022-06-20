package MilošVojnović;

public class Inheritance {
    interface Car {
        public void operationA();
        public void operationB();
    }
//promena
    interface Bicycle {
        public void lights();
    }

    public class ModelA implements Car, Bicycle {

        public void operationA() {
            System.out.println("Operation A");
        }

        public void operationB() {
            System.out.println("Operation B");
        }

        public void lights() {
            System.out.println("Generic lights are starting");
        }
    }
    public void main(String[] args) {

        ModelA firstObj = new ModelA();
        firstObj.operationA();
        firstObj.operationB();
        firstObj.lights();
    }
}
