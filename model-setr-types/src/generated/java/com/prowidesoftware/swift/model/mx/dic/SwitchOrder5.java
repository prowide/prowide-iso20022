
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
 * Extract of trade data for a switch order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchOrder5", propOrder = {
    "invstmtAcctDtls",
    "redLeg",
    "sbcptLeg"
})
public class SwitchOrder5 {

    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount30 invstmtAcctDtls;
    @XmlElement(name = "RedLeg", required = true)
    protected List<SwitchRedemptionLegOrder4> redLeg;
    @XmlElement(name = "SbcptLeg", required = true)
    protected List<SwitchSubscriptionLegOrder4> sbcptLeg;

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount30 }
     *     
     */
    public InvestmentAccount30 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount30 }
     *     
     */
    public SwitchOrder5 setInvstmtAcctDtls(InvestmentAccount30 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the redLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the redLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchRedemptionLegOrder4 }
     * 
     * 
     * @return
     *     The value of the redLeg property.
     */
    public List<SwitchRedemptionLegOrder4> getRedLeg() {
        if (redLeg == null) {
            redLeg = new ArrayList<>();
        }
        return this.redLeg;
    }

    /**
     * Gets the value of the sbcptLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sbcptLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSbcptLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchSubscriptionLegOrder4 }
     * 
     * 
     * @return
     *     The value of the sbcptLeg property.
     */
    public List<SwitchSubscriptionLegOrder4> getSbcptLeg() {
        if (sbcptLeg == null) {
            sbcptLeg = new ArrayList<>();
        }
        return this.sbcptLeg;
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
     * Adds a new item to the redLeg list.
     * @see #getRedLeg()
     * 
     */
    public SwitchOrder5 addRedLeg(SwitchRedemptionLegOrder4 redLeg) {
        getRedLeg().add(redLeg);
        return this;
    }

    /**
     * Adds a new item to the sbcptLeg list.
     * @see #getSbcptLeg()
     * 
     */
    public SwitchOrder5 addSbcptLeg(SwitchSubscriptionLegOrder4 sbcptLeg) {
        getSbcptLeg().add(sbcptLeg);
        return this;
    }

}
