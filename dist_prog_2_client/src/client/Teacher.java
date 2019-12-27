package client;

import example.Homework;
import example.HomeworkService;
import example.Mark;
import example.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.nio.file.Files;

public class Teacher {
    Homework service;

    public Teacher() {
        service = new HomeworkService().getPort(Homework.class);
    }

    public void getAllWorks() {
        List<Task> tasks = service.getWorks();

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Author: " + tasks.get(i).getSubmitter());
            System.out.println("Id: " + tasks.get(i).getId());
        }
    }

    public void getAllMarks() {
        System.out.print("Work id: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        List<Mark> marks = service.getMarks(id);

        for (int i = 0; i < marks.size(); i++) {
            System.out.println("Author: " + marks.get(i).getSubmitter());
            System.out.println("Mark: " + marks.get(i).getMark());
        }
    }

    public void download() {
        System.out.print("Work id: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.print("File path: ");
        String filename = scanner.next();
        File file = new File(filename);
        byte[] content = service.downloadWork(id);
        try {
            Files.write(file.toPath(), content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getMark() {
        System.out.print("Work id: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.println(service.getAvgMark(id));
    }

    public void start() {
        boolean stop = false;
        while (!stop) {
            System.out.println("Choose action: ");
            System.out.println("1) Get all works");
            System.out.println("2) Download work");
            System.out.println("3) Get all marks");
            System.out.println("4) Get mark");
            System.out.println("5) Exit");

            Scanner scanner = new Scanner(System.in);

            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    getAllWorks();
                    break;
                case 2:
                    download();
                    break;
                case 3:
                    getAllMarks();
                    break;
                case 4:
                    getMark();
                    break;
                case 5:
                    stop = true;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.start();
    }
}