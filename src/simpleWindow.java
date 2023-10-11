import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simpleWindow extends JFrame {
    private  JPanel panel = new JPanel();
    simpleWindow(){
        super("Test window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        boolean[] btnBol = {false,false};
        JButton [] downBtn = new JButton[] { new JButton("Записать в файл"),
                                             new JButton("Дописать в файл"),
                                             new JButton("Чтение из файла")};

        JButton [] downBtn2 = new JButton[] { new JButton("Записать в файл"),
                                              new JButton("Дописать в файл"),
                                              new JButton("Чтение из файла")};


        JButton [] buttons = new JButton[]{ new JButton("Формат TXT"),
                                            new JButton("Формат Word"),
                                            new JButton("Формат Excel"),
                                            new JButton("Формат CSV")};

        JButton [] buttons2 = new JButton[]{ new JButton("Формат TXT"),
                                             new JButton("Формат Word"),
                                             new JButton("Формат Excel"),
                                             new JButton("Формат CSV")};

        JButton [] buttonsMenu = new JButton[]{ new JButton(" Создание файлов "),
                                                new JButton(" Работа с файлами "),
                                                new JButton(" Просмотр отчетов "),
                                                new JButton(" Администрирование "),
                                                new JButton(" Выход ")};

        initHorizontal(buttonsMenu,20,20,220,true,200,50);
        initVetical(buttons,20,90,70,false,200,50);
        initVetical(buttons2,240,90,70,false,200,50);
        initVetical(downBtn,450,90,30,false,200,25);
        initVetical(downBtn2,450,180,30,false,200,25);
        panel.setLayout(null);


        buttonsMenu[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(buttons[0].isVisible()){
                    editVisible(buttons,false);

                }
                else {
                    editlocation(buttons, 20, 90, 70);
                    editVisible(buttons, true);
                    btnBol[0]=true;
                }
            }
        });
        buttonsMenu[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(buttons2[0].isVisible()){
                    editVisible(buttons2,false);
                    editVisible(downBtn,false);
                    editVisible(downBtn2,false);
                }
                else {
                    editlocation(buttons2, 240, 90, 70);
                    editVisible(buttons2, true);
                    btnBol[1]=true;
                }

            }
        });

        buttons2[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(downBtn[0].isVisible()){
                    editVisible(downBtn,false);
                }
                else {

                    editVisible(downBtn,true);
                }
            }
        });
        buttons2[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(downBtn2[0].isVisible()){
                    editVisible(downBtn2,false);
                }
                else {

                    editVisible(downBtn2,true);
                }
            }
        });
        setContentPane(panel);
        setSize(1280,720);
    }

        public void initVetical(JButton[] buttons, int coutnX, int coutnY,int step,boolean Visibale,int width,int height){
            for (int i=0;i<buttons.length;i++,coutnY+=step){
                buttons[i].setVisible(Visibale);
                buttons[i].setSize(width,height);
                buttons[i].setLocation(coutnX,coutnY);
                panel.add(buttons[i]);
            }
        }
        public void initHorizontal(JButton[] buttons, int coutnX, int coutnY,int step,boolean Visibale,int width,int height){
        for (int i=0;i<buttons.length;i++,coutnX+=step){
            buttons[i].setVisible(Visibale);
            buttons[i].setSize(width,height);
            buttons[i].setLocation(coutnX,coutnY);
            panel.add(buttons[i]);
        }

    }
    public static void editVisible(JButton[] buttons , boolean visibale){
        for (int i=0;i<buttons.length;i++){
            buttons[i].setVisible(visibale);
        }
    }
    public static void editlocation(JButton[] buttons,int countX,int countY,int step){
        for(int i=0;i<buttons.length;i++,countY+=step){
            buttons[i].setLocation(countX,countY);
        }
    }


}
