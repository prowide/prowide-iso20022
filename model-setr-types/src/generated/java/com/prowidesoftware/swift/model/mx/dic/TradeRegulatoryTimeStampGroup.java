
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * National Asociation Of Securities Dealers (NASD) regulatory requirement (provides information about the time is order was received and executed).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeRegulatoryTimeStampGroup", propOrder = {
    "tradRgltryTmStmp",
    "tradRgltryTmStmpTp",
    "tradRgltryTmStmpOrgn",
    "dskTp",
    "dskTpSrc",
    "dskOrdrHdlgInstrs"
})
public class TradeRegulatoryTimeStampGroup {

    @XmlElement(name = "TradRgltryTmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar tradRgltryTmStmp;
    @XmlElement(name = "TradRgltryTmStmpTp")
    protected String tradRgltryTmStmpTp;
    @XmlElement(name = "TradRgltryTmStmpOrgn", required = true)
    protected String tradRgltryTmStmpOrgn;
    @XmlElement(name = "DskTp")
    protected String dskTp;
    @XmlElement(name = "DskTpSrc")
    protected String dskTpSrc;
    @XmlElement(name = "DskOrdrHdlgInstrs")
    protected CustomerHandlingInstructionChoice dskOrdrHdlgInstrs;

    /**
     * Gets the value of the tradRgltryTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTradRgltryTmStmp() {
        return tradRgltryTmStmp;
    }

    /**
     * Sets the value of the tradRgltryTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeRegulatoryTimeStampGroup setTradRgltryTmStmp(Calendar value) {
        this.tradRgltryTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the tradRgltryTmStmpTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradRgltryTmStmpTp() {
        return tradRgltryTmStmpTp;
    }

    /**
     * Sets the value of the tradRgltryTmStmpTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeRegulatoryTimeStampGroup setTradRgltryTmStmpTp(String value) {
        this.tradRgltryTmStmpTp = value;
        return this;
    }

    /**
     * Gets the value of the tradRgltryTmStmpOrgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradRgltryTmStmpOrgn() {
        return tradRgltryTmStmpOrgn;
    }

    /**
     * Sets the value of the tradRgltryTmStmpOrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeRegulatoryTimeStampGroup setTradRgltryTmStmpOrgn(String value) {
        this.tradRgltryTmStmpOrgn = value;
        return this;
    }

    /**
     * Gets the value of the dskTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDskTp() {
        return dskTp;
    }

    /**
     * Sets the value of the dskTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeRegulatoryTimeStampGroup setDskTp(String value) {
        this.dskTp = value;
        return this;
    }

    /**
     * Gets the value of the dskTpSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDskTpSrc() {
        return dskTpSrc;
    }

    /**
     * Sets the value of the dskTpSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeRegulatoryTimeStampGroup setDskTpSrc(String value) {
        this.dskTpSrc = value;
        return this;
    }

    /**
     * Gets the value of the dskOrdrHdlgInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerHandlingInstructionChoice }
     *     
     */
    public CustomerHandlingInstructionChoice getDskOrdrHdlgInstrs() {
        return dskOrdrHdlgInstrs;
    }

    /**
     * Sets the value of the dskOrdrHdlgInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerHandlingInstructionChoice }
     *     
     */
    public TradeRegulatoryTimeStampGroup setDskOrdrHdlgInstrs(CustomerHandlingInstructionChoice value) {
        this.dskOrdrHdlgInstrs = value;
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
