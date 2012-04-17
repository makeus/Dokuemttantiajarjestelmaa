package User_Interface;

import References.Reference;
import References.References;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class GUI extends javax.swing.JFrame {

    private References references;
    private KeywordGen keywordgen;
    private JPanel currentpage;
    private Vector listData;
    private String[] lastNames;

    public GUI(References references, KeywordGen keywordgen) {
        this.references = references;
        references.openFile("sigproc.bib");
        this.keywordgen = keywordgen;
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nav = new javax.swing.JPanel();
        newArticle = new javax.swing.JLabel();
        print = new javax.swing.JLabel();
        page1 = new javax.swing.JPanel();
        currentpage = page1;
        keywordtext = new javax.swing.JLabel();
        keyword = new javax.swing.JTextField();
        authortext = new javax.swing.JLabel();
        author = new javax.swing.JTextField();
        titletext = new javax.swing.JLabel();
        journaltext = new javax.swing.JLabel();
        booktitle = new javax.swing.JTextField();
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
        title = new javax.swing.JTextField();
        typetext = new javax.swing.JLabel();
        type = new javax.swing.JComboBox();
        journal = new javax.swing.JTextField();
        booktitletext = new javax.swing.JLabel();
        note = new javax.swing.JTextField();
        notetext = new javax.swing.JLabel();
        addmore = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        listData = new Vector();
        authorlist = new JList( listData );
        page2 = new javax.swing.JPanel();
        page2.setVisible(false);
        header3 = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        articleinfo = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        articlecode = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        referencelist = new javax.swing.JList();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dokuemttantiajärjestelmää");
        setBackground(new java.awt.Color(254, 254, 254));
        setName("Form");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        nav.setBackground(new java.awt.Color(254, 254, 254));
        nav.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("InternalFrame.borderShadow"), 1, true));
        nav.setMaximumSize(new java.awt.Dimension(150, 32767));
        nav.setName("nav");
        nav.setRequestFocusEnabled(false);

        newArticle.setBackground(new java.awt.Color(254, 254, 254));
        newArticle.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        newArticle.setText("  New Reference");
        newArticle.setBorder(null);
        newArticle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newArticle.setFocusable(false);
        newArticle.setName("newArticle");
        newArticle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newArticleMouseClicked(evt);
            }
        });

        print.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        print.setText("  Print References");
        print.setBorder(null);
        print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print.setName("print");
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout navLayout = new org.jdesktop.layout.GroupLayout(nav);
        nav.setLayout(navLayout);
        navLayout.setHorizontalGroup(
            navLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(newArticle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(print, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(navLayout.createSequentialGroup()
                .add(37, 37, 37)
                .add(newArticle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(print, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(727, Short.MAX_VALUE))
        );

        getContentPane().add(nav);

        page1.setBackground(new java.awt.Color(254, 254, 254));
        page1.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground")));
        page1.setName("page1");

        keywordtext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        keywordtext.setText("Keyword");
        keywordtext.setName("keywordtext");

        keyword.setName("keyword");

        authortext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        authortext.setText("Author");
        authortext.setName("authortext");

        author.setName("author");

        titletext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        titletext.setText("Title");
        titletext.setName("titletext");

        journaltext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        journaltext.setText("Journal");
        journaltext.setName("journaltext");

        booktitle.setName("booktitle");

        volumetext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        volumetext.setText("Volume");
        volumetext.setName("volumetext");

        volume.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        volume.setName("volume");

        numbertext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        numbertext.setText("Number");
        numbertext.setName("numbertext");

        number.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        number.setName("number");

        yeartext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        yeartext.setText("Year");
        yeartext.setName("yeartext");

        year.setModel(new javax.swing.SpinnerNumberModel(2012, 1800, 2201, 1));
        year.setEditor(new javax.swing.JSpinner.NumberEditor(year, "0000"));
        year.setFocusable(false);
        year.setName("year");
        year.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                yearStateChanged(evt);
            }
        });

        pagestext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        pagestext.setText("Pages");
        pagestext.setName("pagestext");

        pages1.setName("pages1");

        pagestext2.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        pagestext2.setText("--");
        pagestext2.setName("pagestext2");

        pages2.setName("pages2");

        publishertext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        publishertext.setText("Publisher");
        publishertext.setName("publishertext");

        publisher.setName("publisher");

        addresstext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        addresstext.setText("Address");
        addresstext.setName("addresstext");

        address.setName("address");

        submit.setText("Add");
        submit.setName("submit");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });

        header2.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        header2.setText("New Reference");
        header2.setName("header2");

        title.setName("title");

        typetext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        typetext.setText("Type");
        typetext.setName("typetext");

        type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "@book", "@article", "@inproceeding", "@misc" }));
        type.setSelectedItem("@book");
        type.setName("type");
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        journal.setName("journal");

        booktitletext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        booktitletext.setText("Booktitle");
        booktitletext.setName("booktitletext");

        note.setName("note");

        notetext.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        notetext.setText("Note");
        notetext.setName("notetext");

        addmore.setText("add author");
        addmore.setName("addmore");
        addmore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmoreActionPerformed(evt);
            }
        });

        jScrollPane4.setName("jScrollPane4");

        authorlist.setForeground(new java.awt.Color(46, 46, 46));
        authorlist.setName("authorlist");
        jScrollPane4.setViewportView(authorlist);

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
                            .add(volumetext)
                            .add(yeartext)
                            .add(pagestext)
                            .add(publishertext)
                            .add(addresstext)
                            .add(keywordtext, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(28, 28, 28)
                        .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(address, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 359, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(publisher, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 359, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(keyword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 379, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(page1Layout.createSequentialGroup()
                                .add(pages1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(pagestext2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(pages2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(submit)
                            .add(page1Layout.createSequentialGroup()
                                .add(volume, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(numbertext, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(number, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(year, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(journal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 379, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(page1Layout.createSequentialGroup()
                        .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(titletext)
                            .add(authortext, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(booktitletext)
                            .add(notetext))
                        .add(31, 31, 31)
                        .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(title, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                                .add(booktitle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                                .add(note, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                                .add(addmore))
                            .add(author, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 379, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 215, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(page1Layout.createSequentialGroup()
                        .add(typetext, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(31, 31, 31)
                        .add(type, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(header2))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        page1Layout.setVerticalGroup(
            page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(page1Layout.createSequentialGroup()
                .add(31, 31, 31)
                .add(header2)
                .add(18, 18, 18)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(typetext)
                    .add(type, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(author, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(authortext))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(addmore, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(titletext)
                    .add(title, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(booktitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(booktitletext))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(note, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(notetext))
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
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(keyword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(keywordtext))
                .add(14, 14, 14)
                .add(submit)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        getContentPane().add(page1);

        page2.setBackground(new java.awt.Color(254, 254, 254));
        page2.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground")));
        page2.setName("page2");

        header3.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        header3.setText("Print References");
        header3.setName("header3");

        tabbedPane.setBackground(new java.awt.Color(254, 254, 254));
        tabbedPane.setName("tabbedPane");
        tabbedPane.setOpaque(true);

        jScrollPane2.setBackground(new java.awt.Color(254, 254, 254));
        jScrollPane2.setName("jScrollPane2");

        articleinfo.setBackground(new java.awt.Color(254, 254, 254));
        articleinfo.setEditable(false);
        articleinfo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        articleinfo.setName("articleinfo");
        jScrollPane2.setViewportView(articleinfo);

        tabbedPane.addTab("     Info    ", jScrollPane2);

        jScrollPane3.setBackground(new java.awt.Color(254, 254, 254));
        jScrollPane3.setName("jScrollPane3");

        articlecode.setBackground(new java.awt.Color(254, 254, 254));
        articlecode.setColumns(20);
        articlecode.setEditable(false);
        articlecode.setRows(5);
        articlecode.setName("articlecode");
        jScrollPane3.setViewportView(articlecode);

        tabbedPane.addTab("    Code    ", jScrollPane3);

        jScrollPane1.setBorder(null);
        jScrollPane1.setName("jScrollPane1");

        referencelist.setBorder(null);
        referencelist.setForeground(java.awt.Color.black);
        referencelist.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        referencelist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        referencelist.setName("referencelist");
        referencelist.setListData(references.getReferences().toArray());
        referencelist.updateUI();
        referencelist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                articleChanged(evt);
            }
        });
        jScrollPane1.setViewportView(referencelist);

        org.jdesktop.layout.GroupLayout page2Layout = new org.jdesktop.layout.GroupLayout(page2);
        page2.setLayout(page2Layout);
        page2Layout.setHorizontalGroup(
            page2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(page2Layout.createSequentialGroup()
                .add(33, 33, 33)
                .add(page2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(tabbedPane)
                    .add(jScrollPane1)
                    .add(page2Layout.createSequentialGroup()
                        .add(header3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                        .add(247, 247, 247)))
                .add(37, 37, 37))
        );
        page2Layout.setVerticalGroup(
            page2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(page2Layout.createSequentialGroup()
                .add(34, 34, 34)
                .add(header3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(tabbedPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 213, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(445, Short.MAX_VALUE))
        );

        getContentPane().add(page2);

        menuBar.setForeground(new java.awt.Color(124, 124, 124));
        menuBar.setName("menuBar");

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");
        fileMenu.setName("fileMenu");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.setName("exitMenuItem");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    public String getCurrentpage() {
        return currentpage.getName();
    }

    private void newArticleMouseClicked(MouseEvent evt) {//GEN-FIRST:event_newArticleMouseClicked
        currentpage.setVisible(false);
        page1.setVisible(true);
        currentpage = page1;
    }//GEN-LAST:event_newArticleMouseClicked

    private void submitMouseClicked(MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked

        Reference reference = new Reference();
        reference.setType(type.getSelectedItem().toString());
        reference.setTitle(title.getText());
        reference.setBooktitle(booktitle.getText());
        String asd="";
        for (int i = 0; i < authorlist.getModel().getSize(); i++) {
            asd = asd + authorlist.getModel().getElementAt(i).toString() + " ";
        }
        reference.setAuthor(asd);
        reference.setJournal(booktitle.getText());
        reference.setVolume((Integer) volume.getValue());
        reference.setNumber((Integer) number.getValue());
        reference.setYear((Integer) year.getValue());
        reference.setPages(pages1.getText() + "--" + pages2.getText());
        reference.setPublisher(publisher.getText());
        reference.setAddress(address.getText());
        reference.setKeyword(keyword.getText());

        references.addReference(reference);


        JOptionPane.showMessageDialog(page1, "Article successfully created!", "Article created", JOptionPane.PLAIN_MESSAGE);

        author.setText("");
        title.setText("");
        booktitle.setText("");
        note.setText("");
        journal.setText("");
        volume.setValue(0);
        number.setValue(0);
        year.setValue(2012);
        pages1.setText("");
        pages2.setText("");
        publisher.setText("");
        address.setText("");
        keyword.setText("");
    }//GEN-LAST:event_submitMouseClicked

    private void printMouseClicked(MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        currentpage.setVisible(false);
        page2.setVisible(true);
        currentpage = page2;
        referencelist.setListData(references.getReferences().toArray());
    }//GEN-LAST:event_printMouseClicked

    private void articleChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_articleChanged
        Reference reference = (Reference) referencelist.getSelectedValue();
        if (reference != null) {
            articleinfo.setText(reference.getInfo());
            articlecode.setText(reference.getBibtex());

        } else {
            articleinfo.setText("");
            articlecode.setText("");
        }
    }//GEN-LAST:event_articleChanged

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        if (type.getSelectedItem().toString() == "@book") {
            author.setVisible(true);
            authortext.setVisible(true);
            title.setVisible(true);
            titletext.setVisible(true);
            booktitle.setVisible(false);
            booktitletext.setVisible(false);
            note.setVisible(false);
            notetext.setVisible(false);
            journal.setVisible(false);
            journaltext.setVisible(false);
            volume.setVisible(false);
            volumetext.setVisible(false);
            number.setVisible(false);
            numbertext.setVisible(false);
            year.setVisible(true);
            yeartext.setVisible(true);
            pages1.setVisible(true);
            pagestext.setVisible(true);
            pages2.setVisible(true);
            pagestext2.setVisible(true);
            publisher.setVisible(true);
            publishertext.setVisible(true);
            address.setVisible(true);
            addresstext.setVisible(true);
            keyword.setVisible(true);
            keywordtext.setVisible(true);
            authorlist.setVisible(false);
        } else if (type.getSelectedItem().toString() == "@article") {
            author.setVisible(true);
            authortext.setVisible(true);
            title.setVisible(true);
            titletext.setVisible(true);
            booktitle.setVisible(false);
            booktitletext.setVisible(false);
            note.setVisible(false);
            notetext.setVisible(false);
            journal.setVisible(true);
            journaltext.setVisible(true);
            volume.setVisible(true);
            volumetext.setVisible(true);
            number.setVisible(true);
            numbertext.setVisible(true);
            year.setVisible(true);
            yeartext.setVisible(true);
            pages1.setVisible(true);
            pagestext.setVisible(true);
            pages2.setVisible(true);
            pagestext2.setVisible(true);
            publisher.setVisible(true);
            publishertext.setVisible(true);
            address.setVisible(true);
            addresstext.setVisible(true);
            keyword.setVisible(true);
            keywordtext.setVisible(true);
            authorlist.setVisible(false);
        } else if (type.getSelectedItem().toString() == "@inproceeding") {
            author.setVisible(true);
            authortext.setVisible(true);
            title.setVisible(true);
            titletext.setVisible(true);
            booktitle.setVisible(true);
            booktitletext.setVisible(true);
            note.setVisible(false);
            notetext.setVisible(false);
            journal.setVisible(false);
            journaltext.setVisible(false);
            volume.setVisible(false);
            volumetext.setVisible(false);
            number.setVisible(false);
            numbertext.setVisible(false);
            year.setVisible(true);
            yeartext.setVisible(true);
            pages1.setVisible(true);
            pagestext.setVisible(true);
            pages2.setVisible(true);
            pagestext2.setVisible(true);
            publisher.setVisible(true);
            publishertext.setVisible(true);
            address.setVisible(true);
            addresstext.setVisible(true);
            keyword.setVisible(true);
            keywordtext.setVisible(true);
            authorlist.setVisible(false);
        } else if (type.getSelectedItem().toString() == "@misc") {
            author.setVisible(true);
            authortext.setVisible(true);
            title.setVisible(false);
            titletext.setVisible(false);
            booktitle.setVisible(false);
            booktitletext.setVisible(false);
            note.setVisible(true);
            notetext.setVisible(true);
            journal.setVisible(false);
            journaltext.setVisible(false);
            volume.setVisible(false);
            volumetext.setVisible(false);
            number.setVisible(false);
            numbertext.setVisible(false);
            year.setVisible(false);
            yeartext.setVisible(false);
            pages1.setVisible(false);
            pagestext.setVisible(false);
            pages2.setVisible(false);
            pagestext2.setVisible(false);
            publisher.setVisible(false);
            publishertext.setVisible(false);
            address.setVisible(false);
            addresstext.setVisible(false);
            keyword.setVisible(true);
            keywordtext.setVisible(true);
            authorlist.setVisible(false);
        }
    }//GEN-LAST:event_typeActionPerformed

    private void addmoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmoreActionPerformed
        lastNames=new String[authorlist.getModel().getSize()+1];
        String stringValue = author.getText();
        author.setText("");

        if (stringValue != null) {
            listData.addElement(stringValue);
            authorlist.setListData(listData);
        }
        authorlist.setVisible(true);
        
        for (int i = 0; i < authorlist.getModel().getSize(); i++) {
            String[] names = authorlist.getModel().getElementAt(i).toString().split(" ");
            lastNames[i]=names[0]; 
        }
        keyword.setText(keywordgen.generateKeyword(lastNames, (Integer)year.getValue()));

    }//GEN-LAST:event_addmoreActionPerformed

    private void yearStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_yearStateChanged
        keyword.setText(keywordgen.generateKeyword(lastNames, (Integer)year.getValue()));
    }//GEN-LAST:event_yearStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addmore;
    private javax.swing.JTextField address;
    private javax.swing.JLabel addresstext;
    private javax.swing.JTextArea articlecode;
    private javax.swing.JTextPane articleinfo;
    private javax.swing.JTextField author;
    private javax.swing.JList authorlist;
    private javax.swing.JLabel authortext;
    private javax.swing.JTextField booktitle;
    private javax.swing.JLabel booktitletext;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel header2;
    private javax.swing.JLabel header3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField journal;
    private javax.swing.JLabel journaltext;
    private javax.swing.JTextField keyword;
    private javax.swing.JLabel keywordtext;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel newArticle;
    private javax.swing.JTextField note;
    private javax.swing.JLabel notetext;
    private javax.swing.JSpinner number;
    private javax.swing.JLabel numbertext;
    private javax.swing.JPanel page1;
    private javax.swing.JPanel page2;
    private javax.swing.JTextField pages1;
    private javax.swing.JTextField pages2;
    private javax.swing.JLabel pagestext;
    private javax.swing.JLabel pagestext2;
    private javax.swing.JLabel print;
    private javax.swing.JTextField publisher;
    private javax.swing.JLabel publishertext;
    private javax.swing.JList referencelist;
    private javax.swing.JButton submit;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField title;
    private javax.swing.JLabel titletext;
    private javax.swing.JComboBox type;
    private javax.swing.JLabel typetext;
    private javax.swing.JSpinner volume;
    private javax.swing.JLabel volumetext;
    private javax.swing.JSpinner year;
    private javax.swing.JLabel yeartext;
    // End of variables declaration//GEN-END:variables
}
