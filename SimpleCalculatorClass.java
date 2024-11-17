
public class SimpleCalculatorClass {
    private double Num_1;
    private double Num_2;
    private String op;

    public void GetResult(double N_1,double N_2,String opp){
        Num_1=N_1;
        Num_2=N_2;
        op=opp;

        if ("+".equals(opp)){
            
            System.err.println(Num_1+Num_2);
            

        } else if("-".equals(opp)) {
            System.err.println(Num_1-Num_2);

        } else if("*".equals(opp)) {
            System.err.println(Num_1*Num_2);

        }else if("/".equals(opp)) {
            System.err.println(Num_1/Num_2);

        }else {
            
            System.err.println("Operator is not found!?");
        }


}
}
