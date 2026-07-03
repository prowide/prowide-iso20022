
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information about total instructed balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructedBalance16", propOrder = {
    "ttlInstdBal",
    "ttlAccptdInstrBal",
    "ttlCancInstrBal",
    "ttlPdgInstrBal",
    "ttlRjctdInstrBal",
    "ttlPrtctInstrBal",
    "optnDtls"
})
public class InstructedBalance16 {

    @XmlElement(name = "TtlInstdBal", required = true)
    protected BalanceFormat11Choice ttlInstdBal;
    @XmlElement(name = "TtlAccptdInstrBal")
    protected SignedQuantityFormat10 ttlAccptdInstrBal;
    @XmlElement(name = "TtlCancInstrBal")
    protected SignedQuantityFormat10 ttlCancInstrBal;
    @XmlElement(name = "TtlPdgInstrBal")
    protected SignedQuantityFormat10 ttlPdgInstrBal;
    @XmlElement(name = "TtlRjctdInstrBal")
    protected SignedQuantityFormat10 ttlRjctdInstrBal;
    @XmlElement(name = "TtlPrtctInstrBal")
    protected SignedQuantityFormat10 ttlPrtctInstrBal;
    @XmlElement(name = "OptnDtls")
    protected List<InstructedCorporateActionOption17> optnDtls;

    /**
     * Gets the value of the ttlInstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat11Choice }
     *     
     */
    public BalanceFormat11Choice getTtlInstdBal() {
        return ttlInstdBal;
    }

    /**
     * Sets the value of the ttlInstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat11Choice }
     *     
     */
    public InstructedBalance16 setTtlInstdBal(BalanceFormat11Choice value) {
        this.ttlInstdBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlAccptdInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getTtlAccptdInstrBal() {
        return ttlAccptdInstrBal;
    }

    /**
     * Sets the value of the ttlAccptdInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public InstructedBalance16 setTtlAccptdInstrBal(SignedQuantityFormat10 value) {
        this.ttlAccptdInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlCancInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getTtlCancInstrBal() {
        return ttlCancInstrBal;
    }

    /**
     * Sets the value of the ttlCancInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public InstructedBalance16 setTtlCancInstrBal(SignedQuantityFormat10 value) {
        this.ttlCancInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlPdgInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getTtlPdgInstrBal() {
        return ttlPdgInstrBal;
    }

    /**
     * Sets the value of the ttlPdgInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public InstructedBalance16 setTtlPdgInstrBal(SignedQuantityFormat10 value) {
        this.ttlPdgInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlRjctdInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getTtlRjctdInstrBal() {
        return ttlRjctdInstrBal;
    }

    /**
     * Sets the value of the ttlRjctdInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public InstructedBalance16 setTtlRjctdInstrBal(SignedQuantityFormat10 value) {
        this.ttlRjctdInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlPrtctInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getTtlPrtctInstrBal() {
        return ttlPrtctInstrBal;
    }

    /**
     * Sets the value of the ttlPrtctInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public InstructedBalance16 setTtlPrtctInstrBal(SignedQuantityFormat10 value) {
        this.ttlPrtctInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the optnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructedCorporateActionOption17 }
     * 
     * 
     */
    public List<InstructedCorporateActionOption17> getOptnDtls() {
        if (optnDtls == null) {
            optnDtls = new ArrayList<InstructedCorporateActionOption17>();
        }
        return this.optnDtls;
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
     * Adds a new item to the optnDtls list.
     * @see #getOptnDtls()
     * 
     */
    public InstructedBalance16 addOptnDtls(InstructedCorporateActionOption17 optnDtls) {
        getOptnDtls().add(optnDtls);
        return this;
    }

}
