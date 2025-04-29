package principal;

import javax.swing.JOptionPane;
import model.Aluno;
import model.Funcionario;

public class Unisul30_2 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
       
       aluno.setName(JOptionPane.showInputDialog("Qual seu nome?"));
       aluno.setAge(Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?")));
       aluno.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura?")));
       aluno.setWeight(Double.parseDouble(JOptionPane.showInputDialog("Qual seu peso?")));
       JOptionPane.showMessageDialog(null, aluno);
       
       Funcionario func = new Funcionario();
       func.setName(JOptionPane.showInputDialog("Qual é o nome do funcionario?"));
       func.setCargo(JOptionPane.showInputDialog("Qual o cargo que ele exerce?"));
       func.setEsporte(JOptionPane.showInputDialog("Qual esporte ele ministra?"));
       JOptionPane.showMessageDialog(null, func);
       
       
    }
}
