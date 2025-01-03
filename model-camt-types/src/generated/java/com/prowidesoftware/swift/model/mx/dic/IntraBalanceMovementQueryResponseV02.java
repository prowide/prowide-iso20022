
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The IntraBalanceMovementQueryResponse message is sent from a settlement infrastructure to an account owner/requestor to provide all intra-balance movement instructions satisfying the selection criteria, as defined within the query, returning current attributes and latest status.
 * The message may also be used to: 
 * - re-send a message sent by the account owner to the account servicer (the sub-function of the message is "Duplicate") 
 * - provide a third party with a copy of a message being sent by the account owner for information (the sub-function of the message is "Copy") 
 * - re-send to a third party a copy of a message being sent by the account owner for information (the sub-function of the message is "Copy Duplicate").
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceMovementQueryResponseV02", propOrder = {
    "id",
    "pgntn",
    "rptGnlDtls",
    "rptOrErr"
})
public class IntraBalanceMovementQueryResponseV02 {

    @XmlElement(name = "Id")
    protected DocumentIdentification51 id;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "RptGnlDtls", required = true)
    protected MovementReport1 rptGnlDtls;
    @XmlElement(name = "RptOrErr")
    protected IntraBalanceOrOperationalError11Choice rptOrErr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification51 }
     *     
     */
    public DocumentIdentification51 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification51 }
     *     
     */
    public IntraBalanceMovementQueryResponseV02 setId(DocumentIdentification51 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public IntraBalanceMovementQueryResponseV02 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the rptGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link MovementReport1 }
     *     
     */
    public MovementReport1 getRptGnlDtls() {
        return rptGnlDtls;
    }

    /**
     * Sets the value of the rptGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementReport1 }
     *     
     */
    public IntraBalanceMovementQueryResponseV02 setRptGnlDtls(MovementReport1 value) {
        this.rptGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the rptOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceOrOperationalError11Choice }
     *     
     */
    public IntraBalanceOrOperationalError11Choice getRptOrErr() {
        return rptOrErr;
    }

    /**
     * Sets the value of the rptOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceOrOperationalError11Choice }
     *     
     */
    public IntraBalanceMovementQueryResponseV02 setRptOrErr(IntraBalanceOrOperationalError11Choice value) {
        this.rptOrErr = value;
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

}
