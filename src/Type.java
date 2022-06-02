public abstract class Type implements IType {

    protected String type = this.getClass().getSimpleName();

    @Override
    public String getType() {
        return type;
    }
}
