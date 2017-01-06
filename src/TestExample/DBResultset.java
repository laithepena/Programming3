package TestExample;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SQLContext;

import conn.mysql.MySqlConnect;
import conn.rh.ReportingVerticaConnect;

public class DBResultset {
	
	
	
	ResultSet generateMySqlResultset(MySqlConnect m1 ,String query) throws SQLException{
		ResultSet rs;
		java.sql.Statement stmt = m1.connect().createStatement();
		 rs = stmt.executeQuery(query);
		
		return rs;
		
	}
	
	
	ResultSet generateVerticaResultset(ReportingVerticaConnect v1 ,String query) throws SQLException{
		ResultSet rs;
		java.sql.Statement stmt = v1.connect().createStatement();
		 rs = stmt.executeQuery(query);
		
		return rs;
		
	}
	
	
	//DataFrame DF1=d1.read().parquet("hdfsLocation");
	
	List<Row> generateDataHubDataFrame(SQLContext d1 ,String location,String query) throws SQLException{
		//DataFrame df;
		
		DataFrame df=d1.read().parquet(location);
		
            List<Row> ListOfRowDataHUB1;
		
		 
		
		df.registerTempTable("stg_event");
		
		
		ListOfRowDataHUB1 = d1.sql(query).collectAsList();
		return ListOfRowDataHUB1;
		
	}
	

}
