package hakancemgercek.test07;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
    
/**
 *
 * @author hakan
 */
public class StokUygulamasi extends javax.swing.JFrame {
    DefaultTableModel model;
    
    /**
     * Creates new form StokUygulamasi
     */
    public StokUygulamasi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        urunAdi_label = new javax.swing.JLabel();
        kategori_label = new javax.swing.JLabel();
        fiyat_label = new javax.swing.JLabel();
        mesaj_label = new javax.swing.JLabel();
        urunAdi_textField = new javax.swing.JTextField();
        fiyat_textField = new javax.swing.JTextField();
        kategori_comboBox = new javax.swing.JComboBox<>();
        urunEkle_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo_table = new javax.swing.JTable();
        urunGuncelle_button = new javax.swing.JButton();
        urulerTablosu_label = new javax.swing.JLabel();
        urunSil_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stok Uygulaması");
        setResizable(false);

        urunAdi_label.setText("Ürün Adı");

        kategori_label.setText("Ketegori");

        fiyat_label.setText("Fiyat");

        mesaj_label.setForeground(new java.awt.Color(255, 0, 0));

        kategori_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kategori seçiniz...", "Elektronik", "Giyim", "Sanat" }));

        urunEkle_button.setText("Ürün Ekle");
        urunEkle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunEkle_buttonActionPerformed(evt);
            }
        });

        tablo_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün Adı", "Kategori", "Fiyat (TL)"
            }
        ));
        tablo_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo_table);

        urunGuncelle_button.setText("Ürün Güncelle");
        urunGuncelle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunGuncelle_buttonActionPerformed(evt);
            }
        });

        urulerTablosu_label.setText("Ürünler Tablosu");

        urunSil_button.setText("Ürün Sil");
        urunSil_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunSil_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(urunAdi_label)
                                    .addComponent(fiyat_label)
                                    .addComponent(kategori_label))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(kategori_comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(urunAdi_textField)
                                    .addComponent(fiyat_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(urunEkle_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(urunGuncelle_button, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(urunSil_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20))
                            .addComponent(mesaj_label, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(urulerTablosu_label, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(urunAdi_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kategori_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fiyat_label)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(urunEkle_button)
                            .addComponent(urunAdi_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(urunGuncelle_button)
                            .addComponent(kategori_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(urunSil_button)
                            .addComponent(fiyat_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mesaj_label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(urulerTablosu_label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
    private void inputControlEkle(){
        /* Program çalıştığında, girilmesi gereken yerlerin boş olduğu, boş olmadığı ve yanlış olduğu
        durumları kontrol eden metot.*/
        
        //Girilmesi gereken inputların boş olduğu durumlarda yapılanlar.
        if(urunAdi_textField.getText().isEmpty()){
            mesaj_label.setText("Ürün adı boş bırakılamaz!");
        }
        else if(fiyat_textField.getText().isEmpty()){
            mesaj_label.setText("Fiyat boş bırakılamaz!");
        }
        else if(fiyat_textField.getText().matches(".*[a-zA-Z]+.*")){
            mesaj_label.setText("Fiyat kısmına, bir sayı giriniz!");
        }
        else if(kategori_comboBox.getSelectedItem().toString().equals("Kategori seçiniz...")){
            mesaj_label.setText("Kategori seçilmedi!");
        }
        //Girilmesi gereken inputların boş olmadığı durumlarda yapılacak olan.
        else{
            runInputEkle();
        }
    }
    private void inputControlUpdate(){
        /* Program çalıştığında, girilmesi gereken yerlerin boş olduğu, boş olmadığı ve yanlış olduğu
        durumları kontrol eden metot.*/
        
        //Girilmesi gereken inputların boş olduğu durumlarda yapılanlar.
        int seciliRow = tablo_table.getSelectedRow();
        
        //Güncelleme işlemindeki olası durumları kontrol eden bloklar.
        if(seciliRow == -1){
            if(tablo_table.getRowCount() == 0){
                    mesaj_label.setText("Tablo boş!");
                }
                else{
                    mesaj_label.setText("Güncellenecek satır seçilmedi!");
                }
            }
        else{
            if(urunAdi_textField.getText().isEmpty()){
                mesaj_label.setText("Ürün adı boş bırakılamaz!");
            }
            else if(fiyat_textField.getText().isEmpty()){
                mesaj_label.setText("Fiyat boş bırakılamaz!");
            }
            else if(fiyat_textField.getText().matches(".*[a-zA-Z]+.*")){
                mesaj_label.setText("Fiyat kısmına, bir sayı giriniz!");
            }
            else if(kategori_comboBox.getSelectedItem().toString().equals("Kategori seçiniz...")){
                mesaj_label.setText("Kategori seçilmedi!");
            }
            else{
                runInputUpdate();
            }
        }
    }//Girimesi gereken değerler doğru girildiyse çalışan metot.
    private void runInputUpdate(){     
        int seciliRow = tablo_table.getSelectedRow();
        model.setValueAt(urunAdi_textField.getText(), seciliRow, 0);
        model.setValueAt(kategori_comboBox.getSelectedItem().toString(), seciliRow, 1);
        model.setValueAt(fiyat_textField.getText(), seciliRow, 2);
        mesaj_label.setForeground(Color.blue);
        mesaj_label.setText("Ürün güncellendi!");
    }
    
    //Girimesi gereken değerler doğru girildiyse çalışan metot.
    private void runInputEkle(){     
        //Elemanları tablonun her bir sütununa denk gelecek şekilde 'Object' türünden bir array oluşturuldu.
        //Türünün 'Object' olması DefaultTableModel ile alakalı bir durumdur.
        Object[] eklenecek = {urunAdi_textField.getText(), kategori_comboBox.getSelectedItem().toString(),
                              fiyat_textField.getText()};
        
        /*Metot her çalıştığında model referansına bir satır eklenir. Eklenen satırın içeriği 
          oluşturalan 'eklenecek' adlı array'inin elemanlarıdır.*/        
        model.addRow(eklenecek);
        mesaj_label.setForeground(Color.blue);
        mesaj_label.setText("Ürün eklendi!");
    }
    
    //'Ekle' butonuna her tıklandığında yapılacak olan işlemlerin olduğu metot.
    private void urunEkle_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        mesaj_label.setText("");
        mesaj_label.setForeground(Color.red);
        //Metot her çalıştığında hatayı gösteren label'ın sıfırlanması durumu.,
        
        model = (DefaultTableModel)tablo_table.getModel();
        //'model' referansına  oluşturulan tablodaki modellerin (elemanların) tür dönüşümü işe atandığı satır.
        
        inputControlEkle();
        //Program çalıştığında ilgili durumların kontrol edildiği metodun çağrılması.
    }                                               

    private void urunGuncelle_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        mesaj_label.setText("");
        mesaj_label.setForeground(Color.red);
        //Metot her çalıştığında hatayı gösteren label'ın sıfırlanması durumu.,
        
        model = (DefaultTableModel)tablo_table.getModel();
        //'model' referansına  oluşturulan tablodaki modellerin (elemanların) tür dönüşümü işe atandığı satır.
        
        inputControlUpdate();
        //Program çalıştığında ilgili durumların kontrol edildiği metodun çağrılması.        
    }                                                   
   
    private void InputControlSil(){
        /* Program çalıştığında, girilmesi gereken yerlerin boş olduğu, boş olmadığı ve yanlış olduğu
        durumları kontrol eden metot.*/
        
        //Girilmesi gereken inputların boş olduğu durumlarda yapılanlar.
        int seciliRow = tablo_table.getSelectedRow();
        
        //Güncelleme işlemindeki olası durumları kontrol eden bloklar.
        if(seciliRow == -1){
            if(tablo_table.getRowCount() == 0){
                    mesaj_label.setText("Tablo boş!");
                }
                else{
                    mesaj_label.setText("Silinecek satır seçilmedi!");
                }
            }
        else{
            runInputSil();
        }
    }
    private void runInputSil(){
        int seciliRow = tablo_table.getSelectedRow();
        model.removeRow(seciliRow);
        mesaj_label.setForeground(Color.blue);
        mesaj_label.setText("Ürün silindi!");
    }
    
    private void urunSil_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        mesaj_label.setText("");
        mesaj_label.setForeground(Color.red);
        model = (DefaultTableModel)tablo_table.getModel();
        InputControlSil();
        
    }                                              

    private void tablo_tableMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        model = (DefaultTableModel)tablo_table.getModel();
        int seciliRow = tablo_table.getSelectedRow();
        urunAdi_textField.setText(model.getValueAt(seciliRow, 0).toString());
        kategori_comboBox.setSelectedItem(model.getValueAt(seciliRow, 1).toString());
        fiyat_textField.setText(model.getValueAt(seciliRow, 2).toString());
    }                                        

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
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StokUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel fiyat_label;
    private javax.swing.JTextField fiyat_textField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kategori_comboBox;
    private javax.swing.JLabel kategori_label;
    private javax.swing.JLabel mesaj_label;
    private javax.swing.JTable tablo_table;
    private javax.swing.JLabel urulerTablosu_label;
    private javax.swing.JLabel urunAdi_label;
    private javax.swing.JTextField urunAdi_textField;
    private javax.swing.JButton urunEkle_button;
    private javax.swing.JButton urunGuncelle_button;
    private javax.swing.JButton urunSil_button;
    // End of variables declaration                   
}