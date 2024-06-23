public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private String horario;

    public Empleado(int id, String nombre, String puesto, String horario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Horario: " + horario;
    }
}

