package dao;

import java.util.ArrayList;
import model.Requisitos;

/**
 *
 * @author Rafael
 */
public class RequisitosDao extends Dao {

    public Requisitos DaoSalvar(Requisitos requisitos) {
        return (Requisitos) salvar(requisitos);
    }

    public void DaoExcluir(Requisitos requisitos) {
        excluir(requisitos.getRequisitosId(), Requisitos.class);
    }

    public Requisitos DaoBuscarObjeto(Requisitos requisitos) {
        return (Requisitos) buscarObjeto(requisitos.getRequisitosId(), Requisitos.class);
    }

    public ArrayList<Requisitos> DaoBuscarObjetos() {
        ArrayList<Requisitos> lista = (ArrayList<Requisitos>) buscarObjetos(Requisitos.class);
        return  lista;
    }
}
