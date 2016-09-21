package dao;

import model.CadastroRequisitos;
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
@Ignore
public class CadastroRequisitosDaoTest {
    
    public CadastroRequisitosDaoTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of DaoSalvar method, of class CadastroRequisitosDao.
     */
    @org.junit.Test
    public void testDaoSalvar() {
        System.out.println("DaoSalvar");
        CadastroRequisitos requisitos = null;
        CadastroRequisitosDao instance = new CadastroRequisitosDao();
        instance.DaoSalvar(requisitos);
        
    }

    /**
     * Test of DaoSalvar method, of class CadastroRequisitosDao.
     */
    @org.junit.Test
    public void testDaoSalvar2() {
        System.out.println("DaoSalvar");
        CadastroRequisitos requisitos = new CadastroRequisitos();
        requisitos.setDescricao("teste");
        requisitos.setFormato("outroteste");
        
        requisitos.setStatus("mais um");
        CadastroRequisitosDao instance = new CadastroRequisitosDao();
        instance.DaoSalvar(requisitos);
        
    }
    /**
     * Test of DaoExcluir method, of class CadastroRequisitosDao.
     */
    @org.junit.Test
    public void testDaoExcluir() {
        System.out.println("DaoExcluir");
        CadastroRequisitos requisitos = null;
        CadastroRequisitosDao instance = new CadastroRequisitosDao();
        instance.DaoExcluir(requisitos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DaoBuscarObjeto method, of class CadastroRequisitosDao.
     */
    @org.junit.Test
    public void testDaoBuscarObjeto() {
        System.out.println("DaoBuscarObjeto");
        CadastroRequisitos requisitos = null;
        CadastroRequisitosDao instance = new CadastroRequisitosDao();
        instance.DaoBuscarObjeto(requisitos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DaoBuscarObjetos method, of class CadastroRequisitosDao.
     */
    @org.junit.Test
    public void testDaoBuscarObjetos() {
        System.out.println("DaoBuscarObjetos");
        CadastroRequisitosDao instance = new CadastroRequisitosDao();
        instance.DaoBuscarObjetos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
