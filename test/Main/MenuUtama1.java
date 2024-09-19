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
import javax.swing.JPanel;

public class MenuUtama1 extends javax.swing.JFrame {

    int xx, xy;
    private String userID;
    private String levelUser;

    public MenuUtama1(String userID, String levelUser) {
        initComponents();
        this.userID = userID;
        this.levelUser = levelUser;
        addMenu();
    }
    
    public String getUserID() {
        return userID;
    }
    
    public String getLevelUser() {
        return levelUser;
    }
    
    public JPanel getPanelUtama(){
        return pn_utama;
    }
    
    private void addMenu(){
        if(levelUser.equals("Admin")){
            sideMenu.add(new MenuMaster(this));
            sideMenu.add(new MenuTransaksi(this));
            sideMenu.add(new MenuLaporan());
        }else{
            sideMenu.add(new MenuTransaksi(this));
            sideMenu.add(new MenuLaporan());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pn_kiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sideMenu = new javax.swing.JPanel();
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
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("MyLibraries");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/books-50px.png"))); // NOI18N

        jScrollPane1.setBorder(null);

        sideMenu.setBackground(new java.awt.Color(255, 255, 255));
        sideMenu.setLayout(new javax.swing.BoxLayout(sideMenu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(sideMenu);

        javax.swing.GroupLayout pn_kiriLayout = new javax.swing.GroupLayout(pn_kiri);
        pn_kiri.setLayout(pn_kiriLayout);
        pn_kiriLayout.setHorizontalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_kiriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pn_kiriLayout.setVerticalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pn_kiri, java.awt.BorderLayout.LINE_START);

        pn_kanan.setBackground(new java.awt.Color(255, 255, 255));
        pn_kanan.setLayout(new java.awt.BorderLayout());

        jPanelGradient2.setColorEnd(new java.awt.Color(0, 255, 204));
        jPanelGradient2.setColorStart(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanelGradient2Layout = new javax.swing.GroupLayout(jPanelGradient2);
        jPanelGradient2.setLayout(jPanelGradient2Layout);
        jPanelGradient2Layout.setHorizontalGroup(
            jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1176, Short.MAX_VALUE)
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
                .addContainerGap(20, Short.MAX_VALUE)
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
                String levelUser = "Level";
                new MenuUtama1(userID, levelUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private jpanelgradient.JPanelGradient jPanelGradient2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_kanan;
    private javax.swing.JPanel pn_kiri;
    private javax.swing.JPanel pn_utama;
    private javax.swing.JPanel sideMenu;
    // End of variables declaration//GEN-END:variables

    
}
