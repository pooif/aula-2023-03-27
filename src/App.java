import java.util.*;

class App {
  public static void main(String[] args) {
    
    String nome = "Marcio";

    Cliente cli1 = new Cliente("12345678901", nome);
    Cliente cli2 = new Cliente("12345678901", nome);

    System.out.println(cli1.getNome()); // Marcio
    System.out.println(cli2.getNome()); // Marcio

    nome.toUpperCase(); // String é imutável

    System.out.println(cli1.getNome()); // Marcio
    System.out.println(cli2.getNome()); // Marcio

    System.out.println(cli1 == cli2);
    System.out.println(cli1.equals(cli2)); // true
    
    List<Cliente> clientes = new ArrayList<>();
    clientes.add(cli1);
    System.out.println(clientes.contains(cli1)); // true

    System.out.println(clientes.contains(cli2)); // true
    System.out.println(clientes.contains(new Cliente("12345678901", "Qualquer nome"))); // true


    Set<Cliente> conjunto = new HashSet<>();
    conjunto.add(cli1);
    conjunto.add(cli2);
    conjunto.add(new Cliente("12345678901", "Qualquer nome"));

    System.out.println(conjunto.size());

    // estado, comportamento
    // estado mutável

    Horario h1 = new Horario(19, 58);
    Horario h2 = new Horario(19, 58);
    System.out.println(h1 == h2); // false
    System.out.println(h1.equals(h2)); // true

    Consulta con = new Consulta(cli1, h2);

    System.out.println(con.getHorario());

    Horario h3 = h2.adicionarHoras(1);

    System.out.println(h2); // 19:58
    System.out.println(h3); // 20:58

    System.out.println(con.getHorario()); // 19:58

    con.postergar(2, Horario.HORAS);

    System.out.println(con.getHorario()); // 21:58

  } 
}
