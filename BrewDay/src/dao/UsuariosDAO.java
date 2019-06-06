package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuariosDAO {
    private String cpf;
    private String nome;
    private String senha;
    private ArrayList<ReceitasDAO> receitas;
    private ProdutosDAO ingredientes;
    
    public UsuariosDAO(String cpf, String nome, String senha) {
        this(cpf, nome, senha, null, null);
    }    
    
    public UsuariosDAO(){
        
    }
    
    public UsuariosDAO(String cpf, String nome, String senha, ArrayList<ReceitasDAO> receitas, ProdutosDAO ingredientes) {
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.receitas = receitas;
        this.ingredientes = ingredientes;
    }
    
    public ArrayList<UsuariosDAO> getAll() throws SQLException, Exception{
        ArrayList<UsuariosDAO> array = new ArrayList<UsuariosDAO>();
        Connection con = Conexao.conectar();
        Statement st = con.createStatement();
        String expSQL = "select * from usuario";
        ResultSet rs = st.executeQuery(expSQL);
        while(rs.next()){
            String nome = rs.getString(1);
            String cpf = rs.getString(2);
            String senha = rs.getString(3);
            UsuariosDAO usuario = new UsuariosDAO(cpf, nome, senha);
            usuario.setIngredientes(ProdutosDAO.getIngredientesUsuario(cpf));
            usuario.setReceitas(ReceitasDAO.getReceitasUsuario(cpf));
            array.add(usuario);
            
        }
        con.close();
        return array;
    }
    
    public void cadastrar() throws Exception{
        Connection con = Conexao.conectar();
        String expSQL = "insert into usuario (cpf, nome, senha) values (?,?,?)";
        PreparedStatement st = con.prepareStatement(expSQL);
        st.setString(1, cpf);
        st.setString(2, nome);
        st.setString(3, senha);
        st.execute();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<ReceitasDAO> getReceitas() {
        return receitas;
    }

    public void setReceitas(ArrayList<ReceitasDAO> receitas) {
        this.receitas = receitas;
    }

    public ProdutosDAO getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ProdutosDAO ingredientes) {
        this.ingredientes = ingredientes;
    }
}
