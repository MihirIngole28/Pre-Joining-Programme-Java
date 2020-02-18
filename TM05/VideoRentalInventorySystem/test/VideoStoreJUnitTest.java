package test;
import project.*;
import junit.framework.TestCase;

public class VideoStoreJUnitTest extends TestCase {
	
	String name = "Matrix";
	VideoStore store = new VideoStore();
	int size=0, rating=9;
	Video lastAdded;

	public void testAddVideo() {
		store.addVideo(name);
		size = store.getStoreSize();
		lastAdded = store.getLastAdded();
		assertEquals(1,size);
		assertEquals(name, lastAdded.getName());
	}

	public void testDoCheckout() {
		store.addVideo(name);
		store.getLastAdded().doCheckout();
		assertTrue(store.getLastAdded().getCheckout());
	}

	public void testDoReturn() {
		store.addVideo(name);
		store.getLastAdded().doReturn();
		assertFalse(store.getLastAdded().getCheckout());
		
	}

	public void testReceiveRating() {
		store.addVideo(name);
		store.receiveRating(name, rating);
		lastAdded = store.getLastAdded();
		assertEquals(9, lastAdded.getRating());
		
	}

	public void testListInventory() {
		try {
			store.listInventory();
			assertFalse(false);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

}
