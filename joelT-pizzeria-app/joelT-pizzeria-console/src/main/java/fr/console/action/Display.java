package fr.console.action;

import fr.exception.ListException;
import fr.ihm.action.Action;
import fr.ihm.action.IhmUtil;

/*
 * Classe nommée {Display} qui hérite de la classe {Action} qui est une classe Abstraite permettant l'appel du doAction. 
 * Ici l'action est d'afficher la liste d'objet pizza
 */
public class Display extends Action {
	private IhmUtil ihmUtil;

	public Display(IhmUtil ihmUtil) {
		super();
		this.ihmUtil = ihmUtil;
		this.setDescription("Afficher la liste de Pizza");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.console.action.Action#doAction()
	 */
	@Override
	public void doAction() {
		try {
			ihmUtil.getPizzaDao().findall();
		} catch (ListException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void descriptionAction() {
	}

}
