package pl.sda.springproject.console;

import org.springframework.stereotype.Component;

@Component
public class ConsoleOutput {
    private final Calculator calculator;
    public ConsoleOutput (Calculator calculator){
        this.calculator = calculator;
    }

    //    Zadanie 1
//Zdefiniuj klasę bean'a o nazwie ConsoleOutput z metodą print(name)
//Zadeklaruj pole output z klasą beana i wstrzyknij przez konstruktor
//Wywołaj w metodzie run metodę print beana.
    public void print(String name) {
        System.out.println("Hello " + name);

    }
    public Calculator getCalculator(){
        return calculator;
    }
}
