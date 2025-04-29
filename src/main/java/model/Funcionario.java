package model;

public class Funcionario {
    private String name;
    private String cargo;
    private String esporte;

    public Funcionario() {
    }

    public Funcionario(String name, String cargo, String esporte) {
        this.name = name;
        this.cargo = cargo;
        this.esporte = esporte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }
    
    public String toString(){
        return "----------------------------------\n"
                + "DADOS DO FUNCIONARIO\n"
                + "NOME: "
                + name
                + "\n"
                + "CARGO: "
                + cargo
                + "\n"
                + "ESPORTE: "
                + esporte
                + "\n"
                + "----------------------------------\n";
    }
    
    
}
