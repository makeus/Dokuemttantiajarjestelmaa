package User_Interface;

import References.Reference;
import References.References;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.List;
import java.util.Vector;
import javax.swing.*;

public class GUI extends javax.swing.JFrame {

    private References references;
    private KeywordGen keywordgen;
    private JPanel currentpage;
    private Vector listData;
    private String[] lastNames;

    public GUI(References references, KeywordGen keywordgen) {
        this.references = references;
        this.keywordgen = keywordgen;
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
        }
        initComponents();

        typeActionPerformed(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nav = new javax.swing.JPanel();
        newreference = new javax.swing.JLabel();
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
        referencetitle = new javax.swing.JTextField();
        typetext = new javax.swing.JLabel();
        type = new javax.swing.JComboBox();
        journal = new javax.swing.JTextField();
        booktitletext = new javax.swing.JLabel();
        note = new javax.swing.JTextField();
        notetext = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listData = new Vector();
        authorlist = new JList( listData );
        jScrollPane8 = new javax.swing.JScrollPane();
        authorlist2 = new javax.swing.JList();
        page2 = new javax.swing.JPanel();
        page2.setVisible(false);
        header3 = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        referenceinfo = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        referencecode = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        codeall = new javax.swing.JTextArea();
        String code = "";
        for (Reference reference : references.getReferences()) {
            code = code + "\n" + reference.getBibtex();
        }

        codeall.setText(code);
        jScrollPane1 = new javax.swing.JScrollPane();
        referencelist = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        authorfilterlist = new javax.swing.JList();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        saveas = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();

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

        newreference.setBackground(new java.awt.Color(254, 254, 254));
        newreference.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        newreference.setText("  New Reference");
        newreference.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newreference.setFocusable(false);
        newreference.setName("newreference");
        newreference.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newreferenceMouseClicked(evt);
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
            .add(navLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(navLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(print, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .add(newreference, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(navLayout.createSequentialGroup()
                .add(37, 37, 37)
                .add(newreference, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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
        author.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                authorFocusLost(evt);
            }
        });

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

        referencetitle.setName("referencetitle");

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

        jScrollPane4.setName("jScrollPane4");

        authorlist.setForeground(new java.awt.Color(46, 46, 46));
        authorlist.setName("authorlist");
        authorlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authorlistMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(authorlist);

        jScrollPane8.setBorder(null);
        jScrollPane8.setName("jScrollPane8");

        authorlist2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        authorlist2.setForeground(java.awt.Color.black);
        authorlist2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        authorlist2.setName("authorlist2");
        authorlist2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authorlist2MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(authorlist2);

        org.jdesktop.layout.GroupLayout page1Layout = new org.jdesktop.layout.GroupLayout(page1);
        page1.setLayout(page1Layout);
        page1Layout.setHorizontalGroup(
            page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(page1Layout.createSequentialGroup()
                .add(33, 33, 33)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(page1Layout.createSequentialGroup()
                        .add(2, 2, 2)
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
                                    .add(booktitletext)
                                    .add(notetext)
                                    .add(titletext, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(31, 31, 31)
                                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, note, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, booktitle))
                                    .add(referencetitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 377, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(page1Layout.createSequentialGroup()
                                        .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 215, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(jScrollPane8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 211, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                    .add(page1Layout.createSequentialGroup()
                        .add(authortext, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(31, 31, 31)
                        .add(author, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 379, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(page1Layout.createSequentialGroup()
                        .add(typetext, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(31, 31, 31)
                        .add(type, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(header2))
                .addContainerGap(395, Short.MAX_VALUE))
        );
        page1Layout.setVerticalGroup(
            page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(page1Layout.createSequentialGroup()
                .add(31, 31, 31)
                .add(header2)
                .add(58, 58, 58)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(type, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(typetext))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(author, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(authortext))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(page1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(titletext)
                    .add(referencetitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(168, Short.MAX_VALUE))
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

        jScrollPane6.setName("jScrollPane6");

        referenceinfo.setColumns(20);
        referenceinfo.setRows(5);
        referenceinfo.setMargin(new java.awt.Insets(6, 6, 6, 6));
        referenceinfo.setName("referenceinfo");
        jScrollPane6.setViewportView(referenceinfo);

        tabbedPane.addTab("     Info      ", jScrollPane6);

        jScrollPane3.setBackground(new java.awt.Color(254, 254, 254));
        jScrollPane3.setName("jScrollPane3");

        referencecode.setBackground(new java.awt.Color(254, 254, 254));
        referencecode.setColumns(20);
        referencecode.setEditable(false);
        referencecode.setRows(5);
        referencecode.setMargin(new java.awt.Insets(6, 6, 6, 6));
        referencecode.setName("referencecode");
        jScrollPane3.setViewportView(referencecode);

        tabbedPane.addTab("    Code selected    ", jScrollPane3);

        jScrollPane5.setBackground(new java.awt.Color(254, 254, 254));
        jScrollPane5.setName("jScrollPane5");

        codeall.setBackground(new java.awt.Color(254, 254, 254));
        codeall.setColumns(20);
        codeall.setEditable(false);
        codeall.setRows(5);
        codeall.setMargin(new java.awt.Insets(6, 6, 6, 6));
        codeall.setName("codeall");
        jScrollPane5.setViewportView(codeall);

        tabbedPane.addTab("    Code all    ", jScrollPane5);

        jScrollPane1.setBorder(null);
        jScrollPane1.setName("jScrollPane1");

        referencelist.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        referencelist.setForeground(java.awt.Color.black);
        referencelist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        referencelist.setName("referencelist");
        referencelist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                articleChanged(evt);
            }
        });
        jScrollPane1.setViewportView(referencelist);

        jScrollPane2.setBorder(null);
        jScrollPane2.setName("jScrollPane2");

        authorfilterlist.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        authorfilterlist.setForeground(java.awt.Color.black);
        authorfilterlist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        authorfilterlist.setName("authorfilterlist");
        authorfilterlist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                authorfilterChanged(evt);
            }
        });
        jScrollPane2.setViewportView(authorfilterlist);

        org.jdesktop.layout.GroupLayout page2Layout = new org.jdesktop.layout.GroupLayout(page2);
        page2.setLayout(page2Layout);
        page2Layout.setHorizontalGroup(
            page2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, page2Layout.createSequentialGroup()
                .add(33, 33, 33)
                .add(page2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, tabbedPane)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, page2Layout.createSequentialGroup()
                        .add(header3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                        .add(247, 247, 247))
                    .add(page2Layout.createSequentialGroup()
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 230, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)))
                .add(37, 37, 37))
        );
        page2Layout.setVerticalGroup(
            page2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(page2Layout.createSequentialGroup()
                .add(34, 34, 34)
                .add(header3)
                .add(18, 18, 18)
                .add(page2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .add(jScrollPane2))
                .add(18, 18, 18)
                .add(tabbedPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .add(23, 23, 23))
        );

        getContentPane().add(page2);

        menuBar.setForeground(new java.awt.Color(124, 124, 124));
        menuBar.setName("menuBar");

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");
        fileMenu.setName("fileMenu");

        open.setText("Open file");
        open.setName("open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        fileMenu.add(open);

        saveas.setText("Save file as");
        saveas.setName("saveas");
        saveas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveasActionPerformed(evt);
            }
        });
        fileMenu.add(saveas);

        save.setText("Save file");
        save.setName("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        fileMenu.add(save);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getCurrentpage() {
        return currentpage.getName();
    }

    private void newreferenceMouseClicked(MouseEvent evt) {//GEN-FIRST:event_newreferenceMouseClicked
        currentpage.setVisible(false);
        page1.setVisible(true);
        currentpage = page1;
    }//GEN-LAST:event_newreferenceMouseClicked

    private void submitMouseClicked(MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked

        Reference reference = new Reference();
        reference.setType(type.getSelectedItem().toString());
        reference.setTitle(referencetitle.getText());
        reference.setBooktitle(booktitle.getText());
        String authors = "";
        for (int i = 0; i < authorlist.getModel().getSize(); i++) {
            if (i + 1 == authorlist.getModel().getSize()) {
                authors = authors + authorlist.getModel().getElementAt(i).toString();
            } else {
                authors = authors + authorlist.getModel().getElementAt(i).toString() + " and ";
            }
        }
        reference.setAuthor(authors);
        reference.setJournal(booktitle.getText());
        reference.setVolume((Integer) volume.getValue());
        reference.setNumber((Integer) number.getValue());
        reference.setYear((Integer) year.getValue());
        reference.setPages(pages1.getText() + "--" + pages2.getText());
        reference.setPublisher(publisher.getText());
        reference.setAddress(address.getText());
        reference.setKeyword(keyword.getText());
        reference.setNote(note.getText());

        references.addReference(reference);
        listKnownAuthors();

        JOptionPane.showMessageDialog(page1, "Reference successfully created!", "Reference created", JOptionPane.PLAIN_MESSAGE);

        author.setText("");
        referencetitle.setText("");
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
        listData.clear();
        authorlist.setListData(listData);
        authorlist.setVisible(false);
    }//GEN-LAST:event_submitMouseClicked

    private void updatecodeall(List<Reference> refs) {
        String code = "";
        for (Reference reference : refs) {
            code = code + reference.getBibtex();
        }
        codeall.setText(code);
    }

    private void resetPrintLists() {

        referencelist.setListData(references.getReferences().toArray());
        List<String> authors = references.getAuthors();
        authors.add(0, "All..");
        authorfilterlist.setListData(authors.toArray());
        updatecodeall(references.getReferences());
    }

    private void updatePrintLists() {
        String author = (String) authorfilterlist.getSelectedValue();
        if ((author != null) && !(author.equals("All.."))) {
            referencelist.setListData(references.getReferences(author).toArray());
            updatecodeall(references.getReferences(author));
        } else {
            referencelist.setListData(references.getReferences().toArray());
            updatecodeall(references.getReferences());
        }
    }

    private void listKnownAuthors() {
        List<String> authors = references.getAuthors();
        authorlist2.setListData(authors.toArray());
    }

    private void addStringToAuthorlist(String stringValue) {
        if (stringValue != null) {
            listData.addElement(stringValue);
            authorlist.setListData(listData);
        }
    }

    private String[] lastNamesFromAuthorlist() {
        lastNames = new String[authorlist.getModel().getSize()];
        for (int i = 0; i < authorlist.getModel().getSize(); i++) {
            String[] names = authorlist.getModel().getElementAt(i).toString().split(",");
            lastNames[i] = names[0];
        }
        return lastNames;
    }

    private void printMouseClicked(MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        currentpage.setVisible(false);
        page2.setVisible(true);
        currentpage = page2;
        resetPrintLists();
    }//GEN-LAST:event_printMouseClicked

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        if ("@book".equals(type.getSelectedItem().toString())) {
            author.setVisible(true);
            authortext.setVisible(true);
            referencetitle.setVisible(true);
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
        } else if ("@article".equals(type.getSelectedItem().toString())) {
            author.setVisible(true);
            authortext.setVisible(true);
            referencetitle.setVisible(true);
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
        } else if ("@inproceeding".equals(type.getSelectedItem().toString())) {
            author.setVisible(true);
            authortext.setVisible(true);
            referencetitle.setVisible(true);
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
        } else if ("@misc".equals(type.getSelectedItem().toString())) {
            author.setVisible(true);
            authortext.setVisible(true);
            referencetitle.setVisible(false);
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

    private void yearStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_yearStateChanged
        keyword.setText(keywordgen.generateKeyword(lastNames, (Integer) year.getValue()));
    }//GEN-LAST:event_yearStateChanged

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));

        int choice = chooser.showOpenDialog(null);

        if (choice == JFileChooser.APPROVE_OPTION) {

            File file = chooser.getSelectedFile();
            if (references.openFile(file.toString())) {
                JOptionPane.showMessageDialog(page1, "Reference successfully loaded from file " + file.getName() + "!", "References loaded", JOptionPane.PLAIN_MESSAGE);
                resetPrintLists();
                listKnownAuthors();
            } else {
                JOptionPane.showMessageDialog(page1, "Couldn't load references from file " + file.getName() + "!", "References load failed", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_openActionPerformed

    private void saveasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveasActionPerformed
        JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));

        int choice = chooser.showSaveDialog(null);

        if (choice == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            if (references.saveAs(file.toString())) {
                JOptionPane.showMessageDialog(page1, "Reference successfully saved to file " + file.getName() + "!", "References saved", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(page1, "Coudln't save references to file " + file.getName() + "!", "Failed", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_saveasActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (references.saveFile()) {
            JOptionPane.showMessageDialog(page1, "Reference successfully saved !", "References saved", JOptionPane.PLAIN_MESSAGE);
        } else {
            saveasActionPerformed(evt);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void articleChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_articleChanged
        Reference reference = (Reference) referencelist.getSelectedValue();
        if (reference != null) {
            referenceinfo.setText(reference.getInfo());
            referencecode.setText(reference.getBibtex());

        } else {
            referenceinfo.setText("");
            referencecode.setText("");
        }
    }//GEN-LAST:event_articleChanged

    private void authorfilterChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_authorfilterChanged
        updatePrintLists();
    }//GEN-LAST:event_authorfilterChanged

    private void authorlist2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorlist2MouseClicked
        if(authorlist2.getModel().getSize()==0)
            return;
        String stringValue = authorlist2.getSelectedValue().toString();
        author.setText("");
        authorlist.setVisible(true);
        addStringToAuthorlist(stringValue);
        keyword.setText(keywordgen.generateKeyword(lastNamesFromAuthorlist(), (Integer) year.getValue()));
    }//GEN-LAST:event_authorlist2MouseClicked

    private void authorlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorlistMouseClicked
        if(authorlist.getModel().getSize()==0)
            return;
        listData.remove(authorlist.getSelectedIndex());
        authorlist.setListData(listData);
        keyword.setText(keywordgen.generateKeyword(lastNamesFromAuthorlist(), (Integer) year.getValue()));
    }//GEN-LAST:event_authorlistMouseClicked

    private void authorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_authorFocusLost
        String stringValue = author.getText();
        if(stringValue.equals(""))
            return;
        author.setText("");
        authorlist.setVisible(true);
        addStringToAuthorlist(stringValue);
        keyword.setText(keywordgen.generateKeyword(lastNamesFromAuthorlist(), (Integer) year.getValue()));
    }//GEN-LAST:event_authorFocusLost
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel addresstext;
    private javax.swing.JTextField author;
    private javax.swing.JList authorfilterlist;
    private javax.swing.JList authorlist;
    private javax.swing.JList authorlist2;
    private javax.swing.JLabel authortext;
    private javax.swing.JTextField booktitle;
    private javax.swing.JLabel booktitletext;
    private javax.swing.JTextArea codeall;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel header2;
    private javax.swing.JLabel header3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField journal;
    private javax.swing.JLabel journaltext;
    private javax.swing.JTextField keyword;
    private javax.swing.JLabel keywordtext;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel newreference;
    private javax.swing.JTextField note;
    private javax.swing.JLabel notetext;
    private javax.swing.JSpinner number;
    private javax.swing.JLabel numbertext;
    private javax.swing.JMenuItem open;
    private javax.swing.JPanel page1;
    private javax.swing.JPanel page2;
    private javax.swing.JTextField pages1;
    private javax.swing.JTextField pages2;
    private javax.swing.JLabel pagestext;
    private javax.swing.JLabel pagestext2;
    private javax.swing.JLabel print;
    private javax.swing.JTextField publisher;
    private javax.swing.JLabel publishertext;
    private javax.swing.JTextArea referencecode;
    private javax.swing.JTextArea referenceinfo;
    private javax.swing.JList referencelist;
    private javax.swing.JTextField referencetitle;
    private javax.swing.JMenuItem save;
    private javax.swing.JMenuItem saveas;
    private javax.swing.JButton submit;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JLabel titletext;
    private javax.swing.JComboBox type;
    private javax.swing.JLabel typetext;
    private javax.swing.JSpinner volume;
    private javax.swing.JLabel volumetext;
    private javax.swing.JSpinner year;
    private javax.swing.JLabel yeartext;
    // End of variables declaration//GEN-END:variables
}
