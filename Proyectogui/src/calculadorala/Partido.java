/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorala;

/**
 *
 * @author User
 */
public class Partido {
    String equipolocal;
    String equipovisitante;
    int goleslocal;
    int golesvisitantes;

    public Partido(String equipolocal, String equipovisitante, int goleslocal, int golesvisitantes) {
        this.equipolocal = equipolocal;
        this.equipovisitante = equipovisitante;
        this.goleslocal = goleslocal;
        this.golesvisitantes = golesvisitantes;
    }

    public String getEquipolocal() {
        return equipolocal;
    }

    public void setEquipolocal(String equipolocal) {
        this.equipolocal = equipolocal;
    }

    public String getEquipovisitante() {
        return equipovisitante;
    }

    public void setEquipovisitante(String equipovisitante) {
        this.equipovisitante = equipovisitante;
    }

    public int getGoleslocal() {
        return goleslocal;
    }

    public void setGoleslocal(int goleslocal) {
        this.goleslocal = goleslocal;
    }

    public int getGolesvisitantes() {
        return golesvisitantes;
    }

    public void setGolesvisitantes(int golesvisitantes) {
        this.golesvisitantes = golesvisitantes;
    }
    
    
    
}
