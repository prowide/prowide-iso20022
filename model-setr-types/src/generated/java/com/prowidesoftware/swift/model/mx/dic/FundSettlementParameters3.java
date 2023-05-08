
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Parameters applied to the settlement of a security transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundSettlementParameters3", propOrder = {
    "sttlmDt",
    "sttlmPlc",
    "sfkpgPlc",
    "sctiesSttlmSysId",
    "rcvgSdDtls",
    "dlvrgSdDtls"
})
public class FundSettlementParameters3 {

    @XmlElement(name = "SttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar sttlmDt;
    @XmlElement(name = "SttlmPlc", required = true)
    protected PartyIdentification2Choice sttlmPlc;
    @XmlElement(name = "SfkpgPlc")
    protected PartyIdentification2Choice sfkpgPlc;
    @XmlElement(name = "SctiesSttlmSysId")
    protected String sctiesSttlmSysId;
    @XmlElement(name = "RcvgSdDtls")
    protected ReceivingPartiesAndAccount3 rcvgSdDtls;
    @XmlElement(name = "DlvrgSdDtls", required = true)
    protected DeliveringPartiesAndAccount3 dlvrgSdDtls;

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundSettlementParameters3 setSttlmDt(Calendar value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPlc property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getSttlmPlc() {
        return sttlmPlc;
    }

    /**
     * Sets the value of the sttlmPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public FundSettlementParameters3 setSttlmPlc(PartyIdentification2Choice value) {
        this.sttlmPlc = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public FundSettlementParameters3 setSfkpgPlc(PartyIdentification2Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSttlmSysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesSttlmSysId() {
        return sctiesSttlmSysId;
    }

    /**
     * Sets the value of the sctiesSttlmSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundSettlementParameters3 setSctiesSttlmSysId(String value) {
        this.sctiesSttlmSysId = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartiesAndAccount3 }
     *     
     */
    public ReceivingPartiesAndAccount3 getRcvgSdDtls() {
        return rcvgSdDtls;
    }

    /**
     * Sets the value of the rcvgSdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartiesAndAccount3 }
     *     
     */
    public FundSettlementParameters3 setRcvgSdDtls(ReceivingPartiesAndAccount3 value) {
        this.rcvgSdDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveringPartiesAndAccount3 }
     *     
     */
    public DeliveringPartiesAndAccount3 getDlvrgSdDtls() {
        return dlvrgSdDtls;
    }

    /**
     * Sets the value of the dlvrgSdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveringPartiesAndAccount3 }
     *     
     */
    public FundSettlementParameters3 setDlvrgSdDtls(DeliveringPartiesAndAccount3 value) {
        this.dlvrgSdDtls = value;
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
