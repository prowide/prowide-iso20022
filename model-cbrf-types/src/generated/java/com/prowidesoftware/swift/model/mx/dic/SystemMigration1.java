
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
 * Data about participant migration to new payment system process.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemMigration1", propOrder = {
    "npsPtcptInd",
    "plandMgrtnDt",
    "balRcvdInd",
    "mgrtd",
    "lastDt"
})
public class SystemMigration1 {

    @XmlElement(name = "NPSPtcptInd")
    protected Boolean npsPtcptInd;
    @XmlElement(name = "PlandMgrtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar plandMgrtnDt;
    @XmlElement(name = "BalRcvdInd")
    protected Boolean balRcvdInd;
    @XmlElement(name = "Mgrtd")
    protected Boolean mgrtd;
    @XmlElement(name = "LastDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastDt;

    /**
     * Gets the value of the npsPtcptInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNPSPtcptInd() {
        return npsPtcptInd;
    }

    /**
     * Sets the value of the npsPtcptInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SystemMigration1 setNPSPtcptInd(Boolean value) {
        this.npsPtcptInd = value;
        return this;
    }

    /**
     * Gets the value of the plandMgrtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPlandMgrtnDt() {
        return plandMgrtnDt;
    }

    /**
     * Sets the value of the plandMgrtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemMigration1 setPlandMgrtnDt(Calendar value) {
        this.plandMgrtnDt = value;
        return this;
    }

    /**
     * Gets the value of the balRcvdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalRcvdInd() {
        return balRcvdInd;
    }

    /**
     * Sets the value of the balRcvdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SystemMigration1 setBalRcvdInd(Boolean value) {
        this.balRcvdInd = value;
        return this;
    }

    /**
     * Gets the value of the mgrtd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMgrtd() {
        return mgrtd;
    }

    /**
     * Sets the value of the mgrtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SystemMigration1 setMgrtd(Boolean value) {
        this.mgrtd = value;
        return this;
    }

    /**
     * Gets the value of the lastDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastDt() {
        return lastDt;
    }

    /**
     * Sets the value of the lastDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemMigration1 setLastDt(Calendar value) {
        this.lastDt = value;
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
