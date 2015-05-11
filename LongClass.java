import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.NumberFormat;



class LongClass extends JFrame
{
  
private JPanel headerPanel,p1,p2,p3,p4,p5,p6;
private JPanel p7,p8,p9,p10,p11,p12, footerPanel, footerPanel2, excursion1Panel, excursion2Panel, excursion3Panel;

private JLabel headerLabel, cabOneLabel, cabTwoLabel, cabThreeLabel, cabFourLabel, cabFiveLabel, suiteOneLabel; //Pinal
private JLabel cabSixLabel, cabSevenLabel, cabEightLabel, cabNineLabel, cabTenLabel, suiteTwoLabel;
  
private JLabel cabOnePL, cabTwoPL, cabThreePL, cabFourPL, cabFivePL, suiteOnePL;
private JLabel cabSixPL, cabSevenPL, cabEightPL, cabNinePL, cabTenPL, suiteTwoPL;

private JLabel footerLabel, footerLabel2, usrInputLabel;
private JLabel firstNameLabel, lastNameLabel, numberInCabinLabel, addressLabel, stateLabel, cityLabel, zipLabel, exceedMaxLabel, diningTimeLabel;

private JLabel destOneLabel, destTwoLabel, destThreeLabel;

private int dest1ExPrice, dest2ExPrice, dest3ExPrice;
private int portFee = 160;

private double cabinPrice;
private final double SALES_TAX=.0625;

private String cruiseLine="Murracruise", shipName="Murratime Limited", dateSailing="10/31/15 - 11/5/16";
private String dest1Ex, dest2Ex, dest3Ex;



private String cabin1 = "Cabin 11-1", cabin2 = "Cabin 11-2", cabin3 = "Cabin 11-3", cabin4 = "Cabin 11-4", cabin5 = "Cabin 11-5";
private String cabin6 = "Cabin 11-6", cabin7 = "Cabin 11-7", cabin8 = "Cabin 11-8", cabin9 = "Cabin 11-9", cabin10 = "Cabin 11-10";
private String suite1 = "Suite 11-S1", suite2 = "Suite 11-S2";
private String selectedCabin, occupied = "OCCUPIED";
private String enteredFirstName, enteredLastName, enteredAddress, enteredCity, enteredState, enteredZip, enteredDiningTime;
private String cabin1200 ="$1200", cabin1400="$1400", cabin1250="$1250", cabin1600="$1600", cabin8000="$8000";

private ButtonGroup rGroup;

private JRadioButton cab1B, cab2B, cab3B, cab4B, cab5B, cab6B, cab7B, cab8B, cab9B, cab10B, su1B, su2B;
private JRadioButton sevenPM, ninePM;
private JRadioButton Ex1Op1, Ex1Op2, Ex1Op3, Ex1Op4;
private JRadioButton Ex2Op1, Ex2Op2, Ex2Op3;
private JRadioButton Ex3Op1, Ex3Op2, Ex3Op3, Ex3Op4, Ex3Op5;



private JTextField firstNameTF, lastNameTF, addressTF, numberInCabinTF, stateTF, cityTF, zipTF;

private int vacantCabins=12, maxPeople, enteredNoInParty;

private JButton proceed, submit, reserve;


  
//---------------------------------------------------------------------------------------------------------------------  
//  Constructor Begin
//--------------------------------------------------------------------------------------------------------------------- 



