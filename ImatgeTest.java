package CircularShifting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImatgeTest
{
	Imatge img, imgGran;
	

	@BeforeEach
	void setUp() throws Exception
	{
		img = new Imatge();
				
		img.CreaImatge(2, 2);
		
		img.setValue(0, 0, 0);
		img.setValue(0, 1, 1);
		img.setValue(1, 0, 2);
		img.setValue(1, 1, 3);

		// Creem i inicialitzem una imatge gran amb valors 0
		imgGran = new Imatge();
		
		imgGran.CreaImatge(3, 3);

		for(int i=0;i<3;++i)
		{
			for(int j=0;j<3;++j)
			{
				imgGran.setValue(i, j, 0);
			}
		}
		
	}

	@Test
	void testConstructoriCrearImatge()
	{		
		assertEquals(img.getValue(0, 0),0,1.e-3);
		assertEquals(img.getValue(0, 1),1,1.e-3);
		assertEquals(img.getValue(1, 0),2,1.e-3);
		assertEquals(img.getValue(1, 1),3,1.e-3);
	}

	@Test
	void testCircularShifting()
	{		

		// Copiarem una imatge dins una imatge gran, amb desplaçament zero
		
		float [] values = {	0,1,0,
							2,3,0,
							0,0,0};
		
		imgGran.CircularShifting(img, 0, 0);
		
		for(int i=0;i<3;++i)
		{
			for(int j=0;j<3;++j)
			{
				assertEquals(imgGran.getValue(i, j),values[i*3+j],1.e-3);
			}
		}

		// Copiarem una imatge dins una imatge gran, amb desplaçament incr_x=0, incr_y=1
		
		// Inicialitzem imgGran a zero
		for(int i=0;i<3;++i)
		{
			for(int j=0;j<3;++j)
			{
				imgGran.setValue(i, j, 0);
			}
		}

		
		float [] values_0_1 = {	0,0,0,
								0,1,0,
								2,3,0};
		
		imgGran.CircularShifting(img, 0, 1);
		
		for(int i=0;i<3;++i)
		{
			for(int j=0;j<3;++j)
			{
				assertEquals(imgGran.getValue(i, j),values_0_1[i*3+j],1.e-3);
			}
		}
	
		// Copiarem una imatge dins una imatge gran, amb desplaçament incr_x=1, incr_y=1
		
		// Inicialitzem imgGran a zero
		for(int i=0;i<3;++i)
		{
			for(int j=0;j<3;++j)
			{
				imgGran.setValue(i, j, 0);
			}
		}

		
		float [] values_1_1 = {	0,0,0,
								0,0,1,
								0,2,3};
		
		imgGran.CircularShifting(img, 1, 1);
		
		for(int i=0;i<3;++i)
		{
			for(int j=0;j<3;++j)
			{
				assertEquals(imgGran.getValue(i, j),values_1_1[i*3+j],1.e-3);
			}
		}

		// Copiarem una imatge dins una imatge gran, amb desplaçament incr_x=2, incr_y=1
		
		// Inicialitzem imgGran a zero
		for(int i=0;i<3;++i)
		{
			for(int j=0;j<3;++j)
			{
				imgGran.setValue(i, j, 0);
			}
		}

		
		float [] values_2_1 = {	0,0,0,
								1,0,0,
								3,0,2};
		
		imgGran.CircularShifting(img, 2, 1);
		
		for(int i=0;i<3;++i)
		{
			for(int j=0;j<3;++j)
			{
				assertEquals(imgGran.getValue(i, j),values_2_1[i*3+j],1.e-3);
			}
		}
		
		
	}

}
