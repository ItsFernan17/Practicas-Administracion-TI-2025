/**
 * Clase que representa un DTO (Data Transfer Object) para la entidad PuestoTrabajo.
 * Contiene los atributos básicos de un puesto de trabajo: DPI del usuario, nombre del puesto y salario.
 * Proporciona métodos para acceder a estos atributos.
 *
 * @author Fernando Rivas <frivasm@miumg.edu.gt>
 */
public class PuestoTrabajoDto {
    private String dpi;    // DPI del usuario asignado al puesto
    private String puesto; // Nombre del puesto
    private Double salario; // Salario asignado al puesto

    /**
     * Constructor de la clase PuestoTrabajoDto.
     * Inicializa los atributos del puesto de trabajo con los valores proporcionados.
     *
     * @param dpi     El DPI del usuario asignado al puesto.
     * @param puesto  El nombre del puesto.
     * @param salario El salario asignado al puesto.
     */
    public PuestoTrabajoDto(String dpi, String puesto, Double salario) {
        this.dpi = dpi;
        this.puesto = puesto;
        this.salario = salario;
    }

    /**
     * Obtiene el DPI del usuario asignado al puesto.
     *
     * @return El DPI del usuario.
     */
    public String getDpi() {
        return dpi;
    }

    /**
     * Obtiene el nombre del puesto.
     *
     * @return El nombre del puesto.
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Obtiene el salario asignado al puesto.
     *
     * @return El salario del puesto.
     */
    public Double getSalario() {
        return salario;
    }
}