 public LongClass() 
    {
   

   
   
// Adding RadioButtons!  
   
   cab1B=new JRadioButton(cabin1);
   cab2B=new JRadioButton(cabin2);
   cab3B=new JRadioButton(cabin3);
   cab4B=new JRadioButton(cabin4);
   cab5B=new JRadioButton(cabin5);   /* CREATING RADIO BUTTON OBJECTS  */
   cab6B=new JRadioButton(cabin6);
   cab7B=new JRadioButton(cabin7);
   cab8B=new JRadioButton(cabin8);
   cab9B=new JRadioButton(cabin9);
   cab10B=new JRadioButton(cabin10);
   su1B=new JRadioButton(suite1);
   su2B=new JRadioButton(suite2);

   
   cab1B.setBackground(Color.black);
   cab2B.setBackground(Color.black);
   cab3B.setBackground(Color.black);
   cab4B.setBackground(Color.black);
   cab5B.setBackground(Color.black);
   cab6B.setBackground(Color.black);   /* ASSIGNING BUTTON BACKGROUND COLOR */
   cab7B.setBackground(Color.black);
   cab8B.setBackground(Color.black);
   cab9B.setBackground(Color.black);
   cab10B.setBackground(Color.black);
   su1B.setBackground(Color.black);
   su2B.setBackground(Color.black);
   
   cab1B.setForeground(Color.white);
   cab2B.setForeground(Color.white);
   cab3B.setForeground(Color.white);
   cab4B.setForeground(Color.white);
   cab5B.setForeground(Color.white);  /* ASSIGNING TEXT COLOR OF BUTTONS */
   cab6B.setForeground(Color.white);
   cab7B.setForeground(Color.white);
   cab8B.setForeground(Color.white);
   cab9B.setForeground(Color.white);
   cab10B.setForeground(Color.white);
   su1B.setForeground(Color.white);
   su2B.setForeground(Color.white);
  
   
   
 rGroup = new ButtonGroup(); 
    rGroup.add(cab1B);
    rGroup.add(cab2B);
    rGroup.add(cab3B);
    rGroup.add(cab4B);
    rGroup.add(cab5B);     /* ADDING BUTTONS OBJECTS TO A BUTTON GROUP  */
    rGroup.add(cab6B);
    rGroup.add(cab7B);
    rGroup.add(cab8B);
    rGroup.add(cab9B);
    rGroup.add(cab10B);
    rGroup.add(su1B);
    rGroup.add(su2B);
    

    
   
   ButtonListener listener = new ButtonListener();
   cab1B.addActionListener(listener);
   cab2B.addActionListener(listener);
   cab2B.addActionListener(listener);
   cab3B.addActionListener(listener);
   cab4B.addActionListener(listener);
   cab5B.addActionListener(listener);   /* ADDING A LISTENER OBJECT TO EACH BUTTON OBJECT  */
   cab6B.addActionListener(listener);
   cab7B.addActionListener(listener);
   cab8B.addActionListener(listener);
   cab9B.addActionListener(listener);
   cab10B.addActionListener(listener);
   su1B.addActionListener(listener);
   su2B.addActionListener(listener);
   
   //FINALIZE BUTTON
   reserve=new JButton("EXIT");
   reserve.setPreferredSize(new Dimension(80,140));
   reserve.addActionListener(listener);
   
      
   //EXCURSION BUTTONS
 // Ex1Op1, Ex1Op2, Ex1Op3, Ex1Op4;
   
   Ex1Op1=new JRadioButton("Stingray Swim $110");
   Ex1Op2=new JRadioButton("Island Tour $70");
   Ex1Op3=new JRadioButton("Catemaran Tour $85");
   Ex1Op4=new JRadioButton("None");
   
   Ex2Op1=new JRadioButton("Horseback Riding - $110");
   Ex2Op2=new JRadioButton("Glass Bottom Boat - $50");
   Ex2Op3=new JRadioButton("None");
   
   
   Ex3Op1=new JRadioButton("Beach Golf - $190");
   Ex3Op2=new JRadioButton("Historical Highlight - $50");
   Ex3Op3=new JRadioButton("Two Tank Dive - &70");
   Ex3Op4=new JRadioButton("Dolphin Encounter - $170");
   Ex3Op5=new JRadioButton("None");
   
   //EXCURSION  BUTTON GROUP
   ButtonGroup Ex1BG=new ButtonGroup();
   Ex1BG.add(Ex1Op1);
   Ex1BG.add(Ex1Op2);
   Ex1BG.add(Ex1Op3);
   Ex1BG.add(Ex1Op4);
   
   ButtonGroup Ex2BG=new ButtonGroup();
   Ex2BG.add(Ex2Op1);
   Ex2BG.add(Ex2Op2);
   Ex2BG.add(Ex2Op3);
   
   ButtonGroup Ex3BG=new ButtonGroup();
   Ex3BG.add(Ex3Op1);
   Ex3BG.add(Ex3Op2);
   Ex3BG.add(Ex3Op3);
   Ex3BG.add(Ex3Op4);
   Ex3BG.add(Ex3Op5);
   
  //adding listener 
   Ex1Op1.addActionListener(listener);
   Ex1Op2.addActionListener(listener);
   Ex1Op3.addActionListener(listener);
   Ex1Op4.addActionListener(listener);
   
   Ex2Op1.addActionListener(listener);
   Ex2Op2.addActionListener(listener);
   Ex2Op3.addActionListener(listener);
   
   Ex3Op1.addActionListener(listener);
   Ex3Op2.addActionListener(listener);
   Ex3Op3.addActionListener(listener);
   Ex3Op4.addActionListener(listener);
   Ex3Op5.addActionListener(listener);
   
   //setting background and foreground for excursion one buttons
   Ex1Op1.setBackground(Color.black);
   Ex1Op2.setBackground(Color.black);
   Ex1Op3.setBackground(Color.black);
   Ex1Op4.setBackground(Color.black);
   
   Ex1Op1.setForeground(Color.white);
   Ex1Op2.setForeground(Color.white);
   Ex1Op3.setForeground(Color.white);
   Ex1Op4.setForeground(Color.white);
   
   Ex2Op1.setBackground(Color.black);
   Ex2Op2.setBackground(Color.black);
   Ex2Op3.setBackground(Color.black);
   
   Ex2Op1.setForeground(Color.white);
   Ex2Op2.setForeground(Color.white);
   Ex2Op3.setForeground(Color.white);
   
   Ex3Op1.setBackground(Color.black);
   Ex3Op2.setBackground(Color.black);
   Ex3Op3.setBackground(Color.black);
   Ex3Op4.setBackground(Color.black);
   Ex3Op5.setBackground(Color.black);
   
   Ex3Op1.setForeground(Color.white);
   Ex3Op2.setForeground(Color.white);
   Ex3Op3.setForeground(Color.white);
   Ex3Op4.setForeground(Color.white);
   Ex3Op5.setForeground(Color.white);
   
   
   
   
   
   
    //---------------------------------------------------------------------------------------------------------    
   // CODE FOR THE DINING RADIO BUTTONS
    sevenPM=new JRadioButton("7:00 PM");
    ninePM=new JRadioButton("9:00 PM");
    
    sevenPM.setBackground(Color.white);
    ninePM.setBackground(Color.white);
    
    sevenPM.setForeground(Color.black);
    ninePM.setForeground(Color.black);
    
    sevenPM.addActionListener(listener);
    ninePM.addActionListener(listener);
    
    ButtonGroup dGroup=new ButtonGroup();
    dGroup.add(sevenPM);
    dGroup.add(ninePM);
//---------------------------------------------------------------------------------------------------------  
   
   
   
   
   
   
   
        // Set title and default close operation
        setTitle("MurraCruise");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        // Set a background for JFrame
        setContentPane(new JLabel(new ImageIcon("ci.jpg")));
        
        
        
        // Set some layout, say FlowLayout
        setLayout(new FlowLayout());
        
        

        
        // Create a JPanel
        headerPanel=new JPanel();
        footerPanel=new JPanel();
        footerPanel2=new JPanel();
        excursion1Panel=new JPanel();
        excursion2Panel=new JPanel();
        excursion3Panel=new JPanel();
        
        

        


      
        
        // Set the background, black with 125 as alpha value
        // This is less transparent
        headerPanel.setBackground(new Color(0,0,0,100));
        footerPanel.setBackground(new Color(0,0,0,100));
        footerPanel2.setBackground(new Color(0,0,0,100));
        excursion1Panel.setBackground(new Color(0,0,0,100));
        excursion2Panel.setBackground(new Color(0,0,0,100));
        excursion3Panel.setBackground(new Color(0,0,0,100));
      
        
        
        // Create another JPanel
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();
        p5=new JPanel();
        p6=new JPanel();
        
        p7=new JPanel();
        p8=new JPanel();
        p9=new JPanel();
        p10=new JPanel();
        p11=new JPanel();
        p12=new JPanel();
        
        // This is more transparent than the previous
        // one
        p1.setBackground(new Color(243,243,243,155));
        p2.setBackground(new Color(243,243,243,155));
        p3.setBackground(new Color(243,243,243,155));
        p4.setBackground(new Color(243,243,243,155));
        p5.setBackground(new Color(243,243,243,155));
        p6.setBackground(new Color(243,243,243,155));
        
        p7.setBackground(new Color(243,243,243,155));
        p8.setBackground(new Color(243,243,243,155));
        p9.setBackground(new Color(243,243,243,155));
        p10.setBackground(new Color(243,243,243,155));
        p11.setBackground(new Color(243,243,243,155));
        p12.setBackground(new Color(243,243,243,155));
        
        // Set some size to the panels
        headerPanel.setPreferredSize(new Dimension(1500,90));
        footerPanel.setPreferredSize(new Dimension(600, 250));
        footerPanel2.setPreferredSize(new Dimension(500, 250));
        excursion1Panel.setPreferredSize(new Dimension(350,140));
        excursion2Panel.setPreferredSize(new Dimension(350,140));
        excursion3Panel.setPreferredSize(new Dimension(350,140));
        
        
        p1.setPreferredSize(new Dimension(100,100)); //--------------------------------
        p2.setPreferredSize(new Dimension(140,100));
        p3.setPreferredSize(new Dimension(140,100));
        p4.setPreferredSize(new Dimension(110,100));
        p5.setPreferredSize(new Dimension(260,100));
        p6.setPreferredSize(new Dimension(350,100));
        
        p7.setPreferredSize(new Dimension(100,100));
        p8.setPreferredSize(new Dimension(140,100));
        p9.setPreferredSize(new Dimension(140,100));
        p10.setPreferredSize(new Dimension(110,100));
        p11.setPreferredSize(new Dimension(260,100));
        p12.setPreferredSize(new Dimension(350,100));
        
//-----------------------------------------------------------------------------------------
// SOME HEADER AND FOOTER PANEL LABELS
//-----------------------------------------------------------------------------------------
        headerLabel=new JLabel("MURRACRUISE");
        Font font = new Font("Times New Roman", Font.BOLD, 80);
        headerLabel.setFont(font);
        headerLabel.setForeground(Color.WHITE);
        headerPanel.add(headerLabel);
        
        footerLabel=new JLabel("CABIN SELECTION");
        Font footerFont = new Font("Times New Roman", Font.BOLD, 60);
        footerLabel.setFont(footerFont);
        footerLabel.setForeground(new Color(243,243,243,175));
        footerPanel.add(footerLabel);
        
        footerLabel2=new JLabel("select a cabin and click next!");
        Font footerFont2=new Font("Times New Roman", Font.BOLD, 45);
        footerLabel2.setFont(footerFont2);
        footerLabel2.setForeground(new Color(243,243,243,175));
        footerPanel.add(footerLabel2);
        
        usrInputLabel=new JLabel("Tell us about yourself!");
        Font footerFont3=new Font("Times New Roman", Font.BOLD, 50);
        usrInputLabel.setFont(footerFont3);
        usrInputLabel.setForeground(new Color(243,243,243,175));
        footerPanel2.add(usrInputLabel);
        

        firstNameLabel=new JLabel("First Name: ");
        Font smallFont=new Font("Times New Roman", Font.BOLD, 15);
        firstNameLabel.setFont(smallFont);
        firstNameLabel.setForeground(new Color(243,243,243,175));
        footerPanel2.add(firstNameLabel);
//------------------------------------------------------------------------------------------------------------*****************************************        

        
        destOneLabel=new JLabel("GRAND TURK, TURKS ISLANDS");
         Font ExFont=new Font("Times New Roman", Font.BOLD, 20);
        destOneLabel.setFont(ExFont);
        destOneLabel.setForeground(new Color(243,243,243,175));
        excursion1Panel.add(destOneLabel); 
        
        destTwoLabel=new JLabel("HALF-MOON CAY, THE BAHAMAS");
        destTwoLabel.setFont(ExFont);
        destTwoLabel.setForeground(new Color(243,243,243,175));
        excursion2Panel.add(destTwoLabel); 
        
        destThreeLabel=new JLabel("NASSU, THE BAHAMAS");
        destThreeLabel.setFont(ExFont);
        destThreeLabel.setForeground(new Color(243,243,243,175));
        excursion3Panel.add(destThreeLabel); 
     
        // radio buttons to excursion one panel
        excursion1Panel.add(Ex1Op1);
        excursion1Panel.add(Ex1Op2);
        excursion1Panel.add(Ex1Op3);
        excursion1Panel.add(Ex1Op4);
        
        // radio buttons to excursion panel two
        excursion2Panel.add(Ex2Op1);
        excursion2Panel.add(Ex2Op2);
        excursion2Panel.add(Ex2Op3);
        
        //add radio buttons to excursion panel 3
        excursion3Panel.add(Ex3Op1);
        excursion3Panel.add(Ex3Op2);
        excursion3Panel.add(Ex3Op3);
        excursion3Panel.add(Ex3Op4);
        excursion3Panel.add(Ex3Op5);
        
       
        
        

    
        
        
        //CABIN 1 LABELS
       cabOneLabel=new JLabel(cabin1);
       cabOnePL=new JLabel(cabin1200);
       
       
       cabOnePL.setFont(new Font("Serif", Font.BOLD, 18));
       cabOneLabel.setFont(new Font("Serif", Font.BOLD, 18));
       
       cabOnePL.setForeground(Color.BLACK);
       cabOneLabel.setForeground(Color.BLACK); 
       
       p1.add(cabOneLabel);     /*******************/
       p1.add(cabOnePL);
       
       
       //CABIN 2 LABELS
       cabTwoLabel=new JLabel(cabin2);
       cabTwoPL=new JLabel(cabin1400);
       
       cabTwoPL.setFont(new Font("Serif", Font.BOLD, 25));
       cabTwoLabel.setFont(new Font("Serif", Font.BOLD, 24));
       
       cabTwoPL.setForeground(Color.BLACK);
       cabTwoLabel.setForeground(Color.BLACK); 
       
       p2.add(cabTwoLabel);     /*******************/
       p2.add(cabTwoPL);
       
       
       //CABIN 3 LABELS
       cabThreeLabel=new JLabel(cabin3);
       cabThreePL=new JLabel(cabin1400);
       
       cabThreePL.setFont(new Font("Serif", Font.BOLD, 25));
       cabThreeLabel.setFont(new Font("Serif", Font.BOLD, 24));
       
       cabThreePL.setForeground(Color.BLACK);
       cabThreeLabel.setForeground(Color.BLACK); 
       
       p3.add(cabThreeLabel);     /*******************/
       p3.add(cabThreePL);
       
       
        //CABIN 4 LABELS
       cabFourLabel=new JLabel(cabin4);
       cabFourPL=new JLabel(cabin1250);
       
       cabFourPL.setFont(new Font("Serif", Font.BOLD, 18));
       cabFourLabel.setFont(new Font("Serif", Font.BOLD, 18));
       
       cabFourPL.setForeground(Color.BLACK);
       cabFourLabel.setForeground(Color.BLACK); 
       
       p4.add(cabFourLabel);     /*******************/
       p4.add(cabFourPL);
       
       
       //CABIN 5 LABELS
       cabFiveLabel=new JLabel(cabin5);
       cabFivePL=new JLabel(cabin1600);
       
       cabFivePL.setFont(new Font("Serif", Font.BOLD, 27));
       cabFiveLabel.setFont(new Font("Serif", Font.BOLD, 26));
       
       cabFivePL.setForeground(Color.BLACK);
       cabFiveLabel.setForeground(Color.BLACK); 
       
       p5.add(cabFiveLabel);     /*******************/
       p5.add(cabFivePL);
       
       p5.setLayout(new BoxLayout(p5, BoxLayout.Y_AXIS));                       //*****************************************
       cabFivePL.setAlignmentX(Component.CENTER_ALIGNMENT);        //BOXLAYOUT CENTERED ALONG THE Y-AXIS HERE
       cabFiveLabel.setAlignmentX(Component.CENTER_ALIGNMENT);     //******************************************
       
       
       
       //SUITE ONE LABELS
       suiteOneLabel=new JLabel(suite1);
       suiteOnePL=new JLabel(cabin8000);
       
       suiteOnePL.setFont(new Font("Serif", Font.BOLD, 27));
       suiteOneLabel.setFont(new Font("Serif", Font.BOLD, 26));
       
       suiteOnePL.setForeground(Color.BLACK);
       suiteOneLabel.setForeground(Color.BLACK); 
       
       p6.add(suiteOneLabel);     /*******************/
       p6.add(suiteOnePL);
       
       p6.setLayout(new BoxLayout(p6, BoxLayout.Y_AXIS));                        //*****************************************
       suiteOnePL.setAlignmentX(Component.CENTER_ALIGNMENT);        //BOXLAYOUT CENTERED ALONG THE Y-AXIS HERE
       suiteOneLabel.setAlignmentX(Component.CENTER_ALIGNMENT);     //******************************************
       

       //CABIN 6 LABELS
       cabSixLabel=new JLabel(cabin6);
       cabSixPL=new JLabel(cabin1200);
       
       cabSixPL.setFont(new Font("Serif", Font.BOLD, 18));
       cabSixLabel.setFont(new Font("Serif", Font.BOLD, 18));
       
       cabSixPL.setForeground(Color.BLACK);
       cabSixLabel.setForeground(Color.BLACK); 
       
       p7.add(cabSixLabel);     /*******************/
       p7.add(cabSixPL);
       
       
       
       //CABIN 7 LABELS
       cabSevenLabel=new JLabel(cabin7);
       cabSevenPL=new JLabel(cabin1400);
       
       cabSevenPL.setFont(new Font("Serif", Font.BOLD, 25));
       cabSevenLabel.setFont(new Font("Serif", Font.BOLD, 24));
       
       cabSevenPL.setForeground(Color.BLACK);
       cabSevenLabel.setForeground(Color.BLACK); 
       
       p8.add(cabSevenLabel);     /*******************/
       p8.add(cabSevenPL);
       
   
       //CABIN 8 LABELS
       cabEightLabel=new JLabel(cabin8);
       cabEightPL=new JLabel(cabin1400);
       
       cabEightPL.setFont(new Font("Serif", Font.BOLD, 25));
       cabEightLabel.setFont(new Font("Serif", Font.BOLD, 24));
       
       cabEightPL.setForeground(Color.BLACK);
       cabEightLabel.setForeground(Color.BLACK); 
       
       p9.add(cabEightLabel);     /*******************/
       p9.add(cabEightPL);
       
       
       
       //CABIN 9 LABELS 
       cabNineLabel=new JLabel(cabin9);
       cabNinePL=new JLabel(cabin1250);
       
       cabNinePL.setFont(new Font("Serif", Font.BOLD, 18));
       cabNineLabel.setFont(new Font("Serif", Font.BOLD, 18));
       
       cabNinePL.setForeground(Color.BLACK);
       cabNineLabel.setForeground(Color.BLACK); 
       
       p10.add(cabNineLabel);     /*******************/
       p10.add(cabNinePL);
       
       
       
       //CABIN 10 LABELS 
       cabTenLabel=new JLabel(cabin10);
       cabTenPL=new JLabel(cabin1600);
       
       cabTenPL.setFont(new Font("Serif", Font.BOLD, 27));
       cabTenLabel.setFont(new Font("Serif", Font.BOLD, 26));
       
       cabTenPL.setForeground(Color.BLACK);
       cabTenLabel.setForeground(Color.BLACK); 
       
       p11.add(cabTenLabel);     /*******************/
       p11.add(cabTenPL);
       
       p11.setLayout(new BoxLayout(p11, BoxLayout.Y_AXIS));                  //*****************************************
       cabTenPL.setAlignmentX(Component.CENTER_ALIGNMENT);        //BOXLAYOUT CENTERED ALONG THE Y-AXIS HERE
       cabTenLabel.setAlignmentX(Component.CENTER_ALIGNMENT);     //******************************************
       
       
       
       //SUITE TWO LABELS
       suiteTwoLabel=new JLabel(suite2);
       suiteTwoPL=new JLabel(cabin8000);
       
       suiteTwoPL.setFont(new Font("Serif", Font.BOLD, 27));
       suiteTwoLabel.setFont(new Font("Serif", Font.BOLD, 26));
       
       suiteTwoPL.setForeground(Color.BLACK);
       suiteTwoLabel.setForeground(Color.BLACK); 
       
       p12.add(suiteTwoLabel);     /*******************/
       p12.add(suiteTwoPL);
       
       p12.setLayout(new BoxLayout(p12, BoxLayout.Y_AXIS));                      //*****************************************
       suiteTwoPL.setAlignmentX(Component.CENTER_ALIGNMENT);        //BOXLAYOUT CENTERED ALONG THE Y-AXIS HERE
       suiteTwoLabel.setAlignmentX(Component.CENTER_ALIGNMENT); 
       
       
 //-------------------------------------------------------


     
//----------------------------------------------------------      
       
       
        // Add the panels to the JFrame
        add(headerPanel);
        
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p6);
        
