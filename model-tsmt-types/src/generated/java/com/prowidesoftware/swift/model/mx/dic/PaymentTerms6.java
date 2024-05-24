
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Specifies the payment terms of the underlying transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTerms6", propOrder = {
    "dueDt",
    "pmtPrd",
    "desc",
    "prtlPmtPct",
    "drctDbtMndtId",
    "bsisAmt",
    "dscntAmt",
    "dscntPctRate",
    "pnltyAmt",
    "pnltyPctRate"
})
public class PaymentTerms6 {

    @XmlElement(name = "DueDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dueDt;
    @XmlElement(name = "PmtPrd")
    protected PaymentPeriod1 pmtPrd;
    @XmlElement(name = "Desc")
    protected List<String> desc;
    @XmlElement(name = "PrtlPmtPct")
    protected BigDecimal prtlPmtPct;
    @XmlElement(name = "DrctDbtMndtId")
    protected List<String> drctDbtMndtId;
    @XmlElement(name = "BsisAmt")
    protected CurrencyAndAmount bsisAmt;
    @XmlElement(name = "DscntAmt")
    protected CurrencyAndAmount dscntAmt;
    @XmlElement(name = "DscntPctRate")
    protected BigDecimal dscntPctRate;
    @XmlElement(name = "PnltyAmt")
    protected CurrencyAndAmount pnltyAmt;
    @XmlElement(name = "PnltyPctRate")
    protected BigDecimal pnltyPctRate;

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTerms6 setDueDt(LocalDate value) {
        this.dueDt = value;
        return this;
    }

    /**
     * Gets the value of the pmtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPeriod1 }
     *     
     */
    public PaymentPeriod1 getPmtPrd() {
        return pmtPrd;
    }

    /**
     * Sets the value of the pmtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPeriod1 }
     *     
     */
    public PaymentTerms6 setPmtPrd(PaymentPeriod1 value) {
        this.pmtPrd = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the desc property.
     */
    public List<String> getDesc() {
        if (desc == null) {
            desc = new ArrayList<>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the prtlPmtPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrtlPmtPct() {
        return prtlPmtPct;
    }

    /**
     * Sets the value of the prtlPmtPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentTerms6 setPrtlPmtPct(BigDecimal value) {
        this.prtlPmtPct = value;
        return this;
    }

    /**
     * Gets the value of the drctDbtMndtId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the drctDbtMndtId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrctDbtMndtId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the drctDbtMndtId property.
     */
    public List<String> getDrctDbtMndtId() {
        if (drctDbtMndtId == null) {
            drctDbtMndtId = new ArrayList<>();
        }
        return this.drctDbtMndtId;
    }

    /**
     * Gets the value of the bsisAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getBsisAmt() {
        return bsisAmt;
    }

    /**
     * Sets the value of the bsisAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public PaymentTerms6 setBsisAmt(CurrencyAndAmount value) {
        this.bsisAmt = value;
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
    public PaymentTerms6 setDscntAmt(CurrencyAndAmount value) {
        this.dscntAmt = value;
        return this;
    }

    /**
     * Gets the value of the dscntPctRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDscntPctRate() {
        return dscntPctRate;
    }

    /**
     * Sets the value of the dscntPctRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentTerms6 setDscntPctRate(BigDecimal value) {
        this.dscntPctRate = value;
        return this;
    }

    /**
     * Gets the value of the pnltyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getPnltyAmt() {
        return pnltyAmt;
    }

    /**
     * Sets the value of the pnltyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public PaymentTerms6 setPnltyAmt(CurrencyAndAmount value) {
        this.pnltyAmt = value;
        return this;
    }

    /**
     * Gets the value of the pnltyPctRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPnltyPctRate() {
        return pnltyPctRate;
    }

    /**
     * Sets the value of the pnltyPctRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentTerms6 setPnltyPctRate(BigDecimal value) {
        this.pnltyPctRate = value;
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
     * Adds a new item to the desc list.
     * @see #getDesc()
     * 
     */
    public PaymentTerms6 addDesc(String desc) {
        getDesc().add(desc);
        return this;
    }

    /**
     * Adds a new item to the drctDbtMndtId list.
     * @see #getDrctDbtMndtId()
     * 
     */
    public PaymentTerms6 addDrctDbtMndtId(String drctDbtMndtId) {
        getDrctDbtMndtId().add(drctDbtMndtId);
        return this;
    }

}
