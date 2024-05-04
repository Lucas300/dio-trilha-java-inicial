/**
 * @author Lucas Daniel
 * @version 0.1
 * @since 04/05/2024
 * 
 * */

package Anatomia_das_classes.Metodos;

public class SmartTv {
	/**
	 * @param canalEscolhido este é o parâmetro do metodo escolherCanal()
	 * @return  se tivesse teria que passar suas informações
	 * 
	 * */

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
		public void escolherCanal(int canalEscolhido) {
			canal = canalEscolhido;
		}
		public void aumentarVolume() {
			volume++;
		}
		public void abaixarVolume() {
			volume--;
		}

	}
