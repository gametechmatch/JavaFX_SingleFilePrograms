/*
CrayolaTwo.java
Author: gametechmatch
3/30/2023
Assignment: Draw image
(image comparison in same git repository)
 */
package crayolatwo;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.effect.*;

public class CrayolaTwo extends Application
{

    public void start(Stage primaryStage)
    {
        //________________Create Shapes__________________________
        
        // _____BOX BOTTOM____________________________
        
        // boxBottomFront
        Polygon boxBottomFront = new Polygon(
                25, 850,
                0, 455,
                900, 445,
                840, 850);
        boxBottomFront.setFill(Color.GOLD);
        
        // boxBottomOpening
        Polygon boxBottomOpening = new Polygon(
                0, 455,
                30, 330,
                820, 320,
                900, 445);
        boxBottomOpening.setFill(Color.YELLOW);
        
        // boxBottomInsert
        Polygon boxBottomInsert = new Polygon(
                16, 446, //left bottom corner
                28, 340,
                20, 232, //left upper corner
                61, 232,
                70, 250,
                810, 238,
                815, 222,
                842, 225, // right upper corner
                845, 330,
                872, 435); //right bottom corner
        boxBottomInsert.setFill(Color.ANTIQUEWHITE);
        
        // box insert shadow upper left
        Polygon boxInsertShadowUL = new Polygon(
                40, 345, // left bottom corner
                38, 250, // left upper corner
                58, 250,
                70, 260,
                432, 252, // right upper corner
                432, 336); // right lower corner
        boxInsertShadowUL.setFill(Color.DARKGRAY);
        
        // box insert shadow upper right
        Polygon boxInsertShadowUR = new Polygon(
                452, 335, // left bottom corner
                451, 253, // left upper corner
                815, 250,
                822, 232, // right upper corner
                836, 240,
                838, 270,
                828, 328); // right lower corner
        boxInsertShadowUR.setFill(Color.DARKGRAY);
        
        // box insert shadow lower left
        Polygon boxInsertShadowLL = new Polygon(
                32, 440, // left bottom corner
                39, 359, // left upper corner
                51, 359,
                59, 371,
                416, 363,
                427, 350,
                432, 350, // right upper corner
                434, 435); // right lower corner
        boxInsertShadowLL.setFill(Color.DARKGRAY);
        
        // box insert shadow lower right
        Polygon boxInsertShadowLR = new Polygon(
                451, 434, // left bottom corner
                449, 349, // left upper corner
                458, 347,
                479, 359,
                838, 356,
                844, 339, // right upper corner
                849, 363,
                852, 378,
                856, 430); // right lower corner
        boxInsertShadowLR.setFill(Color.DARKGRAY);
        
        // part of box that covers the bottom of crayons
        Polygon cCoverTopLeft = new Polygon(
                40, 345, 39, 335, 432, 326, 432, 336);
        cCoverTopLeft.setFill(Color.ANTIQUEWHITE);
        Polygon cCoverTopRight = new Polygon(
                452, 335, 451, 325, 830, 318, 828, 328);
        cCoverTopRight.setFill(Color.ANTIQUEWHITE);
        
        
        Polygon cCoverBottomLeft = new Polygon(
                32, 440, 32, 430, 434, 425, 434, 435);
        cCoverBottomLeft.setFill(Color.ANTIQUEWHITE);
        Polygon cCoverBottomRight = new Polygon(
                451, 434, 451, 424, 856, 420, 856, 430);
        cCoverBottomRight.setFill(Color.ANTIQUEWHITE);
        
        // _____BOX BOTTOM DECOR________________________
        
        // boxBottomFrontGreenLeft
        Polygon boxBottomFrontGreenLeft = new Polygon(
                25, 850,
                0, 455,
                262, 850);
        boxBottomFrontGreenLeft.setFill(Color.DARKSLATEGRAY);
        
        // boxBottomFrontGreenRight
        Polygon boxBottomFrontGreenRight = new Polygon(
                614, 850,
                900, 445,
                840, 850);
        boxBottomFrontGreenRight.setFill(Color.DARKSLATEGRAY);
        
        // boxStripeLeftThin
        Polygon boxStripeLeftThin = new Polygon(
                2, 480,
                252, 850,
                242, 850,
                3, 500);
        boxStripeLeftThin.setFill(Color.ALICEBLUE);
        
        // boxStripeLeftThick
        Polygon boxStripeLeftThick = new Polygon(
                4, 521,
                231, 850,
                212, 850,
                6, 552);
        boxStripeLeftThick.setFill(Color.ALICEBLUE);
        
        // boxStripeRightThin
        Polygon boxStripeRightThin = new Polygon(
                628, 850,
                896, 468,
                894, 485,
                637, 850);
        boxStripeRightThin.setFill(Color.ALICEBLUE);
        
        // boxStripeRightThick
        Polygon boxStripeRightThick = new Polygon(
                648, 850,
                891, 504,
                887, 530,
                663, 850);
        boxStripeRightThick.setFill(Color.ALICEBLUE);
        
        // boxRedFlag
        Polygon boxRedFlag = new Polygon(
                70, 771, // left lower corner
                111, 622, // left upper corner
                234, 660,
                305, 673,
                350, 674,
                700, 669,
                800, 665,
                868, 659, // right upper corner
                846, 805, // right lower corner
                800, 809,
                700, 812,
                600, 819,
                500, 829,
                400, 831,
                350, 830,
                300, 823,
                250, 819,
                200, 809,
                150, 800,
                100, 788);
        boxRedFlag.setFill(Color.FIREBRICK);
        
        // _____BOX BOTTOM WORDS - GREEN________________________
        Text boxBottom64 = new Text(400, 510, "64");
        boxBottom64.setFont(Font.font ("Anja Eliane accent Nornal", 80));
        boxBottom64.setFill(Color.DARKSLATEGRAY);
        boxBottom64.setScaleX(1);
        boxBottom64.setScaleY(.8);
        boxBottom64.setRotate(-1);
        
        Text boxBottomWordsR1 = new Text(300, 560, "D I F F E R E N T");
        boxBottomWordsR1.setFont(Font.font ("Anja Eliane accent Nornal",
                FontWeight.BOLD, 40));
        boxBottomWordsR1.setFill(Color.DARKSLATEGRAY);
        boxBottomWordsR1.setScaleY(.9);
        
        Text boxBottomWordsR2 = new Text(310, 605, "B R I L L I A N T");
        boxBottomWordsR2.setFont(Font.font ("Anja Eliane accent Nornal",
                FontWeight.BOLD, 38));
        boxBottomWordsR2.setFill(Color.DARKSLATEGRAY);
        boxBottomWordsR2.setScaleY(.9);
        
        Text boxBottomWordsR3 = new Text(340, 650, "C O L O R S");
        boxBottomWordsR3.setFont(Font.font ("Anja Eliane accent Nornal",
                FontWeight.BOLD, 40));
        boxBottomWordsR3.setFill(Color.DARKSLATEGRAY);
        boxBottomWordsR3.setScaleY(.9);
        
        // _____BOX BOTTOM WORDS - WHITE________________________
        Text whiteTextNew = new Text(108, 782, "NEW");
        whiteTextNew.setFont(Font.font ("Anja Eliane accent Nornal", 
                FontWeight.BOLD, 120));
        whiteTextNew.setFill(Color.ALICEBLUE);
        whiteTextNew.setRotate(14);
        whiteTextNew.setScaleY(1.1);
        
        
        Text whiteTextExclamation = new Text(400, 797, "!");
        whiteTextExclamation.setFont(Font.font ("Anja Eliane accent Nornal", 
                FontWeight.BOLD, 120));
        whiteTextExclamation.setFill(Color.ALICEBLUE);
        whiteTextExclamation.setRotate(20);
        whiteTextExclamation.setScaleY(1.6);
        
        Text whiteTextBuiltIn = new Text(555, 735, "BUILT-IN");
        whiteTextBuiltIn.setFont(Font.font ("Anja Eliane accent Nornal", 
                FontWeight.BOLD, 50));
        whiteTextBuiltIn.setFill(Color.ALICEBLUE);
        whiteTextBuiltIn.setRotate(-3);
        whiteTextBuiltIn.setScaleX(1.2);
        
        Text whiteTextSharpener = new Text(510, 795, "SHARPENER");
        whiteTextSharpener.setFont(Font.font ("Anja Eliane accent Nornal", 
                FontWeight.BOLD, 50));
        whiteTextSharpener.setFill(Color.ALICEBLUE);
        whiteTextSharpener.setRotate(-3);
        whiteTextSharpener.setScaleX(1.2);
        
        // bottom box word groups
        Group boxBottomWordsGreen = new Group(boxBottom64, boxBottomWordsR1,
                boxBottomWordsR2, boxBottomWordsR3);
        boxBottomWordsGreen.setScaleX(1.2);
        boxBottomWordsGreen.setRotate(-1);
        Group boxBottomWordsWhite = new Group(whiteTextNew,
                whiteTextExclamation, whiteTextBuiltIn, whiteTextSharpener);
        
        // main box bottom words group
        Group boxBottomWords = new Group(boxBottomWordsGreen,
                boxBottomWordsWhite);
 
        // _____BOX TOP_______________________________
        
        // boxTop
        Polygon boxTop = new Polygon(
                30, 330, // left lower corner
                2, 120,
                25, 35, // left upper corner
                800, 25, // right upper corner
                860, 105,
                820, 320); // right lower corner
        boxTop.setFill(Color.YELLOW);
        
        // boxTopOpeningEdge
        Polygon boxTopOpeningEdge = new Polygon(
                30, 330,
                2, 120,
                860, 105,
                820, 320);
        boxTopOpeningEdge.setFill(Color.GOLD);
        
        // boxTopOpening
        Polygon boxTopOpening = new Polygon(
                39, 320,
                20, 135,
                843, 120,
                810, 308);
        boxTopOpening.setFill(Color.GOLDENROD);
        
        // boxTop OpeningShadow
        Polygon boxTopOpeningShadow = new Polygon(
                65, 320,
                48, 136,
                797, 122,
                765, 308);
        boxTopOpeningShadow.setFill(Color.CHOCOLATE);
        
        // words on box's top
        Text boxTopWordsTitle = new Text(200, 100, "CRAYOLA");
        boxTopWordsTitle.setFont(Font.font ("Anja Eliane accent Nornal", 100));
        boxTopWordsTitle.setFill(Color.DARKSLATEGRAY);
        boxTopWordsTitle.setScaleX(1.3);
        boxTopWordsTitle.setScaleY(.7);
        boxTopWordsTitle.setRotate(-1);
        
        Text boxTopWordsSecondLine = new Text(340, 120, "CRAYONS");
        boxTopWordsSecondLine.setFont(Font.font ("Anja Eliane accent Nornal", 40));
        boxTopWordsSecondLine.setFill(Color.DARKSLATEGRAY);
        boxTopWordsSecondLine.setRotate(-1);
        boxTopWordsSecondLine.setScaleX(1.3);
        boxTopWordsSecondLine.setScaleY(.3);
        
        // _____CRAYONS_______________________________
        // upper left top crayons
        Polygon cc1_r1_c = new Polygon(
                470, 470,
                470, 391,
                493, 341,
                516, 391,
                516, 470);
        cc1_r1_c.setFill(Color.BLUE);
        CubicCurve cc1_r1_topLine = new CubicCurve(471, 403,
                489, 427, 499, 378, 515, 403);
        CubicCurve cc1_r1_bottomLine = new CubicCurve(471, 413,
                489, 438, 499, 388, 515, 413);
        Group cc1_r1 = new Group(cc1_r1_c, cc1_r1_topLine,
                cc1_r1_bottomLine);
        cc1_r1.setRotate(-2);
        cc1_r1.setTranslateX(-2);
        
        Polygon cc2_r1_c = new Polygon(
                518, 470,
                518, 391,
                541, 341,
                564, 391,
                564, 470);
        cc2_r1_c.setFill(Color.MEDIUMSPRINGGREEN);
        CubicCurve cc2_r1_topLine = new CubicCurve(519, 403,
                537, 427, 547, 378, 563, 403);
        CubicCurve cc2_r1_bottomLine = new CubicCurve(519, 413,
                537, 438, 547, 388, 563, 413);
        Group cc2_r1 = new Group(cc2_r1_c, cc2_r1_topLine,
                cc2_r1_bottomLine);
        cc2_r1.setRotate(-1.6);
        cc1_r1.setTranslateX(-1.75);
        
        Polygon cc3_r1_c = new Polygon(
                566, 470,
                566, 391,
                589, 341,
                612, 391,
                612, 470);
        cc3_r1_c.setFill(Color.MEDIUMVIOLETRED);
        CubicCurve cc3_r1_topLine = new CubicCurve(567, 403,
                585, 427, 595, 378, 611, 403);
        CubicCurve cc3_r1_bottomLine = new CubicCurve(567, 413,
                585, 438, 595, 388, 611, 413);
        Group cc3_r1 = new Group(cc3_r1_c, cc3_r1_topLine,
                cc3_r1_bottomLine);
        cc3_r1.setRotate(-1.3);
        cc3_r1.setTranslateX(-1.5);
        
        Polygon cc4_r1_c = new Polygon(
                614, 470,
                614, 391,
                637, 341,
                660, 391,
                660, 470);
        cc4_r1_c.setFill(Color.YELLOW);
        CubicCurve cc4_r1_topLine = new CubicCurve(615, 403,
                633, 427, 643, 378, 659, 403);
        CubicCurve cc4_r1_bottomLine = new CubicCurve(615, 413,
                633, 438, 643, 388, 659, 413);
        Group cc4_r1 = new Group(cc4_r1_c, cc4_r1_topLine,
                cc4_r1_bottomLine);
        cc4_r1.setRotate(-1);
        cc4_r1.setTranslateX(-1.25);
        
        Polygon cc5_r1_c = new Polygon(
                662, 470,
                662, 391,
                685, 341,
                708, 391,
                708, 470);
        cc5_r1_c.setFill(Color.SLATEGRAY);
        CubicCurve cc5_r1_topLine = new CubicCurve(663, 403,
                681, 427, 691, 378, 707, 403);
        CubicCurve cc5_r1_bottomLine = new CubicCurve(663, 413,
                681, 438, 691, 388, 707, 413);
        Group cc5_r1 = new Group(cc5_r1_c, cc5_r1_topLine,
                cc5_r1_bottomLine);
        cc5_r1.setRotate(-.6);
        cc5_r1.setTranslateX(-1);
        
        Polygon cc6_r1_c = new Polygon(
                710, 470,
                710, 391,
                733, 341,
                756, 391,
                756, 470);
        cc6_r1_c.setFill(Color.SANDYBROWN);
        CubicCurve cc6_r1_topLine = new CubicCurve(711, 403,
                729, 427, 739, 378, 755, 403);
        CubicCurve cc6_r1_bottomLine = new CubicCurve(711, 413,
                729, 438, 739, 388, 755, 413);
        Group cc6_r1 = new Group(cc6_r1_c, cc6_r1_topLine,
                cc6_r1_bottomLine);
        cc6_r1.setRotate(-.3);
        cc6_r1.setTranslateX(-.75);
        
        Polygon cc7_r1_c = new Polygon(
                758, 470,
                758, 391,
                781, 341,
                804, 391,
                804, 470);
        cc7_r1_c.setFill(Color.ORANGE);
        CubicCurve cc7_r1_topLine = new CubicCurve(759, 403,
                777, 427, 787, 378, 803, 403);
        CubicCurve cc7_r1_bottomLine = new CubicCurve(759, 413,
                777, 438, 787, 388, 803, 413);
        Group cc7_r1 = new Group(cc7_r1_c, cc7_r1_topLine,
                cc7_r1_bottomLine);
        cc7_r1.setTranslateX(-.5);
        
        Polygon cc8_r1_c = new Polygon(
                806, 470,
                806, 391,
                829, 341,
                852, 391,
                852, 470);
        cc8_r1_c.setFill(Color.PLUM);
        CubicCurve cc8_r1_topLine = new CubicCurve(807, 403,
                820, 427, 835, 378, 852, 403);
        CubicCurve cc8_r1_bottomLine = new CubicCurve(807, 413,
                820, 438, 835, 388, 852, 413);
        Group cc8_r1 = new Group(cc8_r1_c, cc8_r1_topLine,
                cc8_r1_bottomLine);
        cc8_r1.setTranslateX(-.25);
        
        // upper right top crayons
        Polygon cc9_r1_c = new Polygon(
                470, 470,
                470, 391,
                493, 341,
                516, 391,
                516, 470);
        cc9_r1_c.setFill(Color.PAPAYAWHIP);
        CubicCurve cc9_r1_topLine = new CubicCurve(471, 403,
                489, 427, 499, 378, 515, 403);
        CubicCurve cc9_r1_bottomLine = new CubicCurve(471, 413,
                489, 438, 499, 388, 515, 413);
        Group cc9_r1 = new Group(cc9_r1_c, cc9_r1_topLine,
                cc9_r1_bottomLine);
        cc9_r1.setTranslateX(-.25);
        
        Polygon cc10_r1_c = new Polygon(
                518, 470,
                518, 391,
                541, 341,
                564, 391,
                564, 470);
        cc10_r1_c.setFill(Color.KHAKI);
        CubicCurve cc10_r1_topLine = new CubicCurve(519, 403,
                537, 427, 547, 378, 563, 403);
        CubicCurve cc10_r1_bottomLine = new CubicCurve(519, 413,
                537, 438, 547, 388, 563, 413);
        Group cc10_r1 = new Group(cc10_r1_c, cc10_r1_topLine,
                cc10_r1_bottomLine);
        cc10_r1.setTranslateX(.5);
        
        Polygon cc11_r1_c = new Polygon(
                566, 470,
                566, 391,
                589, 341,
                612, 391,
                612, 470);
        cc11_r1_c.setFill(Color.CRIMSON);
        CubicCurve cc11_r1_topLine = new CubicCurve(567, 403,
                585, 427, 595, 378, 611, 403);
        CubicCurve cc11_r1_bottomLine = new CubicCurve(567, 413,
                585, 438, 595, 388, 611, 413);
        Group cc11_r1 = new Group(cc11_r1_c, cc11_r1_topLine,
                cc11_r1_bottomLine);
        cc11_r1.setRotate(.3);
        cc11_r1.setTranslateX(.75);
        
        Polygon cc12_r1_c = new Polygon(
                614, 470,
                614, 391,
                637, 341,
                660, 391,
                660, 470);
        cc12_r1_c.setFill(Color.PALEGREEN);
        CubicCurve cc12_r1_topLine = new CubicCurve(615, 403,
                633, 427, 643, 378, 659, 403);
        CubicCurve cc12_r1_bottomLine = new CubicCurve(615, 413,
                633, 438, 643, 388, 659, 413);
        Group cc12_r1 = new Group(cc12_r1_c, cc12_r1_topLine,
                cc12_r1_bottomLine);
        cc12_r1.setRotate(.6);
        cc12_r1.setTranslateX(1);
        
        Polygon cc13_r1_c = new Polygon(
                662, 470,
                662, 391,
                685, 341,
                708, 391,
                708, 470);
        cc13_r1_c.setFill(Color.THISTLE);
        CubicCurve cc13_r1_topLine = new CubicCurve(663, 403,
                681, 427, 691, 378, 707, 403);
        CubicCurve cc13_r1_bottomLine = new CubicCurve(663, 413,
                681, 438, 691, 388, 707, 413);
        Group cc13_r1 = new Group(cc13_r1_c, cc13_r1_topLine,
                cc13_r1_bottomLine);
        cc13_r1.setRotate(1);
        cc13_r1.setTranslateX(1.25);
        
        Polygon cc14_r1_c = new Polygon(
                710, 470,
                710, 391,
                733, 341,
                756, 391,
                756, 470);
        cc14_r1_c.setFill(Color.INDIANRED);
        CubicCurve cc14_r1_topLine = new CubicCurve(711, 403,
                729, 427, 739, 378, 755, 403);
        CubicCurve cc14_r1_bottomLine = new CubicCurve(711, 413,
                729, 438, 739, 388, 755, 413);
        Group cc14_r1 = new Group(cc14_r1_c, cc14_r1_topLine,
                cc14_r1_bottomLine);
        cc14_r1.setRotate(1.3);
        cc14_r1.setTranslateX(1.5);
        
        Polygon cc15_r1_c = new Polygon(
                758, 470,
                758, 391,
                781, 341,
                804, 391,
                804, 470);
        cc15_r1_c.setFill(Color.CYAN);
        CubicCurve cc15_r1_topLine = new CubicCurve(759, 403,
                777, 427, 787, 378, 803, 403);
        CubicCurve cc15_r1_bottomLine = new CubicCurve(759, 413,
                777, 438, 787, 388, 803, 413);
        Group cc15_r1 = new Group(cc15_r1_c, cc15_r1_topLine,
                cc15_r1_bottomLine);
        cc15_r1.setRotate(1.6);
        cc15_r1.setTranslateX(1.75);
        
        Polygon cc16_r1_c = new Polygon(
                806, 470,
                806, 391,
                829, 341,
                852, 391,
                852, 470);
        cc16_r1_c.setFill(Color.LIGHTSEAGREEN);
        CubicCurve cc16_r1_topLine = new CubicCurve(807, 403,
                820, 427, 835, 378, 852, 403);
        CubicCurve cc16_r1_bottomLine = new CubicCurve(807, 413,
                820, 437, 835, 388, 852, 413);
        Group cc16_r1 = new Group(cc16_r1_c, cc16_r1_bottomLine,
                cc16_r1_topLine);
        cc16_r1.setRotate(2);
        cc16_r1.setTranslateX(2);
        
        // upper left bottom crayons
        Polygon cc1_r2_c = new Polygon(
                470, 430,
                470, 391,
                493, 345,
                516, 391,
                516, 430);
        cc1_r2_c.setFill(Color.CORNFLOWERBLUE);
        CubicCurve cc1_r2_topLine = new CubicCurve(471, 403,
                489, 427, 499, 378, 515, 403);
        CubicCurve cc1_r2_bottomLine = new CubicCurve(471, 413,
                489, 438, 499, 388, 515, 413);
        Group cc1_r2 = new Group(cc1_r2_c, cc1_r2_topLine,
                cc1_r2_bottomLine);
        cc1_r2.setRotate(-2);
        cc1_r2.setTranslateX(-5);
        
        Polygon cc2_r2_c = new Polygon(
                518, 430,
                518, 391,
                541, 345,
                564, 391,
                564, 430);
        cc2_r2_c.setFill(Color.MEDIUMORCHID);
        CubicCurve cc2_r2_topLine = new CubicCurve(519, 403,
                537, 427, 547, 378, 563, 403);
        CubicCurve cc2_r2_bottomLine = new CubicCurve(519, 413,
                537, 438, 547, 388, 563, 413);
        Group cc2_r2 = new Group(cc2_r2_c, cc2_r2_topLine,
                cc2_r2_bottomLine);
        cc2_r2.setRotate(-1.6);
        cc2_r2.setTranslateX(-4);
        
        Polygon cc3_r2_c = new Polygon(
                566, 430,
                566, 391,
                589, 345,
                612, 391,
                612, 430);
        cc3_r2_c.setFill(Color.ROSYBROWN);
        CubicCurve cc3_r2_topLine = new CubicCurve(567, 403,
                585, 427, 595, 378, 611, 403);
        CubicCurve cc3_r2_bottomLine = new CubicCurve(567, 413,
                585, 438, 595, 388, 611, 413);
        Group cc3_r2 = new Group(cc3_r2_c, cc3_r2_topLine,
                cc3_r2_bottomLine);
        cc3_r2.setRotate(-1.3);
        cc3_r2.setTranslateX(-3);
        
        Polygon cc4_r2_c = new Polygon(
                614, 430,
                614, 391,
                637, 345,
                660, 391,
                660, 430);
        cc4_r2_c.setFill(Color.DARKTURQUOISE);
        CubicCurve cc4_r2_topLine = new CubicCurve(615, 403,
                633, 427, 643, 378, 659, 403);
        CubicCurve cc4_r2_bottomLine = new CubicCurve(615, 413,
                633, 438, 643, 388, 659, 413);
        Group cc4_r2 = new Group(cc4_r2_c, cc4_r2_topLine,
                cc4_r2_bottomLine);
        cc4_r2.setRotate(-1);
        cc4_r2.setTranslateX(-2);
        
        Polygon cc5_r2_c = new Polygon(
                662, 430,
                662, 391,
                685, 345,
                708, 391,
                708, 430);
        cc5_r2_c.setFill(Color.IVORY);
        CubicCurve cc5_r2_topLine = new CubicCurve(663, 403,
                681, 427, 691, 378, 707, 403);
        CubicCurve cc5_r2_bottomLine = new CubicCurve(663, 413,
                681, 438, 691, 388, 707, 413);
        Group cc5_r2 = new Group(cc5_r2_c, cc5_r2_topLine,
                cc5_r2_bottomLine);
        cc5_r2.setRotate(-.6);
        cc5_r2.setTranslateX(-1);
        
        Polygon cc6_r2_c = new Polygon(
                710, 430,
                710, 391,
                733, 345,
                756, 391,
                756, 430);
        cc6_r2_c.setFill(Color.LEMONCHIFFON);
        CubicCurve cc6_r2_topLine = new CubicCurve(711, 403,
                729, 427, 739, 378, 755, 403);
        CubicCurve cc6_r2_bottomLine = new CubicCurve(711, 413,
                729, 438, 739, 388, 755, 413);
        Group cc6_r2 = new Group(cc6_r2_c, cc6_r2_topLine,
                cc6_r2_bottomLine);
        cc6_r2.setRotate(-.3);
        cc6_r2.setTranslateX(-.75);
        
        Polygon cc7_r2_c = new Polygon(
                758, 430,
                758, 391,
                781, 345,
                804, 391,
                804, 430);
        cc7_r2_c.setFill(Color.SALMON);
        CubicCurve cc7_r2_topLine = new CubicCurve(759, 403,
                777, 427, 787, 378, 803, 403);
        CubicCurve cc7_r2_bottomLine = new CubicCurve(759, 413,
                777, 438, 787, 388, 803, 413);
        Group cc7_r2 = new Group(cc7_r2_c, cc7_r2_topLine,
                cc7_r2_bottomLine);
        cc2_r2.setTranslateX(-.5);
        
        Polygon cc8_r2_c = new Polygon(
                806, 430,
                806, 391,
                829, 345,
                852, 391,
                852, 430);
        cc8_r2_c.setFill(Color.SKYBLUE);
        CubicCurve cc8_r2_topLine = new CubicCurve(807, 403,
                820, 427, 835, 378, 852, 403);
        CubicCurve cc8_r2_bottomLine = new CubicCurve(807, 413,
                820, 438, 835, 388, 852, 413);
        Group cc8_r2 = new Group(cc8_r2_c, cc8_r2_topLine,
                cc8_r2_bottomLine);
        
        
        // upper right bottom crayons
        Polygon cc9_r2_c = new Polygon(
                470, 430,
                470, 391,
                493, 348,
                516, 391,
                516, 430);
        cc9_r2_c.setFill(Color.LIGHTSLATEGRAY);
        CubicCurve cc9_r2_topLine = new CubicCurve(471, 403,
                489, 427, 499, 378, 515, 403);
        CubicCurve cc9_r2_bottomLine = new CubicCurve(471, 413,
                489, 438, 499, 388, 515, 413);
        Group cc9_r2 = new Group(cc9_r2_c, cc9_r2_topLine,
                cc9_r2_bottomLine);
        
        Polygon cc10_r2_c = new Polygon(
                518, 430,
                518, 391,
                541, 348,
                564, 391,
                564, 430);
        cc10_r2_c.setFill(Color.LAVENDERBLUSH);
        CubicCurve cc10_r2_topLine = new CubicCurve(519, 403,
                537, 427, 547, 378, 563, 403);
        CubicCurve cc10_r2_bottomLine = new CubicCurve(519, 413,
                537, 438, 547, 388, 563, 413);
        Group cc10_r2 = new Group(cc10_r2_c, cc10_r2_topLine,
                cc10_r2_bottomLine);
        cc10_r2.setTranslateX(1);
        
        Polygon cc11_r2_c = new Polygon(
                566, 430,
                566, 391,
                589, 348,
                612, 391,
                612, 430);
        cc11_r2_c.setFill(Color.STEELBLUE);
        CubicCurve cc11_r2_topLine = new CubicCurve(567, 403,
                585, 427, 595, 378, 611, 403);
        CubicCurve cc11_r2_bottomLine = new CubicCurve(567, 413,
                585, 438, 595, 388, 611, 413);
        Group cc11_r2 = new Group(cc11_r2_c, cc11_r2_topLine,
                cc11_r2_bottomLine);
        cc11_r2.setRotate(.3);
        cc11_r2.setTranslateX(3);
        
        Polygon cc12_r2_c = new Polygon(
                614, 430,
                614, 391,
                637, 348,
                660, 391,
                660, 430);
        cc12_r2_c.setFill(Color.DEEPSKYBLUE);
        CubicCurve cc12_r2_topLine = new CubicCurve(615, 403,
                633, 427, 643, 378, 659, 403);
        CubicCurve cc12_r2_bottomLine = new CubicCurve(615, 413,
                633, 438, 643, 388, 659, 413);
        Group cc12_r2 = new Group(cc12_r2_c, cc12_r2_topLine,
                cc12_r2_bottomLine);
        cc12_r2.setRotate(.6);
        cc12_r2.setTranslateX(4);
        
        Polygon cc13_r2_c = new Polygon(
                662, 430,
                662, 391,
                685, 348,
                708, 391,
                708, 430);
        cc13_r2_c.setFill(Color.DARKGOLDENROD);
        CubicCurve cc13_r2_topLine = new CubicCurve(663, 403,
                681, 427, 691, 378, 707, 403);
        CubicCurve cc13_r2_bottomLine = new CubicCurve(663, 413,
                681, 438, 691, 388, 707, 413);
        Group cc13_r2 = new Group(cc13_r2_c, cc13_r2_topLine,
                cc13_r2_bottomLine);
        cc13_r2.setRotate(1);
        cc13_r2.setTranslateX(7);
        
        Polygon cc14_r2_c = new Polygon(
                710, 430,
                710, 391,
                733, 348,
                756, 391,
                756, 430);
        cc14_r2_c.setFill(Color.WHEAT);
        CubicCurve cc14_r2_topLine = new CubicCurve(711, 403,
                729, 427, 739, 378, 755, 403);
        CubicCurve cc14_r2_bottomLine = new CubicCurve(711, 413,
                729, 438, 739, 388, 755, 413);
        Group cc14_r2 = new Group(cc14_r2_c, cc14_r2_topLine,
                cc14_r2_bottomLine);
        cc14_r2.setRotate(1.3);
        cc14_r2.setTranslateX(9);
        
        Polygon cc15_r2_c = new Polygon(
                758, 430,
                758, 391,
                781, 348,
                804, 391,
                804, 430);
        cc15_r2_c.setFill(Color.PEACHPUFF);
        CubicCurve cc15_r2_topLine = new CubicCurve(759, 403,
                777, 427, 787, 378, 803, 403);
        CubicCurve cc15_r2_bottomLine = new CubicCurve(759, 413,
                777, 438, 787, 388, 803, 413);
        Group cc15_r2 = new Group(cc15_r2_c, cc15_r2_topLine,
                cc15_r2_bottomLine);
        cc15_r2.setRotate(1.6);
        cc15_r2.setTranslateX(11);
        
        Polygon cc16_r2_c = new Polygon(
                806, 430,
                806, 391,
                829, 348,
                852, 391,
                852, 430);
        cc16_r2_c.setFill(Color.GAINSBORO);
        CubicCurve cc16_r2_topLine = new CubicCurve(807, 403,
                820, 427, 835, 378, 852, 403);
        CubicCurve cc16_r2_bottomLine = new CubicCurve(807, 413,
                820, 438, 835, 388, 852, 413);
        Group cc16_r2 = new Group(cc16_r2_c, cc16_r2_topLine,
                cc16_r2_bottomLine);
        cc16_r2.setRotate(2);
        cc16_r2.setTranslateX(13);
        
        // lower left rop crayons
        Polygon cc1_r3_c = new Polygon(
                470, 470,
                470, 391,
                493, 354,
                516, 391,
                516, 470);
        cc1_r3_c.setFill(Color.TAN);
        CubicCurve cc1_r3_topLine = new CubicCurve(471, 403,
                489, 427, 499, 378, 515, 403);
        CubicCurve cc1_r3_bottomLine = new CubicCurve(471, 413,
                489, 438, 499, 388, 515, 413);
        Group cc1_r3 = new Group(cc1_r3_c, cc1_r3_topLine,
                cc1_r3_bottomLine);
        cc1_r3.setRotate(-2);
        cc1_r3.setTranslateX(-4);
        
        Polygon cc2_r3_c = new Polygon(
                518, 470,
                518, 391,
                541, 354,
                564, 391,
                564, 470);
        cc2_r3_c.setFill(Color.LINEN);
        CubicCurve cc2_r3_topLine = new CubicCurve(519, 403,
                537, 427, 547, 378, 563, 403);
        CubicCurve cc2_r3_bottomLine = new CubicCurve(519, 413,
                537, 438, 547, 388, 563, 413);
        Group cc2_r3 = new Group(cc2_r3_c, cc2_r3_topLine,
                cc2_r3_bottomLine);
        cc2_r3.setRotate(-1.6);
        cc2_r3.setTranslateX(-3);
        
        Polygon cc3_r3_c = new Polygon(
                566, 470,
                566, 391,
                589, 354,
                612, 391,
                612, 470);
        cc3_r3_c.setFill(Color.PALEGOLDENROD);
        CubicCurve cc3_r3_topLine = new CubicCurve(567, 403,
                585, 427, 595, 378, 611, 403);
        CubicCurve cc3_r3_bottomLine = new CubicCurve(567, 413,
                585, 438, 595, 388, 611, 413);
        Group cc3_r3 = new Group(cc3_r3_c, cc3_r3_topLine,
                cc3_r3_bottomLine);
        cc3_r3.setRotate(-1.3);
        cc3_r3.setTranslateX(-2);
        
        Polygon cc4_r3_c = new Polygon(
                614, 470,
                614, 391,
                637, 354,
                660, 391,
                660, 470);
        cc4_r3_c.setFill(Color.YELLOW);
        CubicCurve cc4_r3_topLine = new CubicCurve(615, 403,
                633, 427, 643, 378, 659, 403);
        CubicCurve cc4_r3_bottomLine = new CubicCurve(615, 413,
                633, 438, 643, 388, 659, 413);
        Group cc4_r3 = new Group(cc4_r3_c, cc4_r3_topLine,
                cc4_r3_bottomLine);
        cc4_r3.setRotate(-1);
        cc4_r3.setTranslateX(-1);
        
        Polygon cc5_r3_c = new Polygon(
                662, 470,
                662, 391,
                685, 354,
                708, 391,
                708, 470);
        cc5_r3_c.setFill(Color.MISTYROSE);
        CubicCurve cc5_r3_topLine = new CubicCurve(663, 403,
                681, 427, 691, 378, 707, 403);
        CubicCurve cc5_r3_bottomLine = new CubicCurve(663, 413,
                681, 438, 691, 388, 707, 413);
        Group cc5_r3 = new Group(cc5_r3_c, cc5_r3_topLine,
                cc5_r3_bottomLine);
        cc5_r3.setRotate(-.6);
        cc5_r3.setTranslateX(-.75);
        
        Polygon cc6_r3_c = new Polygon(
                710, 470,
                710, 391,
                733, 354,
                756, 391,
                756, 470);
        cc6_r3_c.setFill(Color.DARKBLUE);
        CubicCurve  cc6_r3_topLine = new CubicCurve(711, 403,
                729, 427, 739, 378, 755, 403);
        CubicCurve  cc6_r3_bottomLine = new CubicCurve(711, 413,
                729, 438, 739, 388, 755, 413);
        Group  cc6_r3 = new Group( cc6_r3_c,  cc6_r3_topLine,
                 cc6_r3_bottomLine);
        cc6_r3.setRotate(-.3);
        cc6_r3.setTranslateX(-.5);
        
        Polygon cc7_r3_c = new Polygon(
                758, 470,
                758, 391,
                781, 354,
                804, 391,
                804, 470);
        cc7_r3_c.setFill(Color.GOLDENROD);
        CubicCurve cc7_r3_topLine = new CubicCurve(759, 403,
                777, 427, 787, 378, 803, 403);
        CubicCurve cc7_r3_bottomLine = new CubicCurve(759, 413,
                777, 438, 787, 388, 803, 413);
        Group cc7_r3 = new Group(cc7_r3_c, cc7_r3_topLine,
                cc7_r3_bottomLine);
        cc7_r3.setTranslateX(-.25);
        
        Polygon cc8_r3_c = new Polygon(
                806, 470,
                806, 391,
                829, 354,
                852, 391,
                852, 470);
        cc8_r3_c.setFill(Color.DARKGOLDENROD);
        CubicCurve cc8_r3_topLine = new CubicCurve(807, 403,
                820, 427, 835, 378, 852, 403);
        CubicCurve cc8_r3_bottomLine = new CubicCurve(807, 413,
                820, 438, 835, 388, 852, 413);
        Group cc8_r3 = new Group(cc8_r3_c, cc8_r3_topLine,
                cc16_r1_bottomLine);
        
        
        // lower right top crayons
        Polygon cc9_r3_c = new Polygon(
                470, 470,
                470, 391,
                493, 354,
                516, 391,
                516, 470);
        cc9_r3_c.setFill(Color.DARKCYAN);
        CubicCurve cc9_r3_topLine = new CubicCurve(471, 403,
                489, 427, 499, 378, 515, 403);
        CubicCurve cc9_r3_bottomLine = new CubicCurve(471, 413,
                489, 438, 499, 388, 515, 413);
        Group cc9_r3 = new Group(cc9_r3_c, cc9_r3_topLine,
                cc9_r3_bottomLine);
        cc9_r3.setTranslateX(-2);
        
        Polygon cc10_r3_c = new Polygon(
                518, 470,
                518, 391,
                541, 354,
                564, 391,
                564, 470);
        cc10_r3_c.setFill(Color.LIGHTYELLOW);
        CubicCurve cc10_r3_topLine = new CubicCurve(519, 403,
                537, 427, 547, 378, 563, 403);
        CubicCurve cc10_r3_bottomLine = new CubicCurve(519, 413,
                537, 438, 547, 388, 563, 413);
        Group cc10_r3 = new Group(cc10_r3_c, cc10_r3_topLine,
                cc10_r3_bottomLine);
        cc10_r3.setTranslateX(-1);
        
        Polygon cc11_r3_c = new Polygon(
                566, 470,
                566, 391,
                589, 354,
                612, 391,
                612, 470);
        cc11_r3_c.setFill(Color.PERU);
        CubicCurve cc11_r3_topLine = new CubicCurve(567, 403,
                585, 427, 595, 378, 611, 403);
        CubicCurve cc11_r3_bottomLine = new CubicCurve(567, 413,
                585, 438, 595, 388, 611, 413);
        Group cc11_r3 = new Group(cc11_r3_c, cc11_r3_topLine,
                cc11_r3_bottomLine);
        cc11_r3.setRotate(.3);
        
        Polygon cc12_r3_c = new Polygon(
                614, 470,
                614, 391,
                637, 354,
                660, 391,
                660, 470);
        cc12_r3_c.setFill(Color.WHEAT);
        CubicCurve cc12_r3_topLine = new CubicCurve(615, 403,
                633, 427, 643, 378, 659, 403);
        CubicCurve cc12_r3_bottomLine = new CubicCurve(615, 413,
                633, 438, 643, 388, 659, 413);
        Group cc12_r3 = new Group(cc12_r3_c, cc12_r3_topLine,
                cc12_r3_bottomLine);
        cc12_r3.setRotate(.6);
        cc12_r3.setTranslateX(1);
        
        Polygon cc13_r3_c = new Polygon(
                662, 470,
                662, 391,
                685, 354,
                708, 391,
                708, 470);
        cc13_r3_c.setFill(Color.AQUAMARINE);
        CubicCurve cc13_r3_topLine = new CubicCurve(663, 403,
                681, 427, 691, 378, 707, 403);
        CubicCurve cc13_r3_bottomLine = new CubicCurve(663, 413,
                681, 438, 691, 388, 707, 413);
        Group cc13_r3 = new Group(cc13_r3_c, cc13_r3_topLine,
                cc13_r3_bottomLine);
        cc13_r3.setRotate(1);
        cc13_r3.setTranslateX(2);
        
        Polygon cc14_r3_c = new Polygon(
                710, 470,
                710, 391,
                733, 354,
                756, 391,
                756, 470);
        cc14_r3_c.setFill(Color.AZURE);
        CubicCurve cc14_r3_topLine = new CubicCurve(711, 403,
                729, 427, 739, 378, 755, 403);
        CubicCurve cc14_r3_bottomLine = new CubicCurve(711, 413,
                729, 438, 739, 388, 755, 413);
        Group cc14_r3 = new Group(cc14_r3_c, cc14_r3_topLine,
                cc14_r3_bottomLine);
        cc14_r3.setRotate(1.3);
        cc14_r3.setTranslateX(3);
        
        Polygon cc15_r3_c = new Polygon(
                758, 470,
                758, 391,
                781, 354,
                804, 391,
                804, 470);
        cc15_r3_c.setFill(Color.INDIANRED);
        CubicCurve cc15_r3_topLine = new CubicCurve(759, 403,
                777, 427, 787, 378, 803, 403);
        CubicCurve cc15_r3_bottomLine = new CubicCurve(759, 413,
                777, 438, 787, 388, 803, 413);
        Group cc15_r3 = new Group(cc15_r3_c, cc15_r3_topLine,
                cc15_r3_bottomLine);
        cc15_r3.setRotate(1.6);
        cc15_r3.setTranslateX(3);
        
        Polygon cc16_r3_c = new Polygon(
                806, 470,
                806, 391,
                829, 354,
                852, 391,
                852, 470);
        cc16_r3_c.setFill(Color.LIGHTPINK);
        CubicCurve cc16_r3_topLine = new CubicCurve(807, 403,
                820, 427, 835, 378, 852, 403);
        CubicCurve cc16_r3_bottomLine = new CubicCurve(807, 413,
                820, 438, 835, 388, 852, 413);
        Group cc16_r3 = new Group(cc16_r3_c, cc16_r3_topLine,
                cc16_r3_bottomLine);
        cc16_r3.setRotate(2);
        cc16_r3.setTranslateX(3);
        
        // lower left bottom crayons
        Polygon cc1_r4_c = new Polygon(
                470, 430,
                470, 391,
                493, 354,
                516, 391,
                516, 430);
        cc1_r4_c.setFill(Color.MEDIUMAQUAMARINE);
        CubicCurve cc1_r4_topLine = new CubicCurve(471, 403,
                489, 427, 499, 378, 515, 403);
        CubicCurve cc1_r4_bottomLine = new CubicCurve(471, 413,
                489, 438, 499, 388, 515, 413);
        Group cc1_r4 = new Group(cc1_r4_c, cc1_r4_topLine,
                cc1_r4_bottomLine);
        cc1_r4.setRotate(-2);
        cc1_r4.setTranslateX(-9);
        
        Polygon cc2_r4_c = new Polygon(
                518, 430,
                518, 391,
                541, 354,
                564, 391,
                564, 430);
        cc2_r4_c.setFill(Color.LAVENDERBLUSH);
        CubicCurve cc2_r4_topLine = new CubicCurve(519, 403,
                537, 427, 547, 378, 563, 403);
        CubicCurve cc2_r4_bottomLine = new CubicCurve(519, 413,
                537, 438, 547, 388, 563, 413);
        Group cc2_r4 = new Group(cc2_r4_c, cc2_r4_topLine,
                cc2_r4_bottomLine);
        cc2_r4.setRotate(-1.6);
        cc2_r4.setTranslateX(-7);
        
        Polygon cc3_r4_c = new Polygon(
                566, 430,
                566, 391,
                589, 354,
                612, 391,
                612, 430);
        cc3_r4_c.setFill(Color.SIENNA);
        CubicCurve cc3_r4_topLine = new CubicCurve(567, 403,
                585, 427, 595, 378, 611, 403);
        CubicCurve cc3_r4_bottomLine = new CubicCurve(567, 413,
                585, 438, 595, 388, 611, 413);
        Group cc3_r4 = new Group(cc3_r4_c, cc3_r4_topLine,
                cc3_r4_bottomLine);
        cc3_r4.setRotate(-1.3);
        cc3_r4.setTranslateX(-6);
        
        Polygon cc4_r4_c = new Polygon(
                614, 430,
                614, 391,
                637, 354,
                660, 391,
                660, 430);
        cc4_r4_c.setFill(Color.LIGHTPINK);
        CubicCurve cc4_r4_topLine = new CubicCurve(615, 403,
                633, 427, 643, 378, 659, 403);
        CubicCurve cc4_r4_bottomLine = new CubicCurve(615, 413,
                633, 438, 643, 388, 659, 413);
        Group cc4_r4 = new Group(cc4_r4_c, cc4_r4_topLine,
                cc4_r4_bottomLine);
        cc4_r4.setRotate(-1);
        cc4_r4.setTranslateX(-5);
        
        Polygon cc5_r4_c = new Polygon(
                662, 430,
                662, 391,
                685, 354,
                708, 391,
                708, 430);
        cc5_r4_c.setFill(Color.SPRINGGREEN);
        CubicCurve cc5_r4_topLine = new CubicCurve(663, 403,
                681, 427, 691, 378, 707, 403);
        CubicCurve cc5_r4_bottomLine = new CubicCurve(663, 413,
                681, 438, 691, 388, 707, 413);
        Group cc5_r4 = new Group(cc5_r4_c, cc5_r4_topLine,
                cc5_r4_bottomLine);
        cc5_r4.setRotate(-.6);
        cc5_r4.setTranslateX(-4);
        
        Polygon cc6_r4_c = new Polygon(
                710, 430,
                710, 391,
                733, 354,
                756, 391,
                756, 430);
        cc6_r4_c.setFill(Color.SANDYBROWN);
        CubicCurve cc6_r4_topLine = new CubicCurve(711, 403,
                729, 427, 739, 378, 755, 403);
        CubicCurve cc6_r4_bottomLine = new CubicCurve(711, 413,
                729, 438, 739, 388, 755, 413);
        Group cc6_r4 = new Group(cc6_r4_c, cc6_r4_topLine,
                cc6_r4_bottomLine);
        cc6_r4.setRotate(-.3);
        cc6_r4.setTranslateX(-3);
        
        Polygon cc7_r4_c = new Polygon(
                758, 430,
                758, 391,
                781, 354,
                804, 391,
                804, 430);
        cc7_r4_c.setFill(Color.PALETURQUOISE);
        CubicCurve cc7_r4_topLine = new CubicCurve(759, 403,
                777, 427, 787, 378, 803, 403);
        CubicCurve cc7_r4_bottomLine = new CubicCurve(759, 413,
                777, 438, 787, 388, 803, 413);
        Group cc7_r4 = new Group(cc7_r4_c, cc7_r4_topLine,
                cc7_r4_bottomLine);
        cc7_r4.setTranslateX(-1);
        
        Polygon cc8_r4_c = new Polygon(
                806, 430,
                806, 391,
                829, 354,
                852, 391,
                852, 430);
        cc8_r4_c.setFill(Color.LEMONCHIFFON);
        CubicCurve cc8_r4_topLine = new CubicCurve(807, 403,
                820, 427, 835, 378, 852, 403);
        CubicCurve cc8_r4_bottomLine = new CubicCurve(807, 413,
                820, 438, 835, 388, 852, 413);
        Group cc8_r4 = new Group(cc8_r4_c, cc8_r4_topLine,
                cc8_r4_bottomLine);
        
        // lower right bottom crayons
        Polygon cc9_r4_c = new Polygon(
                470, 430,
                470, 391,
                493, 354,
                516, 391,
                516, 430);
        cc9_r4_c.setFill(Color.ROYALBLUE);
        CubicCurve cc9_r4_topLine = new CubicCurve(471, 403,
                489, 427, 499, 378, 515, 403);
        CubicCurve cc9_r4_bottomLine = new CubicCurve(471, 413,
                489, 438, 499, 388, 515, 413);
        Group cc9_r4 = new Group(cc9_r4_c, cc9_r4_topLine,
                cc9_r4_bottomLine);
        cc9_r4.setTranslateX(-2);
        
        Polygon cc10_r4_c = new Polygon(
                518, 430,
                518, 391,
                541, 354,
                564, 391,
                564, 430);
        cc10_r4_c.setFill(Color.POWDERBLUE);
        CubicCurve cc10_r4_topLine = new CubicCurve(519, 403,
                537, 427, 547, 378, 563, 403);
        CubicCurve cc10_r4_bottomLine = new CubicCurve(519, 413,
                537, 438, 547, 388, 563, 413);
        Group cc10_r4 = new Group(cc10_r4_c, cc10_r4_topLine,
                cc10_r4_bottomLine);
        cc10_r4.setTranslateX(-1);
        
        Polygon cc11_r4_c = new Polygon(
                566, 430,
                566, 391,
                589, 354,
                612, 391,
                612, 430);
        cc11_r4_c.setFill(Color.PURPLE);
        CubicCurve cc11_r4_topLine = new CubicCurve(567, 403,
                585, 427, 595, 378, 611, 403);
        CubicCurve cc11_r4_bottomLine = new CubicCurve(567, 413,
                585, 438, 595, 388, 611, 413);
        Group cc11_r4 = new Group(cc11_r4_c, cc11_r4_topLine,
                cc11_r4_bottomLine);
        cc11_r4.setRotate(.3);
        
        Polygon cc12_r4_c = new Polygon(
                614, 430,
                614, 391,
                637, 354,
                660, 391,
                660, 430);
        cc12_r4_c.setFill(Color.NAVY);
        CubicCurve cc12_r4_topLine = new CubicCurve(615, 403,
                633, 427, 643, 378, 659, 403);
        CubicCurve cc12_r4_bottomLine = new CubicCurve(615, 413,
                633, 438, 643, 388, 659, 413);
        Group cc12_r4 = new Group(cc12_r4_c, cc12_r4_topLine,
                cc12_r4_bottomLine);
        cc12_r4.setRotate(.6);
        cc12_r4.setTranslateX(2);
        
        Polygon cc13_r4_c = new Polygon(
                662, 430,
                662, 391,
                685, 354,
                708, 391,
                708, 430);
        cc13_r4_c.setFill(Color.CORNSILK);
        CubicCurve cc13_r4_topLine = new CubicCurve(663, 403,
                681, 427, 691, 378, 707, 403);
        CubicCurve cc13_r4_bottomLine = new CubicCurve(663, 413,
                681, 438, 691, 388, 707, 413);
        Group cc13_r4 = new Group(cc13_r4_c, cc13_r4_topLine,
                cc13_r4_bottomLine);
        cc13_r4.setRotate(1);
        cc13_r4.setTranslateX(4);
        
        Polygon cc14_r4_c = new Polygon(
                710, 430,
                710, 391,
                733, 354,
                756, 391,
                756, 430);
        cc14_r4_c.setFill(Color.HOTPINK);
        CubicCurve cc14_r4_topLine = new CubicCurve(711, 403,
                729, 427, 739, 378, 755, 403);
        CubicCurve cc14_r4_bottomLine = new CubicCurve(711, 413,
                729, 438, 739, 388, 755, 413);
        Group cc14_r4 = new Group(cc14_r4_c, cc14_r4_topLine,
                cc14_r4_bottomLine);
        cc14_r4.setRotate(1.3);
        cc14_r4.setTranslateX(6);
        
        Polygon cc15_r4_c = new Polygon(
                758, 430,
                758, 391,
                781, 354,
                804, 391,
                804, 430);
        cc15_r4_c.setFill(Color.OLDLACE);
        CubicCurve cc15_r4_topLine = new CubicCurve(759, 403,
                777, 427, 787, 378, 803, 403);
        CubicCurve cc15_r4_bottomLine = new CubicCurve(759, 413,
                777, 438, 787, 388, 803, 413);
        Group cc15_r4 = new Group(cc15_r4_c, cc15_r4_topLine,
                cc15_r4_bottomLine);
        cc15_r4.setRotate(1.6);
        cc15_r4.setTranslateX(8);
        
        Polygon cc16_r4_c = new Polygon(
                806, 430,
                806, 391,
                829, 354,
                852, 391,
                852, 430);
        cc16_r4_c.setFill(Color.MEDIUMSLATEBLUE);
        CubicCurve cc16_r4_topLine = new CubicCurve(807, 403,
                820, 427, 835, 378, 852, 403);
        CubicCurve cc16_r4_bottomLine = new CubicCurve(807, 413,
                820, 438, 835, 388, 852, 413);
        Group cc16_r4 = new Group(cc16_r4_c, cc16_r4_topLine,
                cc16_r4_bottomLine);
        cc16_r4.setRotate(2);
        cc16_r4.setTranslateX(10);
        
        //________________Create Effects__________________________
        BoxBlur blurry = new BoxBlur();
        blurry.setIterations(3);
        
        DropShadow addShadow = new DropShadow();
        
        
        //________________Create Groups__________________________
        
        // upper left crayons
        Group crayonsULtop = new Group(
                cc1_r1, cc2_r1, cc3_r1, cc4_r1,
                cc5_r1, cc6_r1, cc7_r1, cc8_r1);
        crayonsULtop.setTranslateY(-40);
        crayonsULtop.setTranslateX(-2);
        Group crayonsULbottom = new Group(
                cc1_r2, cc2_r2, cc3_r2, cc4_r2,
                cc5_r2, cc6_r2, cc7_r2, cc8_r2);
        Group crayonsUL = new Group(crayonsULtop, crayonsULbottom);
        crayonsUL.setTranslateX(-425);
        crayonsUL.setTranslateY(-94);
        crayonsUL.setRotate(-1);
        
        // upper right crayons
        Group crayonsURtop = new Group(
                cc9_r1, cc10_r1, cc11_r1, cc12_r1,
                cc13_r1, cc14_r1, cc15_r1, cc16_r1);
        crayonsURtop.setTranslateY(-40);
        crayonsURtop.setTranslateX(7);
        Group crayonsURbottom = new Group(
                cc9_r2, cc10_r2, cc11_r2, cc12_r2,
                cc13_r2, cc14_r2, cc15_r2, cc16_r2);
        Group crayonsUR = new Group(crayonsURtop, crayonsURbottom);
        crayonsUR.setTranslateX(-28);
        crayonsUR.setTranslateY(-102);
        crayonsUR.setRotate(-1);
        crayonsUR.setScaleX(.94);
        
        // lower left crayons
        Group crayonsLLtop = new Group(
                cc1_r3, cc2_r3, cc3_r3, cc4_r3,
                cc5_r3, cc6_r3, cc7_r3, cc8_r3);
        crayonsLLtop.setTranslateY(-40);
        crayonsLLtop.setTranslateX(-2);
        Group crayonsLLbottom = new Group(
                cc1_r4, cc2_r4, cc3_r4, cc4_r4,
                cc5_r4, cc6_r4, cc7_r4, cc8_r4);
        Group crayonsLL = new Group(crayonsLLtop, crayonsLLbottom);
        crayonsLL.setTranslateX(-424);
        crayonsLL.setTranslateY(3);
        crayonsLL.setRotate(-1);
        
        // lower right crayons
        Group crayonsLRtop = new Group(
                cc9_r3, cc10_r3, cc11_r3, cc12_r3,
                cc13_r3, cc14_r3, cc15_r3, cc16_r3);
        crayonsLRtop.setTranslateY(-40);
        crayonsLRtop.setTranslateX(-8);
        Group crayonsLRbottom = new Group(
                cc9_r4, cc10_r4, cc11_r4, cc12_r4,
                cc13_r4, cc14_r4, cc15_r4, cc16_r4);
        crayonsLRbottom.setTranslateX(-13);
        crayonsLRbottom.setTranslateY(-2);
        Group crayonsLR = new Group(crayonsLRtop, crayonsLRbottom);
        crayonsLR.setRotate(-1);
        
        // box groups
        Group boxInsertGroup = new Group(
                boxBottomInsert, boxInsertShadowUL,
                boxInsertShadowUR, boxInsertShadowLL,
                boxInsertShadowLR);
        
        Group boxBottomDecor = new Group(
                boxBottomFrontGreenLeft, boxBottomFrontGreenRight,
                boxStripeLeftThin, boxStripeLeftThick,
                boxStripeRightThin, boxStripeRightThick,
                boxRedFlag, boxBottomWords);
        
        Group boxBottomGroup = new Group(
                boxBottomFront, boxBottomOpening,
                boxInsertGroup, boxBottomDecor);
        
        Group boxTopWords = new Group(boxTopWordsTitle,
                boxTopWordsSecondLine);
        
        Group boxTopGroup = new Group(
                boxTop, boxTopOpeningEdge,
                boxTopOpening, boxTopOpeningShadow, boxTopWords);
        
        Group box = new Group(boxTopGroup, boxBottomGroup);
        
        // general groups
        Group upperCrayons = new Group(crayonsUL, crayonsUR);
        upperCrayons.setEffect(addShadow);
        Group lowerCrayons = new Group(crayonsLL, crayonsLR);
        lowerCrayons.setEffect(addShadow);

        Group allObjects = new Group(box, upperCrayons, cCoverTopLeft,
                cCoverTopRight, lowerCrayons,  cCoverBottomLeft,
                cCoverBottomRight);
        allObjects.setEffect(blurry);
        
        //Set up the scene
        Scene crayonsScene = new Scene(allObjects, 900, 850, Color.GREY);
        primaryStage.setTitle("Crayons Two");
        primaryStage.setScene(crayonsScene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
