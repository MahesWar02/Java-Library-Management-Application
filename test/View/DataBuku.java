package View;

import Config.Koneksi;
import View.MenuAnggota;
import View.MenuBuku;
import java.awt.Component;
import java.awt.Image;
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
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class DataBuku extends javax.swing.JDialog {

    private int halamanSaatIni = 1;
    private int dataPerHalaman = 14;
    private int totalPages;
    private Connection conn;
    
    private String idBuku;
    private String judulBuku;
    private String pengarangBuku;
    private String penerbitBuku;

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

    
    
    public DataBuku(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        conn = Koneksi.getConnection();
        setTabelModel();
        loadData();
        paginationAnggota();
        actionButton();
        setTableRenderer();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new Palette.Custom_JTabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_last = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        cbx_data = new javax.swing.JComboBox<>();
        btn_before = new javax.swing.JButton();
        btn_first = new javax.swing.JButton();
        lb_halaman = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSearch = new Palette.Custom_JTextFieldRounded();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelView.setBackground(new java.awt.Color(255, 255, 255));
        panelView.setPreferredSize(new java.awt.Dimension(1133, 690));

        tblData.setForeground(new java.awt.Color(255, 51, 51));
        tblData.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblData.setRowHeight(100);
        jScrollPane1.setViewportView(tblData);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Data Buku Perpustakaan");

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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelView, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelView, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addContainerGap()))
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
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataBuku dialog = new DataBuku(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_before;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JComboBox<String> cbx_data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_halaman;
    private javax.swing.JPanel panelView;
    private Palette.Custom_JTabel tblData;
    private Palette.Custom_JTextFieldRounded txtSearch;
    // End of variables declaration//GEN-END:variables

    private void paginationAnggota() {
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
            String sql = "SELECT COUNT(*) AS total FROM anggota";
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
        lb_halaman.setText(String.valueOf("Halaman "+ halamanSaatIni + " dari Total Data " + totalData));
        
        int startIndex = (halamanSaatIni - 1) * dataPerHalaman;
        getData(startIndex, dataPerHalaman,(DefaultTableModel) tblData.getModel());
        
    }
    
    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.addColumn("ID Buku");
        model.addColumn("Judul");
        model.addColumn("Pengarang");
        model.addColumn("Tahun Terbit");
        model.addColumn("ID Kategori");
        model.addColumn("Nama Kategori");
        model.addColumn("ID Penerbit");
        model.addColumn("Nama Penerbit");
        model.addColumn("Gambar");
    }

    public void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sql = "SELECT bk.ID_Buku, bk.Judul_Buku, bk.Pengarang_Buku, bk.Tahun_Terbit, \n" +
                        "ktg.ID_Kategori, ktg.Nama_Kategori, \n" +
                        "pnb.ID_Penerbit, pnb.Nama_Penerbit, bk.Gambar\n" +
                        "FROM buku bk \n" +
                        "INNER JOIN kategori ktg ON ktg.ID_Kategori = bk.ID_Kategori\n" +
                        "INNER JOIN penerbit pnb ON pnb.ID_Penerbit = bk.ID_Penerbit ORDER BY bk.ID_Buku ASC LIMIT ?,?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setInt(1, startIndex);
                st.setInt(2, entriesPage);
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idBuku       = rs.getString("ID_Buku");
                    String judulBuku    = rs.getString("Judul_Buku");
                    String pengarangBuku = rs.getString("Pengarang_Buku");
                    String tahunTerbit  = rs.getString("Tahun_Terbit");
                    String idKategori   = rs.getString("ID_Kategori");
                    String namaKategori   = rs.getString("Nama_Kategori");
                    String idPenerbit   = rs.getString("ID_Penerbit");
                    String namaPenerbit   = rs.getString("Nama_Penerbit");
                    
                    byte[] imageData = rs.getBytes("Gambar");
                    ImageIcon imageIcon = new ImageIcon(imageData);

                    Object[] rowData = {idBuku, judulBuku, pengarangBuku, tahunTerbit, idKategori,namaKategori, idPenerbit, namaPenerbit, imageIcon};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void setTableRenderer(){
        
        class CustomRenderer extends DefaultTableCellRenderer{

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if(value instanceof ImageIcon){
                    ImageIcon icon = (ImageIcon) value;
                    Image originalImage = icon.getImage();
                    
                    int desireWidth = 70;
                    int desireHeight = 90;
                    
                    Image resizedImage =  originalImage.getScaledInstance(desireWidth, desireHeight, Image.SCALE_SMOOTH);
                    ImageIcon resizedIcon = new ImageIcon(resizedImage);
                    
                    JLabel label = new JLabel(resizedIcon);
                    label.setHorizontalAlignment(JLabel.CENTER);
                    
                    return label;
                }
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        }
        
        tblData.getColumnModel().getColumn(8).setCellRenderer(new CustomRenderer());
    }
    
    class ImageRender extends DefaultTableCellRenderer{

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if(value instanceof ImageIcon){
                ImageIcon icon = (ImageIcon) value;
                JLabel label = new JLabel(icon);
                label.setHorizontalAlignment(JLabel.CENTER);
                return label;
            }
            
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
        
    }
    
    private void searchData() {
        String kataKunci = txtSearch.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "SELECT bk.ID_Buku, bk.Judul_Buku, bk.Pengarang_Buku, bk.Tahun_Terbit, ktg.ID_Kategori, "
                    + "ktg.Nama_Kategori, pnb.ID_Penerbit, pnb.Nama_Penerbit, bk.Gambar \n" +
                            "FROM buku bk \n" +
                            "INNER JOIN kategori ktg ON ktg.ID_Kategori = bk.ID_Kategori\n" +
                            "INNER JOIN penerbit pnb ON pnb.ID_Penerbit = bk.ID_Penerbit\n" +
                            "WHERE bk.Judul_Buku LIKE ? OR bk.Pengarang_Buku LIKE ?";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idBuku       = rs.getString("ID_Buku");
                    String judulBuku    = rs.getString("Judul_Buku");
                    String pengarangBuku = rs.getString("Pengarang_Buku");
                    String tahunTerbit  = rs.getString("Tahun_Terbit");
                    String idKategori   = rs.getString("ID_Kategori");
                    String namaKategori   = rs.getString("Nama_Kategori");
                    String idPenerbit   = rs.getString("ID_Penerbit");
                    String namaPenerbit   = rs.getString("Nama_Penerbit");
                    
                    byte[] imageData = rs.getBytes("Gambar");
                    ImageIcon imageIcon = new ImageIcon(imageData);

                    Object[] rowData = {idBuku, judulBuku, pengarangBuku, tahunTerbit, idKategori,namaKategori, idPenerbit, namaPenerbit, imageIcon};
                    model.addRow(rowData);
                }
            } 
        } catch (SQLException e) {
            Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    private void pilihData() {
        int row = tblData.getSelectedRow();

        idBuku        = tblData.getValueAt(row, 0).toString();
        judulBuku      = tblData.getValueAt(row, 1).toString();
        pengarangBuku     = tblData.getValueAt(row, 2).toString();
        penerbitBuku   = tblData.getValueAt(row, 7).toString();

        dispose();
    }
}
