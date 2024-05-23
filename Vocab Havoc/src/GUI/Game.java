package GUI;

import IOstream.*;
import static IOstream.Ostream.saveScoreTimeAttack;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Ryoji
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    int minimum = 0, max = Istream.getWords().length - 1, delay, num = 0, num2 = 0, checker = 0, recordTime = 0;
    private static int buffer = 0;
    private static int period = 1000;
    Timer timer;
    String answer;
    Menu menu = new Menu();

    public Game() {
        int num = (int) (Math.random() * (max - minimum + 1) + minimum);
        answer = Istream.getWords()[num].toUpperCase();
        System.out.println(answer);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        first1 = new javax.swing.JLabel();
        first2 = new javax.swing.JLabel();
        first3 = new javax.swing.JLabel();
        first4 = new javax.swing.JLabel();
        first5 = new javax.swing.JLabel();
        second1 = new javax.swing.JLabel();
        second2 = new javax.swing.JLabel();
        second3 = new javax.swing.JLabel();
        second4 = new javax.swing.JLabel();
        second5 = new javax.swing.JLabel();
        third1 = new javax.swing.JLabel();
        third2 = new javax.swing.JLabel();
        third3 = new javax.swing.JLabel();
        third4 = new javax.swing.JLabel();
        third5 = new javax.swing.JLabel();
        fourth1 = new javax.swing.JLabel();
        fourth2 = new javax.swing.JLabel();
        fourth3 = new javax.swing.JLabel();
        fourth4 = new javax.swing.JLabel();
        fourth5 = new javax.swing.JLabel();
        fifth1 = new javax.swing.JLabel();
        fifth2 = new javax.swing.JLabel();
        fifth3 = new javax.swing.JLabel();
        fifth4 = new javax.swing.JLabel();
        fifth5 = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        titles = new javax.swing.JLabel();
        keyboard = new javax.swing.JPanel();
        A = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        G = new javax.swing.JLabel();
        H = new javax.swing.JLabel();
        I = new javax.swing.JLabel();
        J = new javax.swing.JLabel();
        K = new javax.swing.JLabel();
        L = new javax.swing.JLabel();
        M = new javax.swing.JLabel();
        N = new javax.swing.JLabel();
        O = new javax.swing.JLabel();
        P = new javax.swing.JLabel();
        Q = new javax.swing.JLabel();
        R = new javax.swing.JLabel();
        S = new javax.swing.JLabel();
        T = new javax.swing.JLabel();
        U = new javax.swing.JLabel();
        V = new javax.swing.JLabel();
        W = new javax.swing.JLabel();
        X = new javax.swing.JLabel();
        Y = new javax.swing.JLabel();
        Z = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vocab Havoc");
        setMaximumSize(new java.awt.Dimension(500, 738));
        setMinimumSize(new java.awt.Dimension(500, 738));
        setPreferredSize(new java.awt.Dimension(500, 738));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        first1.setBackground(new java.awt.Color(102, 102, 102));
        first1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        first1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(first1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 50, 50));

        first2.setBackground(new java.awt.Color(102, 102, 102));
        first2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        first2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(first2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 50, 50));

        first3.setBackground(new java.awt.Color(102, 102, 102));
        first3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        first3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(first3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 50, 50));

        first4.setBackground(new java.awt.Color(102, 102, 102));
        first4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        first4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(first4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 50, 50));

        first5.setBackground(new java.awt.Color(102, 102, 102));
        first5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        first5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(first5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 50, 50));

        second1.setBackground(new java.awt.Color(102, 102, 102));
        second1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        second1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(second1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 50, 50));

        second2.setBackground(new java.awt.Color(102, 102, 102));
        second2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        second2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(second2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 50, 50));

        second3.setBackground(new java.awt.Color(102, 102, 102));
        second3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        second3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(second3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 50, 50));

        second4.setBackground(new java.awt.Color(102, 102, 102));
        second4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        second4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(second4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 50, 50));

        second5.setBackground(new java.awt.Color(102, 102, 102));
        second5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        second5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(second5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 50, 50));

        third1.setBackground(new java.awt.Color(102, 102, 102));
        third1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        third1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(third1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 50, 50));

        third2.setBackground(new java.awt.Color(102, 102, 102));
        third2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        third2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(third2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 50, 50));

        third3.setBackground(new java.awt.Color(102, 102, 102));
        third3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        third3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(third3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 50, 50));

        third4.setBackground(new java.awt.Color(102, 102, 102));
        third4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        third4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(third4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 50, 50));

        third5.setBackground(new java.awt.Color(102, 102, 102));
        third5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        third5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(third5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 50, 50));

        fourth1.setBackground(new java.awt.Color(102, 102, 102));
        fourth1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fourth1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fourth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 50, 50));

        fourth2.setBackground(new java.awt.Color(102, 102, 102));
        fourth2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fourth2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fourth2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 50, 50));

        fourth3.setBackground(new java.awt.Color(102, 102, 102));
        fourth3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fourth3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fourth3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 50, 50));

        fourth4.setBackground(new java.awt.Color(102, 102, 102));
        fourth4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fourth4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fourth4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 50, 50));

        fourth5.setBackground(new java.awt.Color(102, 102, 102));
        fourth5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fourth5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fourth5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 50, 50));

        fifth1.setBackground(new java.awt.Color(102, 102, 102));
        fifth1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fifth1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fifth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 50, 50));

        fifth2.setBackground(new java.awt.Color(102, 102, 102));
        fifth2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fifth2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fifth2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 50, 50));

        fifth3.setBackground(new java.awt.Color(102, 102, 102));
        fifth3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fifth3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fifth3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 50, 50));

        fifth4.setBackground(new java.awt.Color(102, 102, 102));
        fifth4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fifth4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fifth4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 50, 50));

        fifth5.setBackground(new java.awt.Color(102, 102, 102));
        fifth5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fifth5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fifth5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 50, 50));

        min.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        min.setText("00 ");
        getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, 30));

        sec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sec.setText("00");
        getContentPane().add(sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, 30));

        titles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrenzyTitle.png"))); // NOI18N
        getContentPane().add(titles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 430, 118));

        keyboard.setBackground(new java.awt.Color(0, 102, 102));
        keyboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/1.png"))); // NOI18N
        A.setLabelFor(A);
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/2.png"))); // NOI18N
        B.setLabelFor(B);
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/3.png"))); // NOI18N
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/4.png"))); // NOI18N
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/5.png"))); // NOI18N
        E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/6.png"))); // NOI18N
        F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/7.png"))); // NOI18N
        G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        H.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/8.png"))); // NOI18N
        H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        I.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/9.png"))); // NOI18N
        I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        J.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/10.png"))); // NOI18N
        J.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        K.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/11.png"))); // NOI18N
        K.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/12.png"))); // NOI18N
        L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/13.png"))); // NOI18N
        M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/14.png"))); // NOI18N
        N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        O.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/15.png"))); // NOI18N
        O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/16.png"))); // NOI18N
        P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        Q.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/17.png"))); // NOI18N
        Q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/18.png"))); // NOI18N
        R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        S.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/19.png"))); // NOI18N
        S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        T.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/20.png"))); // NOI18N
        T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        U.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/21.png"))); // NOI18N
        U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        V.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/22.png"))); // NOI18N
        V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        W.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/23.png"))); // NOI18N
        W.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        X.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/24.png"))); // NOI18N
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        Y.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/25.png"))); // NOI18N
        Y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        Z.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/26.png"))); // NOI18N
        Z.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout keyboardLayout = new javax.swing.GroupLayout(keyboard);
        keyboard.setLayout(keyboardLayout);
        keyboardLayout.setHorizontalGroup(
            keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
            .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(keyboardLayout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(keyboardLayout.createSequentialGroup()
                            .addComponent(A)
                            .addGap(10, 10, 10)
                            .addComponent(B)
                            .addGap(10, 10, 10)
                            .addComponent(C)
                            .addGap(10, 10, 10)
                            .addComponent(D)
                            .addGap(10, 10, 10)
                            .addComponent(E)
                            .addGap(10, 10, 10)
                            .addComponent(F)
                            .addGap(10, 10, 10)
                            .addComponent(G)
                            .addGap(10, 10, 10)
                            .addComponent(H)
                            .addGap(10, 10, 10)
                            .addComponent(I))
                        .addGroup(keyboardLayout.createSequentialGroup()
                            .addComponent(J)
                            .addGap(10, 10, 10)
                            .addComponent(K)
                            .addGap(10, 10, 10)
                            .addComponent(L)
                            .addGap(10, 10, 10)
                            .addComponent(M)
                            .addGap(10, 10, 10)
                            .addComponent(N)
                            .addGap(10, 10, 10)
                            .addComponent(O)
                            .addGap(10, 10, 10)
                            .addComponent(P)
                            .addGap(10, 10, 10)
                            .addComponent(Q)
                            .addGap(10, 10, 10)
                            .addComponent(R))
                        .addGroup(keyboardLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(S)
                            .addGap(10, 10, 10)
                            .addComponent(T)
                            .addGap(10, 10, 10)
                            .addComponent(U)
                            .addGap(10, 10, 10)
                            .addComponent(V)
                            .addGap(10, 10, 10)
                            .addComponent(W)
                            .addGap(10, 10, 10)
                            .addComponent(X)
                            .addGap(10, 10, 10)
                            .addComponent(Y)
                            .addGap(10, 10, 10)
                            .addComponent(Z)))
                    .addGap(0, 27, Short.MAX_VALUE)))
        );
        keyboardLayout.setVerticalGroup(
            keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
            .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(keyboardLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(A)
                        .addComponent(B)
                        .addComponent(C)
                        .addComponent(D)
                        .addComponent(E)
                        .addComponent(F)
                        .addComponent(G)
                        .addComponent(H)
                        .addComponent(I))
                    .addGap(10, 10, 10)
                    .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(J)
                        .addComponent(K)
                        .addComponent(L)
                        .addComponent(M)
                        .addComponent(N)
                        .addComponent(O)
                        .addComponent(P)
                        .addComponent(Q)
                        .addComponent(R))
                    .addGap(10, 10, 10)
                    .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(S)
                        .addComponent(T)
                        .addComponent(U)
                        .addComponent(V)
                        .addComponent(W)
                        .addComponent(X)
                        .addComponent(Y)
                        .addComponent(Z))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(keyboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 500, 170));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        Background.setText("jLabel1");
        Background.setMaximumSize(new java.awt.Dimension(500, 700));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_ExitActionPerformed

    int mouseClickCount = 0;
    String guess = "";
    private void LetterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LetterMouseClicked
        Object source = evt.getSource();

        ArrayList<JLabel> boxes = new ArrayList<JLabel>();
        boxes.add(first1);
        boxes.add(first2);
        boxes.add(first3);
        boxes.add(first4);
        boxes.add(first5);

        boxes.add(second1);
        boxes.add(second2);
        boxes.add(second3);
        boxes.add(second4);
        boxes.add(second5);

        boxes.add(third1);
        boxes.add(third2);
        boxes.add(third3);
        boxes.add(third4);
        boxes.add(third5);

        boxes.add(fourth1);
        boxes.add(fourth2);
        boxes.add(fourth3);
        boxes.add(fourth4);
        boxes.add(fourth5);

        boxes.add(fifth1);
        boxes.add(fifth2);
        boxes.add(fifth3);
        boxes.add(fifth4);
        boxes.add(fifth5);

        ArrayList<String> letters = new ArrayList<String>();
        letters.add("  A");
        letters.add("  B");
        letters.add("  C");
        letters.add("  D");
        letters.add("  E");
        letters.add("  F");
        letters.add("  G");
        letters.add("  H");
        letters.add("  I");
        letters.add("  J");
        letters.add("  K");
        letters.add("  L");
        letters.add("  M");
        letters.add("  N");
        letters.add("  O");
        letters.add("  P");
        letters.add("  Q");
        letters.add("  R");
        letters.add("  S");
        letters.add("  T");
        letters.add("  U");
        letters.add("  V");
        letters.add("  W");
        letters.add("  X");
        letters.add("  Y");
        letters.add("  Z");

        ArrayList<Object> sources = new ArrayList<Object>();
        sources.add(A);
        sources.add(B);
        sources.add(C);
        sources.add(D);
        sources.add(E);
        sources.add(F);
        sources.add(G);
        sources.add(H);
        sources.add(I);
        sources.add(J);
        sources.add(K);
        sources.add(L);
        sources.add(M);
        sources.add(N);
        sources.add(O);
        sources.add(P);
        sources.add(Q);
        sources.add(R);
        sources.add(S);
        sources.add(T);
        sources.add(U);
        sources.add(V);
        sources.add(W);
        sources.add(X);
        sources.add(Y);
        sources.add(Z);

        int boxPerRow = 5;
        int rowCount = 5;
        int currentRow = mouseClickCount / 5;

        for (int i = currentRow * boxPerRow; i < boxes.size() - (20 - currentRow * boxPerRow); i += boxPerRow) {
            if (boxes.get(i).getText().equals("")) {
                for (int j = 0; j < 26; j++) {
                    if (source == sources.get(j)) {
                        boxes.get(i).setText(letters.get(j));
                        guess += letters.get(j);
                    }
                }

            } else if (boxes.get(i + 1).getText() == "") {
                for (int j = 0; j < 26; j++) {
                    if (source == sources.get(j)) {
                        boxes.get(i + 1).setText(letters.get(j));
                        guess += letters.get(j);
                    }
                }

            } else if (boxes.get(i + 2).getText() == "") {
                for (int j = 0; j < 26; j++) {
                    if (source == sources.get(j)) {
                        boxes.get(i + 2).setText(letters.get(j));
                        guess += letters.get(j);
                    }
                }

            } else if (boxes.get(i + 3).getText() == "") {
                for (int j = 0; j < 26; j++) {
                    if (source == sources.get(j)) {
                        boxes.get(i + 3).setText(letters.get(j));
                        guess += letters.get(j);
                    }
                }

            } else if (boxes.get(i + 4).getText() == "") {
                for (int j = 0; j < 26; j++) {
                    if (source == sources.get(j)) {
                        boxes.get(i + 4).setText(letters.get(j));
                        guess += letters.get(j);

                    }
                }
            }

        }

        mouseClickCount++;

        // if guess complete
        if (mouseClickCount % 5 == 0) {

            System.out.println(currentRow);
            // remove whitespace
            guess = guess.replace("  ", "");
            System.out.println(guess);

            // check if letter is in answer for every letter
            boolean[] yellow = new boolean[5];
            for (int i = 0; i < 5; i++) {
                if (answer.contains(Character.toString(guess.charAt(i)))) {
                    yellow[i] = true;
                } else {
                    yellow[i] = false;
                }
            }

            // chekc for green
            boolean[] green = new boolean[5];
            for (int i = 0; i < 5; i++) {
                if (guess.charAt(i) == answer.charAt(i)) {
                    green[i] = true;
                } else {
                    green[i] = false;
                }
            }
            // change colors :)
            for (int i = 0; i < 5; i++) {
                Color boxColor = Color.RED; // default
                int boxIndex = (currentRow * 5) + i;
                if (green[i]) {
                    boxColor = Color.GREEN;
                } else if (yellow[i]) {
                    boxColor = Color.YELLOW;
                }

                boxes.get(boxIndex).setBorder(BorderFactory.createLineBorder(boxColor, 5));
            }

            for (int i = 0; i < 5; i++) {
                if (green[i]) {
                    checker++;
                }
            }

            if (checker == 5) {
                recordTime = (num2 * 60) + num;
                JOptionPane.showMessageDialog(null, "You got the right word!\n " + answer, "Congratulations", JOptionPane.INFORMATION_MESSAGE);
                String name = JOptionPane.showInputDialog("Please enter your name: ");
                saveScoreTimeAttack(name, recordTime);
                
                this.dispose();
                menu.setVisible(true);
                    
            }

            guess = "";

        }


    }//GEN-LAST:event_LetterMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        go();
    }//GEN-LAST:event_formWindowActivated

    public void go() {
        TimerTask myTask = new MyTimerTask(this);
        timer = new Timer();
        timer.schedule(myTask, buffer, period);

    }

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel B;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel C;
    private javax.swing.JLabel D;
    private javax.swing.JLabel E;
    private javax.swing.JLabel F;
    private javax.swing.JLabel G;
    private javax.swing.JLabel H;
    private javax.swing.JLabel I;
    private javax.swing.JLabel J;
    private javax.swing.JLabel K;
    private javax.swing.JLabel L;
    private javax.swing.JLabel M;
    private javax.swing.JLabel N;
    private javax.swing.JLabel O;
    private javax.swing.JLabel P;
    private javax.swing.JLabel Q;
    private javax.swing.JLabel R;
    private javax.swing.JLabel S;
    private javax.swing.JLabel T;
    private javax.swing.JLabel U;
    private javax.swing.JLabel V;
    private javax.swing.JLabel W;
    private javax.swing.JLabel X;
    private javax.swing.JLabel Y;
    private javax.swing.JLabel Z;
    private javax.swing.JLabel fifth1;
    private javax.swing.JLabel fifth2;
    private javax.swing.JLabel fifth3;
    private javax.swing.JLabel fifth4;
    private javax.swing.JLabel fifth5;
    private javax.swing.JLabel first1;
    private javax.swing.JLabel first2;
    private javax.swing.JLabel first3;
    private javax.swing.JLabel first4;
    private javax.swing.JLabel first5;
    private javax.swing.JLabel fourth1;
    private javax.swing.JLabel fourth2;
    private javax.swing.JLabel fourth3;
    private javax.swing.JLabel fourth4;
    private javax.swing.JLabel fourth5;
    private javax.swing.JPanel keyboard;
    private javax.swing.JLabel min;
    private javax.swing.JLabel sec;
    private javax.swing.JLabel second1;
    private javax.swing.JLabel second2;
    private javax.swing.JLabel second3;
    private javax.swing.JLabel second4;
    private javax.swing.JLabel second5;
    private javax.swing.JLabel third1;
    private javax.swing.JLabel third2;
    private javax.swing.JLabel third3;
    private javax.swing.JLabel third4;
    private javax.swing.JLabel third5;
    private javax.swing.JLabel titles;
    // End of variables declaration//GEN-END:variables

    public JLabel getSec() {
        return sec;
    }

    public void setSec(JLabel sec) {
        this.sec = sec;
    }

    public JLabel getMin() {
        return min;
    }

    public void setMin(JLabel min) {
        this.min = min;
    }

}
