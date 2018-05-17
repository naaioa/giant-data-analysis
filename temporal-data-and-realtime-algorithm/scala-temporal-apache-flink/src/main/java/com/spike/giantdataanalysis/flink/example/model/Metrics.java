package com.spike.giantdataanalysis.flink.example.model;

import java.util.Random;

import com.spike.giantdataanalysis.flink.example.model.PerformanceIndex.OperationSystem.CPU;
import com.spike.giantdataanalysis.flink.example.model.PerformanceIndex.OperationSystem.Disk;
import com.spike.giantdataanalysis.flink.example.model.PerformanceIndex.OperationSystem.DiskIO;
import com.spike.giantdataanalysis.flink.example.model.PerformanceIndex.OperationSystem.Kernel;
import com.spike.giantdataanalysis.flink.example.model.PerformanceIndex.OperationSystem.Network;
import com.spike.giantdataanalysis.flink.example.model.PerformanceIndex.OperationSystem.Process;
import com.spike.giantdataanalysis.flink.example.model.PerformanceIndex.OperationSystem.Sys;

public class Metrics {
	/**
	 * <pre>
	 * 展示metric
	 * 
	 * CPU
	 * Disk
	 * DiskIO
	 * Network
	 * Kernel
	 * Sys
	 * Process
	 * </pre>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for (CPU e : CPU.values()) {
			System.out.println("tsdb mkmetric " + e.getMetric());
		}
		for (Disk e : Disk.values()) {
			System.out.println("tsdb mkmetric " + e.getMetric());
		}
		for (DiskIO e : DiskIO.values()) {
			System.out.println("tsdb mkmetric " + e.getMetric());
		}
		for (Network e : Network.values()) {
			System.out.println("tsdb mkmetric " + e.getMetric());
		}
		for (Kernel e : Kernel.values()) {
			System.out.println("tsdb mkmetric " + e.getMetric());
		}
		for (Sys e : Sys.values()) {
			System.out.println("tsdb mkmetric " + e.getMetric());
		}
		for (Process e : Process.values()) {
			System.out.println("tsdb mkmetric " + e.getMetric());
		}
	}

	public static enum MetricType {
		INT, PERCENT, DOUBLE
	}

	public static final String TAG_DATACENTER = "dc";
	public static final String[] TAG_DATACENTER_VALUES = //
			new String[] { "dc001", "dc002", "dc003", "dc004" };

	public static final String TAG_MACHINE_GROUP = "mg";
	public static String[] TAG_MACHINE_GROUP_VALUES = //
			new String[] { "mg0001", "mg0002", "mg0003", "mg0004", "mg0005", //
					"mg0006", "mg0007", "mg0008", "mg009", "mg0010" };

	public static final String TAG_MACHINE = "m";
	public static final String[] TAG_MACHINE_VALUES = //
			new String[] { "m00001", "m00002", "m00003", "m00004", "m00005", //
					"m00006", "m00007", "m00008", "m00009", "m00010", //
					"m00011", "m00012", "m00013", "m00014", "m00015", //
					"m00016", "m00017", "m00018", "m00019", "m00020" };

	public static double DEFAULT_MAX_DOUBLE = 1000d;
	public static int DEFAULT_MAX_INT = 1000;
	public static float DEFAULT_MAX_FLOAT = 1000f;

	public static int METRIC_SIZE() {
		return 7;
	}

	public static long LONG() {
		Random rnd = new Random(System.currentTimeMillis());
		return rnd.nextLong();
	}

	/**
	 * @return [0.0d, 1.0d)
	 */
	public static double DOUBLE() {
		Random rnd = new Random(System.currentTimeMillis());
		return rnd.nextDouble();
	}

	/**
	 * @return [0.0d, max)
	 */
	public static double DOUBLE(double max) {
		Random rnd = new Random(System.currentTimeMillis());
		double result = rnd.nextDouble() * max;
		return result;
	}

	/**
	 * @return [0.0f, 1.0f)
	 */
	public static float FLOAT() {
		Random rnd = new Random(System.currentTimeMillis());
		return rnd.nextFloat();
	}

	/**
	 * @return [0.0f, max)
	 */
	public static float FLOAT(float max) {
		Random rnd = new Random(System.currentTimeMillis());
		return rnd.nextFloat();
	}

	public static int INT() {
		Random rnd = new Random(System.currentTimeMillis());
		return rnd.nextInt();
	}

	/**
	 * @return [0, max)
	 */
	public static int INT(int max) {
		Random rnd = new Random(System.currentTimeMillis());
		return rnd.nextInt(max);
	}

	/**
	 * @return 例50.2
	 */
	public static float PRECENT() {
		Random rnd = new Random(System.currentTimeMillis());
		float result = rnd.nextFloat() * 101f;
		if (result > 100f)
			result = 100f;
		return result;
	}

	/**
	 * @return [0.0f, max)
	 */
	public static float PERCENT(float max) {
		Random rnd = new Random(System.currentTimeMillis());
		return rnd.nextFloat() * max;
	}

}
