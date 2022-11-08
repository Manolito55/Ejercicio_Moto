import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Moto moto1 = new Moto("Kawasaki","Ninja 400","AAA111",0,0,false);
		
		Conductor conductor = new Conductor("Manolo",19,12345678,88888888,0);
		
		Piloto piloto = new Piloto("Manolito",21,12345679,88888888,0,001);		
		
		boolean onoff;
		
		
		while (onoff=true) {
			
			System.out.println("Bienvenido al Ejercicio de la Moto ");
			
			ImprimirMenuPrincipal(moto1,conductor,piloto);
			
		}
		
		
		
		//IDEAS SIN AGREGAR:
		//Menu Interactivo JOP, Detector de Tipo de Variable(Evitar seleccion conductor), Ingreso de Datos por interfaz 
		//Finalizacion de metodos con ShowMessageDialog (Para pausar mas las acciones del Usuario y no sobreinformarlo)
		//Separacion Conductor y Piloto mediante codigo rearmado
	}
	
	
	// Seccion de los Metodos
	
	public static void CheckEstado(Moto moto1) {
		
		if (moto1.isEstado_moto()) {
			
			System.out.println("La moto esta encendida");
			
		} else {
			
			System.out.println("La moto esta apagada");
			
		}
		
	}

	public static void EncenderMoto(Moto moto1) {
		
		if (moto1.isEstado_moto()) {
			
			System.out.println("La moto ya esta encendida, no necesita encenderse nuevamente");
			
		} else {
			
			moto1.setEstado_moto(true);
			System.out.println("La moto fue encendida exitosamente");
			
		}
		
	}
	
	public static void CheckCombustible(Moto moto1) {
		
		if (moto1.getCombustible()==0) {
			
			System.out.println("La moto no tiene combustible");
			
		} else {
			
			System.out.println("La moto tiene "+moto1.getCombustible()+" Litros de Combustible");

		}
		
	}
	
	public static void CargarCombustible(Moto moto1) {
		
		if (moto1.getCombustible()==0) {
			
			System.out.println("Cargando Combustible...");
			int a=(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de combustible que desea agregarle a la moto")));
			moto1.setCombustible(a);
			
			System.out.println("La moto ahora tiene "+moto1.getCombustible()+" Litros de Combustible");
			
		} else {
			
			System.out.println("No precisa cargar combustible");
			System.out.println("La moto tiene "+moto1.getCombustible()+" Litros de Combustible");

		}
		
	}
	
	public static void ConducirMotoConductor(Moto moto1,Conductor conductor) {
		
		if (moto1.isEstado_moto()==true) {
			System.out.println("CONDUCCION - motor OK");
			if (moto1.getCombustible()!=0) {
				System.out.println("CONDUCCION - combustible OK");
				System.out.println("Inicializando Conduccion");
				
				moto1.setKm_recorridos((int)(Math.random()*90)+11);
				System.out.println("Kilometros Recorridos: "+moto1.getKm_recorridos());
				
				conductor.setVel_conductor((int)(Math.random()*70)+31);
				System.out.println("Velocidad: "+conductor.getVel_conductor()+" kilometros por hora");
				
				System.out.println(conductor);
				
				
				
			} else {
				System.out.println("CONDUCCION - sin combustible - ERROR");
			}
			
		} else {
			System.out.println("CONDUCCION - motor apagado - ERROR");
		}
		
	}
	
	public static void ConducirMotoPiloto(Moto moto1,Piloto piloto) {
		
		if (moto1.isEstado_moto()==true) {
			System.out.println("CONDUCCION - motor OK");
			if (moto1.getCombustible()!=0) {
				System.out.println("CONDUCCION - combustible OK");
				System.out.println("Inicializando Conduccion");
				
				moto1.setKm_recorridos((int)(Math.random()*90)+11);
				System.out.println("Kilometros Recorridos: "+moto1.getKm_recorridos());
				
				piloto.setVel_piloto((int)(Math.random()*140)+31);
				System.out.println("Velocidad: "+piloto.getVel_piloto()+" kilometros por hora");
				
				System.out.println("La foto fue conducida por un Piloto");
				
				System.out.println(piloto);
				
				
				
			} else {
				System.out.println("CONDUCCION - sin combustible - ERROR");
			}
			
		} else {
			System.out.println("CONDUCCION - motor apagado - ERROR");
		}
		
	}
	
	
	
	//Metodos del Interfaz
	
	public static void ImprimirMenuPrincipal(Moto moto1, Conductor conductor, Piloto piloto) {
		Scanner entrada = new Scanner(System.in);

		
		System.out.println("----------------------------------------------------");
		System.out.println("Que desea hacer ahora? - Elija una opcion");
		System.out.println("1. Conducir la Moto");
		System.out.println("2. Revisar el estado de la moto ");
		System.out.println("3. Revisar la cantidad de combustible ");
		System.out.println("4. Encender la Moto");
		System.out.println("5. Recargar Combustible");
		System.out.println("6. Salir del Sistema");
		System.out.println("----------------------------------------------------");

		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1:
			SeleccionConductor(moto1,conductor,piloto); 
			break;
		case 2:
			CheckEstado(moto1);
			break;
		case 3:
			CheckCombustible(moto1);
			break;
		case 4:
			EncenderMoto(moto1);
			break;
		case 5:
			CargarCombustible(moto1);
			break;
		case 6:
			System.out.println("Finalizando Sistema...");
			System.exit(opcion);
			break;
		default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			ImprimirMenuPrincipal(moto1,conductor,piloto);
			break;
		}

	}
	
	 public static void SeleccionConductor(Moto moto1,Conductor conductor,Piloto piloto) {
		Scanner entrada = new Scanner(System.in);

		
		System.out.println("----------------------------------------------------");
		System.out.println("Quien quiere que maneje la moto?, Elija una de las opciones ");
		System.out.println("1. Utliizar un Conductor comun");
		System.out.println("2. Utilizar un Piloto de carreras ");
		System.out.println("3. Volver");
		System.out.println("----------------------------------------------------");

		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1:
			ConducirMotoConductor(moto1,conductor);
			break;
		case 2:
			ConducirMotoPiloto(moto1,piloto);
			break;
		case 3:
			ImprimirMenuPrincipal(moto1,conductor,piloto);
			break;
		default:
			System.out.println("Ingrese una opcion correcta");
			SeleccionConductor(moto1,conductor,piloto);
			break;
		}

	} 
}
