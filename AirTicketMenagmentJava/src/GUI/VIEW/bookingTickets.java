/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.VIEW;

import java.awt.Image;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fatlind B. Hoxha
 */
public class bookingTickets extends javax.swing.JInternalFrame {

    /**
     * Creates new form bookingTickets
     */
    public bookingTickets() {
        initComponents();
        autoID();
    }
       Connection con;
   PreparedStatement pst;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSource = new javax.swing.JComboBox();
        txtDeparture = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tctpassengerid = new javax.swing.JTextField();
        txtfirstname = new javax.swing.JLabel();
        txtpassportid = new javax.swing.JLabel();
        txtlastname = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTicketId = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        flightnumber = new javax.swing.JLabel();
        flightname = new javax.swing.JLabel();
        deptime = new javax.swing.JLabel();
        classcombo = new javax.swing.JComboBox();
        txtPrice = new javax.swing.JTextField();
        seatspiner = new javax.swing.JSpinner();
        txtdate = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtTotal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));
        setPreferredSize(new java.awt.Dimension(1366, 801));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Country", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        txtSource.setBackground(new java.awt.Color(51, 153, 255));
        txtSource.setForeground(new java.awt.Color(0, 0, 0));
        txtSource.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Albania", "Andorra", "Armenia", "Austria", "Azerbaijan", "Belarus", "Belgium", "Bosnia and Herzegovina", "Bulgaria", "Croatia", "Cyprus", "Czechia", "Denmark", "Estonia", "Georgia", "Germany", "Greece", "Hungary", "Iceland", "Ireland", "Italy", "Kazakhstan", "Kosovo", "Latvia", "Liechtenstein", "Lithuania", "Luxembourg", "Malta", "Moldova", "Monaco", "Montenegro", "Netherlands", "North Macedonia (formerly Macedonia)", "Norway", "Poland", "Portugal", "Romania", "Russia", "San Marino", "Serbia", "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland", "Turkey", "Ukraine", "United Kingdom (UK)", "Vatican City (Holy See)" }));

        txtDeparture.setBackground(new java.awt.Color(102, 204, 255));
        txtDeparture.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtDeparture.setForeground(new java.awt.Color(0, 0, 0));
        txtDeparture.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Albania", "Andorra", "Armenia", "Austria", "Azerbaijan", "Belarus", "Belgium", "Bosnia and Herzegovina", "Bulgaria", "Croatia", "Cyprus", "Czechia", "Denmark", "Estonia", "Georgia", "Germany", "Greece", "Hungary", "Iceland", "Ireland", "Italy", "Kazakhstan", "Kosovo", "Latvia", "Liechtenstein", "Lithuania", "Luxembourg", "Malta", "Moldova", "Monaco", "Montenegro", "Netherlands", "North Macedonia (formerly Macedonia)", "Norway", "Poland", "Portugal", "Romania", "Russia", "San Marino", "Serbia", "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland", "Turkey", "Ukraine", "United Kingdom (UK)", "Vatican City (Holy See)" }));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Source");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Departure");

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("Select");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtSource, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                        .addComponent(txtDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSource, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(23, 23, 23))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight ID", "Flight Name", "Source", "Departures", "Date", "Charge", "Departure time", "Arrival Time"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("Passenger ID");

        jLabel6.setText("First Name");

        jLabel7.setText("Last Name");

        jLabel8.setText("Passport ID");

        txtfirstname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtfirstname.setForeground(new java.awt.Color(204, 0, 51));
        txtfirstname.setText("jLabel9");

        txtpassportid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtpassportid.setForeground(new java.awt.Color(204, 0, 51));
        txtpassportid.setText("jLabel10");

        txtlastname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtlastname.setForeground(new java.awt.Color(204, 0, 51));
        txtlastname.setText("jLabel11");

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tctpassengerid, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfirstname)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(63, 63, 63))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(58, 58, 58)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpassportid)
                            .addComponent(txtlastname))
                        .addGap(131, 131, 131)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tctpassengerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtfirstname))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtlastname))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtpassportid))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Ticket Number");

        txtTicketId.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtTicketId.setForeground(new java.awt.Color(204, 0, 0));
        txtTicketId.setText("jLabel4");

        jLabel12.setText("Flight Number");

        jLabel13.setText("Flight Name");

        jLabel14.setText("Depart time");

        jLabel15.setText("Class");

        jLabel16.setText("Price");

        jLabel17.setText("Seats");

        flightnumber.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        flightnumber.setForeground(new java.awt.Color(255, 0, 51));
        flightnumber.setText("jLabel18");

        flightname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        flightname.setForeground(new java.awt.Color(255, 0, 51));
        flightname.setText("jLabel19");

        deptime.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        deptime.setForeground(new java.awt.Color(255, 0, 51));
        deptime.setText("jLabel20");

        classcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Economy", "Business" }));
        classcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classcomboActionPerformed(evt);
            }
        });

        seatspiner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                seatspinerStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(flightnumber)
                            .addComponent(flightname)
                            .addComponent(deptime))
                        .addGap(43, 43, 43)
                        .addComponent(txtdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(classcombo, 0, 176, Short.MAX_VALUE)
                                .addComponent(txtPrice))
                            .addComponent(seatspiner, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(flightnumber))
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(flightname))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(deptime))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(classcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(seatspiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(153, 0, 51), new java.awt.Color(255, 51, 51)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setText("Book");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 0), new java.awt.Color(51, 255, 0), new java.awt.Color(51, 204, 0), new java.awt.Color(51, 255, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 0, 0));
        txtTotal.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTicketId))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(txtTicketId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
       public void autoID(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/airticketmenagment","root","");
            Statement s = con.createStatement();
            ResultSet rs= s.executeQuery("select MAX(ticketID) from ticket");
            rs.next();
            rs.getString("MAX(ticketID)");
            if(rs.getString("MAX(ticketID)")== null){
                txtTicketId.setText("T001");
            }else{
                long ticketID = Long.parseLong(rs.getString("MAX(ticketID)").substring(2,rs.getString("MAX(ticketID)").length()));
               ticketID++;
               txtTicketId.setText("T"+ String.format("%03d", ticketID));
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddPassenger.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddPassenger.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String source = txtSource.getSelectedItem().toString().trim();
        String departure = txtDeparture.getSelectedItem().toString().trim();
        
       
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/airticketmenagment","root","");
            pst=con.prepareStatement("select * from flight where flightSource=? and flightDepart=?");
            pst.setString(1,source);
            pst.setString(2,departure);
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rsm = rs.getMetaData();
            int c;
            c=rsm.getColumnCount();
            DefaultTableModel Df =(DefaultTableModel)jTable1.getModel();
            Df.setRowCount(c);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                for(int i =1;i<=c;i++){
                    v2.add(rs.getString("flightID"));
                    v2.add(rs.getString("flightName"));
                    v2.add(rs.getString("flightSource"));
                    v2.add(rs.getString("flightDepart"));
                    v2.add(rs.getString("flightDate"));
                    v2.add(rs.getString("flightCharge"));
                    v2.add(rs.getString("fldeptime"));
                    v2.add(rs.getString("flarrtime"));
                }
                Df.addRow(v2);
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(bookingTickets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(bookingTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
              
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String passengerID= tctpassengerid.getText();
       
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/airticketmenagment","root","");
              pst= con.prepareStatement("select * from passenger where passengerID =?");
              pst.setString(1, passengerID);
             ResultSet rs = pst.executeQuery();
             if(rs.next()==false){
                 JOptionPane.showMessageDialog(this, "Passenger not found!");
             }else{
                 String firstname = rs.getString("firstName");
                 String lasttname = rs.getString("lastName");
                 String passportId = rs.getString("passportID");
  
                 
                 txtfirstname.setText(firstname.trim());
                 txtlastname.setText(lasttname.trim());
                 txtpassportid.setText(passportId.trim());
                 
                 
             }
              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(bookingTickets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(bookingTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       DefaultTableModel Df =(DefaultTableModel)jTable1.getModel();
           int selectedIndex= jTable1.getSelectedRow();
           
           flightnumber.setText(Df.getValueAt(selectedIndex, 0).toString());
            flightname.setText(Df.getValueAt(selectedIndex, 1).toString());
            deptime.setText(Df.getValueAt(selectedIndex, 6).toString());
             txtPrice.setText(Df.getValueAt(selectedIndex, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void seatspinerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_seatspinerStateChanged
       int price = Integer.parseInt(txtPrice.getText());
       int qty = Integer.parseInt(seatspiner.getValue().toString());
       int tot = price*qty;
       
       txtTotal.setText(String.valueOf(tot+" $"));
    }//GEN-LAST:event_seatspinerStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                 String ticketID = txtTicketId.getText();

         String flightID = flightnumber.getText();
         String passangerID= tctpassengerid.getText();
          String classs = classcombo.getSelectedItem().toString().trim();
           String price = txtPrice.getText();
            String seats = seatspiner.getValue().toString();
            DateFormat da = new SimpleDateFormat("MM-dd-yyyy");
            String date =da.format(txtdate.getDate());
            
           
           
        try {
            Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost/airticketmenagment","root","");
              pst =con.prepareStatement("insert into ticket(ticketID,flightID,passengerID,class,price,seats,dater)value(?,?,?,?,?,?,?)");
              pst.setString(1, ticketID);
              pst.setString(2, flightID);
              pst.setString(3, passangerID);
              pst.setString(4, classs);
              pst.setString(5, price);
              pst.setString(6, seats);
              pst.setString(7, date);
              
           
              pst.executeUpdate();
              JOptionPane.showMessageDialog(null, "Ticket Booked");
              
              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddPassenger.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddPassenger.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void classcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classcomboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox classcombo;
    private javax.swing.JLabel deptime;
    private javax.swing.JLabel flightname;
    private javax.swing.JLabel flightnumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner seatspiner;
    private javax.swing.JTextField tctpassengerid;
    private javax.swing.JComboBox txtDeparture;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JComboBox txtSource;
    private javax.swing.JLabel txtTicketId;
    private javax.swing.JLabel txtTotal;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JLabel txtfirstname;
    private javax.swing.JLabel txtlastname;
    private javax.swing.JLabel txtpassportid;
    // End of variables declaration//GEN-END:variables
}
