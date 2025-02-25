import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests para verificar el funcionamiento de los servicios para gestionar puestos de trabajo de los usuarios.
 * Esta clase prueba los métodos de asignación, obtención y actualización de puestos de trabajo.
 *
 * @author Fernando Rivas <frivasm@miumg.edu.gt>
 */
public class PuestoTrabajoServicioTests {

    private PuestoTrabajoServicio puestoTrabajoServicio;

    /**
     * Método que se ejecuta antes de cada test.
     * Inicializa una nueva instancia de PuestoTrabajoServicio para cada test.
     */
    @BeforeEach
    public void setUp() {
        puestoTrabajoServicio = new PuestoTrabajoServicio();
    }

    /**
     * Test unitario para el método asignarPuesto de PuestoTrabajoServicio.
     * Verifica que un puesto de trabajo se asigna correctamente a un usuario.
     */
    @Test
    public void testAsignarPuesto() {
        // Asignar un puesto de trabajo
        PuestoTrabajoDto puesto = puestoTrabajoServicio.asignarPuesto("1234 56789 1011", "Desarrollador", 5000.0);

        // Verificar que el puesto no es nulo
        assertNotNull(puesto);

        // Verificar que los datos del puesto coinciden con los proporcionados
        assertEquals("1234 56789 1011", puesto.getDpi());
        assertEquals("Desarrollador", puesto.getPuesto());
        assertEquals(5000.0, puesto.getSalario());
    }

    /**
     * Test unitario para el método obtenerPuesto de PuestoTrabajoServicio.
     * Verifica que se obtiene correctamente el puesto de trabajo de un usuario.
     */
    @Test
    public void testObtenerPuesto() {
        // Asignar un puesto de trabajo
        puestoTrabajoServicio.asignarPuesto("1234 56789 1011", "Desarrollador", 5000.0);

        // Obtener el puesto de trabajo asignado
        PuestoTrabajoDto puesto = puestoTrabajoServicio.obtenerPuesto("1234 56789 1011");

        // Verificar que el puesto no es nulo
        assertNotNull(puesto);

        // Verificar que los datos del puesto coinciden con los proporcionados
        assertEquals("1234 56789 1011", puesto.getDpi());
        assertEquals("Desarrollador", puesto.getPuesto());
        assertEquals(5000.0, puesto.getSalario());
    }

    /**
     * Test unitario para el método actualizarPuesto de PuestoTrabajoServicio.
     * Verifica que el puesto de trabajo de un usuario se actualiza correctamente.
     */
    @Test
    public void testActualizarPuesto() {
        // Asignar un puesto de trabajo inicial
        puestoTrabajoServicio.asignarPuesto("1234 56789 1011", "Desarrollador", 5000.0);

        // Actualizar el puesto de trabajo con nuevos datos
        PuestoTrabajoDto puestoActualizado = puestoTrabajoServicio.actualizarPuesto("1234 56789 1011", "Senior Desarrollador", 7000.0);

        // Verificar que el puesto actualizado no es nulo
        assertNotNull(puestoActualizado);

        // Verificar que los datos del puesto actualizado son correctos
        assertEquals("1234 56789 1011", puestoActualizado.getDpi());
        assertEquals("Senior Desarrollador", puestoActualizado.getPuesto());
        assertEquals(7000.0, puestoActualizado.getSalario());

        // Obtener el puesto actualizado y verificar que los cambios se aplicaron correctamente
        PuestoTrabajoDto puestoObtenido = puestoTrabajoServicio.obtenerPuesto("1234 56789 1011");
        assertNotNull(puestoObtenido);
        assertEquals("1234 56789 1011", puestoObtenido.getDpi());
        assertEquals("Senior Desarrollador", puestoObtenido.getPuesto());
        assertEquals(7000.0, puestoObtenido.getSalario());
    }
}
