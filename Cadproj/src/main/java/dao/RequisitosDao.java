package dao;

import model.Requisitos;

/**
 *
 * @author Rafael
 */
public class RequisitosDao extends Dao {

    public void DaoSalvar(Requisitos requisitos) {
        salvar(requisitos);
    }

    public void DaoExcluir(Requisitos requisitos) {
        excluir(requisitos.getRequisitosId(), Requisitos.class);
    }

    public void DaoBuscarObjeto(Requisitos requisitos) {
        buscarObjeto(requisitos.getRequisitosId(), Requisitos.class);
    }

    public void DaoBuscarObjetos() {
        buscarObjetos(Requisitos.class);
    }
}
