/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Admin;

import Control.Receptionist_EditController;
import Model.DBConnection;
import Model.Receptionist_Searchtable;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Deshan Asanka
 */
public class Edit_Reciptionist_Record extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Dashboard
     */
    String uname;
    public Edit_Reciptionist_Record(String user_name) {
        initComponents();
        
        setBackground(new Color(1.0f,1.0f,1.0f,0.8f));   
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 35, 35));
        
  this.uname = user_name;
        jLabel15.setText(uname); //set username

                //add database reciptionist records to the table        
        ResultSet r = new Receptionist_Searchtable().searchreceptionist();
        DefaultTableModel dtm = (DefaultTableModel) display_table_edit.getModel();
        dtm.setRowCount(0); //sets the number of rows in the model
        try{
            Vector v;
            while (r.next()){
                v = new Vector();
                v.add(r.getString("r_id"));
                v.add(r.getString("r_name"));
                v.add(r.getString("r_gender"));
                v.add(r.getString("r_NIC"));
                v.add(r.getString("r_contact"));
                v.add(r.getString("r_username"));
                v.add(r.getString("r_password"));

                dtm.addRow(v);

                //Adds a row to the end of the model
            }
            DBConnection.closeCon();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound5 = new Design.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelRound4 = new Design.PanelRound();
        panelRound7 = new Design.PanelRound();
        username = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        id = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        contactno = new javax.swing.JTextField();
        NIC = new javax.swing.JTextField();
        roomno = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        specialization = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        panelRound2 = new Design.PanelRound();
        panelRound1 = new Design.PanelRound();
        panelRound3 = new Design.PanelRound();
        Profile_Image = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelRound12 = new Design.PanelRound();
        panelRound13 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        display_table_edit = new javax.swing.JTable();
        edit = new Design.PanelRound();
        edit1 = new javax.swing.JLabel();
        back = new Design.PanelRound();
        backtxt = new javax.swing.JLabel();
        id1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        female2 = new javax.swing.JRadioButton();
        male1 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        NIC2 = new javax.swing.JTextField();
        contactno2 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        username2 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        password2 = new javax.swing.JPasswordField();
        Dashboard = new javax.swing.JLabel();
        DASHI = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        panelRound5.setBackground(new java.awt.Color(39, 212, 59));
        panelRound5.setRoundBottomLeft(15);
        panelRound5.setRoundBottomRight(15);
        panelRound5.setRoundTopLeft(15);
        panelRound5.setRoundTopRight(15);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel7.setText("Doctor ID :");

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel16.setText("Gender :");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADD");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CANCEL");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        panelRound4.setBackground(new java.awt.Color(193, 193, 193));
        panelRound4.setRoundBottomLeft(15);
        panelRound4.setRoundBottomRight(15);
        panelRound4.setRoundTopLeft(15);
        panelRound4.setRoundTopRight(15);

        panelRound7.setBackground(new java.awt.Color(39, 212, 59));
        panelRound7.setRoundBottomLeft(15);
        panelRound7.setRoundBottomRight(15);
        panelRound7.setRoundTopLeft(15);
        panelRound7.setRoundTopRight(15);

        username.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel17.setText("Password :");

        password.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        id.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        year.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        year.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        name.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        contactno.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        contactno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        contactno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactnoActionPerformed(evt);
            }
        });

        NIC.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        NIC.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        roomno.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        roomno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        male.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        male.setText("Male");
        male.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        female.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        female.setText("Female");
        female.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        specialization.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        specialization.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anesthesia", "Animal Welfare", "Behavior", "Dentistry", "Dermatology", "Oncology", "Microbiology", "Nutrition", "Ophthalmology", "Pathology", "Radiology", "Surgery", "Theriogenology" }));
        specialization.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel14.setText("Username :");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel12.setText("Contact No:");

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel13.setText("Room No :");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel11.setText("Years of Experience :");

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel18.setText("Specialization :");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel9.setText("NIC N0 :");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel8.setText("Doctor Name :");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/ADD POP.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 495));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(70);
        panelRound2.setRoundTopLeft(70);

        panelRound1.setBackground(new java.awt.Color(204, 255, 204));
        panelRound1.setRoundBottomLeft(60);
        panelRound1.setRoundTopLeft(60);
        panelRound1.setLayout(null);

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setRoundBottomLeft(60);
        panelRound3.setRoundBottomRight(60);
        panelRound3.setRoundTopLeft(60);
        panelRound3.setRoundTopRight(60);

        Profile_Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Profile_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/1Admin.png"))); // NOI18N
        Profile_Image.setToolTipText("");

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addComponent(Profile_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Profile_Image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound1.add(panelRound3);
        panelRound3.setBounds(0, 0, 60, 60);

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(72, 100, 114));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Username");
        panelRound1.add(jLabel15);
        jLabel15.setBounds(70, 0, 90, 30);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(72, 100, 114));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Admin");
        panelRound1.add(jLabel10);
        jLabel10.setBounds(70, 30, 90, 30);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        getContentPane().add(panelRound2);
        panelRound2.setBounds(960, 70, 184, 70);

        panelRound12.setBackground(new java.awt.Color(222, 237, 223));
        panelRound12.setMaximumSize(new java.awt.Dimension(275, 85));
        panelRound12.setMinimumSize(new java.awt.Dimension(275, 85));
        panelRound12.setPreferredSize(new java.awt.Dimension(275, 85));
        panelRound12.setRoundBottomLeft(25);
        panelRound12.setRoundBottomRight(25);
        panelRound12.setRoundTopLeft(25);
        panelRound12.setRoundTopRight(25);

        panelRound13.setBackground(new java.awt.Color(255, 255, 255));
        panelRound13.setMaximumSize(new java.awt.Dimension(270, 165));
        panelRound13.setMinimumSize(new java.awt.Dimension(270, 165));
        panelRound13.setPreferredSize(new java.awt.Dimension(270, 165));
        panelRound13.setRoundBottomLeft(25);
        panelRound13.setRoundBottomRight(25);
        panelRound13.setRoundTopLeft(25);
        panelRound13.setRoundTopRight(25);

        display_table_edit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "NIC", "Contact No", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        display_table_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                display_table_editMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(display_table_edit);

        javax.swing.GroupLayout panelRound13Layout = new javax.swing.GroupLayout(panelRound13);
        panelRound13.setLayout(panelRound13Layout);
        panelRound13Layout.setHorizontalGroup(
            panelRound13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1104, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound13Layout.setVerticalGroup(
            panelRound13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRound12Layout = new javax.swing.GroupLayout(panelRound12);
        panelRound12.setLayout(panelRound12Layout);
        panelRound12Layout.setHorizontalGroup(
            panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound12Layout.createSequentialGroup()
                .addComponent(panelRound13, javax.swing.GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound12Layout.setVerticalGroup(
            panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound12Layout.createSequentialGroup()
                .addComponent(panelRound13, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(panelRound12);
        panelRound12.setBounds(30, 340, 1140, 200);

        edit.setBackground(new java.awt.Color(15, 225, 111));
        edit.setRoundBottomLeft(15);
        edit.setRoundBottomRight(15);
        edit.setRoundTopLeft(15);
        edit.setRoundTopRight(15);
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });

        edit1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        edit1.setForeground(new java.awt.Color(255, 255, 255));
        edit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit1.setText("Edit");
        edit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout editLayout = new javax.swing.GroupLayout(edit);
        edit.setLayout(editLayout);
        editLayout.setHorizontalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edit1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        editLayout.setVerticalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edit1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        getContentPane().add(edit);
        edit.setBounds(1040, 560, 115, 33);

        back.setBackground(new java.awt.Color(153, 153, 153));
        back.setRoundBottomLeft(15);
        back.setRoundBottomRight(15);
        back.setRoundTopLeft(15);
        back.setRoundTopRight(15);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        backtxt.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        backtxt.setForeground(new java.awt.Color(255, 255, 255));
        backtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backtxt.setText("Back");
        backtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backtxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backLayout = new javax.swing.GroupLayout(back);
        back.setLayout(backLayout);
        backLayout.setHorizontalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        backLayout.setVerticalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        getContentPane().add(back);
        back.setBounds(870, 560, 115, 33);

        id1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        id1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id1ActionPerformed(evt);
            }
        });
        getContentPane().add(id1);
        id1.setBounds(280, 150, 180, 30);

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel25.setText("Receptionist ID :");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(100, 150, 170, 30);

        jLabel32.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel32.setText("Receptionist Name :");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(530, 150, 210, 30);

        name1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        name1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });
        getContentPane().add(name1);
        name1.setBounds(750, 150, 350, 30);

        female2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        female2.setText("Female");
        female2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(female2);
        female2.setBounds(340, 200, 120, 30);

        male1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        male1.setText("Male");
        male1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        male1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male1ActionPerformed(evt);
            }
        });
        getContentPane().add(male1);
        male1.setBounds(230, 200, 80, 30);

        jLabel33.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel33.setText("Gender :");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(100, 200, 100, 30);

        jLabel34.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel34.setText("NIC N0 :");
        getContentPane().add(jLabel34);
        jLabel34.setBounds(530, 200, 100, 30);

        NIC2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        NIC2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(NIC2);
        NIC2.setBounds(650, 200, 260, 30);

        contactno2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        contactno2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        contactno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactno2ActionPerformed(evt);
            }
        });
        contactno2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contactno2KeyPressed(evt);
            }
        });
        getContentPane().add(contactno2);
        contactno2.setBounds(260, 250, 200, 30);

        jLabel35.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel35.setText("Contact No:");
        getContentPane().add(jLabel35);
        jLabel35.setBounds(100, 250, 130, 30);

        jLabel36.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel36.setText("Username :");
        getContentPane().add(jLabel36);
        jLabel36.setBounds(100, 300, 120, 30);

        username2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        username2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        username2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username2ActionPerformed(evt);
            }
        });
        getContentPane().add(username2);
        username2.setBounds(260, 300, 200, 30);

        jLabel37.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel37.setText("Password :");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(530, 300, 110, 30);

        password2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        getContentPane().add(password2);
        password2.setBounds(650, 290, 260, 40);

        Dashboard.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Dashboard.setForeground(new java.awt.Color(96, 125, 139));
        Dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dashboard.setText("Edit Receptionist Record");
        getContentPane().add(Dashboard);
        Dashboard.setBounds(150, 80, 320, 31);

        DASHI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_fries_menu_30px_1.png"))); // NOI18N
        getContentPane().add(DASHI);
        DASHI.setBounds(120, 80, 30, 31);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/edit_B.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 630);

        setSize(new java.awt.Dimension(1200, 675));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        // new pop_pass().setVisible(true);
      
    }//GEN-LAST:event_jLabel6MouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void contactnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnoActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseClicked

    private void backtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtxtMouseClicked
        //back
         this.setVisible(false);
    }//GEN-LAST:event_backtxtMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        
    }//GEN-LAST:event_editMouseClicked

    private void edit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit1MouseClicked
        
        String gender = null;
        if (male1.isSelected()) {
            gender = "Male" ;
        } else if (female2.isSelected()){
            gender = "Female";
        }
