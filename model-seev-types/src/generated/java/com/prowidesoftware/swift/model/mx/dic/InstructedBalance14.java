
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
@XmlType(name = "InstructedBalance14", propOrder = {
    "ttlInstdBal",
    "ttlAccptdInstrBal",
    "ttlCancInstrBal",
    "ttlPdgInstrBal",
    "ttlRjctdInstrBal",
    "ttlPrtctInstrBal",
    "optnDtls"
})
public class InstructedBalance14 {

    @XmlElement(name = "TtlInstdBal", required = true)
    protected BalanceFormat5Choice ttlInstdBal;
    @XmlElement(name = "TtlAccptdInstrBal")
    protected SignedQuantityFormat6 ttlAccptdInstrBal;
    @XmlElement(name = "TtlCancInstrBal")
    protected SignedQuantityFormat6 ttlCancInstrBal;
    @XmlElement(name = "TtlPdgInstrBal")
    protected SignedQuantityFormat6 ttlPdgInstrBal;
    @XmlElement(name = "TtlRjctdInstrBal")
    protected SignedQuantityFormat6 ttlRjctdInstrBal;
    @XmlElement(name = "TtlPrtctInstrBal")
    protected SignedQuantityFormat6 ttlPrtctInstrBal;
    @XmlElement(name = "OptnDtls")
    protected List<InstructedCorporateActionOption15> optnDtls;

    /**
     * Gets the value of the ttlInstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getTtlInstdBal() {
        return ttlInstdBal;
    }

    /**
     * Sets the value of the ttlInstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public InstructedBalance14 setTtlInstdBal(BalanceFormat5Choice value) {
        this.ttlInstdBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlAccptdInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getTtlAccptdInstrBal() {
        return ttlAccptdInstrBal;
    }

    /**
     * Sets the value of the ttlAccptdInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public InstructedBalance14 setTtlAccptdInstrBal(SignedQuantityFormat6 value) {
        this.ttlAccptdInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlCancInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getTtlCancInstrBal() {
        return ttlCancInstrBal;
    }

    /**
     * Sets the value of the ttlCancInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public InstructedBalance14 setTtlCancInstrBal(SignedQuantityFormat6 value) {
        this.ttlCancInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlPdgInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getTtlPdgInstrBal() {
        return ttlPdgInstrBal;
    }

    /**
     * Sets the value of the ttlPdgInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public InstructedBalance14 setTtlPdgInstrBal(SignedQuantityFormat6 value) {
        this.ttlPdgInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlRjctdInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getTtlRjctdInstrBal() {
        return ttlRjctdInstrBal;
    }

    /**
     * Sets the value of the ttlRjctdInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public InstructedBalance14 setTtlRjctdInstrBal(SignedQuantityFormat6 value) {
        this.ttlRjctdInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlPrtctInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getTtlPrtctInstrBal() {
        return ttlPrtctInstrBal;
    }

    /**
     * Sets the value of the ttlPrtctInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public InstructedBalance14 setTtlPrtctInstrBal(SignedQuantityFormat6 value) {
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
     * {@link InstructedCorporateActionOption15 }
     * 
     * 
     */
    public List<InstructedCorporateActionOption15> getOptnDtls() {
        if (optnDtls == null) {
            optnDtls = new ArrayList<InstructedCorporateActionOption15>();
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
    public InstructedBalance14 addOptnDtls(InstructedCorporateActionOption15 optnDtls) {
        getOptnDtls().add(optnDtls);
        return this;
    }

}