        add(p7);
        add(p8);
        add(p9);
        add(p10);
        add(p11);
        add(p12);
        add(excursion1Panel);
        add(excursion2Panel);
        add(excursion3Panel);
        add(reserve);
        excursion1Panel.setVisible(false);
        excursion2Panel.setVisible(false);
        excursion3Panel.setVisible(false);
        reserve.setVisible(false);
        
        
        
        footerPanel.add(cab1B);
        footerPanel.add(cab2B);
        footerPanel.add(cab3B);
        footerPanel.add(cab4B);
        footerPanel.add(cab5B);
        footerPanel.add(su1B);
        footerPanel.add(cab6B);     /* ADDING RADIO BUTTONS TO THE FOOTER PANEL */
        footerPanel.add(cab7B);
        footerPanel.add(cab8B);
        footerPanel.add(cab9B);
        footerPanel.add(cab10B);
        footerPanel.add(su2B);
        
        
 

     
        
        add(footerPanel);
        add(footerPanel2);
    
        
        
    
        
        
    
        
        
//---------------------------------------------------------------------------------------------------------------
//  JBUTTON FOR FOOTERPANEL2
//----------------------------------------------------------------------------------------------------------------        
       proceed=new JButton("Next");
       proceed.setBackground(Color.white);
       proceed.setPreferredSize(new Dimension(170, 25));
       proceed.addActionListener(listener);
       footerPanel.add(proceed);
       

       
//---------------------------------------------------------------------------------------------------------------        
// TEXTFIELDS FOR FOOTERPANEL2
//---------------------------------------------------------------------------------------------------------------       
       firstNameTF=new JTextField(13);
       firstNameTF.addActionListener(listener);
//    firstNameTF.setHorizontalAlignment(JTextField.CENTER);
       footerPanel2.add(firstNameTF);
       firstNameTF.setBackground(Color.white);
       
       
 //      footerPanel2.setVisible(false);
      
