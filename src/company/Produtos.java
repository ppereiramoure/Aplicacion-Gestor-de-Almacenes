package company;

public class Produtos {
    private String nome;
    private String codigo;
    private float prezo;
    private int cantidade;

    public Produtos(String nome, String codigo, float prezo, int cantidade){
        this.nome = nome;
        this.codigo = codigo;
        this.prezo = prezo;
        this.cantidade = cantidade;
    }

    public Produtos(){

    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCodigo(){
         return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public float getPrezo(){
        return prezo;
    }
    public void setPrezo(float prezo){
         this.prezo = prezo;
    }

    public int getCantidade(){
        return cantidade;
    }
    public void setCantidade(int cantidade){
        this.cantidade = cantidade;
    }

}
