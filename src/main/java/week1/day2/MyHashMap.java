package week1.day2;

import java.util.Map;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Home on 27.08.2015.
 */
public class MyHashMap<K, V> implements Map<K, V> {

    public static final int DEFAULT_CAPACITY = 16;
    public static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private Bucket<K, V>[] buckets;
    private int size;
    private float loadFactor;

    public MyHashMap() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    public MyHashMap(int capacity) {
        this(capacity, DEFAULT_LOAD_FACTOR);
    }

    public MyHashMap(int capacity, float loadFactor) {
        buckets = ((Bucket<K, V>[]) new Bucket[capacity]);
        this.loadFactor = loadFactor;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        Objects.requireNonNull(key);
        if (isEmpty()) {
            return null;
        }
        Bucket<K, V> bucket = getBucket(key);
        return bucket == null ? null : bucket.value;
    }

    @Override
    public V put(K key, V value) {
        Objects.requireNonNull(key);
        int hash = key.hashCode();
        int index = hash % buckets.length;

        for (Bucket<K, V> bucket = buckets[index]; bucket != null; bucket = bucket.next) {
            if (bucket.hash == hash && bucket.key.equals(key)) {
                bucket.value = value;
                return value;
            }
        }

        addBucket(key, value, hash, index);
        return value;
    }

    private void addBucket(K key, V value, int hash, int index) {
//    TODO: check loadFactor
        Bucket<K, V> bucket = Bucket.newBucket(hash, key, value, buckets[index]);
        bucket.next = buckets[index];// без этой строчки идет перезапись и не сохраняються предидущие бакеты
        buckets[index] = bucket;
        size++;
    }

    private Bucket<K, V> getBucket(Object key) {
        if (size == 0) {
            return null;
        }
        int hash = key == null ? 0 : key.hashCode();
        int index = hash % buckets.length;
        for (Bucket<K, V> bucket = buckets[index]; bucket != null; bucket = bucket.next) {
            if (hash == bucket.hash && Objects.equals(key, bucket.getKey())) {
                return bucket;
            }
        }
        return null;
    }

    @Override
    public V remove(Object key) {
        Objects.requireNonNull(key);
        int index = key.hashCode() % buckets.length;

        if (isEmpty()) {
            return null;
        }
        else if (buckets[index] == null) {
            return null;
        }
        for (Bucket<K, V> bucket = buckets[index]; bucket != null; bucket = bucket.next) {

            if (key.hashCode() == bucket.hashCode() && Objects.equals(key, bucket.getKey())) {
                buckets[index] = bucket.next;
                size--;
                return buckets[index].value;
            }
        }
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {
        Arrays.fill(buckets, null);
        size = 0;
    }

    @Override
    public Set<K> keySet() {
        return Collections.emptySet();
    }

    @Override
    public Collection<V> values() {
        return Collections.emptyList();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return Collections.emptySet();
    }

    private static class Bucket<K, V> implements Map.Entry<K, V> {

        K key;
        V value;
        int hash;
        Bucket<K, V> next;

        private Bucket(int hash, K key, V value, Bucket<K, V> next) {
            this.key = key;
            this.value = value;
            this.hash = hash;
            this.next = next;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            return this.value = value;
        }

        static <K, V> Bucket<K, V> newBucket(int hash, K key, V value, Bucket<K, V> next) {
            return new Bucket<>(hash, key, value, next);
        }

    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] != null) {
                builder.append(" " + buckets[i].value.toString());
                if (buckets[i].next != null) {
                    for (Bucket<K, V> bucket = buckets[i].next; bucket != null; bucket = bucket.next) {
                        builder.append(" " + "(" + bucket.value.toString() + ")");
                    }
                }
            }
        }
        builder.append(" ]");
        return builder.toString();
    }

    public V removeR(K key) {
        Objects.requireNonNull(key);
        int index = key.hashCode() % buckets.length;

        if (isEmpty()) {
            return null;
        }
        else if (buckets[index] == null) {
            return null;
        }
        for (Bucket<K, V> bucket = buckets[index]; bucket != null; bucket = bucket.next) {

            if (key.hashCode() == bucket.hashCode() && key.equals(bucket.key)) {
                buckets[index] = bucket.next;
                size--;
                return buckets[index].value;
            }
        }
        return null;
    }
}
