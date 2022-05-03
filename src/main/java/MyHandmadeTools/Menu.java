/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyHandmadeTools;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Menu {

    private String menuTitle;
    private ArrayList<String> optionList = new ArrayList();
    //chứa các lựa ch�?n/ thực đơn

    //khởi tạo tên của app., tên của menu
    public Menu(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    //bổ sung một lựa ch�?n vào danh sách, bắt đầu xây dựng thực đơn/
    //lựa ch�?n của chương trình
    public void addNewOption(String newOption) {
        //TODO: cần kiểm tra coi option đưa vào có trùng với option
        //sẵn có hay ko?
        //nếu ko trùng, add vào danh sách lựa ch�?n
        optionList.add(newOption);
    }

    //in ra danh sách các lựa ch�?n để ngư�?i dùng ch�?n tính năng cần
    //dùng
    public void printMenu() {
        if (optionList.isEmpty()) {
            System.out.println("There is no item in the menu");
            return;
        }
        System.out.println("\n------------------------------------");
        System.out.println("Welcome to " + menuTitle);
        for (String x : optionList) {
            System.out.println(x);
        }
    }

    //có menu mới có lựa ch�?n. Hàm trả v�? con số ngư�?i dùng ch�?n
    //ứng với chức năng mà ngư�?i dùng muốn app thực thi
    public int getChoice() {
        int maxOption = optionList.size();
        //lựa ch�?n lớn nhất là số thứ tự ứng với số mục ch�?n
        String inputMsg = "Choose [1.." + maxOption + "]: ";
        String errorMsg = "You are required to choose the option 1.." + maxOption;
        return MyToys.getAnInteger(inputMsg, errorMsg, 1, maxOption);
        //in ra câu nhập: Choose[1..8]: , giả sử có 8 mục ch�?n trong
        //menu
    }

}
