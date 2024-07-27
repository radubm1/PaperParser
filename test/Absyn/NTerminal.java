// File generated by the BNF Converter (bnfc 2.9.5).

package lbnf.Absyn;

public class NTerminal extends Item {
	public final Cat cat_;

	public NTerminal(Cat p1) {
		cat_ = p1;
	}

	public <R, A> R accept(lbnf.Absyn.Item.Visitor<R, A> v, A arg) {
		return v.visit(this, arg);
	}

	public boolean equals(java.lang.Object o) {
		if (this == o)
			return true;
		if (o instanceof lbnf.Absyn.NTerminal) {
			lbnf.Absyn.NTerminal x = (lbnf.Absyn.NTerminal) o;
			return this.cat_.equals(x.cat_);
		}
		return false;
	}

	public int hashCode() {
		return this.cat_.hashCode();
	}

}