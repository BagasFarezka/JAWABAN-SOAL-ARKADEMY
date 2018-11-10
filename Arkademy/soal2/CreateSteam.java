import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

class CreateSteam {
    JFrame f;
    Connection koneksi;
    JLabel lbluser,lblpass, lblemail, lblLogoSteam,lblSteam,lblLogoValve, lblJK, lblnickname, lbltempat, lbllahir,lblalamat,lblnegara,lblgaring;
    JTextField tuser,temail,tnickname,ttempat;
    JPasswordField tpass;
    JRadioButton rbtnJKL, rbtnJKP;
    JTextArea tareaalamat;
    ButtonGroup g;
    JComboBox cbTanggal, cbBulan, cbTahun,cbNegara;
    JButton btnCreate, btnCancel, btnBack;
    
    CreateSteam() {
        f = new JFrame("Steam");
        
        lbluser = new JLabel("Masukkan Username");
        lbluser.setFont(new Font("Tahoma",Font.BOLD,11));
        lbluser.setBounds(35,100,200,20);
        
        lblnickname = new JLabel("Masukkan Nickname");
        lblnickname.setFont(new Font("Tahoma",Font.BOLD,11));
        lblnickname.setBounds(37,130,200,20);

        lblpass = new JLabel("Masukkan Password");
        lblpass.setFont(new Font("Tahoma",Font.BOLD,11));
        lblpass.setBounds(38,160,200,20);
        
        lblemail = new JLabel("Masukkan E-mail");
        lblemail.setFont(new Font("Tahoma",Font.BOLD,11));
        lblemail.setBounds(56,190,200,20);
        
        lblJK = new JLabel("Jenis Kelamin");
        lblJK.setFont(new Font("Tahoma",Font.BOLD,11));
        lblJK.setBounds(75,220,200,20);
        
        lblnegara = new JLabel("Negara");
        lblnegara.setFont(new Font("Tahoma",Font.BOLD,11));
        lblnegara.setBounds(113,250,200,20);
        
        lbltempat = new JLabel("Tempat /");
        lbltempat.setFont(new Font("Tahoma",Font.BOLD,11));
        lbltempat.setBounds(67,280,200,20);
        
        lbllahir = new JLabel("Tanggal Lahir");
        lbllahir.setFont(new Font("Tahoma",Font.BOLD,11));
        lbllahir.setBounds(67,290,200,20);
        
        lblalamat = new JLabel("Alamat");
        lblalamat.setFont(new Font("Tahoma",Font.BOLD,11));
        lblalamat.setBounds(67,320,200,20);
        
        
        Icon gbrSteam = new ImageIcon("E:/FILE KAMPUS/Semester 6/steam.jpg");
        lblLogoSteam = new JLabel(gbrSteam);
        lblLogoSteam.setBounds(70,38,50,50);
        
        lblSteam = new JLabel("STEAM");
        lblSteam.setFont(new Font("Tahoma",Font.BOLD,23));
        lblSteam.setForeground(Color.black);
        lblSteam.setBounds(130,50,200,30);
        
        Icon gbrValve = new ImageIcon("E:/FILE KAMPUS/Semester 6/valve.png");
        lblLogoValve = new JLabel(gbrValve);
        lblLogoValve.setBounds(135,500,200,50);
        
        
        tuser = new JTextField();
        tuser.setBounds(160,100,300,20);
        tuser.setToolTipText("Masukkan Username");
        
        tnickname = new JTextField();
        tnickname.setBounds(160,130,300,20);
        tnickname.setToolTipText("Masukkan Nickname");
        
        tpass = new JPasswordField();
        tpass.setBounds(160,160,300,20);
        tpass.setToolTipText("Masukkan Password");
        
        temail = new JTextField();
        temail.setBounds(160,190,300,20);
        temail.setToolTipText("Masukkan E-mail");
        
        rbtnJKL = new JRadioButton("Laki - laki");
        rbtnJKL.setBounds(160,220,100,20);
        rbtnJKL.setToolTipText("Masukkan E-mail");
        
        rbtnJKP = new JRadioButton("Perempuan");
        rbtnJKP.setBounds(260,220,100,20);
        rbtnJKP.setToolTipText("Masukkan E-mail");
       
        g = new ButtonGroup();
        
        String[] negara = {"Afganistan","Afrika","Amerika","Australia","Austria","Aljazair","Brazil","Bangladesh","Croatia","Dominika","Francis","Filipina","Germany","Hungaria","Indonesia","Inggris","Irak","Iran","Jepang","Korea Utara","Korea Selatan","Monako","Malaysia","Nepal","Romania","Singapura","Thailand","Ukranina","Vietnam","Wales","Yunani","Zimbabwe"};
        cbNegara = new JComboBox(negara);
        cbNegara.setBounds(160,250,100,20);
        
       
        
        ttempat = new JTextField();
        ttempat.setBounds(160,286,60,20);
        ttempat.setToolTipText("Masukkan Tempat Lahir");
        
        lblgaring = new JLabel("/");
        lblgaring.setFont(new Font("Tahoma",Font.BOLD,11));
        lblgaring.setBounds(225,286,20,20);
        
        String[] tanggal = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        cbTanggal = new JComboBox(tanggal);
        cbTanggal.setBounds(240,286,45,20);
       
        String[] bulan = {"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
        cbBulan = new JComboBox(bulan);
        cbBulan.setBounds(295,286,90,20);
        
        String[] tahun = {"1970","1971","1972","1973","1974","1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017"};
        cbTahun = new JComboBox(tahun);
        cbTahun.setBounds(395,286,60,20);
        
        tareaalamat = new JTextArea();
        tareaalamat.setBackground(Color.black);
        tareaalamat.setForeground(Color.white);
        tareaalamat.setBounds(160,320,295,100);
        tareaalamat.setToolTipText("Masukkan Alamat");
        
        btnCreate = new JButton("Create");
        btnCreate.setFont(new Font("Tahoma",Font.BOLD,11));
        btnCreate.setBounds(160,450,90,20);
        
        btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("Tahoma",Font.BOLD,11));
        btnCancel.setBounds(265,450,90,20);
        
        btnBack = new JButton("Back");
        btnBack.setFont(new Font("Tahoma",Font.BOLD,11));
        btnBack.setBounds(370,450,90,20);
       
        
        
         try{
            Class.forName("com.mysql.jdbc.Driver");
            try {
                String url = "jdbc:mysql://localhost/steam";
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
            }
            catch(SQLException ex) {System.out.println("Koneksi gagal ?");
                                    System.out.println("SQLException: "+ex.getMessage());}
                                }
        catch(Exception ex){System.err.println("Driver tidak ditemukan");}

        
        
         btnCreate.addActionListener(new ActionListener(){
             String username = "", nickname = "", pass = "", email = "", jk = "", negara = "", tempat = "", alamat = ""; 
                 public void actionPerformed(ActionEvent e){
                       if (e.getSource()==btnCreate){
                             username = tuser.getText();
                             nickname = tnickname.getText();
                             pass = tpass.getText();
                             email = temail.getText();
                             jk = rbtnJKL.getText();
                             jk = rbtnJKP.getText();
                             
                             
                             
                             PreparedStatement ps = null;
                             
        
                             try{
                                 Class.forName("com.mysql.jdbc.Driver");
                                 try{
                                     String url = "jdbc:mysql://localhost/steam";
                                     String user = "root";
                                     String password = "";
                                     Connection koneksi = DriverManager.getConnection(url,user,password);
                
                                     try{
                                         ps = koneksi.prepareStatement("insert into createAccount (usr,nick,pwd,email,jk) values (?,?,?,?,?)");
                                
                                         ps.setString(1, username);
                                         ps.setString(2, nickname);
                                         ps.setString(3, pass);
                                         ps.setString(4, email);
                                         ps.setString(5, jk);
                                         ps.executeUpdate();
                                      
                                         JOptionPane.showMessageDialog(null,"Create Account Success, Silahkan LOGIN. . .");
                                         new SteamID();
                                         f.dispose();
                                        
                                        }catch(Exception ex) {System.err.println("Error 1 : "+ex.getMessage());}
                                                                tuser.setText("");
                                                                tnickname.setText("");
                                                                tpass.setText("");
                                                                temail.setText("");
                                                                
                                                                tuser.requestFocus(true);
                    
                                    }
                                    catch(Exception ex) {System.err.println("Error 2 : "+ex.getMessage());}
                                }      
                                catch(Exception ex) {System.err.println("Error 4 : "+ex.getMessage());}       
                    }
                    }
                });
                
         btnCancel.addActionListener (new ActionListener() {
                            public void actionPerformed(ActionEvent e){
                        if(e.getSource() == btnCancel){
                            
                            tuser.setText("");
                            tnickname.setText("");
                            tpass.setText("");
                            temail.setText("");
                            rbtnJKP.setText("");
                            rbtnJKL.setText("");
                            
                            tuser.requestFocus(true);
                        
                        }
                    }
                });
                
                btnBack.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                       if(e.getSource() == btnBack){
                          
                            f.dispose();
                            
                       }
                  }
            });
            
           
            f.add(tareaalamat);
            f.add(cbTahun);
            f.add(cbBulan);
            f.add(lblgaring);
            f.add(cbTanggal);
            f.add(cbNegara);
            g.add(rbtnJKP);
            g.add(rbtnJKL);
            f.add(rbtnJKL);
            f.add(rbtnJKP);
            f.add(tnickname);
            f.add(ttempat); 
            f.add(lblnegara);
            f.add(lblalamat);
            f.add(lbllahir);
            f.add(lbltempat);
            f.add(lblJK);
            f.add(lbluser);
            f.add(tuser);
            f.add(lblnickname);
            f.add(lblpass);
            f.add(tpass);
            f.add(lblemail);
            f.add(temail);
            f.add(btnCreate);
            f.add(btnCancel);
            f.add(btnBack);
            f.add(lblLogoSteam);
            f.add(lblSteam);
            f.add(lblLogoValve);
        
           
            f.getContentPane().setBackground(Color.white);
            f.setSize (500,630);
            f.setLayout(null);
            f.setVisible(true);
            
        }
         public static void main (String []args) {
        new CreateSteam();
    }
}

       
    
    
