
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies elements related to the confirmation sent by the central counterparty to the clearing member in the context of the buy in process.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyIn2", propOrder = {
    "buyInNtfctnId",
    "buyInId",
    "dt",
    "pric",
    "sctiesBuyIn",
    "reqrdCshCompstn"
})
public class BuyIn2 {

    @XmlElement(name = "BuyInNtfctnId")
    protected String buyInNtfctnId;
    @XmlElement(name = "BuyInId", required = true)
    protected String buyInId;
    @XmlElement(name = "Dt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Pric")
    protected Price4 pric;
    @XmlElement(name = "SctiesBuyIn")
    protected SecuritiesCompensation1 sctiesBuyIn;
    @XmlElement(name = "ReqrdCshCompstn")
    protected CashCompensation1 reqrdCshCompstn;

    /**
     * Gets the value of the buyInNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyInNtfctnId() {
        return buyInNtfctnId;
    }

    /**
     * Sets the value of the buyInNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BuyIn2 setBuyInNtfctnId(String value) {
        this.buyInNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the buyInId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyInId() {
        return buyInId;
    }

    /**
     * Sets the value of the buyInId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BuyIn2 setBuyInId(String value) {
        this.buyInId = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BuyIn2 setDt(XMLGregorianCalendar value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public BuyIn2 setPric(Price4 value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the sctiesBuyIn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesCompensation1 }
     *     
     */
    public SecuritiesCompensation1 getSctiesBuyIn() {
        return sctiesBuyIn;
    }

    /**
     * Sets the value of the sctiesBuyIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesCompensation1 }
     *     
     */
    public BuyIn2 setSctiesBuyIn(SecuritiesCompensation1 value) {
        this.sctiesBuyIn = value;
        return this;
    }

    /**
     * Gets the value of the reqrdCshCompstn property.
     * 
     * @return
     *     possible object is
     *     {@link CashCompensation1 }
     *     
     */
    public CashCompensation1 getReqrdCshCompstn() {
        return reqrdCshCompstn;
    }

    /**
     * Sets the value of the reqrdCshCompstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashCompensation1 }
     *     
     */
    public BuyIn2 setReqrdCshCompstn(CashCompensation1 value) {
        this.reqrdCshCompstn = value;
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
