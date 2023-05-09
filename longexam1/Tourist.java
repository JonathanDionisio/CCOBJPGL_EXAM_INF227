interface Tourist {
    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Batangas batangas);
    void visit(Intram intram);
    void visit(MegaMall mm);
    void visit(Moa moa);
    void visit(NationalM nm);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
