public class Sumatorios extends Thread {
    public static final Integer PARES = 0;
    public static final Integer IMPARES = 1;
    public static final Integer TRES_CUATRO = 2;

    private Integer tipo;

    public Sumatorios(Integer tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        switch (tipo) {
            case 0:
                sumaPares();
                break;
            case 1:
                sumaImpares();
                break;
            case 2:
                sumaTresCuatro();
                break;
        }
    }

    public boolean sumaPares(){
        int resultado = 0;
        for (int i = 0; i < 2500; i++){
            if (i % 2 == 0){
                resultado += i;
                System.out.println("Pares: " + resultado);
            }
        }
        return true;
    }
    public boolean sumaImpares(){
        int resultado = 0;
        for (int i = 0; i < 2500; i++){
            if (i % 2 != 0){
                resultado += i;
                System.out.println("Impares: " + resultado);
            }
        }
        return true;
    }
    public boolean sumaTresCuatro(){
        int resultado = 0;
        for (int i = 0; i < 2500; i++){
            if (terminaEnTresOCuatro(i)){
                resultado += i;
                System.out.println("Tres o Cuatro: " + resultado);
            }
        }
        return true;
    }
    public boolean terminaEnTresOCuatro(int numero) {
        int ultimoDigito = numero % 10;
        return ultimoDigito == 3 || ultimoDigito == 4;
    }
}
