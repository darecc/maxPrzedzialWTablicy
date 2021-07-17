package dc2;

public class Main {
    static int[] tablica = {1, 2, -2, 3, -1, 0, -3, 3, -1, 1, -2, 3, -1, -1, 2};
    public static void main(String[] args) {
        int max = tablica[0];
        int m_od = 0;
        int m_do = 0;
        for(int i = 0; i < tablica.length; i++)
            for(int j = i; j < tablica.length; j++) {
                int suma = 0;
                for (int k = i; k <= j; k++)
                    suma += tablica[k];
                if (suma > max) {
                    max = suma;
                    m_od = i;
                    m_do = j;
                }
            }
        System.out.format("Max = %d dla <%d,%d>", max, m_od, m_do);
    }
}
