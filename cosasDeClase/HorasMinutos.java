package cosasDeClase;

public class HorasMinutos {
    public static void main(String[] args) {

        int h1 = 0, m1 = 0, s1 = 0;
        int h2 = 499, m2 = 169, s2 = 100;
        int hf = h1, mf = m1, sf = s1;

        int dias;

        /*
        Sumamos los segundos resultantes de tomar el resto entre los
        60 segundos que tiene un minuto
         */
        sf = (s1 + s2) % 60;

        // En caso de que se acarree algún minuto, lo sumamos a los minutos finales
        mf += (s1 + s2) / 60;

        /*
        Igual que antes, haya o no haya acarreo, sumamos a las horas
        base el número de horas que haya acarreado la suma de minutos
         */
        hf += (mf + m2) / 60;

        /*
        Ahora hacemos lo mismo pero con los minutos. Sumamos a los minutos
        base (que ya tienen sumado el acarreo) el resto de dividir dicho número
        más los minutos añadidos entre los 60 minutos que tiene una hora
         */
        mf = (mf + m2) % 60;



        dias = (hf + h2) / 24;

        // Ahora sumamos las horas, haciendo igual que con los minutos y segundos
        hf = (hf + h2) % 24;



        System.out.printf("La hora resultante es %02d:%02d:%02d +%d días",
                hf, mf, sf, dias);
    }
}
