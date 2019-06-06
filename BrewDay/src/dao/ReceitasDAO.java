package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ReceitasDAO extends ProdutosDAO{
    private String nome;
    
    
    public ReceitasDAO(String nome, int maltes, int leveduras, int lupulo, int acucares, ArrayList<AditivosDAO> aditivo){
        this(nome,0, maltes, leveduras, lupulo, acucares, aditivo);
    }
    public ReceitasDAO(String nome, int id, int maltes, int leveduras, int lupulo, int acucares, ArrayList<AditivosDAO> aditivo) {
        super(id, maltes, leveduras, lupulo, acucares, aditivo);
        this.nome = nome;
        
    }
    public static ArrayList<ReceitasDAO> getReceitasUsuario(String cpf) throws Exception{
        ArrayList<ReceitasDAO> array = new ArrayList<ReceitasDAO>();
        ReceitasDAO receita = null;
        Connection con = Conexao.conectar();
        Statement st = con.createStatement();
        String expSQL = "select * from produtos where nomereceita is not null and cpf = '" + cpf+"'";
        ResultSet rs = st.executeQuery(expSQL);
        while(rs.next()){
            int id = rs.getInt(1);
            int maltes = rs.getInt(2);
            int lupulo = rs.getInt(3);
            int leveduras = rs.getInt(4);
            int acucares = rs.getInt(5);
            String nome = rs.getString(6);
               
            receita = new ReceitasDAO(nome, id, maltes, lupulo, leveduras, acucares, AditivosDAO.getAditivosProduto(id) );
            array.add(receita);
            
        }
        con.close();
        return array;
    }
    
    public void alterar() throws Exception{
        Connection con = Conexao.conectar();
        String expSQL = "update produtos set maltes = ?,lupulo = ?,leveduras=?,acucares=?,nomereceita=? where id = ? ";
        PreparedStatement st = con.prepareStatement(expSQL);
        st.setInt(1, this.getMaltes());
        st.setInt(2, this.getLupulo());
        st.setInt(3, this.getLeveduras());
        st.setInt(4, this.getAcucares());
        st.setString(5, this.getNome());
        st.setInt(6, this.getId());
        
        st.execute();
        this.getAditivo().get(0).alterarAditivo();
        st.close();
        con.close();
        
    }
    
    public void cadastrar(String cpf) throws Exception{
        Connection con = Conexao.conectar();
        String expSQL = "insert into produtos (maltes,lupulo,leveduras,acucares,nomereceita,cpf) values (?,?,?,?,?,?)";
        PreparedStatement st = con.prepareStatement(expSQL);
        st.setInt(1, this.getMaltes());
        st.setInt(2, this.getLupulo());
        st.setInt(3, this.getLeveduras());
        st.setInt(4, this.getAcucares());
        st.setString(5, this.getNome());
        st.setString(6, cpf);
        
        st.execute();
        consultarReceitaPorNome();
        this.getAditivo().get(0).cadastrarAditivo(this.getId());
        st.close();
        con.close();
        
    }
    
    public ReceitasDAO consultarReceitaPorNome() throws Exception{
        Connection con = Conexao.conectar();
        String expSQL = "select id from produtos where nomereceita = '"+nome+"'";
        Statement st = con.createStatement();
       
        ResultSet rs = st.executeQuery(expSQL);
        while(rs.next()){
            int id = rs.getInt(1);
            this.setId(id);
        }
        con.close();
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void remover() throws Exception {
        this.getAditivo().get(0).removerAditivo(this.getId());
        Connection con = Conexao.conectar();
        String expSQL = "delete from produtos where id = ?";
        PreparedStatement st = con.prepareStatement(expSQL);
        st.setInt(1, this.getId());
        
        st.execute();
        st.close();
        con.close();
    }

}
