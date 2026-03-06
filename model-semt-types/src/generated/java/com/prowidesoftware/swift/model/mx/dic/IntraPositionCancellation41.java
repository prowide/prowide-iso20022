
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identifies the details of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionCancellation4__1", propOrder = {
    "acctOwnr",
    "sfkpgAcct",
    "prcgSts",
    "reqRef",
    "stsDt",
    "txId",
    "undrlyg"
})
public class IntraPositionCancellation41 {

    @XmlElement(name = "AcctOwnr")
    protected SystemPartyIdentification61 acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount191 sfkpgAcct;
    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus69Choice1 prcgSts;
    @XmlElement(name = "ReqRef", required = true)
    protected String reqRef;
    @XmlElement(name = "StsDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime stsDt;
    @XmlElement(name = "TxId")
    protected References141 txId;
    @XmlElement(name = "Undrlyg")
    protected SettlementOrIntraPosition2Choice1 undrlyg;

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification61 }
     *     
     */
    public SystemPartyIdentification61 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification61 }
     *     
     */
    public IntraPositionCancellation41 setAcctOwnr(SystemPartyIdentification61 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount191 }
     *     
     */
    public SecuritiesAccount191 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount191 }
     *     
     */
    public IntraPositionCancellation41 setSfkpgAcct(SecuritiesAccount191 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus69Choice1 }
     *     
     */
    public ProcessingStatus69Choice1 getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus69Choice1 }
     *     
     */
    public IntraPositionCancellation41 setPrcgSts(ProcessingStatus69Choice1 value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the reqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRef() {
        return reqRef;
    }

    /**
     * Sets the value of the reqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IntraPositionCancellation41 setReqRef(String value) {
        this.reqRef = value;
        return this;
    }

    /**
     * Gets the value of the stsDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getStsDt() {
        return stsDt;
    }

    /**
     * Sets the value of the stsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IntraPositionCancellation41 setStsDt(OffsetDateTime value) {
        this.stsDt = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link References141 }
     *     
     */
    public References141 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link References141 }
     *     
     */
    public IntraPositionCancellation41 setTxId(References141 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementOrIntraPosition2Choice1 }
     *     
     */
    public SettlementOrIntraPosition2Choice1 getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementOrIntraPosition2Choice1 }
     *     
     */
    public IntraPositionCancellation41 setUndrlyg(SettlementOrIntraPosition2Choice1 value) {
        this.undrlyg = value;
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
