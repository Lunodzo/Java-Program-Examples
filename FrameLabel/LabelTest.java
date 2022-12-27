package FrameLabel;

import javax.swing.JFrame;

public class LabelTest {
    public static void main(String[] args) {
        LabelFrame labelFrame = new LabelFrame(); // create LabelFrame
        labelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        labelFrame.setSize( 260, 180 ); // set frame size
        labelFrame.setVisible( true ); // display frame
    }
}
