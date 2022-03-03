package core.entidades;

public enum Usuario {

    VALIDO("matevangelista1", "Pofu22"),
    INVALIDO("matevangelista2", "pofu22");

    public String username, senha;

    Usuario(String email, String senha) {
        this.username = email;
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
