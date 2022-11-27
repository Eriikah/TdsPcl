package ast;


public interface AstVisitor<T> {

    public T visit(AndNode affect);

    public T visit(Ast affect);

    public T visit(Chr affect);

    public T visit(ChrInt affect);

    public T visit(Concat affect);

    public T visit(DiffNode affect);

    public T visit(Div affect);

    public T visit(EqNode affect);

    public T visit(Exit affect);

    public T visit(ExitIdf affect);

    public T visit(FieldDecl affect);

    public T visit(FieldElement affect);

    public T visit(For affect);

    public T visit(FuncDecl affect);

    public T visit(FuncDeclWithIdf affect);

    public T visit(Idf affect);

    public T visit(IfThen affect);

    public T visit(IfThenElse affect);

    public T visit(InfEqNode affect);

    public T visit(InfNode affect);

    public T visit(IntNode affect);

    public T visit(Minus affect);

    public T visit(Mult affect);

    public T visit(Not affect);

    public T visit(NotIdf affect);

    public T visit(Ord affect);

    public T visit(OrNode affect);

    public T visit(Plus affect);

    public T visit(Print affect);

    public T visit(PrintExpr affect);

    public T visit(Program affect);

    public T visit(Size affect);

    public T visit(StringNode affect);

    public T visit(SupEqNode affect);

    public T visit(SupNode affect);

    public T visit(TypeDecl affect);

    public T visit(VarDecl affect);

    public T visit(VarDeclWithIdf affect);

    public T visit(While affect);

}
