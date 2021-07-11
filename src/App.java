import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
		String cadena1= entrada.nextLine();
		String cadena = cadena1.toLowerCase();
		

		 char alfabeto1[] = {'a','b','c','d','e','f','g','h','i','j','k','l',
			        'm','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};  
		String alfabeto = "abcdefghijklmnopqrstuvwxyz ";
		Integer numEquivalente[] = {2,22,222,3,33,333,4,44,444,5,55,555,6,66,666,7,77,777,7777,
		                8,88,888,9,99,999,9999,0};
		boolean abdIn =true;
		
	
		//Comprobamos si cada letra de la palabra esta contenida o no en el alfabeto
				for (int i = 0; i < cadena.length(); i++)
				{
					String letra =  Character.toString(cadena.charAt(i)); //Convertimos el char en String...
					if (!alfabeto.contains(letra)) //...para poder usar el metodo String.contains()
					{
						abdIn = false; //Si la letra NO está contenida, es que la palabra no es valida
						//Mostramos el caracter que no es valido.
						System.out.println(letra + " no pertenece al alfabeto");
                        System.exit(0);
					}
				}
				
				//Finalizado el bucle, comprobamos el boolean. Si conserva valor true,
				//es que la palabra era válida y hemos de mostrar su longitud
				if (abdIn) {
					char [] caracteres = cadena.toCharArray();
					for (int i=0; i<caracteres.length; i++){
			            for (int j=0; j<alfabeto1.length; j++){
			                if (caracteres[i]==alfabeto1[j]){
			                    int varRes = j;
			                    System.out.print(numEquivalente[varRes]+" ");
			                  }
			                  
			                   
			               }
			        }

				}
		
		

        
    }
}
