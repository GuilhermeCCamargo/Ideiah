package dao;

import java.util.ArrayList;
import model.RequisitosProjeto;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Rafael
 */

public class RequisitosProjetoDaoTest {

    private RequisitosProjeto requisitoSalvo;

    public RequisitosProjetoDaoTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of DaoSalvar method, of class RequisitosProjetoDao.
     */
    @Ignore
    public void testDaoSalvar() {
        System.out.println("DaoSalvar");
        RequisitosProjeto requisitos = null;
        RequisitosProjetoDao instance = new RequisitosProjetoDao();
        instance.DaoExcluir(requisitos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of DaoSalvar method, of class RequisitosProjetoDao.
     */
    @Test
    public void testDaoSalvar2() {
        System.out.println("DaoSalvar");
        RequisitosProjeto requisitos = new RequisitosProjeto();

        requisitos.setNomeProjeto("Projeto1");
        requisitos.setDataInicio("14/09/2016");
        requisitos.setDataFim("15/09/2016");
        RequisitosProjetoDao instance = new RequisitosProjetoDao();
        requisitoSalvo = instance.DaoSalvar(requisitos);
        assertEquals("Teste salvar", instance.DaoBuscarObjeto(requisitoSalvo).getRequisitosProjetoId(), requisitoSalvo.getRequisitosProjetoId());
        instance.DaoExcluir(requisitoSalvo);
    }

    /**
     * Test of DaoExcluir method, of class RequisitosProjetoDao.
     */
    @Test
    public void testDaoExcluir() {
        System.out.println("DaoExcluir");

        RequisitosProjeto requisitos = new RequisitosProjeto();

        requisitos.setNomeProjeto("Projeto1");
        requisitos.setDataInicio("14/09/2016");
        requisitos.setDataFim("15/09/2016");
        
        RequisitosProjetoDao instance = new RequisitosProjetoDao();
        requisitoSalvo = new RequisitosProjeto();
        requisitoSalvo = instance.DaoSalvar(requisitos);
        int id = requisitoSalvo.getRequisitosProjetoId();
        instance.DaoExcluir(requisitoSalvo);        
        assertNull(instance.DaoBuscarObjetoPorId(id));
    }

    /**
     * Test of DaoBuscarObjetos method, of class RequisitosProjetoDao.
     */
    @Ignore
    public void testDaoBuscarObjetos() {
        System.out.println("DaoBuscarObjetos");

        RequisitosProjetoDao instance = new RequisitosProjetoDao();

        ArrayList<RequisitosProjeto> lista = instance.DaoBuscarObjetos();

        assertFalse("deu certo", lista.isEmpty());
    }

    

}
