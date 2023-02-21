
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
@XmlType(name = "PaymentTerms3", propOrder = {
    "dueDt",
    "pmtPrd",
    "desc",
    "prtlPmtPct",
    "drctDbtMndtId",
    "dscntAmt",
    "dscntPctRate",
    "dscntBsisAmt",
    "pnltyAmt",
    "pnltyPctRate",
    "pnltyBsisAmt"
})
public class PaymentTerms3 {

    @XmlElement(name = "DueDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "PmtPrd")
    protected PaymentPeriod1 pmtPrd;
    @XmlElement(name = "Desc")
    protected List<String> desc;
    @XmlElement(name = "PrtlPmtPct")
    protected BigDecimal prtlPmtPct;
    @XmlElement(name = "DrctDbtMndtId")
    protected List<String> drctDbtMndtId;
    @XmlElement(name = "DscntAmt")
    protected CurrencyAndAmount dscntAmt;
    @XmlElement(name = "DscntPctRate")
    protected BigDecimal dscntPctRate;
    @XmlElement(name = "DscntBsisAmt")
    protected CurrencyAndAmount dscntBsisAmt;
    @XmlElement(name = "PnltyAmt")
    protected CurrencyAndAmount pnltyAmt;
    @XmlElement(name = "PnltyPctRate")
    protected BigDecimal pnltyPctRate;
    @XmlElement(name = "PnltyBsisAmt")
    protected CurrencyAndAmount pnltyBsisAmt;

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDueDt() {
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
    public PaymentTerms3 setDueDt(XMLGregorianCalendar value) {
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
    public PaymentTerms3 setPmtPrd(PaymentPeriod1 value) {
        this.pmtPrd = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.
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
     */
    public List<String> getDesc() {
        if (desc == null) {
            desc = new ArrayList<String>();
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
    public PaymentTerms3 setPrtlPmtPct(BigDecimal value) {
        this.prtlPmtPct = value;
        return this;
    }

    /**
     * Gets the value of the drctDbtMndtId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drctDbtMndtId property.
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
     */
    public List<String> getDrctDbtMndtId() {
        if (drctDbtMndtId == null) {
            drctDbtMndtId = new ArrayList<String>();
        }
        return this.drctDbtMndtId;
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
    public PaymentTerms3 setDscntAmt(CurrencyAndAmount value) {
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
    public PaymentTerms3 setDscntPctRate(BigDecimal value) {
        this.dscntPctRate = value;
        return this;
    }

    /**
     * Gets the value of the dscntBsisAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getDscntBsisAmt() {
        return dscntBsisAmt;
    }

    /**
     * Sets the value of the dscntBsisAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public PaymentTerms3 setDscntBsisAmt(CurrencyAndAmount value) {
        this.dscntBsisAmt = value;
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
    public PaymentTerms3 setPnltyAmt(CurrencyAndAmount value) {
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
    public PaymentTerms3 setPnltyPctRate(BigDecimal value) {
        this.pnltyPctRate = value;
        return this;
    }

    /**
     * Gets the value of the pnltyBsisAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getPnltyBsisAmt() {
        return pnltyBsisAmt;
    }

    /**
     * Sets the value of the pnltyBsisAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public PaymentTerms3 setPnltyBsisAmt(CurrencyAndAmount value) {
        this.pnltyBsisAmt = value;
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
    public PaymentTerms3 addDesc(String desc) {
        getDesc().add(desc);
        return this;
    }

    /**
     * Adds a new item to the drctDbtMndtId list.
     * @see #getDrctDbtMndtId()
     * 
     */
    public PaymentTerms3 addDrctDbtMndtId(String drctDbtMndtId) {
        getDrctDbtMndtId().add(drctDbtMndtId);
        return this;
    }

}
