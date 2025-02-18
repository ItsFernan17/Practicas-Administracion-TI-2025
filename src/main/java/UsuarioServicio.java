import java.util.HashMap;

/**
 * Clase que proporciona servicios para gestionar usuarios.
 * Permite crear, obtener y actualizar usuarios almacenados en un HashMap.
 *
 * @author Fernando Rivas <frivasm@miumg.edu.gt>
 */
public class UsuarioServicio {
    // HashMap para almacenar usuarios, utilizando el DPI como clave
    private final HashMap<String, UsuarioDto> usuarios = new HashMap<>();

    /**
     * Crea un nuevo usuario y lo almacena en el HashMap.
     *
     * @param dpi    El DPI del usuario.
     * @param nombre El nombre del usuario.
     * @param sueldo El sueldo del usuario.
     * @return El usuario creado.
     */
    public UsuarioDto crearUsuario(String dpi, String nombre, Double sueldo) {
        usuarios.put(dpi, new UsuarioDto(dpi, nombre, sueldo)); // Almacena el usuario en el HashMap
        return usuarios.get(dpi); // Devuelve el usuario creado
    }

    /**
     * Obtiene un usuario del HashMap utilizando su DPI.
     *
     * @param dpi El DPI del usuario a obtener.
     * @return El usuario correspondiente al DPI proporcionado, o null si no existe.
     */
    public UsuarioDto obtenerUsuario(String dpi) {
        return usuarios.get(dpi); // Devuelve el usuario asociado al DPI
    }

    /**
     * Actualiza un usuario existente en el HashMap.
     * Si el usuario no existe, lo crea.
     *
     * @param dpi    El DPI del usuario a actualizar.
     * @param nombre El nuevo nombre del usuario.
     * @param sueldo El nuevo sueldo del usuario.
     * @return El usuario actualizado.
     */
    public UsuarioDto actualizarUsuario(String dpi, String nombre, Double sueldo) {
        usuarios.put(dpi, new UsuarioDto(dpi, nombre, sueldo)); // Actualiza o crea el usuario
        return usuarios.get(dpi); // Devuelve el usuario actualizado
    }
}