//display error message when not adding all the credentials
        if (id1.getText().trim().isEmpty() || username2.getText().trim().isEmpty()||password2.getText().trim().isEmpty() ){
                 JOptionPane.showMessageDialog(null,"Add all the credentials", "Error" , JOptionPane.ERROR_MESSAGE);}
             else{
//update the record 
      Receptionist_EditController.Form(id1.getText(), name1.getText(),gender,NIC2.getText(),contactno2.getText(), username2.getText(), password2.getText());
        this.setVisible(false);
             }   
    }//GEN-LAST:event_edit1MouseClicked

    private void display_table_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_display_table_editMouseClicked
            //get selected row details to textfield
            DefaultTableModel d1 = (DefaultTableModel)display_table_edit.getModel() ;
        int SelectIndex = display_table_edit.getSelectedRow();

        id1.setText(d1.getValueAt(SelectIndex, 0).toString());
        name1.setText(d1.getValueAt(SelectIndex, 1).toString());
        String gender = d1.getValueAt(SelectIndex, 2).toString();
        if (gender.equals("Male")) {
            male1.setSelected(true);
        } else if (gender.equals("Female")){
            female2.setSelected(true);
        }

        NIC2.setText(d1.getValueAt(SelectIndex, 3).toString());
        contactno2.setText(d1.getValueAt(SelectIndex, 4).toString());
        username2.setText(d1.getValueAt(SelectIndex, 5).toString());
        password2.setText(d1.getValueAt(SelectIndex, 6).toString());

            // TODO add your handling code here:
    }//GEN-LAST:event_display_table_editMouseClicked

    private void id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id1ActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void male1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_male1ActionPerformed

    private void contactno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactno2ActionPerformed

    private void username2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username2ActionPerformed

    private void contactno2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactno2KeyPressed
        //error message when adding characters  
        char c = evt.getKeyChar();
