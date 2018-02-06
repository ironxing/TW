/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Data.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xlu
 */
public class ThreeWishes {

    private static Data data;
    private static HuvudFonster huvudFonster;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Öppna testTableData fonster
        data = new Data();
        data.setVisible(true);

        huvudFonster = new HuvudFonster();
        huvudFonster.setVisible(true);

    }

}
