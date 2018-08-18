package Server27Ex;

import java.net.*;
import java.io.*;
import java.util.*;

public class Server27Ex {
	private static ServerSocket SS;
	private static int port;
	private Hashtable ht = new Hashtable();
	Socket socket;

	public Server27Ex() {
		try {
			SS = new ServerSocket(port);
			System.out
					.println("Server is created and waiting Client to connect...");

			while (true) {
				socket = SS.accept();
				System.out.println("Client IP = "
						+ socket.getInetAddress().getHostAddress());

				DataOutputStream outstream = new DataOutputStream(
						socket.getOutputStream());
				ht.put(socket, outstream);
				Thread thread = new Thread(new ServerRunnable(socket, ht));
				thread.start();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: java Server27Ex [port]");
			System.exit(1);
		}

		port = Integer.parseInt(args[0]);
		new Server27Ex();
	}
}

class ServerRunnable implements Runnable {
	private Socket socket;
	private Hashtable ht;

	public ServerRunnable(Socket socket, Hashtable ht) {
		this.socket = socket;
		this.ht = ht;
	}

	public void run() {
		DataInputStream instream;

		try {
			instream = new DataInputStream(socket.getInputStream());

			while (true) {
				String message = instream.readUTF();

				synchronized (ht) {
					Enumeration en = ht.elements();
					while (en.hasMoreElements()) {
						DataOutputStream outstream = (DataOutputStream) en
								.nextElement();

						try {
							outstream.writeUTF(message);
						} catch (IOException e) {
							System.out.println(e.getMessage());
						}
					}
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			synchronized (ht) {
				System.out.println("Remove connection: " + socket);
				ht.remove(socket);
				try {
					socket.close();
				} catch (IOException e) {
				}
			}
		}
	}
}