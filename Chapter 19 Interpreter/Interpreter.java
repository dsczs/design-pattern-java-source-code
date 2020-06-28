public abstract class AbstractExpression {
    public abstract void interpret(Context ctx);
}

public class TerminalExpression extends AbstractExpression {
    public void interpret(Context ctx) {
        //�����ս�����ʽ�Ľ��Ͳ���
    }
}

public class NonterminalExpression extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public NonterminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    public void interpret(Context ctx) {
        //�ݹ����ÿһ����ɲ��ֵ�interpret()����
        //�ڵݹ����ʱָ����ɲ��ֵ����ӷ�ʽ�������ս���Ĺ���
    }
}