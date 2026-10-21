package CircularShifting;

public class Imatge
{
	private int nFiles, nColumnes;
	private float valors[];
	
	private void Invariant()
	{
		assert(nFiles>=0);
		assert(nColumnes>=0);
	}
	
	public Imatge()
	{
		nFiles=0; nColumnes=0;
		valors = new float [nFiles*nColumnes];

		// Postcondicio
		Invariant();
	}
	
	public void CreaImatge(int nfiles, int ncolumnes)
	{
		// Precondicio
		assert(nfiles>=0);
		assert(ncolumnes>=0);
		Invariant();

		
		nFiles=nfiles; nColumnes=ncolumnes;
		valors = new float [nFiles*nColumnes];		

		// Postcondicio
		Invariant();
	}
	
	public int getNFiles() {return nFiles;};
	public int getNCols()  {return nColumnes;};
	
	public float getValue(int fila, int col)
	{
		// Precondicio
		assert(fila>=0 && fila<nFiles);
		assert(col>=0 && fila<nColumnes);
		Invariant();

		return valors[fila*nColumnes + col];
	}
	
	public void setValue(int fila, int col, float value)
	{
		// Precondicio
		assert(fila>=0 && fila<nFiles);
		assert(col>=0 && fila<nColumnes);
		Invariant();

		valors[fila*nColumnes + col] = value;
	}

	public void CircularShifting(Imatge img_input, int incr_x, int incr_y)
	{
		// Precondicio
		assert(nFiles>=img_input.getNFiles());
		assert(nColumnes>=img_input.getNCols());
		Invariant();

		int nfil = img_input.getNFiles();
		int ncol = img_input.getNCols();
		
		for(int i=0;i<nfil;++i)
		{
			for(int j=0;j<ncol;++j)
			{
				int i_final = (i+incr_y) % nFiles;
				int j_final = (j+incr_x) % nColumnes;
				
				valors[i_final*nColumnes+j_final] = img_input.getValue(i,j); 
			}
		}
		
		// Postcondicions
		
		
		Invariant();
	}
	
}
