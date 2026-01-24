package ex_17_OOPs;

import org.w3c.dom.ls.LSOutput;

public class Lab160_Constructor {
    public static void main(String[] args) {
        Animal dog = new Animal();
        MySQL a = new MySQL();
        ReadExcelFile e = new ReadExcelFile();
    }
}
//class Animal{Z
//
//}
//
class MySQL{
    MySQL(){
        System.out.println("MySQL Connection");
    }
}

class ReadExcelFile{
    ReadExcelFile(){
        System.out.println("ExcelFile is Loaded!");
    }
}



//
//class B{
//
//}

//There can be n number of classes but only one public class