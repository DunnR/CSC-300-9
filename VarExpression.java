
public class VarExpression extends Expression
{
	private String varName;
	
	public VarExpression(String varName)
	{
		this.varName = varName;
	}

	public String getVarName() {
		return varName;
	}
	
}
