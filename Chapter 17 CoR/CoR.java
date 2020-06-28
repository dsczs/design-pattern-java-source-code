public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(String request);
}

public class ConcreteHandler extends Handler {
    public void handleRequest(String request) {
        if (����request��������)
        {
			......  //��������
        }
		else
        {
            this.successor.handleRequest(request); //ת������
        }
    }
}