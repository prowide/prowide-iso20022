
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Commercial agreement in which the buyer agrees to pay the seller an amount of cash. Some aspects of the payment may be defined in the agreement, for example, the method of the payment
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremiumAmount3", propOrder = {
    "prmQt",
    "prmCcy",
    "amt",
    "dcmlPlcs",
    "prmSttlmDt",
    "pyerPtyRef",
    "rcvrPtyRef"
})
public class PremiumAmount3 {

    @XmlElement(name = "PrmQt", required = true)
    protected PremiumQuote1Choice prmQt;
    @XmlElement(name = "PrmCcy", required = true)
    protected String prmCcy;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "DcmlPlcs", required = true)
    protected BigDecimal dcmlPlcs;
    @XmlElement(name = "PrmSttlmDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prmSttlmDt;
    @XmlElement(name = "PyerPtyRef", required = true)
    protected String pyerPtyRef;
    @XmlElement(name = "RcvrPtyRef", required = true)
    protected String rcvrPtyRef;

    /**
     * Gets the value of the prmQt property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumQuote1Choice }
     *     
     */
    public PremiumQuote1Choice getPrmQt() {
        return prmQt;
    }

    /**
     * Sets the value of the prmQt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumQuote1Choice }
     *     
     */
    public PremiumAmount3 setPrmQt(PremiumQuote1Choice value) {
        this.prmQt = value;
        return this;
    }

    /**
     * Gets the value of the prmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrmCcy() {
        return prmCcy;
    }

    /**
     * Sets the value of the prmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PremiumAmount3 setPrmCcy(String value) {
        this.prmCcy = value;
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
    public PremiumAmount3 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the dcmlPlcs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDcmlPlcs() {
        return dcmlPlcs;
    }

    /**
     * Sets the value of the dcmlPlcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PremiumAmount3 setDcmlPlcs(BigDecimal value) {
        this.dcmlPlcs = value;
        return this;
    }

    /**
     * Gets the value of the prmSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getPrmSttlmDt() {
        return prmSttlmDt;
    }

    /**
     * Sets the value of the prmSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PremiumAmount3 setPrmSttlmDt(XMLGregorianCalendar value) {
        this.prmSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the pyerPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPyerPtyRef() {
        return pyerPtyRef;
    }

    /**
     * Sets the value of the pyerPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PremiumAmount3 setPyerPtyRef(String value) {
        this.pyerPtyRef = value;
        return this;
    }

    /**
     * Gets the value of the rcvrPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvrPtyRef() {
        return rcvrPtyRef;
    }

    /**
     * Sets the value of the rcvrPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PremiumAmount3 setRcvrPtyRef(String value) {
        this.rcvrPtyRef = value;
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
