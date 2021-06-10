package state.ejerEnClase;

public class ProgramaAbierto {
    private String nameProgram;
    private int cantidadProgramas;

    public  ProgramaAbierto(String nameProgram){
        this.nameProgram=nameProgram;
    }

    public String getNameProgram() {
        return nameProgram;
    }

    public void setNameProgram(String nameProgram) {
        this.nameProgram = nameProgram;
    }

    public int getCantidadProgramas() {
        return cantidadProgramas;
    }

    public void setCantidadProgramas(int cantidadProgramas) {
        this.cantidadProgramas = cantidadProgramas;
    }
}
