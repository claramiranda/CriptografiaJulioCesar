package challenge;

public class CriptografiaCesariana implements Criptografia {

    public static void main(String[] args) {
    }

    @Override
    public String criptografar(String texto) {
        if(texto.trim().equals("")) {
            throw new IllegalArgumentException("vazio");
        }
        if(texto == null){
            throw new IllegalArgumentException("nulo");
        }

        int tamanho = texto.length();
        int verificador = 0;
        String criptografado = "";
        char aux, value;

        texto = texto.toLowerCase();

        for (int i = 0; i < tamanho; i++) {
            aux = texto.charAt(i);
            verificador = (int) aux;

            if (verificador < 97 || verificador > 122  ){
                value = aux;
                criptografado += value;
                continue;
            }
             else if (aux == 'x') {
                value = 'a';
                criptografado += value;
                continue;
            } else if (aux == 'y') {
                value = 'b';
                criptografado += value;
                continue;
            } else if (aux == 'z') {
                value = 'c';
                criptografado += value;
                continue;
            }
            value = (char) (aux + 3);
            criptografado += value;
        }
        return criptografado;
    }

    @Override
    public String descriptografar(String texto) {
        if(texto.trim().equals("")) {
            throw new IllegalArgumentException("vazio");
        }
        if(texto == null){
            throw new IllegalArgumentException("nulo");
        }
        String descriptografado = "";

        int tamanho = texto.length();
        int verificador = 0;
        char aux, value;

        texto = texto.toLowerCase();

        for (int i = 0; i < tamanho; i++) {
            aux = texto.charAt(i);
            verificador = (int) aux;

            if (verificador < 97 || verificador > 122  ){
                value = aux;
                descriptografado += value;
                continue;
            }
            else if (aux == 'a') {
                value = 'x';
                descriptografado += value;
                continue;
            } else if (aux == 'b') {
                value = 'y';
                descriptografado += value;
                continue;
            } else if (aux == 'c') {
                value = 'z';
                descriptografado += value;
                continue;
            }
            value = (char) (aux - 3);
            descriptografado += value;
        }
        return  descriptografado;
    }
}
