// File generated by the BNF Converter (bnfc 2.9.5).

package lbnf.Absyn;

public class Separator extends Def {
	public final MinimumSize minimumsize_;
	public final Cat cat_;
	public final String string_;

	public Separator(MinimumSize p1, Cat p2, String p3) {
		minimumsize_ = p1;
		cat_ = p2;
		string_ = p3;
	}

	public <R, A> R accept(lbnf.Absyn.Def.Visitor<R, A> v, A arg) {
		return v.visit(this, arg);
	}

	public boolean equals(java.lang.Object o) {
		if (this == o)
			return true;
		if (o instanceof lbnf.Absyn.Separator) {
			lbnf.Absyn.Separator x = (lbnf.Absyn.Separator) o;
			return this.minimumsize_.equals(x.minimumsize_) && this.cat_.equals(x.cat_)
					&& this.string_.equals(x.string_);
		}
		return false;
	}

	public int hashCode() {
		return 37 * (37 * (this.minimumsize_.hashCode()) + this.cat_.hashCode()) + this.string_.hashCode();
	}

}
