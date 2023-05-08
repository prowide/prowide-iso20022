
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
 * Specifies elements related to the notification (or warn) sent by the central counterparty to the clearing member in the context of the buy in process.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyIn4", propOrder = {
    "wrngInd",
    "xpctdBuyInDt",
    "cxlLmtDt",
    "buyInRvrsnDt"
})
public class BuyIn4 {

    @XmlElement(name = "WrngInd")
    protected Boolean wrngInd;
    @XmlElement(name = "XpctdBuyInDt", required = true)
    protected DateFormat15Choice xpctdBuyInDt;
    @XmlElement(name = "CxlLmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar cxlLmtDt;
    @XmlElement(name = "BuyInRvrsnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar buyInRvrsnDt;

    /**
     * Gets the value of the wrngInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWrngInd() {
        return wrngInd;
    }

    /**
     * Sets the value of the wrngInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BuyIn4 setWrngInd(Boolean value) {
        this.wrngInd = value;
        return this;
    }

    /**
     * Gets the value of the xpctdBuyInDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat15Choice }
     *     
     */
    public DateFormat15Choice getXpctdBuyInDt() {
        return xpctdBuyInDt;
    }

    /**
     * Sets the value of the xpctdBuyInDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat15Choice }
     *     
     */
    public BuyIn4 setXpctdBuyInDt(DateFormat15Choice value) {
        this.xpctdBuyInDt = value;
        return this;
    }

    /**
     * Gets the value of the cxlLmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCxlLmtDt() {
        return cxlLmtDt;
    }

    /**
     * Sets the value of the cxlLmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BuyIn4 setCxlLmtDt(Calendar value) {
        this.cxlLmtDt = value;
        return this;
    }

    /**
     * Gets the value of the buyInRvrsnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getBuyInRvrsnDt() {
        return buyInRvrsnDt;
    }

    /**
     * Sets the value of the buyInRvrsnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BuyIn4 setBuyInRvrsnDt(Calendar value) {
        this.buyInRvrsnDt = value;
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
