package MilošVojnović;

public class Nasledjivanje {
    interface Auto {
        public void operationA();
        public void operationB();
    }

    interface Biciklo {
        public void lights();
    }

    public class ModelA implements Auto, Biciklo {

        public void operationA() {
            System.out.println("Operacija A");
        }

        public void operationB() {
            System.out.println("Operacija B");
        }

        public void lights() {
            System.out.println("Generička svetla počinju");
        }
    }
    public void main(String[] args) {

        ModelA prviObj = new ModelA();
        prviObj.operationA();
        prviObj.operationB();
        prviObj.lights();
    }
}
