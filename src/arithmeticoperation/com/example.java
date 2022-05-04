package arithmeticoperation.com;

public class example {


    public static void generateException(int me) {

        int m;
        int numbers[] = new int[8];
        System.out.println("Input values");
        try {

            switch (me) {

                case 0:
                    m = 20 / me;
                    break;
                case 1:
                    numbers[6] = 6;
                    break;
                case 2:
                    return;

            }

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("not divisble");
        } catch (ArithmeticException e) {
            System.out.println("there is no index");
        } finally {
            System.out.println("mememe");
        }
    }
}
class exampleDemo{

    public static void main(String[] args){
        for(int i=0; i<5;i++){
            example.generateException(i);
            System.out.println();
        }
    }
}
