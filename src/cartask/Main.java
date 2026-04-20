package cartask;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {

    Model m1 = new Model("Mercedes C200", LocalDate.of(2012, 12, 12), 14000.00);
    Model m2 = new Model("Mercedes E200", LocalDate.of(2015, 5, 10), 18000.00);
    Model m3 = new Model("Mercedes S500", LocalDate.of(2018, 3, 20), 35000.00);

    Model b1 = new Model("BMW 320", LocalDate.of(2013, 7, 15), 15000.00);
    Model b2 = new Model("BMW 520", LocalDate.of(2016, 8, 25), 22000.00);
    Model b3 = new Model("BMW X5", LocalDate.of(2019, 1, 5), 40000.00);

    Model t1 = new Model("Toyota Corolla", LocalDate.of(2014, 4, 18), 13000.00);
    Model t2 = new Model("Toyota Camry", LocalDate.of(2017, 9, 30), 20000.00);
    Model t3 = new Model("Toyota Prado", LocalDate.of(2020, 6, 12), 45000.00);

    Marka mercedes = new Marka("Mercedes", LocalDate.of(2002, 3, 12),
            new Model[]
                    {
                            m1, m2, m3
                    });


    Marka bmw = new Marka("Bmw", LocalDate.of(2001, 4, 1),
            new Model[]
                    {
                            b1, b2, b3
                    });

    Marka toyota = new Marka("Toyota",LocalDate.of(1997,2,1),
            new Model[]
                    {
                            t1,t2,t3
                    });

    Marka[] brands = {mercedes,toyota,bmw};


    for(Marka marka :brands ){
      System.out.println(marka.name);
      for(Model model : marka.models){
        System.out.println(model);
      }
    }


  }

}
