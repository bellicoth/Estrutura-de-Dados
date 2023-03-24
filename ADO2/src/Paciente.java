public class Paciente {
    
    private String nomePaciente;
    private String tipoPaciente;

    public Paciente(String nomePaciente, String tipoPaciente) {
        this.nomePaciente = nomePaciente;
        this.tipoPaciente = tipoPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome Paciente: " + nomePaciente + ", Tipo Paciente: " + tipoPaciente + "\n";
    }

    
    
}
