
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
 * Choice of reference.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "References59Choice", propOrder = {
    "othrTxId",
    "sctiesFincgTxId",
    "sctiesSttlmTxId",
    "intraPosMvmntId"
})
public class References59Choice {

    @XmlElement(name = "OthrTxId")
    protected GenericDocumentIdentification5 othrTxId;
    @XmlElement(name = "SctiesFincgTxId")
    protected SettlementTypeAndIdentification22 sctiesFincgTxId;
    @XmlElement(name = "SctiesSttlmTxId")
    protected SettlementTypeAndIdentification22 sctiesSttlmTxId;
    @XmlElement(name = "IntraPosMvmntId")
    protected String intraPosMvmntId;

    /**
     * Gets the value of the othrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericDocumentIdentification5 }
     *     
     */
    public GenericDocumentIdentification5 getOthrTxId() {
        return othrTxId;
    }

    /**
     * Sets the value of the othrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericDocumentIdentification5 }
     *     
     */
    public References59Choice setOthrTxId(GenericDocumentIdentification5 value) {
        this.othrTxId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgTxId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification22 }
     *     
     */
    public SettlementTypeAndIdentification22 getSctiesFincgTxId() {
        return sctiesFincgTxId;
    }

    /**
     * Sets the value of the sctiesFincgTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification22 }
     *     
     */
    public References59Choice setSctiesFincgTxId(SettlementTypeAndIdentification22 value) {
        this.sctiesFincgTxId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSttlmTxId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification22 }
     *     
     */
    public SettlementTypeAndIdentification22 getSctiesSttlmTxId() {
        return sctiesSttlmTxId;
    }

    /**
     * Sets the value of the sctiesSttlmTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification22 }
     *     
     */
    public References59Choice setSctiesSttlmTxId(SettlementTypeAndIdentification22 value) {
        this.sctiesSttlmTxId = value;
        return this;
    }

    /**
     * Gets the value of the intraPosMvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraPosMvmntId() {
        return intraPosMvmntId;
    }

    /**
     * Sets the value of the intraPosMvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References59Choice setIntraPosMvmntId(String value) {
        this.intraPosMvmntId = value;
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
