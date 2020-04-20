package liubov;

public class letq{
    public static void main(String[] args) {
        pada();
    }
    public static void pada()
    {

        int etaj=10;// ako ne ste fen na cherniq humor ne vuvejdaite otricatelno chislo
        String ime ;

        switch (etaj) {
            case 0:
                ime = "Auch";
                break;
            case 1:
                ime = "Zdravei Penke";
                break;

            case 2:
                ime = "Zdravei vanka";
                break;

            case 3:
                ime = "Zdravei lili";
                break;
            case 4:
                ime = "Zdravei Minke";
                break;
            case 5:
                ime = "Zdravei tate";
                break;
            case 6:
                ime = "Zdravei Jema mi";
                break;
            case 7:
                ime = "Zdravei mitak";
                break;
            case 8:
                ime = "Zdravei Deni";
                break;
            default:
                ime = "Zdravei Isuse";
                break;
        }
        if(etaj<9) {
        System.out.println(ime);
        }
        else System.out.println("liubovnika e skochil ot 9 etaj");
    }

}
