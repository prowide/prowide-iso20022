
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
@XmlType(name = "References30Choice", propOrder = {
    "othrTxId",
    "sctiesFincgTxId",
    "sctiesSttlmTxId",
    "intraPosMvmntId"
})
public class References30Choice {

    @XmlElement(name = "OthrTxId")
    protected GenericDocumentIdentification2 othrTxId;
    @XmlElement(name = "SctiesFincgTxId")
    protected SettlementTypeAndIdentification7 sctiesFincgTxId;
    @XmlElement(name = "SctiesSttlmTxId")
    protected SettlementTypeAndIdentification7 sctiesSttlmTxId;
    @XmlElement(name = "IntraPosMvmntId")
    protected String intraPosMvmntId;

    /**
     * Gets the value of the othrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericDocumentIdentification2 }
     *     
     */
    public GenericDocumentIdentification2 getOthrTxId() {
        return othrTxId;
    }

    /**
     * Sets the value of the othrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericDocumentIdentification2 }
     *     
     */
    public References30Choice setOthrTxId(GenericDocumentIdentification2 value) {
        this.othrTxId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgTxId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification7 }
     *     
     */
    public SettlementTypeAndIdentification7 getSctiesFincgTxId() {
        return sctiesFincgTxId;
    }

    /**
     * Sets the value of the sctiesFincgTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification7 }
     *     
     */
    public References30Choice setSctiesFincgTxId(SettlementTypeAndIdentification7 value) {
        this.sctiesFincgTxId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSttlmTxId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification7 }
     *     
     */
    public SettlementTypeAndIdentification7 getSctiesSttlmTxId() {
        return sctiesSttlmTxId;
    }

    /**
     * Sets the value of the sctiesSttlmTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification7 }
     *     
     */
    public References30Choice setSctiesSttlmTxId(SettlementTypeAndIdentification7 value) {
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
    public References30Choice setIntraPosMvmntId(String value) {
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
