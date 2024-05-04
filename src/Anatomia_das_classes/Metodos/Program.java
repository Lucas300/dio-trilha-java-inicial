package Anatomia_das_classes.Metodos;

public class Program {

	public static void main(String[] args) {
		SmartTv smarttv = new SmartTv();
		
		System.out.println("Tv ligada: "+smarttv.ligada);
		System.out.println("Tv canal: "+smarttv.canal);
		System.out.println("Tv Volume: "+smarttv.volume);
		System.out.println();
		
		
		smarttv.ligar();
		System.out.println("Tv ligada: "+smarttv.ligada);

		
		smarttv.passarCanal();
		smarttv.passarCanal();
		smarttv.passarCanal();
		System.out.println("Tv canal: "+smarttv.canal);
		
		smarttv.aumentarVolume();
		smarttv.aumentarVolume();
		smarttv.aumentarVolume();
		System.out.println("Tv Volume: "+smarttv.volume);

	}

}