  //     numberInCabLabel
      lastNameLabel=new JLabel("Last Name: ");  
      lastNameLabel.setFont(smallFont);
      lastNameLabel.setForeground(new Color(243,243,243,175));
      footerPanel2.add(lastNameLabel);
      
      //LAST NAME TEXT FIELD
      lastNameTF=new JTextField(12);
      lastNameTF.addActionListener(listener);
//    lastNameTF.setHorizontalAlignment(JTextField.CENTER);
      footerPanel2.add(lastNameTF);
      lastNameTF.setBackground(Color.white);
      
      //ADDRES LABEL
      addressLabel=new JLabel("Address: ");  
      addressLabel.setFont(smallFont);
      addressLabel.setForeground(new Color(243,243,243,175));
      footerPanel2.add(addressLabel);
      
      //ADDRESS TEXT FIELD
      addressTF=new JTextField(36);
      addressTF.addActionListener(listener);
      addressTF.setBackground(Color.white);
      footerPanel2.add(addressTF);
      
      //CITY LABEL
      cityLabel=new JLabel("City: ");  
      cityLabel.setFont(smallFont);
      cityLabel.setForeground(new Color(243,243,243,175));
      footerPanel2.add(cityLabel);
      
     //CITY TEXT FIELD
      cityTF=new JTextField(10);
      cityTF.addActionListener(listener);
      cityTF.setBackground(Color.white);
      footerPanel2.add(cityTF);
      
