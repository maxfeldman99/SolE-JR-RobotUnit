package com.max.robotServer;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class Main {

	public static void main(String[] args) {
		Server server = new Server();
		int MAX_CLIENTS = 1;
		ThreadPoolExecutor threadPoolExecutor;
		threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(MAX_CLIENTS);
		server.run();
		threadPoolExecutor.submit(server);
		while(threadPoolExecutor.isShutdown()==false) {
			

	}
		
//		MongoDB db = new MongoDB();
//		db.getInstance().insertToColletion("1", "name", "max");
		
		
//		// working mongo section
//		String uri = "mongodb://solejr:solejr99@cluster0-shard-00-00-moel4.mongodb.net:27017,cluster0-shard-00-01-moel4.mongodb.net:27017,cluster0-shard-00-02-moel4.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin&retryWrites=true";
//		MongoClientURI clientURI = new MongoClientURI(uri);
//		MongoClient mongoClient = new MongoClient(clientURI);
//		
//		MongoDatabase mongoDatabase = mongoClient.getDatabase("mongoDB");
//		MongoCollection collection = mongoDatabase.getCollection("1");
//		
//		Document document = new Document("name", "max");
//		document.append("Sex", "male");
//		document.append("Age", "28");
//		collection.insertOne(document);
		
		

}
	
}
