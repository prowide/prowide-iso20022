
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
 * Identifies each issuer CSD (central securities depository) included in the report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerCSDReport1", propOrder = {
    "id",
    "ovrllTtl",
    "finInstrm",
    "txTp",
    "clntTp",
    "ttlCshTrf"
})
public class IssuerCSDReport1 {

    @XmlElement(name = "Id", required = true)
    protected IssuerCSDIdentification1 id;
    @XmlElement(name = "OvrllTtl", required = true)
    protected InternalisationData1 ovrllTtl;
    @XmlElement(name = "FinInstrm", required = true)
    protected SettlementInternaliserFinancialInstrument1 finInstrm;
    @XmlElement(name = "TxTp", required = true)
    protected SettlementInternaliserTransactionType1 txTp;
    @XmlElement(name = "ClntTp", required = true)
    protected SettlementInternaliserClientType1 clntTp;
    @XmlElement(name = "TtlCshTrf", required = true)
    protected InternalisationData1 ttlCshTrf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerCSDIdentification1 }
     *     
     */
    public IssuerCSDIdentification1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerCSDIdentification1 }
     *     
     */
    public IssuerCSDReport1 setId(IssuerCSDIdentification1 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ovrllTtl property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getOvrllTtl() {
        return ovrllTtl;
    }

    /**
     * Sets the value of the ovrllTtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public IssuerCSDReport1 setOvrllTtl(InternalisationData1 value) {
        this.ovrllTtl = value;
        return this;
    }

    /**
     * Gets the value of the finInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInternaliserFinancialInstrument1 }
     *     
     */
    public SettlementInternaliserFinancialInstrument1 getFinInstrm() {
        return finInstrm;
    }

    /**
     * Sets the value of the finInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInternaliserFinancialInstrument1 }
     *     
     */
    public IssuerCSDReport1 setFinInstrm(SettlementInternaliserFinancialInstrument1 value) {
        this.finInstrm = value;
        return this;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInternaliserTransactionType1 }
     *     
     */
    public SettlementInternaliserTransactionType1 getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInternaliserTransactionType1 }
     *     
     */
    public IssuerCSDReport1 setTxTp(SettlementInternaliserTransactionType1 value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the clntTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInternaliserClientType1 }
     *     
     */
    public SettlementInternaliserClientType1 getClntTp() {
        return clntTp;
    }

    /**
     * Sets the value of the clntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInternaliserClientType1 }
     *     
     */
    public IssuerCSDReport1 setClntTp(SettlementInternaliserClientType1 value) {
        this.clntTp = value;
        return this;
    }

    /**
     * Gets the value of the ttlCshTrf property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getTtlCshTrf() {
        return ttlCshTrf;
    }

    /**
     * Sets the value of the ttlCshTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public IssuerCSDReport1 setTtlCshTrf(InternalisationData1 value) {
        this.ttlCshTrf = value;
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
