
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
 * Information related to the request of a key download from an ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMKeyDownloadRequest5", propOrder = {
    "envt",
    "cmdRslt",
    "cmdCntxt",
    "atmSctyCntxt",
    "atmSctyParams",
    "hstChllng"
})
public class ATMKeyDownloadRequest5 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment15 envt;
    @XmlElement(name = "CmdRslt")
    protected List<ATMCommand15> cmdRslt;
    @XmlElement(name = "CmdCntxt")
    protected ATMCommand16 cmdCntxt;
    @XmlElement(name = "ATMSctyCntxt", required = true)
    protected ATMSecurityContext3 atmSctyCntxt;
    @XmlElement(name = "ATMSctyParams", required = true)
    protected SecurityParameters9 atmSctyParams;
    @XmlElement(name = "HstChllng")
    protected byte[] hstChllng;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment15 }
     *     
     */
    public ATMEnvironment15 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment15 }
     *     
     */
    public ATMKeyDownloadRequest5 setEnvt(ATMEnvironment15 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cmdRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmdRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmdRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCommand15 }
     * 
     * 
     * @return
     *     The value of the cmdRslt property.
     */
    public List<ATMCommand15> getCmdRslt() {
        if (cmdRslt == null) {
            cmdRslt = new ArrayList<>();
        }
        return this.cmdRslt;
    }

    /**
     * Gets the value of the cmdCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommand16 }
     *     
     */
    public ATMCommand16 getCmdCntxt() {
        return cmdCntxt;
    }

    /**
     * Sets the value of the cmdCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommand16 }
     *     
     */
    public ATMKeyDownloadRequest5 setCmdCntxt(ATMCommand16 value) {
        this.cmdCntxt = value;
        return this;
    }

    /**
     * Gets the value of the atmSctyCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityContext3 }
     *     
     */
    public ATMSecurityContext3 getATMSctyCntxt() {
        return atmSctyCntxt;
    }

    /**
     * Sets the value of the atmSctyCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityContext3 }
     *     
     */
    public ATMKeyDownloadRequest5 setATMSctyCntxt(ATMSecurityContext3 value) {
        this.atmSctyCntxt = value;
        return this;
    }

    /**
     * Gets the value of the atmSctyParams property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityParameters9 }
     *     
     */
    public SecurityParameters9 getATMSctyParams() {
        return atmSctyParams;
    }

    /**
     * Sets the value of the atmSctyParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityParameters9 }
     *     
     */
    public ATMKeyDownloadRequest5 setATMSctyParams(SecurityParameters9 value) {
        this.atmSctyParams = value;
        return this;
    }

    /**
     * Gets the value of the hstChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHstChllng() {
        return hstChllng;
    }

    /**
     * Sets the value of the hstChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public ATMKeyDownloadRequest5 setHstChllng(byte[] value) {
        this.hstChllng = value;
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
     * Adds a new item to the cmdRslt list.
     * @see #getCmdRslt()
     * 
     */
    public ATMKeyDownloadRequest5 addCmdRslt(ATMCommand15 cmdRslt) {
        getCmdRslt().add(cmdRslt);
        return this;
    }

}
