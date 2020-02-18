package cn.myproject.wstl.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for charDataWS complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="charDataWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="senid" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="utime" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="v" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="s" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="valuetype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="charatime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rundatatype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="flag" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="recordDesc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "charDataWS")
public class CharDataWS {

	@XmlAttribute(required = true)
	protected long senid;
	@XmlAttribute
	protected String time;
	@XmlAttribute(required = true)
	protected long utime;
	@XmlAttribute(required = true)
	protected double v;
	@XmlAttribute(required = true)
	protected long s;
	@XmlAttribute
	protected String valuetype;
	@XmlAttribute
	protected String charatime;
	@XmlAttribute
	protected String rundatatype;
	@XmlAttribute(required = true)
	protected int flag;
	@XmlAttribute
	protected String recordDesc;
	@XmlAttribute
	protected String unit;

	/**
	 * Gets the value of the senid property.
	 * 
	 */
	public long getSenid() {
		return senid;
	}

	/**
	 * Sets the value of the senid property.
	 * 
	 */
	public void setSenid(long value) {
		this.senid = value;
	}

	/**
	 * Gets the value of the time property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTime() {
		return time;
	}

	/**
	 * Sets the value of the time property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTime(String value) {
		this.time = value;
	}

	/**
	 * Gets the value of the utime property.
	 * 
	 */
	public long getUtime() {
		return utime;
	}

	/**
	 * Sets the value of the utime property.
	 * 
	 */
	public void setUtime(long value) {
		this.utime = value;
	}

	/**
	 * Gets the value of the v property.
	 * 
	 */
	public double getV() {
		return v;
	}

	/**
	 * Sets the value of the v property.
	 * 
	 */
	public void setV(double value) {
		this.v = value;
	}

	/**
	 * Gets the value of the s property.
	 * 
	 */
	public long getS() {
		return s;
	}

	/**
	 * Sets the value of the s property.
	 * 
	 */
	public void setS(long value) {
		this.s = value;
	}

	/**
	 * Gets the value of the valuetype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValuetype() {
		return valuetype;
	}

	/**
	 * Sets the value of the valuetype property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValuetype(String value) {
		this.valuetype = value;
	}

	/**
	 * Gets the value of the charatime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCharatime() {
		return charatime;
	}

	/**
	 * Sets the value of the charatime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCharatime(String value) {
		this.charatime = value;
	}

	/**
	 * Gets the value of the rundatatype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRundatatype() {
		return rundatatype;
	}

	/**
	 * Sets the value of the rundatatype property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRundatatype(String value) {
		this.rundatatype = value;
	}

	/**
	 * Gets the value of the flag property.
	 * 
	 */
	public int getFlag() {
		return flag;
	}

	/**
	 * Sets the value of the flag property.
	 * 
	 */
	public void setFlag(int value) {
		this.flag = value;
	}

	/**
	 * Gets the value of the recordDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRecordDesc() {
		return recordDesc;
	}

	/**
	 * Sets the value of the recordDesc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRecordDesc(String value) {
		this.recordDesc = value;
	}

	/**
	 * Gets the value of the unit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * Sets the value of the unit property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUnit(String value) {
		this.unit = value;
	}

}
