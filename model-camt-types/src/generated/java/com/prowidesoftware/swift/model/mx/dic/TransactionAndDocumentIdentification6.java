
package com.prowidesoftware.swift.model.mx.dic;

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
 * Transaction and document identification details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAndDocumentIdentification6", propOrder = {
    "txId",
    "docId",
    "creDtTm",
    "cpyDplct",
    "msgOrgtr",
    "msgRcpt"
})
public class TransactionAndDocumentIdentification6 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "DocId")
    protected String docId;
    @XmlElement(name = "CreDtTm")
    protected DateAndDateTime2Choice creDtTm;
    @XmlElement(name = "CpyDplct")
    @XmlSchemaType(name = "string")
    protected CopyDuplicate1Code cpyDplct;
    @XmlElement(name = "MsgOrgtr")
    protected PartyIdentification136 msgOrgtr;
    @XmlElement(name = "MsgRcpt")
    protected PartyIdentification136 msgRcpt;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionAndDocumentIdentification6 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the docId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionAndDocumentIdentification6 setDocId(String value) {
        this.docId = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TransactionAndDocumentIdentification6 setCreDtTm(DateAndDateTime2Choice value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the cpyDplct property.
     * 
     * @return
     *     possible object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public CopyDuplicate1Code getCpyDplct() {
        return cpyDplct;
    }

    /**
     * Sets the value of the cpyDplct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public TransactionAndDocumentIdentification6 setCpyDplct(CopyDuplicate1Code value) {
        this.cpyDplct = value;
        return this;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getMsgOrgtr() {
        return msgOrgtr;
    }

    /**
     * Sets the value of the msgOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public TransactionAndDocumentIdentification6 setMsgOrgtr(PartyIdentification136 value) {
        this.msgOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the msgRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getMsgRcpt() {
        return msgRcpt;
    }

    /**
     * Sets the value of the msgRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public TransactionAndDocumentIdentification6 setMsgRcpt(PartyIdentification136 value) {
        this.msgRcpt = value;
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
