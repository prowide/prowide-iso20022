
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional indicators on the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionIndicator2", propOrder = {
    "wvrInd",
    "shrtSellgInd",
    "otcPstTradInd",
    "rskRdcgTx",
    "sctiesFincgTxInd"
})
public class SecuritiesTransactionIndicator2 {

    @XmlElement(name = "WvrInd")
    @XmlSchemaType(name = "string")
    protected List<ReportingWaiverType1Code> wvrInd;
    @XmlElement(name = "ShrtSellgInd")
    @XmlSchemaType(name = "string")
    protected Side5Code shrtSellgInd;
    @XmlElement(name = "OTCPstTradInd")
    @XmlSchemaType(name = "string")
    protected List<ReportingWaiverType3Code> otcPstTradInd;
    @XmlElement(name = "RskRdcgTx")
    protected Boolean rskRdcgTx;
    @XmlElement(name = "SctiesFincgTxInd")
    protected boolean sctiesFincgTxInd;

    /**
     * Gets the value of the wvrInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wvrInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWvrInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportingWaiverType1Code }
     * 
     * 
     * @return
     *     The value of the wvrInd property.
     */
    public List<ReportingWaiverType1Code> getWvrInd() {
        if (wvrInd == null) {
            wvrInd = new ArrayList<>();
        }
        return this.wvrInd;
    }

    /**
     * Gets the value of the shrtSellgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Side5Code }
     *     
     */
    public Side5Code getShrtSellgInd() {
        return shrtSellgInd;
    }

    /**
     * Sets the value of the shrtSellgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Side5Code }
     *     
     */
    public SecuritiesTransactionIndicator2 setShrtSellgInd(Side5Code value) {
        this.shrtSellgInd = value;
        return this;
    }

    /**
     * Gets the value of the otcPstTradInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the otcPstTradInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOTCPstTradInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportingWaiverType3Code }
     * 
     * 
     * @return
     *     The value of the otcPstTradInd property.
     */
    public List<ReportingWaiverType3Code> getOTCPstTradInd() {
        if (otcPstTradInd == null) {
            otcPstTradInd = new ArrayList<>();
        }
        return this.otcPstTradInd;
    }

    /**
     * Gets the value of the rskRdcgTx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRskRdcgTx() {
        return rskRdcgTx;
    }

    /**
     * Sets the value of the rskRdcgTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesTransactionIndicator2 setRskRdcgTx(Boolean value) {
        this.rskRdcgTx = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgTxInd property.
     * 
     */
    public boolean isSctiesFincgTxInd() {
        return sctiesFincgTxInd;
    }

    /**
     * Sets the value of the sctiesFincgTxInd property.
     * 
     */
    public SecuritiesTransactionIndicator2 setSctiesFincgTxInd(boolean value) {
        this.sctiesFincgTxInd = value;
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
     * Adds a new item to the wvrInd list.
     * @see #getWvrInd()
     * 
     */
    public SecuritiesTransactionIndicator2 addWvrInd(ReportingWaiverType1Code wvrInd) {
        getWvrInd().add(wvrInd);
        return this;
    }

    /**
     * Adds a new item to the oTCPstTradInd list.
     * @see #getOTCPstTradInd()
     * 
     */
    public SecuritiesTransactionIndicator2 addOTCPstTradInd(ReportingWaiverType3Code oTCPstTradInd) {
        getOTCPstTradInd().add(oTCPstTradInd);
        return this;
    }

}
