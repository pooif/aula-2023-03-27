// Objeto de Valor (Value Object)
// imutável
// depende de todo o estado.

final class Horario { // proibir herança
  // imutável
  private final int horas;
  private final int minutos;

  Horario(int horas, int minutos) {
    if (horas < 0 || horas > 23) {
      throw new IllegalArgumentException();
    }
    if (minutos < 0 || minutos > 59) {
      throw new IllegalArgumentException();
    }
    this.horas = horas;
    this.minutos = minutos;
  }

  int getHoras() {
    return horas;
  }

  int getMinutos() {
    return minutos;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Horario) {
      Horario outro = (Horario) obj;
      return this.horas   == outro.horas 
          && this.minutos == outro.minutos;
    }
    return false;
  }

  // imutável: necessita retornar um novo!
  public Horario adicionarHoras(int horas) {
    return new Horario(this.horas + horas, this.minutos);
  }

  @Override
  public String toString() {
    return this.horas + ":" + this.minutos;
  }
}
