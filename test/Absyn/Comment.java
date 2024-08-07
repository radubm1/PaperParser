// File generated by the BNF Converter (bnfc 2.9.5).

package lbnf.Absyn;

public class Comment extends Def {
	public final String string_;

	public Comment(String p1) {
		string_ = p1;
	}

	public <R, A> R accept(lbnf.Absyn.Def.Visitor<R, A> v, A arg) {
		return v.visit(this, arg);
	}

	public boolean equals(java.lang.Object o) {
		if (this == o)
			return true;
		if (o instanceof lbnf.Absyn.Comment) {
			lbnf.Absyn.Comment x = (lbnf.Absyn.Comment) o;
			return this.string_.equals(x.string_);
		}
		return false;
	}

	public int hashCode() {
		return this.string_.hashCode();
	}

}
