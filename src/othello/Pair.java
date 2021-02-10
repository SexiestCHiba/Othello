package othello;

/**
 * tuple containing 2 unknown type elements
 *
 * @param <U> left
 * @param <K> right
 */
public class Pair<U, K> {

    private final U left;
    private final K right;

    public Pair(U left, K right) {
        this.left = left;
        this.right = right;
    }

    public U getLeft() {
        return left;
    }

    public K getRight() {
        return right;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pair<?, ?> other = (Pair<?, ?>) obj;
        return this.left.equals(other.getLeft()) && this.left.equals(other.getRight());
    }

    @Override
    public int hashCode() {
        return 31 + left.hashCode() * right.hashCode();
    }
    
    @Override
    public String toString() {
    	return "(" + left + ", " + right + ")";
    }
}
