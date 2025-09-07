package HashMap;

import java.util.LinkedList;

public class Implementation {
    public static class MyHashMap<K, V>{
        final int default_capacity = 4;
        final float default_load_factor = 0.75f;

        //Node class
        private class Node{
            K key;
            V value;

            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n;  //this number of entries in map
        LinkedList<Node>[] buckets;

        //for buckets.....
        private void iniBuckets(int N){
            buckets=new LinkedList[N];

            for(int i=0; i< buckets.length; i++){
                buckets[i]=new LinkedList<>();  //initialize empty LinkedList on each bucket position
            }
        }

        //for check capacity
        public int capacity(){
            return buckets.length;
        }

        //for check load factor
        public float load_f(){
            return (n*1.0f)/buckets.length;
        }

        //for hash function for finding buckets index
        private int HashFunc(K key){
            int hc = key.hashCode();  //not matter what's have key type at the end hashCode convert into int value
            return (Math.abs(hc)) % buckets.length;
        }

        //traverse the ll and looks for a node with key, if found it returns it's index otherwise it returns nu;ll
        private int searchInBucket(LinkedList<Node> ll, K key){
            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        //rehash function
        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            iniBuckets(oldBuckets.length * 2);
            n=0;

            for(var bucket: oldBuckets){
                for(var node: bucket){
                    put(node.key, node.value);
                }
            }
        }

        public MyHashMap(){   //default constructor
            iniBuckets(default_capacity);
        }

        //size function
        public int size(){
            return n;
        }


        //put function
        public void put(K key, V value){
            int bi = HashFunc(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int ei = searchInBucket(currentBucket, key);

            if(ei == -1){  //key doesn't exist and we have to put
                Node node=new Node(key, value);
                currentBucket.add(node);
                n++;
            }else {  //key exist so we need to update value
                Node currentNode = currentBucket.get(ei);
                currentNode.value=value;
            }

            if(n >= buckets.length * default_load_factor){
                rehash();
            }
        }


        //get function
        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int ei = searchInBucket(currentBucket, key);

            if(ei  != -1){  //key exist
                Node currNode = currentBucket.get(ei);
                return currNode.value;
            }
            //key doesn't exist
            return null;
        }


        //remove function
        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int ei = searchInBucket(currentBucket, key);

            if(ei != -1){ //key exist
                Node currNode = currentBucket.get(ei);
                V val = currNode.value;
                currentBucket.remove(ei);
                n--;
                return val;
            }
            //key not exist
            return null;
        }

    }
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        System.out.println("Capacity: " + map.capacity());  //4
        System.out.println("Load_Factor: " + map.load_f());
        map.put("c", 3);
        map.put("x", 100);
        map.put("y", 105);
        //size check
        System.out.println("size of entries: " + map.size()); //5

        //put function check
        map.put("c", 30);
        System.out.println("size of entries: " + map.size()); //5
        System.out.println();

        //get function check
        System.out.println(map.get("a"));//1
        System.out.println(map.get("b"));//2
        //check capacity and load factor
        System.out.println("updated: " + map.get("c"));//30      // value of c has been changed bcz of put function
        System.out.println(map.get("x"));//100
        System.out.println(map.get("y"));//105
        System.out.println(map.get("college")); //null
        System.out.println();

        //remove function check
        System.out.println(map.remove("c")); //30
        System.out.println(map.remove("c")); //null
        System.out.println("size of entries: " + map.size()); //4
        System.out.println();

        //check capacity and load factor
        System.out.println("Capacity: " + map.capacity());  //8
        System.out.println("Load_Factor: " + map.load_f());
    }
}
