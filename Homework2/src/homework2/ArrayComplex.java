package homework2;
import java.util.Locale;
import java.util.Scanner;


public class ArrayComplex {
    public static void main(String[] args){
        int DIM = 3;
        Complex[] array = new Complex[DIM];
        int[] pos = new int[1];
        System.out.println("Inserimento di "+DIM+" numeri complessi");
        insertComplexFromTerminal(array, DIM);
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        int scelta;
        do {
            System.out.println("Scegli un'operazione:");
            printMenu();
            scelta = input.nextInt();
            switch (scelta){
                case 0:
                    printAll(array, DIM);
                    break;
                case 1:
                    bubbleSort(array, DIM);
                    System.out.println("Dopo l'ordinamento: ");
                    printAll(array, DIM);
                    break;
                case 2:
                    double Re;
                    double Imm;
                    System.out.println("Inserisci la parte Reale: ");
                    Re=input.nextDouble();
                    System.out.println("Inserisci la parte Immaginaria: ");
                    Imm=input.nextDouble();
                    Complex c = new Complex(Re,Imm);
                    if (search(array, DIM, c, pos)){
                        System.out.println("Trovato in posizione: "+pos[0]);
                    } else {
                        System.out.println("Non trovato");
                    }
                    break;
                case 3:
                    printAllModules(array, DIM);
                    break;
                case 4:
                    System.out.println("Uscita");
                    break;
                default:
                    System.out.println("Scelta sbagliata, riprova");
            } 
        } while (scelta!=4);
        input.close();
    }
    // metodo per scegliere cosa fare
    public static void printMenu(){
        System.out.println("0: Print all\n1: Bubble Sort\n2: Search\n3: Print all modules\n4: Uscita");
    }
    // metodo per inserire i numeri complessi
    public static void insertComplexFromTerminal(Complex[] arr, int DIM){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        for (int i=0;i<DIM;i++){
            double Re;
            double Imm;
            System.out.println("Inserisci la parte Reale: ");
            Re=input.nextDouble();
            System.out.println("Inserisci la parte Immaginaria: ");
            Imm=input.nextDouble();
            arr[i]=new Complex(Re,Imm);
        }
    }
    // metodo per stampare i numeri complessi
    public static void printAll(Complex[] arr, int DIM){
        for (int i=0;i<DIM;i++){
            System.out.println("Elemento "+i+": ");
            arr[i].stampa();
        }
    }
    // metodo per ordinare i numeri complessi O(n^2) :/
    public static void bubbleSort(Complex[] arr, int DIM){
        for (int i=0;i<DIM-1;i++){
            for (int j=0;j<DIM-i-1;j++){
                if (arr[j].modulo()>arr[j+1].modulo()){
                    Complex temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    // metodo per cercare un numero complesso
    public static boolean search(Complex[] arr, int DIM, Complex c, int[] pos){
        for (int i=0;i<DIM;i++){
            if (arr[i].getRe()==c.getRe() && arr[i].getImm()==c.getImm()){
                pos[0]=i;
                return true;
            }
        }
        return false;
    }
    // metodo per stampare i moduli
    public static void printAllModules(Complex[] arr, int DIM){
        for (int i=0;i<DIM;i++){
            System.out.println(i+": "+arr[i].modulo());
        }
    }
}
