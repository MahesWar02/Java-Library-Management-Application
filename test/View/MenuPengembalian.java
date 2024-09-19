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
import java.text.DecimalFormat;
import java.text.ParseException;
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

public class MenuPengembalian extends javax.swing.JPanel {

    private int halamanSaatIni = 1;
    private int dataPerHalaman = 14;
    private int totalPages;
    private final Connection conn;
    private String userID;
    
    public MenuPengembalian(String userID) {
        initComponents();
        
        conn = Koneksi.getConnection();
        this.userID = userID;
        setTabelModel();
        setTabelModelDetail();
        loadData();
        paginationBuku();
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
        custom_JPanelRounded1 = new Palette.Custom_JPanelRounded();
        jLabel9 = new javax.swing.JLabel();
        txtID = new Palette.Custom_JTextFieldRounded();
        txtTanggalAktual = new Palette.Custom_JTextFieldRounded();
        jLabel10 = new javax.swing.JLabel();
        custom_JPanelRounded3 = new Palette.Custom_JPanelRounded();
        jLabel24 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIdPeminjaman = new Palette.Custom_JTextFieldRounded();
        jLabel13 = new javax.swing.JLabel();
        txtPinjam = new Palette.Custom_JTextFieldRounded();
        btnSetPeminjaman = new javax.swing.JButton();
        txtPenerbit = new Palette.Custom_JTextFieldRounded();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtPengarang = new Palette.Custom_JTextFieldRounded();
        txtJudul = new Palette.Custom_JTextFieldRounded();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtIdBuku = new Palette.Custom_JTextFieldRounded();
        jLabel25 = new javax.swing.JLabel();
        txtIdAnggota = new Palette.Custom_JTextFieldRounded();
        txtTanggalKembali = new Palette.Custom_JTextFieldRounded();
        txtNamaAnggota = new Palette.Custom_JTextFieldRounded();
        jLabel27 = new javax.swing.JLabel();
        lbGambar = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtJumlahDenda = new Palette.Custom_JTextFieldRounded();
        jLabel28 = new javax.swing.JLabel();
        lbDenda = new javax.swing.JLabel();

        dateChooser1.setTextRefernce(txtTanggalAktual);

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
        jLabel1.setText("Data Pengembalian Buku Perpustakaan");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Transaksi > Pengembalian");

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

        txtSearch.setForeground(new java.awt.Color(102, 102, 102));
        txtSearch.setText("Search");
        txtSearch.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        pnDetail.setBackground(new java.awt.Color(250, 250, 250));

        tblDataDetail.setForeground(new java.awt.Color(255, 51, 51));
        tblDataDetail.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(tblDataDetail);

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Data Detail Pengembalian Buku Perpustakaan");

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
                .addContainerGap(541, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
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
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
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
        jLabel5.setText("Tambah Data Pengembalian Buku Perpustakaan");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Transaksi > Pengembalian");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_tv_30px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_book_30px.png"))); // NOI18N

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

        txtTanggalAktual.setForeground(new java.awt.Color(102, 102, 102));
        txtTanggalAktual.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Tanggal");

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
                .addComponent(txtTanggalAktual, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(434, 434, 434))
        );
        custom_JPanelRounded1Layout.setVerticalGroup(
            custom_JPanelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custom_JPanelRounded1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(custom_JPanelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(custom_JPanelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTanggalAktual, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(custom_JPanelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        custom_JPanelRounded3.setBackground(new java.awt.Color(250, 250, 250));
        custom_JPanelRounded3.setRoundBottomLeft(20);
        custom_JPanelRounded3.setRoundBottomRight(20);
        custom_JPanelRounded3.setRoundTopLeft(20);
        custom_JPanelRounded3.setRoundTopRight(20);

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Data Peminjaman Buku");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("ID");

        txtIdPeminjaman.setForeground(new java.awt.Color(102, 102, 102));
        txtIdPeminjaman.setText("ID");
        txtIdPeminjaman.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Tanggal Pinjam");

        txtPinjam.setForeground(new java.awt.Color(102, 102, 102));
        txtPinjam.setText("Tanggal");
        txtPinjam.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        btnSetPeminjaman.setText("...");

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

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Tanggal Kembali");

        txtIdAnggota.setForeground(new java.awt.Color(102, 102, 102));
        txtIdAnggota.setText("ID");
        txtIdAnggota.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        txtTanggalKembali.setForeground(new java.awt.Color(102, 102, 102));
        txtTanggalKembali.setText("Tanggal");
        txtTanggalKembali.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        txtNamaAnggota.setForeground(new java.awt.Color(102, 102, 102));
        txtNamaAnggota.setText("Nama");
        txtNamaAnggota.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Nama Anggota");

        lbGambar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbGambar.setForeground(new java.awt.Color(102, 102, 102));
        lbGambar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_book_100px.png"))); // NOI18N
        lbGambar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("ID");

        javax.swing.GroupLayout custom_JPanelRounded3Layout = new javax.swing.GroupLayout(custom_JPanelRounded3);
        custom_JPanelRounded3.setLayout(custom_JPanelRounded3Layout);
        custom_JPanelRounded3Layout.setHorizontalGroup(
            custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custom_JPanelRounded3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(custom_JPanelRounded3Layout.createSequentialGroup()
                        .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(custom_JPanelRounded3Layout.createSequentialGroup()
                                .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(25, 25, 25))
                            .addGroup(custom_JPanelRounded3Layout.createSequentialGroup()
                                .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(custom_JPanelRounded3Layout.createSequentialGroup()
                                .addComponent(txtIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(btnSetPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(lbGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(custom_JPanelRounded3Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txtNamaAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        custom_JPanelRounded3Layout.setVerticalGroup(
            custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custom_JPanelRounded3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(custom_JPanelRounded3Layout.createSequentialGroup()
                        .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSetPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(custom_JPanelRounded3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, custom_JPanelRounded3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(custom_JPanelRounded3Layout.createSequentialGroup()
                        .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIdBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPengarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPenerbit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(custom_JPanelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNamaAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        txtJumlahDenda.setForeground(new java.awt.Color(102, 102, 102));
        txtJumlahDenda.setText("Denda");
        txtJumlahDenda.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("Denda");

        lbDenda.setFont(new java.awt.Font("SansSerif", 2, 10)); // NOI18N
        lbDenda.setForeground(new java.awt.Color(102, 102, 102));
        lbDenda.setText("Denda");

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(custom_JPanelRounded3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAddLayout.createSequentialGroup()
                                .addGap(165, 746, Short.MAX_VALUE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDenda)
                                    .addComponent(txtJumlahDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAddLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(custom_JPanelRounded1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
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
                .addGap(18, 18, 18)
                .addComponent(custom_JPanelRounded3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJumlahDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDenda)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Custom_ButtonRounded btnAdd;
    private Palette.Custom_ButtonRounded btnCancelAdd;
    private javax.swing.JButton btnCloseDetail;
    private Palette.Custom_ButtonRounded btnSave;
    private javax.swing.JButton btnSetPeminjaman;
    private javax.swing.JButton btn_before;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JComboBox<String> cbx_data;
    private Palette.Custom_JPanelRounded custom_JPanelRounded1;
    private Palette.Custom_JPanelRounded custom_JPanelRounded3;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbDenda;
    private javax.swing.JLabel lbGambar;
    private javax.swing.JLabel lb_halaman;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.JPanel pnDetail;
    private Palette.Custom_JTabel tblData;
    private Palette.Custom_JTabel tblDataDetail;
    private Palette.Custom_JTextFieldRounded txtID;
    private Palette.Custom_JTextFieldRounded txtIdAnggota;
    private Palette.Custom_JTextFieldRounded txtIdBuku;
    private Palette.Custom_JTextFieldRounded txtIdPeminjaman;
    private Palette.Custom_JTextFieldRounded txtJudul;
    private Palette.Custom_JTextFieldRounded txtJumlahDenda;
    private Palette.Custom_JTextFieldRounded txtNamaAnggota;
    private Palette.Custom_JTextFieldRounded txtPenerbit;
    private Palette.Custom_JTextFieldRounded txtPengarang;
    private Palette.Custom_JTextFieldRounded txtPinjam;
    private Palette.Custom_JTextFieldRounded txtSearch;
    private Palette.Custom_JTextFieldRounded txtTanggalAktual;
    private Palette.Custom_JTextFieldRounded txtTanggalKembali;
    // End of variables declaration//GEN-END:variables

    
    // Button Halaman 
    private void paginationBuku() {
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

                txtID.setText(setIdPengembalian());
                
                //btnUbah.setText("TAMBAH");
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
                        updateStatus();
                        resetForm();
                        loadData();
                        showPanel();
                    }
                else if (btnSave.getText().equals("PERBARUI"))
                    {
//                        updateData();
                        resetForm();
                        loadData();
                        showPanel();
                    }
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
        
        btnSetPeminjaman.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                getPeminjaman();
                hitungDenda();
            }
        });
    }
    // Button Add, Save, Delete, Cancel, Search, TableMouseClick
    
    // Fungsi lainnya
    private int getTotalData(){
        int totalData = 0;
        
        try {
            String sql = "SELECT COUNT(*) AS total FROM pengembalian";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    totalData = rs.getInt("total");
                }
            } 
        } catch (Exception e) {
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE,null,e);
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
        //btnDelete.setVisible(false);
        pnDetail.setVisible(false);
        lbDenda.setVisible(false);
    }
    
    private void showPanel(){
        panelMain.removeAll();
        panelMain.add(new MenuPengembalian(userID));
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
        lbGambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_book_100px.png")));
    }
    
    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.addColumn("ID Pengembalian");
        model.addColumn("Tanggal Kembali");
        model.addColumn("ID Peminjaman");
        model.addColumn("Petugas");
    }

    public void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sql ="SELECT *\n" +
                        "FROM pengembalian png\n" +
                        "INNER JOIN peminjaman pmj ON pmj.ID_Peminjaman = png.ID_Peminjaman\n" +
                        "INNER JOIN USER usr ON usr.ID_User = png.ID_User LIMIT ?,?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setInt(1, startIndex);
                st.setInt(2, entriesPage);
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idPengembalian   = rs.getString("ID_Pengembalian");
                    String tanggalKembali   = rs.getString("Tanggal_Pengembalian");
                    String idPeminjaman     = rs.getString("ID_Peminjaman");
                    String idUser           = rs.getString("Nama_User");
                    
                    Object[] rowData = {idPengembalian, tanggalKembali, idPeminjaman, idUser};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setTabelModelDetail() {
        DefaultTableModel model = (DefaultTableModel) tblDataDetail.getModel();
        model.addColumn("ID Pengembalian");
        model.addColumn("ID Buku");
        model.addColumn("Judul");
        model.addColumn("Jumlah Denda");
    }
    
    public void getDataDetail(DefaultTableModel model, String id) {
        model.setRowCount(0);

        try {
            String sql = "SELECT pmd.ID_Pengembalian, bk.ID_Buku, bk.Judul_Buku, pmd.Jumlah_Denda\n" +
                        "FROM detail_Pengembalian pmd\n" +
                        "INNER JOIN buku bk ON bk.ID_Buku = pmd.ID_Buku\n" +
                        "WHERE pmd.ID_Pengembalian = '"+id+"'"+
                        "ORDER BY pmd.ID_Pengembalian ASC";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();

                DecimalFormat decimalFormat = new DecimalFormat("#");
                
                while (rs.next()) {
                    String idPengembalian   = rs.getString("ID_Pengembalian");
                    String idBuku           = rs.getString("ID_Buku");
                    String judulBuku        = rs.getString("Judul_Buku");
                    double jumlahDenda     = rs.getDouble("Jumlah_Denda");
                    
                    // Mengganti 0.0 dengan "0" atau menghilangkan desimal 0 di bagian belakang angka
                    String formattedDenda = (jumlahDenda == 0.0) ? "0" : decimalFormat.format(jumlahDenda);


                    Object[] rowData = {idPengembalian, idBuku, judulBuku, formattedDenda};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private String setIdPengembalian(){
        String urutan = null;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);
        
        String sql = "SELECT RIGHT(ID_Pengembalian, 4) AS Nomor " +
                     "FROM pengembalian " +
                     "WHERE ID_Pengembalian LIKE 'PN" + no + "%' " +
                     "ORDER BY ID_Pengembalian DESC " +
                     "LIMIT 1";
        
        try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                
            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                urutan = "PN" + no + String.format("%04d", nomor);
            }else{
                urutan = "PN" + no + "0001";
            }
            
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return urutan;
    }
    
    private void getPeminjaman(){
        boolean closable = true;
        DataPeminjaman pmj = new DataPeminjaman(null, closable);
        pmj.setVisible(true);
        
        String id = pmj.getIdBuku();
        
        txtIdPeminjaman.setText(pmj.getIdPeminjaman());
        txtPinjam.setText(pmj.getTanggalPinjam());
        txtTanggalKembali.setText(pmj.getTanggalKembali());
        txtIdAnggota.setText(pmj.getIdAnggota());
        txtNamaAnggota.setText(pmj.getNamaAnggota());
        txtIdBuku.setText(pmj.getIdBuku());
        txtJudul.setText(pmj.getJudulBuku());
        txtPengarang.setText(pmj.getPengarangBuku());
        txtPenerbit.setText(pmj.getPenerbitBuku());
        
        setImage(lbGambar, id);
        
        txtIdBuku.setEnabled(false);
        txtJudul.setEnabled(false);
        txtPengarang.setEnabled(false);
        txtPenerbit.setEnabled(false);
    }
    
    private void hitungDenda() {
        int dendaPerhari = 500;
        String tanggalKembaliStr = txtTanggalAktual.getText();
        String tanggalKembaliAktualStr = txtTanggalKembali.getText();

        try {
            // Mengonversi string ke objek Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date tanggalKembali = dateFormat.parse(tanggalKembaliAktualStr);
            Date tanggalKembaliAktual = dateFormat.parse(tanggalKembaliStr);
            
            // Menghitung selisih hari
            long selisihHari = (tanggalKembaliAktual.getTime() - tanggalKembali.getTime()) / (24 * 60 * 60 * 1000);

            // Menghitung denda
            int denda = (int) (selisihHari * dendaPerhari);

            // Menampilkan denda di TextField
            txtJumlahDenda.setText(Integer.toString(denda));

            // Menampilkan denda di Label
            if (denda > 0) {
                lbDenda.setVisible(true);
                lbDenda.setText("Telat: " + selisihHari + " hari");
            } else {
                lbDenda.setText("Tidak ada denda");
            }
        } catch (ParseException e) {
            e.printStackTrace(); 
        }
    }
    
    private void insertData() {
        String idPengembalian   = txtID.getText();
        String tglAktual        = txtTanggalAktual.getText();
        String idPeminjaman     = txtIdPeminjaman.getText();
        
        try {
            String sql = "INSERT INTO pengembalian (ID_Pengembalian, Tanggal_Pengembalian, ID_Peminjaman, ID_User) VALUES (?,?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idPengembalian);
                st.setString(2, tglAktual);
                st.setString(3, idPeminjaman);
                st.setString(4, userID);
                
                int rowInserted = st.executeUpdate();
                if(rowInserted > 0){
                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    private void insertDataDetail() {
        String idPengembalian   = txtID.getText();
        String idBuku           = txtIdBuku.getText();
        String jumlahDenda      = txtJumlahDenda.getText();
        
        try {
            String sql = "INSERT INTO detail_Pengembalian (ID_Pengembalian, ID_Buku, Jumlah_Denda) VALUES (?,?,?)";                              
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idPengembalian);
                st.setString(2, idBuku);
                st.setString(3, jumlahDenda);
                st.executeUpdate();
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    private void updateStatus() {
        String statusPeminjaman = "Sudah dikembalikan";
        String idPeminjaman     = txtIdPeminjaman.getText();
        String idBuku           = txtIdBuku.getText();
        
        try {
            String sql = "UPDATE detail_peminjaman SET Status_Peminjaman=? WHERE ID_Peminjaman=? AND ID_Buku=?";
                    
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, statusPeminjaman);
                st.setString(2, idPeminjaman);
                st.setString(3, idBuku);
                
                st.executeUpdate();
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE,null,e);
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
    
    private void searchData() {
        String kataKunci = txtSearch.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "SELECT *\n" +
                        "FROM pengembalian png\n" +
                        "INNER JOIN peminjaman pmj ON pmj.ID_Peminjaman = png.ID_Peminjaman\n" +
                        "INNER JOIN USER usr ON usr.ID_User = png.ID_User\n" +
                        "WHERE png.ID_Pengembalian LIKE ? OR pmj.ID_Peminjaman LIKE ?";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idPengembalian   = rs.getString("ID_Pengembalian");
                    String tanggalKembali   = rs.getString("Tanggal_Pengembalian");
                    String idPeminjaman     = rs.getString("ID_Peminjaman");
                    String idUser           = rs.getString("Nama_User");
                    
                    Object[] rowData = {idPengembalian, tanggalKembali, idPeminjaman, idUser};
                    model.addRow(rowData);
                }
            } 
        } catch (SQLException e) {
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    
    
}
