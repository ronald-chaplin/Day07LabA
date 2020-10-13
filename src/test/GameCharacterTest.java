package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.GameCharacter;

@DisplayName("Game Character Testing")
class GameCharacterTest {
	
	GameCharacter generic;
	GameCharacter.Warrior warrior;
	GameCharacter.Cleric cleric;
	
	@BeforeEach
	void init() {
		generic = new GameCharacter("Billiam");
		warrior = generic.new Warrior("Sally");
		cleric = generic.new Cleric("Bimmy");
	}

	@Test
	void testGetHealth() {
		int expected = 10;
		assertEquals(expected, generic.getHealth(), "Health should be 10");
	}
	
	@Test
	void testSetHealth() {
		int expected = 25;
		
		generic.setHealth(expected);
		
		assertEquals(expected, generic.getHealth(), "Health should 25");
	}
	
	@Test
	void testGetStrength() {
		int expected = 10;
		assertEquals(expected, generic.getStrength(), "Strength should be 10");
	}
	
	@Test
	void testSetStrength() {
		int expected = 75;
		
		generic.setStrength(expected);
		
		assertEquals(expected, generic.getStrength(), "Strength should be 75");
	}
	
	@Test
	void testGetName() {
		String expected = "Billiam";
		
		assertEquals(expected, generic.getName(), "Should be Billiam");
	}
	
	@Test
	void testSetName() {
		String expected = "Richard";
		generic.setName(expected);
		
		assertEquals(expected, generic.getName(), "Should be Richard");
	}
	
	@Test
	void testGetCharacterClass() {
		String expected = "Warrior";
		assertEquals(expected, warrior.getCharacterClass(), "Should be Warrior");
	}
	
	@Test
	void testSetCharacterClass() {
		String expected = "Slacker";
		generic.setCharacterClass(expected);
		assertEquals(expected, generic.getCharacterClass(), "Should be Slacker");
	}
	
	@Test
	void testWarriorAction() {
		String expected = "Sally attacks!";
		
		assertEquals(expected, warrior.action(), "Warrior should attack.");
		
	}
	
	@Test
	void testWarriorSetAction() {
		String expected = "Sally screams!";
		warrior.setAction("screams");
		assertEquals(expected, warrior.action(), "Warrior should scream.");
	}
	
	@Test
	void testClericAction() {
		String expected = "Bimmy heals!";
		assertEquals(expected, cleric.action(), "Cleric should heal.");
	}
	
	@Test
	void testClericSetAction() {
		String expected = "Bimmy farts!";
		cleric.setAction("farts");
		assertEquals(expected, cleric.action(), "Cleric should fart.");
	}
	
	@Test
	void testToString() {
		String expected = "Billiam the generic has 10 health and 10 strength!";
		
		assertEquals(expected, generic.toString(), "Generic Character");		
	}

}
