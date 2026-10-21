package CircularShifting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImatgeTest
{

	@Test
	void testConstructoriCrearImatge()
	{
		Imatge img = new Imatge();
				
		img.CreaImatge(2, 2);
		
		img.setValue(0, 0, 0);
		img.setValue(0, 1, 1);
		img.setValue(1, 0, 2);
		img.setValue(1, 1, 3);
		
		assertEquals(img.getValue(0, 0),0);
		assertEquals(img.getValue(0, 1),1);
		assertEquals(img.getValue(1, 0),2);
		assertEquals(img.getValue(1, 1),3);
	}

}
