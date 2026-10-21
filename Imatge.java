package CircularShifting;

public class Imatge
{
	private int nFiles, nColumnes;
	private float valors[];
	
	public Imatge()
	{
		nFiles=0; nColumnes=0;
		valors = new float [nFiles*nColumnes];
	}
	
	public void CreaImatge(int nfiles, int ncolumnes)
	{
		nFiles=nfiles; nColumnes=ncolumnes;
		valors = new float [nFiles*nColumnes];		
	}
	
	public int getNFiles() {return nFiles;};
	public int getNCols()  {return nColumnes;};
	
	public float getValue(int fila, int col)
	{
		return valors[fila*nColumnes + col];
	}
	
	public void setValue(int fila, int col, float value)
	{
		valors[fila*nColumnes + col] = value;
	}

	public void CircularShifting(Imatge img_input, int incr_x, int incr_y)
	{
		int nfil = img_input.getNFiles();
		int ncol = img_input.getNCols();
		
		for(int i=0;i<nfil;++i)
		{
			for(int j=0;j<ncol;++j)
			{
				valors[i*nFiles+j] = img_input.getValue(i,j); 
			}
		}
	}
	
}
