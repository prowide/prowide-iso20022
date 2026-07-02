
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "TelecomServicesLineItem3", propOrder = {
    "startDtTm",
    "tmPrd",
    "drtn",
    "callFrTp",
    "callFrOthrTp",
    "callFrPhne",
    "callFrCity",
    "callFrCtrySubDvsnMjr",
    "callFrCtrySubDvsnMnr",
    "callFrCtry",
    "callToTp",
    "callToOthrTp",
    "callToPhne",
    "callToCity",
    "callToCtrySubDvsnMjr",
    "callToCtrySubDvsnMnr",
    "callToCtry",
    "chrg",
    "tax",
    "ttlAmt",
    "desc",
    "addtlData"
})
public class TelecomServicesLineItem3 {

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
    @XmlElement(name = "CallFrTp")
    @XmlSchemaType(name = "string")
    protected TelephonyCallType1Code callFrTp;
    @XmlElement(name = "CallFrOthrTp")
    protected String callFrOthrTp;
    @XmlElement(name = "CallFrPhne")
    protected String callFrPhne;
    @XmlElement(name = "CallFrCity")
    protected String callFrCity;
    @XmlElement(name = "CallFrCtrySubDvsnMjr")
    protected String callFrCtrySubDvsnMjr;
    @XmlElement(name = "CallFrCtrySubDvsnMnr")
    protected String callFrCtrySubDvsnMnr;
    @XmlElement(name = "CallFrCtry")
    protected String callFrCtry;
    @XmlElement(name = "CallToTp")
    @XmlSchemaType(name = "string")
    protected TelephonyCallType1Code callToTp;
    @XmlElement(name = "CallToOthrTp")
    protected String callToOthrTp;
    @XmlElement(name = "CallToPhne")
    protected String callToPhne;
    @XmlElement(name = "CallToCity")
    protected String callToCity;
    @XmlElement(name = "CallToCtrySubDvsnMjr")
    protected String callToCtrySubDvsnMjr;
    @XmlElement(name = "CallToCtrySubDvsnMnr")
    protected String callToCtrySubDvsnMnr;
    @XmlElement(name = "CallToCtry")
    protected String callToCtry;
    @XmlElement(name = "Chrg")
    protected List<Amount23> chrg;
    @XmlElement(name = "Tax")
    protected List<Tax41> tax;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

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
    public TelecomServicesLineItem3 setStartDtTm(XMLGregorianCalendar value) {
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
    public TelecomServicesLineItem3 setTmPrd(String value) {
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
    public TelecomServicesLineItem3 setDrtn(XMLGregorianCalendar value) {
        this.drtn = value;
        return this;
    }

    /**
     * Gets the value of the callFrTp property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonyCallType1Code }
     *     
     */
    public TelephonyCallType1Code getCallFrTp() {
        return callFrTp;
    }

    /**
     * Sets the value of the callFrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonyCallType1Code }
     *     
     */
    public TelecomServicesLineItem3 setCallFrTp(TelephonyCallType1Code value) {
        this.callFrTp = value;
        return this;
    }

    /**
     * Gets the value of the callFrOthrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallFrOthrTp() {
        return callFrOthrTp;
    }

    /**
     * Sets the value of the callFrOthrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem3 setCallFrOthrTp(String value) {
        this.callFrOthrTp = value;
        return this;
    }

    /**
     * Gets the value of the callFrPhne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallFrPhne() {
        return callFrPhne;
    }

    /**
     * Sets the value of the callFrPhne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem3 setCallFrPhne(String value) {
        this.callFrPhne = value;
        return this;
    }

    /**
     * Gets the value of the callFrCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallFrCity() {
        return callFrCity;
    }

    /**
     * Sets the value of the callFrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem3 setCallFrCity(String value) {
        this.callFrCity = value;
        return this;
    }

    /**
     * Gets the value of the callFrCtrySubDvsnMjr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallFrCtrySubDvsnMjr() {
        return callFrCtrySubDvsnMjr;
    }

    /**
     * Sets the value of the callFrCtrySubDvsnMjr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem3 setCallFrCtrySubDvsnMjr(String value) {
        this.callFrCtrySubDvsnMjr = value;
        return this;
    }

    /**
     * Gets the value of the callFrCtrySubDvsnMnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallFrCtrySubDvsnMnr() {
        return callFrCtrySubDvsnMnr;
    }

    /**
     * Sets the value of the callFrCtrySubDvsnMnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem3 setCallFrCtrySubDvsnMnr(String value) {
        this.callFrCtrySubDvsnMnr = value;
        return this;
    }

    /**
     * Gets the value of the callFrCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallFrCtry() {
        return callFrCtry;
    }

    /**
     * Sets the value of the callFrCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem3 setCallFrCtry(String value) {
        this.callFrCtry = value;
        return this;
    }

    /**
     * Gets the value of the callToTp property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonyCallType1Code }
     *     
     */
    public TelephonyCallType1Code getCallToTp() {
        return callToTp;
    }

    /**
     * Sets the value of the callToTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonyCallType1Code }
     *     
     */
    public TelecomServicesLineItem3 setCallToTp(TelephonyCallType1Code value) {
        this.callToTp = value;
        return this;
    }

    /**
     * Gets the value of the callToOthrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallToOthrTp() {
        return callToOthrTp;
    }

    /**
     * Sets the value of the callToOthrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem3 setCallToOthrTp(String value) {
        this.callToOthrTp = value;
        return this;
    }

    /**
     * Gets the value of the callToPhne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallToPhne() {
        return callToPhne;
    }

    /**
     * Sets the value of the callToPhne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem3 setCallToPhne(String value) {
        this.callToPhne = value;
        return this;
    }

    /**
     * Gets the value of the callToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallToCity() {
        return callToCity;
    }

    /**
     * Sets the value of the callToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem3 setCallToCity(String value) {
        this.callToCity = value;
        return this;
    }

    /**
     * Gets the value of the callToCtrySubDvsnMjr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallToCtrySubDvsnMjr() {
        return callToCtrySubDvsnMjr;
    }

    /**
     * Sets the value of the callToCtrySubDvsnMjr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem3 setCallToCtrySubDvsnMjr(String value) {
        this.callToCtrySubDvsnMjr = value;
        return this;
    }

    /**
     * Gets the value of the callToCtrySubDvsnMnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallToCtrySubDvsnMnr() {
        return callToCtrySubDvsnMnr;
    }

    /**
     * Sets the value of the callToCtrySubDvsnMnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem3 setCallToCtrySubDvsnMnr(String value) {
        this.callToCtrySubDvsnMnr = value;
        return this;
    }

    /**
     * Gets the value of the callToCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallToCtry() {
        return callToCtry;
    }

    /**
     * Sets the value of the callToCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem3 setCallToCtry(String value) {
        this.callToCtry = value;
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
     * {@link Amount23 }
     * 
     * 
     */
    public List<Amount23> getChrg() {
        if (chrg == null) {
            chrg = new ArrayList<Amount23>();
        }
        return this.chrg;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax41 }
     * 
     * 
     */
    public List<Tax41> getTax() {
        if (tax == null) {
            tax = new ArrayList<Tax41>();
        }
        return this.tax;
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
    public TelecomServicesLineItem3 setTtlAmt(BigDecimal value) {
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
    public TelecomServicesLineItem3 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData1>();
        }
        return this.addtlData;
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
    public TelecomServicesLineItem3 addChrg(Amount23 chrg) {
        getChrg().add(chrg);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public TelecomServicesLineItem3 addTax(Tax41 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public TelecomServicesLineItem3 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
