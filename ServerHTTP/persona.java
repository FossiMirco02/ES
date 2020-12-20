package ServerHTTP;

public class persona {
  private String nome;
  private String cognome;
  private String indirizzo;
  private String eta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

  public persona() {}

  public persona(String nome, String cognome) {
    this.nome = nome;
    this.cognome = cognome;
  }

}