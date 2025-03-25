/*
主类 负责运行任务管理系统
 */
package com.taskmanager;
import java.util.Scanner;
public class TaskManagerApp {

    /**
     * 打印菜单目录
     * 此方法用于在控制台输出系统可执行的操作目录，帮助用户了解可以进行哪些操作
     * 它为用户提供了一个清晰的操作指南，确保用户可以按照提示进行选择
     */
    public static void printCatalog(){
        System.out.println("- - - - - 1. 创建任务");
        System.out.println("- - - - - 2. 查看任务");
        System.out.println("- - - - - 3. 查看所有任务");
        System.out.println("- - - - - 4. 标记任务完成");
        System.out.println("- - - - - 5. 删除任务");
        System.out.println("- - - - - 0. 退出");
        System.out.println("- - - - - 请输入您的选择：");
    }
    public static void menu() {
        System.out.println("- - - - - 欢迎使用任务管理系统 - - - - -");
        printCatalog();
        // 初始化Scanner对象
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            while (true) {
                if(scanner.hasNextInt()){ // 判断是否为整数
                    choice = scanner.nextInt();
                }else{
                    System.out.println("无效输入，请输入数字！");
                    scanner.next(); //清除无效输入
                    continue;
                }
                // 选择退出
                if(choice == 0){
                    System.out.println("感谢使用任务管理系统,再见！");
                    break;
                }
            }
            switch (choice){
                case 1:
                    break;
                default:
                    System.out.println("无效输入，请重新输入！");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
    }
}
