
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
 * Tax region that levies a tax on the services in a statement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingTaxRegion1", propOrder = {
    "rgnNb",
    "rgnNm",
    "cstmrTaxId",
    "ptDt",
    "sndgFI",
    "invcNb",
    "mtdC",
    "sttlmAmt",
    "taxDueToRgn"
})
public class BillingTaxRegion1 {

    @XmlElement(name = "RgnNb", required = true)
    protected String rgnNb;
    @XmlElement(name = "RgnNm", required = true)
    protected String rgnNm;
    @XmlElement(name = "CstmrTaxId", required = true)
    protected String cstmrTaxId;
    @XmlElement(name = "PtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ptDt;
    @XmlElement(name = "SndgFI")
    protected BillingTaxIdentification1 sndgFI;
    @XmlElement(name = "InvcNb")
    protected String invcNb;
    @XmlElement(name = "MtdC")
    protected BillingMethod4 mtdC;
    @XmlElement(name = "SttlmAmt", required = true)
    protected AmountAndDirection34 sttlmAmt;
    @XmlElement(name = "TaxDueToRgn", required = true)
    protected AmountAndDirection34 taxDueToRgn;

    /**
     * Gets the value of the rgnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgnNb() {
        return rgnNb;
    }

    /**
     * Sets the value of the rgnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingTaxRegion1 setRgnNb(String value) {
        this.rgnNb = value;
        return this;
    }

    /**
     * Gets the value of the rgnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgnNm() {
        return rgnNm;
    }

    /**
     * Sets the value of the rgnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingTaxRegion1 setRgnNm(String value) {
        this.rgnNm = value;
        return this;
    }

    /**
     * Gets the value of the cstmrTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrTaxId() {
        return cstmrTaxId;
    }

    /**
     * Sets the value of the cstmrTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingTaxRegion1 setCstmrTaxId(String value) {
        this.cstmrTaxId = value;
        return this;
    }

    /**
     * Gets the value of the ptDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPtDt() {
        return ptDt;
    }

    /**
     * Sets the value of the ptDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public BillingTaxRegion1 setPtDt(XMLGregorianCalendar value) {
        this.ptDt = value;
        return this;
    }

    /**
     * Gets the value of the sndgFI property.
     * 
     * @return
     *     possible object is
     *     {@link BillingTaxIdentification1 }
     *     
     */
    public BillingTaxIdentification1 getSndgFI() {
        return sndgFI;
    }

    /**
     * Sets the value of the sndgFI property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingTaxIdentification1 }
     *     
     */
    public BillingTaxRegion1 setSndgFI(BillingTaxIdentification1 value) {
        this.sndgFI = value;
        return this;
    }

    /**
     * Gets the value of the invcNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvcNb() {
        return invcNb;
    }

    /**
     * Sets the value of the invcNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingTaxRegion1 setInvcNb(String value) {
        this.invcNb = value;
        return this;
    }

    /**
     * Gets the value of the mtdC property.
     * 
     * @return
     *     possible object is
     *     {@link BillingMethod4 }
     *     
     */
    public BillingMethod4 getMtdC() {
        return mtdC;
    }

    /**
     * Sets the value of the mtdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingMethod4 }
     *     
     */
    public BillingTaxRegion1 setMtdC(BillingMethod4 value) {
        this.mtdC = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingTaxRegion1 setSttlmAmt(AmountAndDirection34 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxDueToRgn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getTaxDueToRgn() {
        return taxDueToRgn;
    }

    /**
     * Sets the value of the taxDueToRgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingTaxRegion1 setTaxDueToRgn(AmountAndDirection34 value) {
        this.taxDueToRgn = value;
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
