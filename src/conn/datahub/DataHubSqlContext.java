package conn.datahub;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SQLContext;

public class DataHubSqlContext {
	
	static SparkConf conf;
	static JavaSparkContext sc;
	static SQLContext sqlContext;
	
public static	SQLContext getSqlContext(String clusterMode){
		
		conf = new SparkConf().setAppName("PompuApp").setMaster(clusterMode); // this is for local mode when running from eclipse
         sc = new JavaSparkContext(conf);
        
        sqlContext = new SQLContext(sc);
        return sqlContext;
	}


public void disconnect() {
	sc.stop();
	
}

}
