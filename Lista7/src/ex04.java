public class ex04 extends AuxScanner {
    public static int v1[] = new int[10];
    public static int v2[] = new int[10];
    public static int v3[] = new int[20];
    public static int aux = 2;
    public static boolean verifica = false;

    public static void main(String[] args) {

        System.out.println("Vetor 1");
        for (int i = 0; i < v1.length; i++) {
            v1[i] = sc.nextInt();
        }
        /*System.out.println("Vetor 2");
        for (int i = 0; i < v2.length; i++) {
            v2[i] = sc.nextInt();
        }*/
        v3[0] = v1[0];
        // 1 2 2 3 4
        // 1   2   3
        System.out.println("Vetor resultante");
        vetorResultante1();
        for (int i = 0; i < v3.length; i++) {
            System.out.print(v3[i] + " ");
        }

    }

    public static void vetorResultante1() {
        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v3.length; j++) {
                if (v1[i] != v3[j]) {
                    verifica = true;
                } else {
                    verifica = false;
                    break;
                }
            }
            if (verifica) {
                if (aux <= 18) {
                    v3[aux] = v1[i];
                    aux += 2;
                } else {
                    System.out.println("Aux maior que 18");
                    break;
                }
            }

        }
    }
}