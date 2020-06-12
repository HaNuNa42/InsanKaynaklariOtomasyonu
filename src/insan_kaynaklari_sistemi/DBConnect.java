package insan_kaynaklari_sistemi;

import insan_kaynaklari_sistemi.POJO.PersonelPojo;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author parthenia
 */
public class DBConnect {

    static ResultSet resulset;
    static PreparedStatement prstatement;
    static Connection conn;
    static String dbUrl = "jdbc:mysql://localhost:3306/ikotomasyonu?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    static String dbName = "ikotomasyonu";
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String dbUserName = "root";
    static String dbPass = "hatice";
    public static ArrayList<PersonelPojo> persPojo;
    public static DefaultTableModel model;

    public static Connection baglantiAc() {
        try {
            Class.forName(driver).newInstance();
            System.out.println("veritabanına bağlanıldı");
            conn = DriverManager.getConnection(dbUrl, dbUserName, dbPass);

            Statement st = conn.createStatement();
        } catch (Exception e) {
            System.out.println(e + " veritabanına bağlantı başarısız");
        }
        return conn;
    }

    public static void baglantiKapat() throws Exception {
        conn.close();
    }

    public static boolean yetkilikontrol(String username, String pass) throws SQLException {
        //  baglantiAc();
        try {
            Statement statement = conn.createStatement();
            System.out.println("kullanıcı sorgulanıyor");
            resulset = statement.executeQuery("SELECT * FROM ikotomasyonu.yetkili WHERE kullaniciAdi='" + username + "' and sifre='" + pass + "';");
            System.out.println("kullanıcı sorgulandı");

            if (resulset.next()) {
                System.out.println("kullanıcı doğrulandı");

                HomePage open = new HomePage();
                open.setVisible(true);
            } else {
                System.out.println("geçersiz kullanıcı veya şifre, tekrar dene");
                JOptionPane.showMessageDialog(null, "Kullanıcı adı veya şifre geçersiz... Lütfen tekrar deneyiniz...", "İnsan Kaynakları Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            }
            resulset.close();
            statement.close();
            return false;

        } catch (SQLException e) {
            System.out.println(e + "hata");
            return false;
        }
    }

    public static void yetkiliEkle(String yetkiliAdi, String yetkiliSoyadi, String kullaniciAdi, String sifre, int departmanNo, String unvani, String telefon) {
        baglantiAc();
        try {
            System.out.println("Yetkili kayıt ekleme için bağlantı veri tabanına bağlanıldı");

            String sql = "INSERT INTO ikotomasyonu.yetkili (yetkiliAdi,yetkiliSoyadi,kullaniciAdi,sifre,departmanNo,unvani,telefon)" + "VALUES (?,?,?,?,?,?,?)";
            prstatement = conn.prepareStatement(sql);
            prstatement.setString(1, yetkiliAdi);
            prstatement.setString(2, yetkiliSoyadi);
            prstatement.setString(3, kullaniciAdi);
            prstatement.setString(4, sifre);
            prstatement.setInt(5, departmanNo);
            prstatement.setString(6, unvani);
            prstatement.setString(7, telefon);

            int sonuc = prstatement.executeUpdate();
            if (sonuc == 0) {
                JOptionPane.showMessageDialog(null, "Yetkili Eklenemedi", "İnsan Kaynakları Otomasyonu", JOptionPane.PLAIN_MESSAGE);
                System.out.println("Yetkili eklenemedi");
            } else {
                JOptionPane.showMessageDialog(null, "Yetkili Eklendi", "İnsan Kaynakları Otomasyonu", JOptionPane.PLAIN_MESSAGE);
                System.out.println("Yetkili eklendi");
            }
            baglantiKapat();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static boolean KullaniciBilgileriGuncelle(int yetkiliID, String simdikiAdi, String yeniAdi) throws SQLException {
        baglantiAc();
        try {
            System.out.println("güncellemek için veritabanı açıldı");

            String sql = "UPDATE yetkili SET kullaniciAdi =?  WHERE yetkiliID =?";
            prstatement = conn.prepareStatement(sql);
            prstatement.setString(1, yeniAdi);
            prstatement.setInt(2, yetkiliID);

            int sonuc = prstatement.executeUpdate();
            if (sonuc == 0) {
                System.out.println("kullanıcı güncellenmedi");
                JOptionPane.showMessageDialog(null, "Yetkili kullanıcı bilgileri güncellenemedi", "İnsan kaynakları Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            } else {
                System.out.println("kullanıcı güncellendi");
                JOptionPane.showMessageDialog(null, "Yetkili kullanıcı bilgileri güncellendi", "İnsan kaynakları Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            }
            baglantiKapat();
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public static boolean YetkiliSifreGuncelle(int yetkiliID2, String simdikiSifre, String yeniSifre) throws SQLException {
        baglantiAc();
        try {
            System.out.println("güncellemek için veritabanı açıldı");

            String sql = "UPDATE yetkili SET sifre =?  WHERE yetkiliID =?";
            prstatement = conn.prepareStatement(sql);
            prstatement.setString(1, yeniSifre);
            prstatement.setInt(2, yetkiliID2);

            int sonuc = prstatement.executeUpdate();
            if (sonuc == 0) {
                System.out.println("kullanıcı güncellenmedi");
                JOptionPane.showMessageDialog(null, "Yetkili kullanıcı bilgileri güncellenemedi", "İnsan kaynakları Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            } else {
                System.out.println("kullanıcı güncellendi");
                JOptionPane.showMessageDialog(null, "Yetkili kullanıcı bilgileri güncellendi", "İnsan kaynakları Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            }
            baglantiKapat();
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    
    public static ArrayList<PersonelPojo> PersonelListele() throws SQLException {
        baglantiAc();
        try {
            Statement statement = conn.createStatement();
            resulset = statement.executeQuery("SELECT personelID,personelAdi,personelSoyadi,unvani,departmanNo,statu FROM personel");
            persPojo = new ArrayList<PersonelPojo>();

            while (resulset.next()) {
                persPojo.add(new PersonelPojo(
                        resulset.getInt("personelID"),
                        resulset.getString("personelAdi"),
                        resulset.getString("personelSoyadi"),
                        resulset.getString("unvani"),
                        resulset.getString("departmanNo"),
                        resulset.getString("statu")));
            }
            System.out.println("personeller listelendi");
            resulset.close();
            statement.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("personeller bulunamadı tekrar dene");
            JOptionPane.showMessageDialog(null, "personeller bulunamadı Lütfen tekrar deneyiniz...", "İnsan kaynakları Otomasyonu", JOptionPane.PLAIN_MESSAGE);

        }
        return persPojo;
    }
     
    public static boolean PersonelBul(int personelID, String personelAdi, String personelSoyadi) throws SQLException {
        baglantiAc();
        try {
            String sql = "SELECT * FROM personel where personelID=? and personelAdi=? and personelSoyadi=?";
            prstatement = conn.prepareStatement(sql);
            prstatement.setInt(1, personelID);
            prstatement.setString(2, personelAdi);
            prstatement.setString(3, personelSoyadi);

            ResultSet resulset = prstatement.executeQuery();
            System.out.println("sonuclar aranıyor");

            if (resulset.next()) {
                System.out.println("sonuclar bulundu");
                personel_cv open = new personel_cv();
                open.setVisible(true);

            } else {
                System.out.println("sonuclar yok");
                JOptionPane.showMessageDialog(null, "sonuç bulunamadı", "İnsan kaynakları Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public static ArrayList<PersonelPojo> PersonelGuncelle(int personelID, String personelAdi, String personelSoyadi, String unvani, int departmanNo, String email, String telefon, String adres, String ehliyet) throws SQLException {
        baglantiAc();
        try {
            String sql = "SELECT personelAdi,personelSoyadi,unvani,departmanNo,email,telefon,adres,ehliyet FROM personel where personelID=?";
            prstatement = conn.prepareStatement(sql);
            prstatement.setString(1, personelAdi);
            prstatement.setString(2, personelSoyadi);
            prstatement.setString(3, unvani);
            prstatement.setInt(4, departmanNo);
            prstatement.setString(5, email);
            prstatement.setString(6, telefon);
            prstatement.setString(7, adres);
            prstatement.setString(8, ehliyet);
            prstatement.setInt(9, personelID);

            ResultSet resultset = prstatement.executeQuery();
            System.out.println("sonuclar aranıyor");
            persPojo = new ArrayList<PersonelPojo>();

            if (resultset.next()) {
                System.out.println("sonuclar bulundu");

                persPojo = new ArrayList<>();
                persPojo.add(new PersonelPojo(
                        // resultset.getString("personelID"),
                        resultset.getString("personelAdi"),
                        resultset.getString("personelSoyadi"),
                        resultset.getString("unvani"),
                        resultset.getInt("departmanNo"),
                        resultset.getString("email"),
                        resultset.getString("telefon"),
                        resultset.getString("adres"),
                        resultset.getString("ehliyet")));

            }
            else {
                System.out.println("sonuclar yok");
                JOptionPane.showMessageDialog(null, "sonuç bulunamadı", "İnsan kaynakları Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
            return persPojo;
        }

    }
