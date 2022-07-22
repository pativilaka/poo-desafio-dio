package desafio_dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return  (" \nCurso:" +
                " \nTitulo = " + getTitulo() +
                " \nDescrição = " + getDescricao() +
                " \nCarga Horária = " + cargaHoraria + "\n");
           }


}
