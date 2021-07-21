package projects.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) { SpringApplication.run(DemoApplication.class, args);}

    {
         int num1 = 5, num2 = 3, sum;
        sum = num1 + num2;
        System.out.println("The sum is:" + sum);

    }

}
