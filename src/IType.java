public interface IType {
    default String getType() {
        return this.getClass().getSimpleName();
    }
}
