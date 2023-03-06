
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
 * Further information on the return reason of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnReasonInformation5", propOrder = {
    "orgnlBkTxCd",
    "rtrOrgtr",
    "rtrRsn",
    "addtlRtrRsnInf"
})
public class ReturnReasonInformation5 {

    @XmlElement(name = "OrgnlBkTxCd")
    protected BankTransactionCodeStructure1 orgnlBkTxCd;
    @XmlElement(name = "RtrOrgtr")
    protected PartyIdentification8 rtrOrgtr;
    @XmlElement(name = "RtrRsn")
    protected ReturnReason1Choice rtrRsn;
    @XmlElement(name = "AddtlRtrRsnInf")
    protected List<String> addtlRtrRsnInf;

    /**
     * Gets the value of the orgnlBkTxCd property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure1 }
     *     
     */
    public BankTransactionCodeStructure1 getOrgnlBkTxCd() {
        return orgnlBkTxCd;
    }

    /**
     * Sets the value of the orgnlBkTxCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure1 }
     *     
     */
    public ReturnReasonInformation5 setOrgnlBkTxCd(BankTransactionCodeStructure1 value) {
        this.orgnlBkTxCd = value;
        return this;
    }

    /**
     * Gets the value of the rtrOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getRtrOrgtr() {
        return rtrOrgtr;
    }

    /**
     * Sets the value of the rtrOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public ReturnReasonInformation5 setRtrOrgtr(PartyIdentification8 value) {
        this.rtrOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the rtrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnReason1Choice }
     *     
     */
    public ReturnReason1Choice getRtrRsn() {
        return rtrRsn;
    }

    /**
     * Sets the value of the rtrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnReason1Choice }
     *     
     */
    public ReturnReasonInformation5 setRtrRsn(ReturnReason1Choice value) {
        this.rtrRsn = value;
        return this;
    }

    /**
     * Gets the value of the addtlRtrRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlRtrRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRtrRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlRtrRsnInf() {
        if (addtlRtrRsnInf == null) {
            addtlRtrRsnInf = new ArrayList<String>();
        }
        return this.addtlRtrRsnInf;
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
     * Adds a new item to the addtlRtrRsnInf list.
     * @see #getAddtlRtrRsnInf()
     * 
     */
    public ReturnReasonInformation5 addAddtlRtrRsnInf(String addtlRtrRsnInf) {
        getAddtlRtrRsnInf().add(addtlRtrRsnInf);
        return this;
    }

}
