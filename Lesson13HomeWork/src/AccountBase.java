import java.util.*;

public class AccountBase<K, V> extends HashMap<K, V> {

    Map<V, K> reverseAccountBase = new HashMap<>();

    @Override
    public V put(K key, V value) {
        reverseAccountBase.put(value, key);
        if (containsKey(key)){
            //AccountBase.merge();
        }
        return super.put(key, value);
    }


    public K getKeys(V value) {

        return reverseAccountBase.get(value);
    }
}

