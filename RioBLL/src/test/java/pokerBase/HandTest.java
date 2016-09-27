package pokerBase;

import static org.junit.Assert.*;

import java.util.ArrayList;
import pokerBase.Card;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class HandTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void TestRoyalFlush() {	
			Hand h = new Hand();
			ArrayList<Card> RoyalFlush = new ArrayList<Card>();
			RoyalFlush.add(new Card(10,1));
			RoyalFlush.add(new Card(11,1));
			RoyalFlush.add(new Card(12,1));
			RoyalFlush.add(new Card(13,1));
			RoyalFlush.add(new Card(14,1));

			

			
	}

	@Test
	public void TestFourOfAKind() {	
		Hand h = new Hand();
		ArrayList<Card> FourofAKind = new ArrayList<Card>();
		FourofAKind.add(new Card(10,1));
		FourofAKind.add(new Card(11,1));
		FourofAKind.add(new Card(12,1));
		FourofAKind.add(new Card(13,1));
		FourofAKind.add(new Card(14,1));}

	@Test
	public void TestStraightFlush() {	
		Hand h = new Hand();
		ArrayList<Card> StraightFlush = new ArrayList<Card>();
		StraightFlush.add(new Card(10,1));
		StraightFlush.add(new Card(11,1));
		StraightFlush.add(new Card(12,1));
		StraightFlush.add(new Card(13,1));
		StraightFlush.add(new Card(14,1));}
	
}
