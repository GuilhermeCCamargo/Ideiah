package dao;

import java.util.ArrayList;
import model.CadastroRequisitos;

/**
 *
 * @author Rafael
 */
public class CadastroRequisitosDao extends Dao {

    public CadastroRequisitos DaoSalvar(CadastroRequisitos cadastro) {
        return (CadastroRequisitos) salvar(cadastro);
    }

    public void DaoExcluir(CadastroRequisitos cadastro) {
        excluir(cadastro.getCrId(), CadastroRequisitos.class);
    }

    public CadastroRequisitos DaoBuscarObjeto(CadastroRequisitos cadastro) {
        return (CadastroRequisitos) buscarObjeto(cadastro.getCrId(), CadastroRequisitos.class);
    }

    public ArrayList<CadastroRequisitos> DaoBuscarObjetos() {
        ArrayList<CadastroRequisitos> lista = (ArrayList<CadastroRequisitos>) buscarObjetos(CadastroRequisitos.class);
        return  lista;
    }
}
