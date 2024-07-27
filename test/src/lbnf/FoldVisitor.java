// File generated by the BNF Converter (bnfc 2.9.5).

package lbnf;

/** Fold Visitor */
public abstract class FoldVisitor<R, A> implements AllVisitor<R, A> {
	public abstract R leaf(A arg);

	public abstract R combine(R x, R y, A arg);

	/* Grammar */
	public R visit(lbnf.Absyn.MkGrammar p, A arg) {
		R r = leaf(arg);
		for (lbnf.Absyn.Def x : p.listdef_) {
			r = combine(x.accept(this, arg), r, arg);
		}
		return r;
	}

	/* Def */
	public R visit(lbnf.Absyn.Rule p, A arg) {
		R r = leaf(arg);
		r = combine(p.label_.accept(this, arg), r, arg);
		r = combine(p.cat_.accept(this, arg), r, arg);
		for (lbnf.Absyn.Item x : p.listitem_) {
			r = combine(x.accept(this, arg), r, arg);
		}
		return r;
	}

	public R visit(lbnf.Absyn.Comment p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.Comments p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.Internal p, A arg) {
		R r = leaf(arg);
		r = combine(p.label_.accept(this, arg), r, arg);
		r = combine(p.cat_.accept(this, arg), r, arg);
		for (lbnf.Absyn.Item x : p.listitem_) {
			r = combine(x.accept(this, arg), r, arg);
		}
		return r;
	}

	public R visit(lbnf.Absyn.Token p, A arg) {
		R r = leaf(arg);
		r = combine(p.reg_.accept(this, arg), r, arg);
		return r;
	}

	public R visit(lbnf.Absyn.PosToken p, A arg) {
		R r = leaf(arg);
		r = combine(p.reg_.accept(this, arg), r, arg);
		return r;
	}

	public R visit(lbnf.Absyn.Entryp p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.Separator p, A arg) {
		R r = leaf(arg);
		r = combine(p.minimumsize_.accept(this, arg), r, arg);
		r = combine(p.cat_.accept(this, arg), r, arg);
		return r;
	}

	public R visit(lbnf.Absyn.Terminator p, A arg) {
		R r = leaf(arg);
		r = combine(p.minimumsize_.accept(this, arg), r, arg);
		r = combine(p.cat_.accept(this, arg), r, arg);
		return r;
	}

	public R visit(lbnf.Absyn.Coercions p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.Rules p, A arg) {
		R r = leaf(arg);
		for (lbnf.Absyn.RHS x : p.listrhs_) {
			r = combine(x.accept(this, arg), r, arg);
		}
		return r;
	}

	public R visit(lbnf.Absyn.Layout p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.LayoutStop p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.LayoutTop p, A arg) {
		R r = leaf(arg);
		return r;
	}

	/* Item */
	public R visit(lbnf.Absyn.Terminal p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.NTerminal p, A arg) {
		R r = leaf(arg);
		r = combine(p.cat_.accept(this, arg), r, arg);
		return r;
	}

	/* Cat */
	public R visit(lbnf.Absyn.ListCat p, A arg) {
		R r = leaf(arg);
		r = combine(p.cat_.accept(this, arg), r, arg);
		return r;
	}

	public R visit(lbnf.Absyn.IdCat p, A arg) {
		R r = leaf(arg);
		return r;
	}

	/* Label */
	public R visit(lbnf.Absyn.LabNoP p, A arg) {
		R r = leaf(arg);
		r = combine(p.labelid_.accept(this, arg), r, arg);
		return r;
	}

	public R visit(lbnf.Absyn.LabP p, A arg) {
		R r = leaf(arg);
		r = combine(p.labelid_.accept(this, arg), r, arg);
		for (lbnf.Absyn.ProfItem x : p.listprofitem_) {
			r = combine(x.accept(this, arg), r, arg);
		}
		return r;
	}

	public R visit(lbnf.Absyn.LabPF p, A arg) {
		R r = leaf(arg);
		r = combine(p.labelid_1.accept(this, arg), r, arg);
		r = combine(p.labelid_2.accept(this, arg), r, arg);
		for (lbnf.Absyn.ProfItem x : p.listprofitem_) {
			r = combine(x.accept(this, arg), r, arg);
		}
		return r;
	}

	public R visit(lbnf.Absyn.LabF p, A arg) {
		R r = leaf(arg);
		r = combine(p.labelid_1.accept(this, arg), r, arg);
		r = combine(p.labelid_2.accept(this, arg), r, arg);
		return r;
	}

	/* LabelId */
	public R visit(lbnf.Absyn.Id p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.Wild p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.ListE p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.ListCons p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.ListOne p, A arg) {
		R r = leaf(arg);
		return r;
	}

	/* ProfItem */
	public R visit(lbnf.Absyn.ProfIt p, A arg) {
		R r = leaf(arg);
		for (lbnf.Absyn.IntList x : p.listintlist_) {
			r = combine(x.accept(this, arg), r, arg);
		}
		return r;
	}

	/* IntList */
	public R visit(lbnf.Absyn.Ints p, A arg) {
		R r = leaf(arg);
		return r;
	}

	/* RHS */
	public R visit(lbnf.Absyn.MkRHS p, A arg) {
		R r = leaf(arg);
		for (lbnf.Absyn.Item x : p.listitem_) {
			r = combine(x.accept(this, arg), r, arg);
		}
		return r;
	}

	/* MinimumSize */
	public R visit(lbnf.Absyn.MNonempty p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.MEmpty p, A arg) {
		R r = leaf(arg);
		return r;
	}

	/* Reg */
	public R visit(lbnf.Absyn.RSeq p, A arg) {
		R r = leaf(arg);
		r = combine(p.reg_1.accept(this, arg), r, arg);
		r = combine(p.reg_2.accept(this, arg), r, arg);
		return r;
	}

	public R visit(lbnf.Absyn.RAlt p, A arg) {
		R r = leaf(arg);
		r = combine(p.reg_1.accept(this, arg), r, arg);
		r = combine(p.reg_2.accept(this, arg), r, arg);
		return r;
	}

	public R visit(lbnf.Absyn.RMinus p, A arg) {
		R r = leaf(arg);
		r = combine(p.reg_1.accept(this, arg), r, arg);
		r = combine(p.reg_2.accept(this, arg), r, arg);
		return r;
	}

	public R visit(lbnf.Absyn.RStar p, A arg) {
		R r = leaf(arg);
		r = combine(p.reg_.accept(this, arg), r, arg);
		return r;
	}

	public R visit(lbnf.Absyn.RPlus p, A arg) {
		R r = leaf(arg);
		r = combine(p.reg_.accept(this, arg), r, arg);
		return r;
	}

	public R visit(lbnf.Absyn.ROpt p, A arg) {
		R r = leaf(arg);
		r = combine(p.reg_.accept(this, arg), r, arg);
		return r;
	}

	public R visit(lbnf.Absyn.REps p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.RChar p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.RAlts p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.RSeqs p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.RDigit p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.RLetter p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.RUpper p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.RLower p, A arg) {
		R r = leaf(arg);
		return r;
	}

	public R visit(lbnf.Absyn.RAny p, A arg) {
		R r = leaf(arg);
		return r;
	}

}