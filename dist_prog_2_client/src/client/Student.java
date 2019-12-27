package client;

import example.Homework;
import example.HomeworkService;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.nio.file.Files;

public class Student {
    Homework service;

    public Student() {
        service = new HomeworkService().getPort(Homework.class);
    }

    public void uploadWork() {
        System.out.print("Your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("File path: ");
        String filename = scanner.next();
        File file = new File(filename);
        try {
            byte[] fileContent = Files.readAllBytes(file.toPath());
            int id = service.uploadWork(name, fileContent);
            System.out.println("Your work id is " + id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getForVer() {
        List<Integer> ids = service.getWorksForVerification();
        for (Integer id : ids) {
            System.out.println(id);
        }
    }

    public void verify() {
        System.out.print("Your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Work id: ");
        int id = scanner.nextInt();
        System.out.print("Mark: ");
        int mark = scanner.nextInt();
        service.setMark(id, name, mark);
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
            System.out.println("1) Upload work");
            System.out.println("2) Get works for verification");
            System.out.println("3) Verify work");
            System.out.println("4) Download work");
            System.out.println("5) Get mark");
            System.out.println("6) Exit");

            Scanner scanner = new Scanner(System.in);

            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    uploadWork();
                    break;
                case 2:
                    getForVer();
                    break;
                case 3:
                    verify();
                    break;
                case 4:
                    download();
                    break;
                case 5:
                    getMark();
                    break;
                case 6:
                    stop = true;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.start();
    }
}
