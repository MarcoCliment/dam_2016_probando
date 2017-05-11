import java.util.Scanner;
 
class ej2pali
{
   public static void main(String args[])//Este método crea la cadena al revés.
   {
      String fraseOriginal, invertida = "", convertida = "";
      Scanner frase = new Scanner(System.in);
      System.out.println("Pon una frase para saber si es palindroma");
      fraseOriginal = frase.nextLine();
      
      int fraseLarga = fraseOriginal.length(); //No me acuerdo de cómo reemplazar caracteres, lo siento
      for ( int i = fraseLarga - 1; i >= 0; i-- )
         invertida = invertida + fraseOriginal.charAt(i);
      if (fraseOriginal.equals(invertida))
         System.out.println("La frase es palíndroma");
      else
         System.out.println("No es palíndroma.");
   }
}	