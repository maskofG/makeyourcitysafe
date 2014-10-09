package com.socialnetwork.reportcrime.dbsvc.indexstructure;

import java.util.List;
import java.util.Map.Entry;

public interface IndexStructure<K, V> {
	//put key
	public void put(K key, V value);
	
	//get value
	public V get(K key);
	
	//delete key entry
	public void delete(K key);
	
	//list key-value pairs
	public List<Entry<K,V>> list(K key);

}
