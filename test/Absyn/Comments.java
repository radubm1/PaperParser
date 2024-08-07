// File generated by the BNF Converter (bnfc 2.9.5).

package lbnf.Absyn;

public class Comments extends Def {
	public final String string_1, string_2;

	public Comments(String p1, String p2) {
		string_1 = p1;
		string_2 = p2;
	}

	public <R, A> R accept(lbnf.Absyn.Def.Visitor<R, A> v, A arg) {
		return v.visit(this, arg);
	}

	public boolean equals(java.lang.Object o) {
		if (this == o)
			return true;
		if (o instanceof lbnf.Absyn.Comments) {
			lbnf.Absyn.Comments x = (lbnf.Absyn.Comments) o;
			return this.string_1.equals(x.string_1) && this.string_2.equals(x.string_2);
		}
		return false;
	}

	public int hashCode() {
		return 37 * (this.string_1.hashCode()) + this.string_2.hashCode();
	}

}
