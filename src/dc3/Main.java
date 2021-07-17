package dc3;

public class Main {
    static int[] tablica = {1, 2, -2, 3, -1, 0, -3, 3, -1, 1, -2, 3, -1, -1, 2};
    public static void main(String[] args) {
        int max = tablica[0];
        int m_od = 0;
        int m_do = 0;
        int pm_od = 0;
        int pm_do = 0;
        int pmax = tablica[0];
        for(int i = 1; i < tablica.length - 1; i++) {
            if (pmax + tablica[i] > max) {
                max = pmax + tablica[i];
                m_do = i;
            }
            if (tablica[i] > max) {
                max = tablica[i];
                m_od = i;
                m_do = i;
            }
            pmax = pmax + tablica[i];
            pm_do = i;
            if (tablica[i] > pmax) {
                pmax = tablica[i];
                pm_od = i;
                pm_do = i;
            }
        }
        System.out.format("Max = %d dla <%d,%d>", max, m_od, m_do);
    }
}
