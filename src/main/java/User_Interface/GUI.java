/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import App.References;
import Articles.Article;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI extends javax.swing.JFrame {

    private References references;
    private JPanel currentpage;

    /**
     * Creates new form GUI
     */
    public GUI(References references) {
        this.references = references;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nav = new javax.swing.JPanel();
        newArticle = new javax.swing.JLabel();
        print = new javax.swing.JLabel();
        page0 = new javax.swing.JPanel();
        currentpage = page0;
        header = new javax.swing.JLabel();
        page1 = new javax.swing.JPanel();
        page1.setVisible(false);
        keywordtext = new javax.swing.JLabel();
        keyword = new javax.swing.JTextField();
        authortext = new javax.swing.JLabel();
        author = new javax.swing.JTextField();
        titletext = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        journaltext = new javax.swing.JLabel();
        journal = new javax.swing.JTextField();
        volumetext = new javax.swing.JLabel();
        volume = new javax.swing.JSpinner();
        numbertext = new javax.swing.JLabel();
        number = new javax.swing.JSpinner();
        yeartext = new javax.swing.JLabel();
        year = new javax.swing.JSpinner();
        pagestext = new javax.swing.JLabel();
        pages1 = new javax.swing.JTextField();
        pagestext2 = new javax.swing.JLabel();
        pages2 = new javax.swing.JTextField();
        publishertext = new javax.swing.JLabel();
        publisher = new javax.swing.JTextField();
        addresstext = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        header2 = new javax.swing.JLabel();
        page2 = new javax.swing.JPanel();
        page2.setVisible(false);
        header3 = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        articleinfo = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        articlecode = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        articles = new javax.swing.JList();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nav.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("InternalFrame.borderShadow"), 1, true));
        nav.setPreferredSize(new java.awt.Dimension(150, 400));
        nav.setRequestFocusEnabled(false);

        newArticle.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        newArticle.setText("  New Article");
        newArticle.setBorder(null);
        newArticle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newArticle.setFocusable(false);
        newArticle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newArticleMouseClicked(evt);
            }
        });

        print.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        print.setText("  Print References");
        print.setBorder(null);
        print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout navLayout = new org.jdesktop.layout.GroupLayout(nav);
        nav.setLayout(navLayout);
        navLayout.setHorizontalGroup(
            navLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(print, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, newArticle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(navLayout.createSequentialGroup()
                .add(37, 37, 37)
                .add(newArticle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(print, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );

        page0.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground")));
        page0.setPreferredSize(new java.awt.Dimension(542, 400));

        header.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        header.setText("Index");

        org.jdesktop.layout.GroupLayout page0Layout = new org.jdesktop.layout.GroupLayout(page0);
        page0.setLayout(page0Layout);
        page0Layout.setHorizontalGroup(
            page0Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(page0Layout.createSequentialGroup()
                .add(31, 31, 31)
                .add(header)
                .addContainerGap(435, Short.MAX_VALUE))
        );
        page0Layout.setVerticalGroup(
            page0Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(page0Layout.createSequentialGroup()
                .add(29, 29, 29)
                .add(header)
                .addContainerGap(340, Short.MAX_VALUE))
        );

        page1.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground")));
        page1.setPreferredSize(new java.awt.Dimension(542, 400));

        keywordtext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        keywordtext.setText("Keyword");

        authortext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        authortext.setText("Author");

        titletext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        titletext.setText("Title");

        title.setMaximumSize(new java.awt.Dimension(2147483, 2147483));
        title.setPreferredSize(new java.awt.Dimension(10, 25));

        journaltext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        journaltext.setText("Journal");

        volumetext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        volumetext.setText("Volume");

        volume.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        numbertext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        numbertext.setText("Number");

        number.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        yeartext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        yeartext.setText("Year");

        year.setModel(new javax.swing.SpinnerNumberModel(2012, 1800, 2201, 1));
        year.setEditor(new javax.swing.JSpinner.NumberEditor(year, "0000"));
        year.setFocusable(false);

        pagestext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        pagestext.setText("Pages");

        pagestext2.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        pagestext2.setText("--");

        publishertext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        publishertext.setText("Publisher");

        addresstext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        addresstext.setText("Address");

        submit.setText("Add");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });

        header2.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        header2.setText("New Article");

        org.jdesktop.layout.GroupLayout page1Layout = new org.jdesktop.layout.GroupLayout(page1);
        page1.setLayout(page1Layout);
        page1Layout.setHorizontalGroup(
            page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(page1Layout.createSequentialGroup()
                .add(33, 33, 33)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(page1Layout.createSequentialGroup()
                        .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(journaltext)
                            .add(titletext)
                            .add(volumetext)
                            .add(yeartext)
                            .add(authortext, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(pagestext)
                            .add(publishertext)
                            .add(addresstext)
                            .add(keywordtext, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(28, 28, 28)
                        .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(page1Layout.createSequentialGroup()
                                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, journal)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, title, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, author)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, keyword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 379, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(page1Layout.createSequentialGroup()
                                        .add(pages1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(pagestext2)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(pages2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(0, 36, Short.MAX_VALUE))
                            .add(page1Layout.createSequentialGroup()
                                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, address, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, page1Layout.createSequentialGroup()
                                        .add(volume, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(numbertext)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(number, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, submit)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, year, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, publisher))
                                .addContainerGap())))
                    .add(page1Layout.createSequentialGroup()
                        .add(header2)
                        .add(0, 0, Short.MAX_VALUE))))
        );
        page1Layout.setVerticalGroup(
            page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(page1Layout.createSequentialGroup()
                .add(31, 31, 31)
                .add(header2)
                .add(18, 18, 18)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(keyword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(keywordtext))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(author, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(authortext))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(titletext)
                    .add(title, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(journaltext)
                    .add(journal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(volumetext)
                    .add(numbertext)
                    .add(volume, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(number, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(year, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(yeartext))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(pagestext)
                    .add(pages1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pagestext2)
                    .add(pages2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(publishertext)
                    .add(publisher, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(addresstext)
                    .add(address, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(submit)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        page2.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground")));
        page2.setPreferredSize(new java.awt.Dimension(542, 400));

        header3.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        header3.setText("Print References");

        tabbedPane.setBackground(javax.swing.UIManager.getDefaults().getColor("white"));
        tabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        articleinfo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(articleinfo);

        tabbedPane.addTab("Info", jScrollPane2);

        articlecode.setColumns(20);
        articlecode.setRows(5);
        jScrollPane3.setViewportView(articlecode);

        tabbedPane.addTab("Code", jScrollPane3);

        articles.setBorder(null);
        articles.setForeground(java.awt.Color.black);
        articles.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        articles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        articles.setListData(references.getArticles().toArray());
        articles.updateUI();
        articles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                articleChanged(evt);
            }
        });
        jScrollPane1.setViewportView(articles);

        org.jdesktop.layout.GroupLayout page2Layout = new org.jdesktop.layout.GroupLayout(page2);
        page2.setLayout(page2Layout);
        page2Layout.setHorizontalGroup(
            page2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(page2Layout.createSequentialGroup()
                .add(page2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(page2Layout.createSequentialGroup()
                        .add(25, 25, 25)
                        .add(header3)
                        .add(0, 280, Short.MAX_VALUE))
                    .add(page2Layout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(page2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1)
                            .add(tabbedPane))))
                .addContainerGap())
        );
        page2Layout.setVerticalGroup(
            page2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(page2Layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(header3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(tabbedPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 205, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(nav, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(page0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(page1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(page2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(nav, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(page0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(page1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(page2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void newArticleMouseClicked(MouseEvent evt) {//GEN-FIRST:event_newArticleMouseClicked
        currentpage.setVisible(false);
        page1.setVisible(true);
        currentpage = page1;
    }//GEN-LAST:event_newArticleMouseClicked

    private void submitMouseClicked(MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        Article article = new Article(keyword.getText(), title.getText(), author.getText(), journal.getText(), (Integer) volume.getValue(), (Integer) number.getValue(), (Integer) year.getValue(), pages1.getText() + "--" + pages2.getText(), publisher.getText(), address.getText());
        references.addArticle(article);
        JOptionPane.showMessageDialog(page1, "Article successfully created!", "Article created", JOptionPane.PLAIN_MESSAGE);
        keyword.setText("");
        title.setText("");
        author.setText("");
        journal.setText("");
        volume.setValue(0);
        number.setValue(0);
        year.setValue(2012);
        pages1.setText("");
        pages2.setText("");
        publisher.setText("");
        address.setText("");
    }//GEN-LAST:event_submitMouseClicked

    private void printMouseClicked(MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        currentpage.setVisible(false);
        page2.setVisible(true);
        currentpage = page2;
        articles.setListData(references.getArticles().toArray());
    }//GEN-LAST:event_printMouseClicked

    private void articleChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_articleChanged
        Article article = (Article) articles.getSelectedValue();
        if (article != null) {
            articleinfo.setText(
                    " Keyword: " + article.getKeyword()
                    + "\n Title: " + article.getTitle()
                    + "\n Author: " + article.getAuthor()
                    + "\n Number: " + article.getNumber()
                    + "\n Volume: " + article.getVolume()
                    + "\n Year: " + article.getYear()
                    + "\n Journal: " + article.getJournal()
                    + "\n Publisher: " + article.getPublisher()
                    + "\n Address: " + article.getAddress());
            articlecode.setText(
                    "@article{" + article.getKeyword() + ",\n"
                    + "author = {" + article.getAuthor() + "},\n"
                    + "title = {" + article.getTitle() + "},\n"
                    + "journal = {" + article.getJournal() + "},\n"
                    + "volume = {" + article.getVolume() + "},\n"
                    + "number = {" + article.getNumber() + "},\n"
                    + "year = {" + article.getYear() + "},\n"
                    + "pages = {" + article.getPages() + "},\n"
                    + "publisher = {" + article.getPublisher() + "},\n"
                    + "address = {" + article.getAddress() + "},\n"
                    + "}");
        } else {
            articleinfo.setText("");
            articlecode.setText("");
        }
    }//GEN-LAST:event_articleChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/spring-context.xml");
                GUI gui = ctx.getBean(GUI.class);
                gui.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel addresstext;
    private javax.swing.JTextArea articlecode;
    private javax.swing.JTextPane articleinfo;
    private javax.swing.JList articles;
    private javax.swing.JTextField author;
    private javax.swing.JLabel authortext;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel header;
    private javax.swing.JLabel header2;
    private javax.swing.JLabel header3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField journal;
    private javax.swing.JLabel journaltext;
    private javax.swing.JTextField keyword;
    private javax.swing.JLabel keywordtext;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel newArticle;
    private javax.swing.JSpinner number;
    private javax.swing.JLabel numbertext;
    private javax.swing.JPanel page0;
    private javax.swing.JPanel page1;
    private javax.swing.JPanel page2;
    private javax.swing.JTextField pages1;
    private javax.swing.JTextField pages2;
    private javax.swing.JLabel pagestext;
    private javax.swing.JLabel pagestext2;
    private javax.swing.JLabel print;
    private javax.swing.JTextField publisher;
    private javax.swing.JLabel publishertext;
    private javax.swing.JButton submit;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField title;
    private javax.swing.JLabel titletext;
    private javax.swing.JSpinner volume;
    private javax.swing.JLabel volumetext;
    private javax.swing.JSpinner year;
    private javax.swing.JLabel yeartext;
    // End of variables declaration//GEN-END:variables
}
