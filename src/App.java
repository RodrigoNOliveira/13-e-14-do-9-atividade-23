import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
     
        String aS = JOptionPane.showInputDialog(null, "Digite o coeficiente a: ", "Raízes", JOptionPane.QUESTION_MESSAGE);
        
        double a = Double.parseDouble(aS);
        if ( a == 0 ){
            JOptionPane.showMessageDialog(null, "Não é equação do segundo grau", "Raízes", JOptionPane.ERROR_MESSAGE);
        }
        else {
            String bS = JOptionPane.showInputDialog(null, "Digite o coeficiente b: ", "Raízes", JOptionPane.QUESTION_MESSAGE);
        
            double b = Double.parseDouble(bS);  

            String cS = JOptionPane.showInputDialog(null, "Digite o coeficiente c: ", "Raízes", JOptionPane.QUESTION_MESSAGE);
        
            double c = Double.parseDouble(cS);


            double delta = Math.pow(b, 2) - (4 * a * c);
            
            double bhaskara1 = (-b + Math.sqrt(delta))/(2*a);
            String bskr = String.format( "%.2f", bhaskara1);
            double bhaskara2 = (-b - Math.sqrt(delta))/(2*a);
            String bskr2 = String.format( "%.2f", bhaskara2);

            if (delta < 0) {
                JOptionPane.showMessageDialog(null, "Não existe raiz", "Raizes", JOptionPane.INFORMATION_MESSAGE);
            } else if ( delta == 0){
                JOptionPane.showMessageDialog(null, "Raíz unica\nRaiz: " + bskr, "Raizes", JOptionPane.INFORMATION_MESSAGE);

            }else if ( delta > 0){
                JOptionPane.showMessageDialog(null, "Raízes:\n1º:  "+ bskr + "\n2º: " + bskr2, "Raizes", JOptionPane.INFORMATION_MESSAGE);

            }


        }
    }
}
