// File generated by the BNF Converter (bnfc 2.9.5).

package lbnf.Absyn;

public class RLower extends Reg {
	public RLower() {
	}

	public <R, A> R accept(lbnf.Absyn.Reg.Visitor<R, A> v, A arg) {
		return v.visit(this, arg);
	}

	public boolean equals(java.lang.Object o) {
		if (this == o)
			return true;
		if (o instanceof lbnf.Absyn.RLower) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		return 37;
	}

}
