//para interfaces y clases
	import java.util.*;
	import java.util.Arrays; 

public class Juego

{ public static void imprimirFila(String fila[]) //darle colores a las matrices de números que hicimos
	{
		for (int i=0;i<fila.length;i++) {
			
	 		if(fila[i].equals("1"))
	 		{
	 			System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("2"))
	 		{
	 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("3"))
	 		{
	 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("4"))
	 		{
	 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
	 		}		 		
		}
		System.out.println(ConsoleColors.RESET);
	}

	public static int subMenuSeleccionBandera(int[] indices)
	{
		int opc = 0;

		do{
			System.out.println("Ingrese un valor entre 1 y "+indices.length);
			opc = ConsoleInput.getInt();
		}while(opc<0 || opc==0 || opc>indices.length);

		return opc-1;
	}
	
	public static void imprimirGraficoBandera(String[] banderas, int indice)
	{
		for (int i=indice;i<indice+20;i++ ) //las matrices de las banderas avanzan de a 20
		{
			imprimirFila(banderas[i].split(";"));
		}
			
	}

	public static void imprimirInformacionBandera(String[] banderas,int indice)
	{
		String fila[];

		for (int i=indice;i<indice+20;i++ ) {
			if(i == indice)
			{
				fila = banderas[i].split(";");
				System.out.println("Nombre pais: "+fila[0]);
				/*System.out.println("Capital: "+fila[1]);
				System.out.println("Idioma: "+fila[2]);*/
			}
			else{
				System.out.println(banderas[i]);
			}
		}
	}

	public static void separador()
	{
		
		System.out.println("_  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _ _  _  _  _  _  _ ");
		System.out.println();
		System.out.println("| /|| /|| /|| /|| /|| /|| /|| /|| /|| /|| /|| /|| || /|| /|| /|| /|| ");
		System.out.println("_  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _");
	}
	
