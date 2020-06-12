package insan_kaynaklari_sistemi;

import insan_kaynaklari_sistemi.DBConnect;
import insan_kaynaklari_sistemi.POJO.PersonelPojo;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author parthenia
 */
public class HomePage extends javax.swing.JFrame {

    DefaultTableModel model;
    static Connection conn;
    
    

    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelHome = new javax.swing.JPanel();
        lblresim = new javax.swing.JLabel();
        lblbaslik = new javax.swing.JLabel();
        panelPersonel = new javax.swing.JPanel();
        tpPersonel = new javax.swing.JTabbedPane();
        pnlKayitlar = new javax.swing.JPanel();
        ScrollPane = new javax.swing.JScrollPane();
        tblKayitlar = new javax.swing.JTable();
        panelBul = new javax.swing.JPanel();
        lblresin = new javax.swing.JLabel();
        lblpersonelid = new javax.swing.JLabel();
        lblpersoneladi = new javax.swing.JLabel();
        lblpersonelsoyadi = new javax.swing.JLabel();
        txtPersonelID = new javax.swing.JTextField();
        txtPersonelAdi = new javax.swing.JTextField();
        txtPersonelSoyadi = new javax.swing.JTextField();
        btnBul = new javax.swing.JButton();
        panelBilgiDuzenle = new javax.swing.JPanel();
        lblPersonelID = new javax.swing.JLabel();
        txtPersonelID2 = new javax.swing.JTextField();
        btnGetir = new javax.swing.JButton();
        lblPersonelAd = new javax.swing.JLabel();
        lblPersonelAdi = new javax.swing.JLabel();
        lblPersonelSoyad = new javax.swing.JLabel();
        lblPersonelSoyadi = new javax.swing.JLabel();
        lblDepartman2 = new javax.swing.JLabel();
        lblUnvan = new javax.swing.JLabel();
        txtUnvan = new javax.swing.JTextField();
        lblTelefon = new javax.swing.JLabel();
        comboDepartman2 = new javax.swing.JComboBox<>();
        txtTelefon = new javax.swing.JTextField();
        lblAdres2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaAdres2 = new javax.swing.JTextArea();
        lblEhliyet2 = new javax.swing.JLabel();
        checkA = new javax.swing.JCheckBox();
        checkA1 = new javax.swing.JCheckBox();
        checkA2 = new javax.swing.JCheckBox();
        checkB = new javax.swing.JCheckBox();
        checkB1 = new javax.swing.JCheckBox();
        btnDegistir = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        panelYetkili = new javax.swing.JPanel();
        tpYetkili = new javax.swing.JTabbedPane();
        panelYBilgi = new javax.swing.JPanel();
        resim = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        panelYEkle = new javax.swing.JPanel();
        lblYetkiliAd = new javax.swing.JLabel();
        lblYetkiliSoyad = new javax.swing.JLabel();
        lblSifre = new javax.swing.JLabel();
        lblKullaniciAdi = new javax.swing.JLabel();
        txtYetkiliAdi = new javax.swing.JTextField();
        txtYetkiliSoyadi = new javax.swing.JTextField();
        txtKullaniciAdi = new javax.swing.JTextField();
        txtSifre = new javax.swing.JTextField();
        lblYetkiliUnvan = new javax.swing.JLabel();
        txtYetkiliUnvan = new javax.swing.JTextField();
        lblDepartman = new javax.swing.JLabel();
        lblYetkiliTel = new javax.swing.JLabel();
        comboDepartman = new javax.swing.JComboBox<>();
        txtYetkiliTel = new javax.swing.JTextField();
        btnYetkiliEkle = new javax.swing.JButton();
        panelYIslem = new javax.swing.JPanel();
        tpYIslem = new javax.swing.JTabbedPane();
        panelGuncelle = new javax.swing.JPanel();
        lblYetikiID = new javax.swing.JLabel();
        lblSimdikiAdi = new javax.swing.JLabel();
        txtSimdikiAdi = new javax.swing.JTextField();
        txtYetkiliID = new javax.swing.JTextField();
        lblYeniAdi = new javax.swing.JLabel();
        txtYeniAdi = new javax.swing.JTextField();
        btnBilgiGuncelle = new javax.swing.JButton();
        panelSifreDegistir = new javax.swing.JPanel();
        lblYetkiliID2 = new javax.swing.JLabel();
        lblSimdikiSifre = new javax.swing.JLabel();
        lblYeniSifre = new javax.swing.JLabel();
        txtYetkiliID2 = new javax.swing.JTextField();
        txtSimdikiSifre = new javax.swing.JTextField();
        txtYeniSifre = new javax.swing.JTextField();
        btnSifreDegistir = new javax.swing.JButton();
        panelBasvurular = new javax.swing.JPanel();
        tpBasvurular = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        panelYardim = new javax.swing.JPanel();
        tpYardim = new javax.swing.JTabbedPane();
        panelHK = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(824, 600));

        lblresim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/user2.png"))); // NOI18N

        lblbaslik.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblbaslik.setText("İnsan Kaynakları Yönetim Sistemi'ne Hoş Geldiniz...");

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblbaslik)
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblresim)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(lblbaslik)
                .addGap(18, 18, 18)
                .addComponent(lblresim)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Anasayfa", panelHome);

        tpPersonel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpPersonelMouseClicked(evt);
            }
        });

        tblKayitlar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Personel ID", "Adı", "Soyadı", "Unvanı", "Departman Adı", "Statü"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPane.setViewportView(tblKayitlar);

        javax.swing.GroupLayout pnlKayitlarLayout = new javax.swing.GroupLayout(pnlKayitlar);
        pnlKayitlar.setLayout(pnlKayitlarLayout);
        pnlKayitlarLayout.setHorizontalGroup(
            pnlKayitlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        pnlKayitlarLayout.setVerticalGroup(
            pnlKayitlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKayitlarLayout.createSequentialGroup()
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        tpPersonel.addTab("Personel Kayıtları", pnlKayitlar);

        lblresin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/folder.png"))); // NOI18N

        lblpersonelid.setText("Personel ID:");

        lblpersoneladi.setText("Personel Adı:");

        lblpersonelsoyadi.setText("Personel Soyadı:");

        btnBul.setText("Bul");
        btnBul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBulLayout = new javax.swing.GroupLayout(panelBul);
        panelBul.setLayout(panelBulLayout);
        panelBulLayout.setHorizontalGroup(
            panelBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBulLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(panelBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBulLayout.createSequentialGroup()
                        .addGroup(panelBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpersonelid)
                            .addComponent(lblpersoneladi)
                            .addComponent(lblpersonelsoyadi))
                        .addGap(26, 26, 26)
                        .addGroup(panelBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPersonelID)
                            .addComponent(txtPersonelSoyadi)
                            .addComponent(txtPersonelAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(btnBul))
                    .addGroup(panelBulLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblresin)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        panelBulLayout.setVerticalGroup(
            panelBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBulLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(panelBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpersonelid)
                    .addComponent(txtPersonelID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpersoneladi)
                    .addComponent(txtPersonelAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBul))
                .addGap(15, 15, 15)
                .addGroup(panelBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpersonelsoyadi)
                    .addComponent(txtPersonelSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblresin)
                .addGap(32, 32, 32))
        );

        tpPersonel.addTab("Personel Bul", panelBul);

        lblPersonelID.setText("Personel ID:");

        btnGetir.setText("Getir");
        btnGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetirActionPerformed(evt);
            }
        });

        lblPersonelAd.setText("Personel Adı:");

        lblPersonelAdi.setText("jLabel8");

        lblPersonelSoyad.setText("Personel Soyadı:");

        lblPersonelSoyadi.setText("jLabel10");

        lblDepartman2.setText("Departman:");

        lblUnvan.setText("Unvanı:");

        lblTelefon.setText("Telefon:");

        comboDepartman2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz...", "Bilgi İşlem", "Güvenlik", "Sistem", "Yazılım", "İdari", "Muhasebe" }));

        lblAdres2.setText("Adres:");

        areaAdres2.setColumns(20);
        areaAdres2.setRows(5);
        jScrollPane1.setViewportView(areaAdres2);

        lblEhliyet2.setText("Ehliiyet:");

        checkA.setText("A");

        checkA1.setText("A1");

        checkA2.setText("A2");
        checkA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkA2ActionPerformed(evt);
            }
        });

        checkB.setText("B");

        checkB1.setText("B1");

        btnDegistir.setText("Değişiklikleri Kaydet");

        lblEmail.setText("E-mail:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel2.setText("Önemli Not: İlk önce Personel ID'sini  giriniz...");

        javax.swing.GroupLayout panelBilgiDuzenleLayout = new javax.swing.GroupLayout(panelBilgiDuzenle);
        panelBilgiDuzenle.setLayout(panelBilgiDuzenleLayout);
        panelBilgiDuzenleLayout.setHorizontalGroup(
            panelBilgiDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBilgiDuzenleLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(panelBilgiDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBilgiDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBilgiDuzenleLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDegistir))
                        .addGroup(panelBilgiDuzenleLayout.createSequentialGroup()
                            .addGroup(panelBilgiDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAdres2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelBilgiDuzenleLayout.createSequentialGroup()
                                    .addGroup(panelBilgiDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPersonelAd)
                                        .addComponent(lblUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEhliyet2))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelBilgiDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelBilgiDuzenleLayout.createSequentialGroup()
                                            .addGroup(panelBilgiDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblPersonelAdi)
                                                .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(120, 120, 120)
                                            .addGroup(panelBilgiDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblDepartman2)
                                                .addComponent(lblPersonelSoyad)
                                                .addComponent(lblEmail))
                                            .addGap(27, 27, 27)
                                            .addGroup(panelBilgiDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblPersonelSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(comboDepartman2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panelBilgiDuzenleLayout.createSequentialGroup()
                                            .addComponent(checkA)
                                            .addGap(18, 18, 18)
                                            .addComponent(checkA1)
                                            .addGap(18, 18, 18)
                                            .addComponent(checkA2)
                                            .addGap(18, 18, 18)
                                            .addComponent(checkB)
                                            .addGap(18, 18, 18)
                                            .addComponent(checkB1))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2)
                    .addGroup(panelBilgiDuzenleLayout.createSequentialGroup()
                        .addComponent(lblPersonelID)
                        .addGap(23, 23, 23)
                        .addComponent(txtPersonelID2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnGetir)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panelBilgiDuzenleLayout.setVerticalGroup(
            panelBilgiDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBilgiDuzenleLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelBilgiDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonelID)
                    .addComponent(txtPersonelID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetir))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addGroup(panelBilgiDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonelAd)
                    .addComponent(lblPersonelAdi)
                    .addComponent(lblPersonelSoyad)
                    .addComponent(lblPersonelSoyadi))
                .addGap(18, 18, 18)
                .addGroup(panelBilgiDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartman2)
                    .addComponent(lblUnvan)
                    .addComponent(txtUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDepartman2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBilgiDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefon)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBilgiDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdres2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelBilgiDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEhliyet2)
                    .addComponent(checkA)
                    .addComponent(checkA1)
                    .addComponent(checkA2)
                    .addComponent(checkB)
                    .addComponent(checkB1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnDegistir)
                .addGap(56, 56, 56))
        );

        tpPersonel.addTab("Personel Bilgileri Güncelleme", panelBilgiDuzenle);

        javax.swing.GroupLayout panelPersonelLayout = new javax.swing.GroupLayout(panelPersonel);
        panelPersonel.setLayout(panelPersonelLayout);
        panelPersonelLayout.setHorizontalGroup(
            panelPersonelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpPersonel)
        );
        panelPersonelLayout.setVerticalGroup(
            panelPersonelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpPersonel)
        );

        jTabbedPane1.addTab("Personel İşlemleri", panelPersonel);

        resim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/user.png"))); // NOI18N

        jLabel26.setText("Yetkili ID:");

        jLabel27.setText("Yetkili Adı:");

        jLabel28.setText("Yetkili Soyadı:");

        jLabel29.setText("Kullanıcı Adı:");

        jLabel30.setText("Şifre:");

        jLabel31.setText("Unvanı:");

        jLabel32.setText("Departman No:");

        jLabel33.setText("Telefon:");

        jLabel34.setText("jLabel34");

        jLabel35.setText("jLabel35");

        jLabel36.setText("jLabel36");

        jLabel37.setText("jLabel37");

        jLabel38.setText("jLabel38");

        jLabel39.setText("jLabel39");

        jLabel40.setText("jLabel40");

        jLabel41.setText("jLabel41");

        javax.swing.GroupLayout panelYBilgiLayout = new javax.swing.GroupLayout(panelYBilgi);
        panelYBilgi.setLayout(panelYBilgiLayout);
        panelYBilgiLayout.setHorizontalGroup(
            panelYBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYBilgiLayout.createSequentialGroup()
                .addGroup(panelYBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelYBilgiLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(panelYBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(panelYBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelYBilgiLayout.createSequentialGroup()
                                .addGroup(panelYBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(184, 184, 184)
                                .addGroup(panelYBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32))
                                .addGap(18, 18, 18)
                                .addGroup(panelYBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelYBilgiLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(resim)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        panelYBilgiLayout.setVerticalGroup(
            panelYBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYBilgiLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(resim)
                .addGap(39, 39, 39)
                .addGroup(panelYBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addGroup(panelYBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29)
                    .addComponent(jLabel34)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addGroup(panelYBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel30)
                    .addComponent(jLabel35)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addGroup(panelYBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel36)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addGroup(panelYBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel37))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        tpYetkili.addTab("Yetkili Bilgileri", panelYBilgi);

        lblYetkiliAd.setText("Yetkili Adı:");

        lblYetkiliSoyad.setText("Yetkili Soyadı:");

        lblSifre.setText("Şifre:");

        lblKullaniciAdi.setText("Kullanıcı Adı:");

        lblYetkiliUnvan.setText("Unvanı:");

        lblDepartman.setText("Departmanı:");

        lblYetkiliTel.setText("Telefon:");

        comboDepartman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz...", "Bilgi İşlem", "Güvenlik", "Sistem", "Yazılım", "İdari", "Muhasebe" }));

        btnYetkiliEkle.setText("Yetkili Ekle");
        btnYetkiliEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYetkiliEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelYEkleLayout = new javax.swing.GroupLayout(panelYEkle);
        panelYEkle.setLayout(panelYEkleLayout);
        panelYEkleLayout.setHorizontalGroup(
            panelYEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYEkleLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(panelYEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblYetkiliAd)
                    .addComponent(lblYetkiliSoyad)
                    .addComponent(lblYetkiliTel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYetkiliUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelYEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtYetkiliUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelYEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtYetkiliAdi)
                        .addComponent(txtYetkiliSoyadi)
                        .addComponent(txtYetkiliTel, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(btnYetkiliEkle)))
                .addGap(76, 76, 76)
                .addGroup(panelYEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKullaniciAdi)
                    .addComponent(lblSifre)
                    .addComponent(lblDepartman))
                .addGap(31, 31, 31)
                .addGroup(panelYEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtKullaniciAdi)
                    .addComponent(txtSifre)
                    .addComponent(comboDepartman, 0, 140, Short.MAX_VALUE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        panelYEkleLayout.setVerticalGroup(
            panelYEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYEkleLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(panelYEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelYEkleLayout.createSequentialGroup()
                        .addGroup(panelYEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblKullaniciAdi)
                            .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelYEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSifre)
                            .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelYEkleLayout.createSequentialGroup()
                        .addGroup(panelYEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYetkiliAd)
                            .addComponent(txtYetkiliAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelYEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYetkiliSoyad)
                            .addComponent(txtYetkiliSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panelYEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartman)
                    .addComponent(comboDepartman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYetkiliUnvan)
                    .addComponent(txtYetkiliUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelYEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYetkiliTel)
                    .addComponent(txtYetkiliTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnYetkiliEkle)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        tpYetkili.addTab("Yetkili Ekle", panelYEkle);

        tpYIslem.setPreferredSize(new java.awt.Dimension(814, 550));

        lblYetikiID.setText("Yetkili ID:");

        lblSimdikiAdi.setText("Şimdiki Kullanıcı Adı:");

        lblYeniAdi.setText("Yeni Kullanıcı Adı:");

        btnBilgiGuncelle.setText("Güncelle");
        btnBilgiGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBilgiGuncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGuncelleLayout = new javax.swing.GroupLayout(panelGuncelle);
        panelGuncelle.setLayout(panelGuncelleLayout);
        panelGuncelleLayout.setHorizontalGroup(
            panelGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuncelleLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(panelGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSimdikiAdi)
                    .addComponent(lblYetikiID)
                    .addComponent(lblYeniAdi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtYetkiliID)
                    .addComponent(txtSimdikiAdi)
                    .addComponent(txtYeniAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(btnBilgiGuncelle)
                .addContainerGap(287, Short.MAX_VALUE))
        );
        panelGuncelleLayout.setVerticalGroup(
            panelGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuncelleLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panelGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYetikiID)
                    .addComponent(txtYetkiliID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSimdikiAdi)
                    .addComponent(txtSimdikiAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBilgiGuncelle))
                .addGap(18, 18, 18)
                .addGroup(panelGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblYeniAdi)
                    .addComponent(txtYeniAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(323, Short.MAX_VALUE))
        );

        tpYIslem.addTab("Kullanıcı Bilgileri Güncelleme", panelGuncelle);

        lblYetkiliID2.setText("Yetkili ID:");

        lblSimdikiSifre.setText("Şimdiki Şifre:");

        lblYeniSifre.setText("Yeni Şifre:");

        btnSifreDegistir.setText("Değiştir");
        btnSifreDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSifreDegistirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSifreDegistirLayout = new javax.swing.GroupLayout(panelSifreDegistir);
        panelSifreDegistir.setLayout(panelSifreDegistirLayout);
        panelSifreDegistirLayout.setHorizontalGroup(
            panelSifreDegistirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSifreDegistirLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(panelSifreDegistirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblYetkiliID2)
                    .addComponent(lblSimdikiSifre)
                    .addComponent(lblYeniSifre))
                .addGap(19, 19, 19)
                .addGroup(panelSifreDegistirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtYetkiliID2)
                    .addComponent(txtSimdikiSifre)
                    .addComponent(txtYeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnSifreDegistir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
        );
        panelSifreDegistirLayout.setVerticalGroup(
            panelSifreDegistirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSifreDegistirLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(panelSifreDegistirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYetkiliID2)
                    .addComponent(txtYetkiliID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSifreDegistirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSimdikiSifre)
                    .addComponent(txtSimdikiSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSifreDegistir))
                .addGap(18, 18, 18)
                .addGroup(panelSifreDegistirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYeniSifre)
                    .addComponent(txtYeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(220, Short.MAX_VALUE))
        );

        tpYIslem.addTab("Şifre Değiştirme", panelSifreDegistir);

        javax.swing.GroupLayout panelYIslemLayout = new javax.swing.GroupLayout(panelYIslem);
        panelYIslem.setLayout(panelYIslemLayout);
        panelYIslemLayout.setHorizontalGroup(
            panelYIslemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpYIslem, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        panelYIslemLayout.setVerticalGroup(
            panelYIslemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpYIslem, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        tpYetkili.addTab("Yetkili İşlemleri", panelYIslem);

        javax.swing.GroupLayout panelYetkiliLayout = new javax.swing.GroupLayout(panelYetkili);
        panelYetkili.setLayout(panelYetkiliLayout);
        panelYetkiliLayout.setHorizontalGroup(
            panelYetkiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpYetkili)
        );
        panelYetkiliLayout.setVerticalGroup(
            panelYetkiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpYetkili, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.addTab("Yetkili ", panelYetkili);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        tpBasvurular.addTab("Özgeçmiş Havuzu", jPanel15);

        javax.swing.GroupLayout panelBasvurularLayout = new javax.swing.GroupLayout(panelBasvurular);
        panelBasvurular.setLayout(panelBasvurularLayout);
        panelBasvurularLayout.setHorizontalGroup(
            panelBasvurularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpBasvurular)
        );
        panelBasvurularLayout.setVerticalGroup(
            panelBasvurularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpBasvurular)
        );

        jTabbedPane1.addTab("Başvurular", panelBasvurular);

        jLabel1.setText("Bu program basit bir insan kaynakları otomasyonudur...");

        javax.swing.GroupLayout panelHKLayout = new javax.swing.GroupLayout(panelHK);
        panelHK.setLayout(panelHKLayout);
        panelHKLayout.setHorizontalGroup(
            panelHKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHKLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addContainerGap(368, Short.MAX_VALUE))
        );
        panelHKLayout.setVerticalGroup(
            panelHKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHKLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addContainerGap(408, Short.MAX_VALUE))
        );

        tpYardim.addTab("Program Hakkında", panelHK);

        javax.swing.GroupLayout panelYardimLayout = new javax.swing.GroupLayout(panelYardim);
        panelYardim.setLayout(panelYardimLayout);
        panelYardimLayout.setHorizontalGroup(
            panelYardimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpYardim)
        );
        panelYardimLayout.setVerticalGroup(
            panelYardimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpYardim)
        );

        jTabbedPane1.addTab("Yardım", panelYardim);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetirActionPerformed
        try{
            int personelID = Integer.parseInt(txtPersonelID2.getText());
            String personelAdi = lblPersonelAdi.getText();
            String personelSoyadi = lblPersonelSoyadi.getText();
            String unvani = txtUnvan.getText();
            int departmanNo = Integer.parseInt(comboDepartman2.getItemAt());
            String email = txtEmail.getText() ;
            String telefon = txtTelefon.getText();
            String adres = areaAdres2.getText();
            String ehliyet = checkA.getText();
            String ehliyet1 = checkA1.getText();
            String ehliyet2 = checkB.getText();
            String ehliyet3 = checkB1.getText();
            
           
            ArrayList<PersonelPojo> getir = DBConnect.PersonelGuncelle( personelID,  personelAdi,  personelSoyadi,  unvani,  departmanNo,  email,  telefon,  adres,  ehliyet) ;           
            for(PersonelPojo goster : getir) {
                Object[] doldur = {

                    goster.getPersonelAdi(), 
                    goster.getPersonelSoyadi(), 
                    goster.getUnvani(), 
                    goster.getDepartmanNo(),
                    goster.getEmail(),
                    goster.getTelefon(),
                    goster.getAdres(),
                    goster.getEhliyet() 
                };
                lblPersonelAdi.add(doldur); }
            
            
            
            
          //  lblPersonelAdi.setText(PersonelPojo.getText(getPersonelAdi()));
            lblPersonelSoyadi.setText("PersonelPojo.setPersonelSoyadi");
         //   txtUnvan.setText(unvani);
            
            
        }catch(Exception e){
            System.out.println(e);
        }
            
    
    }//GEN-LAST:event_btnGetirActionPerformed

    private void checkA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkA2ActionPerformed

    private void btnYetkiliEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYetkiliEkleActionPerformed
        try {
            String yetkiliAd = txtYetkiliAdi.getText();
            String yetkiliSoyadi = txtYetkiliSoyadi.getText();
            String kullaniciAdi = txtKullaniciAdi.getText();
            String sifre = txtSifre.getText();
            int departmanNo =  comboDepartman.getSelectedIndex();
            String unvani = txtYetkiliUnvan.getText();
            String telefon = txtYetkiliTel.getText();

            DBConnect.yetkiliEkle(yetkiliAd, yetkiliSoyadi, kullaniciAdi, sifre, departmanNo, unvani, telefon);
            System.out.println("kayıt oluşturuldu! sisteme giriş yapabilirsiniz...");

        } catch (Exception e) {
            System.out.println(e + "kayıt oluşturulmadı");
            JOptionPane.showConfirmDialog(null, "kayıt oluşturulmadı", "İnsan Kaynakları Otomasyonu", JOptionPane.PLAIN_MESSAGE);
        }

        txtYetkiliAdi.setText("");
        txtYetkiliSoyadi.setText("");
        txtKullaniciAdi.setText("");
        txtSifre.setText("");
      //  comboDepartman.setSelectedIndex();
        txtYetkiliUnvan.setText("");
        txtYetkiliTel.setText("");

    }//GEN-LAST:event_btnYetkiliEkleActionPerformed

    private void btnBilgiGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBilgiGuncelleActionPerformed
        try {
            int yetkiliID = Integer.parseInt(txtYetkiliID.getText());
            String simdikiAdi = txtSimdikiAdi.getText();
            String yeniAdi = txtYeniAdi.getText();

            DBConnect.KullaniciBilgileriGuncelle(yetkiliID, simdikiAdi, yeniAdi);
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
        txtYetkiliID.setText("");
        txtSimdikiAdi.setText("");
        txtYeniAdi.setText("");

    }//GEN-LAST:event_btnBilgiGuncelleActionPerformed

    private void btnSifreDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSifreDegistirActionPerformed
        try {
            int yetkiliID2 = Integer.parseInt(txtYetkiliID2.getText());
            String simdikiSifre = txtSimdikiSifre.getText();
            String yeniSifre = txtYeniSifre.getText();

            DBConnect.YetkiliSifreGuncelle(yetkiliID2, simdikiSifre, yeniSifre);
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
        txtYetkiliID2.setText("");
        txtSimdikiSifre.setText("");
        txtYeniSifre.setText("");

    }//GEN-LAST:event_btnSifreDegistirActionPerformed
   
    private void tpPersonelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpPersonelMouseClicked
     
    }//GEN-LAST:event_tpPersonelMouseClicked

    private void btnBulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBulActionPerformed
        try {
            int personeID = Integer.parseInt(txtPersonelID.getText());
            String personelAdi = txtPersonelAdi.getText();
            String personelSoyadi = txtPersonelSoyadi.getText();

            DBConnect.PersonelBul(personeID, personelAdi, personelSoyadi);
        } catch (SQLException e) {
            System.out.println(e);
        }
        txtPersonelID.setText("");
        txtPersonelAdi.setText("");
        txtPersonelSoyadi.setText("");


    }//GEN-LAST:event_btnBulActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JTextArea areaAdres2;
    private javax.swing.JButton btnBilgiGuncelle;
    private javax.swing.JButton btnBul;
    private javax.swing.JButton btnDegistir;
    private javax.swing.JButton btnGetir;
    private javax.swing.JButton btnSifreDegistir;
    private javax.swing.JButton btnYetkiliEkle;
    private javax.swing.JCheckBox checkA;
    private javax.swing.JCheckBox checkA1;
    private javax.swing.JCheckBox checkA2;
    private javax.swing.JCheckBox checkB;
    private javax.swing.JCheckBox checkB1;
    private javax.swing.JComboBox<String> comboDepartman;
    private javax.swing.JComboBox<String> comboDepartman2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAdres2;
    private javax.swing.JLabel lblDepartman;
    private javax.swing.JLabel lblDepartman2;
    private javax.swing.JLabel lblEhliyet2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblKullaniciAdi;
    private javax.swing.JLabel lblPersonelAd;
    private javax.swing.JLabel lblPersonelAdi;
    private javax.swing.JLabel lblPersonelID;
    private javax.swing.JLabel lblPersonelSoyad;
    private javax.swing.JLabel lblPersonelSoyadi;
    private javax.swing.JLabel lblSifre;
    private javax.swing.JLabel lblSimdikiAdi;
    private javax.swing.JLabel lblSimdikiSifre;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblUnvan;
    private javax.swing.JLabel lblYeniAdi;
    private javax.swing.JLabel lblYeniSifre;
    private javax.swing.JLabel lblYetikiID;
    private javax.swing.JLabel lblYetkiliAd;
    private javax.swing.JLabel lblYetkiliID2;
    private javax.swing.JLabel lblYetkiliSoyad;
    private javax.swing.JLabel lblYetkiliTel;
    private javax.swing.JLabel lblYetkiliUnvan;
    private javax.swing.JLabel lblbaslik;
    private javax.swing.JLabel lblpersoneladi;
    private javax.swing.JLabel lblpersonelid;
    private javax.swing.JLabel lblpersonelsoyadi;
    private javax.swing.JLabel lblresim;
    private javax.swing.JLabel lblresin;
    private javax.swing.JPanel panelBasvurular;
    private javax.swing.JPanel panelBilgiDuzenle;
    private javax.swing.JPanel panelBul;
    private javax.swing.JPanel panelGuncelle;
    private javax.swing.JPanel panelHK;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelPersonel;
    private javax.swing.JPanel panelSifreDegistir;
    private javax.swing.JPanel panelYBilgi;
    private javax.swing.JPanel panelYEkle;
    private javax.swing.JPanel panelYIslem;
    private javax.swing.JPanel panelYardim;
    private javax.swing.JPanel panelYetkili;
    private javax.swing.JPanel pnlKayitlar;
    private javax.swing.JLabel resim;
    private javax.swing.JTable tblKayitlar;
    private javax.swing.JTabbedPane tpBasvurular;
    private javax.swing.JTabbedPane tpPersonel;
    private javax.swing.JTabbedPane tpYIslem;
    private javax.swing.JTabbedPane tpYardim;
    private javax.swing.JTabbedPane tpYetkili;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JTextField txtPersonelAdi;
    private javax.swing.JTextField txtPersonelID;
    private javax.swing.JTextField txtPersonelID2;
    private javax.swing.JTextField txtPersonelSoyadi;
    private javax.swing.JTextField txtSifre;
    private javax.swing.JTextField txtSimdikiAdi;
    private javax.swing.JTextField txtSimdikiSifre;
    private javax.swing.JTextField txtTelefon;
    private javax.swing.JTextField txtUnvan;
    private javax.swing.JTextField txtYeniAdi;
    private javax.swing.JTextField txtYeniSifre;
    private javax.swing.JTextField txtYetkiliAdi;
    private javax.swing.JTextField txtYetkiliID;
    private javax.swing.JTextField txtYetkiliID2;
    private javax.swing.JTextField txtYetkiliSoyadi;
    private javax.swing.JTextField txtYetkiliTel;
    private javax.swing.JTextField txtYetkiliUnvan;
    // End of variables declaration//GEN-END:variables
}