      //STATE LABEL
      stateLabel=new JLabel("State: ");  
      stateLabel.setFont(smallFont);
      stateLabel.setForeground(new Color(243,243,243,175));
      footerPanel2.add(stateLabel);
      
      //STATE TEXT FIELD
      stateTF=new JTextField(2);
      stateTF.addActionListener(listener);
      stateTF.setBackground(Color.white);
      footerPanel2.add(stateTF);
      
      //ZIP LABEL
      zipLabel=new JLabel("Zip: ");  
      zipLabel.setFont(smallFont);
      zipLabel.setForeground(new Color(243,243,243,175));
      footerPanel2.add(zipLabel);
      
      //ZIP TEXT FIELD
      zipTF=new JTextField(5);
      zipTF.addActionListener(listener);
      zipTF.setBackground(Color.white);
      footerPanel2.add(zipTF);
      
      //NUM IN CABIN LABEL
      numberInCabinLabel=new JLabel("No. in party: ");  
      numberInCabinLabel.setFont(smallFont);
      numberInCabinLabel.setForeground(new Color(243,243,243,175));
      footerPanel2.add( numberInCabinLabel);
      
      //NUM IN CABIN TEXT FIELD
      numberInCabinTF=new JTextField(2);
      numberInCabinTF.addActionListener(listener);
      numberInCabinTF.setBackground(Color.white);
      footerPanel2.add( numberInCabinTF);
      
            
      //DINING TIME LABEL
      diningTimeLabel=new JLabel("Dining Time: ");  
      diningTimeLabel.setFont(smallFont);
      diningTimeLabel.setForeground(new Color(243,243,243,175));
      footerPanel2.add( diningTimeLabel);
      
     //ADDING DINING RADIO BUTTONS 
    footerPanel2.add(sevenPM);
    footerPanel2.add(ninePM);
      
      
      
