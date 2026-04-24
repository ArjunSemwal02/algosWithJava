package dsa.patterns;

public class Sqrpattern {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();

        starPattern(6);
        System.out.println();

        numberPattern(6);
        System.out.println();

        horizontalNumbers(8);
    }

    public static void pattern1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(n);
            }
            System.out.println();
        }
    }

    public static void starPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void horizontalNumbers(int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }


}
