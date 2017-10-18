package it.unical.test;

import java.time.Instant;

import org.junit.*;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest 
{
	private static AthleticGame game;
	
	@BeforeClass
	public static void init()
	{
		game = new AthleticGame("calcio");
	}
	
	@After
	public void reset()
	{
		game.reset();
	}
	
	@Before
	public void start()
	{
		game.start();
	}
	
	@Test
	public void getWinnerTest()
	{
		game.addArrival("angilette", Instant.now().plusMillis(100));
		game.addArrival("o ci", Instant.now().plusMillis(500));
		game.addArrival("crusca", Instant.now().plusMillis(200));
		
		Assert.assertEquals("angilette", game.getWinner());
	}
	
	@Test
	public void getWinnersTest()
	{
		game.addArrival("angilette", Instant.now().plusMillis(100));
		game.addArrival("o ci", Instant.now().plusMillis(100));
		game.addArrival("crusca", Instant.now().plusMillis(200));
		
		Assert.assertEquals("angilette", game.getWinner());
	}
	
	
}
