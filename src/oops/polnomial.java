package oops;

public class polnomial {



        int dynpol[]=new int[20];


        int degree;
        int coefficient;




        /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
         *  then corresponding term with specified degree and value is added int the polynomial. If the degree
         *  is already present in the polynomial then previous coefficient is replaced by
         *  new coefficient value passed as function argument
         */
        public void setCoefficient(int degree, int coeff){
            dynpol[degree]=coeff;


        }

        // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
        public void print(){
                for (degree =0 ;degree<dynpol.length;degree++) {
                        int x=dynpol[degree];
                        int co=dynpol[degree];
                        if (x!=0) {
                                System.out.print(co +"x^"+degree+ " + " );
                        }
                }

        }


        // Adds two polynomials and returns a new polynomial which has result
//        public Polynomial add(Polynomial p){
//
//
//
//
//
//        }
//
//        // Subtracts two polynomials and returns a new polynomial which has result
//        public Polynomial subtract(Polynomial p){
//
//        }
//
//        // Multiply two polynomials and returns a new polynomial which has result
//        public Polynomial multiply(Polynomial p){
//
//        }

    }

