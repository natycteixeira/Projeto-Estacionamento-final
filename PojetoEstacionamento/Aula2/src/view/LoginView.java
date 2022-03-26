package view;

import java.util.Scanner;
import model.Usuario;

public class LoginView {

	public void login () {
		
		Scanner leia = new Scanner (System.in);
				
		Usuario usuario = new Usuario();

		System.out.println("***LOGIN***\n-\n-");
		System.out.println("Informe o usuáio:");
		usuario.setLogin(leia.next());
		System.out.println("Informe a senha:");
		usuario.setSenha(leia.next());
		System.out.println("-\n-Logado com sucesso!");
		System.out.println("***    ***");
		
		MenuView menuview = new MenuView ();
		menuview.menu();
		
	}
}