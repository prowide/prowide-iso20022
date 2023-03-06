
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
 * Balance details for a cash account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashBalance12", propOrder = {
    "tp",
    "ctrPtyTp",
    "ctrPtyId",
    "valDt",
    "prcgDt"
})
public class CashBalance12 {

    @XmlElement(name = "Tp")
    protected List<BalanceType11Choice> tp;
    @XmlElement(name = "CtrPtyTp", required = true)
    @XmlSchemaType(name = "string")
    protected BalanceCounterparty1Code ctrPtyTp;
    @XmlElement(name = "CtrPtyId")
    protected List<BranchAndFinancialInstitutionIdentification6> ctrPtyId;
    @XmlElement(name = "ValDt")
    protected List<DateAndDateTimeSearch4Choice> valDt;
    @XmlElement(name = "PrcgDt")
    protected DateAndDateTimeSearch4Choice prcgDt;

    /**
     * Gets the value of the tp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceType11Choice }
     * 
     * 
     */
    public List<BalanceType11Choice> getTp() {
        if (tp == null) {
            tp = new ArrayList<BalanceType11Choice>();
        }
        return this.tp;
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
    public CashBalance12 setCtrPtyTp(BalanceCounterparty1Code value) {
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
     * {@link BranchAndFinancialInstitutionIdentification6 }
     * 
     * 
     */
    public List<BranchAndFinancialInstitutionIdentification6> getCtrPtyId() {
        if (ctrPtyId == null) {
            ctrPtyId = new ArrayList<BranchAndFinancialInstitutionIdentification6>();
        }
        return this.ctrPtyId;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateAndDateTimeSearch4Choice }
     * 
     * 
     */
    public List<DateAndDateTimeSearch4Choice> getValDt() {
        if (valDt == null) {
            valDt = new ArrayList<DateAndDateTimeSearch4Choice>();
        }
        return this.valDt;
    }

    /**
     * Gets the value of the prcgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch4Choice }
     *     
     */
    public DateAndDateTimeSearch4Choice getPrcgDt() {
        return prcgDt;
    }

    /**
     * Sets the value of the prcgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch4Choice }
     *     
     */
    public CashBalance12 setPrcgDt(DateAndDateTimeSearch4Choice value) {
        this.prcgDt = value;
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
     * Adds a new item to the tp list.
     * @see #getTp()
     * 
     */
    public CashBalance12 addTp(BalanceType11Choice tp) {
        getTp().add(tp);
        return this;
    }

    /**
     * Adds a new item to the ctrPtyId list.
     * @see #getCtrPtyId()
     * 
     */
    public CashBalance12 addCtrPtyId(BranchAndFinancialInstitutionIdentification6 ctrPtyId) {
        getCtrPtyId().add(ctrPtyId);
        return this;
    }

    /**
     * Adds a new item to the valDt list.
     * @see #getValDt()
     * 
     */
    public CashBalance12 addValDt(DateAndDateTimeSearch4Choice valDt) {
        getValDt().add(valDt);
        return this;
    }

}
