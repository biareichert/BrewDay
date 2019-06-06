package dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProdutosDAO {
    private int id;
    private int maltes;
    private int leveduras;
    private int lupulo;
    private int acucares;
    private ArrayList<AditivosDAO> aditivo;

    public ProdutosDAO(){
        
    }
    
    public ProdutosDAO(int id, int maltes, int leveduras, int lupulo, int acucares, ArrayList<AditivosDAO> aditivo) {
        this.id = id;
        this.maltes = maltes;
        this.leveduras = leveduras;
        this.lupulo = lupulo;
        this.acucares = acucares;
        this.aditivo = aditivo;
    }
    
    public static ProdutosDAO getIngredientesUsuario(String cpf) throws Exception{
        ProdutosDAO produto = null;
        Connection con = Conexao.conectar();
        Statement st = con.createStatement();
        String expSQL = "select * from produtos where nomereceita is null and cpf = '" + cpf+"'";
        ResultSet rs = st.executeQuery(expSQL);
        if(rs.next()){
            int id = rs.getInt(1);
            int maltes = rs.getInt(2);
            int lupulo = rs.getInt(3);
            int leveduras = rs.getInt(4);
            int acucares = rs.getInt(5);
               
            produto = new ProdutosDAO(id, maltes, lupulo, leveduras, acucares, AditivosDAO.getAditivosProduto(id) );
            
        }
        con.close();
        return produto;
    }
    public void alterar() throws Exception{
        Connection con = Conexao.conectar();
        String expSQL = "update produtos set maltes = ?,lupulo = ?,leveduras=?,acucares=? where id = ? ";
        PreparedStatement st = con.prepareStatement(expSQL);
        st.setInt(1, this.getMaltes());
        st.setInt(2, this.getLupulo());
        st.setInt(3, this.getLeveduras());
        st.setInt(4, this.getAcucares());
        st.setInt(5, this.getId());
        
        st.execute();
        st.close();
        con.close();
        
    }
    public void cadastrar(String cpf) throws Exception{
        Connection con = Conexao.conectar();
        String expSQL = "insert into produtos (maltes,lupulo,leveduras,acucares,cpf) values (?,?,?,?,?)";
        PreparedStatement st = con.prepareStatement(expSQL);
        st.setInt(1, this.getMaltes());
        st.setInt(2, this.getLupulo());
        st.setInt(3, this.getLeveduras());
        st.setInt(4, this.getAcucares());
        st.setString(5, cpf);
        
        st.execute();
        this.setId(ProdutosDAO.getIngredientesUsuario(cpf).getId());
        st.close();
        con.close();
        
    }

    public int getMaltes() {
        return maltes;
    }

    public void setMaltes(int maltes) {
        this.maltes = maltes;
    }

    public int getLeveduras() {
        return leveduras;
    }

    public void setLeveduras(int leveduras) {
        this.leveduras = leveduras;
    }

    public int getLupulo() {
        return lupulo;
    }

    public void setLupulo(int lupulo) {
        this.lupulo = lupulo;
    }

    public int getAcucares() {
        return acucares;
    }

    public void setAcucares(int acucares) {
        this.acucares = acucares;
    }

    public ArrayList<AditivosDAO> getAditivo() {
        return aditivo;
    }


    public void setAditivo(ArrayList<AditivosDAO> aditivo) {
        this.aditivo = aditivo;
    }
    
    public void addAditivo(AditivosDAO a){
        this.aditivo.add(a);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
}
