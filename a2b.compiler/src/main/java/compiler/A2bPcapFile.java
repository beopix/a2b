package compiler;

import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapDumper;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.Pcaps;
import org.pcap4j.packet.namednumber.DataLinkType;

/**
 * 
 * This class is for creating a pcap file. It uses pcap4j, a java library for capturing, crafting, and sending packets. 
 * @see https://www.pcap4j.org/
 * 
 * @author rampix
 *
 */
public class A2bPcapFile {

	public static void generatePcapFile(final String fileName, final byte[] data) {
		
		PcapHandle pcaphandler = null;
		PcapDumper pcapdumper = null;
		
		try {
			pcaphandler = Pcaps.openDead(DataLinkType.EN10MB, 65536);
			pcapdumper = pcaphandler.dumpOpen(fileName +".pcap");
			pcapdumper.dumpRaw(data);
		} catch (PcapNativeException | NotOpenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
