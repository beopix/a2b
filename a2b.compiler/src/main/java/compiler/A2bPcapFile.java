package compiler;

import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapDumper;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.Pcaps;
import org.pcap4j.packet.namednumber.DataLinkType;

public class A2bPcapFile {

	public static void pcapDo() {
		String fileName = "";
		byte[] data = null;
		
		PcapHandle h = null;
		try {
			h = Pcaps.openDead(DataLinkType.EN10MB, 65536);
		} catch (PcapNativeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PcapDumper pdumper = null;
		try {
			pdumper = h.dumpOpen(fileName +".pcap");
		} catch (PcapNativeException | NotOpenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			pdumper.dumpRaw(data);
		} catch (NotOpenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
