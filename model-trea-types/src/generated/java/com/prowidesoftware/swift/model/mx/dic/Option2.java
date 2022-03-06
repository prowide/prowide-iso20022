
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
@XmlType(name = "Option2", propOrder = {
    "optnAmts",
    "strkPric",
    "prm",
    "exrcStyle",
    "earlstExrcDt",
    "xpryDtAndTm",
    "xpryLctn",
    "sttlmTp",
    "addtlOptnInf"
})
public class Option2 {

    @XmlElement(name = "OptnAmts", required = true)
    protected AmountsAndValueDate2 optnAmts;
    @XmlElement(name = "StrkPric", required = true)
    protected AgreedRate1 strkPric;
    @XmlElement(name = "Prm", required = true)
    protected PremiumAmount1 prm;
    @XmlElement(name = "ExrcStyle", required = true)
    @XmlSchemaType(name = "string")
    protected OptionStyle2Code exrcStyle;
    @XmlElement(name = "EarlstExrcDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earlstExrcDt;
    @XmlElement(name = "XpryDtAndTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xpryDtAndTm;
    @XmlElement(name = "XpryLctn", required = true)
    protected String xpryLctn;
    @XmlElement(name = "SttlmTp", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementType1Code sttlmTp;
    @XmlElement(name = "AddtlOptnInf")
    protected String addtlOptnInf;

    /**
     * Gets the value of the optnAmts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountsAndValueDate2 }
     *     
     */
    public AmountsAndValueDate2 getOptnAmts() {
        return optnAmts;
    }

    /**
     * Sets the value of the optnAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsAndValueDate2 }
     *     
     */
    public Option2 setOptnAmts(AmountsAndValueDate2 value) {
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
    public Option2 setStrkPric(AgreedRate1 value) {
        this.strkPric = value;
        return this;
    }

    /**
     * Gets the value of the prm property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumAmount1 }
     *     
     */
    public PremiumAmount1 getPrm() {
        return prm;
    }

    /**
     * Sets the value of the prm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumAmount1 }
     *     
     */
    public Option2 setPrm(PremiumAmount1 value) {
        this.prm = value;
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
    public Option2 setExrcStyle(OptionStyle2Code value) {
        this.exrcStyle = value;
        return this;
    }

    /**
     * Gets the value of the earlstExrcDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public Option2 setEarlstExrcDt(XMLGregorianCalendar value) {
        this.earlstExrcDt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public Option2 setXpryDtAndTm(XMLGregorianCalendar value) {
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
    public Option2 setXpryLctn(String value) {
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
    public Option2 setSttlmTp(SettlementType1Code value) {
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
    public Option2 setAddtlOptnInf(String value) {
        this.addtlOptnInf = value;
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
