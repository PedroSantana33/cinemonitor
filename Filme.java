public class Filme{

  private String titulo;
  private int ano;
  private String tipo;

  public void setTitulo(String titulo){
    this.titulo = titulo;
  }

  public void setAno(int ano){
    this.ano = ano;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public String getTitulo(){
    return this.titulo;
  }

  public int getAno(){
    return this.ano;
  }

  public String getTipo(){
    return this.tipo;
  }
}