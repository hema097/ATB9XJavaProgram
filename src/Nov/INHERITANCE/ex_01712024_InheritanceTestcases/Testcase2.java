package Nov.INHERITANCE.ex_01712024_InheritanceTestcases;

public class Testcase2 extends  CommonBaseTest{
    Testcase2() {
        System.out.println("DC- getting aatributes from CommonBaseTest");
    }
        void Testcase2(){
        startBrowser();
        System.out.println("Starting the Browser");
        readExcelFIle();
        System.out.println("Reading the excel file");
        closeBrowser();
        System.out.println("CLosing the browser");
    }

}
