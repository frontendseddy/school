package PVSv.files;

import java.io.File;

public class Properties {
    static void tree(File f) {
        File[] contents = f.listFiles();
        for (File file : contents) {
            if (file.isFile()) {
                System.out.println("Soubor: " + file.getName());
            }
            else {
                System.out.println("Slozka: " + file.getName());

//                tree(file);
            }
        }
    }
    static void printTree(File file, String indent) {
        System.out.println(indent + "+-- " + file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    if (i == files.length - 1) {
                        printTree(files[i], indent + "    ");
                    } else {
                        printTree(files[i], indent + "|   ");
                    }
                }
            }
        }
    }
    static void smh(){
        File directory = new File("path_to_your_directory_here");
        if (directory.exists()) {
            System.out.println(directory.getName());
            printTree(directory, "");
        } else {
            System.out.println("Directory not found.");
        }
    }

    static void printDirectory(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
//            for (int i = 0; i < files.length; i++) {            tezsi pro pocitac
//                if (files[i].isFile()) {
//                    System.out.println("Soubor: " + files[i].getName());
//                }
//                else {
//                    System.out.println("Slozka: " + files[i].getName());
//                }
//            }
            for (File tmp : files) {   // jednodussi pro pocitac
                if (tmp.isFile()) {
                    System.out.println("Soubor: " + tmp.getName());
                }
                else {
                    System.out.println("Slozka: " + tmp.getName());
                }
            }
        }
        else {
            System.out.println("Neni adresar");
        }
    }

    static void fileSize(File file) {
        System.out.println(file.length() + " + B");
        System.out.println(file.length()/1024 + " + kB");
        System.out.println(file.length()/1024/1024 + " + MB");
    }

    public static void main(String[] args) {
        File f = new File("filesResources\\Tracks.txt");
        File another = new File("filesResources\\slozka");
        System.out.println("Soubor: " + f.getName());
        System.out.println("Cesta relativne: " + f.getPath());
        System.out.println("Cesta absolutne: " + f.getAbsolutePath());

        String[] type = f.getName().split("\\.");
        System.out.println("Typ souboru:" + type[type.length - 1]);

        if (f.isFile()) {
            System.out.println("Jedna se o soubor");
        }
        else {
            System.out.println("Jedna se o slozku");
        }

        fileSize(f);

        File vypis = new File("filesResources");
        System.out.println("---output---");
        tree(vypis);

        smh();
    }
}


