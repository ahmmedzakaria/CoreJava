package FromSir.InterfaceAndFactoryPattern;

public class TestImplement implements TestA, TestB{

    TestImplement(){
    //x=30;
    }
    public static void main(String[] args) {
        TestImplement ti = new TestImplement();
        ti.print();
        System.out.println(x);
        
    }

    @Override
    public void print() {
        System.out.println("Printing......");
        System.out.println(x);
    }

    public void printx() {
        //
    }   
    
}
