package View;

import View.*;
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

public class TransaksiPeminjaman extends javax.swing.JPanel {

    private int halamanSaatIni = 1;
    private int dataPerHalaman = 14;
    private int totalPages;
    private final Connection conn;
    private String userID;

    public TransaksiPeminjaman(String userID) {
        initComponents();
        
        conn = Koneksi.getConnection();
        this.userID = userID;
        setTabelModel();
        setTabelModelSementara();
        loadData();
        loadDataSementara();
        paginationPeminjaman();
        actionButton();
        pnDetail.setVisible(false);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_last = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        cbx_data = new javax.swing.JComboBox<>();
        btn_before = new javax.swing.JButton();
        btn_first = new javax.swing.JButton();
        lb_halaman = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new Palette.Custom_ButtonRounded();
        btnCancel = new Palette.Custom_ButtonRounded();
        txtSearch = new Palette.Custom_JTextFieldRounded();
        pnDetail = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblData2 = new Palette.Custom_JTabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelAdd = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSave = new Palette.Custom_ButtonRounded();
        btnCancel2 = new Palette.Custom_ButtonRounded();
        lbGambar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSementara = new Palette.Custom_JTabel();
        custom_JPanelRounded1 = new Palette.Custom_JPanelRounded();
        txtID = new Palette.Custom_JTextFieldRounded();
        jLabel9 = new javax.swing.JLabel();
        txtTglPinjam = new Palette.Custom_JTextFieldRounded();
        jLabel15 = new javax.swing.JLabel();
        txtTglKembali = new Palette.Custom_JTextFieldRounded();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtIdBuku = new Palette.Custom_JTextFieldRounded();
        btnSetBuku = new javax.swing.JButton();
        txtJudul = new Palette.Custom_JTextFieldRounded();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtPengarang = new Palette.Custom_JTextFieldRounded();
        jLabel19 = new javax.swing.JLabel();
        txtPenerbit = new Palette.Custom_JTextFieldRounded();
        txtTelepon = new Palette.Custom_JTextFieldRounded();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtEmail = new Palette.Custom_JTextFieldRounded();
        txtNama = new Palette.Custom_JTextFieldRounded();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtIdAnggota = new Palette.Custom_JTextFieldRounded();
        btnSetAnggota = new javax.swing.JButton();
        txtJumlah = new Palette.Custom_JTextFieldRounded();
        jLabel24 = new javax.swing.JLabel();
        btnDelete = new Palette.Custom_ButtonRounded();
        btnEdit = new Palette.Custom_ButtonRounded();
        jLabel25 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        dateChooser1.setTextRefernce(txtTglPinjam);

        dateChooser2.setTextRefernce(txtTglKembali);

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

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Transaksi > Peminjaman");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_tv_30px.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        btn_last.setText("Last Page");

        btn_next.setText(">");

        cbx_data.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14", "28", "54", "108" }));

        btn_before.setText("<");

        btn_first.setText("First Page");

        lb_halaman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_halaman.setText("Halaman of Total Halaman");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_halaman, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_first)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_before)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_next)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_last)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_halaman, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_first, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_before, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_last, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_book_30px.png"))); // NOI18N

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_add_30px.png"))); // NOI18N
        btnAdd.setText("TAMBAH");
        btnAdd.setFillClick(new java.awt.Color(0, 51, 102));
        btnAdd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_rollback_30px.png"))); // NOI18N
        btnCancel.setText("BATAL");
        btnCancel.setFillClick(new java.awt.Color(153, 51, 0));
        btnCancel.setFillOriginal(new java.awt.Color(255, 102, 0));
        btnCancel.setFillOver(new java.awt.Color(204, 102, 0));
        btnCancel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        txtSearch.setForeground(new java.awt.Color(102, 102, 102));
        txtSearch.setText("Search");
        txtSearch.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        pnDetail.setBackground(new java.awt.Color(250, 250, 250));

        tblData2.setForeground(new java.awt.Color(255, 51, 51));
        tblData2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(tblData2);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Detail Peminjaman Buku Perpustakaan");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_book_30px.png"))); // NOI18N

        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("X");

        javax.swing.GroupLayout pnDetailLayout = new javax.swing.GroupLayout(pnDetail);
        pnDetail.setLayout(pnDetailLayout);
        pnDetailLayout.setHorizontalGroup(
            pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnDetailLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnDetailLayout.setVerticalGroup(
            pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jButton1))
                .addContainerGap(265, Short.MAX_VALUE))
            .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnDetailLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelViewLayout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_book_30px.png"))); // NOI18N

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_save_30px.png"))); // NOI18N
        btnSave.setText("SIMPAN");
        btnSave.setFillClick(new java.awt.Color(0, 51, 102));
        btnSave.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        btnCancel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_rollback_30px.png"))); // NOI18N
        btnCancel2.setText("BATAL");
        btnCancel2.setFillClick(new java.awt.Color(153, 51, 0));
        btnCancel2.setFillOriginal(new java.awt.Color(255, 102, 0));
        btnCancel2.setFillOver(new java.awt.Color(204, 102, 0));
        btnCancel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        lbGambar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbGambar.setForeground(new java.awt.Color(102, 102, 102));
        lbGambar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_book_100px.png"))); // NOI18N
        lbGambar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tblSementara.setForeground(new java.awt.Color(255, 51, 51));
        tblSementara.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(tblSementara);

        custom_JPanelRounded1.setBackground(new java.awt.Color(250, 250, 250));
        custom_JPanelRounded1.setRoundBottomLeft(20);
        custom_JPanelRounded1.setRoundBottomRight(20);
        custom_JPanelRounded1.setRoundTopLeft(20);
        custom_JPanelRounded1.setRoundTopRight(20);

        txtID.setForeground(new java.awt.Color(102, 102, 102));
        txtID.setText("ID");
        txtID.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("ID");

        txtTglPinjam.setForeground(new java.awt.Color(102, 102, 102));
        txtTglPinjam.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Tanggal Pinjam");

        txtTglKembali.setForeground(new java.awt.Color(102, 102, 102));
        txtTglKembali.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Tanggal Kembali");

        javax.swing.GroupLayout custom_JPanelRounded1Layout = new javax.swing.GroupLayout(custom_JPanelRounded1);
        custom_JPanelRounded1.setLayout(custom_JPanelRounded1Layout);
        custom_JPanelRounded1Layout.setHorizontalGroup(
            custom_JPanelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custom_JPanelRounded1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        custom_JPanelRounded1Layout.setVerticalGroup(
            custom_JPanelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custom_JPanelRounded1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(custom_JPanelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Buku");

        txtIdBuku.setForeground(new java.awt.Color(102, 102, 102));
        txtIdBuku.setText("ID");
        txtIdBuku.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        btnSetBuku.setText("...");

        txtJudul.setForeground(new java.awt.Color(102, 102, 102));
        txtJudul.setText("Judul");
        txtJudul.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Judul");

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Pengarang");

        txtPengarang.setForeground(new java.awt.Color(102, 102, 102));
        txtPengarang.setText("Pengarang");
        txtPengarang.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Penerbit");

        txtPenerbit.setForeground(new java.awt.Color(102, 102, 102));
        txtPenerbit.setText("Penerbit");
        txtPenerbit.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        txtTelepon.setForeground(new java.awt.Color(102, 102, 102));
        txtTelepon.setText("Telepon");
        txtTelepon.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Telepon");

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Email");

        txtEmail.setForeground(new java.awt.Color(102, 102, 102));
        txtEmail.setText("Email");
        txtEmail.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        txtNama.setForeground(new java.awt.Color(102, 102, 102));
        txtNama.setText("Nama");
        txtNama.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Nama");

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Anggota");

        txtIdAnggota.setForeground(new java.awt.Color(102, 102, 102));
        txtIdAnggota.setText("ID");
        txtIdAnggota.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        btnSetAnggota.setText("...");

        txtJumlah.setForeground(new java.awt.Color(102, 102, 102));
        txtJumlah.setText("Jumlah");
        txtJumlah.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Jumlah");

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_cancel_30px.png"))); // NOI18N
        btnDelete.setText("HAPUS");
        btnDelete.setFillClick(new java.awt.Color(153, 0, 51));
        btnDelete.setFillOriginal(new java.awt.Color(255, 0, 51));
        btnDelete.setFillOver(new java.awt.Color(204, 0, 51));
        btnDelete.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_add_30px.png"))); // NOI18N
        btnEdit.setText("UBAH");
        btnEdit.setFillClick(new java.awt.Color(0, 51, 102));
        btnEdit.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Total Pinjam");

        lblTotal.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(102, 102, 102));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotal.setText("Total");

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelAddLayout.createSequentialGroup()
                                                .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSetAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtTelepon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                                        .addComponent(txtIdBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSetBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(lbGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(custom_JPanelRounded1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addGap(20, 20, 20))))
            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAddLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
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
                    .addComponent(btnCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(custom_JPanelRounded1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSetAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSetBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbGambar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(323, Short.MAX_VALUE))
            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAddLayout.createSequentialGroup()
                    .addGap(489, 489, 489)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Custom_ButtonRounded btnAdd;
    private Palette.Custom_ButtonRounded btnCancel;
    private Palette.Custom_ButtonRounded btnCancel2;
    private Palette.Custom_ButtonRounded btnDelete;
    private Palette.Custom_ButtonRounded btnEdit;
    private Palette.Custom_ButtonRounded btnSave;
    private javax.swing.JButton btnSetAnggota;
    private javax.swing.JButton btnSetBuku;
    private javax.swing.JButton btn_before;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JComboBox<String> cbx_data;
    private Palette.Custom_JPanelRounded custom_JPanelRounded1;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel lb_halaman;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.JPanel pnDetail;
    private Palette.Custom_JTabel tblData;
    private Palette.Custom_JTabel tblData2;
    private Palette.Custom_JTabel tblSementara;
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
    private Palette.Custom_JTextFieldRounded txtTelepon;
    private Palette.Custom_JTextFieldRounded txtTglKembali;
    private Palette.Custom_JTextFieldRounded txtTglPinjam;
    // End of variables declaration//GEN-END:variables

    
    // Button Halaman 
    private void paginationPeminjaman() {
        btn_first.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                halamanSaatIni = 1;
                loadData();
            }
            
        });
        
        btn_before.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (halamanSaatIni > 1)
                {
                    halamanSaatIni--;
                    loadData();
                }
            }
            
        });
        
        cbx_data.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dataPerHalaman = Integer.parseInt(cbx_data.getSelectedItem().toString());
                halamanSaatIni = 1;
                loadData();
            }
            
        });
        
        btn_next.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (halamanSaatIni < totalPages) {
                    halamanSaatIni++;
                    loadData();
                }
            }
            
        });
        
        btn_last.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                halamanSaatIni = totalPages;
                loadData();
            }
            
        });
    }
    
    // Button Halaman 
    
    // Button Add, Save, Delete, Cancel, Search, TableMouseClick
    private void actionButton(){
        btnAdd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                panelMain.removeAll();
                panelMain.add(panelAdd);
                panelMain.repaint();
                panelMain.revalidate();

                txtID.setText(setIDPeminjaman());
                txtID.setEnabled(false);
                
                if(btnAdd.getText().equals("UBAH")){
                    dataTabel();
                    btnSave.setText("PERBARUI");
                }
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
        
        btnDelete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteData();
            }
        });
        
        btnCancel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                showPanel();
                loadData();
            }
        });
        
        btnCancel2.addActionListener(new ActionListener(){
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
                if(btnAdd.getText().equals("TAMBAH")){
                    btnAdd.setText("UBAH");
                    btnDelete.setVisible(true);
                    btnCancel.setVisible(true);
                }
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
                insertDataSementara();
            }
        });
        
    }
    // Button Add, Save, Delete, Cancel, Search, TableMouseClick
    
    // Fungsi lainnya
    private int getTotalData(){
        int totalData = 0;
        
        try {
            String sql = "SELECT COUNT(*) AS total FROM peminjaman";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    totalData = rs.getInt("total");
                }
            } 
        } catch (Exception e) {
            Logger.getLogger(TransaksiPeminjaman.class.getName()).log(Level.SEVERE,null,e);
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
        lb_halaman.setText(String.valueOf("Halaman "+ halamanSaatIni + " dari Total Data " + totalData));
        int startIndex = (halamanSaatIni - 1) * dataPerHalaman;
        getData(startIndex, dataPerHalaman,(DefaultTableModel) tblData.getModel());
        btnDelete.setVisible(false);
        btnCancel.setVisible(false);
    }
    
    private void loadDataSementara(){
        getDataSementara((DefaultTableModel) tblSementara.getModel());
    }
    
    private void showPanel(){
        panelMain.removeAll();
        String userID = null;
        panelMain.add(new TransaksiPeminjaman(userID));
        panelMain.repaint();
        panelMain.revalidate();
    }
    
    private void resetForm() {
        txtID.setText("");
        txtJudul.setText("");
        txtPengarang.setText("");
    }
    
    private void resetFormBuku() {
        txtIdBuku.setText("ID");
        txtJudul.setText("Judul");
        txtPengarang.setText("Pengarang");
        txtPenerbit.setText("Penerbit");
        lbGambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_book_100px.png")));
        txtJumlah.setText("Jumlah");
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
            Logger.getLogger(TransaksiPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setTabelModelSementara() {
        DefaultTableModel model = (DefaultTableModel) tblSementara.getModel();
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
            Logger.getLogger(TransaksiPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private String setIDPeminjaman(){
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
            java.util.logging.Logger.getLogger(TransaksiPeminjaman.class.getName()).log(Level.SEVERE, null, e);
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
    
    private void insertDataSementara() {
        String idBuku       = txtIdBuku.getText();
        String judulBuku    = txtJudul.getText();
        String pengarangBuku = txtPengarang.getText();
        String penerbitBuku = txtPenerbit.getText();
        String jumlahPinjam = txtJumlah.getText();
        String statusPinjam = "Sedang dipinjam";
        
        if(idBuku.isEmpty() || judulBuku.isEmpty() || pengarangBuku.isEmpty() || penerbitBuku.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO sementara (ID_Buku, Judul_Buku, Pengarang_Buku, Penerbit_Buku, Jumlah_Pinjam, Status_Pinjam) VALUES (?,?,?,?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idBuku);
                st.setString(2, judulBuku);
                st.setString(3, pengarangBuku);
                st.setString(4, penerbitBuku);
                st.setString(5, jumlahPinjam);
                st.setString(6, statusPinjam);
                
                st.executeUpdate();
                
                int totalPinjam = getTotalPinjam();
                lblTotal.setText(String.valueOf(totalPinjam));
                loadDataSementara();
                
                if(JOptionPane.showConfirmDialog(this, "Mau Tambah Barang?",
                        "Konfirmasi",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                    resetFormBuku();
                    btnSetBuku.requestFocus();
                }else{
                    resetFormBuku();
                    btnSave.requestFocus();
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(TransaksiPeminjaman.class.getName()).log(Level.SEVERE,null,e);
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
            Logger.getLogger(TransaksiPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }

        return totalPinjam;
    }

    private void insertData() {
        String idPeminjaman     = txtID.getText();
        String tglPinjam        = txtTglPinjam.getText();
        String tglKembali       = txtTglKembali.getText();
        String totalPinjam      = lblTotal.getText();
        String statusPinjam     = "Sedang dipinjam";
        String idAnggota        = txtIdAnggota.getText();
        
        if(idPeminjaman.isEmpty() || tglPinjam.isEmpty() || tglKembali.isEmpty() || totalPinjam.isEmpty() || statusPinjam.isEmpty() || idAnggota.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO peminjaman (ID_Peminjaman, Tanggal_Peminjaman, Tanggal_Pengembalian, Total_Pinjam,Status_Peminjaman, ID_Anggota, ID_User) VALUES (?,?,?,?,?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idPeminjaman);
                st.setString(2, tglPinjam);
                st.setString(3, tglKembali);
                st.setString(4, totalPinjam);
                st.setString(5, statusPinjam);
                st.setString(6, idAnggota);
                st.setString(7, userID);
                
                int rowInserted = st.executeUpdate();
                if(rowInserted > 0){
                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(TransaksiPeminjaman.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    private void insertDataDetail() {
        String idPeminjaman     = txtID.getText();
        try {
            String sql = "INSERT INTO detail_peminjaman (ID_Peminjaman, ID_Buku, Jumlah_Pinjam, Status_Pengembalian) SELECT '"+idPeminjaman+"',ID_Buku, Jumlah_Pinjam, Status_Pinjam from sementara";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.executeUpdate();
            }
        } catch (SQLException e) {
            Logger.getLogger(TransaksiPeminjaman.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    private void dataTabel() {
        panelView.setVisible(false);
        panelAdd.setVisible(true);
        
        int row = tblData.getSelectedRow();
        jLabel5.setText("Perbarui Data Peminjaman Perpustakaan");
        
        txtID.setEnabled(false);
        String id = tblData.getModel().getValueAt(row, 0).toString();
        
        txtID.setText(tblData.getValueAt(row, 0).toString());
        txtJudul.setText(tblData.getValueAt(row, 1).toString());
        txtPengarang.setText(tblData.getValueAt(row, 2).toString());
        txtPengarang.setText(tblData.getValueAt(row,3).toString());
        
        setImage(lbGambar, id);
        
    }
    
    
    
    private void updateData() {
        String idPeminjaman = txtID.getText();
        String judulPeminjaman = txtJudul.getText();
        String pengarangPeminjaman = txtPengarang.getText();
        String tahunTerbit = txtPengarang.getText();
        String imagePath = txtPengarang.getText();
        
        if(idPeminjaman.isEmpty() || judulPeminjaman.isEmpty() || 
                pengarangPeminjaman.isEmpty() || tahunTerbit.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus dipilih dan diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "UPDATE Peminjaman SET Judul_Peminjaman=?, Pengarang_Peminjaman=?,Tahun_Terbit=?, ID_Kategori=?,ID_Penerbit=? ";
                    if(!imagePath.equals("Image Path")){
                        sql += ",Gambar=?";
                    }
                    sql += "WHERE ID_Peminjaman=?";
                    
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, judulPeminjaman);
                st.setString(2, pengarangPeminjaman);
                st.setString(3, tahunTerbit);
                
                if(!imagePath.equals("Image Path")){
                    File imageFile = new File(imagePath);
                    FileInputStream fis = new FileInputStream(imageFile);
                    st.setBinaryStream(6, fis, (int) imageFile.length());
                    st.setString(7, idPeminjaman);
                }else{
                    st.setString(6, idPeminjaman);
                }
                
                int rowUpdated = st.executeUpdate();
                if(rowUpdated > 0){
                    JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TransaksiPeminjaman.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException e) {
            Logger.getLogger(TransaksiPeminjaman.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    private void deleteData() {
        int selectedRow = tblData.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, 
                "Apakah yakin ingin menghapus data ini ?",
                "Konfirmasi Hapus Data", 
                JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION){
            String id = tblData.getValueAt(selectedRow, 0).toString();
            try {
                String sql =  "DELETE FROM Peminjaman WHERE ID_Peminjaman=?";
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
                Logger.getLogger(TransaksiPeminjaman.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        resetForm();
        loadData();
        showPanel();
    }
    
    private void deleteDataSementara() {
        try {
                String sql =  "DELETE FROM sementara";
                try(PreparedStatement st = conn.prepareStatement(sql)){
                    st.executeUpdate();
                }
            } catch (SQLException e) {
                Logger.getLogger(TransaksiPeminjaman.class.getName()).log(Level.SEVERE,null,e);
            }    
    }

    private void searchData() {
        String kataKunci = txtSearch.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "SELECT bk.ID_Peminjaman, bk.Judul_Peminjaman, bk.Pengarang_Peminjaman, bk.Tahun_Terbit, ktg.ID_Kategori, "
                    + "ktg.Nama_Kategori, pnb.ID_Penerbit, pnb.Nama_Penerbit, bk.Gambar \n" +
                            "FROM Peminjaman bk \n" +
                            "INNER JOIN kategori ktg ON ktg.ID_Kategori = bk.ID_Kategori\n" +
                            "INNER JOIN penerbit pnb ON pnb.ID_Penerbit = bk.ID_Penerbit\n" +
                            "WHERE bk.Judul_Peminjaman LIKE ? OR bk.Pengarang_Peminjaman LIKE ?";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idPeminjaman       = rs.getString("ID_Peminjaman");
                    String judulPeminjaman    = rs.getString("Judul_Peminjaman");
                    String pengarangPeminjaman = rs.getString("Pengarang_Peminjaman");
                    String tahunTerbit  = rs.getString("Tahun_Terbit");
                    String idKategori   = rs.getString("ID_Kategori");
                    String namaKategori   = rs.getString("Nama_Kategori");
                    String idPenerbit   = rs.getString("ID_Penerbit");
                    String namaPenerbit   = rs.getString("Nama_Penerbit");
                    
                    byte[] imageData = rs.getBytes("Gambar");
                    ImageIcon imageIcon = new ImageIcon(imageData);

                    Object[] rowData = {idPeminjaman, judulPeminjaman, pengarangPeminjaman, tahunTerbit, idKategori,namaKategori, idPenerbit, namaPenerbit, imageIcon};
                    model.addRow(rowData);
                }
            } 
        } catch (SQLException e) {
            Logger.getLogger(TransaksiPeminjaman.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    
    
}
