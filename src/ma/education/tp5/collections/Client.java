package ma.education.tp5.collections;

class Client implements Comparable {
	Integer code;
	String name;

	public Client(String name, Integer code) {
		this.name = name;
		this.code = code;
		
	}

	@Override
	public String toString() {
		return "Client{" + "code=" + code + ", name='" + name + '\'' + '}';
	}

	@Override
	public boolean equals(Object o) {
		Client client = (Client) o;
		return this.code == client.code && this.name.equals(client.name);
	}

	// Comparator pour le tri des client par code
	public int compareTo(Object o) {
		Client client = (Client) o;
		return -client.code + this.code;

	}

	// Comparator pour le tri des client par name
	public int compare(Object o) {
		Client client = (Client) o;
		return client.name.compareTo(this.name);
	}
	
	 public String getName() {
	        return name;
	    }
	 
	 public int getCode() {
	        return code;
	    }

}