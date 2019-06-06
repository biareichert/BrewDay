package controlador;

import dao.*;

public class RegrasNegocio {
    
    static Memoria MEM = Memoria.getInstance();
    
     public static UsuariosDAO validarUsuario(String login, String senha){
        UsuariosDAO u = MEM.getUsuario(login, senha);
        return u;
    }
     public static boolean cadastrar(UsuariosDAO usuarios) throws Exception{
        boolean i = MEM.cadastrarUsuario(usuarios);
        return i;
    }
     
     public static boolean verificarCpf(String cpf){
         boolean c = MEM.procurarCpf(cpf);
         if(cpf.length() == 11 && !c){
             return true;
         }
         return false;
     }
    
     public static ReceitasDAO getReceitaID(int id){
         ReceitasDAO r = MEM.getReceita(id);
         return r;
     }
     
     public static UsuariosDAO getUsuario(String cpf){
         UsuariosDAO u = MEM.getUsuario(cpf);
         return u;
     }
     
     public static boolean verificarQuantidade(int maltes, int leveduras, int lupulo, int acucares, int qnt){
         if(maltes > 0 && leveduras > 0 && lupulo > 0 && acucares > 0 && qnt > 0){
             return true;
         }
         return false;
     }
     
     public static boolean cadastrarReceita(ReceitasDAO receita, String cpf) throws Exception{
         boolean i = MEM.cadastrarReceita(receita, cpf);
         return i;
     }
     
     public static void adicionarAditivo(AditivosDAO aditivo){
         MEM.adicionarAditivo(aditivo);
     }
     
     public static boolean excluirReceita(ReceitasDAO r) throws Exception{
         boolean i = MEM.excluirReceita(r);
         return i;
     }
     
     public static boolean validarFabricacao(int mal,int le,int lu,int a,String aditivos,int quantidade, UsuariosDAO u){
         boolean i = MEM.validarFabricacao(mal,le,lu,a,aditivos,quantidade,u);
         return i;
     }
     
     public static boolean consultarAditivo(AditivosDAO aditivo, ProdutosDAO produto){
         boolean i = MEM.consultarAditivo(aditivo, produto);
         return i;
     }
     
  
             
}
