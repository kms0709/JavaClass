package p11;

import p11.Sample;

public class Sample {
    int id;
    public Sample(int x) {this.id=x;}
    public void set(int x) {this.id=x;}
    public int get() {return this.id;}

    public static void main(String[] args) {
        Sample ob1=new Sample(3);
        Sample ob2=new Sample(4);
        Sample s;

        s=ob2;
        ob1=ob2; //객체의 치환
        System.out.println("ob.id="+ob1.get());
        System.out.println("ob.id="+ob1.get());
    }
}