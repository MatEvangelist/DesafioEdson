import core.utils.CPFUtils;

public class main {

    public static void main(String[] args) {
        System.out.println(CPFUtils.gerarCpf(true));
        System.out.println(CPFUtils.gerarCpfFormatado(true));
        System.out.println(CPFUtils.gerarCpf(false));
        System.out.println(CPFUtils.gerarCpfFormatado(false));
    }
}
