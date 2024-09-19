package View;

import Config.Koneksi;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class MenuPeminjaman extends javax.swing.JPanel {

    private int halamanSaatIni = 1;
    private int dataPerHalaman = 14;
    private int totalPages;
    private final Connection conn;
    private String userID;
    
    public MenuPeminjaman(String userID) {
        initComponents();
        
        conn = Koneksi.getConnection();
        this.userID = userID;
        setTabelModel();
        setTabelModelDetail();
        setTabelModelSementara();
        loadData();
        loadDataSementara();
        actionButton();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        dateChooser2 = new com.raven.datechooser.DateChooser();
        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new Palette.Custom_JTabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new Palette.Custom_ButtonRounded();
        txtSearch = new Palette.Custom_JTextFieldRounded();
        pnDetail = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDataDetail = new Palette.Custom_JTabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnCloseDetail = new javax.swing.JButton();
        panelAdd = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSave = new Palette.Custom_ButtonRounded();
        btnCancelAdd = new Palette.Custom_ButtonRounded();
        lbGambar = new javax.swing.JLabel();
        custom_JPanelRounded1 = new Palette.Custom_JPanelRounded();
        jLabel9 = new javax.swing.JLabel();
        txtID = new Palette.Custom_JTextFieldRounded();
        txtTanggalPinjam = new Palette.Custom_JTextFieldRounded();
        jLabel10 = new javax.swing.JLabel();
        txtTanggalKembali = new Palette.Custom_JTextFieldRounded();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIdAnggota = new Palette.Custom_JTextFieldRounded();
        jLabel13 = new javax.swing.JLabel();
        txtNama = new Palette.Custom_JTextFieldRounded();
        jLabel14 = new javax.swing.JLabel();
        txtEmail = new Palette.Custom_JTextFieldRounded();
        jLabel15 = new javax.swing.JLabel();
        txtTelepon = new Palette.Custom_JTextFieldRounded();
        btnSetAnggota = new javax.swing.JButton();
        txtPenerbit = new Palette.Custom_JTextFieldRounded();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtPengarang = new Palette.Custom_JTextFieldRounded();
        txtJudul = new Palette.Custom_JTextFieldRounded();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtIdBuku = new Palette.Custom_JTextFieldRounded();
        btnSetBuku = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtJumlah = new Palette.Custom_JTextFieldRounded();
        jLabel21 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDataSementara = new Palette.Custom_JTabel();
        btnUbah = new Palette.Custom_ButtonRounded();
        btnDelete = new Palette.Custom_ButtonRounded();
        btnCancelSementara = new Palette.Custom_ButtonRounded();

        dateChooser1.setTextRefernce(txtTanggalPinjam);

        dateChooser2.setTextRefernce(txtTanggalKembali);

        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setPreferredSize(new java.awt.Dimension(1133, 690));
        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(255, 255, 255));
        panelView.setPreferredSize(new java.awt.Dimension(1133, 690));

        tblData.setForeground(new java.awt.Color(255, 51, 51));
        tblData.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(tblData);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Data Peminjaman Buku Perpustakaan");

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1097, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_borrow_book_30px.png"))); // NOI18N

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_add_30px.png"))); // NOI18N
        btnAdd.setText("TAMBAH");
        btnAdd.setFillClick(new java.awt.Color(0, 51, 102));
        btnAdd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        txtSearch.setForeground(new java.awt.Color(102, 102, 102));
        txtSearch.setText("Search");
        txtSearch.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        pnDetail.setBackground(new java.awt.Color(250, 250, 250));

        tblDataDetail.setForeground(new java.awt.Color(255, 51, 51));
        tblDataDetail.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(tblDataDetail);

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Data Detail Peminjaman Buku Perpustakaan");

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_book_30px.png"))); // NOI18N

        btnCloseDetail.setForeground(new java.awt.Color(102, 102, 102));
        btnCloseDetail.setText("X");

        javax.swing.GroupLayout pnDetailLayout = new javax.swing.GroupLayout(pnDetail);
        pnDetail.setLayout(pnDetailLayout);
        pnDetailLayout.setHorizontalGroup(
            pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCloseDetail)
                .addContainerGap())
            .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnDetailLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnDetailLayout.setVerticalGroup(
            pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(btnCloseDetail))
                .addContainerGap(239, Short.MAX_VALUE))
            .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDetailLayout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1093, Short.MAX_VALUE)
                    .addComponent(pnDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMain.add(panelView, "card2");

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));
        panelAdd.setPreferredSize(new java.awt.Dimension(1133, 690));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Tambah Data Peminjaman Buku Perpustakaan");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Transaksi > Peminjaman");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_tv_30px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_borrow_book_30px.png"))); // NOI18N

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_save_30px.png"))); // NOI18N
        btnSave.setText("SIMPAN");
        btnSave.setFillClick(new java.awt.Color(0, 51, 102));
        btnSave.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        btnCancelAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_rollback_30px.png"))); // NOI18N
        btnCancelAdd.setText("BATAL");
        btnCancelAdd.setFillClick(new java.awt.Color(153, 51, 0));
        btnCancelAdd.setFillOriginal(new java.awt.Color(255, 102, 0));
        btnCancelAdd.setFillOver(new java.awt.Color(204, 102, 0));
        btnCancelAdd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        lbGambar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbGambar.setForeground(new java.awt.Color(102, 102, 102));
        lbGambar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_book_100px.png"))); // NOI18N
        lbGambar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        custom_JPanelRounded1.setBackground(new java.awt.Color(250, 250, 250));
        custom_JPanelRounded1.setRoundBottomLeft(20);
        custom_JPanelRounded1.setRoundBottomRight(20);
        custom_JPanelRounded1.setRoundTopLeft(20);
        custom_JPanelRounded1.setRoundTopRight(20);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("ID");

        txtID.setForeground(new java.awt.Color(102, 102, 102));
        txtID.setText("ID");
        txtID.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        txtTanggalPinjam.setForeground(new java.awt.Color(102, 102, 102));
        txtTanggalPinjam.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Tanggal Pinjam");

        txtTanggalKembali.setForeground(new java.awt.Color(102, 102, 102));
        txtTanggalKembali.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Tanggal Kembali");

        javax.swing.GroupLayout custom_JPanelRounded1Layout = new javax.swing.GroupLayout(custom_JPanelRounded1);
        custom_JPanelRounded1.setLayout(custom_JPanelRounded1Layout);
        custom_JPanelRounded1Layout.setHorizontalGroup(
            custom_JPanelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custom_JPanelRounded1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(txtTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(txtTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        custom_JPanelRounded1Layout.setVerticalGroup(
            custom_JPanelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custom_JPanelRounded1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(custom_JPanelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(custom_JPanelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(custom_JPanelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(custom_JPanelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Anggota");

        txtIdAnggota.setForeground(new java.awt.Color(102, 102, 102));
        txtIdAnggota.setText("ID");
        txtIdAnggota.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Nama");

        txtNama.setForeground(new java.awt.Color(102, 102, 102));
        txtNama.setText("Nama");
        txtNama.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Email");

        txtEmail.setForeground(new java.awt.Color(102, 102, 102));
        txtEmail.setText("Email");
        txtEmail.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Telepon");

        txtTelepon.setForeground(new java.awt.Color(102, 102, 102));
        txtTelepon.setText("Telepon");
        txtTelepon.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        btnSetAnggota.setText("...");

        txtPenerbit.setForeground(new java.awt.Color(102, 102, 102));
        txtPenerbit.setText("Penerbit");
        txtPenerbit.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Penerbit");

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Pengarang");

        txtPengarang.setForeground(new java.awt.Color(102, 102, 102));
        txtPengarang.setText("Pengarang");
        txtPengarang.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        txtJudul.setForeground(new java.awt.Color(102, 102, 102));
        txtJudul.setText("Judul");
        txtJudul.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Judul");

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Buku");

        txtIdBuku.setForeground(new java.awt.Color(102, 102, 102));
        txtIdBuku.setText("ID");
        txtIdBuku.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        btnSetBuku.setText("...");

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Jumlah");

        txtJumlah.setForeground(new java.awt.Color(102, 102, 102));
        txtJumlah.setText("Jumlah");
        txtJumlah.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Total Pinjam");

        lbTotal.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(102, 102, 102));
        lbTotal.setText("Total");

        tblDataSementara.setForeground(new java.awt.Color(255, 51, 51));
        tblDataSementara.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(tblDataSementara);

        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_add_30px.png"))); // NOI18N
        btnUbah.setText("UBAH");
        btnUbah.setFillClick(new java.awt.Color(0, 51, 102));
        btnUbah.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_cancel_30px.png"))); // NOI18N
        btnDelete.setText("HAPUS");
        btnDelete.setFillClick(new java.awt.Color(153, 0, 51));
        btnDelete.setFillOriginal(new java.awt.Color(255, 0, 51));
        btnDelete.setFillOver(new java.awt.Color(204, 0, 51));
        btnDelete.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        btnCancelSementara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_rollback_30px.png"))); // NOI18N
        btnCancelSementara.setText("BATAL");
        btnCancelSementara.setFillClick(new java.awt.Color(153, 51, 0));
        btnCancelSementara.setFillOriginal(new java.awt.Color(255, 102, 0));
        btnCancelSementara.setFillOver(new java.awt.Color(204, 102, 0));
        btnCancelSementara.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSetAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPengarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addComponent(txtIdBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSetBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPenerbit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lbGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(lbTotal))
                .addGap(62, 62, 62))
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(custom_JPanelRounded1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAddLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
                    .addGap(21, 21, 21)))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))))
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(custom_JPanelRounded1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelAddLayout.createSequentialGroup()
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSetAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelAddLayout.createSequentialGroup()
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSetBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lbGambar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                    .addGap(481, 481, 481)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Custom_ButtonRounded btnAdd;
    private Palette.Custom_ButtonRounded btnCancelAdd;
    private Palette.Custom_ButtonRounded btnCancelSementara;
    private javax.swing.JButton btnCloseDetail;
    private Palette.Custom_ButtonRounded btnDelete;
    private Palette.Custom_ButtonRounded btnSave;
    private javax.swing.JButton btnSetAnggota;
    private javax.swing.JButton btnSetBuku;
    private Palette.Custom_ButtonRounded btnUbah;
    private Palette.Custom_JPanelRounded custom_JPanelRounded1;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbGambar;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.JPanel pnDetail;
    private Palette.Custom_JTabel tblData;
    private Palette.Custom_JTabel tblDataDetail;
    private Palette.Custom_JTabel tblDataSementara;
    private Palette.Custom_JTextFieldRounded txtEmail;
    private Palette.Custom_JTextFieldRounded txtID;
    private Palette.Custom_JTextFieldRounded txtIdAnggota;
    private Palette.Custom_JTextFieldRounded txtIdBuku;
    private Palette.Custom_JTextFieldRounded txtJudul;
    private Palette.Custom_JTextFieldRounded txtJumlah;
    private Palette.Custom_JTextFieldRounded txtNama;
    private Palette.Custom_JTextFieldRounded txtPenerbit;
    private Palette.Custom_JTextFieldRounded txtPengarang;
    private Palette.Custom_JTextFieldRounded txtSearch;
    private Palette.Custom_JTextFieldRounded txtTanggalKembali;
    private Palette.Custom_JTextFieldRounded txtTanggalPinjam;
    private Palette.Custom_JTextFieldRounded txtTelepon;
    // End of variables declaration//GEN-END:variables

    

    
    
   
    private void actionButton(){
        btnAdd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                panelMain.removeAll();
                panelMain.add(panelAdd);
                panelMain.repaint();
                panelMain.revalidate();

                txtID.setText(setIdPeminjaman());
                btnUbah.setText("TAMBAH");
            }
        });
        
        btnSave.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(btnSave.getText().equals("TAMBAH"))
                    {
                        btnSave.setText("SIMPAN");
                    }
                else if(btnSave.getText().equals("SIMPAN"))
                    {
                        insertData();
                        insertDataDetail();
                        deleteDataSementara();
                        resetForm();
                        loadData();
                        showPanel();
                    }
                else if (btnSave.getText().equals("PERBARUI"))
                    {
                        updateData();
                        resetForm();
                        loadData();
                        showPanel();
                    }
            }
        });
        
        btnUbah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(btnUbah.getText().equals("TAMBAH")){
                    insertDataSementara();
                } else if(btnUbah.getText().equals("UBAH")){
                    updateData();
                }
            }
        });
        
        btnDelete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteData();
            }
        });
        
        btnCancelSementara.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                loadDataSementara();
                resetFormBuku();
                btnUbah.setText("TAMBAH");
            }
        });
        
        btnCancelAdd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                showPanel();
                loadData();
            }
        });
        
        btnCloseDetail.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                showPanel();
                loadData();
            }
        });
        
        txtSearch.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e) {
                searchData();
            }
        });
        
        tblData.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                pnDetail.setVisible(true);
                
                int row = tblData.getSelectedRow();
                String id = tblData.getValueAt(row, 0).toString();
                getDataDetail((DefaultTableModel) tblDataDetail.getModel(), id);
            }
        });
        
        tblDataSementara.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                btnUbah.setText("UBAH");
                btnDelete.setVisible(true);
                btnCancelSementara.setVisible(true);
                dataTabelSementara();
            }
        });
        
        btnSetAnggota.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setAnggota();
            }
        });
        
        btnSetBuku.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setBuku();
            }
        });
        
        txtJumlah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnUbah.getText().equals("TAMBAH")) {
                    insertDataSementara();
                }else if(btnUbah.getText().equals("UBAH")){
                    updateData();
                }
            }
        });
    }
    // Button Add, Save, Delete, Cancel, Search, TableMouseClick
    
    // Fungsi lainnya
    private int getTotalData(){
        int totalData = 0;
        
        try {
            String sql = "SELECT COUNT(*) AS total FROM buku";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    totalData = rs.getInt("total");
                }
            } 
        } catch (Exception e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE,null,e);
        }
        
        return totalData;
    }
    
    private void calculateTotalPages(){
        int totalData = getTotalData();
        totalPages = (int) Math.ceil((double) totalData / dataPerHalaman );
    }
    
    private void loadData() {
        
        calculateTotalPages();
        int totalData = getTotalData();
      
        
        int startIndex = (halamanSaatIni - 1) * dataPerHalaman;
        getData(startIndex, dataPerHalaman,(DefaultTableModel) tblData.getModel());
        btnDelete.setVisible(false);
        pnDetail.setVisible(false);
    }
    
    private void loadDataSementara(){
        getDataSementara((DefaultTableModel) tblDataSementara.getModel());
        btnDelete.setVisible(false);
        btnCancelSementara.setVisible(false);
    }
    
    private void showPanel(){
        panelMain.removeAll();
        panelMain.add(new MenuPeminjaman(userID));
        panelMain.repaint();
        panelMain.revalidate();
    }
    
    private void resetForm() {
        txtID.setText("");
        txtJudul.setText("");
        txtPengarang.setText("");
        
    }
    
    private void resetFormBuku(){
        txtIdBuku.setText("");
        txtJudul.setText("");
        txtPengarang.setText("");
        txtPenerbit.setText("");
        txtJumlah.setText("");
        lbGambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_book_100px.png")));
    }
    
    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.addColumn("ID");
        model.addColumn("Tanggal Pinjam");
        model.addColumn("Tanggal Kembali");
        model.addColumn("Total Pinjam");
        model.addColumn("Anggota");
        model.addColumn("Petugas");
    }

    public void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sql = "SELECT pm.ID_Peminjaman, pm.Tanggal_Peminjaman, pm.Tanggal_Pengembalian, pm.Total_Pinjam, agt.Nama_Anggota, usr.Nama_User\n" +
                            "FROM peminjaman pm\n" +
                            "INNER JOIN anggota agt ON agt.ID_Anggota = pm.ID_Anggota\n" +
                            "INNER JOIN USER usr ON usr.ID_User = pm.ID_User ORDER BY pm.ID_Peminjaman ASC LIMIT ?,?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setInt(1, startIndex);
                st.setInt(2, entriesPage);
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idPeminjaman     = rs.getString("ID_Peminjaman");
                    String tanggalPinjam    = rs.getString("Tanggal_Peminjaman");
                    String tanggalKembali   = rs.getString("Tanggal_Pengembalian");
                    String totalPinjam      = rs.getString("Total_Pinjam");
                    String namaAnggota      = rs.getString("Nama_Anggota");
                    String namaUser         = rs.getString("Nama_User");
                    
                    Object[] rowData = {idPeminjaman, tanggalPinjam, tanggalKembali, totalPinjam, namaAnggota, namaUser};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setTabelModelDetail() {
        DefaultTableModel model = (DefaultTableModel) tblDataDetail.getModel();
        model.addColumn("ID");
        model.addColumn("ID Buku");
        model.addColumn("Judul");
        model.addColumn("Jumlah");
        model.addColumn("Status Peminjaman");
    }
    
    public void getDataDetail(DefaultTableModel model, String id) {
        model.setRowCount(0);

        try {
            String sql = "SELECT pmd.ID_Peminjaman, bk.ID_Buku, bk.Judul_Buku, pmd.Jumlah_Pinjam, pmd.Status_Peminjaman\n" +
                        "FROM detail_peminjaman pmd\n" +
                        "INNER JOIN buku bk ON bk.ID_Buku = pmd.ID_Buku\n" +
                        "WHERE pmd.ID_Peminjaman = '"+id+"'"+
                        "ORDER BY pmd.ID_Peminjaman ASC";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idPeminjaman     = rs.getString("ID_Peminjaman");
                    String idBuku           = rs.getString("ID_Buku");
                    String judulBuku        = rs.getString("Judul_Buku");
                    String jumlahPinjam     = rs.getString("Jumlah_Pinjam");
                    String statusPeminjaman = rs.getString("Status_Peminjaman");
                    
                    Object[] rowData = {idPeminjaman, idBuku, judulBuku, jumlahPinjam, statusPeminjaman};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setTabelModelSementara() {
        DefaultTableModel model = (DefaultTableModel) tblDataSementara.getModel();
        model.addColumn("ID");
        model.addColumn("Judul");
        model.addColumn("Pengarang");
        model.addColumn("Penerbit");
        model.addColumn("Jumlah Pinjam");
    }

    public void getDataSementara(DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sql = "SELECT * FROM sementara";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idBuku           = rs.getString("ID_Buku");
                    String judulBuku        = rs.getString("Judul_Buku");
                    String pengarangBuku    = rs.getString("Pengarang_Buku");
                    String penerbitBuku     = rs.getString("Penerbit_Buku");
                    String jumlahPinjam     = rs.getString("Jumlah_Pinjam");
                    
                    Object[] rowData = {idBuku, judulBuku, pengarangBuku, penerbitBuku, jumlahPinjam};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private String setIdPeminjaman(){
        String urutan = null;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);
        
        String sql = "SELECT RIGHT(ID_Peminjaman, 4) AS Nomor " +
                     "FROM peminjaman " +
                     "WHERE ID_Peminjaman LIKE 'PM" + no + "%' " +
                     "ORDER BY ID_Peminjaman DESC " +
                     "LIMIT 1";
        
        try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                
            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                urutan = "PM" + no + String.format("%04d", nomor);
            }else{
                urutan = "PM" + no + "0001";
            }
            
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return urutan;
    }
    
    private void setAnggota(){
        boolean closable = true;
        DataAnggota anggota = new DataAnggota(null, closable);
        anggota.setVisible(true);
        
        txtIdAnggota.setText(anggota.getIdAnggota());
        txtNama.setText(anggota.getNamaAnggota());
        txtEmail.setText(anggota.getEmailAnggota());
        txtTelepon.setText(anggota.getTeleponAnggota());
        
        txtIdAnggota.setEnabled(false);
        txtNama.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTelepon.setEnabled(false);
    }
    
    private void setBuku(){
        boolean closable = true;
        DataBuku buku = new DataBuku(null, closable);
        buku.setVisible(true);
        
        String id = buku.getIdBuku();
        txtIdBuku.setText(buku.getIdBuku());
        txtJudul.setText(buku.getJudulBuku());
        txtPengarang.setText(buku.getPengarangBuku());
        txtPenerbit.setText(buku.getPenerbitBuku());
        setImage(lbGambar, id);
        
        txtIdBuku.setEnabled(false);
        txtJudul.setEnabled(false);
        txtPengarang.setEnabled(false);
        txtPenerbit.setEnabled(false);
    }
    
    private boolean cekStok(String idBuku, int jumlahPinjam){
        try {
            String sql = "SELECT Stok FROM buku WHERE ID_Buku=?";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idBuku);
                
                ResultSet rs = st.executeQuery();
                
                if(rs.next()){
                    int stokTersedia = rs.getInt("Stok");
                    return jumlahPinjam <= stokTersedia;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    private void insertDataSementara() {
        String idBuku = txtIdBuku.getText();
        String judulBuku = txtJudul.getText();
        String pengarangBuku = txtPengarang.getText();
        String penerbitBuku = txtPenerbit.getText();
        int jumlahPinjam = Integer.parseInt(txtJumlah.getText());
        String statusPinjam = "Sedang dipinjam";
        
        if(idBuku.isEmpty() || judulBuku.isEmpty() || pengarangBuku.isEmpty() || penerbitBuku.isEmpty() || statusPinjam.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!cekStok(idBuku, jumlahPinjam)){
            JOptionPane.showMessageDialog(this, "Stok Buku Tidak Tersedia !","Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO sementara (ID_Buku, Judul_Buku, Pengarang_Buku, Penerbit_Buku, Jumlah_Pinjam, Status_Pinjam) VALUES (?,?,?,?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idBuku);
                st.setString(2, judulBuku);
                st.setString(3, pengarangBuku);
                st.setString(4, penerbitBuku);
                st.setInt   (5, jumlahPinjam);
                st.setString(6, statusPinjam);
                
                st.executeUpdate();
                
                int totalPinjam = getTotalPinjam();
                lbTotal.setText(String.valueOf(totalPinjam));
                loadDataSementara();
                
                if(JOptionPane.showConfirmDialog(this, "Mau Tambah Buku?",
                        "Konfirmasi",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                    resetFormBuku();
                    btnSetBuku.requestFocus();
                }else{
                    resetFormBuku();
                    btnSave.requestFocus();
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    private int getTotalPinjam(){
        int totalPinjam = 0;

        try {
            String sql = "SELECT SUM(Jumlah_Pinjam) as total FROM sementara";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    totalPinjam = rs.getInt("total");
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }

        return totalPinjam;
    }
    
    private void insertData() {
        String idPeminjaman     = txtID.getText();
        String tglPinjam        = txtTanggalPinjam.getText();
        String tglKembali       = txtTanggalKembali.getText();
        String totalPinjam      = lbTotal.getText();
        String idAnggota        = txtIdAnggota.getText();
        
        if(idPeminjaman.isEmpty() || tglPinjam.isEmpty() || tglKembali.isEmpty() || totalPinjam.isEmpty() || idAnggota.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO peminjaman (ID_Peminjaman, Tanggal_Peminjaman, Tanggal_Pengembalian, Total_Pinjam, ID_Anggota, ID_User) VALUES (?,?,?,?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idPeminjaman);
                st.setString(2, tglPinjam);
                st.setString(3, tglKembali);
                st.setString(4, totalPinjam);
                st.setString(5, idAnggota);
                st.setString(6, userID);
                
                int rowInserted = st.executeUpdate();
                if(rowInserted > 0){
                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    private void insertDataDetail() {
        String idPeminjaman     = txtID.getText();
        
        try {
            String sql = "INSERT INTO detail_peminjaman (ID_Peminjaman, ID_Buku, Jumlah_Pinjam, Status_Peminjaman) SELECT '"+idPeminjaman+"', ID_Buku, Jumlah_Pinjam, Status_Pinjam from sementara";                              
            try(PreparedStatement st = conn.prepareStatement(sql)){
               st.executeUpdate();
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    private void dataTabelSementara() {
        int row = tblDataSementara.getSelectedRow();
        if(row!=-1){
            btnSetBuku.setEnabled(false);
            txtIdBuku.setEnabled(false);
            txtJudul.setEnabled(false);
            txtPengarang.setEnabled(false);
            txtPenerbit.setEnabled(false);

            String id = tblDataSementara.getValueAt(row, 0).toString();
            txtIdBuku.setText(tblDataSementara.getValueAt(row, 0).toString());
            txtJudul.setText(tblDataSementara.getValueAt(row, 1).toString());
            txtPengarang.setText(tblDataSementara.getValueAt(row, 2).toString());
            txtPenerbit.setText(tblDataSementara.getValueAt(row, 3).toString());
            txtJumlah.setText(tblDataSementara.getValueAt(row, 4).toString());

            setImage(lbGambar, id);
            txtJumlah.requestFocus();
        }
    }
    
    private void setImage(JLabel lb_gambar, String id){
        try {
            String sql = "SELECT * FROM buku WHERE ID_Buku = '"+ id +"'";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                byte[] img = rs.getBytes("Gambar");
                if(img != null){
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().
                            getScaledInstance(lb_gambar.getWidth(), lb_gambar.getHeight(), Image.SCALE_SMOOTH));
                    lb_gambar.setIcon(imageIcon);
                }else{
                    ImageIcon defaultIcon = new ImageIcon(getClass().getResource("Image/icons8_book_100px.png"));
                    lb_gambar.setIcon(defaultIcon);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void updateData() {
        String idBuku       = txtIdBuku.getText();
        String jumlahPinjam = txtJumlah.getText();
        
        
        if(idBuku.isEmpty() || jumlahPinjam.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus dipilih dan diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "UPDATE sementara SET Jumlah_Pinjam=? WHERE ID_Buku=?";
                    
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, jumlahPinjam);
                st.setString(2, idBuku);
                
                
                int rowUpdated = st.executeUpdate();
                if(rowUpdated > 0){
                    JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                    resetFormBuku();
                    loadDataSementara();
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    private void deleteData() {
        int selectedRow = tblDataSementara.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, 
                "Apakah yakin ingin menghapus data ini ?",
                "Konfirmasi Hapus Data", 
                JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION){
            String id = tblDataSementara.getValueAt(selectedRow, 0).toString();
            try {
                String sql =  "DELETE FROM sementara WHERE ID_Buku=?";
                try(PreparedStatement st = conn.prepareStatement(sql)){
                    st.setString(1, id);
                    
                    int rowDeleted = st.executeUpdate();
                    if(rowDeleted > 0){
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                        
                    }else{
                        JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                    }
                }
            } catch (SQLException e) {
                Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        resetFormBuku();
        loadDataSementara();
    }

    private void deleteDataSementara(){
        try {
            String sql =  "DELETE FROM sementara";
                try(PreparedStatement st = conn.prepareStatement(sql)){
                    st.executeUpdate();
                }   
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    private void searchData() {
        String kataKunci = txtSearch.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "SELECT pm.ID_Peminjaman, pm.Tanggal_Peminjaman, pm.Tanggal_Pengembalian, pm.Total_Pinjam, agt.Nama_Anggota, usr.Nama_User\n" +
                            "FROM peminjaman pm\n" +
                            "INNER JOIN anggota agt ON agt.ID_Anggota = pm.ID_Anggota\n" +
                            "INNER JOIN USER usr ON usr.ID_User = pm.ID_User\n" +
                            "WHERE pm.ID_Peminjaman LIKE ? OR agt.Nama_Anggota LIKE ?";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idPeminjaman     = rs.getString("ID_Peminjaman");
                    String tanggalPinjam    = rs.getString("Tanggal_Peminjaman");
                    String tanggalKembali   = rs.getString("Tanggal_Pengembalian");
                    String totalPinjam      = rs.getString("Total_Pinjam");
                    String namaAnggota      = rs.getString("Nama_Anggota");
                    String namaUser         = rs.getString("Nama_User");
                    
                    Object[] rowData = {idPeminjaman, tanggalPinjam, tanggalKembali, totalPinjam, namaAnggota, namaUser};
                    model.addRow(rowData);
                }
            } 
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    
    
}
