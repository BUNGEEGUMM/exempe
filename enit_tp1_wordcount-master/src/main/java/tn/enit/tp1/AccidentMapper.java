package tn.enit.tp1;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AccidentMapper extends  Mapper<Object, Text, Text, IntWritable>{
    private Text maritalStatus = new Text();

    public void map(Object key, Text value, Mapper.Context context) throws IOException, InterruptedException {
        String line = value.toString();
        String[] fields = line.split(",");
        maritalStatus.set(fields[0]);
        context.write(maritalStatus, new IntWritable(1));
        System.out.println(maritalStatus);
    }
}
