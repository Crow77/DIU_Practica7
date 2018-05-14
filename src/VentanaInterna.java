import java.awt.Dimension;
import java.awt.image.BufferedImage;

public class VentanaInterna extends javax.swing.JInternalFrame {


    public VentanaInterna() {
        initComponents();
    }

    public PanelPrincipal getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setImagen2(BufferedImage imagen){
        panelPrincipal.setImagen(imagen);
        panelPrincipal.setPreferredSize(new Dimension((int)imagen.getWidth(),(int)imagen.getHeight()));
        panelPrincipal.paintComponent(panelPrincipal.getGraphics());
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        panelPrincipal = new PanelPrincipal();

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        scroll.setViewportView(panelPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private PanelPrincipal panelPrincipal;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables

}
