/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudjava.service.koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;

/**
 *
 * @author arif
 */
public class Koneksi {
    private static Connection koneksi;
    private static MysqlDataSource datasource;
    public static Connection getKoneksi() throws Exception{
        datasource = new MysqlDataSource();
        datasource.setURL("jdbc:mysql://localhost:3306/db_crud_barang");
        datasource.setUser("root");
        datasource.setPassword("");
        koneksi = datasource.getConnection();
        return koneksi;
    }
}
