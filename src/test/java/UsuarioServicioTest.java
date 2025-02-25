import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests para verificar el funcionamiento de los servicios para gestionar usuarios.
 * Esta clase prueba los métodos de creación, obtención y actualización de usuarios.
 *
 * @author Fernando Rivas <frivasm@miumg.edu.gt>
 */
public class UsuarioServicioTest {

    private UsuarioServicio usuarioServicio;

    /**
     * Método que se ejecuta antes de cada test.
     * Inicializa una nueva instancia de UsuarioServicio para cada test.
     */
    @BeforeEach
    public void setUp() {
        usuarioServicio = new UsuarioServicio();
    }

    /**
     * Test unitario para el método crearUsuario de UsuarioServicio.
     * Verifica que un usuario se crea correctamente y que los datos almacenados son correctos.
     */
    @Test
    public void testCrearUsuario() {
        // Crear un nuevo usuario
        UsuarioDto usuario = usuarioServicio.crearUsuario("1234 56789 1011", "Juan Perez", 3000.0);

        // Verificar que el usuario no es nulo
        assertNotNull(usuario);

        // Verificar que los datos del usuario coinciden con los proporcionados
        assertEquals("1234 56789 1011", usuario.getDpi());
        assertEquals("Juan Perez", usuario.getNombre());
        assertEquals(3000.0, usuario.getSueldo());
    }

    /**
     * Test unitario para el método obtenerUsuario de UsuarioServicio.
     * Verifica que un usuario se obtiene correctamente después de ser creado.
     */
    @Test
    public void testObtenerUsuario() {
        // Crear un usuario inicial
        usuarioServicio.crearUsuario("1234 56789 1011", "Juan Perez", 3000.0);

        // Obtener el usuario creado
        UsuarioDto usuario = usuarioServicio.obtenerUsuario("1234 56789 1011");

        // Verificar que el usuario no es nulo
        assertNotNull(usuario);

        // Verificar que los datos del usuario coinciden con los proporcionados
        assertEquals("1234 56789 1011", usuario.getDpi());
        assertEquals("Juan Perez", usuario.getNombre());
        assertEquals(3000.0, usuario.getSueldo());
    }

    /**
     * Test unitario para el método actualizarUsuario de UsuarioServicio.
     * Verifica que un usuario se actualiza correctamente y que los cambios se reflejan en los datos.
     */
    @Test
    public void testActualizarUsuario() {
        // Crear un usuario inicial
        usuarioServicio.crearUsuario("1234 56789 1011", "Juan Perez", 3000.0);

        // Actualizar el usuario con nuevos datos
        UsuarioDto usuarioActualizado = usuarioServicio.actualizarUsuario("1234 56789 1011", "Juan Perez Updated", 3500.0);

        // Verificar que el usuario actualizado no es nulo
        assertNotNull(usuarioActualizado);

        // Verificar que los datos del usuario actualizado son correctos
        assertEquals("1234 56789 1011", usuarioActualizado.getDpi());
        assertEquals("Juan Perez Updated", usuarioActualizado.getNombre());
        assertEquals(3500.0, usuarioActualizado.getSueldo());

        // Obtener el usuario actualizado y verificar que los cambios se aplicaron correctamente
        UsuarioDto usuarioObtenido = usuarioServicio.obtenerUsuario("1234 56789 1011");
        assertNotNull(usuarioObtenido);
        assertEquals("1234 56789 1011", usuarioObtenido.getDpi());
        assertEquals("Juan Perez Updated", usuarioObtenido.getNombre());
        assertEquals(3500.0, usuarioObtenido.getSueldo());
    }
}