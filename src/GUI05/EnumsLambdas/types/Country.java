package GUI05.EnumsLambdas.types;

public enum Country {
    PL,
    NL,
    DE;


    @Override
    public String toString() {
        String name = "";
        switch (ordinal()){
            case 0:
                name = "Polska";
                break;
            case 1:
                name = "Nederland";
                break;
            case 2:
                name = "Deutschland";
        }
       return name;
    }
}
