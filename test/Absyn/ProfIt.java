// File generated by the BNF Converter (bnfc 2.9.5).

package lbnf.Absyn;

public class ProfIt extends ProfItem {
	public final ListIntList listintlist_;
	public final ListInteger listinteger_;

	public ProfIt(ListIntList p1, ListInteger p2) {
		listintlist_ = p1;
		listinteger_ = p2;
	}

	public <R, A> R accept(lbnf.Absyn.ProfItem.Visitor<R, A> v, A arg) {
		return v.visit(this, arg);
	}

	public boolean equals(java.lang.Object o) {
		if (this == o)
			return true;
		if (o instanceof lbnf.Absyn.ProfIt) {
			lbnf.Absyn.ProfIt x = (lbnf.Absyn.ProfIt) o;
			return this.listintlist_.equals(x.listintlist_) && this.listinteger_.equals(x.listinteger_);
		}
		return false;
	}

	public int hashCode() {
		return 37 * (this.listintlist_.hashCode()) + this.listinteger_.hashCode();
	}

}