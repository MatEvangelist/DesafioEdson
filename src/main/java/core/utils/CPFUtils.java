package core.utils;

import java.util.Random;

public class CPFUtils {

    static Random random = new Random();

    public static String gerarCpf(boolean isValido) {
        StringBuilder partial = new StringBuilder();
        String cpf;
        int numero;

        for (int i = 0; i < 9; i++) {
            numero = (int) (Math.random() * 10);
            partial.append(numero);
        }

        if(isValido) {
            return cpf = partial.toString() + geradorDigitoVerificador(partial.toString());
        } else {
            long onzeDigitos = (random.nextInt(1000000000)) + (random.nextInt(90) + 10) * 1000000000L;
            return cpf = String.valueOf(onzeDigitos);
        }
    }

    public static String gerarCpfFormatado(boolean isValido) {
        String cpf = gerarCpf(isValido);
        return String.format("%s.%s.%s-%s", cpf.substring(0, 3), cpf.substring(3, 6), cpf.substring(6, 9), cpf.substring(9, 11));
    }

    private static String geradorDigitoVerificador(String num) {
        int primDig, segDig, soma = 0, multiplicadorDaCasa = 10;

        // primeiro dígito
        for (int i = 0; i < num.length(); i++)
            soma += Integer.parseInt(num.substring(i, i + 1)) * multiplicadorDaCasa--;

        if (soma % 11 == 0 | soma % 11 == 1) {
            primDig = 0;
        } else {
            primDig = 11 - (soma % 11);
        }

        //segundo dígito
        soma = 0;
        multiplicadorDaCasa = 11;
        for (int i = 0; i < num.length(); i++) {
            soma += Integer.parseInt(num.substring(i, i + 1)) * multiplicadorDaCasa--;
        }
        soma += primDig * 2;

        if (soma % 11 == 0 | soma % 11 == 1) {
            segDig = 0;
        } else {
            segDig = 11 - (soma % 11);
        }

        return Integer.toString(primDig) + segDig;
    }
}
