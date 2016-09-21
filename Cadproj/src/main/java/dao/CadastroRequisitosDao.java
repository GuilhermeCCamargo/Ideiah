package dao;

import model.CadastroRequisitos;

/**
 *
 * @author Rafael
 */
public class CadastroRequisitosDao extends Dao {

    public void DaoSalvar(CadastroRequisitos requisitos) {
        salvar(requisitos);
    }

    public void DaoExcluir(CadastroRequisitos requisitos) {
        excluir(requisitos.getCrId(), CadastroRequisitos.class);
    }

    public void DaoBuscarObjeto(CadastroRequisitos requisitos) {
        buscarObjeto(requisitos.getCrId(), CadastroRequisitos.class);
    }

    public void DaoBuscarObjetos() {
        buscarObjetos(CadastroRequisitos.class);
    }
}
