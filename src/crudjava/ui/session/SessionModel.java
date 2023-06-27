/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudjava.ui.session;

/**
 *
 * @author arif
 */
public class SessionModel {
    private static int id_user;
    private static String nama;
    private static String username;
    private static String password;
    private static boolean status;

    public static int getId_user() {
        return id_user;
    }

    public static void setId_user(int id_user) {
        SessionModel.id_user = id_user;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        SessionModel.nama = nama;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        SessionModel.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        SessionModel.password = password;
    }

    public static boolean getStatus() {
        return status;
    }

    public static void setStatus(boolean status) {
        SessionModel.status = status;
    }
}
