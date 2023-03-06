
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Elements characterising a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes88", propOrder = {
    "ctrctTerm",
    "stdstn",
    "pmtFrqcy"
})
public class FinancialInstrumentAttributes88 {

    @XmlElement(name = "CtrctTerm")
    protected InterestRateContractTerm1 ctrctTerm;
    @XmlElement(name = "Stdstn")
    @XmlSchemaType(name = "string")
    protected List<Standardisation1Code> stdstn;
    @XmlElement(name = "PmtFrqcy", required = true)
    @XmlSchemaType(name = "string")
    protected Frequency11Code pmtFrqcy;

    /**
     * Gets the value of the ctrctTerm property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateContractTerm1 }
     *     
     */
    public InterestRateContractTerm1 getCtrctTerm() {
        return ctrctTerm;
    }

    /**
     * Sets the value of the ctrctTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateContractTerm1 }
     *     
     */
    public FinancialInstrumentAttributes88 setCtrctTerm(InterestRateContractTerm1 value) {
        this.ctrctTerm = value;
        return this;
    }

    /**
     * Gets the value of the stdstn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stdstn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStdstn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Standardisation1Code }
     * 
     * 
     */
    public List<Standardisation1Code> getStdstn() {
        if (stdstn == null) {
            stdstn = new ArrayList<Standardisation1Code>();
        }
        return this.stdstn;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency11Code }
     *     
     */
    public Frequency11Code getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency11Code }
     *     
     */
    public FinancialInstrumentAttributes88 setPmtFrqcy(Frequency11Code value) {
        this.pmtFrqcy = value;
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
     * Adds a new item to the stdstn list.
     * @see #getStdstn()
     * 
     */
    public FinancialInstrumentAttributes88 addStdstn(Standardisation1Code stdstn) {
        getStdstn().add(stdstn);
        return this;
    }

}
