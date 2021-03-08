package company;

    import java.util.ArrayList;
    import java.util.Iterator;
    import javax.swing.JOptionPane;

    public class Metodos extends Produtos {
        ArrayList <String> Libro = new ArrayList();

        public void engadirElemento(ArrayList <Produtos> listaProdutos){
            Produtos lp=pedirProduto ("INTRODUCE PRODUTO: ");
            listaProdutos.add(lp);
        }


        public static Produtos pedirProduto(String mensaxe ){
            String nome=JOptionPane.showInputDialog("Introduce titulo");
            String codigo=JOptionPane.showInputDialog("Introduce autor");
            float prezo=Float.parseFloat(JOptionPane.showInputDialog("Introduce o prezo"));
            int cantidade=Integer.parseInt(JOptionPane.showInputDialog("Introduce as unidades"));
            Produtos lp= new Produtos(nome, codigo, prezo, cantidade);
            return lp;
        }


}
