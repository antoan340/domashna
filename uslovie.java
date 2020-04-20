package zadacha2;
public class uslovie {
    public static void main(String[] args) {
        broiDni();
    }
    public static void broiDni()
    {
        int number=1;
        if(number==2) {
            System.out.println("Vuvedemoq mesec ima 28 dena");
        }
        if(number == 4 ||number == 6 || number == 9 ||number == 11) {
            System.out.println("Vuvedeniq mesec ima 30 dena");
        }
        if(number>12){
            System.out.println("meseca e nevaliden");
        }
        else System.out.println("Vuvedemoq mesec ima 31 dena");
    }
