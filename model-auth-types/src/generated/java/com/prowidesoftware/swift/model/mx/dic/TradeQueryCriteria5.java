
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Query criteria on a trade transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeQueryCriteria5", propOrder = {
    "tradPtyCrit",
    "tmCrit",
    "sctiesFincgTxTp",
    "collCmpntTp",
    "othrCrit"
})
public class TradeQueryCriteria5 {

    @XmlElement(name = "TradPtyCrit")
    protected TradePartyQueryCriteria4 tradPtyCrit;
    @XmlElement(name = "TmCrit")
    protected TradeDateTimeQueryCriteria2 tmCrit;
    @XmlElement(name = "SctiesFincgTxTp")
    @XmlSchemaType(name = "string")
    protected List<ExposureType3Code> sctiesFincgTxTp;
    @XmlElement(name = "CollCmpntTp")
    @XmlSchemaType(name = "string")
    protected List<CollateralType6Code> collCmpntTp;
    @XmlElement(name = "OthrCrit")
    protected TradeAdditionalQueryCriteria4 othrCrit;

    /**
     * Gets the value of the tradPtyCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyQueryCriteria4 }
     *     
     */
    public TradePartyQueryCriteria4 getTradPtyCrit() {
        return tradPtyCrit;
    }

    /**
     * Sets the value of the tradPtyCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyQueryCriteria4 }
     *     
     */
    public TradeQueryCriteria5 setTradPtyCrit(TradePartyQueryCriteria4 value) {
        this.tradPtyCrit = value;
        return this;
    }

    /**
     * Gets the value of the tmCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDateTimeQueryCriteria2 }
     *     
     */
    public TradeDateTimeQueryCriteria2 getTmCrit() {
        return tmCrit;
    }

    /**
     * Sets the value of the tmCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDateTimeQueryCriteria2 }
     *     
     */
    public TradeQueryCriteria5 setTmCrit(TradeDateTimeQueryCriteria2 value) {
        this.tmCrit = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgTxTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesFincgTxTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesFincgTxTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExposureType3Code }
     * 
     * 
     */
    public List<ExposureType3Code> getSctiesFincgTxTp() {
        if (sctiesFincgTxTp == null) {
            sctiesFincgTxTp = new ArrayList<ExposureType3Code>();
        }
        return this.sctiesFincgTxTp;
    }

    /**
     * Gets the value of the collCmpntTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collCmpntTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollCmpntTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralType6Code }
     * 
     * 
     */
    public List<CollateralType6Code> getCollCmpntTp() {
        if (collCmpntTp == null) {
            collCmpntTp = new ArrayList<CollateralType6Code>();
        }
        return this.collCmpntTp;
    }

    /**
     * Gets the value of the othrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAdditionalQueryCriteria4 }
     *     
     */
    public TradeAdditionalQueryCriteria4 getOthrCrit() {
        return othrCrit;
    }

    /**
     * Sets the value of the othrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAdditionalQueryCriteria4 }
     *     
     */
    public TradeQueryCriteria5 setOthrCrit(TradeAdditionalQueryCriteria4 value) {
        this.othrCrit = value;
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
     * Adds a new item to the sctiesFincgTxTp list.
     * @see #getSctiesFincgTxTp()
     * 
     */
    public TradeQueryCriteria5 addSctiesFincgTxTp(ExposureType3Code sctiesFincgTxTp) {
        getSctiesFincgTxTp().add(sctiesFincgTxTp);
        return this;
    }

    /**
     * Adds a new item to the collCmpntTp list.
     * @see #getCollCmpntTp()
     * 
     */
    public TradeQueryCriteria5 addCollCmpntTp(CollateralType6Code collCmpntTp) {
        getCollCmpntTp().add(collCmpntTp);
        return this;
    }

}
