
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
 * Data elements contained in the original message.
 * ISO 8583:1987 bit 90 and ISO 8583 1993/2003 bit 56.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalDataElements6", propOrder = {
    "msgClss",
    "msgFctn",
    "acqrrId",
    "sndrId",
    "txTp",
    "txId",
    "convsDtTm",
    "txAmts",
    "addtlFee",
    "rspnCd",
    "apprvlCd",
    "dfrrdSttlmDt"
})
public class OriginalDataElements6 {

    @XmlElement(name = "MsgClss")
    @XmlSchemaType(name = "string")
    protected MessageClass2Code msgClss;
    @XmlElement(name = "MsgFctn")
    @XmlSchemaType(name = "string")
    protected MessageFunction16Code msgFctn;
    @XmlElement(name = "AcqrrId")
    protected String acqrrId;
    @XmlElement(name = "SndrId")
    protected String sndrId;
    @XmlElement(name = "TxTp")
    protected String txTp;
    @XmlElement(name = "TxId")
    protected OriginalTransactionIdentification2 txId;
    @XmlElement(name = "ConvsDtTm")
    protected DateTime2 convsDtTm;
    @XmlElement(name = "TxAmts")
    protected OriginalTransactionAmounts4 txAmts;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee4> addtlFee;
    @XmlElement(name = "RspnCd")
    protected String rspnCd;
    @XmlElement(name = "ApprvlCd")
    protected String apprvlCd;
    @XmlElement(name = "DfrrdSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dfrrdSttlmDt;

    /**
     * Gets the value of the msgClss property.
     * 
     * @return
     *     possible object is
     *     {@link MessageClass2Code }
     *     
     */
    public MessageClass2Code getMsgClss() {
        return msgClss;
    }

    /**
     * Sets the value of the msgClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageClass2Code }
     *     
     */
    public OriginalDataElements6 setMsgClss(MessageClass2Code value) {
        this.msgClss = value;
        return this;
    }

    /**
     * Gets the value of the msgFctn property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunction16Code }
     *     
     */
    public MessageFunction16Code getMsgFctn() {
        return msgFctn;
    }

    /**
     * Sets the value of the msgFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunction16Code }
     *     
     */
    public OriginalDataElements6 setMsgFctn(MessageFunction16Code value) {
        this.msgFctn = value;
        return this;
    }

    /**
     * Gets the value of the acqrrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrId() {
        return acqrrId;
    }

    /**
     * Sets the value of the acqrrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalDataElements6 setAcqrrId(String value) {
        this.acqrrId = value;
        return this;
    }

    /**
     * Gets the value of the sndrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrId() {
        return sndrId;
    }

    /**
     * Sets the value of the sndrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalDataElements6 setSndrId(String value) {
        this.sndrId = value;
        return this;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalDataElements6 setTxTp(String value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionIdentification2 }
     *     
     */
    public OriginalTransactionIdentification2 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionIdentification2 }
     *     
     */
    public OriginalDataElements6 setTxId(OriginalTransactionIdentification2 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the convsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime2 }
     *     
     */
    public DateTime2 getConvsDtTm() {
        return convsDtTm;
    }

    /**
     * Sets the value of the convsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime2 }
     *     
     */
    public OriginalDataElements6 setConvsDtTm(DateTime2 value) {
        this.convsDtTm = value;
        return this;
    }

    /**
     * Gets the value of the txAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionAmounts4 }
     *     
     */
    public OriginalTransactionAmounts4 getTxAmts() {
        return txAmts;
    }

    /**
     * Sets the value of the txAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionAmounts4 }
     *     
     */
    public OriginalDataElements6 setTxAmts(OriginalTransactionAmounts4 value) {
        this.txAmts = value;
        return this;
    }

    /**
     * Gets the value of the addtlFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFee4 }
     * 
     * 
     * @return
     *     The value of the addtlFee property.
     */
    public List<AdditionalFee4> getAddtlFee() {
        if (addtlFee == null) {
            addtlFee = new ArrayList<>();
        }
        return this.addtlFee;
    }

    /**
     * Gets the value of the rspnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnCd() {
        return rspnCd;
    }

    /**
     * Sets the value of the rspnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalDataElements6 setRspnCd(String value) {
        this.rspnCd = value;
        return this;
    }

    /**
     * Gets the value of the apprvlCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprvlCd() {
        return apprvlCd;
    }

    /**
     * Sets the value of the apprvlCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalDataElements6 setApprvlCd(String value) {
        this.apprvlCd = value;
        return this;
    }

    /**
     * Gets the value of the dfrrdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDfrrdSttlmDt() {
        return dfrrdSttlmDt;
    }

    /**
     * Sets the value of the dfrrdSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalDataElements6 setDfrrdSttlmDt(LocalDate value) {
        this.dfrrdSttlmDt = value;
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
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public OriginalDataElements6 addAddtlFee(AdditionalFee4 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

}
