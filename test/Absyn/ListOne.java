// File generated by the BNF Converter (bnfc 2.9.5).

package lbnf.Absyn;

public class ListOne extends LabelId {
	public ListOne() {
	}

	public <R, A> R accept(lbnf.Absyn.LabelId.Visitor<R, A> v, A arg) {
		return v.visit(this, arg);
	}

	public boolean equals(java.lang.Object o) {
		if (this == o)
			return true;
		if (o instanceof lbnf.Absyn.ListOne) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		return 37;
	}

}
