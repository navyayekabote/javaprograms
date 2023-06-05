package com.shristi.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	private Instrument instrument;
	@Autowired
	Instrument violin;
	
	@Autowired
	Instrument piano;
	
	@Autowired
	Instrument guitar;
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	void playSong(String type,String song) {
		if(type.equalsIgnoreCase("violin"))
			violin.play(song);
		if(type.equalsIgnoreCase("piano"))
			piano.play(song);
		if(type.equalsIgnoreCase("guitar"))
			guitar.play(song);
	}
}
