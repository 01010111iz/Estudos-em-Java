import javax.swing.*;
class potencia{
    static int pot(int base, int exp){
        if(base==0){
            return 0;
        }
        else if(exp==0){
            return 1;
        }
        else{
           return pot(base, exp-1)*base;
        }
    }
    public static void main(String [] arg) {
        int b, e, p;
        b=Integer.parseInt(JOptionPane.showInputDialog("Digite a base para cálculo da potência"));
        e=Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente para cálculo da potência"));
    
        if(b<0 || e<0){
            System.out.println("Valor digitado incorretamente, valores devem ser maiores ou iguais a zero.");
        }
        else{
            p=pot(b,e);
            System.out.println(b+" elevado a "+e+" é igual a:"+p);
        }
    }
}