
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
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
 * Statement information of an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatementDetails1", propOrder = {
    "txDt",
    "pdgInd",
    "txPstngDt",
    "txAmt",
    "crdhldrBllgAmt",
    "cdtInd",
    "accptrNmAndLctn",
    "shrtTxDesc",
    "lngTxDesc"
})
public class AccountStatementDetails1 {

    @XmlElement(name = "TxDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate txDt;
    @XmlElement(name = "PdgInd")
    protected Boolean pdgInd;
    @XmlElement(name = "TxPstngDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate txPstngDt;
    @XmlElement(name = "TxAmt")
    protected Amount7 txAmt;
    @XmlElement(name = "CrdhldrBllgAmt")
    protected Amount7 crdhldrBllgAmt;
    @XmlElement(name = "CdtInd")
    protected Boolean cdtInd;
    @XmlElement(name = "AccptrNmAndLctn")
    protected String accptrNmAndLctn;
    @XmlElement(name = "ShrtTxDesc")
    protected String shrtTxDesc;
    @XmlElement(name = "LngTxDesc")
    protected String lngTxDesc;

    /**
     * Gets the value of the txDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getTxDt() {
        return txDt;
    }

    /**
     * Sets the value of the txDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountStatementDetails1 setTxDt(LocalDate value) {
        this.txDt = value;
        return this;
    }

    /**
     * Gets the value of the pdgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPdgInd() {
        return pdgInd;
    }

    /**
     * Sets the value of the pdgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AccountStatementDetails1 setPdgInd(Boolean value) {
        this.pdgInd = value;
        return this;
    }

    /**
     * Gets the value of the txPstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getTxPstngDt() {
        return txPstngDt;
    }

    /**
     * Sets the value of the txPstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountStatementDetails1 setTxPstngDt(LocalDate value) {
        this.txPstngDt = value;
        return this;
    }

    /**
     * Gets the value of the txAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount7 }
     *     
     */
    public Amount7 getTxAmt() {
        return txAmt;
    }

    /**
     * Sets the value of the txAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount7 }
     *     
     */
    public AccountStatementDetails1 setTxAmt(Amount7 value) {
        this.txAmt = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrBllgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount7 }
     *     
     */
    public Amount7 getCrdhldrBllgAmt() {
        return crdhldrBllgAmt;
    }

    /**
     * Sets the value of the crdhldrBllgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount7 }
     *     
     */
    public AccountStatementDetails1 setCrdhldrBllgAmt(Amount7 value) {
        this.crdhldrBllgAmt = value;
        return this;
    }

    /**
     * Gets the value of the cdtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdtInd() {
        return cdtInd;
    }

    /**
     * Sets the value of the cdtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AccountStatementDetails1 setCdtInd(Boolean value) {
        this.cdtInd = value;
        return this;
    }

    /**
     * Gets the value of the accptrNmAndLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccptrNmAndLctn() {
        return accptrNmAndLctn;
    }

    /**
     * Sets the value of the accptrNmAndLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountStatementDetails1 setAccptrNmAndLctn(String value) {
        this.accptrNmAndLctn = value;
        return this;
    }

    /**
     * Gets the value of the shrtTxDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtTxDesc() {
        return shrtTxDesc;
    }

    /**
     * Sets the value of the shrtTxDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountStatementDetails1 setShrtTxDesc(String value) {
        this.shrtTxDesc = value;
        return this;
    }

    /**
     * Gets the value of the lngTxDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLngTxDesc() {
        return lngTxDesc;
    }

    /**
     * Sets the value of the lngTxDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountStatementDetails1 setLngTxDesc(String value) {
        this.lngTxDesc = value;
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
