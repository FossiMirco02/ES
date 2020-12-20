package ServerHTTP;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Classe per la gestione del database
 * @author IO
 */
public class DataBase 
{

	String url = "jdbc:mysql://localhost:3306/provejava";
    /**
     * Metodo per la connessione al database
     *
     * @return l'oggetto Connessione
     */
    private Connection connect() {  	
        Connection conness = null;
        try {
            conness = DriverManager.getConnection(url,"root","");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conness;
    }

    /**
     * Metodo per vedere i messaggi
     *
     * @param source String
     * @param dest String
     * @param il vettore con i messaggi
     */
    public java.util.Vector <persona> readAll() {
    	String sql ="select firstName,lastName,address,passport from person"; 

    	java.util.Vector <persona> pers = new java.util.Vector <persona>(1,1);
    	persona p;
    	try{
     	Connection conn = this.connect();
        Statement stmt  = conn.createStatement();
     	ResultSet rs    = stmt.executeQuery(sql);
             while (rs.next()) {
               p= new persona();
               p.setFirstName(rs.getString("nome"));     
               p.setLastName(rs.getString("cognome"));
               p.setAddress(rs.getString("indirizzo")); 
               p.setPassport(rs.getString("eta"));       
               pers.add(p);
             }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    	 return pers;
    }
  
}