package Nov.INHERITANCE.ex_01712024_InheritanceTestcases;

public class Runnerclass_CommonBaseTest {
    public static void main(String[] args) {
        Testcase1 tc1=new Testcase1();
        tc1.startBrowser();
        tc1.closeBrowser();
        tc1.readExcelFIle();

        Testcase2 t2=new Testcase2();
        t2.startBrowser();
        t2.readExcelFIle();
        t2.closeBrowser();
    }
}
