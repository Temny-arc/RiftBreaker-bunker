import IngameSys.Loader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Tohle bude fajn schovat do nějaké třídy, ve které budeme pracovat se všemi daty a hráčem
        Loader data = Loader.load("res/moredata.txt");

        //Zkouška, zdali načtení proběhlo v pořádku
        System.out.println("Items: " + data.items.size());

    }
}