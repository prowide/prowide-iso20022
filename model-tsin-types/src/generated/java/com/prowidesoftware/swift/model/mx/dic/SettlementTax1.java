
package com.prowidesoftware.swift.model.mx.dic;

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
 * Species the tax applicable for this settlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementTax1", propOrder = {
    "tpCd",
    "clctdAmt",
    "bsisAmt",
    "taxPtDt"
})
public class SettlementTax1 {

    @XmlElement(name = "TpCd")
    protected TaxTypeFormat1Choice tpCd;
    @XmlElement(name = "ClctdAmt")
    protected List<CurrencyAndAmount> clctdAmt;
    @XmlElement(name = "BsisAmt")
    protected List<CurrencyAndAmount> bsisAmt;
    @XmlElement(name = "TaxPtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxPtDt;

    /**
     * Gets the value of the tpCd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeFormat1Choice }
     *     
     */
    public TaxTypeFormat1Choice getTpCd() {
        return tpCd;
    }

    /**
     * Sets the value of the tpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeFormat1Choice }
     *     
     */
    public SettlementTax1 setTpCd(TaxTypeFormat1Choice value) {
        this.tpCd = value;
        return this;
    }

    /**
     * Gets the value of the clctdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clctdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClctdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     */
    public List<CurrencyAndAmount> getClctdAmt() {
        if (clctdAmt == null) {
            clctdAmt = new ArrayList<CurrencyAndAmount>();
        }
        return this.clctdAmt;
    }

    /**
     * Gets the value of the bsisAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bsisAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBsisAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     */
    public List<CurrencyAndAmount> getBsisAmt() {
        if (bsisAmt == null) {
            bsisAmt = new ArrayList<CurrencyAndAmount>();
        }
        return this.bsisAmt;
    }

    /**
     * Gets the value of the taxPtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTaxPtDt() {
        return taxPtDt;
    }

    /**
     * Sets the value of the taxPtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementTax1 setTaxPtDt(XMLGregorianCalendar value) {
        this.taxPtDt = value;
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
     * Adds a new item to the clctdAmt list.
     * @see #getClctdAmt()
     * 
     */
    public SettlementTax1 addClctdAmt(CurrencyAndAmount clctdAmt) {
        getClctdAmt().add(clctdAmt);
        return this;
    }

    /**
     * Adds a new item to the bsisAmt list.
     * @see #getBsisAmt()
     * 
     */
    public SettlementTax1 addBsisAmt(CurrencyAndAmount bsisAmt) {
        getBsisAmt().add(bsisAmt);
        return this;
    }

}
