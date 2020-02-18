package cn.myproject.wstl.common;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Java class for webFetchParam complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="webFetchParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idarrayLongs" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="apptype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="calctype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exInt" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="exIntervalInt" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="sliptype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="slipwin" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="slipstep" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="rundatatype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="valtype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="staticvalue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="btmcond" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="etmcond" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="et" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orderflag" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webFetchParam", propOrder = { "idarrayLongs" })
public class WebFetchParam {

	@XmlElement(type = Long.class)
	protected List<Long> idarrayLongs;
	@XmlAttribute
	protected String apptype;
	@XmlAttribute
	protected String calctype;
	@XmlAttribute
	protected Integer exInt;
	@XmlAttribute
	protected Integer exIntervalInt;
	@XmlAttribute
	protected String sliptype;
	@XmlAttribute
	protected Integer slipwin;
	@XmlAttribute
	protected Integer slipstep;
	@XmlAttribute
	protected Integer filter;
	@XmlAttribute
	protected String rundatatype;
	@XmlAttribute
	protected String valtype;
	@XmlAttribute
	protected String staticvalue;
	@XmlAttribute
	protected String btmcond;
	@XmlAttribute
	protected String etmcond;
	@XmlAttribute
	protected String bt;
	@XmlAttribute
	protected String et;
	@XmlAttribute
	protected Integer orderflag;

	/**
	 * Gets the value of the idarrayLongs property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the idarrayLongs property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getIdarrayLongs().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Long }
	 * 
	 * 
	 */
	public List<Long> getIdarrayLongs() {
		if (idarrayLongs == null) {
			idarrayLongs = new ArrayList<Long>();
		}
		return this.idarrayLongs;
	}

	/**
	 * Gets the value of the apptype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getApptype() {
		return apptype;
	}

	/**
	 * Sets the value of the apptype property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setApptype(String value) {
		this.apptype = value;
	}

	/**
	 * Gets the value of the calctype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCalctype() {
		return calctype;
	}

	/**
	 * Sets the value of the calctype property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCalctype(String value) {
		this.calctype = value;
	}

	/**
	 * Gets the value of the exInt property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getExInt() {
		return exInt;
	}

	/**
	 * Sets the value of the exInt property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setExInt(Integer value) {
		this.exInt = value;
	}

	/**
	 * Gets the value of the exIntervalInt property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getExIntervalInt() {
		return exIntervalInt;
	}

	/**
	 * Sets the value of the exIntervalInt property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setExIntervalInt(Integer value) {
		this.exIntervalInt = value;
	}

	/**
	 * Gets the value of the sliptype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSliptype() {
		return sliptype;
	}

	/**
	 * Sets the value of the sliptype property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSliptype(String value) {
		this.sliptype = value;
	}

	/**
	 * Gets the value of the slipwin property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getSlipwin() {
		return slipwin;
	}

	/**
	 * Sets the value of the slipwin property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setSlipwin(Integer value) {
		this.slipwin = value;
	}

	/**
	 * Gets the value of the slipstep property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getSlipstep() {
		return slipstep;
	}

	/**
	 * Sets the value of the slipstep property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setSlipstep(Integer value) {
		this.slipstep = value;
	}

	/**
	 * Gets the value of the filter property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getFilter() {
		return filter;
	}

	/**
	 * Sets the value of the filter property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setFilter(Integer value) {
		this.filter = value;
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
	 * Gets the value of the valtype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValtype() {
		return valtype;
	}

	/**
	 * Sets the value of the valtype property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValtype(String value) {
		this.valtype = value;
	}

	/**
	 * Gets the value of the staticvalue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStaticvalue() {
		return staticvalue;
	}

	/**
	 * Sets the value of the staticvalue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStaticvalue(String value) {
		this.staticvalue = value;
	}

	/**
	 * Gets the value of the btmcond property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBtmcond() {
		return btmcond;
	}

	/**
	 * Sets the value of the btmcond property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBtmcond(String value) {
		this.btmcond = value;
	}

	/**
	 * Gets the value of the etmcond property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEtmcond() {
		return etmcond;
	}

	/**
	 * Sets the value of the etmcond property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEtmcond(String value) {
		this.etmcond = value;
	}

	/**
	 * Gets the value of the bt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBt() {
		return bt;
	}

	/**
	 * Sets the value of the bt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBt(String value) {
		this.bt = value;
	}

	/**
	 * Gets the value of the et property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEt() {
		return et;
	}

	/**
	 * Sets the value of the et property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEt(String value) {
		this.et = value;
	}

	/**
	 * Gets the value of the orderflag property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getOrderflag() {
		return orderflag;
	}

	/**
	 * Sets the value of the orderflag property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setOrderflag(Integer value) {
		this.orderflag = value;
	}

}
