package Main;

import View.MenuAnggota;
import View.MenuBuku;
import View.MenuPeminjaman;
import View.MenuPetugas;
import View.MenuDashboard;
import View.MenuKategori;
import View.MenuPenerbit;
import View.MenuPengembalian;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuUtama extends javax.swing.JFrame {

    int xx, xy;
    private String userID;

    public MenuUtama(String userID) {
        initComponents();
        this.userID = userID;
        actionButton();
    }
    
    public String getUserID() {
        return userID;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pn_kiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuMaster = new javax.swing.JPanel();
        pn_btnDashboard = new javax.swing.JPanel();
        pn_line = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_dashboard = new javax.swing.JLabel();
        pn_btnAnggota = new javax.swing.JPanel();
        pn_line1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_anggota = new javax.swing.JLabel();
        pn_btnBuku = new javax.swing.JPanel();
        pn_line2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnBuku = new javax.swing.JLabel();
        btnPeminjaman = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnPengembalian = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        menuTransaksi = new javax.swing.JPanel();
        pn_btnPeminjaman = new javax.swing.JPanel();
        pn_line4 = new javax.swing.JPanel();
        pn_btnPengembalian = new javax.swing.JPanel();
        pn_line5 = new javax.swing.JPanel();
        menuLaporan = new javax.swing.JPanel();
        pn_kanan = new javax.swing.JPanel();
        jPanelGradient2 = new jpanelgradient.JPanelGradient();
        pn_dasar = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        pn_kiri.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 167, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PerpusKita");

        menuMaster.setBackground(new java.awt.Color(255, 255, 255));

        pn_btnDashboard.setBackground(new java.awt.Color(255, 255, 255));

        pn_line.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_lineLayout = new javax.swing.GroupLayout(pn_line);
        pn_line.setLayout(pn_lineLayout);
        pn_lineLayout.setHorizontalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_lineLayout.setVerticalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home.png"))); // NOI18N

        btn_dashboard.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_dashboard.setForeground(new java.awt.Color(102, 102, 102));
        btn_dashboard.setText("Home");

        javax.swing.GroupLayout pn_btnDashboardLayout = new javax.swing.GroupLayout(pn_btnDashboard);
        pn_btnDashboard.setLayout(pn_btnDashboardLayout);
        pn_btnDashboardLayout.setHorizontalGroup(
            pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnDashboardLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnDashboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(234, Short.MAX_VALUE)))
        );
        pn_btnDashboardLayout.setVerticalGroup(
            pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnDashboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnAnggota.setBackground(new java.awt.Color(255, 255, 255));

        pn_line1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line1Layout = new javax.swing.GroupLayout(pn_line1);
        pn_line1.setLayout(pn_line1Layout);
        pn_line1Layout.setHorizontalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line1Layout.setVerticalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/anggota-hitam.png"))); // NOI18N

        btn_anggota.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_anggota.setForeground(new java.awt.Color(102, 102, 102));
        btn_anggota.setText("Anggota");

        javax.swing.GroupLayout pn_btnAnggotaLayout = new javax.swing.GroupLayout(pn_btnAnggota);
        pn_btnAnggota.setLayout(pn_btnAnggotaLayout);
        pn_btnAnggotaLayout.setHorizontalGroup(
            pn_btnAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnAnggotaLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(btn_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pn_btnAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnAnggotaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(234, Short.MAX_VALUE)))
        );
        pn_btnAnggotaLayout.setVerticalGroup(
            pn_btnAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnAnggotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(pn_btnAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnAnggotaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnBuku.setBackground(new java.awt.Color(255, 255, 255));

        pn_line2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line2Layout = new javax.swing.GroupLayout(pn_line2);
        pn_line2.setLayout(pn_line2Layout);
        pn_line2Layout.setHorizontalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line2Layout.setVerticalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/buku-hitam.png"))); // NOI18N

        btnBuku.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBuku.setForeground(new java.awt.Color(102, 102, 102));
        btnBuku.setText("Buku");

        javax.swing.GroupLayout pn_btnBukuLayout = new javax.swing.GroupLayout(pn_btnBuku);
        pn_btnBuku.setLayout(pn_btnBukuLayout);
        pn_btnBukuLayout.setHorizontalGroup(
            pn_btnBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnBukuLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(btnBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pn_btnBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnBukuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(234, Short.MAX_VALUE)))
        );
        pn_btnBukuLayout.setVerticalGroup(
            pn_btnBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnBukuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(pn_btnBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnBukuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnPeminjaman.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPeminjaman.setForeground(new java.awt.Color(102, 102, 102));
        btnPeminjaman.setText("Peminjaman");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/peminjaman-hitam.png"))); // NOI18N

        btnPengembalian.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPengembalian.setForeground(new java.awt.Color(102, 102, 102));
        btnPengembalian.setText("Pengembalian");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pengembalian-hitam.png"))); // NOI18N

        javax.swing.GroupLayout menuMasterLayout = new javax.swing.GroupLayout(menuMaster);
        menuMaster.setLayout(menuMasterLayout);
        menuMasterLayout.setHorizontalGroup(
            menuMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuMasterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuMasterLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(btnPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuMasterLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(btnPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(menuMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuMasterLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(menuMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pn_btnDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(menuMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pn_btnAnggota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_btnBuku, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        menuMasterLayout.setVerticalGroup(
            menuMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuMasterLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(menuMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menuMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
            .addGroup(menuMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuMasterLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(pn_btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pn_btnAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pn_btnBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(165, Short.MAX_VALUE)))
        );

        menuTransaksi.setBackground(new java.awt.Color(255, 255, 255));

        pn_btnPeminjaman.setBackground(new java.awt.Color(255, 255, 255));

        pn_line4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line4Layout = new javax.swing.GroupLayout(pn_line4);
        pn_line4.setLayout(pn_line4Layout);
        pn_line4Layout.setHorizontalGroup(
            pn_line4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line4Layout.setVerticalGroup(
            pn_line4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_btnPeminjamanLayout = new javax.swing.GroupLayout(pn_btnPeminjaman);
        pn_btnPeminjaman.setLayout(pn_btnPeminjamanLayout);
        pn_btnPeminjamanLayout.setHorizontalGroup(
            pn_btnPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPeminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_line4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );
        pn_btnPeminjamanLayout.setVerticalGroup(
            pn_btnPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPeminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_line4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_btnPengembalian.setBackground(new java.awt.Color(255, 255, 255));

        pn_line5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line5Layout = new javax.swing.GroupLayout(pn_line5);
        pn_line5.setLayout(pn_line5Layout);
        pn_line5Layout.setHorizontalGroup(
            pn_line5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line5Layout.setVerticalGroup(
            pn_line5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_btnPengembalianLayout = new javax.swing.GroupLayout(pn_btnPengembalian);
        pn_btnPengembalian.setLayout(pn_btnPengembalianLayout);
        pn_btnPengembalianLayout.setHorizontalGroup(
            pn_btnPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPengembalianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_line5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );
        pn_btnPengembalianLayout.setVerticalGroup(
            pn_btnPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPengembalianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_line5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuTransaksiLayout = new javax.swing.GroupLayout(menuTransaksi);
        menuTransaksi.setLayout(menuTransaksiLayout);
        menuTransaksiLayout.setHorizontalGroup(
            menuTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
            .addGroup(menuTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuTransaksiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(menuTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pn_btnPeminjaman, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pn_btnPengembalian, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        menuTransaksiLayout.setVerticalGroup(
            menuTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
            .addGroup(menuTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuTransaksiLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(pn_btnPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pn_btnPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        menuLaporan.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout menuLaporanLayout = new javax.swing.GroupLayout(menuLaporan);
        menuLaporan.setLayout(menuLaporanLayout);
        menuLaporanLayout.setHorizontalGroup(
            menuLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );
        menuLaporanLayout.setVerticalGroup(
            menuLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_kiriLayout = new javax.swing.GroupLayout(pn_kiri);
        pn_kiri.setLayout(pn_kiriLayout);
        pn_kiriLayout.setHorizontalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuMaster, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pn_kiriLayout.setVerticalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(menuMaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );

        getContentPane().add(pn_kiri, java.awt.BorderLayout.LINE_START);

        pn_kanan.setBackground(new java.awt.Color(255, 255, 255));
        pn_kanan.setLayout(new java.awt.BorderLayout());

        jPanelGradient2.setBackground(new java.awt.Color(57, 167, 255));
        jPanelGradient2.setColorEnd(new java.awt.Color(57, 167, 255));
        jPanelGradient2.setColorStart(new java.awt.Color(57, 167, 255));

        javax.swing.GroupLayout jPanelGradient2Layout = new javax.swing.GroupLayout(jPanelGradient2);
        jPanelGradient2.setLayout(jPanelGradient2Layout);
        jPanelGradient2Layout.setHorizontalGroup(
            jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1162, Short.MAX_VALUE)
        );
        jPanelGradient2Layout.setVerticalGroup(
            jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pn_kanan.add(jPanelGradient2, java.awt.BorderLayout.PAGE_START);

        pn_dasar.setBackground(new java.awt.Color(250, 250, 250));

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pn_utama, javax.swing.GroupLayout.PREFERRED_SIZE, 1136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_dasarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn_utama, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pn_kanan.add(pn_dasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(pn_kanan, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String userID = "ID";
                new MenuUtama(userID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuku;
    private javax.swing.JLabel btnPeminjaman;
    private javax.swing.JLabel btnPengembalian;
    private javax.swing.JLabel btn_anggota;
    private javax.swing.JLabel btn_dashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private jpanelgradient.JPanelGradient jPanelGradient2;
    private javax.swing.JPanel menuLaporan;
    private javax.swing.JPanel menuMaster;
    private javax.swing.JPanel menuTransaksi;
    private javax.swing.JPanel pn_btnAnggota;
    private javax.swing.JPanel pn_btnBuku;
    private javax.swing.JPanel pn_btnDashboard;
    private javax.swing.JPanel pn_btnPeminjaman;
    private javax.swing.JPanel pn_btnPengembalian;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_kanan;
    private javax.swing.JPanel pn_kiri;
    private javax.swing.JPanel pn_line;
    private javax.swing.JPanel pn_line1;
    private javax.swing.JPanel pn_line2;
    private javax.swing.JPanel pn_line4;
    private javax.swing.JPanel pn_line5;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables

    private void actionButton() {
        btn_dashboard.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                pn_btnDashboard.setBackground(new Color(240,240,240));
                pn_line.setBackground(new Color(0,102,153));

                pn_utama.removeAll();
                pn_utama.add(new MenuDashboard());
                pn_utama.repaint();
                pn_utama.revalidate();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pn_btnDashboard.setBackground(new Color(250,250,250));
                pn_line.setBackground(new Color(0,102,153));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pn_btnDashboard.setBackground(new Color(255,255,255));
                pn_line.setBackground(new Color(255,255,255));
            }
            
        });
        
        btn_anggota.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                pn_btnAnggota.setBackground(new Color(240,240,240));
                pn_line1.setBackground(new Color(0,102,153));

                pn_utama.removeAll();
                pn_utama.add(new MenuAnggota());
                pn_utama.repaint();
                pn_utama.revalidate();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pn_btnAnggota.setBackground(new Color(250,250,250));
                pn_line1.setBackground(new Color(0,102,153));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pn_btnAnggota.setBackground(new Color(255,255,255));
                pn_line1.setBackground(new Color(255,255,255));
            }
            
        });
        
       

         
      
       
        
        btnBuku.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                pn_btnBuku.setBackground(new Color(240,240,240));
                pn_line2.setBackground(new Color(0,102,153));

                pn_utama.removeAll();
                pn_utama.add(new MenuBuku());
                pn_utama.repaint();
                pn_utama.revalidate();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pn_btnBuku.setBackground(new Color(250,250,250));
                pn_line2.setBackground(new Color(0,102,153));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pn_btnBuku.setBackground(new Color(255,255,255));
                pn_line2.setBackground(new Color(255,255,255));
            }
            
        });
        
      
        btnPeminjaman.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                pn_btnPeminjaman.setBackground(new Color(240,240,240));
                pn_line4.setBackground(new Color(0,102,153));

                pn_utama.removeAll();
                pn_utama.add(new MenuPeminjaman(getUserID()));
                pn_utama.repaint();
                pn_utama.revalidate();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pn_btnPeminjaman.setBackground(new Color(250,250,250));
                pn_line4.setBackground(new Color(0,102,153));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pn_btnPeminjaman.setBackground(new Color(255,255,255));
                pn_line4.setBackground(new Color(255,255,255));
            }
            
        });
        
        btnPengembalian.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                pn_btnPengembalian.setBackground(new Color(240,240,240));
                pn_line5.setBackground(new Color(0,102,153));

                pn_utama.removeAll();
                pn_utama.add(new MenuPengembalian(getUserID()));
                pn_utama.repaint();
                pn_utama.revalidate();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pn_btnPengembalian.setBackground(new Color(250,250,250));
                pn_line5.setBackground(new Color(0,102,153));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pn_btnPengembalian.setBackground(new Color(255,255,255));
                pn_line5.setBackground(new Color(255,255,255));
            }
            
        });
    }

    
}
