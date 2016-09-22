package dao;


import java.util.ArrayList;
import model.RequisitosProjeto;

/**
 *
 * @author Rafael
 */
public class RequisitosProjetoDao extends Dao{
        
    
    public RequisitosProjeto DaoSalvar(RequisitosProjeto requisitos) {
        return (RequisitosProjeto) salvar(requisitos);
    }

    public void DaoExcluir(RequisitosProjeto requisitos) {
        excluir(requisitos.getRequisitosProjetoId(), RequisitosProjeto.class);
    }

    public RequisitosProjeto DaoBuscarObjeto(RequisitosProjeto requisitos) {
        return (RequisitosProjeto) buscarObjeto(requisitos.getRequisitosProjetoId(), RequisitosProjeto.class);
    }

    public RequisitosProjeto DaoBuscarObjetoPorId(int id) {
        return (RequisitosProjeto) buscarObjeto(id, RequisitosProjeto.class);
    }
    public ArrayList<RequisitosProjeto> DaoBuscarObjetos() {
        ArrayList<RequisitosProjeto> lista = (ArrayList<RequisitosProjeto>) buscarObjetos(RequisitosProjeto.class);
        return  lista;
    }
}
