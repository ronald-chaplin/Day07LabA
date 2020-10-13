package main;

public class GameCharacter {
	
	int health;
	String name;
	String characterClass;
	int strength;
	
	public GameCharacter(){
		this.health = 0;
		this.name = "Undefined";
		this.characterClass = "generic";
		this.strength = 0;
	}
	
	public GameCharacter(String name) {
		this.health = 10;
		this.strength = 10;
		this.name = name;
		this.characterClass = "generic";
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharacterClass() {
		return characterClass;
	}

	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	@Override
	public String toString() {
		return name +" the " + characterClass + " has " + health 
				+ " health and " + strength + " strength!";
	}


	
	
	public class Warrior extends GameCharacter{
		
		String action;
		
		public Warrior (String n){
			super(n);
			health = 100;
			strength = 65;
			super.setCharacterClass("Warrior");
			action = "attacks";			
		}
		
		public String action() {
			return super.getName() + " " +  this.action + "!";
		}
		
		public void setAction(String a) {
			this.action = a;
		}
	}
	
	public class Cleric extends GameCharacter{
		
		String action;
		
		public Cleric (String n){
			super(n);
			health = 100;
			strength = 65;
			super.setCharacterClass("Cleric");
			action = "heals";			
		}
		
		public String action() {
			return super.getName() + " " +  this.action + "!";
		}
		
		public void setAction(String a) {
			this.action = a;
		}
	}

}
