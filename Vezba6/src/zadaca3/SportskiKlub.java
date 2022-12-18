package zadaca3;

public class SportskiKlub implements Comparable<SportskiKlub> {
	private String imeNaKlub;
	private String sport;
	private int brojNaClenovi;
	
	public String getImeNaKlub ()
	{
		return imeNaKlub;
	}
	public String getSport ()
	{
		return sport;
	}
	public int getBrojNaClenovi ()
	{
		return brojNaClenovi;
	}
	public void setImeNaKlub (String ime)
	{
		this.imeNaKlub = ime;
	}
	public void setSport (String sport)
	{
		this.sport = sport;
	}
	public void setBrojNaClenovi (int clenovi)
	{
		this.brojNaClenovi = clenovi;
	}
	public SportskiKlub (String ime, String sport, int clenovi)
	{
		this.imeNaKlub = ime;
		this.brojNaClenovi = clenovi;
		this.sport = sport;		
	}

	public int compareTo(SportskiKlub obj) {
		SportskiKlub a = (SportskiKlub) obj;
		if (this.imeNaKlub.equals(a.imeNaKlub))
		return 0;
		else
			return this.imeNaKlub.compareTo(a.imeNaKlub);
	}


}
