class Cliente { // Java Bean
  private String cpf; // chave!
  private String nome;

  public Cliente(String cpf, String nome) {
    this.cpf = cpf;
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int hashCode() {
    return this.cpf.hashCode();
  }

  public boolean equals(Object o) {
    if (o instanceof Cliente) {
      return ((Cliente)o).cpf.equals(this.cpf);
    }
    return false;
  }

}