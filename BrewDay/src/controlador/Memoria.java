package controlador;

import dao.*;
import java.util.ArrayList;

public class Memoria{
    static Memoria instancia = null;
    ArrayList<UsuariosDAO> usuarios = new ArrayList();
    ArrayList<ReceitasDAO> receitas = new ArrayList();
    //ArrayList<AditivosDAO> aditivos = new ArrayList();
    
    
    private Memoria() throws Exception{
        init();
    }
  
    private void init() throws Exception{
        //ListaIngredientesDAO i = new ListaIngredientesDAO(0,0,0,0,v);
        //ListaIngredientesDAO ii = new ListaIngredientesDAO(1,1,1,1,v);
        //UsuariosDAO us = new UsuariosDAO("09615847933", "Bruna", "1234", this.receitas, i);
        //UsuariosDAO u = new UsuariosDAO("00000000000", "Mario", "12345", this.rec, ii);
        UsuariosDAO u = new UsuariosDAO();
        ReceitasDAO r = new ReceitasDAO("",0,0,0,0,0,null);
        usuarios = u.getAll();
        
        
        
        
        
      
        //usuarios.add(us);
        //usuarios.add(u);
    }
    
    public static Memoria getInstance() {
        if (instancia == null) {
            try {
                instancia = new Memoria();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return instancia;
    }

 
    public UsuariosDAO getUsuario(String login, String senha) {
        for(UsuariosDAO u : usuarios){
            if(u.getCpf().equals(login) && u.getSenha().equals(senha)){
                receitas = u.getReceitas();
                
                return u;
            }
        }
        return  null;
    }

 
    public boolean cadastrarUsuario(UsuariosDAO u) throws Exception{
        u.cadastrar();
        usuarios.add(u);
        
        return true;
    }
    
 
    public boolean cadastrarReceita(ReceitasDAO r, String cpf) throws Exception{
        r.cadastrar(cpf);
        receitas.add(r);
        return true;
    }

  
    public boolean procurarCpf(String cpf) {
        for(UsuariosDAO u : usuarios ){
            if(u.getCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }
    
    public boolean excluirReceita(ReceitasDAO r) throws Exception{
        receitas.remove(r);
        r.remover();
        System.out.println("retornei");
        return true;
    }

    
    public ReceitasDAO getReceita(int id) {
        for(ReceitasDAO r : receitas){
            if(r.getId() == id){
                return r;
            }
        }
        return null;
    }

   
    public UsuariosDAO getUsuario(String cpf) {
        for(UsuariosDAO u : usuarios){
            if(u.getCpf().equals(cpf)){
                return u;
            }
        }
        return null;
    }

    
    /*public void adicionarAditivo(AditivosDAO aditivo) {
        for(AditivosDAO a : aditivos){
            if(a.getNome().equals(aditivo.getNome())){
                
            }else{
                aditivos.add(aditivo);
            }
        }
    }*/

    public boolean consultarAditivo(AditivosDAO aditivo, ProdutosDAO produto){
        boolean flag = true;
        for(AditivosDAO a : produto.getAditivo()){
            if(a.getNome().equals(aditivo.getNome())){
                flag = false;
            }
        }
        return flag;
    }
    
    public boolean validarFabricacao(int mal,int le,int lu,int a,String ad,int quantidade,UsuariosDAO u){
        if(u.getIngredientes() != null && u.getIngredientes().getMaltes() >= mal && u.getIngredientes().getAcucares() >= a 
                && u.getIngredientes().getLeveduras() >= le && u.getIngredientes().getLupulo() >= lu){
            ArrayList<AditivosDAO> lista = u.getIngredientes().getAditivo();
            if(ad.equals("")){
                return true;
            }
            boolean flag = false;
            for(AditivosDAO add : lista){
                if(add.getNome().equals(ad)){
                    if(add.getQuantidade() >= quantidade){
                        flag = true;
                    }
                    
                }
               // return false;
            }
            return flag;
        }else{
            return false;
        }
    }
    
}
