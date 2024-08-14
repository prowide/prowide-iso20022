
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
 * Specifies the aggregated data of settlement fails instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsData3", propOrder = {
    "ttl",
    "ptcptInFail",
    "flsPerCcy",
    "flsPerFinInstrmTp",
    "sctiesInFail",
    "flsPerTxTp",
    "ttlSttlmPnlties",
    "failrRsn"
})
public class SettlementFailsData3 {

    @XmlElement(name = "Ttl", required = true)
    protected SettlementTotalData1 ttl;
    @XmlElement(name = "PtcptInFail")
    protected SettlementFailsParticipantRange1 ptcptInFail;
    @XmlElement(name = "FlsPerCcy")
    protected List<SettlementFailsCurrency2> flsPerCcy;
    @XmlElement(name = "FlsPerFinInstrmTp")
    protected SettlementFailsInstrument2 flsPerFinInstrmTp;
    @XmlElement(name = "SctiesInFail")
    protected SettlementFailsSecuritiesRange1 sctiesInFail;
    @XmlElement(name = "FlsPerTxTp")
    protected SettlementFailsTransactionType2 flsPerTxTp;
    @XmlElement(name = "TtlSttlmPnlties")
    protected SettlementDataVolume2 ttlSttlmPnlties;
    @XmlElement(name = "FailrRsn", required = true)
    protected SettlementFailureReason3 failrRsn;

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1 }
     *     
     */
    public SettlementTotalData1 getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1 }
     *     
     */
    public SettlementFailsData3 setTtl(SettlementTotalData1 value) {
        this.ttl = value;
        return this;
    }

    /**
     * Gets the value of the ptcptInFail property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsParticipantRange1 }
     *     
     */
    public SettlementFailsParticipantRange1 getPtcptInFail() {
        return ptcptInFail;
    }

    /**
     * Sets the value of the ptcptInFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsParticipantRange1 }
     *     
     */
    public SettlementFailsData3 setPtcptInFail(SettlementFailsParticipantRange1 value) {
        this.ptcptInFail = value;
        return this;
    }

    /**
     * Gets the value of the flsPerCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the flsPerCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlsPerCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementFailsCurrency2 }
     * 
     * 
     * @return
     *     The value of the flsPerCcy property.
     */
    public List<SettlementFailsCurrency2> getFlsPerCcy() {
        if (flsPerCcy == null) {
            flsPerCcy = new ArrayList<>();
        }
        return this.flsPerCcy;
    }

    /**
     * Gets the value of the flsPerFinInstrmTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsInstrument2 }
     *     
     */
    public SettlementFailsInstrument2 getFlsPerFinInstrmTp() {
        return flsPerFinInstrmTp;
    }

    /**
     * Sets the value of the flsPerFinInstrmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsInstrument2 }
     *     
     */
    public SettlementFailsData3 setFlsPerFinInstrmTp(SettlementFailsInstrument2 value) {
        this.flsPerFinInstrmTp = value;
        return this;
    }

    /**
     * Gets the value of the sctiesInFail property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsSecuritiesRange1 }
     *     
     */
    public SettlementFailsSecuritiesRange1 getSctiesInFail() {
        return sctiesInFail;
    }

    /**
     * Sets the value of the sctiesInFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsSecuritiesRange1 }
     *     
     */
    public SettlementFailsData3 setSctiesInFail(SettlementFailsSecuritiesRange1 value) {
        this.sctiesInFail = value;
        return this;
    }

    /**
     * Gets the value of the flsPerTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsTransactionType2 }
     *     
     */
    public SettlementFailsTransactionType2 getFlsPerTxTp() {
        return flsPerTxTp;
    }

    /**
     * Sets the value of the flsPerTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsTransactionType2 }
     *     
     */
    public SettlementFailsData3 setFlsPerTxTp(SettlementFailsTransactionType2 value) {
        this.flsPerTxTp = value;
        return this;
    }

    /**
     * Gets the value of the ttlSttlmPnlties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDataVolume2 }
     *     
     */
    public SettlementDataVolume2 getTtlSttlmPnlties() {
        return ttlSttlmPnlties;
    }

    /**
     * Sets the value of the ttlSttlmPnlties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDataVolume2 }
     *     
     */
    public SettlementFailsData3 setTtlSttlmPnlties(SettlementDataVolume2 value) {
        this.ttlSttlmPnlties = value;
        return this;
    }

    /**
     * Gets the value of the failrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailureReason3 }
     *     
     */
    public SettlementFailureReason3 getFailrRsn() {
        return failrRsn;
    }

    /**
     * Sets the value of the failrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailureReason3 }
     *     
     */
    public SettlementFailsData3 setFailrRsn(SettlementFailureReason3 value) {
        this.failrRsn = value;
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

    /**
     * Adds a new item to the flsPerCcy list.
     * @see #getFlsPerCcy()
     * 
     */
    public SettlementFailsData3 addFlsPerCcy(SettlementFailsCurrency2 flsPerCcy) {
        getFlsPerCcy().add(flsPerCcy);
        return this;
    }

}
