public class Main {
    public static void main(String[] args) {
        Sumatorios sumaPares = new Sumatorios(Sumatorios.PARES);
        Sumatorios sumaImpares = new Sumatorios(Sumatorios.IMPARES);
        Sumatorios sumaTresCuatro = new Sumatorios(Sumatorios.TRES_CUATRO);
        sumaPares.start();
        sumaImpares.start();
        sumaTresCuatro.start();
    }
}
