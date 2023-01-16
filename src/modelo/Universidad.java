
package modelo;

public class Universidad {
    private String nomb;
    private String cuidad;
    private int tlf;
    private String dir;
    private String tipo;

    public Universidad(String nomb, String cuidad, int tlf, String dir, String tipo) {
        this.nomb = nomb;
        this.cuidad = cuidad;
        this.tlf = tlf;
        this.dir = dir;
        this.tipo = tipo;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTipo() {
        return tipo;
    }

    public void setWeb(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Universidad{" + "nomb=" + nomb + ", cuidad=" + cuidad + ", tlf=" + tlf + ", dir=" + dir + ", web=" + tipo + '}';
    }
}
