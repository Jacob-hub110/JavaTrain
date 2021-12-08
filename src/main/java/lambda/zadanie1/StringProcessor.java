package lambda.zadanie1;

public class StringProcessor {

    private StringOperation stringOperation;

    public StringProcessor(StringOperation stringOperation) {
        this.stringOperation = stringOperation;
    }

    public String process(String input){
        return this.stringOperation.operation(input);
    }

    public void setStringOperation(StringOperation stringOperation) {
        this.stringOperation = stringOperation;
    }
}
