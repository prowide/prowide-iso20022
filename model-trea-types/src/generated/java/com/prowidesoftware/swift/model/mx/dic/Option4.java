
package com.prowidesoftware.swift.model.mx.dic;

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
 * List of elements which provide the parameters of an option trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Option4", propOrder = {
    "optnAmts",
    "strkPric",
    "exrcStyle",
    "earlstExrcDt",
    "xpryDtAndTm",
    "xpryLctn",
    "sttlmTp",
    "addtlOptnInf",
    "prm"
})
public class Option4 {

    @XmlElement(name = "OptnAmts", required = true)
    protected AmountsAndValueDate3 optnAmts;
    @XmlElement(name = "StrkPric", required = true)
    protected AgreedRate1 strkPric;
    @XmlElement(name = "ExrcStyle", required = true)
    @XmlSchemaType(name = "string")
    protected OptionStyle2Code exrcStyle;
    @XmlElement(name = "EarlstExrcDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earlstExrcDt;
    @XmlElement(name = "XpryDtAndTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xpryDtAndTm;
    @XmlElement(name = "XpryLctn", required = true)
    protected String xpryLctn;
    @XmlElement(name = "SttlmTp", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementType1Code sttlmTp;
    @XmlElement(name = "AddtlOptnInf")
    protected String addtlOptnInf;
    @XmlElement(name = "Prm", required = true)
    protected PremiumAmount2 prm;

    /**
     * Gets the value of the optnAmts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountsAndValueDate3 }
     *     
     */
    public AmountsAndValueDate3 getOptnAmts() {
        return optnAmts;
    }

    /**
     * Sets the value of the optnAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsAndValueDate3 }
     *     
     */
    public Option4 setOptnAmts(AmountsAndValueDate3 value) {
        this.optnAmts = value;
        return this;
    }

    /**
     * Gets the value of the strkPric property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate1 }
     *     
     */
    public AgreedRate1 getStrkPric() {
        return strkPric;
    }

    /**
     * Sets the value of the strkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate1 }
     *     
     */
    public Option4 setStrkPric(AgreedRate1 value) {
        this.strkPric = value;
        return this;
    }

    /**
     * Gets the value of the exrcStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OptionStyle2Code }
     *     
     */
    public OptionStyle2Code getExrcStyle() {
        return exrcStyle;
    }

    /**
     * Sets the value of the exrcStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStyle2Code }
     *     
     */
    public Option4 setExrcStyle(OptionStyle2Code value) {
        this.exrcStyle = value;
        return this;
    }

    /**
     * Gets the value of the earlstExrcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarlstExrcDt() {
        return earlstExrcDt;
    }

    /**
     * Sets the value of the earlstExrcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Option4 setEarlstExrcDt(XMLGregorianCalendar value) {
        this.earlstExrcDt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDtAndTm() {
        return xpryDtAndTm;
    }

    /**
     * Sets the value of the xpryDtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Option4 setXpryDtAndTm(XMLGregorianCalendar value) {
        this.xpryDtAndTm = value;
        return this;
    }

    /**
     * Gets the value of the xpryLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpryLctn() {
        return xpryLctn;
    }

    /**
     * Sets the value of the xpryLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Option4 setXpryLctn(String value) {
        this.xpryLctn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementType1Code }
     *     
     */
    public SettlementType1Code getSttlmTp() {
        return sttlmTp;
    }

    /**
     * Sets the value of the sttlmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementType1Code }
     *     
     */
    public Option4 setSttlmTp(SettlementType1Code value) {
        this.sttlmTp = value;
        return this;
    }

    /**
     * Gets the value of the addtlOptnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlOptnInf() {
        return addtlOptnInf;
    }

    /**
     * Sets the value of the addtlOptnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Option4 setAddtlOptnInf(String value) {
        this.addtlOptnInf = value;
        return this;
    }

    /**
     * Gets the value of the prm property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumAmount2 }
     *     
     */
    public PremiumAmount2 getPrm() {
        return prm;
    }

    /**
     * Sets the value of the prm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumAmount2 }
     *     
     */
    public Option4 setPrm(PremiumAmount2 value) {
        this.prm = value;
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

}
