
package insan_kaynaklari_sistemi;

/**
 *
 * @author parthenia
 */
public class personel_cv extends javax.swing.JFrame {

    
    public personel_cv() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        tpPersonelCV = new javax.swing.JTabbedPane();
        pnlGenel = new javax.swing.JPanel();
        lbl_getPersonelID = new javax.swing.JLabel();
        lblSoyadi = new javax.swing.JLabel();
        lblTckimlik = new javax.swing.JLabel();
        lblDepartmanadi = new javax.swing.JLabel();
        lbl_getDepartmanadi = new javax.swing.JLabel();
        lblCinsiyet = new javax.swing.JLabel();
        lblDepartmanno = new javax.swing.JLabel();
        Lbl_getCinsiyet = new javax.swing.JLabel();
        lbl_getDepartmanNo = new javax.swing.JLabel();
        lbl_getAdi = new javax.swing.JLabel();
        lblResim = new javax.swing.JLabel();
        lbl_getTC = new javax.swing.JLabel();
        lblAdi = new javax.swing.JLabel();
        lblPersonelID = new javax.swing.JLabel();
        lbl_getSoyadi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblIseGiris = new javax.swing.JLabel();
        lblIstenCikis = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblAdres = new javax.swing.JLabel();
        lblSehir = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaAdres = new javax.swing.JTextArea();
        lblIlce = new javax.swing.JLabel();
        lbl_getDogum = new javax.swing.JLabel();
        lbl_getUnvan = new javax.swing.JLabel();
        lbl_getTelefon = new javax.swing.JLabel();
        txtIstenCikis = new javax.swing.JTextField();
        txtIseGiris = new javax.swing.JTextField();
        lbl_getSehir = new javax.swing.JLabel();
        lbl_getIlce = new javax.swing.JLabel();
        lblStatu = new javax.swing.JLabel();
        txtStatu = new javax.swing.JTextField();
        lblMail = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        lblGeri = new javax.swing.JLabel();
        pnlEgitim = new javax.swing.JPanel();
        lblOgrenimDurumu = new javax.swing.JLabel();
        lblMezunUni = new javax.swing.JLabel();
        lblDiploma = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaMezunUni = new javax.swing.JTextArea();
        txtOgrenimDurumu = new javax.swing.JTextField();
        lblDiplomaPuani = new javax.swing.JLabel();
        lblOkuduguUni = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        areaOkuduguUni = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        areaSeminerler = new javax.swing.JTextArea();
        lblSeminerler = new javax.swing.JLabel();
        pnlDiger = new javax.swing.JPanel();
        lblIsDeneyim = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaIsDeneyim = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        areaSertifika = new javax.swing.JTextArea();
        lblSertifika = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        areaReferans = new javax.swing.JTextArea();
        lblReferans = new javax.swing.JLabel();
        lblAciklama = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        areaAciklama = new javax.swing.JTextArea();
        txtEhliyet = new javax.swing.JTextField();
        lblEhliyet = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tpPersonelCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpPersonelCVMouseClicked(evt);
            }
        });

        lbl_getPersonelID.setText("jLabel13");

        lblSoyadi.setText("Soyadı:");

        lblTckimlik.setText("TC Kimlik No:");

        lblDepartmanadi.setText("Departman Adı:");

        lbl_getDepartmanadi.setText("jLabel16");

        lblCinsiyet.setText("Cinsiyeti:");

        lblDepartmanno.setText("Departman No:");

        Lbl_getCinsiyet.setText("jLabel18");

        lbl_getDepartmanNo.setText("jLabel8");

        lbl_getAdi.setText("jLabel9");

        lblResim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/user.png"))); // NOI18N

        lbl_getTC.setText("jLabel10");

        lblAdi.setText("Adı:");

        lblPersonelID.setText("Personel ID: ");

        lbl_getSoyadi.setText("jLabel12");

        jLabel2.setText("Doğum Tarihi:");

        lblTelefon.setText("Telefon:");

        lblIseGiris.setText("İşe Giriş Tarihi:");

        lblIstenCikis.setText("İşten Çıkış Tarihi:");

        jLabel10.setText("Unvanı:");

        lblAdres.setText("Adres:");

        lblSehir.setText("Şehir:");

        areaAdres.setColumns(20);
        areaAdres.setRows(5);
        jScrollPane1.setViewportView(areaAdres);

        lblIlce.setText("İlçe:");

        lbl_getDogum.setText("jLabel14");

        lbl_getUnvan.setText("jLabel15");

        lbl_getTelefon.setText("jLabel16");

        lbl_getSehir.setText("jLabel17");

        lbl_getIlce.setText("jLabel18");

        lblStatu.setText("Statü:");

        lblMail.setText("E-mail:");

        lblGeri.setText("Geri dön");
        lblGeri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGeriMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlGenelLayout = new javax.swing.GroupLayout(pnlGenel);
        pnlGenel.setLayout(pnlGenelLayout);
        pnlGenelLayout.setHorizontalGroup(
            pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGenelLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(lblResim)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlGenelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGenelLayout.createSequentialGroup()
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefon)
                            .addGroup(pnlGenelLayout.createSequentialGroup()
                                .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTckimlik)
                                    .addComponent(lblCinsiyet))
                                .addGap(18, 18, 18)
                                .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_getTC, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_getCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlGenelLayout.createSequentialGroup()
                                .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSoyadi)
                                    .addComponent(lblAdi))
                                .addGap(54, 54, 54)
                                .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_getAdi)
                                    .addComponent(lbl_getSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIseGiris)
                            .addComponent(lblDepartmanadi)
                            .addComponent(lblDepartmanno)
                            .addComponent(lblPersonelID)
                            .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblIstenCikis, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblStatu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(pnlGenelLayout.createSequentialGroup()
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlGenelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_getUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_getDogum, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_getTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGenelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))))
                .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMail)
                    .addComponent(txtStatu)
                    .addComponent(txtIstenCikis)
                    .addComponent(txtIseGiris)
                    .addGroup(pnlGenelLayout.createSequentialGroup()
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlGenelLayout.createSequentialGroup()
                                .addComponent(lblSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_getSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlGenelLayout.createSequentialGroup()
                                .addComponent(lblIlce, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_getIlce, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_getPersonelID, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_getDepartmanNo)
                            .addComponent(lbl_getDepartmanadi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGenelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGeri)
                .addGap(25, 25, 25))
        );
        pnlGenelLayout.setVerticalGroup(
            pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGenelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblGeri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResim)
                .addGap(51, 51, 51)
                .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGenelLayout.createSequentialGroup()
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdi)
                            .addComponent(lbl_getAdi))
                        .addGap(18, 18, 18)
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoyadi)
                            .addComponent(lbl_getSoyadi))
                        .addGap(18, 18, 18)
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTckimlik)
                            .addComponent(lbl_getTC))
                        .addGap(18, 18, 18)
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCinsiyet)
                            .addComponent(Lbl_getCinsiyet))
                        .addGap(18, 18, 18)
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbl_getDogum))
                        .addGap(18, 18, 18)
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lbl_getUnvan))
                        .addGap(18, 18, 18)
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefon)
                            .addComponent(lbl_getTelefon)))
                    .addGroup(pnlGenelLayout.createSequentialGroup()
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPersonelID)
                            .addComponent(lbl_getPersonelID))
                        .addGap(18, 18, 18)
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_getDepartmanNo)
                            .addComponent(lblDepartmanno))
                        .addGap(18, 18, 18)
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDepartmanadi)
                            .addComponent(lbl_getDepartmanadi))
                        .addGap(18, 18, 18)
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIseGiris)
                            .addComponent(txtIseGiris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIstenCikis)
                            .addComponent(txtIstenCikis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStatu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMail))))
                .addGap(30, 30, 30)
                .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdres)
                    .addGroup(pnlGenelLayout.createSequentialGroup()
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSehir)
                            .addComponent(lbl_getSehir))
                        .addGap(18, 18, 18)
                        .addGroup(pnlGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIlce)
                            .addComponent(lbl_getIlce))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tpPersonelCV.addTab("Genel Bilgileri", pnlGenel);

        lblOgrenimDurumu.setText("Öğrenim Durumu:");

        lblMezunUni.setText("En Son Mezun Olduğu Üniversite:");

        lblDiploma.setText("Diploma Puanı:");

        areaMezunUni.setColumns(20);
        areaMezunUni.setRows(5);
        jScrollPane2.setViewportView(areaMezunUni);

        lblDiplomaPuani.setText("jLabel7");

        lblOkuduguUni.setText("Okuduğu Üniversite / Yüksekokul:");

        areaOkuduguUni.setColumns(20);
        areaOkuduguUni.setRows(5);
        jScrollPane7.setViewportView(areaOkuduguUni);

        areaSeminerler.setColumns(20);
        areaSeminerler.setRows(5);
        jScrollPane8.setViewportView(areaSeminerler);

        lblSeminerler.setText("Katıldığı Seminer / Eğitimler:");

        javax.swing.GroupLayout pnlEgitimLayout = new javax.swing.GroupLayout(pnlEgitim);
        pnlEgitim.setLayout(pnlEgitimLayout);
        pnlEgitimLayout.setHorizontalGroup(
            pnlEgitimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEgitimLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlEgitimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOgrenimDurumu)
                    .addGroup(pnlEgitimLayout.createSequentialGroup()
                        .addGroup(pnlEgitimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDiploma)
                            .addComponent(lblMezunUni))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEgitimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDiplomaPuani)
                            .addComponent(txtOgrenimDurumu, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlEgitimLayout.createSequentialGroup()
                        .addGroup(pnlEgitimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOkuduguUni)
                            .addComponent(lblSeminerler))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEgitimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8)
                            .addComponent(jScrollPane7))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlEgitimLayout.setVerticalGroup(
            pnlEgitimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEgitimLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnlEgitimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOgrenimDurumu)
                    .addComponent(txtOgrenimDurumu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEgitimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMezunUni)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEgitimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiplomaPuani)
                    .addComponent(lblDiploma))
                .addGap(18, 18, 18)
                .addGroup(pnlEgitimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOkuduguUni)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEgitimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeminerler))
                .addContainerGap(332, Short.MAX_VALUE))
        );

        tpPersonelCV.addTab("Eğitim Bilgileri", pnlEgitim);

        lblIsDeneyim.setText("İş Deneyimi:");

        areaIsDeneyim.setColumns(20);
        areaIsDeneyim.setRows(5);
        jScrollPane3.setViewportView(areaIsDeneyim);

        areaSertifika.setColumns(20);
        areaSertifika.setRows(5);
        jScrollPane4.setViewportView(areaSertifika);

        lblSertifika.setText("Sertifika / Belgeler:");

        areaReferans.setColumns(20);
        areaReferans.setRows(5);
        jScrollPane5.setViewportView(areaReferans);

        lblReferans.setText("Referanslar:");

        lblAciklama.setText("Diğer Açıklamalar:");

        areaAciklama.setColumns(20);
        areaAciklama.setRows(5);
        jScrollPane6.setViewportView(areaAciklama);

        lblEhliyet.setText("Ehliyet:");

        javax.swing.GroupLayout pnlDigerLayout = new javax.swing.GroupLayout(pnlDiger);
        pnlDiger.setLayout(pnlDigerLayout);
        pnlDigerLayout.setHorizontalGroup(
            pnlDigerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDigerLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnlDigerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIsDeneyim)
                    .addComponent(lblSertifika)
                    .addComponent(lblReferans)
                    .addComponent(lblAciklama)
                    .addComponent(lblEhliyet, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDigerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDigerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                        .addComponent(jScrollPane4)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane6))
                    .addComponent(txtEhliyet, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        pnlDigerLayout.setVerticalGroup(
            pnlDigerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDigerLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlDigerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIsDeneyim)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDigerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSertifika))
                .addGap(18, 18, 18)
                .addGroup(pnlDigerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReferans))
                .addGap(18, 18, 18)
                .addGroup(pnlDigerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAciklama)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDigerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEhliyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEhliyet))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        tpPersonelCV.addTab("Diğer Bilgiler", pnlDiger);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpPersonelCV)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpPersonelCV)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tpPersonelCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpPersonelCVMouseClicked
        
    }//GEN-LAST:event_tpPersonelCVMouseClicked

    private void lblGeriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGeriMouseClicked
       HomePage open =new HomePage();
       open.setVisible(true);
       
       this.dispose();
    }//GEN-LAST:event_lblGeriMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(personel_cv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personel_cv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personel_cv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personel_cv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personel_cv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_getCinsiyet;
    private javax.swing.JTextArea areaAciklama;
    private javax.swing.JTextArea areaAdres;
    private javax.swing.JTextArea areaIsDeneyim;
    private javax.swing.JTextArea areaMezunUni;
    private javax.swing.JTextArea areaOkuduguUni;
    private javax.swing.JTextArea areaReferans;
    private javax.swing.JTextArea areaSeminerler;
    private javax.swing.JTextArea areaSertifika;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblAciklama;
    private javax.swing.JLabel lblAdi;
    private javax.swing.JLabel lblAdres;
    private javax.swing.JLabel lblCinsiyet;
    private javax.swing.JLabel lblDepartmanadi;
    private javax.swing.JLabel lblDepartmanno;
    private javax.swing.JLabel lblDiploma;
    private javax.swing.JLabel lblDiplomaPuani;
    private javax.swing.JLabel lblEhliyet;
    private javax.swing.JLabel lblGeri;
    private javax.swing.JLabel lblIlce;
    private javax.swing.JLabel lblIsDeneyim;
    private javax.swing.JLabel lblIseGiris;
    private javax.swing.JLabel lblIstenCikis;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblMezunUni;
    private javax.swing.JLabel lblOgrenimDurumu;
    private javax.swing.JLabel lblOkuduguUni;
    private javax.swing.JLabel lblPersonelID;
    private javax.swing.JLabel lblReferans;
    private javax.swing.JLabel lblResim;
    private javax.swing.JLabel lblSehir;
    private javax.swing.JLabel lblSeminerler;
    private javax.swing.JLabel lblSertifika;
    private javax.swing.JLabel lblSoyadi;
    private javax.swing.JLabel lblStatu;
    private javax.swing.JLabel lblTckimlik;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lbl_getAdi;
    private javax.swing.JLabel lbl_getDepartmanNo;
    private javax.swing.JLabel lbl_getDepartmanadi;
    private javax.swing.JLabel lbl_getDogum;
    private javax.swing.JLabel lbl_getIlce;
    private javax.swing.JLabel lbl_getPersonelID;
    private javax.swing.JLabel lbl_getSehir;
    private javax.swing.JLabel lbl_getSoyadi;
    private javax.swing.JLabel lbl_getTC;
    private javax.swing.JLabel lbl_getTelefon;
    private javax.swing.JLabel lbl_getUnvan;
    private javax.swing.JPanel pnlDiger;
    private javax.swing.JPanel pnlEgitim;
    private javax.swing.JPanel pnlGenel;
    private javax.swing.JTabbedPane tpPersonelCV;
    private javax.swing.JTextField txtEhliyet;
    private javax.swing.JTextField txtIseGiris;
    private javax.swing.JTextField txtIstenCikis;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtOgrenimDurumu;
    private javax.swing.JTextField txtStatu;
    // End of variables declaration//GEN-END:variables
}
