// File generated by the BNF Converter (bnfc 2.9.5).

package lbnf.Absyn;

public class Layout extends Def {
	public final ListString liststring_;

	public Layout(ListString p1) {
		liststring_ = p1;
	}

	public <R, A> R accept(lbnf.Absyn.Def.Visitor<R, A> v, A arg) {
		return v.visit(this, arg);
	}

	public boolean equals(java.lang.Object o) {
		if (this == o)
			return true;
		if (o instanceof lbnf.Absyn.Layout) {
			lbnf.Absyn.Layout x = (lbnf.Absyn.Layout) o;
			return this.liststring_.equals(x.liststring_);
		}
		return false;
	}

	public int hashCode() {
		return this.liststring_.hashCode();
	}

}