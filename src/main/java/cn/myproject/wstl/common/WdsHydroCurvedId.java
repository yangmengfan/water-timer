package cn.myproject.wstl.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for wdsHydroCurvedId complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="wdsHydroCurvedId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="v0" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="v1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="v2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="v3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wdsHydroCurvedId", propOrder = { "v0", "v1", "v2", "v3" })
public class WdsHydroCurvedId {

	protected Double v0;
	protected Double v1;
	protected Double v2;
	protected Double v3;

	/**
	 * Gets the value of the v0 property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getV0() {
		return v0;
	}

	/**
	 * Sets the value of the v0 property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setV0(Double value) {
		this.v0 = value;
	}

	/**
	 * Gets the value of the v1 property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getV1() {
		return v1;
	}

	/**
	 * Sets the value of the v1 property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setV1(Double value) {
		this.v1 = value;
	}

	/**
	 * Gets the value of the v2 property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getV2() {
		return v2;
	}

	/**
	 * Sets the value of the v2 property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setV2(Double value) {
		this.v2 = value;
	}

	/**
	 * Gets the value of the v3 property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getV3() {
		return v3;
	}

	/**
	 * Sets the value of the v3 property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setV3(Double value) {
		this.v3 = value;
	}

}
