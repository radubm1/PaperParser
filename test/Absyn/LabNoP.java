// File generated by the BNF Converter (bnfc 2.9.5).

package lbnf.Absyn;

public class LabNoP extends Label {
	public final LabelId labelid_;

	public LabNoP(LabelId p1) {
		labelid_ = p1;
	}

	public <R, A> R accept(lbnf.Absyn.Label.Visitor<R, A> v, A arg) {
		return v.visit(this, arg);
	}

	public boolean equals(java.lang.Object o) {
		if (this == o)
			return true;
		if (o instanceof lbnf.Absyn.LabNoP) {
			lbnf.Absyn.LabNoP x = (lbnf.Absyn.LabNoP) o;
			return this.labelid_.equals(x.labelid_);
		}
		return false;
	}

	public int hashCode() {
		return this.labelid_.hashCode();
	}

}
