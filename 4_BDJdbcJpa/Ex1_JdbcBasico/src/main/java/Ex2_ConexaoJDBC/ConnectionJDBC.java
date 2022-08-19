package Ex2_ConexaoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    public static void main(String[] args) throws ClassNotFoundException {

        // 1 - NÃO ESQUECER DE BAIXAR O DRIVER PARA O BANCO DE DADOS QUE IRÁ UTILIZAR!

        // 2 - Definir parâmetros para se conectar ao banco de dados MySQL.
        String driver = "mysql";
        String dataBaseAddress = "127.0.0.1";
        String dataBaseName = "digital_innovation_one";
        String user = "root";
        String password = "123456";

        // 3 - Construção da string de conexão.
        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAddress).append(":3306").append("/")
                .append(dataBaseName);

        String connectionUrl = sb.toString(); //sb.toString() == "jdbc:mysql://localhost/digital_innovation_one"

        //Carregar a classe específica de implementação do driver na memória da JVM. (A partir da versão JDBC 4 não é mais necessário!)
        //Class.forName("com.mysql.jdbc.Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 4 - Criar conexão usando o DriverManager, passando como parâmetros a string de conexão, usuário e senha do usuário.
        try (Connection conn = DriverManager.getConnection(connectionUrl, user, password)) {
            System.out.println("SUCESSO ao se conectar ao banco MySQL!");
        } catch (SQLException e) {
            System.out.println("FALHA ao se conectar ao banco MySQL!");
            e.printStackTrace();
        }

        // Exemplo 1
        /*
        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";
        //Connection conn = DriverManager.getConnection(urlConnection, "root", "123456"); //urlConnection

        try {
            Connection conn = DriverManager.getConnection(urlConnection, "root", "123456");
            System.out.println("SUCESSO ao se conectar ao banco MySQL!");
        } catch (SQLException e) {
            System.out.println("FALHA ao se conectar ao banco MySQL!");
            e.printStackTrace();
        } */

        //Exemplo 2
        /*
        String urlConnection = "jdbc:mysql://localhost:3306/digital_innovation_one";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(urlConnection, "root", "123456");
            System.out.println("SUCESSO ao se conectar ao banco MySQL!");
        } catch (SQLException e) {
            System.out.println("FALHA ao se conectar ao banco MySQL!");
            e.printStackTrace();
        } //finally {
            //conn.close();
        //}
*/
    }
}
