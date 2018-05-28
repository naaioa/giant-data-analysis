
/**
 * Example of OpenJDK JOL.
 * <p>
 * JOL (Java Object Layout) is the tiny toolbox to analyze object layout schemes in JVMs. These
 * tools are using Unsafe, JVMTI, and Serviceability Agent (SA) heavily to decoder the actual object
 * layout, footprint, and references. This makes JOL much more accurate than other tools relying on
 * heap dumps, specification assumptions, etc.
 */
package com.spike.giantdataanalysis.benchmark.tools.jol;