	public static void jugar()
	{	
		
		
		
		
		System.out.println("   _____                         ");
		System.out.println(" _|     |.--.--.-----.---.-.----.");
		System.out.println("|       ||  |  |  _  |  _  |   _|");
		System.out.println("|_______||_____|___  |___._|__|  ");
		System.out.println("               |_____|        ");

		System.out.println();
		String banderas[] = ConsoleFile.read("info_banderas.csv");
		int indices[] = crearIndices(banderas.length/20);
		imprimirGraficoBandera(banderas, indices[1]);
		System.out.println();	
		System.out.println();	
		System.out.println();	
		System.out.println("Primer destino: Colombia");	
		System.out.println("Para visitar a este país tenemos 8 cupos disponibles");
		System.out.println("dependiendo de tu respuesta te decimos si viajas o no viajas");
		System.out.println("Selecciona lo primero que llevarías");
		System.out.println(ConsoleColors.YELLOW+"1."+ConsoleColors.RESET+ "Coco");
		System.out.println(ConsoleColors.YELLOW+"2."+ConsoleColors.RESET+ "Cuchillo");
		System.out.println(ConsoleColors.YELLOW+"3."+ConsoleColors.RESET+ "Armadillo");
		System.out.println(ConsoleColors.YELLOW+"4."+ConsoleColors.RESET+ "Colonia");

		int centinela_;
		boolean bandera;
		do
		{	
			System.out.println("Ingresa un número: ");
			centinela_ = ConsoleInput.getInt();
				switch(centinela_)
			{
				case 1:	System.out.println("Viajas" + ConsoleColors.GREEN+ConsoleColors.RESET);
						break;
				case 2: System.out.println("Viajas"+ConsoleColors.GREEN+ConsoleColors.RESET);
						break;
				case 3: System.out.println("No viajas"+ConsoleColors.RED+ConsoleColors.RESET);
						break;
				case 4: System.out.println("No viajas"+ConsoleColors.RED+ConsoleColors.RESET);
						break;
				default: System.out.println("Opcion no disponible");
						break;
			}
			bandera=false;

		}while(bandera);
		separador();
		System.out.println();
		System.out.println("Siguiente destino");
		System.out.println("Escoge una actividad que quieras realizar después de turistear: ");
		System.out.println(ConsoleColors.YELLOW+"1."+ConsoleColors.RESET+ "Pedir un Uber");
		System.out.println(ConsoleColors.YELLOW+"2."+ConsoleColors.RESET+ "Ir al supermercado");
		System.out.println(ConsoleColors.YELLOW+"3."+ConsoleColors.RESET+ " "+ConsoleColors.RED+ "NETFLIX"+ConsoleColors.RESET+ " and chill");
		System.out.println();
		System.out.println("Ingresa un número");
		int entrada;
		boolean bandera_;
		entrada = ConsoleInput.getInt();
		int opcion;
		do
		{
			switch(entrada)
			{
				case 1:	
				
				
				imprimirGraficoBandera(banderas, indices[0]);
				System.out.println();	
				System.out.println();	
				System.out.println();
				System.out.println("Llegas a gran Gran Bretaña y cuentas con este gran problema");
				System.out.println("Tienes 11 % de batería en tu telefono" + ConsoleColors.GREEN);
				System.out.println("¿Que vas a hacer?: ");
				System.out.println(ConsoleColors.YELLOW+"1."+ConsoleColors.RESET+" Devolverse");
				System.out.println(ConsoleColors.YELLOW+"2."+ConsoleColors.RESET+" Comer trucha");
				System.out.println(ConsoleColors.YELLOW+"3."+ConsoleColors.RESET+" Irse a caballo");
				System.out.println(ConsoleColors.YELLOW+"4."+ConsoleColors.RESET+" Preocuparte");
				
				boolean bandera2;
				do
				{	
					System.out.println("Ingresa: ");
					opcion = ConsoleInput.getInt();
					switch(opcion)
					{
						case 1: System.out.println("Incorrecto");
								break;
						case 2: System.out.println("Correcto");
								break;
						case 3: System.out.println("Incorrecto");
								break;
						case 4: System.out.println("Correcto");
								break;
						default: System.out.println("Opcion incorrecta");
	
					}
					bandera2=false;
					
				}while(bandera2);
				   break;
				case 2: 

				
				imprimirGraficoBandera(banderas, indices[8]);
				System.out.println();	
				System.out.println();	
				System.out.println();
				System.out.println("Se te ha asignado la bandera de Isla de Pascua");
				System.out.println("Solo tienes $12 para comprar en el supermercado,"+ConsoleColors.RESET);
				System.out.println("tienes las siguientes opciones: ");

				System.out.println(ConsoleColors.YELLOW+"1."+ConsoleColors.RESET+ "Comprar arroz");
				System.out.println(ConsoleColors.YELLOW+"2."+ConsoleColors.RESET+ "Comprar leche");
				System.out.println(ConsoleColors.YELLOW+"3."+ConsoleColors.RESET+ "Comprar banano");
				System.out.println(ConsoleColors.YELLOW+"4."+ConsoleColors.RESET+ "Llorar porque no te alcanza el dinero");

				do
				{	

					System.out.println("¿Qué debes comprar?");
					opcion = ConsoleInput.getInt();
					switch(opcion)
					{
						case 1: System.out.println("Correcto");
								break;
						case 2: System.out.println("Correcto");
								break;
						case 3: System.out.println("Incorrecto");
								break;
						case 4: System.out.println("Incorrecto");
								break;
						default: System.out.println("Opcion incorrecta");
	
					}
					bandera2=false;
					
				}while(bandera2);
				   break;
				case 3:
				imprimirGraficoBandera(banderas, indices[12]);
				System.out.println();	
				System.out.println();	
				System.out.println();	
				System.out.println("Bienvenido a Aland. Como acabas de llegar a un pais") ;
				System.out.println("nuevo y no conoces a nadie, prefieres verte una película.");
				System.out.println("Solo tienes 5 películas para escoger:");
				System.out.println(ConsoleColors.YELLOW+"1."+ConsoleColors.RESET+" Ironman");
				System.out.println(ConsoleColors.YELLOW+"2."+ConsoleColors.RESET+" Duel");
				System.out.println(ConsoleColors.YELLOW+"3."+ConsoleColors.RESET+" 300");
				System.out.println(ConsoleColors.YELLOW+"4."+ConsoleColors.RESET+"Antman");
				System.out.println(ConsoleColors.YELLOW+"5."+ConsoleColors.RESET+" Dumbo");
				

				do
				{	

					System.out.println("Ingresa: ");
					opcion = ConsoleInput.getInt();
					switch(opcion)
					{
						case 1: System.out.println("Incorrecto");
								break;
						case 2: System.out.println("Incorrecto");
								break;
						case 3: System.out.println("Incorrecto");
								break;
						case 4: System.out.println("Incorrecto");
								break;
					    case 5: System.out.println("Correcto");
								break;
						default: System.out.println("Opcion no disponible");
								break;
					}
					bandera2=false;
					
				}while(bandera2);

				break;
				default: System.out.println("Opcion no disponible");
				break;
			}
			bandera_=false;
		}while(bandera_);

		imprimirGraficoBandera(banderas, indices[18]);
		System.out.println();
		System.out.println("Siguiente destino");
		System.out.println();
		System.out.println("En este país asesinaron al presidente, ");
		System.out.println("son seis los sospechosos de haber cometido este crimen:");
		System.out.println("¿Quién mató al presidente?");
		System.out.println();
		System.out.println(ConsoleColors.YELLOW+"1."+ ConsoleColors.RESET+" Sargento");
		System.out.println(ConsoleColors.YELLOW+"2."+ ConsoleColors.RESET+" Doctor");
		System.out.println(ConsoleColors.YELLOW+"3."+ ConsoleColors.RESET+" Abogado");
		System.out.println(ConsoleColors.YELLOW+"4."+ ConsoleColors.RESET+" Ingeniero");
		System.out.println(ConsoleColors.YELLOW+"5."+ ConsoleColors.RESET+" Xaca Rana");
		System.out.println(ConsoleColors.YELLOW+"6."+ ConsoleColors.RESET+" Felipe");


		do
		{		
			System.out.println("Ingresa un número");
			centinela_ = ConsoleInput.getInt();
				switch(centinela_)
				{
				case 1:	System.out.println("Incorrecto");
						break;
				case 2: System.out.println("Correcto");
						break;
				case 3: System.out.println("Incorrecto");
						break;
				case 4: System.out.println("Incorrecto");
						break;
				case 5: System.out.println("Incorrecto");
						break;
				case 6: System.out.println("Correcto");
						break;
				default: System.out.println("Opcion no disponible");
						break;
				}
				bandera = false;
		}while(bandera);

		System.out.println("FIN DEL JUEGO");
		System.out.println("Tu puntuacion es: ");

	

		


		/*a = ConsoleInput.getString();

		b =	ConsoleInput.getString();
		c =	ConsoleInput.getString();
		d =	ConsoleInput.getString();*/

		

		//System.out.println(a); //
	}
	public static void instrucciones()
	{
		System.out.println("Estas son adivinanzas");
		
	}
	public static void acerca_de()
	{
		System.out.println("Los autores están perdidos");
		
	}
	public static int[] crearIndices(int total)
	{
		int indices[] = new int[total];
		int contador = 0;
		for (int i=0;i<indices.length;i++) {
			indices[i] = contador;
			contador+=20;		
		}
		return indices;

	}



