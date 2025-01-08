
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
 * Numerical representation of the net increases and decreases in an account at a specific point in time. A cash balance is calculated from a sum of cash credits minus a sum of cash debits.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceDetails2", propOrder = {
    "balTp",
    "ctrPtyTp",
    "ctrPtyId",
    "balValDt"
})
public class BalanceDetails2 {

    @XmlElement(name = "BalTp")
    @XmlSchemaType(name = "string")
    protected List<BalanceType4Code> balTp;
    @XmlElement(name = "CtrPtyTp", required = true)
    @XmlSchemaType(name = "string")
    protected BalanceCounterparty1Code ctrPtyTp;
    @XmlElement(name = "CtrPtyId")
    protected List<MemberIdentificationChoice> ctrPtyId;
    @XmlElement(name = "BalValDt")
    protected List<DateAndDateTimeSearchChoice> balValDt;

    /**
     * Gets the value of the balTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceType4Code }
     * 
     * 
     * @return
     *     The value of the balTp property.
     */
    public List<BalanceType4Code> getBalTp() {
        if (balTp == null) {
            balTp = new ArrayList<>();
        }
        return this.balTp;
    }

    /**
     * Gets the value of the ctrPtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceCounterparty1Code }
     *     
     */
    public BalanceCounterparty1Code getCtrPtyTp() {
        return ctrPtyTp;
    }

    /**
     * Sets the value of the ctrPtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceCounterparty1Code }
     *     
     */
    public BalanceDetails2 setCtrPtyTp(BalanceCounterparty1Code value) {
        this.ctrPtyTp = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctrPtyId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrPtyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberIdentificationChoice }
     * 
     * 
     * @return
     *     The value of the ctrPtyId property.
     */
    public List<MemberIdentificationChoice> getCtrPtyId() {
        if (ctrPtyId == null) {
            ctrPtyId = new ArrayList<>();
        }
        return this.ctrPtyId;
    }

    /**
     * Gets the value of the balValDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balValDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalValDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateAndDateTimeSearchChoice }
     * 
     * 
     * @return
     *     The value of the balValDt property.
     */
    public List<DateAndDateTimeSearchChoice> getBalValDt() {
        if (balValDt == null) {
            balValDt = new ArrayList<>();
        }
        return this.balValDt;
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
     * Adds a new item to the balTp list.
     * @see #getBalTp()
     * 
     */
    public BalanceDetails2 addBalTp(BalanceType4Code balTp) {
        getBalTp().add(balTp);
        return this;
    }

    /**
     * Adds a new item to the ctrPtyId list.
     * @see #getCtrPtyId()
     * 
     */
    public BalanceDetails2 addCtrPtyId(MemberIdentificationChoice ctrPtyId) {
        getCtrPtyId().add(ctrPtyId);
        return this;
    }

    /**
     * Adds a new item to the balValDt list.
     * @see #getBalValDt()
     * 
     */
    public BalanceDetails2 addBalValDt(DateAndDateTimeSearchChoice balValDt) {
        getBalValDt().add(balValDt);
        return this;
    }

}
