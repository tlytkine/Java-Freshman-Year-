public class HashTable {
	private final static int size = 89;

	HashEntry[] table;
	HashTable(){
	table = new HashEntry[size];
	for (int i = 0; i <size; i++){
	table [i] = null; 
	}
	}
			public int get(int key){
				int hash = (key % size);
				if (table[hash]==null){
					return -1;
							}
				else {
					HashTable entry = table[hash];
					while (entry != null && entry.getKey()!=key){
						entry = entry.getNext();
				if(entry == null){
						return -1;
						}
					else {
					return entry.getValue();
					}
			}
		}
	}

      public void put(int key, int value) {
            int hash = (key % size);
            if (table[hash] == null)
                  table[hash] = new HashEntry(key, value);
            else {
                  HashEntry entry = table[hash];
                  while (entry.getNext() != null && entry.getKey() != key)
                        entry = entry.getNext();
                  if (entry.getKey() == key)
                        entry.setValue(value);
                  else
                        entry.setNext(new HashEntry(key, value));
            }
      }
 
      public void remove(int key) {
            int hash = (key % size);
            if (table[hash] != null) {
                  HashEntry prevEntry = null;
                  HashEntry entry = table[hash];
                  while (entry.getNext() != null && entry.getKey() != key) {
                        prevEntry = entry;
                        entry = entry.getNext();
                  }
                  if (entry.getKey() == key) {
                        if (prevEntry == null)
                             table[hash] = entry.getNext();
                        else
                             prevEntry.setNext(entry.getNext());
                  }
            }
      }
}