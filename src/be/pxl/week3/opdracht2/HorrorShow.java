package be.pxl.week3.opdracht2;

public class HorrorShow {

	public static void main(String[] args) {
		class Vampire implements Monster {

			@Override
			public void menace() {
				System.out.println("I'll drink your blood!");

			}

		}

		class Werewolf implements DangerousMonster {

			@Override
			public void menace() {
				System.out.println("I'll destroy you!");
			}

			@Override
			public void destroy(Monster monster) {
				monster.menace();
				this.menace();
				System.out.println("Big Fight!!!");
				System.out.printf("%s killed one %s\n", this.getClass().getSimpleName(), monster.getClass().getSimpleName());
				monster = null;
			}
		}
		
		Werewolf werewolf = new Werewolf();
		werewolf.destroy(new Vampire());
		werewolf.destroy(new Monster() {
			
			@Override
			public void menace() {
				System.out.println("You smell like wet dog!");
				
			}
		});

	}
}
