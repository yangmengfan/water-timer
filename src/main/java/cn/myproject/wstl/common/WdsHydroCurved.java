package cn.myproject.wstl.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for wdsHydroCurved complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="wdsHydroCurved">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://common.hd.slsd.nari.com/}wdsHydroCurvedId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wdsHydroCurved", propOrder = { "id" })
public class WdsHydroCurved {

	protected WdsHydroCurvedId id;

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link WdsHydroCurvedId }
	 * 
	 */
	public WdsHydroCurvedId getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link WdsHydroCurvedId }
	 * 
	 */
	public void setId(WdsHydroCurvedId value) {
		this.id = value;
	}

}
