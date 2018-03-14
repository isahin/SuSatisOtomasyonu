package newpackage;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class NewJFrame1 extends javax.swing.JFrame {

    DB db = new DB();

    public void Sec(JCheckBox x, JTextField texAdi) {
        if (texAdi.getText().equals("")) {

        } else {

            String urunAdi = x.getText();
            String urunMiktari = texAdi.getText();

            try {
                String yazQuery = "insert into Siparisler values(null,'" + mid + "','" + urunAdi + "','" + urunMiktari + "','Hazırlanıyor')";
                int yazSonuc = db.baglan().executeUpdate(yazQuery);
                if (yazSonuc > 0) {
                    // JOptionPane.showMessageDialog(rootPane, "Yazma işlemi başarılı");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Yazma İşlemi Başarısız !");
                }

            } catch (SQLException ex) {
                System.err.println("Yazma hatası : " + ex);

                if (ex.toString().contains("SQLITE_CONSTRAINT_UNIQUE")) {
                    JOptionPane.showMessageDialog(rootPane, "Aynı mail adresi ile kayıt yapılamaz !");

                }

            } finally {
                db.kapat();
                siparisGetir();
            }
        }

    }

    public void isaretle(JCheckBox jb) {

        try {
            secilensu = jb.getText();

            String musteriQuery = "select UrunID from Urunler where urunAdi= '" + secilensu + "'";
            ResultSet rs = db.baglan().executeQuery(musteriQuery);
            System.out.println(rs.getString("UrunID").toString());
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            db.kapat();
        }
    }

    public NewJFrame1() {

        initComponents();
        //    ondokuzlt.setVisible(false);
        //    ondokuzlt.setEnabled(false);
        dataGetir();
        siparisGetir();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tabbed = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnKayıt = new javax.swing.JButton();
        txtAd = new javax.swing.JTextField();
        txtSoyad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAdres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        musteriID = new javax.swing.JTextField();
        musteriTel = new javax.swing.JTextField();
        btnArama = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        musteriAd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        musteriSoyad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnGuncelleme = new javax.swing.JButton();
        musteriAdres = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnTemizleme = new javax.swing.JButton();
        btnSiparis = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        ondokuzlt = new javax.swing.JTextField();
        onlt = new javax.swing.JTextField();
        beslt = new javax.swing.JTextField();
        birbucuklt = new javax.swing.JTextField();
        yarımlt = new javax.swing.JTextField();
        sıfırotuzuclt = new javax.swing.JTextField();
        jCheckBox5 = new javax.swing.JCheckBox();
        birlt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Su Satış Programı"));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kayıt İşlemi"));

        btnKayıt.setText("Kayıt");
        btnKayıt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayıtActionPerformed(evt);
            }
        });

        jLabel1.setText("Müşteri Adı");

        jLabel2.setText("Müşteri Soyadı");

        jLabel3.setText("Müşteri Telefonu");

        jLabel4.setText("Müşteri Adresi");

        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(txtAdres)
                    .addComponent(btnKayıt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtSoyad)
                    .addComponent(txtTelefon)
                    .addComponent(jLabel3)
                    .addComponent(btnSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnKayıt)
                .addGap(29, 29, 29)
                .addComponent(btnSil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabbed.addTab("Üye İşlemleri", jPanel4);

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Arama"));
        jPanel3.setToolTipText("");
        jPanel3.setPreferredSize(new java.awt.Dimension(301, 398));

        btnArama.setText("Arama");
        btnArama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAramaActionPerformed(evt);
            }
        });

        jLabel7.setText("Müşteri Telefon");

        jLabel8.setText("Müşteri ID");

        jLabel5.setText("Müşteri Ad");

        jLabel6.setText("Müşteri Soyad");

        btnGuncelleme.setText("Güncelleme");
        btnGuncelleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncellemeActionPerformed(evt);
            }
        });

        jLabel10.setText("Müsteri Adres");

        btnTemizleme.setText("Temizle");
        btnTemizleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizlemeActionPerformed(evt);
            }
        });

        btnSiparis.setText("Sipariş Ver");
        btnSiparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiparisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(btnArama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(musteriID)
                    .addComponent(musteriTel)
                    .addComponent(musteriAd)
                    .addComponent(musteriSoyad)
                    .addComponent(btnGuncelleme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(musteriAdres)
                    .addComponent(btnTemizleme, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(btnSiparis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musteriID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musteriTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musteriAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musteriSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musteriAdres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnArama)
                .addGap(18, 18, 18)
                .addComponent(btnGuncelleme)
                .addGap(18, 18, 18)
                .addComponent(btnTemizleme)
                .addGap(18, 18, 18)
                .addComponent(btnSiparis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabbed.addTab("Müşteri Arama", jPanel5);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Kayıt Güncelleme"));

        jCheckBox1.setText("19 LİTRE");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("10 LİTRE");
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseClicked(evt);
            }
        });

        jCheckBox3.setText("5 LİTRE");
        jCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox3MouseClicked(evt);
            }
        });

        jCheckBox4.setText("1.5 LİTRE");
        jCheckBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox4MouseClicked(evt);
            }
        });

        jCheckBox6.setText("0.50 LİTRE");
        jCheckBox6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox6MouseClicked(evt);
            }
        });

        jCheckBox7.setText("0.33 LİTRE");
        jCheckBox7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox7MouseClicked(evt);
            }
        });

        birbucuklt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birbucukltMouseClicked(evt);
            }
        });

        yarımlt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yarımltMouseClicked(evt);
            }
        });

        jCheckBox5.setText("1 LİTRE");
        jCheckBox5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox5MouseClicked(evt);
            }
        });

        birlt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birltMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox7))
                            .addComponent(jCheckBox5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(onlt)
                            .addComponent(beslt)
                            .addComponent(birbucuklt)
                            .addComponent(yarımlt)
                            .addComponent(sıfırotuzuclt)
                            .addComponent(birlt, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ondokuzlt)))
                .addGap(35, 35, 35))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(ondokuzlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(onlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(beslt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(birbucuklt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(yarımlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sıfırotuzuclt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTable3.setToolTipText("");
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setHeaderValue("Title 2");
        }

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jButton2.setText("Yola Çıktı");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Teslim Edildi");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Sipariş İptal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Sipariş Tamamla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)))
                .addContainerGap())
        );

        tabbed.addTab("Su Siparişi", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbed)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbed)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Sec(jCheckBox1, ondokuzlt);
        Sec(jCheckBox2, onlt);
        Sec(jCheckBox3, beslt);
        Sec(jCheckBox4, birbucuklt);
        Sec(jCheckBox5, birlt);
        Sec(jCheckBox6, yarımlt);
        Sec(jCheckBox7, sıfırotuzuclt);

        JOptionPane.showMessageDialog(rootPane, "Yazma işlemi başarılı");
        //        String urunAdi = jCheckBox1.getText();
        //        String urunMiktari = ondokuzlt.getText();
        //
        //        try {
        //            String yazQuery = "insert into Siparisler values(null,'" + mid + "','" + urunAdi + "','" + urunMiktari + "')";
        //            int yazSonuc = db.baglan().executeUpdate(yazQuery);
        //            if (yazSonuc > 0) {
        //                JOptionPane.showMessageDialog(rootPane, "Yazma işlemi başarılı");
        //            } else {
        //                JOptionPane.showMessageDialog(rootPane, "Yazma İşlemi Başarısız !");
        //            }
        //
        //        } catch (SQLException ex) {
        //            System.err.println("Yazma hatası : " + ex);
        //
        //            if (ex.toString().contains("SQLITE_CONSTRAINT_UNIQUE")) {
        //                JOptionPane.showMessageDialog(rootPane, "Aynı mail adresi ile kayıt yapılamaz !");
        //
        //            }
        //
        //        } finally {
        //            db.kapat();
        //            siparisGetir();
        //        }

        ondokuzlt.setText("");


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int row = jTable4.getSelectedRow();
            String updateQuery = "update  Siparisler set siparisDurum = 'Teslim Edildi' where siparisID='" + jTable4.getValueAt(row, 0) + "'";
            int yazSonuc = db.baglan().executeUpdate(updateQuery);

        } catch (Exception e) {
        } finally {

            db.kapat();
            siparisGetir();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int row = jTable4.getSelectedRow();
            String updateQuery = "update  Siparisler set siparisDurum = 'Yola Çıktı' where siparisID='" + jTable4.getValueAt(row, 0) + "'";
            int yazSonuc = db.baglan().executeUpdate(updateQuery);

        } catch (Exception e) {
        } finally {

            db.kapat();
            siparisGetir();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        int row = jTable4.getSelectedRow();
        if (row > -1) {
            mid = "" + jTable4.getValueAt(row, 0);
            System.out.println("mid : " + mid);

        }

    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int row = jTable3.getSelectedRow();
        if (row > -1) {
            mid = "" + jTable3.getValueAt(row, 0);
            System.out.println("mid : " + mid);

        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void birltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birltMouseClicked

        isaretle(jCheckBox5);
    }//GEN-LAST:event_birltMouseClicked

    private void jCheckBox5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox5MouseClicked

        isaretle(jCheckBox5);
    }//GEN-LAST:event_jCheckBox5MouseClicked

    private void yarımltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yarımltMouseClicked

        isaretle(jCheckBox6);
    }//GEN-LAST:event_yarımltMouseClicked

    private void birbucukltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birbucukltMouseClicked

        isaretle(jCheckBox4);
    }//GEN-LAST:event_birbucukltMouseClicked

    private void jCheckBox7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox7MouseClicked

        isaretle(jCheckBox7);
    }//GEN-LAST:event_jCheckBox7MouseClicked

    private void jCheckBox6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox6MouseClicked

        isaretle(jCheckBox6);
    }//GEN-LAST:event_jCheckBox6MouseClicked

    private void jCheckBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox4MouseClicked

        isaretle(jCheckBox4);
    }//GEN-LAST:event_jCheckBox4MouseClicked

    private void jCheckBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox3MouseClicked

        isaretle(jCheckBox3);
    }//GEN-LAST:event_jCheckBox3MouseClicked

    private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseClicked

        isaretle(jCheckBox2);
    }//GEN-LAST:event_jCheckBox2MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        isaretle(jCheckBox1);
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row = jTable2.getSelectedRow();
        if (row > -1) {
            mid = "" + jTable2.getValueAt(row, 0);
            System.out.println("mid : " + mid);
        }

        String satirQuery = "select * from Musteriler where mID ='" + mid + "'";

        try {
            ResultSet rs = db.baglan().executeQuery(satirQuery);
            if (rs.next()) {
                musteriAd.setText(rs.getString("mAd"));
                musteriSoyad.setText(rs.getString("mSoyad"));
                musteriID.setText(rs.getString("mID"));
                musteriTel.setText(rs.getString("mTelefon"));
                musteriAdres.setText(rs.getString("mAdres"));

            } else {
                System.out.println("müşteri yok");
            }

        } catch (Exception e) {
            System.out.println("hatatatat " + e);

        } finally {
            db.kapat();
        }

        ////        String id = musteriID.getText();
        ////        String ad = musteriAd.getText();
        ////        String soyad = musteriSoyad.getText();
        ////        String tel = musteriTel.getText();
        ////        String adres = musteriAdres.getText();
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnSiparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiparisActionPerformed
        if (jTable2.getSelectedRow() != -1) {

            DefaultTableModel dtmm = new DefaultTableModel();
            dtmm.addColumn("ID");
            dtmm.addColumn("Adı");
            dtmm.addColumn("Soyadı");
            dtmm.addColumn("Telefon");
            dtmm.addColumn("Adres");
            int x = jTable2.getSelectedRow();
            dtmm.addRow(new String[]{jTable2.getValueAt(x, 0).toString(), jTable2.getValueAt(x, 1).toString(), jTable2.getValueAt(x, 2).toString(), jTable2.getValueAt(x, 3).toString(), jTable2.getValueAt(x, 4).toString()});
            jTable3.setModel(dtmm);
            tabbed.setSelectedComponent(jPanel6);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Müşteri Seçiniz");
        }
    }//GEN-LAST:event_btnSiparisActionPerformed

    private void btnTemizlemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizlemeActionPerformed
        musteriAd.setText("");
        musteriAdres.setText("");
        musteriSoyad.setText("");
        musteriTel.setText("");
        musteriID.setText("");
    }//GEN-LAST:event_btnTemizlemeActionPerformed

    private void btnGuncellemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncellemeActionPerformed

        //        String id = musteriID.getText();
        String adi = musteriAd.getText();
        String soyadi = musteriSoyad.getText();
        String telefon = musteriTel.getText();
        String adres = musteriAdres.getText();

        try {
            int row = jTable2.getSelectedRow();
            String updateQuery = "update  Musteriler set mAd= '" + adi + "',mSoyad= '" + soyadi + "',mTelefon= '" + telefon + "',mAdres= '" + adres + "'where mID='" + jTable2.getValueAt(row, 0) + "'";
            int yazSonuc = db.baglan().executeUpdate(updateQuery);

        } catch (Exception e) {
        } finally {

            db.kapat();
            dataGetir();
        }
    }//GEN-LAST:event_btnGuncellemeActionPerformed

    private void btnAramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAramaActionPerformed
        dataArama();
        String mID = musteriID.getText().trim();

        if (mID.equals("*")) {
            dataGetir();
        }
    }//GEN-LAST:event_btnAramaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if (row > -1) {
            mid = "" + jTable1.getValueAt(row, 0);
            System.out.println("mid : " + mid);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed

        int snc = JOptionPane.showConfirmDialog(rootPane, "Emin misiniz?");
        if (snc == 0) {

            if (mid.equals("")) {

                JOptionPane.showMessageDialog(rootPane, "Lütfen secim yapınız");
            } else {
                //silme işlemini yap

                String silQuery = "delete from musteriler where mid = '" + mid + "'";
                try {
                    int silSonuc = db.baglan().executeUpdate(silQuery);

                    if (silSonuc > 0) {
                        //db.kapat();
                        dataGetir();
                        JOptionPane.showMessageDialog(rootPane, "Silme İşlemi Başarılı");
                    } else {

                        JOptionPane.showMessageDialog(rootPane, "Silme Hatası!");
                    }
                } catch (Exception e) {

                    System.err.println("Silme Hatası : " + e);
                } finally {
                    dataGetir();
                    db.kapat();
                }

            }
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnKayıtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayıtActionPerformed

        String adi = txtAd.getText().trim();
        String soyadi = txtSoyad.getText().trim();
        String telefon = txtTelefon.getText().trim();
        String adres = txtAdres.getText().trim();

        if (adi.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Ad Giriniz");
            txtAd.requestFocus();

        } else if (soyadi.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Soyad Giriniz");
            txtSoyad.requestFocus();

        } else if (telefon.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Telefon Giriniz");
            txtTelefon.requestFocus();

        } else if (adres.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Adres Giriniz");
            txtTelefon.requestFocus();

        } else {

            // YAZMA İŞLEMİ YAPILIYOR
            try {
                String yazQuery = "insert into Musteriler values(null,'" + adi + "','" + soyadi + "','" + telefon + "','" + adres + "')";
                int yazSonuc = db.baglan().executeUpdate(yazQuery);
                if (yazSonuc > 0) {
                    dataGetir();
                    JOptionPane.showMessageDialog(rootPane, "Yazma işlemi başarılı");
                    txtAd.setText("");
                    txtSoyad.setText("");
                    txtTelefon.setText("");
                    txtAdres.setText("");

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Yazma İşlemi Başarısız !");
                }

            } catch (SQLException ex) {
                System.err.println("Yazma hatası : " + ex);

                if (ex.toString().contains("SQLITE_CONSTRAINT_UNIQUE")) {
                    JOptionPane.showMessageDialog(rootPane, "Aynı mail adresi ile kayıt yapılamaz !");

                }

            } finally {
                dataGetir();
                db.kapat();
            }
        }
    }//GEN-LAST:event_btnKayıtActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int snc = JOptionPane.showConfirmDialog(rootPane, "Emin misiniz?");
        if (snc == 0) {

            if (mid.equals("")) {

                JOptionPane.showMessageDialog(rootPane, "Lütfen secim yapınız");
            } else {
                //silme işlemini yap

                String silQuery = "delete from Siparisler where siparisID= '" + mid + "'";
                try {
                    int silSonuc = db.baglan().executeUpdate(silQuery);

                    if (silSonuc > 0) {
                        //db.kapat();
                        dataGetir();
                        JOptionPane.showMessageDialog(rootPane, "Silme İşlemi Başarılı");
                    } else {

                        JOptionPane.showMessageDialog(rootPane, "Silme Hatası!");
                    }
                } catch (Exception e) {

                    System.err.println("Silme Hatası : " + e);
                } finally {
                    dataGetir();
                    siparisGetir();
                    db.kapat();
                }

            }
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    String mid = "";
    public String secilensu;//    public void kontrol() {
//         ondokuzlt.setEnabled(true);
//         i=1;
//                 
//    }

    public void dataGetir() {

        try {
            String musteriQuery = "select *from Musteriler";
            ResultSet rs = db.baglan().executeQuery(musteriQuery);
            DefaultTableModel dtm = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;

                }

            };
            dtm.addColumn("ID");
            dtm.addColumn("Adı");
            dtm.addColumn("Soyadı");
            dtm.addColumn("Telefon");
            dtm.addColumn("Adres");

            // Satırlara gelecek datalar alınıyor
            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString("mID"), rs.getString("mAd"), rs.getString("mSoyad"), rs.getString("mTelefon"), rs.getString("mAdres")});
            }

            jTable1.setModel(dtm);
            jTable2.setModel(dtm);
            // jTable3.setModel(dtm);
            //jTable4.setModel(dtm);

        } catch (Exception e) {

            System.err.println("Data getirme Hatası : " + e);
        } finally {
            db.kapat();
        }

    }

    public void siparisGetir() {

        try {

            String siparisQuery = "select Siparisler.siparisID, Musteriler.mAd, Musteriler.mSoyad, Musteriler.mAdres, Siparisler.urunAdi, Siparisler.urunMiktar, Siparisler.siparisDurum from Musteriler inner join Siparisler on Musteriler.mID = Siparisler.musteriID";
            ResultSet rs = db.baglan().executeQuery(siparisQuery);
            DefaultTableModel dtm = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            
            
            };

            dtm.addColumn("Sipariş ID");
            dtm.addColumn("Müşteri Adı");
            dtm.addColumn("Müşteri Soyadı");
            dtm.addColumn("Müşteri Adres");
            dtm.addColumn("Ürün Adı");
            dtm.addColumn("Ürün Miktar");
            dtm.addColumn("Durum");

            // Satırlara gelecek datalar alınıyor
            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString("siparisID"), rs.getString("mAd"), rs.getString("mSoyad"), rs.getString("mAdres"), rs.getString("urunAdi"), rs.getString("urunMiktar"), rs.getString("siparisDurum")});
            }

            jTable4.setModel(dtm);

        } catch (Exception e) {

            System.err.println("Data getirme Hatası : " + e);
        } finally {
            db.kapat();
        }

    }

    public void dataArama() {
        String mID = musteriID.getText().trim();
        String mTelefon = musteriTel.getText().trim();
        String mAd = musteriAd.getText().trim();
        String mSoyad = musteriSoyad.getText().trim();
        String musteriQuery = "select *from Musteriler where mID='" + mID + "'or mTelefon='" + mTelefon + "' or mAd='" + mAd + "' or mSoyad='" + mSoyad + "'";

        try {

            ResultSet rs = db.baglan().executeQuery(musteriQuery);
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("ID");
            dtm.addColumn("Adı");
            dtm.addColumn("Soyadı");
            dtm.addColumn("Telefon");
            dtm.addColumn("Adres");

            // Satırlara gelecek datalar alınıyor
            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString("mID"), rs.getString("mAd"), rs.getString("mSoyad"), rs.getString("mTelefon"), rs.getString("mAdres")});
            }

            jTable2.setModel(dtm);
            //jTable3.setModel(dtm);

        } catch (Exception e) {

            System.err.println("Data getirme Hatası : " + e);
        } finally {
            db.kapat();
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField beslt;
    private javax.swing.JTextField birbucuklt;
    private javax.swing.JTextField birlt;
    private javax.swing.JButton btnArama;
    private javax.swing.JButton btnGuncelleme;
    private javax.swing.JButton btnKayıt;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnSiparis;
    private javax.swing.JButton btnTemizleme;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField musteriAd;
    private javax.swing.JTextField musteriAdres;
    private javax.swing.JTextField musteriID;
    private javax.swing.JTextField musteriSoyad;
    private javax.swing.JTextField musteriTel;
    private javax.swing.JTextField ondokuzlt;
    private javax.swing.JTextField onlt;
    private javax.swing.JTextField sıfırotuzuclt;
    private javax.swing.JTabbedPane tabbed;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtAdres;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtTelefon;
    private javax.swing.JTextField yarımlt;
    // End of variables declaration//GEN-END:variables

}
