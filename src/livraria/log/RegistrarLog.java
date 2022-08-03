package livraria.log;

import java.io.FileOutputStream;
import java.time.LocalTime;

public class RegistrarLog {
	private boolean monitor = false;

	public static void main(String[] args) {
		
	}
	
	private void gravarDados(String lineToAppend) {
		try {
			String filePath = "RegistrosLog.txt";
			FileOutputStream f = new FileOutputStream(filePath, true);
			byte[] byteArr = lineToAppend.getBytes();
			f.write(byteArr);
			f.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void Registrar(String usuario, String operacao, String query) {
		StringBuilder sb = new StringBuilder();
		sb.append(LocalTime.now().toString());
		sb.append(" | ");
		sb.append("Usuário: ");
		sb.append(usuario);
		sb.append(" | ");
		sb.append("Operacao: ");
		sb.append(operacao);
		sb.append(" | ");
		sb.append("Query: ");
		sb.append(query);
		this.gravarDados(sb.toString());
	}

	public synchronized void request() {
		while (monitor) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		monitor = true;
	}

	public synchronized void release() {
		monitor = false;
		notifyAll();
	}

}
