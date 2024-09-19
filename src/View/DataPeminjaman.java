package View;

import Config.Koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class DataPeminjaman extends javax.swing.JDialog {

    private int halamanSaatIni = 1;
    private int dataPerHalaman = 14;
    private int totalPages;
    private Connection conn;
    
    private String idPeminjaman;
    private String tanggalPinjam;
    private String tanggalKembali;
    private String idAnggota;
    private String namaAnggota;
    private String idBuku;
    private String judulBuku;
    private String pengarangBuku;
    private String penerbitBuku;
    private String jumlahPinjam;

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public String getPengarangBuku() {
        return pengarangBuku;
    }

    public String getPenerbitBuku() {
        return penerbitBuku;
    }

    public String getJumlahPinjam() {
        return jumlahPinjam;
    }
    
    public DataPeminjaman(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        conn = Koneksi.getConnection();
        setTabelModel();
        loadData();
        actionButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new Palette.Custom_JTabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSearch = new Palette.Custom_JTextFieldRounded();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
            .addGap(0, 1066, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_book_30px.png"))); // NOI18N

        txtSearch.setForeground(new java.awt.Color(102, 102, 102));
        txtSearch.setText("Search");
        txtSearch.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1066, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1103, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelView, javax.swing.GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelView, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DataPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataPeminjaman dialog = new DataPeminjaman(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelView;
    private Palette.Custom_JTabel tblData;
    private Palette.Custom_JTextFieldRounded txtSearch;
    // End of variables declaration//GEN-END:variables

   
    private void actionButton(){
        txtSearch.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e) {
                searchData();
            }
        });
        
        tblData.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                pilihData();
            }
        });
    }
    
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
            Logger.getLogger(MenuAnggota.class.getName()).log(Level.SEVERE,null,e);
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
    }
    
    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.addColumn("ID");
        model.addColumn("Tanggal Pinjam");
        model.addColumn("Tanggal Kembali");
        model.addColumn("ID Anggota");
        model.addColumn("Nama Anggota");
        model.addColumn("ID Buku");
        model.addColumn("Judul");
        model.addColumn("Pengarang");
        model.addColumn("Penerbit");
        model.addColumn("Jumlah");
    }
    
    public void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sql = "SELECT *\n" +
                    "FROM detail_peminjaman pmd\n" +
                    "INNER JOIN peminjaman pm ON pm.ID_Peminjaman = pmd.ID_Peminjaman\n" +
                    "INNER JOIN anggota agt ON agt.ID_Anggota = pm.ID_Anggota\n" +
                    "INNER JOIN buku bk ON bk.ID_Buku = pmd.ID_Buku\n" +
                    "INNER JOIN penerbit pnb ON pnb.ID_Penerbit = bk.ID_Penerbit\n" +
                    "WHERE Status_Peminjaman ='Sedang dipinjam' LIMIT ?,?";
            
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setInt(1, startIndex);
                st.setInt(2, entriesPage);
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idPeminjaman     = rs.getString("ID_Peminjaman");
                    String tanggalPinjam    = rs.getString("Tanggal_Peminjaman");
                    String tanggalKembali   = rs.getString("Tanggal_Pengembalian");
                    String idAnggota        = rs.getString("ID_Anggota");
                    String namaAnggota      = rs.getString("Nama_Anggota");
                    String idBuku           = rs.getString("ID_Buku");
                    String judulBuku        = rs.getString("Judul_Buku");
                    String pengarangBuku    = rs.getString("Pengarang_Buku");
                    String penerbitBuku     = rs.getString("Nama_Penerbit");
                    String jumlahPinjam     = rs.getString("Jumlah_Pinjam");

                    Object[] rowData = {idPeminjaman, tanggalPinjam, tanggalKembali, idAnggota,namaAnggota,idBuku,judulBuku,pengarangBuku,penerbitBuku,jumlahPinjam};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuAnggota.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void searchData() {
        String kataKunci = txtSearch.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
        
        try {
            String sql;
            if(!kataKunci.isEmpty()){
                sql = "SELECT * FROM detail_peminjaman pmd\n" +
                        "INNER JOIN peminjaman pm ON pm.ID_Peminjaman = pmd.ID_Peminjaman\n" +
                        "INNER JOIN anggota agt ON agt.ID_Anggota = pm.ID_Anggota\n" +
                        "INNER JOIN buku bk ON bk.ID_Buku = pmd.ID_Buku\n" +
                        "INNER JOIN penerbit pnb ON pnb.ID_Penerbit = bk.ID_Penerbit\n" +
                        "WHERE Status_Peminjaman ='Sedang dipinjam' AND pm.ID_Peminjaman LIKE ? OR agt.Nama_Anggota LIKE ?";
            }else{
                sql = "SELECT * FROM detail_peminjaman pmd\n" +
                        "INNER JOIN peminjaman pm ON pm.ID_Peminjaman = pmd.ID_Peminjaman\n" +
                        "INNER JOIN anggota agt ON agt.ID_Anggota = pm.ID_Anggota\n" +
                        "INNER JOIN buku bk ON bk.ID_Buku = pmd.ID_Buku\n" +
                        "INNER JOIN penerbit pnb ON pnb.ID_Penerbit = bk.ID_Penerbit\n" +
                        "WHERE Status_Peminjaman ='Sedang dipinjam'";
            }
            
           try (PreparedStatement st = conn.prepareStatement(sql)){
                if(!kataKunci.isEmpty()){
                    st.setString(1, "%" + kataKunci + "%");
                    st.setString(2, "%" + kataKunci + "%");
                }
                
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idPeminjaman     = rs.getString("ID_Peminjaman");
                    String tanggalPinjam    = rs.getString("Tanggal_Peminjaman");
                    String tanggalKembali   = rs.getString("Tanggal_Pengembalian");
                    String idAnggota        = rs.getString("ID_Anggota");
                    String namaAnggota      = rs.getString("Nama_Anggota");
                    String idBuku           = rs.getString("ID_Buku");
                    String judulBuku        = rs.getString("Judul_Buku");
                    String pengarangBuku    = rs.getString("Pengarang_Buku");
                    String penerbitBuku     = rs.getString("Nama_Penerbit");
                    String jumlahPinjam     = rs.getString("Jumlah_Pinjam");

                    Object[] rowData = {idPeminjaman, tanggalPinjam, tanggalKembali, idAnggota,namaAnggota,idBuku,judulBuku,pengarangBuku,penerbitBuku,jumlahPinjam};
                    model.addRow(rowData);
                }
            } 
        } catch (SQLException e) {
            Logger.getLogger(MenuAnggota.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    private void pilihData(){
        int row = tblData.getSelectedRow();
        
        idPeminjaman        = tblData.getValueAt(row, 0).toString();
        tanggalPinjam       = tblData.getValueAt(row, 1).toString();
        tanggalKembali      = tblData.getValueAt(row, 2).toString();
        idAnggota           = tblData.getValueAt(row, 3).toString();
        namaAnggota         = tblData.getValueAt(row, 4).toString();
        idBuku              = tblData.getValueAt(row, 5).toString();
        judulBuku           = tblData.getValueAt(row, 6).toString();
        pengarangBuku       = tblData.getValueAt(row, 7).toString();
        penerbitBuku        = tblData.getValueAt(row, 8).toString();
        jumlahPinjam        = tblData.getValueAt(row, 9).toString();  
        
        dispose();
    }

}
