
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Telecom services line item carries detail level telephony billing data. 
 * 
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecomServicesLineItem2", propOrder = {
    "startDtTm",
    "tmPrd",
    "drtn",
    "callFr",
    "callTo",
    "chrg",
    "ttlTax",
    "ttlAmt",
    "desc",
    "addtlData"
})
public class TelecomServicesLineItem2 {

    @XmlElement(name = "StartDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDtTm;
    @XmlElement(name = "TmPrd")
    protected String tmPrd;
    @XmlElement(name = "Drtn", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar drtn;
    @XmlElement(name = "CallFr")
    protected TelecomCallDetails2 callFr;
    @XmlElement(name = "CallTo")
    protected TelecomCallDetails2 callTo;
    @XmlElement(name = "Chrg")
    protected List<Amount20> chrg;
    @XmlElement(name = "TtlTax")
    protected List<Tax39> ttlTax;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the startDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getStartDtTm() {
        return startDtTm;
    }

    /**
     * Sets the value of the startDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem2 setStartDtTm(XMLGregorianCalendar value) {
        this.startDtTm = value;
        return this;
    }

    /**
     * Gets the value of the tmPrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmPrd() {
        return tmPrd;
    }

    /**
     * Sets the value of the tmPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem2 setTmPrd(String value) {
        this.tmPrd = value;
        return this;
    }

    /**
     * Gets the value of the drtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDrtn() {
        return drtn;
    }

    /**
     * Sets the value of the drtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem2 setDrtn(XMLGregorianCalendar value) {
        this.drtn = value;
        return this;
    }

    /**
     * Gets the value of the callFr property.
     * 
     * @return
     *     possible object is
     *     {@link TelecomCallDetails2 }
     *     
     */
    public TelecomCallDetails2 getCallFr() {
        return callFr;
    }

    /**
     * Sets the value of the callFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecomCallDetails2 }
     *     
     */
    public TelecomServicesLineItem2 setCallFr(TelecomCallDetails2 value) {
        this.callFr = value;
        return this;
    }

    /**
     * Gets the value of the callTo property.
     * 
     * @return
     *     possible object is
     *     {@link TelecomCallDetails2 }
     *     
     */
    public TelecomCallDetails2 getCallTo() {
        return callTo;
    }

    /**
     * Sets the value of the callTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecomCallDetails2 }
     *     
     */
    public TelecomServicesLineItem2 setCallTo(TelecomCallDetails2 value) {
        this.callTo = value;
        return this;
    }

    /**
     * Gets the value of the chrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount20 }
     * 
     * 
     */
    public List<Amount20> getChrg() {
        if (chrg == null) {
            chrg = new ArrayList<Amount20>();
        }
        return this.chrg;
    }

    /**
     * Gets the value of the ttlTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttlTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax39 }
     * 
     * 
     */
    public List<Tax39> getTtlTax() {
        if (ttlTax == null) {
            ttlTax = new ArrayList<Tax39>();
        }
        return this.ttlTax;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TelecomServicesLineItem2 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem2 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem2 setAddtlData(String value) {
        this.addtlData = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the chrg list.
     * @see #getChrg()
     * 
     */
    public TelecomServicesLineItem2 addChrg(Amount20 chrg) {
        getChrg().add(chrg);
        return this;
    }

    /**
     * Adds a new item to the ttlTax list.
     * @see #getTtlTax()
     * 
     */
    public TelecomServicesLineItem2 addTtlTax(Tax39 ttlTax) {
        getTtlTax().add(ttlTax);
        return this;
    }

}
