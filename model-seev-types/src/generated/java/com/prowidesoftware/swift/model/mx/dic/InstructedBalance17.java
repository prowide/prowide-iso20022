
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "InstructedBalance17", propOrder = {
    "ttlInstdBal",
    "ttlAccptdInstrBal",
    "ttlCancInstrBal",
    "ttlPdgInstrBal",
    "ttlRjctdInstrBal",
    "ttlPrtctInstrBal",
    "optnDtls"
})
public class InstructedBalance17 {

    @XmlElement(name = "TtlInstdBal", required = true)
    protected BalanceFormat14Choice ttlInstdBal;
    @XmlElement(name = "TtlAccptdInstrBal")
    protected SignedQuantityFormat13 ttlAccptdInstrBal;
    @XmlElement(name = "TtlCancInstrBal")
    protected SignedQuantityFormat13 ttlCancInstrBal;
    @XmlElement(name = "TtlPdgInstrBal")
    protected SignedQuantityFormat13 ttlPdgInstrBal;
    @XmlElement(name = "TtlRjctdInstrBal")
    protected SignedQuantityFormat13 ttlRjctdInstrBal;
    @XmlElement(name = "TtlPrtctInstrBal")
    protected SignedQuantityFormat13 ttlPrtctInstrBal;
    @XmlElement(name = "OptnDtls")
    protected List<InstructedCorporateActionOption18> optnDtls;

    /**
     * Gets the value of the ttlInstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getTtlInstdBal() {
        return ttlInstdBal;
    }

    /**
     * Sets the value of the ttlInstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public InstructedBalance17 setTtlInstdBal(BalanceFormat14Choice value) {
        this.ttlInstdBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlAccptdInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getTtlAccptdInstrBal() {
        return ttlAccptdInstrBal;
    }

    /**
     * Sets the value of the ttlAccptdInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public InstructedBalance17 setTtlAccptdInstrBal(SignedQuantityFormat13 value) {
        this.ttlAccptdInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlCancInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getTtlCancInstrBal() {
        return ttlCancInstrBal;
    }

    /**
     * Sets the value of the ttlCancInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public InstructedBalance17 setTtlCancInstrBal(SignedQuantityFormat13 value) {
        this.ttlCancInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlPdgInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getTtlPdgInstrBal() {
        return ttlPdgInstrBal;
    }

    /**
     * Sets the value of the ttlPdgInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public InstructedBalance17 setTtlPdgInstrBal(SignedQuantityFormat13 value) {
        this.ttlPdgInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlRjctdInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getTtlRjctdInstrBal() {
        return ttlRjctdInstrBal;
    }

    /**
     * Sets the value of the ttlRjctdInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public InstructedBalance17 setTtlRjctdInstrBal(SignedQuantityFormat13 value) {
        this.ttlRjctdInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlPrtctInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getTtlPrtctInstrBal() {
        return ttlPrtctInstrBal;
    }

    /**
     * Sets the value of the ttlPrtctInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public InstructedBalance17 setTtlPrtctInstrBal(SignedQuantityFormat13 value) {
        this.ttlPrtctInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the optnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnDtls property.
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
     * {@link InstructedCorporateActionOption18 }
     * 
     * 
     * @return
     *     The value of the optnDtls property.
     */
    public List<InstructedCorporateActionOption18> getOptnDtls() {
        if (optnDtls == null) {
            optnDtls = new ArrayList<>();
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
    public InstructedBalance17 addOptnDtls(InstructedCorporateActionOption18 optnDtls) {
        getOptnDtls().add(optnDtls);
        return this;
    }

}
