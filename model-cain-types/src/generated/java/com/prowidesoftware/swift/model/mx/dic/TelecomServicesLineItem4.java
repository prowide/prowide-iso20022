
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "TelecomServicesLineItem4", propOrder = {
    "startDtTm",
    "tmPrd",
    "drtn",
    "callFrTp",
    "callFrPhne",
    "callFrCity",
    "callFrCtrySubDvsnMjr",
    "callFrCtrySubDvsnMnr",
    "callFrCtry",
    "callToTp",
    "callToPhne",
    "callToCity",
    "callToCtrySubDvsnMjr",
    "callToCtrySubDvsnMnr",
    "callToCtry",
    "chrg",
    "tax",
    "ttlAmt",
    "desc",
    "prvtData",
    "ntlData"
})
public class TelecomServicesLineItem4 {

    @XmlElement(name = "StartDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate startDtTm;
    @XmlElement(name = "TmPrd")
    protected String tmPrd;
    @XmlElement(name = "Drtn", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime drtn;
    @XmlElement(name = "CallFrTp")
    @XmlSchemaType(name = "string")
    protected TelephonyCallType2Code callFrTp;
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
    protected TelephonyCallType2Code callToTp;
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
    protected List<TelecomLineItemAmount1> chrg;
    @XmlElement(name = "Tax")
    protected List<Tax44> tax;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

    /**
     * Gets the value of the startDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getStartDtTm() {
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
    public TelecomServicesLineItem4 setStartDtTm(LocalDate value) {
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
    public TelecomServicesLineItem4 setTmPrd(String value) {
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
    public OffsetTime getDrtn() {
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
    public TelecomServicesLineItem4 setDrtn(OffsetTime value) {
        this.drtn = value;
        return this;
    }

    /**
     * Gets the value of the callFrTp property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonyCallType2Code }
     *     
     */
    public TelephonyCallType2Code getCallFrTp() {
        return callFrTp;
    }

    /**
     * Sets the value of the callFrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonyCallType2Code }
     *     
     */
    public TelecomServicesLineItem4 setCallFrTp(TelephonyCallType2Code value) {
        this.callFrTp = value;
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
    public TelecomServicesLineItem4 setCallFrPhne(String value) {
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
    public TelecomServicesLineItem4 setCallFrCity(String value) {
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
    public TelecomServicesLineItem4 setCallFrCtrySubDvsnMjr(String value) {
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
    public TelecomServicesLineItem4 setCallFrCtrySubDvsnMnr(String value) {
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
    public TelecomServicesLineItem4 setCallFrCtry(String value) {
        this.callFrCtry = value;
        return this;
    }

    /**
     * Gets the value of the callToTp property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonyCallType2Code }
     *     
     */
    public TelephonyCallType2Code getCallToTp() {
        return callToTp;
    }

    /**
     * Sets the value of the callToTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonyCallType2Code }
     *     
     */
    public TelecomServicesLineItem4 setCallToTp(TelephonyCallType2Code value) {
        this.callToTp = value;
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
    public TelecomServicesLineItem4 setCallToPhne(String value) {
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
    public TelecomServicesLineItem4 setCallToCity(String value) {
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
    public TelecomServicesLineItem4 setCallToCtrySubDvsnMjr(String value) {
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
    public TelecomServicesLineItem4 setCallToCtrySubDvsnMnr(String value) {
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
    public TelecomServicesLineItem4 setCallToCtry(String value) {
        this.callToCtry = value;
        return this;
    }

    /**
     * Gets the value of the chrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrg property.
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
     * {@link TelecomLineItemAmount1 }
     * 
     * 
     * @return
     *     The value of the chrg property.
     */
    public List<TelecomLineItemAmount1> getChrg() {
        if (chrg == null) {
            chrg = new ArrayList<>();
        }
        return this.chrg;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
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
     * {@link Tax44 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax44> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
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
    public TelecomServicesLineItem4 setTtlAmt(BigDecimal value) {
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
    public TelecomServicesLineItem4 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
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
    public TelecomServicesLineItem4 addChrg(TelecomLineItemAmount1 chrg) {
        getChrg().add(chrg);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public TelecomServicesLineItem4 addTax(Tax44 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public TelecomServicesLineItem4 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public TelecomServicesLineItem4 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
