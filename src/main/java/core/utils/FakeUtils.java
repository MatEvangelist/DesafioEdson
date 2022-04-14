package core.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakeUtils {

    private static final Faker faker = new Faker(new Locale("pt-br"));
    private static final Faker faker2 = new Faker(new Locale("eng"));

    public static String gerarUserName() {
        return faker2.name().username();
    }

    public static String gerarEmail() {
        return faker.internet().emailAddress();
    }

    public static String gerarPrimeiroNome() {
        return faker.name().firstName();
    }

    public static String gerarUltimoNome() {
        return faker.name().lastName();
    }

    public static String gerarCidade() {
        return faker.address().city();
    }

    public static String gerarEndereco() {
        return faker.address().streetAddress();
    }

    public static String gerarEstado() {
        return faker.address().state();
    }

    public static String gerarCodigoPostal() {
        return faker.address().zipCode();
    }

    public static String gerarNumeroTelefone() {
        return faker.phoneNumber().cellPhone();
    }

}
