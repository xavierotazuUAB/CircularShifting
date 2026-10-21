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

	public void CircularShifting(Imatge ImgInput, int incr_x, int incr_y);
	
}
