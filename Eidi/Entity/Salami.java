package Entity;
public class Salami
{
private String Name;
private String Relation;
private String Festival;
private int Amount;
private int TotalAmount;

    public Salami(String Name, String Relation,String Festival,int Amount,int TotalAmout)
    {
        this.Name = Name;
        this.Relation = Relation;
        this.Festival = Festival;
        this.Amount = Amount;
        this.TotalAmount = TotalAmount;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }
    public String getName()
    {
        return Name;
    }
    public void setRelation(String Relation)
    {
        this.Relation = Relation;
    }
    public String getRelation()
    {
        return Relation;
    }
    public void setAmount(int Amount)
    {
        this.Amount = Amount;
    }
    public int getAmount()
    {
        return Amount;
    }

    public void setFestival(String Festival)
    {
        this.Festival = Festival;
    }
    public String getFestival()
    {
        return Festival;
    }

    public int CalculateTotalAmount()
    {
        TotalAmount = TotalAmount+Amount;
        return TotalAmount;    
    }


}