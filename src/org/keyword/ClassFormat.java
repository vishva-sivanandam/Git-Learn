package org.keyword;

public class ClassFormat extends Format{
      static int a = 20;
     int b;

    public ClassFormat(int b) {
        System.out.println(b);
    }

    public ClassFormat() {
        this(2);
    }

    public void display(){
        System.out.println('d');
    }

    public void result(){
          display();
          super.display();
        System.out.println(this.a);
        System.out.println(super.a);

    }

    public static void main(String[] args) {

     ClassFormat classFormat = new ClassFormat();
     classFormat.result();

    }
}
