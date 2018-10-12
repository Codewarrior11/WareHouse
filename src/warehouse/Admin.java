package warehouse;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Appel
 */
public class Admin extends javax.swing.JFrame {

    ddlclass oop = new ddlclass();
    Connection con;
    Statement st;
    ResultSet rs;
    String command;
    String path = null;
    ImageIcon myimage;
    PreparedStatement ps;
    String user;
    int xmouse;
    int ymouse;
    Date date;
    SimpleDateFormat sdf;

    public Admin(String mode, String user_name) {
        user = user_name;
        //AutoCompleteDecorator.decorate(trans_pname_combo);
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "warehouse", "1234");
            st = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        initComponents();

        if (mode == "Salse Officer") {
            view_p_update.hide();
            view_p_delete.hide();
            report_lbl.hide();
            r_lbl_icon.hide();
            add_p_icon.hide();
            add_pro_lbl.hide();
            view_supplier_lbl.hide();
            view_s_icon.hide();
            emp_lbl.hide();
            emp_icon.hide();
            b_lbl_icon.hide();
            branch_lbl.hide();
            add_supp_lbl.hide();
            add_s_icon.hide();
        } else if (mode == "Manager") {
            add_p_icon.hide();
            add_pro_lbl.hide();
            b_lbl_icon.hide();
            branch_lbl.hide();
            add_supp_lbl.hide();
            add_s_icon.hide();
        }
    }
    static boolean max = true;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        topbar = new javax.swing.JPanel();
        maximize = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sidepane = new javax.swing.JPanel();
        add_p_icon = new javax.swing.JLabel();
        add_pro_lbl = new javax.swing.JLabel();
        view_pro_lbl = new javax.swing.JLabel();
        view_supplier_lbl = new javax.swing.JLabel();
        emp_lbl = new javax.swing.JLabel();
        report_lbl = new javax.swing.JLabel();
        transaction_in_lbl = new javax.swing.JLabel();
        profile_lbl = new javax.swing.JLabel();
        logout_lbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        view_s_icon = new javax.swing.JLabel();
        emp_icon = new javax.swing.JLabel();
        r_lbl_icon = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        add_supp_lbl = new javax.swing.JLabel();
        add_s_icon = new javax.swing.JLabel();
        branch_lbl = new javax.swing.JLabel();
        b_lbl_icon = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        google_lbl = new javax.swing.JLabel();
        twitter_lbl = new javax.swing.JLabel();
        facebook_lbl = new javax.swing.JLabel();
        transaction_out_lbl = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        admin_menu = new javax.swing.JPanel();
        add_products = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        a_p_price = new javax.swing.JTextField();
        a_p_id = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        a_p_details = new javax.swing.JTextArea();
        a_p_unit = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        a_p_name = new javax.swing.JTextField();
        product_image_lbl = new javax.swing.JLabel();
        product_image_btn = new javax.swing.JButton();
        add_pro_cancel_btn = new javax.swing.JButton();
        add_pro_submit_btn = new javax.swing.JButton();
        view_product = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane7 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        v_p_id = new javax.swing.JTextField();
        v_p_name = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        v_p_details = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        v_p_price = new javax.swing.JTextField();
        v_p_stock = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        view_p_image_lbl = new javax.swing.JLabel();
        view_image_btn = new javax.swing.JButton();
        view_p_delete = new javax.swing.JButton();
        view_p_update = new javax.swing.JButton();
        search_box = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        add_supplier = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sup_email = new javax.swing.JTextField();
        sup_id = new javax.swing.JTextField();
        sup_name = new javax.swing.JTextField();
        sup_phone = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        sup_details = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        sup_address = new javax.swing.JTextArea();
        sup_cancel_btn = new javax.swing.JButton();
        sup_submit_btn = new javax.swing.JButton();
        view_supp_panel = new javax.swing.JPanel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        view_supp_table = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        view_sup_id = new javax.swing.JTextField();
        view_sup_phone = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        view_sup_address = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        view_sup_details = new javax.swing.JTextArea();
        view_sup_email = new javax.swing.JTextField();
        view_sup_name = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        supp_update = new javax.swing.JButton();
        supp_delete = new javax.swing.JButton();
        branch_panel = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        b_name_txt = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        b_phone_txt = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        b_address = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        branch_table = new javax.swing.JTable();
        new_br_btn = new javax.swing.JButton();
        delete_br_btn = new javax.swing.JButton();
        cancel_br_btn = new javax.swing.JButton();
        add_emp_man = new javax.swing.JPanel();
        emp_man_lbl = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        emp_man_id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        emp_man_name = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        emp_man_phone = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        emp_man_address = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        emp_man_join = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        emp_combo = new javax.swing.JComboBox();
        emp_image_lbl = new javax.swing.JLabel();
        emp_image_btn = new javax.swing.JButton();
        emp_submit_btn = new javax.swing.JButton();
        emp_cancel_btn = new javax.swing.JButton();
        emp_man_pass = new javax.swing.JPasswordField();
        emp_man_email = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        emp_user_name = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        view_emp_table = new javax.swing.JTable();
        emp_delete_btn = new javax.swing.JButton();
        emp_update_btn = new javax.swing.JButton();
        new_emp_btn = new javax.swing.JButton();
        transaction = new javax.swing.JPanel();
        t_lbl = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        transaction_no = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        s_lbl = new javax.swing.JLabel();
        trans_vat = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        supp_trans_combo = new javax.swing.JComboBox<String>();
        jLabel28 = new javax.swing.JLabel();
        trans_pname_combo = new javax.swing.JComboBox<String>();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        trans_pdetails = new javax.swing.JTextArea();
        trans_stock = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        trans_costper_unit = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        trans_amount = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        trans_date = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        trans_t_cost = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        transaction_submit = new javax.swing.JButton();
        transaction_cancel = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        trans_pid = new javax.swing.JTextField();
        b_lbl = new javax.swing.JLabel();
        branch_trans_combo = new javax.swing.JComboBox<String>();
        profile = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel43 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        pro_address = new javax.swing.JTextArea();
        pro_phone = new javax.swing.JTextField();
        pro_name = new javax.swing.JTextField();
        pro_fullname = new javax.swing.JTextField();
        pro_email = new javax.swing.JTextField();
        pro_cng_pass_btn = new javax.swing.JButton();
        pro_edit_btn = new javax.swing.JButton();
        pro_save_btn = new javax.swing.JButton();
        pro_cng_uname_btn = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        pro_newname = new javax.swing.JTextField();
        pro_old_uname = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        pro_old_pass = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        pro_new_pass = new javax.swing.JTextField();
        report_panel = new javax.swing.JPanel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel71 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1103, 674));
        setUndecorated(true);

        topbar.setBackground(new java.awt.Color(0, 0, 0));
        topbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topbarMousePressed(evt);
            }
        });
        topbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topbarMouseDragged(evt);
            }
        });

        maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Maximize Window_30px_1.png"))); // NOI18N
        maximize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizeMouseClicked(evt);
            }
        });

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Minimize Window_30px.png"))); // NOI18N
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Close Window_30px.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Warehouse_30px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WareHouse Management System");

        javax.swing.GroupLayout topbarLayout = new javax.swing.GroupLayout(topbar);
        topbar.setLayout(topbarLayout);
        topbarLayout.setHorizontalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(752, 752, 752)
                .addComponent(minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maximize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close)
                .addContainerGap())
        );
        topbarLayout.setVerticalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(topbarLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2))
            .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(maximize, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        sidepane.setBackground(new java.awt.Color(51, 51, 51));

        add_p_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Add_30px.png"))); // NOI18N

        add_pro_lbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        add_pro_lbl.setForeground(new java.awt.Color(255, 255, 255));
        add_pro_lbl.setText("Add Product");
        add_pro_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_pro_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_pro_lblMouseClicked(evt);
            }
        });

        view_pro_lbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        view_pro_lbl.setForeground(new java.awt.Color(255, 255, 255));
        view_pro_lbl.setText("View Product");
        view_pro_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view_pro_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_pro_lblMouseClicked(evt);
            }
        });

        view_supplier_lbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        view_supplier_lbl.setForeground(new java.awt.Color(255, 255, 255));
        view_supplier_lbl.setText("View Supplier");
        view_supplier_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view_supplier_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_supplier_lblMouseClicked(evt);
            }
        });

        emp_lbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emp_lbl.setForeground(new java.awt.Color(255, 255, 255));
        emp_lbl.setText("Employee");
        emp_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emp_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emp_lblMouseClicked(evt);
            }
        });

        report_lbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        report_lbl.setForeground(new java.awt.Color(255, 255, 255));
        report_lbl.setText("Report");
        report_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        report_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                report_lblMouseClicked(evt);
            }
        });

        transaction_in_lbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        transaction_in_lbl.setForeground(new java.awt.Color(255, 255, 255));
        transaction_in_lbl.setText("Transaction In");
        transaction_in_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transaction_in_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transaction_in_lblMouseClicked(evt);
            }
        });

        profile_lbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        profile_lbl.setForeground(new java.awt.Color(255, 255, 255));
        profile_lbl.setText("Profile");
        profile_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profile_lblMouseClicked(evt);
            }
        });

        logout_lbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        logout_lbl.setForeground(new java.awt.Color(255, 255, 255));
        logout_lbl.setText("Logout");
        logout_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_lblMouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Product_30px.png"))); // NOI18N

        view_s_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Circled User Male_30px_1.png"))); // NOI18N

        emp_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/User Groups_30px_1.png"))); // NOI18N

        r_lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Report Card_30px.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Transaction List_30px.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Administrator Male_30px.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logout Rounded Up_30px.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 204, 204));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Admin");

        add_supp_lbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        add_supp_lbl.setForeground(new java.awt.Color(255, 255, 255));
        add_supp_lbl.setText("Add Supplier");
        add_supp_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_supp_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_supp_lblMouseClicked(evt);
            }
        });

        add_s_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Key Exchange_30px.png"))); // NOI18N

        branch_lbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        branch_lbl.setForeground(new java.awt.Color(255, 255, 255));
        branch_lbl.setText("Branch");
        branch_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        branch_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                branch_lblMouseClicked(evt);
            }
        });

        b_lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Merge Git_30px.png"))); // NOI18N

        jLabel31.setForeground(new java.awt.Color(255, 51, 51));
        jLabel31.setText("Find Us On :");

        google_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Google_30px.png"))); // NOI18N
        google_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        google_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                google_lblMouseClicked(evt);
            }
        });

        twitter_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Twitter_30px.png"))); // NOI18N
        twitter_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twitter_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitter_lblMouseClicked(evt);
            }
        });

        facebook_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Facebook_30px.png"))); // NOI18N
        facebook_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facebook_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebook_lblMouseClicked(evt);
            }
        });

        transaction_out_lbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        transaction_out_lbl.setForeground(new java.awt.Color(255, 255, 255));
        transaction_out_lbl.setText("Transaction Out");
        transaction_out_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transaction_out_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transaction_out_lblMouseClicked(evt);
            }
        });

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Transaction List_30px.png"))); // NOI18N

        javax.swing.GroupLayout sidepaneLayout = new javax.swing.GroupLayout(sidepane);
        sidepane.setLayout(sidepaneLayout);
        sidepaneLayout.setHorizontalGroup(
            sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sidepaneLayout.createSequentialGroup()
                        .addComponent(add_p_icon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_pro_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sidepaneLayout.createSequentialGroup()
                        .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(view_s_icon)
                            .addComponent(emp_icon)
                            .addComponent(r_lbl_icon)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(view_pro_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(view_supplier_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emp_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(report_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(transaction_in_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepaneLayout.createSequentialGroup()
                        .addComponent(add_s_icon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_supp_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sidepaneLayout.createSequentialGroup()
                        .addComponent(b_lbl_icon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(branch_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sidepaneLayout.createSequentialGroup()
                        .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profile_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logout_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(sidepaneLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addGroup(sidepaneLayout.createSequentialGroup()
                                .addComponent(facebook_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(google_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(twitter_lbl)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(sidepaneLayout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transaction_out_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        sidepaneLayout.setVerticalGroup(
            sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepaneLayout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_pro_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_p_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(view_pro_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_supp_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_s_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(view_supplier_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(view_s_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emp_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emp_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(branch_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_lbl_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(report_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r_lbl_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transaction_in_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transaction_out_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profile_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logout_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(google_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twitter_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facebook_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        admin_menu.setBackground(new java.awt.Color(51, 51, 51));
        admin_menu.setLayout(new java.awt.CardLayout());

        add_products.setBackground(new java.awt.Color(51, 51, 51));
        add_products.setForeground(new java.awt.Color(255, 255, 255));
        add_products.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add_products.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("New Product");
        add_products.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 500, 30));
        add_products.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 180, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cost Per Unit : ");
        add_products.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 100, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Product Id : ");
        add_products.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 130, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Product Name : ");
        add_products.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 120, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Unit Type : ");
        add_products.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 120, -1));

        a_p_price.setBackground(new java.awt.Color(102, 102, 102));
        a_p_price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        a_p_price.setForeground(new java.awt.Color(255, 255, 255));
        a_p_price.setCaretColor(new java.awt.Color(255, 255, 255));
        a_p_price.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        add_products.add(a_p_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 280, 30));

        a_p_id.setBackground(new java.awt.Color(102, 102, 102));
        a_p_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        a_p_id.setForeground(new java.awt.Color(255, 255, 255));
        a_p_id.setCaretColor(new java.awt.Color(255, 255, 255));
        a_p_id.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        add_products.add(a_p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 270, 30));

        jTextField3.setBackground(new java.awt.Color(102, 102, 102));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField3.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        add_products.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 270, 30));

        a_p_details.setBackground(new java.awt.Color(102, 102, 102));
        a_p_details.setColumns(20);
        a_p_details.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        a_p_details.setForeground(new java.awt.Color(255, 255, 255));
        a_p_details.setLineWrap(true);
        a_p_details.setRows(5);
        a_p_details.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(a_p_details);

        add_products.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 280, 160));

        a_p_unit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kg", "L", "Ml", "Pcs", "Lb", "gm", "Small", "Midium", "Large" }));
        add_products.add(a_p_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 270, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Product Details : ");
        add_products.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 110, -1));

        a_p_name.setBackground(new java.awt.Color(102, 102, 102));
        a_p_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        a_p_name.setForeground(new java.awt.Color(255, 255, 255));
        a_p_name.setCaretColor(new java.awt.Color(255, 255, 255));
        a_p_name.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        add_products.add(a_p_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 270, 30));

        product_image_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add_products.add(product_image_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 180, 150));

        product_image_btn.setBackground(new java.awt.Color(153, 153, 153));
        product_image_btn.setText("Browse Image");
        product_image_btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Add_30px.png"))); // NOI18N
        product_image_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_image_btnActionPerformed(evt);
            }
        });
        add_products.add(product_image_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 283, 160, 40));

        add_pro_cancel_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add_pro_cancel_btn.setForeground(new java.awt.Color(255, 51, 153));
        add_pro_cancel_btn.setText("Cancel");
        add_pro_cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_pro_cancel_btnActionPerformed(evt);
            }
        });
        add_products.add(add_pro_cancel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 90, -1));

        add_pro_submit_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add_pro_submit_btn.setForeground(new java.awt.Color(255, 51, 153));
        add_pro_submit_btn.setText("Submit");
        add_pro_submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_pro_submit_btnActionPerformed(evt);
            }
        });
        add_products.add(add_pro_submit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, 90, -1));

        admin_menu.add(add_products, "card2");

        view_product.setBackground(new java.awt.Color(51, 51, 51));
        view_product.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("View Product");
        view_product.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 500, 30));
        view_product.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 180, -1));

        product_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        product_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_tableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(product_table);

        view_product.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 460, 470));

        v_p_id.setBackground(new java.awt.Color(102, 102, 102));
        v_p_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        v_p_id.setForeground(new java.awt.Color(255, 255, 255));
        v_p_id.setCaretColor(new java.awt.Color(255, 255, 255));
        v_p_id.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        view_product.add(v_p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 270, 30));

        v_p_name.setBackground(new java.awt.Color(102, 102, 102));
        v_p_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        v_p_name.setForeground(new java.awt.Color(255, 255, 255));
        v_p_name.setCaretColor(new java.awt.Color(255, 255, 255));
        v_p_name.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        view_product.add(v_p_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 270, 30));

        v_p_details.setBackground(new java.awt.Color(102, 102, 102));
        v_p_details.setColumns(20);
        v_p_details.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        v_p_details.setForeground(new java.awt.Color(255, 255, 255));
        v_p_details.setLineWrap(true);
        v_p_details.setRows(5);
        v_p_details.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane6.setViewportView(v_p_details);

        view_product.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 270, 160));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Product Details : ");
        view_product.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 110, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Product Name : ");
        view_product.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 120, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Product Id : ");
        view_product.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 130, 30));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Cost Per Unit : ");
        view_product.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 100, 30));

        v_p_price.setBackground(new java.awt.Color(102, 102, 102));
        v_p_price.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        v_p_price.setForeground(new java.awt.Color(255, 51, 51));
        v_p_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        v_p_price.setCaretColor(new java.awt.Color(255, 255, 255));
        v_p_price.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        view_product.add(v_p_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 280, 30));

        v_p_stock.setBackground(new java.awt.Color(102, 102, 102));
        v_p_stock.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        v_p_stock.setForeground(new java.awt.Color(255, 51, 51));
        v_p_stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        v_p_stock.setCaretColor(new java.awt.Color(255, 255, 255));
        v_p_stock.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        view_product.add(v_p_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 280, 30));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("STOCK");
        view_product.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 100, 30));

        view_p_image_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        view_product.add(view_p_image_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, 170, 140));

        view_image_btn.setText("Browse Image");
        view_image_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_image_btnActionPerformed(evt);
            }
        });
        view_product.add(view_image_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 150, -1));

        view_p_delete.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        view_p_delete.setText("Delete");
        view_p_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_p_deleteActionPerformed(evt);
            }
        });
        view_product.add(view_p_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 650, -1, -1));

        view_p_update.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        view_p_update.setText("Update");
        view_p_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_p_updateActionPerformed(evt);
            }
        });
        view_product.add(view_p_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 650, -1, -1));

        search_box.setBackground(new java.awt.Color(51, 51, 51));
        search_box.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_box.setForeground(new java.awt.Color(255, 255, 255));
        search_box.setCaretColor(new java.awt.Color(255, 255, 255));
        view_product.add(search_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 34, 230, 30));

        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        view_product.add(search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 33, -1, 30));

        admin_menu.add(view_product, "card3");

        add_supplier.setBackground(new java.awt.Color(51, 51, 51));
        add_supplier.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Add Supplier");
        add_supplier.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 500, 30));
        add_supplier.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 180, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Details :");
        add_supplier.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 100, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Supplier Id :");
        add_supplier.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 100, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Supplier Name :");
        add_supplier.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 100, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Phone :");
        add_supplier.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 100, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Email :");
        add_supplier.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 100, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Address :");
        add_supplier.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 100, 20));

        sup_email.setBackground(new java.awt.Color(51, 51, 51));
        sup_email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sup_email.setForeground(new java.awt.Color(255, 255, 255));
        add_supplier.add(sup_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 270, 30));

        sup_id.setBackground(new java.awt.Color(51, 51, 51));
        sup_id.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sup_id.setForeground(new java.awt.Color(255, 255, 255));
        add_supplier.add(sup_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 270, 30));

        sup_name.setBackground(new java.awt.Color(51, 51, 51));
        sup_name.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sup_name.setForeground(new java.awt.Color(255, 255, 255));
        add_supplier.add(sup_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 270, 30));

        sup_phone.setBackground(new java.awt.Color(51, 51, 51));
        sup_phone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sup_phone.setForeground(new java.awt.Color(255, 255, 255));
        add_supplier.add(sup_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 270, 30));

        sup_details.setBackground(new java.awt.Color(51, 51, 51));
        sup_details.setColumns(20);
        sup_details.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        sup_details.setForeground(new java.awt.Color(255, 255, 255));
        sup_details.setLineWrap(true);
        sup_details.setRows(5);
        sup_details.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(sup_details);

        add_supplier.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 270, -1));

        sup_address.setBackground(new java.awt.Color(51, 51, 51));
        sup_address.setColumns(20);
        sup_address.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        sup_address.setForeground(new java.awt.Color(255, 255, 255));
        sup_address.setLineWrap(true);
        sup_address.setRows(5);
        sup_address.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(sup_address);

        add_supplier.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 270, -1));

        sup_cancel_btn.setBackground(new java.awt.Color(153, 153, 153));
        sup_cancel_btn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sup_cancel_btn.setForeground(new java.awt.Color(51, 51, 255));
        sup_cancel_btn.setText("Cancel");
        sup_cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_cancel_btnActionPerformed(evt);
            }
        });
        add_supplier.add(sup_cancel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 110, -1));

        sup_submit_btn.setBackground(new java.awt.Color(153, 153, 153));
        sup_submit_btn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sup_submit_btn.setForeground(new java.awt.Color(51, 51, 255));
        sup_submit_btn.setText("Submit");
        sup_submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_submit_btnActionPerformed(evt);
            }
        });
        add_supplier.add(sup_submit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 110, -1));

        admin_menu.add(add_supplier, "card4");

        view_supp_panel.setBackground(new java.awt.Color(51, 51, 51));
        view_supp_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        view_supp_panel.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 170, 20));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Supplier");
        view_supp_panel.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 500, 30));

        view_supp_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        view_supp_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_supp_tableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(view_supp_table);

        view_supp_panel.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 700, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel56.setText("Details :");
        view_supp_panel.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, 100, 30));

        view_sup_id.setBackground(new java.awt.Color(51, 51, 51));
        view_sup_id.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        view_sup_id.setForeground(new java.awt.Color(255, 255, 255));
        view_supp_panel.add(view_sup_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 270, 30));

        view_sup_phone.setBackground(new java.awt.Color(51, 51, 51));
        view_sup_phone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        view_sup_phone.setForeground(new java.awt.Color(255, 255, 255));
        view_supp_panel.add(view_sup_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 270, 30));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel57.setText("Phone :");
        view_supp_panel.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 100, 20));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel58.setText("Address :");
        view_supp_panel.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 100, 20));

        view_sup_address.setBackground(new java.awt.Color(51, 51, 51));
        view_sup_address.setColumns(20);
        view_sup_address.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        view_sup_address.setForeground(new java.awt.Color(255, 255, 255));
        view_sup_address.setLineWrap(true);
        view_sup_address.setRows(5);
        view_sup_address.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane9.setViewportView(view_sup_address);

        view_supp_panel.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, 270, -1));

        view_sup_details.setBackground(new java.awt.Color(51, 51, 51));
        view_sup_details.setColumns(20);
        view_sup_details.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        view_sup_details.setForeground(new java.awt.Color(255, 255, 255));
        view_sup_details.setLineWrap(true);
        view_sup_details.setRows(5);
        view_sup_details.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane10.setViewportView(view_sup_details);

        view_supp_panel.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, 270, -1));

        view_sup_email.setBackground(new java.awt.Color(51, 51, 51));
        view_sup_email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        view_sup_email.setForeground(new java.awt.Color(255, 255, 255));
        view_supp_panel.add(view_sup_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 270, 30));

        view_sup_name.setBackground(new java.awt.Color(51, 51, 51));
        view_sup_name.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        view_sup_name.setForeground(new java.awt.Color(255, 255, 255));
        view_supp_panel.add(view_sup_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 270, 30));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel59.setText("Supplier Id :");
        view_supp_panel.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 100, 30));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel60.setText("Supplier Name :");
        view_supp_panel.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 100, 30));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel61.setText("Email :");
        view_supp_panel.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 100, 30));

        supp_update.setText("Update");
        supp_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supp_updateActionPerformed(evt);
            }
        });
        view_supp_panel.add(supp_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 640, -1, -1));

        supp_delete.setText("Delete");
        supp_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supp_deleteActionPerformed(evt);
            }
        });
        view_supp_panel.add(supp_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 640, -1, -1));

        admin_menu.add(view_supp_panel, "card9");

        branch_panel.setBackground(new java.awt.Color(51, 51, 51));
        branch_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Branch");
        branch_panel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 500, 30));
        branch_panel.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 180, -1));

        b_name_txt.setBackground(new java.awt.Color(51, 51, 51));
        b_name_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        b_name_txt.setForeground(new java.awt.Color(255, 255, 255));
        branch_panel.add(b_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 270, 30));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel62.setText("Branch Name :");
        branch_panel.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 110, 30));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel63.setText("Branch Address :");
        branch_panel.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, 30));

        b_phone_txt.setBackground(new java.awt.Color(51, 51, 51));
        b_phone_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        b_phone_txt.setForeground(new java.awt.Color(255, 255, 255));
        branch_panel.add(b_phone_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 270, 30));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel64.setText("Branch Phone :");
        branch_panel.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 110, 30));

        b_address.setBackground(new java.awt.Color(51, 51, 51));
        b_address.setColumns(20);
        b_address.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        b_address.setForeground(new java.awt.Color(255, 255, 255));
        b_address.setLineWrap(true);
        b_address.setRows(5);
        jScrollPane12.setViewportView(b_address);

        branch_panel.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 270, 150));

        branch_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        branch_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                branch_tableMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(branch_table);

        branch_panel.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, 310));

        new_br_btn.setText("New");
        new_br_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_br_btnActionPerformed(evt);
            }
        });
        branch_panel.add(new_br_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 630, 70, -1));

        delete_br_btn.setText("Delete");
        delete_br_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_br_btnActionPerformed(evt);
            }
        });
        branch_panel.add(delete_br_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 630, -1, -1));

        cancel_br_btn.setText("cancel");
        cancel_br_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_br_btnActionPerformed(evt);
            }
        });
        branch_panel.add(cancel_br_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 630, -1, -1));

        admin_menu.add(branch_panel, "card6");

        add_emp_man.setBackground(new java.awt.Color(51, 51, 51));
        add_emp_man.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emp_man_lbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        emp_man_lbl.setForeground(new java.awt.Color(255, 255, 255));
        emp_man_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emp_man_lbl.setText("Employee");
        add_emp_man.add(emp_man_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 500, 30));
        add_emp_man.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 210, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Id :");
        add_emp_man.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 100, 30));

        emp_man_id.setEditable(false);
        emp_man_id.setBackground(new java.awt.Color(51, 51, 51));
        emp_man_id.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emp_man_id.setForeground(new java.awt.Color(255, 255, 255));
        add_emp_man.add(emp_man_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 270, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Full Name :");
        add_emp_man.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 100, 30));

        emp_man_name.setBackground(new java.awt.Color(51, 51, 51));
        emp_man_name.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emp_man_name.setForeground(new java.awt.Color(255, 255, 255));
        add_emp_man.add(emp_man_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 270, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Phone :");
        add_emp_man.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 100, 30));

        emp_man_phone.setBackground(new java.awt.Color(51, 51, 51));
        emp_man_phone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emp_man_phone.setForeground(new java.awt.Color(255, 255, 255));
        add_emp_man.add(emp_man_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 270, 30));

        emp_man_address.setBackground(new java.awt.Color(51, 51, 51));
        emp_man_address.setColumns(20);
        emp_man_address.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        emp_man_address.setForeground(new java.awt.Color(255, 255, 255));
        emp_man_address.setRows(5);
        emp_man_address.setWrapStyleWord(true);
        emp_man_address.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(emp_man_address);

        add_emp_man.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 270, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Designation:");
        add_emp_man.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 100, 20));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Email :");
        add_emp_man.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 100, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Joining Date :");
        add_emp_man.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 100, 30));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Password :");
        add_emp_man.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 100, 30));

        emp_man_join.setBackground(new java.awt.Color(51, 51, 51));
        emp_man_join.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emp_man_join.setForeground(new java.awt.Color(255, 255, 255));
        add_emp_man.add(emp_man_join, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 270, 30));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Address :");
        add_emp_man.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 100, 20));

        emp_combo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emp_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Salse Officer", "Manager", "Admin" }));
        add_emp_man.add(emp_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 180, -1));

        emp_image_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add_emp_man.add(emp_image_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 80, 170, 140));

        emp_image_btn.setText("Browse Image");
        emp_image_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_image_btnActionPerformed(evt);
            }
        });
        add_emp_man.add(emp_image_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 240, 150, -1));

        emp_submit_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emp_submit_btn.setForeground(new java.awt.Color(255, 0, 51));
        emp_submit_btn.setText("Submit");
        emp_submit_btn.setEnabled(false);
        emp_submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_submit_btnActionPerformed(evt);
            }
        });
        add_emp_man.add(emp_submit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 630, -1, -1));

        emp_cancel_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emp_cancel_btn.setForeground(new java.awt.Color(255, 0, 51));
        emp_cancel_btn.setText("Cancel");
        emp_cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_cancel_btnActionPerformed(evt);
            }
        });
        add_emp_man.add(emp_cancel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 630, -1, -1));

        emp_man_pass.setBackground(new java.awt.Color(51, 51, 51));
        emp_man_pass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emp_man_pass.setForeground(new java.awt.Color(255, 255, 255));
        emp_man_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emp_man_pass.setCaretColor(new java.awt.Color(255, 255, 255));
        add_emp_man.add(emp_man_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 270, 30));

        emp_man_email.setBackground(new java.awt.Color(51, 51, 51));
        emp_man_email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emp_man_email.setForeground(new java.awt.Color(255, 255, 255));
        add_emp_man.add(emp_man_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 270, 30));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("User Name");
        add_emp_man.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 100, 30));

        emp_user_name.setBackground(new java.awt.Color(51, 51, 51));
        emp_user_name.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emp_user_name.setForeground(new java.awt.Color(255, 255, 255));
        add_emp_man.add(emp_user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 270, 30));

        view_emp_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        view_emp_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        view_emp_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_emp_tableMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(view_emp_table);

        add_emp_man.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 460, 510));

        emp_delete_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emp_delete_btn.setForeground(new java.awt.Color(255, 0, 51));
        emp_delete_btn.setText("Delete");
        emp_delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_delete_btnActionPerformed(evt);
            }
        });
        add_emp_man.add(emp_delete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 630, -1, -1));

        emp_update_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emp_update_btn.setForeground(new java.awt.Color(255, 0, 51));
        emp_update_btn.setText("Update");
        emp_update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_update_btnActionPerformed(evt);
            }
        });
        add_emp_man.add(emp_update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 630, -1, -1));

        new_emp_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        new_emp_btn.setForeground(new java.awt.Color(255, 0, 51));
        new_emp_btn.setText("New");
        new_emp_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_emp_btnActionPerformed(evt);
            }
        });
        add_emp_man.add(new_emp_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 630, 80, -1));

        admin_menu.add(add_emp_man, "card5");

        transaction.setBackground(new java.awt.Color(51, 51, 51));
        transaction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_lbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        t_lbl.setForeground(new java.awt.Color(255, 255, 255));
        t_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t_lbl.setText("Transaction");
        transaction.add(t_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 500, 30));
        transaction.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 210, 10));

        transaction_no.setBackground(new java.awt.Color(51, 51, 51));
        transaction_no.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        transaction_no.setForeground(new java.awt.Color(255, 255, 255));
        transaction.add(transaction_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 220, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Transaction No :");
        transaction.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 30));

        s_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s_lbl.setForeground(new java.awt.Color(255, 255, 255));
        s_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        s_lbl.setText("Supplier :");
        transaction.add(s_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, 30));

        trans_vat.setBackground(new java.awt.Color(51, 51, 51));
        trans_vat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        trans_vat.setForeground(new java.awt.Color(255, 255, 255));
        trans_vat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                trans_vatFocusLost(evt);
            }
        });
        transaction.add(trans_vat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 220, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Product Details :");
        transaction.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 100, 30));

        transaction.add(supp_trans_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 220, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Product Name :");
        transaction.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 100, 30));

        trans_pname_combo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                trans_pname_comboPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        transaction.add(trans_pname_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 220, 30));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Vat :");
        transaction.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 100, 30));

        trans_pdetails.setBackground(new java.awt.Color(51, 51, 51));
        trans_pdetails.setColumns(20);
        trans_pdetails.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        trans_pdetails.setForeground(new java.awt.Color(255, 255, 255));
        trans_pdetails.setLineWrap(true);
        trans_pdetails.setRows(5);
        jScrollPane14.setViewportView(trans_pdetails);

        transaction.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 220, 90));

        trans_stock.setBackground(new java.awt.Color(51, 51, 51));
        trans_stock.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        trans_stock.setForeground(new java.awt.Color(255, 255, 255));
        transaction.add(trans_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 220, 30));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel65.setText("In Stock :");
        transaction.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 100, 30));

        trans_costper_unit.setBackground(new java.awt.Color(51, 51, 51));
        trans_costper_unit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        trans_costper_unit.setForeground(new java.awt.Color(255, 255, 255));
        transaction.add(trans_costper_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 220, 30));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel66.setText("Cost Per Unit :");
        transaction.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 100, 30));

        trans_amount.setBackground(new java.awt.Color(51, 51, 51));
        trans_amount.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        trans_amount.setForeground(new java.awt.Color(255, 255, 255));
        trans_amount.setCaretColor(new java.awt.Color(255, 255, 255));
        trans_amount.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        trans_amount.setSelectionStart(1);
        trans_amount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                trans_amountFocusLost(evt);
            }
        });
        transaction.add(trans_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 220, 30));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel67.setText("Amount :");
        transaction.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 100, 30));

        trans_date.setEditable(false);
        trans_date.setBackground(new java.awt.Color(51, 51, 51));
        trans_date.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        trans_date.setForeground(new java.awt.Color(255, 255, 255));
        trans_date.setToolTipText("If You show that the date is Incorrect. Please check your System Date ");
        transaction.add(trans_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 220, 30));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel68.setText("Date :");
        transaction.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 100, 30));

        trans_t_cost.setBackground(new java.awt.Color(51, 51, 51));
        trans_t_cost.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        trans_t_cost.setForeground(new java.awt.Color(255, 255, 255));
        transaction.add(trans_t_cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 220, 30));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel69.setText("Total Cost :");
        transaction.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 100, 30));

        transaction_submit.setText("Submit");
        transaction_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaction_submitActionPerformed(evt);
            }
        });
        transaction.add(transaction_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 630, -1, -1));

        transaction_cancel.setText("Cancel");
        transaction_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaction_cancelActionPerformed(evt);
            }
        });
        transaction.add(transaction_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 630, -1, -1));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel70.setText("Product Id:");
        transaction.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 100, 30));

        trans_pid.setBackground(new java.awt.Color(51, 51, 51));
        trans_pid.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        trans_pid.setForeground(new java.awt.Color(255, 255, 255));
        transaction.add(trans_pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 220, 30));

        b_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b_lbl.setForeground(new java.awt.Color(255, 255, 255));
        b_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        b_lbl.setText("Branch :");
        transaction.add(b_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 30));

        transaction.add(branch_trans_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 220, 30));

        admin_menu.add(transaction, "card6");

        profile.setBackground(new java.awt.Color(51, 51, 51));
        profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Profile");
        profile.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 500, 30));
        profile.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 170, 20));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("New User Name :");
        profile.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 110, 30));
        profile.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 220, -1));
        profile.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 220, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Full Name :");
        profile.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 30));
        profile.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 220, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Email :");
        profile.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 100, 30));
        profile.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 220, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Address :");
        profile.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, 30));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Phone :");
        profile.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, 30));

        pro_address.setBackground(new java.awt.Color(51, 51, 51));
        pro_address.setColumns(20);
        pro_address.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        pro_address.setForeground(new java.awt.Color(255, 255, 255));
        pro_address.setLineWrap(true);
        pro_address.setRows(5);
        pro_address.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(pro_address);

        profile.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 230, 110));

        pro_phone.setBackground(new java.awt.Color(51, 51, 51));
        pro_phone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pro_phone.setForeground(new java.awt.Color(255, 255, 255));
        pro_phone.setBorder(null);
        pro_phone.setCaretColor(new java.awt.Color(255, 255, 255));
        pro_phone.setOpaque(false);
        profile.add(pro_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 220, 30));

        pro_name.setBackground(new java.awt.Color(51, 51, 51));
        pro_name.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pro_name.setForeground(new java.awt.Color(255, 255, 255));
        pro_name.setBorder(null);
        pro_name.setCaretColor(new java.awt.Color(255, 255, 255));
        pro_name.setOpaque(false);
        profile.add(pro_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 220, 30));

        pro_fullname.setBackground(new java.awt.Color(51, 51, 51));
        pro_fullname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pro_fullname.setForeground(new java.awt.Color(255, 255, 255));
        pro_fullname.setBorder(null);
        pro_fullname.setCaretColor(new java.awt.Color(255, 255, 255));
        pro_fullname.setOpaque(false);
        profile.add(pro_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 220, 30));

        pro_email.setBackground(new java.awt.Color(51, 51, 51));
        pro_email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pro_email.setForeground(new java.awt.Color(255, 255, 255));
        pro_email.setBorder(null);
        pro_email.setCaretColor(new java.awt.Color(255, 255, 255));
        pro_email.setOpaque(false);
        profile.add(pro_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 220, 30));

        pro_cng_pass_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pro_cng_pass_btn.setText("Change Password");
        profile.add(pro_cng_pass_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 160, 20));

        pro_edit_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pro_edit_btn.setForeground(new java.awt.Color(255, 51, 153));
        pro_edit_btn.setText("Edit");
        pro_edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_edit_btnActionPerformed(evt);
            }
        });
        profile.add(pro_edit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 90, -1));

        pro_save_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pro_save_btn.setForeground(new java.awt.Color(255, 51, 153));
        pro_save_btn.setText("Save");
        profile.add(pro_save_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 90, -1));

        pro_cng_uname_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pro_cng_uname_btn.setText("Change User Name");
        pro_cng_uname_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_cng_uname_btnActionPerformed(evt);
            }
        });
        profile.add(pro_cng_uname_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 109, 160, 20));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("User Name :");
        profile.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 30));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("Old User Name :");
        profile.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 110, 30));

        pro_newname.setBackground(new java.awt.Color(51, 51, 51));
        pro_newname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pro_newname.setForeground(new java.awt.Color(255, 255, 255));
        pro_newname.setCaretColor(new java.awt.Color(255, 255, 255));
        profile.add(pro_newname, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 150, 30));

        pro_old_uname.setBackground(new java.awt.Color(51, 51, 51));
        pro_old_uname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pro_old_uname.setForeground(new java.awt.Color(255, 255, 255));
        pro_old_uname.setCaretColor(new java.awt.Color(255, 255, 255));
        profile.add(pro_old_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 150, 30));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel50.setText("Old Password :");
        profile.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 110, 30));

        pro_old_pass.setBackground(new java.awt.Color(51, 51, 51));
        pro_old_pass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pro_old_pass.setForeground(new java.awt.Color(255, 255, 255));
        pro_old_pass.setCaretColor(new java.awt.Color(255, 255, 255));
        profile.add(pro_old_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 130, 30));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("New Password :");
        profile.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 110, 30));

        pro_new_pass.setBackground(new java.awt.Color(51, 51, 51));
        pro_new_pass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pro_new_pass.setForeground(new java.awt.Color(255, 255, 255));
        pro_new_pass.setCaretColor(new java.awt.Color(255, 255, 255));
        profile.add(pro_new_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 130, 30));

        admin_menu.add(profile, "card6");

        report_panel.setBackground(new java.awt.Color(51, 51, 51));
        report_panel.setForeground(new java.awt.Color(255, 255, 255));
        report_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        report_panel.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 170, 20));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Report");
        report_panel.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 500, 30));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        report_panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1180, 620));

        admin_menu.add(report_panel, "card10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidepane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admin_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidepane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admin_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked


    private void maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseClicked

        if (max) {
            Admin.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Admin.this.setMaximizedBounds(env.getMaximumWindowBounds());
            max = false;
        } else {
            setExtendedState(JFrame.NORMAL);
            max = true;
        }
    }//GEN-LAST:event_maximizeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    //************************************
    //Auto Genarated Id
    public String autoid(String type){
        date=new Date();
        sdf=new SimpleDateFormat("dMms");
        return type+sdf.format(date);
    }
    
    
    
    private void add_pro_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_pro_lblMouseClicked
        admin_menu.removeAll();
        cardshow();
        a_p_id.setText(autoid("P_"));
        admin_menu.add(add_products);
        cardshow();

    }//GEN-LAST:event_add_pro_lblMouseClicked

    private void view_pro_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_pro_lblMouseClicked
        admin_menu.removeAll();
        cardshow();
        admin_menu.add(view_product);
        //this table show all products in view product panel
        p_view_table("Select *from product");
        cardshow();

    }//GEN-LAST:event_view_pro_lblMouseClicked

    private void add_supp_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_supp_lblMouseClicked
        admin_menu.removeAll();
        cardshow();
        sup_id.setText(autoid("S_"));
        admin_menu.add(add_supplier);
        cardshow();
    }//GEN-LAST:event_add_supp_lblMouseClicked

    private void view_supplier_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_supplier_lblMouseClicked

        admin_menu.removeAll();
        cardshow();
        admin_menu.add(view_supp_panel);
        //this table show the supplier information
        supplier_table();
        cardshow();
    }//GEN-LAST:event_view_supplier_lblMouseClicked

    private void emp_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emp_lblMouseClicked
        emp_man_lbl.setText("Employee");
        admin_menu.removeAll();
        cardshow();
        emp_man_id.setText(autoid("E_"));
        admin_menu.add(add_emp_man);
        //this table show thEmployee information
        employee_table();
        cardshow();
    }//GEN-LAST:event_emp_lblMouseClicked

    private void branch_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_branch_lblMouseClicked
        admin_menu.removeAll();
        cardshow();
        admin_menu.add(branch_panel);
        //this table show the supplier information
        branch_table();
        cardshow();
    }//GEN-LAST:event_branch_lblMouseClicked

    private void report_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_report_lblMouseClicked
        admin_menu.removeAll();
        cardshow();
        admin_menu.add(report_panel);
        HashMap map = new HashMap();
        //map.put("p_id", 4);
        try {
            JasperPrint print1 = JasperFillManager.fillReport("C:\\Users\\Appel\\Documents\\NetBeansProjects\\Ware_house_management\\src\\warehouse\\report1.jasper", null, con);
            JRViewer viewer = new JRViewer(print1);
            //Container c=getContentPane();
            //c.add(viewer);
            jPanel1.removeAll();
            jPanel1.repaint();
            jPanel1.revalidate();
            jPanel1.add(viewer);
            jPanel1.repaint();
            jPanel1.revalidate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        cardshow();
    }//GEN-LAST:event_report_lblMouseClicked

    private void transaction_in_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaction_in_lblMouseClicked
        admin_menu.removeAll();
        cardshow();
        transaction_no.setText(autoid("TI_"));
        admin_menu.add(transaction);
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
        trans_date.setText(sdf.format(date));
        t_lbl.setText("Transaction In");
        s_lbl.show();
        supp_trans_combo.show();
        b_lbl.hide();
        branch_trans_combo.hide();
        //This method retrive product,supplier_name,branch_name information and set it to text fields
        transactionIn();
        cardshow();
    }//GEN-LAST:event_transaction_in_lblMouseClicked

    //Transaction in Method...
    public void transactionIn() {
        try {
            rs = st.executeQuery("select p_name from product");
            trans_pname_combo.removeAllItems();
            supp_trans_combo.removeAllItems();
            branch_trans_combo.removeAllItems();
            while (rs.next()) {
                trans_pname_combo.addItem(rs.getString("p_name"));
            }
            rs = st.executeQuery("select s_name from supplier");
            while (rs.next()) {
                supp_trans_combo.addItem(rs.getString("s_name"));
            }
            rs = st.executeQuery("select branch_name from branch");
            while (rs.next()) {
                branch_trans_combo.addItem(rs.getString("branch_name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void profile_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_lblMouseClicked
        admin_menu.removeAll();
        cardshow();
        admin_menu.add(profile);
        command = "select *from employee where user_name='" + user + "'";
        try {
            rs = st.executeQuery(command);
            while (rs.next()) {
                pro_name.setText(rs.getString("user_name"));
                pro_fullname.setText(rs.getString("emp_name"));
                pro_email.setText(rs.getString("emp_email"));
                pro_phone.setText(rs.getString("emp_phone"));
                pro_address.setText(rs.getString("emp_address"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        cardshow();
    }//GEN-LAST:event_profile_lblMouseClicked

    private void facebook_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebook_lblMouseClicked
        website("www.facebook.com/appel11.akib");
    }//GEN-LAST:event_facebook_lblMouseClicked

    private void google_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_google_lblMouseClicked
        website("https://plus.google.com/u/0/106097915108353008694");
    }//GEN-LAST:event_google_lblMouseClicked

    private void twitter_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitter_lblMouseClicked
        website("https://mobile.twitter.com/appelmahmudakib");
    }//GEN-LAST:event_twitter_lblMouseClicked

    private void add_pro_cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_pro_cancel_btnActionPerformed

        a_p_cancel();
    }//GEN-LAST:event_add_pro_cancel_btnActionPerformed

    private void sup_cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_cancel_btnActionPerformed
        a_s_cancel();
    }//GEN-LAST:event_sup_cancel_btnActionPerformed

    private void emp_cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_cancel_btnActionPerformed
        emp_cancel();
    }//GEN-LAST:event_emp_cancel_btnActionPerformed

    private void pro_edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_edit_btnActionPerformed
        pro_edit_btn();
    }//GEN-LAST:event_pro_edit_btnActionPerformed

    //Insert button code for add supplier
    private void sup_submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_submit_btnActionPerformed
        command = "Insert into supplier values(" + Integer.parseInt(sup_id.getText()) + ",'" + sup_name.getText() + "','" + sup_email.getText() + "','" + sup_phone.getText() + "','" + sup_address.getText() + "','" + sup_details.getText() + "')";
        try {
            st.executeUpdate(command);
            JOptionPane.showMessageDialog(null, "Data Insert successful");
            a_s_cancel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sup_submit_btnActionPerformed

    private void emp_image_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_image_btnActionPerformed

        fileopen();
        myimage = new ImageIcon(path);
        emp_image_lbl.setIcon(new ImageIcon(myimage.getImage().getScaledInstance(emp_image_lbl.getWidth(), emp_image_lbl.getHeight(), Image.SCALE_SMOOTH)));
        //emp_image_lbl.setIcon(path);
    }//GEN-LAST:event_emp_image_btnActionPerformed

    private void emp_submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_submit_btnActionPerformed

        //InputStream ism=new FileInputStream(new File(path));
        //command="Insert into employee values("+Integer.parseInt(emp_man_id.getText())+",'"+emp_man_name.getText()+"','"+emp_man_email.getText()+"','"+emp_man_phone.getText()+"','"+emp_man_pass.getText()+"','"+emp_combo.getSelectedItem()+"','"+emp_man_join.getText()+"',?,'"+emp_man_address.getText()+"')";
        command = "Insert into employee values(?,?,?,?,?,?,?,?,?,?)";
        try {
            InputStream ism = new FileInputStream(new File(path));
            ps = con.prepareStatement(command);
            ps.setInt(1, Integer.parseInt(emp_man_id.getText()));
            ps.setString(2, emp_man_name.getText());
            ps.setString(3, emp_man_email.getText());
            ps.setString(4, emp_man_phone.getText());
            ps.setString(5, emp_man_pass.getText());
            ps.setString(6, emp_combo.getSelectedItem().toString());
            ps.setString(7, emp_man_join.getText());
            ps.setBlob(8, ism);
            ps.setString(9, emp_man_address.getText());
            ps.setString(10, emp_user_name.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Insert successful");
            emp_cancel();
            employee_table();
            emp_delete_btn.setEnabled(true);
            emp_update_btn.setEnabled(true);
            new_emp_btn.setEnabled(true);
            emp_submit_btn.setEnabled(false);
            emp_man_id.setEditable(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_emp_submit_btnActionPerformed

    private void pro_cng_uname_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_cng_uname_btnActionPerformed
        System.out.println("Change Usename button clicked");
    }//GEN-LAST:event_pro_cng_uname_btnActionPerformed

    private void add_pro_submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_pro_submit_btnActionPerformed

        try {
            InputStream ism = new FileInputStream(new File(path));
            command = "Insert into product values(?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(command);
            ps.setInt(1, Integer.parseInt(a_p_id.getText()));
            ps.setString(2, a_p_name.getText());
            ps.setString(3, a_p_details.getText());
            ps.setInt(4, Integer.parseInt(a_p_price.getText()));
            ps.setString(5, a_p_unit.getSelectedItem().toString());
            ps.setBlob(6, ism);
            ps.setInt(7, 0);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "New Product Added Successfully");
                a_p_cancel();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_add_pro_submit_btnActionPerformed

    private void product_image_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_image_btnActionPerformed
        fileopen();
        myimage = new ImageIcon(path);
        product_image_lbl.setIcon(new ImageIcon(myimage.getImage().getScaledInstance(product_image_lbl.getWidth(), product_image_lbl.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_product_image_btnActionPerformed

    private void product_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tableMouseClicked

        int i = product_table.getSelectedRow();
        v_p_id.setText(product_table.getValueAt(i, 0).toString());
        v_p_name.setText(product_table.getValueAt(i, 1).toString());
        v_p_details.setText(product_table.getValueAt(i, 2).toString());
        v_p_price.setText(product_table.getValueAt(i, 3).toString());
        v_p_stock.setText(product_table.getValueAt(i, 4).toString());
        try {
            command = "select *from product where p_id=" + Integer.parseInt(v_p_id.getText()) + "";
            rs = st.executeQuery(command);
            while (rs.next()) {
                //emp_image_lbl.setIcon(ResizeImage(null, rs.getBytes("emp_image")));
                myimage = new ImageIcon(rs.getBytes("p_image"));
                view_p_image_lbl.setIcon(new ImageIcon(myimage.getImage().getScaledInstance(view_p_image_lbl.getWidth(), view_p_image_lbl.getHeight(), Image.SCALE_SMOOTH)));
                break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_product_tableMouseClicked

    private void view_image_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_image_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_view_image_btnActionPerformed

    private void view_p_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_p_updateActionPerformed
        try {

            command = "Update product set p_name='" + v_p_name.getText() + "',p_details='" + v_p_details.getText() + "',cost_per_unit=" + Integer.parseInt(v_p_price.getText()) + ",p_stock=" + Integer.parseInt(v_p_stock.getText()) + " where p_id=" + Integer.parseInt(v_p_id.getText()) + "";
            /*command="Update product set p_name=?, p_details=?, cost_per_unit=?,unit_type=?, p_stock=? where p_id=?";
            
             ps=con.prepareStatement(command);
             ps.setString(2, v_p_name.getText());
             ps.setString(3, v_p_details.getText());
             ps.setInt(4, Integer.parseInt(v_p_price.getText()));
             //InputStream ism=new FileInputStream(new File(path));
            
             //ps.setBlob(6, ism);
             ps.setInt(7, Integer.parseInt(v_p_stock.getText()));
            
             ps.setInt(1, Integer.parseInt(v_p_id.getText()));
            
             ps.executeUpdate();*/
            st.executeUpdate(command);
            JOptionPane.showMessageDialog(null, "Update Successfully");
            p_view_table("Select *from product");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            //System.out.println(view_p_image_lbl.getText());
            //System.out.println(path);
        }
    }//GEN-LAST:event_view_p_updateActionPerformed

    private void view_p_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_p_deleteActionPerformed

        try {
            st.executeUpdate("Delete product where p_id=" + Integer.parseInt(v_p_id.getText()) + "");
            JOptionPane.showMessageDialog(null, "Data Delete Successfully");
            v_p_id.setText("");
            v_p_details.setText("");
            v_p_price.setText("");
            v_p_name.setText("");
            v_p_stock.setText("");
            view_p_image_lbl.setIcon(null);
            p_view_table("Select *from product");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_view_p_deleteActionPerformed

    private void view_supp_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_supp_tableMouseClicked

        int i = view_supp_table.getSelectedRow();
        view_sup_id.setText(view_supp_table.getValueAt(i, 0).toString());
        view_sup_name.setText(view_supp_table.getValueAt(i, 1).toString());
        view_sup_phone.setText(view_supp_table.getValueAt(i, 3).toString());
        view_sup_email.setText(view_supp_table.getValueAt(i, 2).toString());
        view_sup_address.setText(view_supp_table.getValueAt(i, 4).toString());
        view_sup_details.setText(view_supp_table.getValueAt(i, 5).toString());

    }//GEN-LAST:event_view_supp_tableMouseClicked


    private void supp_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supp_updateActionPerformed

        try {
            st.executeUpdate("Update supplier set s_name='" + view_sup_name.getText() + "',s_email='" + view_sup_email.getText() + "',s_phone='" + view_sup_phone.getText() + "',s_address='" + view_sup_address.getText() + "',s_details='" + view_sup_details.getText() + "' where s_id=" + Integer.parseInt(view_sup_id.getText()) + "");
            JOptionPane.showMessageDialog(null, "Data Updated");
            supplier_table();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_supp_updateActionPerformed

    private void supp_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supp_deleteActionPerformed

        try {
            st.executeUpdate("delete supplier where s_id=" + Integer.parseInt(view_sup_id.getText()) + "");
            JOptionPane.showMessageDialog(null, "Data Successfully Deleted");
            supplier_table();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_supp_deleteActionPerformed

    private void view_emp_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_emp_tableMouseClicked

        int i = view_emp_table.getSelectedRow();
        try {
            rs = st.executeQuery("Select *from employee where emp_id=" + view_emp_table.getValueAt(i, 0) + "");
            while (rs.next()) {
                emp_man_id.setText(String.valueOf(rs.getInt(1)));
                emp_man_name.setText(rs.getString(2));
                emp_user_name.setText(rs.getString(10));
                emp_man_email.setText(rs.getString(3));
                emp_man_address.setText(rs.getString(9));
                emp_man_phone.setText(rs.getString(4));
                emp_man_join.setText(rs.getString(7));
                emp_man_pass.setText(rs.getString(5));
                emp_combo.setSelectedItem(rs.getString(6));
                myimage = new ImageIcon(rs.getBytes("emp_image"));
                emp_image_lbl.setIcon(new ImageIcon(myimage.getImage().getScaledInstance(emp_image_lbl.getWidth(), emp_image_lbl.getHeight(), Image.SCALE_SMOOTH)));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_view_emp_tableMouseClicked

    private void emp_delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_delete_btnActionPerformed
     
       oop.emp_delete(Integer.parseInt(emp_man_id.getText()));
       emp_cancel();
       employee_table();
    }//GEN-LAST:event_emp_delete_btnActionPerformed

    private void emp_update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_update_btnActionPerformed
     if(emp_man_id!=null){
         oop.emp_update(Integer.parseInt(emp_man_id.getText()), emp_man_name.getText(),  emp_user_name.getText(),  emp_man_email.getText(),  emp_man_phone.getText(),  emp_man_pass.getText(), emp_combo.getSelectedItem().toString(),  emp_man_join.getText(),  emp_man_address.getText());
         emp_cancel();
         employee_table();
     }
       
    }//GEN-LAST:event_emp_update_btnActionPerformed

    private void new_emp_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_emp_btnActionPerformed
        emp_submit_btn.setEnabled(true);
        emp_man_id.setEditable(true);
        emp_delete_btn.setEnabled(false);
        emp_update_btn.setEnabled(false);
        new_emp_btn.setEnabled(false);
    }//GEN-LAST:event_new_emp_btnActionPerformed

    private void new_br_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_br_btnActionPerformed
        oop.branch_in(b_name_txt.getText(), b_address.getText(), b_phone_txt.getText());
        branch_table();
        branch_cancel_btn();
    }//GEN-LAST:event_new_br_btnActionPerformed

    private void delete_br_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_br_btnActionPerformed
        oop.branch_del(b_name_txt.getText());
        branch_table();
        branch_cancel_btn();

    }//GEN-LAST:event_delete_br_btnActionPerformed

    private void cancel_br_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_br_btnActionPerformed
        branch_cancel_btn();
    }//GEN-LAST:event_cancel_br_btnActionPerformed

    private void branch_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_branch_tableMouseClicked

        int i = branch_table.getSelectedRow();
        b_name_txt.setText(branch_table.getValueAt(i, 0).toString());
        b_address.setText(branch_table.getValueAt(i, 1).toString());
        b_phone_txt.setText(branch_table.getValueAt(i, 2).toString());
    }//GEN-LAST:event_branch_tableMouseClicked

    private void logout_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_lblMouseClicked
        LoginPage lgn = new LoginPage();
        lgn.setVisible(true);
        new Admin("", "").hide();
    }//GEN-LAST:event_logout_lblMouseClicked

    private void trans_pname_comboPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_trans_pname_comboPopupMenuWillBecomeInvisible
        String temp = (String) trans_pname_combo.getSelectedItem();

        try {
            command = "select p_id,p_details,p_stock,cost_per_unit from product where p_name='" + temp + "'";
            rs = st.executeQuery(command);
            while (rs.next()) {
                trans_pid.setText(rs.getString("p_id"));
                trans_pdetails.setText(rs.getString("p_details"));
                trans_stock.setText(rs.getString("p_stock"));
                trans_costper_unit.setText(rs.getString("cost_per_unit"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_trans_pname_comboPopupMenuWillBecomeInvisible

    //Variable for transaction.......
    String s_name;
    String b_name;
    int remark;
    String ename;
    int t_cost;
    //***************************

    private void transaction_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaction_submitActionPerformed
        if (supp_trans_combo.isShowing()) {
            s_name = (String) supp_trans_combo.getSelectedItem();
            b_name = "Not Allowed";
            remark = 1;
        } else {
            b_name = (String) branch_trans_combo.getSelectedItem();
            s_name = "Not Allowed";
            remark = 0;
        }
        String date = trans_date.getText();
        t_cost = Integer.parseInt(trans_t_cost.getText());
        ename = "Admin";

        oop.transaction(Integer.parseInt(transaction_no.getText()), s_name, Integer.parseInt(trans_pid.getText()), (String) trans_pname_combo.getSelectedItem(), Integer.parseInt(trans_amount.getText()), Integer.parseInt(trans_vat.getText()), date, remark, b_name, ename, t_cost);
        trans_cancel();
    }//GEN-LAST:event_transaction_submitActionPerformed

    private void transaction_out_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaction_out_lblMouseClicked

        admin_menu.removeAll();
        cardshow();
        transaction_no.setText(autoid("TO_"));
        admin_menu.add(transaction);
        t_lbl.setText("Transaction Out");
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
        trans_date.setText(sdf.format(date));
        b_lbl.show();
        branch_trans_combo.show();
        s_lbl.hide();
        supp_trans_combo.hide();
        transactionIn();
        cardshow();
    }//GEN-LAST:event_transaction_out_lblMouseClicked

    private void topbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMouseDragged
       int x=evt.getXOnScreen();
       int y=evt.getYOnScreen();
       this.setLocation(x-xmouse, y-ymouse);
        
    }//GEN-LAST:event_topbarMouseDragged

    private void topbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMousePressed
       
        xmouse=evt.getX();
        ymouse=evt.getY();
    }//GEN-LAST:event_topbarMousePressed

    private void transaction_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaction_cancelActionPerformed
       
        trans_cancel();
    }//GEN-LAST:event_transaction_cancelActionPerformed

    private void trans_amountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_trans_amountFocusLost
      
        int sum=Integer.parseInt(trans_costper_unit.getText())*Integer.parseInt(trans_amount.getText());
        trans_t_cost.setText(String.valueOf(sum));
    }//GEN-LAST:event_trans_amountFocusLost

    private void trans_vatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_trans_vatFocusLost
        trans_t_cost.setText(String.valueOf(Integer.parseInt(trans_t_cost.getText())+Integer.parseInt(trans_vat.getText())));
    }//GEN-LAST:event_trans_vatFocusLost

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        p_view_table("Select *from product where p_name like '%"+search_box.getText()+"%'");
     
    }//GEN-LAST:event_search_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin("", "").setVisible(true);
            }
        });
    }

    //Panel Rearrange
    public void cardshow() {
        admin_menu.repaint();
        admin_menu.revalidate();
    }

    //Social Link support
    Process P;

    public void website(String link) {
        try {

            P = Runtime.getRuntime().exec("cmd /c start " + link + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
    }

    //Add Product cancel button Method
    public void a_p_cancel() {
        a_p_id.setText("");
        a_p_name.setText("");
        a_p_details.setText("");
        a_p_price.setText("");
        product_image_lbl.setIcon(null);
    }

    //Add Supplier cancel button Method
    public void a_s_cancel() {
        sup_id.setText("");
        sup_name.setText("");
        sup_phone.setText("");
        sup_email.setText("");
        sup_address.setText("");
        sup_details.setText("");
    }
    
    //Transaction cancel button
    public void trans_cancel()
    {
        trans_pid.setText("");
        trans_pdetails.setText("");
        trans_amount.setText("");
        trans_stock.setText("");
        trans_date.setText("");
        trans_costper_unit.setText("");
        trans_t_cost.setText("");
        trans_vat.setText("");
        transaction_no.setText("");
    }

    //Emp_man cancel Button Method
    public void emp_cancel() {
        emp_man_id.setText("");
        emp_man_name.setText("");
        emp_man_phone.setText("");
        emp_man_email.setText("");
        emp_man_join.setText("");
        emp_man_address.setText("");
        emp_man_pass.setText("");
        emp_user_name.setText("");
        emp_image_lbl.setIcon(null);
    }

    //Branch cancel Button
    public void branch_cancel_btn() {
        b_name_txt.setText("");
        b_address.setText("");
        b_phone_txt.setText("");
    }

    public void pro_edit_btn() {
        pro_name.setEditable(true);
        pro_fullname.setEditable(true);
        pro_email.setEditable(true);
        pro_phone.setEditable(true);
        pro_address.setEditable(true);
        pro_edit_btn.setEnabled(false);
        pro_cng_uname_btn.setEnabled(false);
        pro_cng_pass_btn.setEnabled(false);
    }

    //New File Openar Button 
    public void fileopen() {
        JFileChooser file = new JFileChooser();
        //file.setCurrentDirectory(new File(System.getProperty("user.home")));
        //FileNameExtensionFilter filter=new FileNameExtensionFilter("*.Images", "jpeg","jpg","png");
        //file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            //emp_image_lbl.setIcon(ResizeImage(path, null));
        }

    }

    //Product View Table Function
    public void p_view_table(String sql) {
        DefaultTableModel model = new DefaultTableModel();
        product_table.setModel(model);
        product_table.setBackground(Color.DARK_GRAY);
        product_table.setForeground(Color.GREEN);
        product_table.setSelectionBackground(Color.RED);

        model.addColumn("P_Id");
        model.addColumn("P_Name");
        model.addColumn("P_Details");
        model.addColumn("Price");
        model.addColumn("Stock");
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(7)});
            }
        } catch (Exception e) {

        }
    }

    public void employee_table() {
        try {
            DefaultTableModel model = new DefaultTableModel();
            view_emp_table.setModel(model);
            view_emp_table.setBackground(Color.DARK_GRAY);
            view_emp_table.setForeground(Color.GREEN);
            view_emp_table.setSelectionBackground(Color.RED);

            model.addColumn("ID");
            model.addColumn("Name");
            model.addColumn("Email");
            model.addColumn("Phone");
            model.addColumn("Address");
            rs = st.executeQuery("Select *from employee");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(9)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void branch_table() {
        try {
            DefaultTableModel model = new DefaultTableModel();
            branch_table.setModel(model);
            branch_table.setBackground(Color.DARK_GRAY);
            branch_table.setForeground(Color.GREEN);
            branch_table.setSelectionBackground(Color.RED);
            model.addColumn("Name");
            model.addColumn("Address");
            model.addColumn("Phone");
            rs = st.executeQuery("select *from branch");

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a_p_details;
    private javax.swing.JTextField a_p_id;
    private javax.swing.JTextField a_p_name;
    private javax.swing.JTextField a_p_price;
    private javax.swing.JComboBox a_p_unit;
    private javax.swing.JPanel add_emp_man;
    private javax.swing.JLabel add_p_icon;
    private javax.swing.JButton add_pro_cancel_btn;
    private javax.swing.JLabel add_pro_lbl;
    private javax.swing.JButton add_pro_submit_btn;
    private javax.swing.JPanel add_products;
    private javax.swing.JLabel add_s_icon;
    private javax.swing.JLabel add_supp_lbl;
    private javax.swing.JPanel add_supplier;
    private javax.swing.JPanel admin_menu;
    private javax.swing.JTextArea b_address;
    private javax.swing.JLabel b_lbl;
    private javax.swing.JLabel b_lbl_icon;
    private javax.swing.JTextField b_name_txt;
    private javax.swing.JTextField b_phone_txt;
    private javax.swing.JLabel branch_lbl;
    private javax.swing.JPanel branch_panel;
    private javax.swing.JTable branch_table;
    private javax.swing.JComboBox<String> branch_trans_combo;
    private javax.swing.JButton cancel_br_btn;
    private javax.swing.JLabel close;
    private javax.swing.JButton delete_br_btn;
    private javax.swing.JButton emp_cancel_btn;
    private javax.swing.JComboBox emp_combo;
    private javax.swing.JButton emp_delete_btn;
    private javax.swing.JLabel emp_icon;
    private javax.swing.JButton emp_image_btn;
    private javax.swing.JLabel emp_image_lbl;
    private javax.swing.JLabel emp_lbl;
    private javax.swing.JTextArea emp_man_address;
    private javax.swing.JTextField emp_man_email;
    private javax.swing.JTextField emp_man_id;
    private javax.swing.JTextField emp_man_join;
    private javax.swing.JLabel emp_man_lbl;
    private javax.swing.JTextField emp_man_name;
    private javax.swing.JPasswordField emp_man_pass;
    private javax.swing.JTextField emp_man_phone;
    private javax.swing.JButton emp_submit_btn;
    private javax.swing.JButton emp_update_btn;
    private javax.swing.JTextField emp_user_name;
    private javax.swing.JLabel facebook_lbl;
    private javax.swing.JLabel google_lbl;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel logout_lbl;
    private javax.swing.JLabel maximize;
    private javax.swing.JLabel minimize;
    private javax.swing.JButton new_br_btn;
    private javax.swing.JButton new_emp_btn;
    private javax.swing.JTextArea pro_address;
    private javax.swing.JButton pro_cng_pass_btn;
    private javax.swing.JButton pro_cng_uname_btn;
    private javax.swing.JButton pro_edit_btn;
    private javax.swing.JTextField pro_email;
    private javax.swing.JTextField pro_fullname;
    private javax.swing.JTextField pro_name;
    private javax.swing.JTextField pro_new_pass;
    private javax.swing.JTextField pro_newname;
    private javax.swing.JTextField pro_old_pass;
    private javax.swing.JTextField pro_old_uname;
    private javax.swing.JTextField pro_phone;
    private javax.swing.JButton pro_save_btn;
    private javax.swing.JButton product_image_btn;
    private javax.swing.JLabel product_image_lbl;
    private javax.swing.JTable product_table;
    private javax.swing.JPanel profile;
    private javax.swing.JLabel profile_lbl;
    private javax.swing.JLabel r_lbl_icon;
    private javax.swing.JLabel report_lbl;
    private javax.swing.JPanel report_panel;
    private javax.swing.JLabel s_lbl;
    private javax.swing.JTextField search_box;
    private javax.swing.JButton search_btn;
    private javax.swing.JPanel sidepane;
    private javax.swing.JTextArea sup_address;
    private javax.swing.JButton sup_cancel_btn;
    private javax.swing.JTextArea sup_details;
    private javax.swing.JTextField sup_email;
    private javax.swing.JTextField sup_id;
    private javax.swing.JTextField sup_name;
    private javax.swing.JTextField sup_phone;
    private javax.swing.JButton sup_submit_btn;
    private javax.swing.JButton supp_delete;
    private javax.swing.JComboBox<String> supp_trans_combo;
    private javax.swing.JButton supp_update;
    private javax.swing.JLabel t_lbl;
    private javax.swing.JPanel topbar;
    private javax.swing.JTextField trans_amount;
    private javax.swing.JTextField trans_costper_unit;
    private javax.swing.JTextField trans_date;
    private javax.swing.JTextArea trans_pdetails;
    private javax.swing.JTextField trans_pid;
    private javax.swing.JComboBox<String> trans_pname_combo;
    private javax.swing.JTextField trans_stock;
    private javax.swing.JTextField trans_t_cost;
    private javax.swing.JTextField trans_vat;
    private javax.swing.JPanel transaction;
    private javax.swing.JButton transaction_cancel;
    private javax.swing.JLabel transaction_in_lbl;
    private javax.swing.JTextField transaction_no;
    private javax.swing.JLabel transaction_out_lbl;
    private javax.swing.JButton transaction_submit;
    private javax.swing.JLabel twitter_lbl;
    private javax.swing.JTextArea v_p_details;
    private javax.swing.JTextField v_p_id;
    private javax.swing.JTextField v_p_name;
    private javax.swing.JTextField v_p_price;
    private javax.swing.JTextField v_p_stock;
    private javax.swing.JTable view_emp_table;
    private javax.swing.JButton view_image_btn;
    private javax.swing.JButton view_p_delete;
    private javax.swing.JLabel view_p_image_lbl;
    private javax.swing.JButton view_p_update;
    private javax.swing.JLabel view_pro_lbl;
    private javax.swing.JPanel view_product;
    private javax.swing.JLabel view_s_icon;
    private javax.swing.JTextArea view_sup_address;
    private javax.swing.JTextArea view_sup_details;
    private javax.swing.JTextField view_sup_email;
    private javax.swing.JTextField view_sup_id;
    private javax.swing.JTextField view_sup_name;
    private javax.swing.JTextField view_sup_phone;
    private javax.swing.JPanel view_supp_panel;
    private javax.swing.JTable view_supp_table;
    private javax.swing.JLabel view_supplier_lbl;
    // End of variables declaration//GEN-END:variables

    public void supplier_table() {
        DefaultTableModel model = new DefaultTableModel();
        view_supp_table.setModel(model);
        view_supp_table.setBackground(Color.DARK_GRAY);
        view_supp_table.setForeground(Color.GREEN);
        view_supp_table.setSelectionBackground(Color.RED);

        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Phone");
        model.addColumn("Address");
        model.addColumn("Details");
        try {
            rs = st.executeQuery("Select *from supplier");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
