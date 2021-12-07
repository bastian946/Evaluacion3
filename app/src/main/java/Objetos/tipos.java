package Objetos;

import java.util.Arrays;
import java.util.Objects;

public class tipos {

    private int id;
    private String[] tipos={"Pizza Napolitana","Pizza Predilecta","Pizza Vegana","Pizza Selecta"};
    private int[]precios={12500,13800,15600,18600};

    public tipos()
    {

    }

    public tipos(int id, String[] tipos, int[] precios) {
        this.id = id;
        this.tipos = tipos;
        this.precios = precios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public int[] getPrecios() {
        return precios;
    }

    public void setPrecios(int[] precios) {
        this.precios = precios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof tipos)) return false;
        tipos tipos1 = (tipos) o;
        return id == tipos1.id && Arrays.equals(tipos, tipos1.tipos) && Arrays.equals(precios, tipos1.precios);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id);
        result = 31 * result + Arrays.hashCode(tipos);
        result = 31 * result + Arrays.hashCode(precios);
        return result;
    }

    @Override
    public String toString() {
        return "tipos{" +
                "id=" + id +
                ", tipos=" + Arrays.toString(tipos) +
                ", precios=" + Arrays.toString(precios) +
                '}';
    }
}
