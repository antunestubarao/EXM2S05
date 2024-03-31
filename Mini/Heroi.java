package Mini;

public class Heroi {
    private String nome;
    private String superpoder;
    private String usuario;
    private int idade;

    public Heroi(String nome, String superpoder, String usuario, int idade) {
        this.nome = nome;
        this.superpoder = superpoder;
        this.usuario = usuario;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
