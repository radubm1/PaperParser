// File generated by the BNF Converter (bnfc 2.9.5).

package lbnf.Absyn;

public class MNonempty extends MinimumSize {
	public MNonempty() {
	}

	public <R, A> R accept(lbnf.Absyn.MinimumSize.Visitor<R, A> v, A arg) {
		return v.visit(this, arg);
	}

	public boolean equals(java.lang.Object o) {
		if (this == o)
			return true;
		if (o instanceof lbnf.Absyn.MNonempty) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		return 37;
	}

}
