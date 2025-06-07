
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * ATM cassette counter per unit value or globally.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCassetteCounters1", propOrder = {
    "unitVal",
    "ccy",
    "itmTp",
    "cntr",
    "curNb",
    "curAmt"
})
public class ATMCassetteCounters1 {

    @XmlElement(name = "UnitVal")
    protected BigDecimal unitVal;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "ItmTp")
    @XmlSchemaType(name = "string")
    protected ATMNoteType2Code itmTp;
    @XmlElement(name = "Cntr")
    protected List<ATMCassetteCounters2> cntr;
    @XmlElement(name = "CurNb", required = true)
    protected BigDecimal curNb;
    @XmlElement(name = "CurAmt")
    protected BigDecimal curAmt;

    /**
     * Gets the value of the unitVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitVal() {
        return unitVal;
    }

    /**
     * Sets the value of the unitVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters1 setUnitVal(BigDecimal value) {
        this.unitVal = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCassetteCounters1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the itmTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMNoteType2Code }
     *     
     */
    public ATMNoteType2Code getItmTp() {
        return itmTp;
    }

    /**
     * Sets the value of the itmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMNoteType2Code }
     *     
     */
    public ATMCassetteCounters1 setItmTp(ATMNoteType2Code value) {
        this.itmTp = value;
        return this;
    }

    /**
     * Gets the value of the cntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCassetteCounters2 }
     * 
     * 
     */
    public List<ATMCassetteCounters2> getCntr() {
        if (cntr == null) {
            cntr = new ArrayList<ATMCassetteCounters2>();
        }
        return this.cntr;
    }

    /**
     * Gets the value of the curNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurNb() {
        return curNb;
    }

    /**
     * Sets the value of the curNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters1 setCurNb(BigDecimal value) {
        this.curNb = value;
        return this;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters1 setCurAmt(BigDecimal value) {
        this.curAmt = value;
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
     * Adds a new item to the cntr list.
     * @see #getCntr()
     * 
     */
    public ATMCassetteCounters1 addCntr(ATMCassetteCounters2 cntr) {
        getCntr().add(cntr);
        return this;
    }

}
