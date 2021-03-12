package company;

    import java.util.ArrayList;
    import java.util.Iterator;
    import javax.swing.JOptionPane;

    public class Metodos extends Produtos {
        //*Chamamos ao arraylist
        ArrayList <String> Produtos = new ArrayList();

        //*Metodo para engadir un producto novo
        public void engadirElemento(ArrayList <Produtos> listaProdutos){
            Produtos lp=pedirProduto ("INTRODUCE PRODUTO: ");
            listaProdutos.add(lp);
        }

        //*Metodo para pedir os datos de un producto para a sua adición
        public static Produtos pedirProduto(String mensaxe ){
            String nome=JOptionPane.showInputDialog("Introduce nome");
            String codigo=JOptionPane.showInputDialog("Introduce codigo alfanumérico");
            float prezo=Float.parseFloat(JOptionPane.showInputDialog("Introduce o prezo"));
            int cantidade=Integer.parseInt(JOptionPane.showInputDialog("Introduce a cantidade"));
            Produtos lp= new Produtos(nome, codigo, prezo, cantidade);
            return lp;
        }



}
