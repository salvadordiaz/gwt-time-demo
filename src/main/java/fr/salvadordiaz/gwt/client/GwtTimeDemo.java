package fr.salvadordiaz.gwt.client;

import java.time.LocalDateTime;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

public class GwtTimeDemo implements EntryPoint {
	public void onModuleLoad() {
		GWT.log(LocalDateTime.now().toString());
	}
}
