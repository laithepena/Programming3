package TestExample;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.rdd.RDD;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SQLContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import akka.util.Collections;
import conn.datahub.DataHubSqlContext;
import conn.mysql.MySqlConnect;
import conn.rh.ReportingVerticaConnect;

public class Test1 {

	private static final String MySqlQuery = "SELECT file_batch_id,file_name,status FROM file_load_control";
		
	private static final String ReportingHubQuery = "SELECT file_batch_id,file_name,status FROM blackarrow_rh_qa17.file_load_control";
		
	final static String hdfsLocation="hdfs://qa-us1-dhub20.blackarrow-corp.com:8020//user/datahub/pdbms/qa_us1_app18_dw.db/stg_event/*";
	final static String datahubQuery1="select local_date_id,distributor_id,sum(ad_decision),sum(actual_impression) FROM stg_event  group by local_date_id,distributor_id order by local_date_id,distributor_id ";
	
	
	private static MySqlConnect m1;
	private static ReportingVerticaConnect v1;

	static SQLContext d1;
	static DataHubSqlContext dh;

	@BeforeClass
	public void beforeClass() throws SQLException {
		m1 = new MySqlConnect();
		
		v1=new ReportingVerticaConnect();
		
		dh=new DataHubSqlContext();
		d1=dh.getSqlContext("local");
          
	}

	@Test
	void test1() throws SQLException {

		ResultSet rs;
		ResultSet rs11;

		DBResultset db1 = new DBResultset();
		rs = db1.generateMySqlResultset(m1, MySqlQuery);

		rs11 = db1.generateMySqlResultset(m1, MySqlQuery);

		int[] col = { 1, 2, 3 };
		while (rs.next() && rs11.next()) {

			Assert.assertEquals(rs.getObject(col[0]), rs11.getObject(col[0]), "not matched 1");

			Assert.assertEquals(rs.getObject(col[1]), rs11.getObject(col[1]), "not matched 2");

			Assert.assertEquals(rs.getObject(col[2]), rs11.getObject(col[2]), "not matched 3");

		}

	}

	@Test
	void test2() throws SQLException {
		ResultSet rs;
		DBResultset db1 = new DBResultset();
		rs = db1.generateVerticaResultset(v1, ReportingHubQuery);
		
		System.out.println(rs.getMetaData().getColumnCount());
		
	}

	@Test
	void test3() throws SQLException {
		List<Row> lol;
		DBResultset db1 = new DBResultset();
		lol=db1.generateDataHubDataFrame(d1,hdfsLocation,datahubQuery1);
		
		
		for(Row r :lol){
			
	
			
			System.out.print(r.get(0)+" ");
			
			System.out.print(r.get(1)+" ");
			
			System.out.print(r.get(2)+" ");
			
			System.out.println(r.get(3)+" ");
			
		}
		
		
	}
	
	@AfterClass
	public void afterClass() {
		m1.disconnect();
		
		v1.disconnect();
		
	    dh.disconnect();

	}

}
