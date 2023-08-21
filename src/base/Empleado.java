/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;
/**
 *
 * @author Usuario
 */
import java.time.Instant;
import java.time.LocalDate;
public class Empleado {
    private Integer cedula;
    private String nombre;
    private String apellidos;
    private char genero;
    private String fechaNac;
    private String email;
    private Double salario;
    private Double porcComision;

    public Empleado() {
        this.cedula = 0;
        this.nombre = "";
        this.apellidos = "";
        this.genero = genero;
        this.fechaNac ="";
        this.email = "";
        this.salario = 0.0;
        this.porcComision = 0.0;
    }

    public Empleado(Integer cedula, String nombre, String apellidos, char genero, String fechaNac, String email, Double salario, double porcComision) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.fechaNac = fechaNac;
        this.email = email;
        this.salario = salario;
        this.porcComision = porcComision;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getPorcComision() {
        return porcComision;
    }

    public void setPorcComision(Double porcComision) {
        this.porcComision = porcComision;
    }
    
    
}
