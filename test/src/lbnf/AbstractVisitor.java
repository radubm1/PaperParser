// File generated by the BNF Converter (bnfc 2.9.5).

package lbnf;

/** Abstract Visitor */

public class AbstractVisitor<R, A> implements AllVisitor<R, A> {
	/* Grammar */
	public R visit(lbnf.Absyn.MkGrammar p, A arg) {
		return visitDefault(p, arg);
	}

	public R visitDefault(lbnf.Absyn.Grammar p, A arg) {
		throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
	}

	/* Def */
	public R visit(lbnf.Absyn.Rule p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.Comment p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.Comments p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.Internal p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.Token p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.PosToken p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.Entryp p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.Separator p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.Terminator p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.Coercions p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.Rules p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.Layout p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.LayoutStop p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.LayoutTop p, A arg) {
		return visitDefault(p, arg);
	}

	public R visitDefault(lbnf.Absyn.Def p, A arg) {
		throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
	}

	/* Item */
	public R visit(lbnf.Absyn.Terminal p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.NTerminal p, A arg) {
		return visitDefault(p, arg);
	}

	public R visitDefault(lbnf.Absyn.Item p, A arg) {
		throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
	}

	/* Cat */
	public R visit(lbnf.Absyn.ListCat p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.IdCat p, A arg) {
		return visitDefault(p, arg);
	}

	public R visitDefault(lbnf.Absyn.Cat p, A arg) {
		throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
	}

	/* Label */
	public R visit(lbnf.Absyn.LabNoP p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.LabP p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.LabPF p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.LabF p, A arg) {
		return visitDefault(p, arg);
	}

	public R visitDefault(lbnf.Absyn.Label p, A arg) {
		throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
	}

	/* LabelId */
	public R visit(lbnf.Absyn.Id p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.Wild p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.ListE p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.ListCons p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.ListOne p, A arg) {
		return visitDefault(p, arg);
	}

	public R visitDefault(lbnf.Absyn.LabelId p, A arg) {
		throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
	}

	/* ProfItem */
	public R visit(lbnf.Absyn.ProfIt p, A arg) {
		return visitDefault(p, arg);
	}

	public R visitDefault(lbnf.Absyn.ProfItem p, A arg) {
		throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
	}

	/* IntList */
	public R visit(lbnf.Absyn.Ints p, A arg) {
		return visitDefault(p, arg);
	}

	public R visitDefault(lbnf.Absyn.IntList p, A arg) {
		throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
	}

	/* RHS */
	public R visit(lbnf.Absyn.MkRHS p, A arg) {
		return visitDefault(p, arg);
	}

	public R visitDefault(lbnf.Absyn.RHS p, A arg) {
		throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
	}

	/* MinimumSize */
	public R visit(lbnf.Absyn.MNonempty p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.MEmpty p, A arg) {
		return visitDefault(p, arg);
	}

	public R visitDefault(lbnf.Absyn.MinimumSize p, A arg) {
		throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
	}

	/* Reg */
	public R visit(lbnf.Absyn.RSeq p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.RAlt p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.RMinus p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.RStar p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.RPlus p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.ROpt p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.REps p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.RChar p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.RAlts p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.RSeqs p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.RDigit p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.RLetter p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.RUpper p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.RLower p, A arg) {
		return visitDefault(p, arg);
	}

	public R visit(lbnf.Absyn.RAny p, A arg) {
		return visitDefault(p, arg);
	}

	public R visitDefault(lbnf.Absyn.Reg p, A arg) {
		throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
	}

}