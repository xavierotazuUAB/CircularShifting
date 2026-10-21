package CircularShifting;

public class Imatge
{
	private int nFiles, nColumnes;
	private float valors[];
	
	public Imatge();
	public void CreaImatge(int nfiles, int ncolumnes);
	
	public int getNFiles();	
	public int getNCols();
	
	public float getValue(int fila, int col);
	public void setValue(int fila, int col, float value);

	public void CircularShifting(Imatge ImgInput, int incr_x, int incr_y);
	
}
