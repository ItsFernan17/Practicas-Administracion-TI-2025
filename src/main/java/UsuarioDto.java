/**
 * Clase que representa un DTO (Data Transfer Object) para la entidad Usuario.
 * Contiene los atributos básicos de un usuario: DPI, nombre y sueldo.
 * Proporciona métodos para acceder a estos atributos.
 *
 * @author Fernando Rivas <frivasm@miumg.edu.gt>
 */
public class UsuarioDto {
    private String dpi;    // DPI del usuario (formato: 1234 12345 1234, mínimo y máximo 15 caracteres)
    private String nombre; // Nombre del usuario (no puede contener números)
    private Double sueldo; // Sueldo del usuario (debe ser un número)

    /**
     * Constructor de la clase UsuarioDto.
     * Inicializa los atributos del usuario con los valores proporcionados.
     *
     * @param dpi    El DPI del usuario (formato: 1234 12345 1234, mínimo y máximo 15 caracteres).
     * @param nombre El nombre del usuario (no puede contener números).
     * @param sueldo El sueldo del usuario (debe ser un número).
     * @throws IllegalArgumentException Si el DPI, nombre o sueldo no cumplen con las validaciones.
     */
    public UsuarioDto(String dpi, String nombre, Double sueldo) {
        validarDpi(dpi);      // Validar el formato del DPI
        validarNombre(nombre); // Validar que el nombre no contenga números
        validarSueldo(sueldo); // Validar que el sueldo sea un número válido

        this.dpi = dpi;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    /**
     * Válida que el DPI tenga el formato correcto (1234 12345 1234) y que tenga exactamente 15 caracteres.
     *
     * @param dpi El DPI a validar.
     * @throws IllegalArgumentException Si el DPI no cumple con el formato o la longitud requerida.
     */
    private void validarDpi(String dpi) {
        if (dpi == null || dpi.length() != 15 || !dpi.matches("\\d{4} \\d{5} \\d{4}")) {
            throw new IllegalArgumentException("El DPI debe tener el formato 1234 12345 1234 y exactamente 15 caracteres.");
        }
    }

    /**
     * Valida que el nombre no contenga números.
     *
     * @param nombre El nombre a validar.
     * @throws IllegalArgumentException Si el nombre contiene números.
     */
    private void validarNombre(String nombre) {
        if (nombre == null || nombre.matches(".*\\d.*")) {
            throw new IllegalArgumentException("El nombre no puede contener números.");
        }
    }

    /**
     * Valida que el sueldo sea un número válido (no nulo y no negativo).
     *
     * @param sueldo El sueldo a validar.
     * @throws IllegalArgumentException Si el sueldo es nulo o negativo.
     */
    private void validarSueldo(Double sueldo) {
        if (sueldo == null || sueldo < 0) {
            throw new IllegalArgumentException("El sueldo debe ser un número válido y no puede ser negativo.");
        }
    }

    /**
     * Obtiene el DPI del usuario.
     *
     * @return El DPI del usuario.
     */
    public String getDpi() {
        return dpi;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el sueldo del usuario.
     *
     * @return El sueldo del usuario.
     */
    public Double getSueldo() {
        return sueldo;
    }
}