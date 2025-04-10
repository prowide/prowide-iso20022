
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Unique identifier of a document, message or transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identification6", propOrder = {
    "acctOwnrTxId",
    "acctSvcrTxId",
    "mktInfrstrctrTxId",
    "prcrTxId",
    "cmonId",
    "tradId",
    "mstrId",
    "bsktId",
    "indxId",
    "listId",
    "prgmId",
    "poolId",
    "corpActnEvtId"
})
public class Identification6 {

    @XmlElement(name = "AcctOwnrTxId", required = true)
    protected String acctOwnrTxId;
    @XmlElement(name = "AcctSvcrTxId")
    protected String acctSvcrTxId;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected String mktInfrstrctrTxId;
    @XmlElement(name = "PrcrTxId")
    protected String prcrTxId;
    @XmlElement(name = "CmonId")
    protected String cmonId;
    @XmlElement(name = "TradId")
    protected List<String> tradId;
    @XmlElement(name = "MstrId")
    protected String mstrId;
    @XmlElement(name = "BsktId")
    protected String bsktId;
    @XmlElement(name = "IndxId")
    protected String indxId;
    @XmlElement(name = "ListId")
    protected String listId;
    @XmlElement(name = "PrgmId")
    protected String prgmId;
    @XmlElement(name = "PoolId")
    protected String poolId;
    @XmlElement(name = "CorpActnEvtId")
    protected String corpActnEvtId;

    /**
     * Gets the value of the acctOwnrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnrTxId() {
        return acctOwnrTxId;
    }

    /**
     * Sets the value of the acctOwnrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Identification6 setAcctOwnrTxId(String value) {
        this.acctOwnrTxId = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcrTxId() {
        return acctSvcrTxId;
    }

    /**
     * Sets the value of the acctSvcrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Identification6 setAcctSvcrTxId(String value) {
        this.acctSvcrTxId = value;
        return this;
    }

    /**
     * Gets the value of the mktInfrstrctrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktInfrstrctrTxId() {
        return mktInfrstrctrTxId;
    }

    /**
     * Sets the value of the mktInfrstrctrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Identification6 setMktInfrstrctrTxId(String value) {
        this.mktInfrstrctrTxId = value;
        return this;
    }

    /**
     * Gets the value of the prcrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcrTxId() {
        return prcrTxId;
    }

    /**
     * Sets the value of the prcrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Identification6 setPrcrTxId(String value) {
        this.prcrTxId = value;
        return this;
    }

    /**
     * Gets the value of the cmonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonId() {
        return cmonId;
    }

    /**
     * Sets the value of the cmonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Identification6 setCmonId(String value) {
        this.cmonId = value;
        return this;
    }

    /**
     * Gets the value of the tradId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTradId() {
        if (tradId == null) {
            tradId = new ArrayList<String>();
        }
        return this.tradId;
    }

    /**
     * Gets the value of the mstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrId() {
        return mstrId;
    }

    /**
     * Sets the value of the mstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Identification6 setMstrId(String value) {
        this.mstrId = value;
        return this;
    }

    /**
     * Gets the value of the bsktId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBsktId() {
        return bsktId;
    }

    /**
     * Sets the value of the bsktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Identification6 setBsktId(String value) {
        this.bsktId = value;
        return this;
    }

    /**
     * Gets the value of the indxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndxId() {
        return indxId;
    }

    /**
     * Sets the value of the indxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Identification6 setIndxId(String value) {
        this.indxId = value;
        return this;
    }

    /**
     * Gets the value of the listId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListId() {
        return listId;
    }

    /**
     * Sets the value of the listId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Identification6 setListId(String value) {
        this.listId = value;
        return this;
    }

    /**
     * Gets the value of the prgmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrgmId() {
        return prgmId;
    }

    /**
     * Sets the value of the prgmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Identification6 setPrgmId(String value) {
        this.prgmId = value;
        return this;
    }

    /**
     * Gets the value of the poolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * Sets the value of the poolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Identification6 setPoolId(String value) {
        this.poolId = value;
        return this;
    }

    /**
     * Gets the value of the corpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpActnEvtId() {
        return corpActnEvtId;
    }

    /**
     * Sets the value of the corpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Identification6 setCorpActnEvtId(String value) {
        this.corpActnEvtId = value;
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
     * Adds a new item to the tradId list.
     * @see #getTradId()
     * 
     */
    public Identification6 addTradId(String tradId) {
        getTradId().add(tradId);
        return this;
    }

}
