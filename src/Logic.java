import java.util.Vector;

public class Logic {
    public Logic(){
        primeSearcher(1000);
    }
    private void primeSearcher(int length) {
        Vector<Integer> primTarolo = new Vector<>();
        Vector<Integer> tarolo = new Vector<>();
        for (int i = 1; i < length; i++) {
            if (isPrime(i)) {
                primTarolo.add(i);
            }
        }
        for (int i = 1; i < primTarolo.size(); i++) {
            tarolo.add(i);
        }
        superPrimeSearcher(primTarolo, tarolo);
    }
    private void superPrimeSearcher(Vector<Integer> primTarolo,Vector<Integer> tarolo){
        for (int i = 0; i < primTarolo.size(); i++) {
                if(isPrime(tarolo.elementAt(i))){
                    int superPrim = primTarolo.elementAt(i);
                    System.out.println("Szuper_prim: "+superPrim);
                }
        }
        
    }
    private boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
 
        return true;
    }

}
