package CircularShifting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImatgeTest
{
	Imatge img;

	@BeforeEach
	void setUp() throws Exception
	{
		img = new Imatge();
				
		img.CreaImatge(2, 2);
		
		img.setValue(0, 0, 0);
		img.setValue(0, 1, 1);
		img.setValue(1, 0, 2);
		img.setValue(1, 1, 3);
		
	}

	@Test
	void testConstructoriCrearImatge()
	{		
		assertEquals(img.getValue(0, 0),0);
		assertEquals(img.getValue(0, 1),1);
		assertEquals(img.getValue(1, 0),2);
		assertEquals(img.getValue(1, 1),3);
	}

}
