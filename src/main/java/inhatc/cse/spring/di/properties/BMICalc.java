package inhatc.cse.spring.di.properties;

public class BMICalc {
    private double low;
    private double normal;
    private double over;
    private double obesity;

    public void bmiCalc(double weight, double height){
        double h = height * 0.01;
        double result = weight / (h * h);
        System.out.println("BMI 지수 : " + result);

        if(result > obesity){
            System.out.println("비만 입니다.");
        }else if(result > over) {
            System.out.println("과체중 입니다.");
        }else if(result > normal) {
            System.out.println("정상체중 입니다.");
        }else {
            System.out.println("저체중 입니다.");
        }
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getNormal() {
        return normal;
    }

    public void setNormal(double normal) {
        this.normal = normal;
    }

    public double getOver() {
        return over;
    }

    public void setOver(double over) {
        this.over = over;
    }

    public double getObesity() {
        return obesity;
    }

    public void setObesity(double obesity) {
        this.obesity = obesity;
    }

    @Override
    public String toString() {
        return "BMICalc{" +
                "low=" + low +
                ", normal=" + normal +
                ", over=" + over +
                ", obesity=" + obesity +
                '}';
    }

    public BMICalc() {
    }

    public BMICalc(double low, double normal, double over, double obesity) {
        this.low = low;
        this.normal = normal;
        this.over = over;
        this.obesity = obesity;
    }
}
