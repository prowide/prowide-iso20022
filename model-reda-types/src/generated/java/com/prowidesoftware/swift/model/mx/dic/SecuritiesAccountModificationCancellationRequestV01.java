
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
 * The SecuritiesAccountModificationCancellationRequest message is exchanged between an instructing party and the executing party to request for the cancellation of a modification message sent previously to request for an update of a securities account in the executing system securities account reference data.
 * 
 * Scope and usage
 * 
 * It aims at instructing the cancellation of a modification request previous sent to update an existing securities account by amending its existing details or providing additional details.
 * Processing and confirmation of the securities account modification cancellation request message are provided via a securities account modification status advice.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountModificationCancellationRequestV01", propOrder = {
    "txId",
    "ref",
    "acctOwnr",
    "acctId",
    "cxlRsn",
    "mod",
    "splmtryData"
})
public class SecuritiesAccountModificationCancellationRequestV01 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "Ref", required = true)
    protected References22 ref;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification100 acctOwnr;
    @XmlElement(name = "AcctId")
    protected SecuritiesAccount19 acctId;
    @XmlElement(name = "CxlRsn")
    protected CancellationReason21 cxlRsn;
    @XmlElement(name = "Mod")
    protected List<SystemPartyModification1> mod;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
    public SecuritiesAccountModificationCancellationRequestV01 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References22 }
     *     
     */
    public References22 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References22 }
     *     
     */
    public SecuritiesAccountModificationCancellationRequestV01 setRef(References22 value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public SecuritiesAccountModificationCancellationRequestV01 setAcctOwnr(PartyIdentification100 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccountModificationCancellationRequestV01 setAcctId(SecuritiesAccount19 value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason21 }
     *     
     */
    public CancellationReason21 getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason21 }
     *     
     */
    public SecuritiesAccountModificationCancellationRequestV01 setCxlRsn(CancellationReason21 value) {
        this.cxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemPartyModification1 }
     * 
     * 
     */
    public List<SystemPartyModification1> getMod() {
        if (mod == null) {
            mod = new ArrayList<SystemPartyModification1>();
        }
        return this.mod;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the mod list.
     * @see #getMod()
     * 
     */
    public SecuritiesAccountModificationCancellationRequestV01 addMod(SystemPartyModification1 mod) {
        getMod().add(mod);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesAccountModificationCancellationRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
