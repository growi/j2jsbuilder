package org.j2js.json.values;

import java.text.DateFormat;
import java.util.Date;

import org.j2js.json.JSONValue;

public class JSONDateTimeValue extends JSONValue {
	
	Date m_date;
		
	public JSONDateTimeValue( Date date ){
		m_date = date;
	}

	@Override
	public String getValue() {
		return m_date  == null ? this.getNull() : DateFormat.getDateInstance().format( m_date );
	}

	public String getValue( DateFormat formatter ) {
		return m_date  == null ? this.getNull() : this.quote( formatter.format( m_date ) ); 
	}
	
}