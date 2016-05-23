package org.osanchezhuerta.employees.hr.ws.web.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class DateUtils {
	/**
	 * Log de la clase
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(DateUtils.class);
	/**
	 * Formato de fecha.
	 */
	public static final String FECHA_FORMATO = "dd/MM/yyyy";

	/**
	 * Metodo realiza formato dd/MM/yyyy a un objeto Date
	 * 
	 * @param date
	 *            Objeto al que se le aplicara el formato dd/MM/yyyy
	 * @return sdf.format(date) retorna la fecha con formato
	 * @throws ParseException
	 */
	public static String formatearDateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(FECHA_FORMATO);
		return date != null ? sdf.format(date) : null;
	}

	/**
	 * Metodo que suma dias a una fecha
	 * 
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date addDays(Date date, int days) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		return cal.getTime();
	}

	/**
	 * Devuelve la fecha y hora actual en un objeto {@link XMLGregorianCalendar}
	 * 
	 * @return Representacion de la fecha y hora actual o null en caso de
	 *         excepcion
	 */
	public static XMLGregorianCalendar getCurrentTimeXMLGregorianCalendar() {
		XMLGregorianCalendar currentTime = null;
		try {
			currentTime = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(new GregorianCalendar());
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return currentTime;
	}

	/**
	 * Convierte una fecha tipo {@link Date} en un objeto
	 * {@link XMLGregorianCalendar}
	 * 
	 * @return Representacion de la fecha en el nuevo tipo de dato
	 */
	public static XMLGregorianCalendar convertirDateToXMLGregorianCalendar(Date fecha) {
		XMLGregorianCalendar date = null;
		if (fecha != null) {
			try {
				GregorianCalendar c = new GregorianCalendar();
				c.setTime(fecha);
				date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			} catch (Exception e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
		return date;
	}

	/**
	 * Convierte una fecha tipo {@link XMLGregorianCalendar} en un objeto
	 * {@link Date}
	 * 
	 * @return Representacion de la fecha en el nuevo tipo de dato
	 */
	public static Date convertirXMLGregorianCalendarToDate(
			XMLGregorianCalendar fecha) {
		if (fecha == null) {
			return null;
		}
		Date date = null;
		date = fecha.toGregorianCalendar().getTime();
		return date;
	}

}