	public static void menu()

	{
		int centinela = 0, opcion_bandera = 0;
		/*String banderas[] = ConsoleFile.read("info_banderas.csv");
		int indices[] = crearIndices(banderas.length/20);
		imprimirGraficoBandera(banderas, indices[18]);*/	
		
		
		boolean bandera;
		
		do
		{
			System.out.println();
			System.out.println(ConsoleColors.YELLOW+"  "+ " ___  _                 _       ");
			System.out.println(ConsoleColors.YELLOW+"  "+ "|  _|| | ___  ___  _ _ |_| ___  ___");
			System.out.println(ConsoleColors.YELLOW+"  "+ "|  _|| || .'|| . || | || ||   || . |");
			System.out.println(ConsoleColors.YELLOW+"  "+ "|  _|| || .'|| . || | || ||   || . |");
			System.out.println(ConsoleColors.YELLOW+"  "+ "|_|  |_||__,||_  ||_  ||_||_|_||_  |");
			System.out.println(ConsoleColors.YELLOW+"  "+ "             |___||___|        |___|"+ConsoleColors.RESET);
			
			System.out.println("Escoja una opción");
			System.out.println(ConsoleColors.YELLOW+"1."+ConsoleColors.RESET+" Bandera con la que voy a jugar");
			System.out.println(ConsoleColors.YELLOW+"2."+ConsoleColors.RESET+" Instrucciones");
			System.out.println(ConsoleColors.YELLOW+"3."+ConsoleColors.RESET+" Acerca de");
			System.out.println(ConsoleColors.YELLOW+"4."+ConsoleColors.RESET+" Salir");
			System.out.println();
			System.out.println();
			System.out.println(ConsoleColors.YELLOW+" "+ConsoleColors.RESET+"Ingresa un numero");
			centinela = ConsoleInput.getInt();
			switch(centinela)
			
			{
				case 1:	System.out.println();
				 		jugar();
						break;
				case 2: System.out.println();
						instrucciones();
						break;
				case 3: System.out.println();
						acerca_de();
						break;
				case 4: System.out.println("Sayonara");
						break;
				default: System.out.println("Opcion no disponible");
						break;
			}
		     bandera = false;

		}while(bandera);
	}
	public static void main(String args[])
	{
		menu();
		

	}

}

