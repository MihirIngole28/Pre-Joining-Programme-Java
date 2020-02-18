package test;
import project.Video;

import junit.framework.TestCase;

public class VideoJUnitTest extends TestCase {

	String name = "Test Name";
	int rating;
	Video video = new Video(name);
	
	public void testGetName() {
		assertEquals("Test Name",video.getName());
	}

	public void testDoCheckout() {
		video.doCheckout();
		assertTrue(video.getCheckout());
	}

	public void testDoReturn() {
		video.doReturn();
		assertFalse(video.getCheckout());
	}

	public void testReceiveRating() {
		assertEquals(rating,video.getRating());
	}

	public void testGetRating() {
		video.receiveRating(rating);
		assertEquals(rating, video.getRating());
	}

	public void testGetCheckout() {
		video.doCheckout();
		assertTrue(video.getCheckout());
		video.doReturn();
		assertFalse(video.getCheckout());
	}

}
