public class Me implements Tourist{

    static int budget = 1;
    

    public void visit() {
        System.out.println("Enjoying my stay");
        
        
    }

    public void visit( Boracay boracay ) {

        int budget = Me.budget - boracay.airFare;
        this.budget = budget;

        

        if (budget > boracay.airFare){
            System.out.println("ganda ng beach hehe");
            checkBudget();
        } else{
            System.out.println("no more money");
            
        }
    }

    public void visit( Batangas batangas) {

        int budget = Me.budget - batangas.airFare;
        this.budget = budget;

        if (budget > batangas.airFare){
            System.out.println("uy si ermat");
            checkBudget();
        } else{
            System.out.println("no more money");
            
        }
    }

    public void visit( Intram intram) {

        int budget = Me.budget - intram.airFare;
        this.budget = budget;

        if (budget > intram.airFare){
            System.out.println("dito tayo una nagkita");
            checkBudget();
        } else{
            System.out.println("no more money");
            
        }
    }

    public void visit( MegaMall mm) {

        int budget = Me.budget - mm.airFare;
        this.budget = budget;

        if (budget >  mm.airFare){
            System.out.println("nakakastress pero worth it");
            checkBudget();
        } else{
            System.out.println("no more money");
            
        }
    }

    public void visit( Moa moa) {

        int budget = Me.budget - moa.airFare;
        this.budget = budget;

        if (budget > moa.airFare){
            System.out.println("namimiss ko na kayo kasama");
            checkBudget();
        } else{
            System.out.println("no more money");
            
        }
    }

    public void visit( NationalM NM) {

        
        int budget = Me.budget - NM.airFare;
        this.budget = budget;

        if (budget > NM.airFare){
            System.out.println("nakasabay kta umuwi hehe");
            checkBudget();
        } else{
            System.out.println("no more money");
            
        }

        
       


    }

    

    

    public void checkBudget() {
        System.out.println("my budget is " + budget );
    }
    
    
    }



