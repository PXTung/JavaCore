package view;

import controller.DBConnection;
import controller.Controller;

import java.sql.Connection;

public class View {
    public static void main(String[] args) {
        int menuCase;
        do {
            menuCase = Controller.INSTANCE.mainMenu();
            switch (menuCase){
                case 0:
                    break;

                case 1:
                    Controller.INSTANCE.document();
                    break;

                case 2:
                    Controller.INSTANCE.person();
                    break;
            }
        }while(menuCase != 0);


    }
}
