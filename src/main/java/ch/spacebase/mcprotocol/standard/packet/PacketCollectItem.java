package ch.spacebase.mcprotocol.standard.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import ch.spacebase.mcprotocol.net.Client;
import ch.spacebase.mcprotocol.net.ServerConnection;
import ch.spacebase.mcprotocol.packet.Packet;

public class PacketCollectItem extends Packet {

	public int collected;
	public int collector;

	public PacketCollectItem() {
	}

	public PacketCollectItem(int collected, int collector) {
		this.collected = collected;
		this.collector = collector;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		this.collected = in.readInt();
		this.collector = in.readInt();
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeInt(this.collected);
		out.writeInt(this.collector);
	}

	@Override
	public void handleClient(Client conn) {
	}

	@Override
	public void handleServer(ServerConnection conn) {
	}

	@Override
	public int getId() {
		return 22;
	}

}
