
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details on the reported trade transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTransactionReport8Choice", propOrder = {
    "_new",
    "mod",
    "crrctn",
    "earlyTermntn",
    "posCmpnt",
    "valtnUpd",
    "cmprssn",
    "err",
    "othr"
})
public class TradeTransactionReport8Choice {

    @XmlElement(name = "New")
    protected TradeNewTransaction10 _new;
    @XmlElement(name = "Mod")
    protected TradeDataReport1 mod;
    @XmlElement(name = "Crrctn")
    protected TradeDataReport1 crrctn;
    @XmlElement(name = "EarlyTermntn")
    protected TradeTransactionEarlyTermination5 earlyTermntn;
    @XmlElement(name = "PosCmpnt")
    protected TradePositionComponent5 posCmpnt;
    @XmlElement(name = "ValtnUpd")
    protected TradeTransactionValuationUpdate5 valtnUpd;
    @XmlElement(name = "Cmprssn")
    protected TradeDataReport1 cmprssn;
    @XmlElement(name = "Err")
    protected TradeDataReport1 err;
    @XmlElement(name = "Othr")
    protected TradeTransactionOther6 othr;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNewTransaction10 }
     *     
     */
    public TradeNewTransaction10 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNewTransaction10 }
     *     
     */
    public TradeTransactionReport8Choice setNew(TradeNewTransaction10 value) {
        this._new = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDataReport1 }
     *     
     */
    public TradeDataReport1 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDataReport1 }
     *     
     */
    public TradeTransactionReport8Choice setMod(TradeDataReport1 value) {
        this.mod = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDataReport1 }
     *     
     */
    public TradeDataReport1 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDataReport1 }
     *     
     */
    public TradeTransactionReport8Choice setCrrctn(TradeDataReport1 value) {
        this.crrctn = value;
        return this;
    }

    /**
     * Gets the value of the earlyTermntn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionEarlyTermination5 }
     *     
     */
    public TradeTransactionEarlyTermination5 getEarlyTermntn() {
        return earlyTermntn;
    }

    /**
     * Sets the value of the earlyTermntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionEarlyTermination5 }
     *     
     */
    public TradeTransactionReport8Choice setEarlyTermntn(TradeTransactionEarlyTermination5 value) {
        this.earlyTermntn = value;
        return this;
    }

    /**
     * Gets the value of the posCmpnt property.
     * 
     * @return
     *     possible object is
     *     {@link TradePositionComponent5 }
     *     
     */
    public TradePositionComponent5 getPosCmpnt() {
        return posCmpnt;
    }

    /**
     * Sets the value of the posCmpnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePositionComponent5 }
     *     
     */
    public TradeTransactionReport8Choice setPosCmpnt(TradePositionComponent5 value) {
        this.posCmpnt = value;
        return this;
    }

    /**
     * Gets the value of the valtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionValuationUpdate5 }
     *     
     */
    public TradeTransactionValuationUpdate5 getValtnUpd() {
        return valtnUpd;
    }

    /**
     * Sets the value of the valtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionValuationUpdate5 }
     *     
     */
    public TradeTransactionReport8Choice setValtnUpd(TradeTransactionValuationUpdate5 value) {
        this.valtnUpd = value;
        return this;
    }

    /**
     * Gets the value of the cmprssn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDataReport1 }
     *     
     */
    public TradeDataReport1 getCmprssn() {
        return cmprssn;
    }

    /**
     * Sets the value of the cmprssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDataReport1 }
     *     
     */
    public TradeTransactionReport8Choice setCmprssn(TradeDataReport1 value) {
        this.cmprssn = value;
        return this;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDataReport1 }
     *     
     */
    public TradeDataReport1 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDataReport1 }
     *     
     */
    public TradeTransactionReport8Choice setErr(TradeDataReport1 value) {
        this.err = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionOther6 }
     *     
     */
    public TradeTransactionOther6 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionOther6 }
     *     
     */
    public TradeTransactionReport8Choice setOthr(TradeTransactionOther6 value) {
        this.othr = value;
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
