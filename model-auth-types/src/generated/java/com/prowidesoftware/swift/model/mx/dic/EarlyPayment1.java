
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the payment terms of the underlying transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarlyPayment1", propOrder = {
    "earlyPmtDt",
    "dscntPct",
    "dscntAmt",
    "earlyPmtTaxSpcfctn",
    "earlyPmtTaxTtl",
    "duePyblAmtWthEarlyPmt"
})
public class EarlyPayment1 {

    @XmlElement(name = "EarlyPmtDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earlyPmtDt;
    @XmlElement(name = "DscntPct", required = true)
    protected BigDecimal dscntPct;
    @XmlElement(name = "DscntAmt", required = true)
    protected CurrencyAndAmount dscntAmt;
    @XmlElement(name = "EarlyPmtTaxSpcfctn")
    protected List<EarlyPaymentsVAT1> earlyPmtTaxSpcfctn;
    @XmlElement(name = "EarlyPmtTaxTtl")
    protected CurrencyAndAmount earlyPmtTaxTtl;
    @XmlElement(name = "DuePyblAmtWthEarlyPmt")
    protected CurrencyAndAmount duePyblAmtWthEarlyPmt;

    /**
     * Gets the value of the earlyPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getEarlyPmtDt() {
        return earlyPmtDt;
    }

    /**
     * Sets the value of the earlyPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EarlyPayment1 setEarlyPmtDt(XMLGregorianCalendar value) {
        this.earlyPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the dscntPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDscntPct() {
        return dscntPct;
    }

    /**
     * Sets the value of the dscntPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public EarlyPayment1 setDscntPct(BigDecimal value) {
        this.dscntPct = value;
        return this;
    }

    /**
     * Gets the value of the dscntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getDscntAmt() {
        return dscntAmt;
    }

    /**
     * Sets the value of the dscntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public EarlyPayment1 setDscntAmt(CurrencyAndAmount value) {
        this.dscntAmt = value;
        return this;
    }

    /**
     * Gets the value of the earlyPmtTaxSpcfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the earlyPmtTaxSpcfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarlyPmtTaxSpcfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EarlyPaymentsVAT1 }
     * 
     * 
     */
    public List<EarlyPaymentsVAT1> getEarlyPmtTaxSpcfctn() {
        if (earlyPmtTaxSpcfctn == null) {
            earlyPmtTaxSpcfctn = new ArrayList<EarlyPaymentsVAT1>();
        }
        return this.earlyPmtTaxSpcfctn;
    }

    /**
     * Gets the value of the earlyPmtTaxTtl property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getEarlyPmtTaxTtl() {
        return earlyPmtTaxTtl;
    }

    /**
     * Sets the value of the earlyPmtTaxTtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public EarlyPayment1 setEarlyPmtTaxTtl(CurrencyAndAmount value) {
        this.earlyPmtTaxTtl = value;
        return this;
    }

    /**
     * Gets the value of the duePyblAmtWthEarlyPmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getDuePyblAmtWthEarlyPmt() {
        return duePyblAmtWthEarlyPmt;
    }

    /**
     * Sets the value of the duePyblAmtWthEarlyPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public EarlyPayment1 setDuePyblAmtWthEarlyPmt(CurrencyAndAmount value) {
        this.duePyblAmtWthEarlyPmt = value;
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
     * Adds a new item to the earlyPmtTaxSpcfctn list.
     * @see #getEarlyPmtTaxSpcfctn()
     * 
     */
    public EarlyPayment1 addEarlyPmtTaxSpcfctn(EarlyPaymentsVAT1 earlyPmtTaxSpcfctn) {
        getEarlyPmtTaxSpcfctn().add(earlyPmtTaxSpcfctn);
        return this;
    }

}
