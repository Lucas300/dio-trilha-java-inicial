package Anatomia_das_classes.Metodos;

public class SmartTv {

		boolean ligada = false;
		int canal = 1;
		int volume = 1;
		
		public void ligar() {
			ligada = true;
		}
		public void desligar(){
			ligada = false;
		}
		public void passarCanal() {
			canal++;
		}
		public void voltarCanal() {
			canal--;
		}
		public void aumentarVolume() {
			volume++;
		}
		public void abaixarVolume() {
			volume--;
		}

	}


