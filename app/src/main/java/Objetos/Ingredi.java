package Objetos;

import java.util.Arrays;
import java.util.Objects;

public class Ingredi {
    private int id;
    private String[] ingredi={"Tocino","Extra Queso","Champiñon","salame","Albahaca"};
    private int [] precios = {350,500,250,300,450};

    public Ingredi()
    {


    }

    public Ingredi(int id, String[] ingredi, int[] precios) {
        this.id = id;
        this.ingredi = ingredi;
        this.precios = precios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getIngredi() {
        return ingredi;
    }

    public void setIngredi(String[] ingredi) {
        this.ingredi = ingredi;
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
        if (!(o instanceof Ingredi)) return false;
        Ingredi ingredi1 = (Ingredi) o;
        return id == ingredi1.id && Arrays.equals(ingredi, ingredi1.ingredi) && Arrays.equals(precios, ingredi1.precios);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id);
        result = 31 * result + Arrays.hashCode(ingredi);
        result = 31 * result + Arrays.hashCode(precios);
        return result;
    }

    @Override
    public String toString() {
        return "Ingredi{" +
                "id=" + id +
                ", ingredi=" + Arrays.toString(ingredi) +
                ", precios=" + Arrays.toString(precios) +
                '}';
    }
}
