class Main {
  public static void main(String[] args) {
    Filme filme = new Filme();

    filme.setTitulo("A Pequena Sereia");
    filme.setAno(1989);
    filme.setTipo("Desenho");

    System.out.println("O melhor filme do mundo é: " + filme.getTitulo());
    System.out.println("Lançado no ano " + filme.getAno());
    System.out.println("Tipo: " + filme.getTipo());
  }
}