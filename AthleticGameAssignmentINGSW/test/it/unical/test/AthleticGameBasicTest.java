package it.unical.test;

import java.time.Instant;

import org.junit.*;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest
{
	private static AthleticGame game;
	
	@BeforeClass
	public static void init()
	{
		game = new AthleticGame("calcio");
	}
	
	@Test
	public void addArrivalTest()
	{
		game.addArrival("angiletto", Instant.now());
		Assert.assertEquals(1, game.getArrivals().size());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void getPartecipiantTimeTest()
	{
		game.getPartecipiantTime("Bacca");
	}
	
}
