
public class VarDefStatement extends Object
{
	private VarExpression theVarExpr;
	private MathExpression theMathExpr;
	
	public VarDefStatement(VarExpression theVarExpr, MathExpression theMathExpr)
	{
		this.theVarExpr = theVarExpr;
		this.theMathExpr = theMathExpr;
		System.out.printf("Rebuilt: %s", this);
		
	}
	
	public String toString()
	{
		return "" + theVarExpr.toString() + theMathExpr.toString();
	}
}
