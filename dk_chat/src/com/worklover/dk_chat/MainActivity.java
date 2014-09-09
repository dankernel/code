package com.worklover.dk_chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import org.apache.http.HttpResponse;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gcm.GCMRegistrar;

public class MainActivity extends Activity {

	private String html = "";
	private Handler mHandler;
	private Socket socket;
	private String name;
	private BufferedReader networkReader;
	private BufferedWriter networkWriter;
	private String ip = "220.149.250.100"; // IP
	private int port = 4000; // PORT번호

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.e("ck", "000");
		try {
			setSocket(ip, port);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Log.e("ck", "001");

		checkUpdate.start();
		final EditText et = (EditText) findViewById(R.id.EditText01);
		Button btn = (Button) findViewById(R.id.Button01);
		final TextView tv = (TextView) findViewById(R.id.TextView01);

		btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (et.getText().toString() != null
						|| !et.getText().toString().equals("")) {
					PrintWriter out = new PrintWriter(networkWriter,true);
					String return_msg = et.getText().toString();
					out.println(return_msg);
				}
			}
		});

		registerGcm();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void sock(){
		try {
			setSocket(ip, port);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		checkUpdate.start();
		final EditText et = (EditText) findViewById(R.id.EditText01);
		Button btn = (Button) findViewById(R.id.Button01);
		final TextView tv = (TextView) findViewById(R.id.TextView01);

		btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (et.getText().toString() != null
						|| !et.getText().toString().equals("")) {
					PrintWriter out = new PrintWriter(networkWriter,true);
					String return_msg = et.getText().toString();
					out.println(return_msg);
				}
			}
		});

	}

	public void registerGcm() {
		Log.e("reg_id", "Start")
		;
		GCMRegistrar.checkDevice(this);
		GCMRegistrar.checkManifest(this);

		String regId = GCMRegistrar.getRegistrationId(this);
		if (regId.equals("")) {
			GCMRegistrar.register(this, "548400374880");
		} else {
			Log.e("reg_id", regId);
		}

	}

	private Thread checkUpdate = new Thread() {
		public void run() {
			try {
				String line;
				Log.w("ChattingStart", "Start Thread");
				while (true) {
					Log.w("Chatting is running", "chatting is running");
					line = networkReader.readLine();
					html = line;
					mHandler.post(showUpdate);

				}
			} catch (Exception e) {
			}
		}
	};

	private Runnable showUpdate = new Runnable() {
		public void run() {
			Toast.makeText(MainActivity.this, "Coming word: " + html, Toast.LENGTH_SHORT).show();
		}
	};

	public void setSocket(final String ip, final int port) throws IOException {

		Thread thread = new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					try {
						socket = new Socket(ip, port);
						networkWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
						networkReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					} catch (IOException e) {
						System.out.println(e);
						e.printStackTrace();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		thread.start(); 



	}

}
