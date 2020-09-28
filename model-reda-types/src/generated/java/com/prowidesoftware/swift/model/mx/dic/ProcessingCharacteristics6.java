
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Processing characteristics linked to a switch order for an investment fund or alternative/hedge fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingCharacteristics6", propOrder = {
    "dealgCcyAccptd",
    "swtchAuthstn",
    "amtInd",
    "unitsInd",
    "rndg",
    "mainFndOrdrDskLctn",
    "dealgFrqcy",
    "dealgFrqcyDesc",
    "dealgCutOffTm",
    "dealgCutOffTmFrame",
    "dealConfTm",
    "dealConfTmFrame",
    "ltdPrd",
    "sttlmCycl",
    "addtlInf"
})
public class ProcessingCharacteristics6 {

    @XmlElement(name = "DealgCcyAccptd")
    protected List<String> dealgCcyAccptd;
    @XmlElement(name = "SwtchAuthstn")
    protected Forms1 swtchAuthstn;
    @XmlElement(name = "AmtInd")
    protected Boolean amtInd;
    @XmlElement(name = "UnitsInd")
    protected Boolean unitsInd;
    @XmlElement(name = "Rndg")
    @XmlSchemaType(name = "string")
    protected RoundingDirection2Code rndg;
    @XmlElement(name = "MainFndOrdrDskLctn")
    protected MainFundOrderDeskLocation1 mainFndOrdrDskLctn;
    @XmlElement(name = "DealgFrqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency5Code dealgFrqcy;
    @XmlElement(name = "DealgFrqcyDesc")
    protected String dealgFrqcyDesc;
    @XmlElement(name = "DealgCutOffTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar dealgCutOffTm;
    @XmlElement(name = "DealgCutOffTmFrame")
    protected TimeFrame4 dealgCutOffTmFrame;
    @XmlElement(name = "DealConfTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar dealConfTm;
    @XmlElement(name = "DealConfTmFrame")
    protected TimeFrame5 dealConfTmFrame;
    @XmlElement(name = "LtdPrd")
    protected String ltdPrd;
    @XmlElement(name = "SttlmCycl")
    protected TimeFrame8Choice sttlmCycl;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the dealgCcyAccptd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dealgCcyAccptd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDealgCcyAccptd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDealgCcyAccptd() {
        if (dealgCcyAccptd == null) {
            dealgCcyAccptd = new ArrayList<String>();
        }
        return this.dealgCcyAccptd;
    }

    /**
     * Gets the value of the swtchAuthstn property.
     * 
     * @return
     *     possible object is
     *     {@link Forms1 }
     *     
     */
    public Forms1 getSwtchAuthstn() {
        return swtchAuthstn;
    }

    /**
     * Sets the value of the swtchAuthstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Forms1 }
     *     
     */
    public ProcessingCharacteristics6 setSwtchAuthstn(Forms1 value) {
        this.swtchAuthstn = value;
        return this;
    }

    /**
     * Gets the value of the amtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmtInd() {
        return amtInd;
    }

    /**
     * Sets the value of the amtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ProcessingCharacteristics6 setAmtInd(Boolean value) {
        this.amtInd = value;
        return this;
    }

    /**
     * Gets the value of the unitsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnitsInd() {
        return unitsInd;
    }

    /**
     * Sets the value of the unitsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ProcessingCharacteristics6 setUnitsInd(Boolean value) {
        this.unitsInd = value;
        return this;
    }

    /**
     * Gets the value of the rndg property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingDirection2Code }
     *     
     */
    public RoundingDirection2Code getRndg() {
        return rndg;
    }

    /**
     * Sets the value of the rndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingDirection2Code }
     *     
     */
    public ProcessingCharacteristics6 setRndg(RoundingDirection2Code value) {
        this.rndg = value;
        return this;
    }

    /**
     * Gets the value of the mainFndOrdrDskLctn property.
     * 
     * @return
     *     possible object is
     *     {@link MainFundOrderDeskLocation1 }
     *     
     */
    public MainFundOrderDeskLocation1 getMainFndOrdrDskLctn() {
        return mainFndOrdrDskLctn;
    }

    /**
     * Sets the value of the mainFndOrdrDskLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainFundOrderDeskLocation1 }
     *     
     */
    public ProcessingCharacteristics6 setMainFndOrdrDskLctn(MainFundOrderDeskLocation1 value) {
        this.mainFndOrdrDskLctn = value;
        return this;
    }

    /**
     * Gets the value of the dealgFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency5Code }
     *     
     */
    public EventFrequency5Code getDealgFrqcy() {
        return dealgFrqcy;
    }

    /**
     * Sets the value of the dealgFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency5Code }
     *     
     */
    public ProcessingCharacteristics6 setDealgFrqcy(EventFrequency5Code value) {
        this.dealgFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the dealgFrqcyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealgFrqcyDesc() {
        return dealgFrqcyDesc;
    }

    /**
     * Sets the value of the dealgFrqcyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingCharacteristics6 setDealgFrqcyDesc(String value) {
        this.dealgFrqcyDesc = value;
        return this;
    }

    /**
     * Gets the value of the dealgCutOffTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDealgCutOffTm() {
        return dealgCutOffTm;
    }

    /**
     * Sets the value of the dealgCutOffTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ProcessingCharacteristics6 setDealgCutOffTm(XMLGregorianCalendar value) {
        this.dealgCutOffTm = value;
        return this;
    }

    /**
     * Gets the value of the dealgCutOffTmFrame property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrame4 }
     *     
     */
    public TimeFrame4 getDealgCutOffTmFrame() {
        return dealgCutOffTmFrame;
    }

    /**
     * Sets the value of the dealgCutOffTmFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrame4 }
     *     
     */
    public ProcessingCharacteristics6 setDealgCutOffTmFrame(TimeFrame4 value) {
        this.dealgCutOffTmFrame = value;
        return this;
    }

    /**
     * Gets the value of the dealConfTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDealConfTm() {
        return dealConfTm;
    }

    /**
     * Sets the value of the dealConfTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ProcessingCharacteristics6 setDealConfTm(XMLGregorianCalendar value) {
        this.dealConfTm = value;
        return this;
    }

    /**
     * Gets the value of the dealConfTmFrame property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrame5 }
     *     
     */
    public TimeFrame5 getDealConfTmFrame() {
        return dealConfTmFrame;
    }

    /**
     * Sets the value of the dealConfTmFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrame5 }
     *     
     */
    public ProcessingCharacteristics6 setDealConfTmFrame(TimeFrame5 value) {
        this.dealConfTmFrame = value;
        return this;
    }

    /**
     * Gets the value of the ltdPrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtdPrd() {
        return ltdPrd;
    }

    /**
     * Sets the value of the ltdPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingCharacteristics6 setLtdPrd(String value) {
        this.ltdPrd = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCycl property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrame8Choice }
     *     
     */
    public TimeFrame8Choice getSttlmCycl() {
        return sttlmCycl;
    }

    /**
     * Sets the value of the sttlmCycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrame8Choice }
     *     
     */
    public ProcessingCharacteristics6 setSttlmCycl(TimeFrame8Choice value) {
        this.sttlmCycl = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<AdditionalInformation15>();
        }
        return this.addtlInf;
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
     * Adds a new item to the dealgCcyAccptd list.
     * @see #getDealgCcyAccptd()
     * 
     */
    public ProcessingCharacteristics6 addDealgCcyAccptd(String dealgCcyAccptd) {
        getDealgCcyAccptd().add(dealgCcyAccptd);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public ProcessingCharacteristics6 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
