package Interest;
public class CompoundInterest{
	public float findCompoundInterest(float principal,int time,int rate,int times)
{	
float amount=principal*math.pow(1+rate/times),times*time);
float compoundinterest=amount-principal;
return compoundinterest;
}
}