if(Character.isLetter(c)){
  contactno2.setEditable(false);
   JOptionPane.showMessageDialog(null, "Please Enter Numbers only", "Error",JOptionPane.ERROR_MESSAGE);
}
else
{
  contactno2.setEditable(true);   
}  
    }//GEN-LAST:event_contactno2KeyPressed

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
            java.util.logging.Logger.getLogger(Edit_Reciptionist_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Reciptionist_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Reciptionist_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Reciptionist_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      
        //</editor-fold>
        //</editor-fold>
      
 

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            String user_name;
            public void run() {
                new Edit_Reciptionist_Record(user_name).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DASHI;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JTextField NIC;
    private javax.swing.JTextField NIC2;
    private javax.swing.JLabel Profile_Image;
    private Design.PanelRound back;
    private javax.swing.JLabel backtxt;
    private javax.swing.JTextField contactno;
    private javax.swing.JTextField contactno2;
    private javax.swing.JTable display_table_edit;
    private Design.PanelRound edit;
    private javax.swing.JLabel edit1;
    private javax.swing.JRadioButton female;
    private javax.swing.JRadioButton female2;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id1;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton male1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private Design.PanelRound panelRound1;
    private Design.PanelRound panelRound12;
    private Design.PanelRound panelRound13;
    private Design.PanelRound panelRound2;
    private Design.PanelRound panelRound3;
    private Design.PanelRound panelRound4;
    private Design.PanelRound panelRound5;
    private Design.PanelRound panelRound7;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password2;
    private javax.swing.JTextField roomno;
    private javax.swing.JComboBox<String> specialization;
    private javax.swing.JTextField username;
    private javax.swing.JTextField username2;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
