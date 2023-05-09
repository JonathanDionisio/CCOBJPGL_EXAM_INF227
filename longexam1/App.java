public class App {
    public static void main(String[] args) throws Exception {

        Me tourist = new Me();
        
        Boracay boracay = new Boracay();
        Batangas batangas = new Batangas();
        Intram intram = new Intram();
        MegaMall mm = new MegaMall();
        Moa moa = new Moa();
        NationalM nm = new NationalM();


        

        boracay.accept(tourist);
        batangas.accept(tourist);
        intram.accept(tourist);
        mm.accept(tourist);
        moa.accept(tourist);
        nm.accept(tourist);

    
    }
}
