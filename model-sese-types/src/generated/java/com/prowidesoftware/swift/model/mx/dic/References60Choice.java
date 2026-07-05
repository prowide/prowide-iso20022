
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "References60Choice", propOrder = {
    "sctiesSttlmTxId",
    "sctiesFincgTxId",
    "intraPosMvmntId",
    "othrTxId"
})
public class References60Choice {

    @XmlElement(name = "SctiesSttlmTxId")
    protected SettlementTypeAndIdentification22 sctiesSttlmTxId;
    @XmlElement(name = "SctiesFincgTxId")
    protected SettlementTypeAndIdentification22 sctiesFincgTxId;
    @XmlElement(name = "IntraPosMvmntId")
    protected String intraPosMvmntId;
    @XmlElement(name = "OthrTxId")
    protected GenericDocumentIdentification6 othrTxId;

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
    public References60Choice setSctiesSttlmTxId(SettlementTypeAndIdentification22 value) {
        this.sctiesSttlmTxId = value;
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
    public References60Choice setSctiesFincgTxId(SettlementTypeAndIdentification22 value) {
        this.sctiesFincgTxId = value;
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
    public References60Choice setIntraPosMvmntId(String value) {
        this.intraPosMvmntId = value;
        return this;
    }

    /**
     * Gets the value of the othrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericDocumentIdentification6 }
     *     
     */
    public GenericDocumentIdentification6 getOthrTxId() {
        return othrTxId;
    }

    /**
     * Sets the value of the othrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericDocumentIdentification6 }
     *     
     */
    public References60Choice setOthrTxId(GenericDocumentIdentification6 value) {
        this.othrTxId = value;
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
