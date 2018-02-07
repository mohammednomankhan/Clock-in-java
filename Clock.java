
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Clock extends javax.swing.JFrame {

    /**
     * Creates new form click
     */
    public Clock() {
        initComponents();
       
       // this.setUndecorated(true);
        Toolkit kt = Toolkit.getDefaultToolkit();
        
        int width = (int) kt.getScreenSize().getWidth();
        int height = (int) kt.getScreenSize().getHeight();
        
        this.setLocation(width/3,height/3);
        
        Thread t = new Thread()
        {
            public void run()
            {
                 while(true)
                {
                    
                    DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");
                    String dateString = dateFormat.format(new Date()).toString();
                    lable.setText(" "+dateString);
                    
                    try
                    {
                        
                        Thread.sleep(1);
                    }
        
                    catch(Exception e)
                    {
            
                    }
                }
            }
        };
        
        t.start();
        
        
    /*     while(true)
        {
            try
            {
                DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
                String dateString = dateFormat.format(new Date()).toString();
                lable.setText("    "+dateString);
                Thread.sleep(1);
            }
        
            catch(Exception e)
            {
            
            }
        }
      
        
    */    
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lable = new javax.swing.JLabel();
        imagelable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lable.setFont(new java.awt.Font("Times New Roman", 0, 72)); // NOI18N
        lable.setForeground(new java.awt.Color(0, 255, 0));
        lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lableMouseClicked(evt);
            }
        });
        getContentPane().add(lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 300));

        imagelable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wood_background_hd_picture_4_169843.jpg"))); // NOI18N
        imagelable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                imagelableMouseDragged(evt);
            }
        });
        imagelable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                imagelableComponentShown(evt);
            }
        });
        getContentPane().add(imagelable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imagelableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_imagelableComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_imagelableComponentShown

    private void lableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lableMouseClicked
        // TODO add your handling code here:
       
     
       
    }//GEN-LAST:event_lableMouseClicked

    private void imagelableMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagelableMouseDragged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_imagelableMouseDragged

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
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clock().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagelable;
    private javax.swing.JLabel lable;
    // End of variables declaration//GEN-END:variables
}
