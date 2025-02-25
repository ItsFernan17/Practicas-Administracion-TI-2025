import java.util.HashMap;

/**
 * Clase que proporciona servicios para gestionar puestos de trabajo de los usuarios.
 * Permite asignar, obtener y actualizar información de los puestos de trabajo.
 *
 * @author Fernando Rivas <frivasm@miumg.edu.gt>
 */
public class PuestoTrabajoServicio {
    // HashMap para almacenar puestos de trabajo, utilizando el DPI del usuario como clave
    private final HashMap<String, PuestoTrabajoDto> puestos = new HashMap<>();

    /**
     * Asigna un puesto de trabajo a un usuario.
     *
     * @param dpi       El DPI del usuario.
     * @param puesto    El nombre del puesto.
     * @param salario   El salario asignado al puesto.
     * @return El puesto de trabajo asignado.
     */
    public PuestoTrabajoDto asignarPuesto(String dpi, String puesto, Double salario) {
        puestos.put(dpi, new PuestoTrabajoDto(dpi, puesto, salario));
        return puestos.get(dpi);
    }

    /**
     * Obtiene el puesto de trabajo de un usuario.
     *
     * @param dpi El DPI del usuario.
     * @return El puesto de trabajo del usuario, o null si no existe.
     */
    public PuestoTrabajoDto obtenerPuesto(String dpi) {
        return puestos.get(dpi);
    }

    /**
     * Actualiza el puesto de trabajo de un usuario.
     * Si no existe, lo asigna.
     *
     * @param dpi       El DPI del usuario.
     * @param puesto    El nuevo puesto de trabajo.
     * @param salario   El nuevo salario asignado al puesto.
     * @return El puesto de trabajo actualizado.
     */
    public PuestoTrabajoDto actualizarPuesto(String dpi, String puesto, Double salario) {
        puestos.put(dpi, new PuestoTrabajoDto(dpi, puesto, salario));
        return puestos.get(dpi);
    }
}