     //SUBMIT BUTTON 
       submit=new JButton("Submit");
      submit.setBackground(Color.white);
      submit.setPreferredSize(new Dimension(300, 25));
      submit.addActionListener(listener);
      footerPanel2.add(submit);
      
  
      
/*      // EXCEED NO IN PARTY LABEL        
        exceedMaxLabel=new JLabel("Try Again");
        exceedMaxLabel.setFont(smallFont);
        exceedMaxLabel.setForeground(new Color(243,243,243,175));
        exceedMaxLabel.setBackground(Color.black);
         footerPanel2.add(exceedMaxLabel);
         exceedMaxLabel.setVisible(false);  */

footerPanel2.setVisible(false);
        
// JFRAME SIZE!!!!!!!----------------------------------------------------------------------------------
// make it visible
        setSize(1200,750);
        setVisible(true);
        setResizable(false); 
    }
 
 // Constructor End
  
 NumberFormat fmt=  NumberFormat.getCurrencyInstance();

 
 private class ButtonListener implements ActionListener{
   

   
   public void actionPerformed(ActionEvent event){
    Object source = event.getSource();
      
    if (cab1B.isSelected())
     {  
/*      cab1B.setText(occupied); 
      cab2B.setText(cabin2);
      cab3B.setText(cabin3);
      cab4B.setText(cabin4);
      cab5B.setText(cabin5);   
      cab6B.setText(cabin6);
      cab7B.setText(cabin7);
      cab8B.setText(cabin8);
      cab9B.setText(cabin9);
      cab10B.setText(cabin10);
      su1B.setText(suite1);
      su2B.setText(suite2);    */
      
      maxPeople=2;
      cabinPrice= 1200.00;
      selectedCabin=cab1B.getText();
     // System.out.println(fmt.format(cabinPrice));
      
/*      cab1B.setEnabled(false);
      cab2B.setEnabled(true);
      cab3B.setEnabled(true);
      cab4B.setEnabled(true);
      cab5B.setEnabled(true);
      cab6B.setEnabled(true);
      cab7B.setEnabled(true);
      cab8B.setEnabled(true);
      cab9B.setEnabled(true);
      cab10B.setEnabled(true);
      su1B.setEnabled(true);
      su2B.setEnabled(true);  */

      
 } else  if (cab2B.isSelected()){
   
/*        cab1B.setText(cabin1); 
      cab2B.setText(occupied);
      cab3B.setText(cabin3);
      cab4B.setText(cabin4);
      cab5B.setText(cabin5);   
      cab6B.setText(cabin6);
      cab7B.setText(cabin7);
      cab8B.setText(cabin8);
      cab9B.setText(cabin9);
      cab10B.setText(cabin10);
      su1B.setText(suite1);
      su2B.setText(suite2);  */
      
      maxPeople=3;
      cabinPrice= 1400;
      selectedCabin=cab2B.getText();
       
/*       cab1B.setEnabled(true);
       cab2B.setEnabled(false);
       cab3B.setEnabled(true);
       cab4B.setEnabled(true);
       cab5B.setEnabled(true);
       cab6B.setEnabled(true);
       cab7B.setEnabled(true);
       cab8B.setEnabled(true);
       cab9B.setEnabled(true);
       cab10B.setEnabled(true);
       su1B.setEnabled(true);
       su2B.setEnabled(true);  */

      

 } else  if (cab3B.isSelected()){
   
/*        cab1B.setText(cabin1); 
      cab2B.setText(cabin2);
      cab3B.setText(occupied);
      cab4B.setText(cabin4);
      cab5B.setText(cabin5);   
      cab6B.setText(cabin6);
      cab7B.setText(cabin7);
      cab8B.setText(cabin8);
      cab9B.setText(cabin9);
      cab10B.setText(cabin10);
      su1B.setText(suite1);
      su2B.setText(suite2);   */
      
      maxPeople=3;
      cabinPrice= 1400;
      selectedCabin=cab3B.getText();
       
/*       cab1B.setEnabled(true);
       cab2B.setEnabled(true);
       cab3B.setEnabled(false);
       cab4B.setEnabled(true);
       cab5B.setEnabled(true);
       cab6B.setEnabled(true);
       cab7B.setEnabled(true);
       cab8B.setEnabled(true);
       cab9B.setEnabled(true);
       cab10B.setEnabled(true);
       su1B.setEnabled(true);
       su2B.setEnabled(true);  */
      
    } else  if (cab4B.isSelected()){
      
 /*       cab1B.setText(cabin1); 
      cab2B.setText(cabin2);
      cab3B.setText(cabin3);
      cab4B.setText(occupied);
      cab5B.setText(cabin5);   
      cab6B.setText(cabin6);
      cab7B.setText(cabin7);
      cab8B.setText(cabin8);
      cab9B.setText(cabin9);
      cab10B.setText(cabin10);
      su1B.setText(suite1);
      su2B.setText(suite2);  */
      
      maxPeople=2;
      cabinPrice= 1250;
      selectedCabin=cab4B.getText();
       
/*       cab1B.setEnabled(true);
       cab2B.setEnabled(true);
       cab3B.setEnabled(true);
       cab4B.setEnabled(false);
       cab5B.setEnabled(true);
       cab6B.setEnabled(true);
       cab7B.setEnabled(true);
       cab8B.setEnabled(true);
       cab9B.setEnabled(true);
       cab10B.setEnabled(true);
       su1B.setEnabled(true);
       su2B.setEnabled(true);  */
       
    } else  if (cab5B.isSelected()){
      
/*        cab1B.setText(cabin1); 
      cab2B.setText(cabin2);
      cab3B.setText(cabin3);
      cab4B.setText(cabin4);
      cab5B.setText(occupied);   
      cab6B.setText(cabin6);
      cab7B.setText(cabin7);
      cab8B.setText(cabin8);
      cab9B.setText(cabin9);
      cab10B.setText(cabin10);
      su1B.setText(suite1);
      su2B.setText(suite2);  */
      
      maxPeople=3;
      cabinPrice= 1600;
      selectedCabin=cab5B.getText();
       
 /*      cab1B.setEnabled(true);
       cab2B.setEnabled(true);
       cab3B.setEnabled(true);
       cab4B.setEnabled(true);
       cab5B.setEnabled(false);
       cab6B.setEnabled(true);
       cab7B.setEnabled(true);
       cab8B.setEnabled(true);
       cab9B.setEnabled(true);
       cab10B.setEnabled(true);
       su1B.setEnabled(true);
       su2B.setEnabled(true);  */
      
    } else  if (su1B.isSelected()){
      
     
/*        cab1B.setText(cabin1); 
      cab2B.setText(cabin2);
      cab3B.setText(cabin3);
      cab4B.setText(cabin4);
      cab5B.setText(cabin5);   
      cab6B.setText(cabin6);
      cab7B.setText(cabin7);
      cab8B.setText(cabin8);
      cab9B.setText(cabin9);
      cab10B.setText(cabin10);
      su1B.setText(occupied);
      su2B.setText(suite2);   */
      
      maxPeople=4;
      cabinPrice= 8000;
       selectedCabin=su1B.getText();
       
/*       cab1B.setEnabled(true);
       cab2B.setEnabled(true);
       cab3B.setEnabled(true);
       cab4B.setEnabled(true);
       cab5B.setEnabled(true);
       cab6B.setEnabled(true);
       cab7B.setEnabled(true);
       cab8B.setEnabled(true);
       cab9B.setEnabled(true);
       cab10B.setEnabled(true);
       su1B.setEnabled(false);
       su2B.setEnabled(true);  */
      
    } else  if (cab6B.isSelected()){
      
/*        cab1B.setText(cabin1); 
      cab2B.setText(cabin2);
      cab3B.setText(cabin3);
      cab4B.setText(cabin4);
      cab5B.setText(cabin5);   
      cab6B.setText(occupied);
      cab7B.setText(cabin7);
      cab8B.setText(cabin8);
      cab9B.setText(cabin9);
      cab10B.setText(cabin10);
      su1B.setText(suite1);
      su2B.setText(suite2);  */
      
      maxPeople=2;
      cabinPrice= 1200;
      selectedCabin=cab6B.getText();
       
/*       cab1B.setEnabled(true);
       cab2B.setEnabled(true);
       cab3B.setEnabled(true);
       cab4B.setEnabled(true);
       cab5B.setEnabled(true);
       cab6B.setEnabled(false);
       cab7B.setEnabled(true);
       cab8B.setEnabled(true);
       cab9B.setEnabled(true);
       cab10B.setEnabled(true);
       su1B.setEnabled(true);
       su2B.setEnabled(true);  */
      
    } else  if (cab7B.isSelected()){
      
/*        cab1B.setText(cabin1); 
      cab2B.setText(cabin2);
      cab3B.setText(cabin3);
      cab4B.setText(cabin4);
      cab5B.setText(cabin5);   
      cab6B.setText(cabin6);
      cab7B.setText(occupied);
      cab8B.setText(cabin8);
      cab9B.setText(cabin9);
      cab10B.setText(cabin10);
      su1B.setText(suite1);
      su2B.setText(suite2);  */
      
      maxPeople=3;
      cabinPrice= 1400;
      selectedCabin=cab7B.getText();
       
/*       cab1B.setEnabled(true);
       cab2B.setEnabled(true);
       cab3B.setEnabled(true);
       cab4B.setEnabled(true);
       cab5B.setEnabled(true);
       cab6B.setEnabled(true);
       cab7B.setEnabled(false);
       cab8B.setEnabled(true);
       cab9B.setEnabled(true);
       cab10B.setEnabled(true);
       su1B.setEnabled(true);
       su2B.setEnabled(true); */
      
    } else  if (cab8B.isSelected()){
      
/*        cab1B.setText(cabin1); 
      cab2B.setText(cabin2);
      cab3B.setText(cabin3);
      cab4B.setText(cabin4);
      cab5B.setText(cabin5);   
      cab6B.setText(cabin6);
      cab7B.setText(cabin7);
      cab8B.setText(occupied);
      cab9B.setText(cabin9);
      cab10B.setText(cabin10);
      su1B.setText(suite1);
      su2B.setText(suite2);  */
      
      maxPeople=3;
      cabinPrice= 1400;
      selectedCabin=cab8B.getText();
       
/*       cab1B.setEnabled(true);
       cab2B.setEnabled(true);
       cab3B.setEnabled(true);
       cab4B.setEnabled(true);
       cab5B.setEnabled(true);
       cab6B.setEnabled(true);
       cab7B.setEnabled(true);
       cab8B.setEnabled(false);
       cab9B.setEnabled(true);
       cab10B.setEnabled(true);
       su1B.setEnabled(true);
       su2B.setEnabled(true);  */
      
    } else  if (cab9B.isSelected()){
      
/*        cab1B.setText(cabin1); 
      cab2B.setText(cabin2);
      cab3B.setText(cabin3);
      cab4B.setText(cabin4);
      cab5B.setText(cabin5);   
      cab6B.setText(cabin6);
      cab7B.setText(cabin7);
      cab8B.setText(cabin8);
      cab9B.setText(occupied);
      cab10B.setText(cabin10);
      su1B.setText(suite1);
      su2B.setText(suite2);  */
      
      maxPeople=2;
      cabinPrice= 1250;
      selectedCabin=cab9B.getText();
       
/*       cab1B.setEnabled(true);
       cab2B.setEnabled(true);
       cab3B.setEnabled(true);
       cab4B.setEnabled(true);
       cab5B.setEnabled(true);
       cab6B.setEnabled(true);
       cab7B.setEnabled(true);
       cab8B.setEnabled(true);
       cab9B.setEnabled(false);
       cab10B.setEnabled(true);
       su1B.setEnabled(true);
       su2B.setEnabled(true);  */
      
    } else  if (cab10B.isSelected()){
      
/*        cab1B.setText(cabin1); 
      cab2B.setText(cabin2);
      cab3B.setText(cabin3);
      cab4B.setText(cabin4);
      cab5B.setText(cabin5);   
      cab6B.setText(cabin6);
      cab7B.setText(cabin7);
      cab8B.setText(cabin8);
      cab9B.setText(cabin9);
      cab10B.setText(occupied);
      su1B.setText(suite1);
      su2B.setText(suite2);  */
      
      maxPeople=3;
      cabinPrice= 1600;
      selectedCabin=cab10B.getText();
       
/*       cab1B.setEnabled(true);
       cab2B.setEnabled(true);
       cab3B.setEnabled(true);
       cab4B.setEnabled(true);
       cab5B.setEnabled(true);
       cab6B.setEnabled(true);
       cab7B.setEnabled(true);
       cab8B.setEnabled(true);
       cab9B.setEnabled(true);
       cab10B.setEnabled(false);
       su1B.setEnabled(true);
       su2B.setEnabled(true);  */
      
    } else  if (su2B.isSelected()){
      
 /*       cab1B.setText(cabin1); 
      cab2B.setText(cabin2);
      cab3B.setText(cabin3);
      cab4B.setText(cabin4);
      cab5B.setText(cabin5);   
      cab6B.setText(cabin6);
      cab7B.setText(cabin7);
      cab8B.setText(cabin8);
      cab9B.setText(cabin9);
      cab10B.setText(cabin10);
      su1B.setText(suite1);
      su2B.setText(occupied); */
      
       cabinPrice= 8000;
       maxPeople=4;
       selectedCabin=su2B.getText();
       
/*       cab1B.setEnabled(true);
       cab2B.setEnabled(true);
       cab3B.setEnabled(true);
       cab4B.setEnabled(true);
       cab5B.setEnabled(true);
       cab6B.setEnabled(true);
       cab7B.setEnabled(true);
       cab8B.setEnabled(true);
       cab9B.setEnabled(true);
       cab10B.setEnabled(true);
       su1B.setEnabled(true);
       su2B.setEnabled(false); */
    }
    
    if(source == proceed){
     footerPanel2.setVisible(true);
    }
      
//---------------------------------------------------------------------------------------------------------------------------------------  
// NESTED IF STATEMENTS
//---------------------------------------------------------------------------------------------------------------------------------------  
    
        if (source == submit ){ 
         
          enteredFirstName=firstNameTF.getText();
          enteredLastName=lastNameTF.getText();
          enteredAddress=addressTF.getText();
          enteredCity=cityTF.getText();
          enteredState=stateTF.getText();
          enteredZip=zipTF.getText();
          enteredNoInParty=Integer.parseInt(numberInCabinTF.getText());
              if (source == sevenPM)
               {enteredDiningTime = "7:00 PM";}
                else {enteredDiningTime = "9:00 PM";}
                

      
             if (enteredNoInParty > maxPeople){
        

               submit.setText("Max in party for this cabin is " + maxPeople+"," +" try again!");
             } else {
               excursion1Panel.setVisible(true);
               excursion2Panel.setVisible(true);
               excursion3Panel.setVisible(true);
               reserve.setVisible(true);
               

              }
 

             
          
      } 
                  
//-----------------------------------------------------------------------------------------
// EXCURSION PRICE BASED ON SELECTION
//-----------------------------------------------------------------------------------------        
        if(Ex1Op1.isSelected()){
          dest1ExPrice = 110;
          dest1Ex="Stringray Swim";
        } else if (Ex1Op2.isSelected()){
          dest1ExPrice = 70;
          dest1Ex="Island Tour";
        } else if (Ex1Op3.isSelected()){
          dest1ExPrice = 85;
          dest1Ex="Catemaran Tour";
        } else if (Ex1Op4.isSelected()) {
          dest1ExPrice = 0;
          dest1Ex = "None";
        }
        
        if(Ex2Op1.isSelected()){
          dest2ExPrice = 110;
          dest2Ex="Horseback Riding";
        } else if (Ex2Op2.isSelected()){
          dest2ExPrice = 50;
          dest2Ex="Glass Bottom Boat";
        } else if (Ex2Op3.isSelected()){
          dest2ExPrice = 0;
          dest2Ex="None";
        }
        
        if(Ex3Op1.isSelected()){
         dest3ExPrice=190;
         dest3Ex="Beach Golf";
        }else if (Ex3Op2.isSelected()){
         dest3ExPrice=50;
          dest3Ex="Historical Highlight";
        }else if(Ex3Op3.isSelected()){
         dest3ExPrice=70;
         dest3Ex="Two Tank Dive";
        }else if (Ex3Op4.isSelected()){
         dest3ExPrice=170;
         dest3Ex="Dolphin Encounter";
        }else if (Ex3Op5.isSelected()){
         dest3ExPrice=0;
         dest3Ex="None";
        }
        
        
        if(source==reserve){
         //System.out.println("I don't know if I'm going to make it");
          
          
          rGroup.getSelection().setEnabled(false);
  //        rGroup.getSelection().setBackground(Color.red);
          System.out.println();
          System.out.println(finalOutput());
          vacantCabins-= 1;
          
          //EXCURSION SELECTION DISABLED ONCE EXIT BUTTON IS CLICKED.
          excursion1Panel.setVisible(false);  
          excursion2Panel.setVisible(false);
          excursion3Panel.setVisible(false);
          reserve.setVisible(false);
          footerPanel2.setVisible(false);
          
// CLEARING OF TEXT FIELDS AT THE END     
          firstNameTF.setText("");
          lastNameTF.setText("");
          addressTF.setText(""); 
          numberInCabinTF.setText("");
          stateTF.setText("");
          cityTF.setText("");
          zipTF.setText("");
          submit.setText("submit");

      
//PROMPT FOR MORE RESERVATIONS          
 
          Scanner obj=new Scanner(System.in);
          System.out.println();    
          System.out.println("Do you wish to reserve another cabin? Enter Y or N: ");
          String more = obj.next().toUpperCase();
   
// MY WILD LOOP          
          while(!more.equals("Y")){
            setVisible(false);
          }
          

   }
        
        
 //       if(vacantCabins == 0){setVisible(false);} // HECK NAH!

  }
   



   }
 

 
 


