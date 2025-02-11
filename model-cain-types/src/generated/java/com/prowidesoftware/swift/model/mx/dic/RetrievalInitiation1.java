
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
 * Information related to the retrieval of a message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievalInitiation1", propOrder = {
    "envt",
    "cntxt",
    "tx",
    "orgnlTx",
    "prtctdData",
    "rtrvlFlfmtDstn",
    "splmtryData"
})
public class RetrievalInitiation1 {

    @XmlElement(name = "Envt", required = true)
    protected Environment13 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected Context4 cntxt;
    @XmlElement(name = "Tx")
    protected Transaction89 tx;
    @XmlElement(name = "OrgnlTx", required = true)
    protected OriginalTransaction1 orgnlTx;
    @XmlElement(name = "PrtctdData")
    protected List<ProtectedData1> prtctdData;
    @XmlElement(name = "RtrvlFlfmtDstn")
    protected PartyIdentification197 rtrvlFlfmtDstn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link Environment13 }
     *     
     */
    public Environment13 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Environment13 }
     *     
     */
    public RetrievalInitiation1 setEnvt(Environment13 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Context4 }
     *     
     */
    public Context4 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context4 }
     *     
     */
    public RetrievalInitiation1 setCntxt(Context4 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction89 }
     *     
     */
    public Transaction89 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction89 }
     *     
     */
    public RetrievalInitiation1 setTx(Transaction89 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the orgnlTx property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransaction1 }
     *     
     */
    public OriginalTransaction1 getOrgnlTx() {
        return orgnlTx;
    }

    /**
     * Sets the value of the orgnlTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransaction1 }
     *     
     */
    public RetrievalInitiation1 setOrgnlTx(OriginalTransaction1 value) {
        this.orgnlTx = value;
        return this;
    }

    /**
     * Gets the value of the prtctdData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtctdData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtctdData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtectedData1 }
     * 
     * 
     * @return
     *     The value of the prtctdData property.
     */
    public List<ProtectedData1> getPrtctdData() {
        if (prtctdData == null) {
            prtctdData = new ArrayList<>();
        }
        return this.prtctdData;
    }

    /**
     * Gets the value of the rtrvlFlfmtDstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getRtrvlFlfmtDstn() {
        return rtrvlFlfmtDstn;
    }

    /**
     * Sets the value of the rtrvlFlfmtDstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public RetrievalInitiation1 setRtrvlFlfmtDstn(PartyIdentification197 value) {
        this.rtrvlFlfmtDstn = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
     * Adds a new item to the prtctdData list.
     * @see #getPrtctdData()
     * 
     */
    public RetrievalInitiation1 addPrtctdData(ProtectedData1 prtctdData) {
        getPrtctdData().add(prtctdData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public RetrievalInitiation1 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
