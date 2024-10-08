package musicplayerdsa;

import java.lang.*;
import java.nio.file.Paths;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author SAHAN
 */
public class SoundUI extends javax.swing.JFrame {
    
     SongData songs = new SongData();
    int x;
    int y;
      

 
    public SoundUI() {
        this.setBounds(150,150,624, 538);
        this.setTitle("Sound Player");
        initComponents();
        
        
        AllSongs.setModel(new DefaultComboBoxModel<>(SongData.songNames));
    }
    
     private void formMouseDragged(java.awt.event.MouseEvent evt) {                                  
        int xMouse = evt.getXOnScreen();
        int yMouse = evt.getYOnScreen();
        
        this.setLocation(xMouse - x, yMouse - y);

    }    
      private void formMousePressed(java.awt.event.MouseEvent evt) {                                  
        x = evt.getX();
        y = evt.getY();
      }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Setting = new javax.swing.JPanel();
        PlayingButton = new javax.swing.JLabel();
        nextButton = new javax.swing.JLabel();
        previousButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SongName = new javax.swing.JLabel();
        Playstat = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        playlistScreen = new javax.swing.JList<>();
        SearchingName = new javax.swing.JButton();
        SnameText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Adding = new javax.swing.JButton();
        Deleting = new javax.swing.JButton();
        Beginning = new javax.swing.JButton();
        EndButton = new javax.swing.JButton();
        MoveUpButton = new javax.swing.JButton();
        MoveDownButton = new javax.swing.JButton();
        AddNewPlayList = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllSongs = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        SsingerText = new javax.swing.JTextField();
        SearchingSinger = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1366, 768));

        MainPanel.setBackground(new java.awt.Color(204, 204, 204));
        MainPanel.setMinimumSize(new java.awt.Dimension(0, 0));

        Setting.setMinimumSize(new java.awt.Dimension(0, 0));

        PlayingButton.setBackground(new java.awt.Color(255, 255, 255));
        PlayingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayerdsa/287674_play_store_icon.png"))); // NOI18N
        PlayingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayingButtonMouseClicked(evt);
            }
        });

        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayerdsa/9035086_play_forward_circle_icon.png"))); // NOI18N
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });

        previousButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayerdsa/9035157_play_back_circle_icon.png"))); // NOI18N
        previousButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousButtonMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAHAN\\Documents\\NetBeansProjects\\MusicPlayerDSA\\Icon\\1288808_sound_volume_multimedia_media control_icon.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAHAN\\Documents\\NetBeansProjects\\MusicPlayerDSA\\Icon\\6644765_mute_mute button_mute sound_mute speaker_mute volume_icon.png")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAHAN\\Documents\\NetBeansProjects\\MusicPlayerDSA\\Icon\\6934314_arrow_navigation_random_shuffle_icon.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAHAN\\Documents\\NetBeansProjects\\MusicPlayerDSA\\Icon\\1814116_loop_repeat_rotation_icon.png")); // NOI18N

        SongName.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        SongName.setText("*NSYNC - Bye Bye Bye-from Deadpool and Wolverine");

        Playstat.setBackground(new java.awt.Color(255, 255, 255));
        Playstat.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Playstat.setText("Playing :");

        javax.swing.GroupLayout SettingLayout = new javax.swing.GroupLayout(Setting);
        Setting.setLayout(SettingLayout);
        SettingLayout.setHorizontalGroup(
            SettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Playstat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SongName, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(previousButton)
                .addGap(18, 18, 18)
                .addComponent(PlayingButton)
                .addGap(18, 18, 18)
                .addComponent(nextButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        SettingLayout.setVerticalGroup(
            SettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(SettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingLayout.createSequentialGroup()
                        .addGroup(SettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(previousButton, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(PlayingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SongName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Playstat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingLayout.createSequentialGroup()
                        .addGroup(SettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addContainerGap())))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 476));

        playlistScreen.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(playlistScreen);

        SearchingName.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        SearchingName.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAHAN\\Documents\\NetBeansProjects\\Music-player-data-structures-and-algorithms\\Icon\\370082_find_search_zoom_magnifier_view_icon.png")); // NOI18N
        SearchingName.setText("Search");
        SearchingName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, null));
        SearchingName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchingNameActionPerformed(evt);
            }
        });

        SnameText.setBackground(new java.awt.Color(39, 37, 37));
        SnameText.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        SnameText.setForeground(new java.awt.Color(255, 255, 255));
        SnameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        SnameText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Search by : Name");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel11.setText("Added Songs");

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAHAN\\Documents\\NetBeansProjects\\MusicPlayerDSA\\Icon\\8680283_play_list_fill_icon.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SearchingName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchingName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        Adding.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Adding.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAHAN\\Documents\\NetBeansProjects\\MusicPlayerDSA\\Icon\\2540589_add_add board_plus_new_icon.png")); // NOI18N
        Adding.setText("Add  Song >>");
        Adding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddingActionPerformed(evt);
            }
        });

        Deleting.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Deleting.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAHAN\\Documents\\NetBeansProjects\\MusicPlayerDSA\\Icon\\216170_delete_icon.png")); // NOI18N
        Deleting.setText("Delete song");
        Deleting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletingActionPerformed(evt);
            }
        });

        Beginning.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Beginning.setText("Beginning");
        Beginning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeginningActionPerformed(evt);
            }
        });

        EndButton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        EndButton.setText("End");
        EndButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndButtonActionPerformed(evt);
            }
        });

        MoveUpButton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        MoveUpButton.setText("Move Up");
        MoveUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveUpButtonActionPerformed(evt);
            }
        });

        MoveDownButton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        MoveDownButton.setText("Move Down");
        MoveDownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveDownButtonActionPerformed(evt);
            }
        });

        AddNewPlayList.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        AddNewPlayList.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAHAN\\Documents\\NetBeansProjects\\MusicPlayerDSA\\Icon\\2540589_add_add board_plus_new_icon.png")); // NOI18N
        AddNewPlayList.setText("Create New Play List");
        AddNewPlayList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewPlayListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Adding, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
            .addComponent(Deleting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Beginning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(EndButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MoveUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MoveDownButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AddNewPlayList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(AddNewPlayList, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(Adding, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Deleting, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(Beginning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EndButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(MoveUpButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoveDownButton)
                .addGap(35, 35, 35))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 486));

        AllSongs.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(AllSongs);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Search by : Artists");

        SsingerText.setBackground(new java.awt.Color(39, 37, 37));
        SsingerText.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        SsingerText.setForeground(new java.awt.Color(255, 255, 255));
        SsingerText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        SsingerText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        SearchingSinger.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        SearchingSinger.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAHAN\\Documents\\NetBeansProjects\\Music-player-data-structures-and-algorithms\\Icon\\370082_find_search_zoom_magnifier_view_icon.png")); // NOI18N
        SearchingSinger.setText("Search");
        SearchingSinger.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearchingSinger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchingSingerActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAHAN\\Documents\\NetBeansProjects\\MusicPlayerDSA\\Icon\\8680283_play_list_fill_icon.png")); // NOI18N

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel10.setText("All Songs");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SsingerText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchingSinger, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel12)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SsingerText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchingSinger, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Setting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Setting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayingButtonMouseClicked
         int nx = songs.playing();
        try{
        Playstat.setText("Playing: ");
        SongName.setText(songs.playlist[nx].fileName);
        
        songs.playlist[nx].currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        
        } catch(NullPointerException e){
              JOptionPane.showMessageDialog(null,"Add songs first");
        }
    }//GEN-LAST:event_PlayingButtonMouseClicked

    private void AddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddingActionPerformed
        String abs=AllSongs.getSelectedValue();
        SongData.addSong(abs);
        playlistScreen.setModel(new DefaultComboBoxModel<>(SongData.playlistName));
    }//GEN-LAST:event_AddingActionPerformed

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
         int nx = songs.next();
        
        Playstat.setText("Playing:");
        SongName.setText(songs.playlist[nx].fileName);
        
        
        songs.playlist[nx].currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
    }//GEN-LAST:event_nextButtonMouseClicked

    private void previousButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousButtonMouseClicked
         int nx = songs.previous();
        
        Playstat.setText("Playing:");
        SongName.setText(songs.playlist[nx].fileName);
        
        
        songs.playlist[nx].currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
    }//GEN-LAST:event_previousButtonMouseClicked

    private void DeletingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletingActionPerformed
         try{ 
        int Dindx = playlistScreen.getSelectedIndex();
           if(Dindx == 0 && songs.cnt == 1) {
                Playstat.setText("Stopped:");
                SongName.setText(" ");
           } 
           songs.deleteSong(Dindx);
      playlistScreen.setModel(new DefaultComboBoxModel<>(SongData.playlistName));
        }
        catch(NullPointerException | ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Playlist is empty");    
        }
    }//GEN-LAST:event_DeletingActionPerformed

    private void BeginningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeginningActionPerformed
        try{
        int beg = songs.getBeginning();
        
        Playstat.setText("Playing:");
        SongName.setText(songs.playlist[beg].fileName);
        songs.playlist[beg].currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        }
        catch(NullPointerException e){
             JOptionPane.showMessageDialog(null,"There is no songs in list");
        }
    }//GEN-LAST:event_BeginningActionPerformed

    private void EndButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndButtonActionPerformed
         try{
        int beg = songs.getEnd();
        
        Playstat.setText("Playing:");
        SongName.setText(songs.playlist[beg].fileName);
        songs.playlist[beg].currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        }
        catch(NullPointerException e){
             JOptionPane.showMessageDialog(null,"There is no songs in list");
        }
    }//GEN-LAST:event_EndButtonActionPerformed

    private void MoveUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveUpButtonActionPerformed
        try{
        Playstat.setText("Stopped:");
        SongName.setText(" ");
        int mv = playlistScreen.getSelectedIndex();
        songs.moveUp(mv);
        
      playlistScreen.setModel(new DefaultComboBoxModel<>(SongData.playlistName));
    }
     catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Select a song");
        }
     catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Playlist is empty");    
        }
    }//GEN-LAST:event_MoveUpButtonActionPerformed

    private void MoveDownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveDownButtonActionPerformed
        try{
        Playstat.setText("Stopped:");
        SongName.setText(" ");        
        int mv = playlistScreen.getSelectedIndex();
        songs.moveDown(mv);
        
      playlistScreen.setModel(new DefaultComboBoxModel<>(SongData.playlistName));
        }
        catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Select a song");
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Playlist is empty");    
        }
    }//GEN-LAST:event_MoveDownButtonActionPerformed

    private void SearchingNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchingNameActionPerformed
        String nGet = SnameText.getText(); 
        String NameSong = songs.searchSongName(nGet);
         playlistScreen.setModel(new DefaultComboBoxModel<>(SongData.playlistName));

            JOptionPane.showMessageDialog(null, NameSong);
    }//GEN-LAST:event_SearchingNameActionPerformed

    private void SearchingSingerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchingSingerActionPerformed
        String nGet = SsingerText.getText(); 
        String NameSong = songs.searchSongSinger(nGet);
         playlistScreen.setModel(new DefaultComboBoxModel<>(SongData.playlistName));

            JOptionPane.showMessageDialog(null, NameSong);
    }//GEN-LAST:event_SearchingSingerActionPerformed

    private void AddNewPlayListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewPlayListActionPerformed
        NewPlayList play=new NewPlayList();
        play.show();
    }//GEN-LAST:event_AddNewPlayListActionPerformed

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
            java.util.logging.Logger.getLogger(SoundUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SoundUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SoundUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SoundUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SoundUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewPlayList;
    private javax.swing.JButton Adding;
    private javax.swing.JList<String> AllSongs;
    private javax.swing.JButton Beginning;
    private javax.swing.JButton Deleting;
    private javax.swing.JButton EndButton;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton MoveDownButton;
    private javax.swing.JButton MoveUpButton;
    private javax.swing.JLabel PlayingButton;
    private javax.swing.JLabel Playstat;
    private javax.swing.JButton SearchingName;
    private javax.swing.JButton SearchingSinger;
    private javax.swing.JPanel Setting;
    private javax.swing.JTextField SnameText;
    private javax.swing.JLabel SongName;
    private javax.swing.JTextField SsingerText;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nextButton;
    private javax.swing.JList<String> playlistScreen;
    private javax.swing.JLabel previousButton;
    // End of variables declaration//GEN-END:variables
}
