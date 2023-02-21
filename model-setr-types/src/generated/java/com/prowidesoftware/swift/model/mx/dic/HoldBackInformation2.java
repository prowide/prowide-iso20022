
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about hold back and gating.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldBackInformation2", propOrder = {
    "tp",
    "amt",
    "xpctdRlsDt",
    "finInstrmId",
    "finInstrmNm",
    "redCmpltn",
    "fnlConf"
})
public class HoldBackInformation2 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected GateHoldBack1Code tp;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "XpctdRlsDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdRlsDt;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification25Choice finInstrmId;
    @XmlElement(name = "FinInstrmNm")
    protected String finInstrmNm;
    @XmlElement(name = "RedCmpltn")
    @XmlSchemaType(name = "string")
    protected RedemptionCompletion1Code redCmpltn;
    @XmlElement(name = "FnlConf")
    protected Boolean fnlConf;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link GateHoldBack1Code }
     *     
     */
    public GateHoldBack1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GateHoldBack1Code }
     *     
     */
    public HoldBackInformation2 setTp(GateHoldBack1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public HoldBackInformation2 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the xpctdRlsDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getXpctdRlsDt() {
        return xpctdRlsDt;
    }

    /**
     * Sets the value of the xpctdRlsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public HoldBackInformation2 setXpctdRlsDt(XMLGregorianCalendar value) {
        this.xpctdRlsDt = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification25Choice }
     *     
     */
    public SecurityIdentification25Choice getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification25Choice }
     *     
     */
    public HoldBackInformation2 setFinInstrmId(SecurityIdentification25Choice value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinInstrmNm() {
        return finInstrmNm;
    }

    /**
     * Sets the value of the finInstrmNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public HoldBackInformation2 setFinInstrmNm(String value) {
        this.finInstrmNm = value;
        return this;
    }

    /**
     * Gets the value of the redCmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionCompletion1Code }
     *     
     */
    public RedemptionCompletion1Code getRedCmpltn() {
        return redCmpltn;
    }

    /**
     * Sets the value of the redCmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionCompletion1Code }
     *     
     */
    public HoldBackInformation2 setRedCmpltn(RedemptionCompletion1Code value) {
        this.redCmpltn = value;
        return this;
    }

    /**
     * Gets the value of the fnlConf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFnlConf() {
        return fnlConf;
    }

    /**
     * Sets the value of the fnlConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public HoldBackInformation2 setFnlConf(Boolean value) {
        this.fnlConf = value;
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