// \/\/\/\/\/\/\/\/\/\/\/\/\/\/-----MY 7 METHODS -----\/\/\/\/\/\/\/\/\/\/\/\/\/\/

 
 public String destList(){
  return "DESTINATION 1: " + destOneLabel.getText() + "- DESTINATION 2: "+ destTwoLabel.getText()+"- DESTINATION 3: "+destThreeLabel.getText();
 }

 public String chosenExcursions(){
  return "DESTINATION 1 EXCURSION: " + dest1Ex + "- DESTINATION 2 EXCURSION: "+ dest2Ex + "- DESTINATION 3 EXCURSION: " + dest3Ex;
 } 
 
 public double getCabinCost(){
  return cabinPrice*enteredNoInParty;
 }
 
 public String addressInfo(){
  return "ADDRESS: " + enteredAddress + "\n" + "CITY: " + enteredCity + "\n" + "STATE: " + enteredState + "\n" + "Zip: " + enteredZip;
 }
 
 public double costOfExcursion(){
  return (dest1ExPrice + dest2ExPrice + dest3ExPrice)*enteredNoInParty;
 }
 
 public double totalPortFee(){
  return portFee*enteredNoInParty; 
 }
 
 public double totalCost(){
  return (getCabinCost() + costOfExcursion() + totalPortFee())*SALES_TAX + getCabinCost() + costOfExcursion() + totalPortFee();
 }
 
 public String finalOutput(){
  return "CRUISE: "+ cruiseLine + "\n" + "SHIP: " + shipName + "\n" + "DATE: " + dateSailing + "\n" + "NAME: " + enteredFirstName + " " 
    + enteredLastName + "\n" + addressInfo() +"\n" + "NO IN PARTY: " + enteredNoInParty + "\n" + destList() + "\n" + chosenExcursions() 
    + "\n" + "TOTAL: " + fmt.format(totalCost());
 }
 
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  
 
    }
 

   

 

    
//*************************************************************************************************************    
    

       
    
    

 
 
 
    
 