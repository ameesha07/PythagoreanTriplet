import java.util.*;
class PythagoreanTriplet{

    private int a,b,c;

    public PythagoreanTriplet()
    {
       
    }

    public PythagoreanTriplet(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    private static List<PythagoreanTriplet> tripletList = new ArrayList<>();
    private static PythagoreanTriplet pythagoreanTriplet = new PythagoreanTriplet();
    
    private static int limit;
    
    public static PythagoreanTriplet makeTripletsList() {
        tripletList = new ArrayList<>();
        return pythagoreanTriplet;
    }

    public static PythagoreanTriplet withFactorsLessThanOrEqualTo(int limit)
    {
        return pythagoreanTriplet;
    }

     public static PythagoreanTriplet thatSumTo(int sum)
    {
        limit=sum;
        return pythagoreanTriplet;
    }

     public static List<PythagoreanTriplet> build() {
         for(int i=1;i<=limit/3;i++)
             {
                 for(int j=i;j<=(limit-i)/2;j++)
                     {
                         if(Math.pow(i,2)+Math.pow(j,2)==Math.pow(limit-i-j,2))
                              tripletList.add(new PythagoreanTriplet(i,j,limit-i-j));
                     }
             }
                 return tripletList;
     }

     public boolean equals(Object other) {
        if (! (other instanceof PythagoreanTriplet))
            return false;
        PythagoreanTriplet triplet = (PythagoreanTriplet) other;
        return (triplet.a == this.a && triplet.b == this.b && triplet.c == this.c);
    }
}
