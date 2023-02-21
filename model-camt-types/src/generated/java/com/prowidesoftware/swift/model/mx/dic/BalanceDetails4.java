
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
 * Balance related detailed for a cash account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceDetails4", propOrder = {
    "balTp",
    "ctrPtyTp",
    "ctrPtyId",
    "balValDt"
})
public class BalanceDetails4 {

    @XmlElement(name = "BalTp")
    protected List<BalanceType3Choice> balTp;
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
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balTp property.
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
     * {@link BalanceType3Choice }
     * 
     * 
     */
    public List<BalanceType3Choice> getBalTp() {
        if (balTp == null) {
            balTp = new ArrayList<BalanceType3Choice>();
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
    public BalanceDetails4 setCtrPtyTp(BalanceCounterparty1Code value) {
        this.ctrPtyTp = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctrPtyId property.
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
     */
    public List<MemberIdentificationChoice> getCtrPtyId() {
        if (ctrPtyId == null) {
            ctrPtyId = new ArrayList<MemberIdentificationChoice>();
        }
        return this.ctrPtyId;
    }

    /**
     * Gets the value of the balValDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balValDt property.
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
     */
    public List<DateAndDateTimeSearchChoice> getBalValDt() {
        if (balValDt == null) {
            balValDt = new ArrayList<DateAndDateTimeSearchChoice>();
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
    public BalanceDetails4 addBalTp(BalanceType3Choice balTp) {
        getBalTp().add(balTp);
        return this;
    }

    /**
     * Adds a new item to the ctrPtyId list.
     * @see #getCtrPtyId()
     * 
     */
    public BalanceDetails4 addCtrPtyId(MemberIdentificationChoice ctrPtyId) {
        getCtrPtyId().add(ctrPtyId);
        return this;
    }

    /**
     * Adds a new item to the balValDt list.
     * @see #getBalValDt()
     * 
     */
    public BalanceDetails4 addBalValDt(DateAndDateTimeSearchChoice balValDt) {
        getBalValDt().add(balValDt);
        return this;
    }

}
