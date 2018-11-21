import java.text.DecimalFormat;
class circle{
    private int radius;
    void circle(int radius){
        this.radius=radius;
    }
    double get_circle(){
        return radius*radius*Math.PI;
    }
}
public class float_with_2digitafter_fullstop{
    	private static DecimalFormat b = new DecimalFormat(".##");
    public static void main(String sr[]){
      circle obj=new circle();
            obj.circle(5);
            double n=obj.get_circle();
            System.out.println(n);
            System.out.println(b.format(n));
    }
}
