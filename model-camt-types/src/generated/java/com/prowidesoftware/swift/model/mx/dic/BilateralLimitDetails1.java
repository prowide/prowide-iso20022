
package com.prowidesoftware.swift.model.mx.dic;

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
 * Characteristics and values set for a bilateral limit, including the counterparty upon which the limit applies
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BilateralLimitDetails1", propOrder = {
    "ctrPtyId",
    "lmtAmt",
    "cdtDbtInd",
    "bilBal"
})
public class BilateralLimitDetails1 {

    @XmlElement(name = "CtrPtyId", required = true)
    protected MemberIdentificationChoice ctrPtyId;
    @XmlElement(name = "LmtAmt", required = true)
    protected AmountChoice lmtAmt;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "BilBal")
    protected List<CashBalanceDetails3> bilBal;

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link MemberIdentificationChoice }
     *     
     */
    public MemberIdentificationChoice getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberIdentificationChoice }
     *     
     */
    public BilateralLimitDetails1 setCtrPtyId(MemberIdentificationChoice value) {
        this.ctrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the lmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountChoice }
     *     
     */
    public AmountChoice getLmtAmt() {
        return lmtAmt;
    }

    /**
     * Sets the value of the lmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountChoice }
     *     
     */
    public BilateralLimitDetails1 setLmtAmt(AmountChoice value) {
        this.lmtAmt = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public BilateralLimitDetails1 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the bilBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bilBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashBalanceDetails3 }
     * 
     * 
     */
    public List<CashBalanceDetails3> getBilBal() {
        if (bilBal == null) {
            bilBal = new ArrayList<CashBalanceDetails3>();
        }
        return this.bilBal;
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
     * Adds a new item to the bilBal list.
     * @see #getBilBal()
     * 
     */
    public BilateralLimitDetails1 addBilBal(CashBalanceDetails3 bilBal) {
        getBilBal().add(bilBal);
        return this;
    }

}
