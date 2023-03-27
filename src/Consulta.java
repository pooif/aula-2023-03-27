class Consulta {

  private final Cliente cliente;
  private Horario horario;

  Consulta(Cliente cliente, Horario horario) {
    this.cliente = cliente;
    this.horario = horario;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public Horario getHorario() {
    return horario;
  }
  
}
