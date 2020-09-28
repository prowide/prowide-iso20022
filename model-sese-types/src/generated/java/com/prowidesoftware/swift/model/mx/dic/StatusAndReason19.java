
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
 * Status and reason of a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusAndReason19", propOrder = {
    "prcgSts",
    "ifrrdMtchgSts",
    "mtchgSts",
    "sttlmSts"
})
public class StatusAndReason19 {

    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus23Choice prcgSts;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus19Choice ifrrdMtchgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus19Choice mtchgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus7Choice sttlmSts;

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus23Choice }
     *     
     */
    public ProcessingStatus23Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus23Choice }
     *     
     */
    public StatusAndReason19 setPrcgSts(ProcessingStatus23Choice value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus19Choice }
     *     
     */
    public MatchingStatus19Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Sets the value of the ifrrdMtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus19Choice }
     *     
     */
    public StatusAndReason19 setIfrrdMtchgSts(MatchingStatus19Choice value) {
        this.ifrrdMtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus19Choice }
     *     
     */
    public MatchingStatus19Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus19Choice }
     *     
     */
    public StatusAndReason19 setMtchgSts(MatchingStatus19Choice value) {
        this.mtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus7Choice }
     *     
     */
    public SettlementStatus7Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus7Choice }
     *     
     */
    public StatusAndReason19 setSttlmSts(SettlementStatus7Choice value) {
        this.sttlmSts = value;
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
