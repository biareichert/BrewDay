package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AditivosDAO {
    
    private int idAditivo;
    private String nome;
    private int quantidade;
    
    public AditivosDAO(){
        
    }
    
    public AditivosDAO(int idAditivo, String nome, int quantidade) {
        this.idAditivo = idAditivo;
        this.nome = nome;
        this.quantidade = quantidade;   
    }
    
    public static ArrayList<AditivosDAO> getAditivosProduto(int idProduto) throws Exception{
        ArrayList<AditivosDAO> array = new ArrayList<AditivosDAO>();
        Connection con = Conexao.conectar();
        Statement st = con.createStatement();
        String expSQL = "select * from aditivo where idproduto = " + idProduto;
        ResultSet rs = st.executeQuery(expSQL);
        while(rs.next()){
            int idAditivo = rs.getInt(1);
            String nome = rs.getString(2);
            int quantidade = rs.getInt(3);
          
            AditivosDAO ad = new AditivosDAO(idAditivo, nome, quantidade);
            array.add(ad);
        }
        con.close();
        return array;
    }
    
    public static AditivosDAO getAditivosProdutoNome(int idProduto, String nome) throws Exception{
        AditivosDAO ad = null;
        Connection con = Conexao.conectar();
        Statement st = con.createStatement();
        String expSQL = "select * from aditivo where idproduto = " + idProduto + " and nome = '"+ nome+"'";
        ResultSet rs = st.executeQuery(expSQL);
        if(rs.next()){
            int idAditivo = rs.getInt(1);
            int quantidade = rs.getInt(3);
          
            ad = new AditivosDAO(idAditivo, nome, quantidade);
            //array.add(ad);
        }
        con.close();
        return ad;
    }

    public int getIdAditivo() {
        return idAditivo;
    }

    public void setIdAditivo(int idAditivo) {
        this.idAditivo = idAditivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void cadastrarAditivo(int idProduto) throws Exception {
        Connection con = Conexao.conectar();
        String expSQL = "insert into aditivo (nome, quantidade, idproduto) values (?,?,?)";
        PreparedStatement st = con.prepareStatement(expSQL);
        st.setString(1, nome.toLowerCase());
        st.setInt(2, quantidade);
        st.setInt(3, idProduto);
        st.execute();
        st.close();
        con.close();
    }
    
    public void alterarAditivo() throws Exception {
        Connection con = Conexao.conectar();
        String expSQL = "update aditivo set nome = ?, quantidade = ? where idaditivo = ?";
        PreparedStatement st = con.prepareStatement(expSQL);
        st.setString(1, nome.toLowerCase());
        st.setInt(2, quantidade);
        st.setInt(3, idAditivo);
        st.execute();
        st.close();
        con.close();
    }

    public static void removerAditivo(int id) throws Exception {
        Connection con = Conexao.conectar();
        String expSQL = "delete from aditivo where idproduto = ?";
        PreparedStatement st = con.prepareStatement(expSQL);
        st.setInt(1, id);
        st.execute();
        st.close();
        con.close();
        
    }
    
}
