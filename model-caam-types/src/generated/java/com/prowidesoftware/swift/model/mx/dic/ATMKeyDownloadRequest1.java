
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
 * Information related to the request of a key download from an ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMKeyDownloadRequest1", propOrder = {
    "envt",
    "cmdRslt",
    "cmdCntxt",
    "atmSctyCntxt",
    "atmSctyParams",
    "hstChllng"
})
public class ATMKeyDownloadRequest1 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment8 envt;
    @XmlElement(name = "CmdRslt")
    protected List<ATMCommand2> cmdRslt;
    @XmlElement(name = "CmdCntxt")
    protected ATMCommand3 cmdCntxt;
    @XmlElement(name = "ATMSctyCntxt", required = true)
    protected ATMSecurityContext2 atmSctyCntxt;
    @XmlElement(name = "ATMSctyParams", required = true)
    protected SecurityParameters4 atmSctyParams;
    @XmlElement(name = "HstChllng")
    protected byte[] hstChllng;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment8 }
     *     
     */
    public ATMEnvironment8 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment8 }
     *     
     */
    public ATMKeyDownloadRequest1 setEnvt(ATMEnvironment8 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cmdRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmdRslt property.
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
     * {@link ATMCommand2 }
     * 
     * 
     */
    public List<ATMCommand2> getCmdRslt() {
        if (cmdRslt == null) {
            cmdRslt = new ArrayList<ATMCommand2>();
        }
        return this.cmdRslt;
    }

    /**
     * Gets the value of the cmdCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommand3 }
     *     
     */
    public ATMCommand3 getCmdCntxt() {
        return cmdCntxt;
    }

    /**
     * Sets the value of the cmdCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommand3 }
     *     
     */
    public ATMKeyDownloadRequest1 setCmdCntxt(ATMCommand3 value) {
        this.cmdCntxt = value;
        return this;
    }

    /**
     * Gets the value of the atmSctyCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityContext2 }
     *     
     */
    public ATMSecurityContext2 getATMSctyCntxt() {
        return atmSctyCntxt;
    }

    /**
     * Sets the value of the atmSctyCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityContext2 }
     *     
     */
    public ATMKeyDownloadRequest1 setATMSctyCntxt(ATMSecurityContext2 value) {
        this.atmSctyCntxt = value;
        return this;
    }

    /**
     * Gets the value of the atmSctyParams property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityParameters4 }
     *     
     */
    public SecurityParameters4 getATMSctyParams() {
        return atmSctyParams;
    }

    /**
     * Sets the value of the atmSctyParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityParameters4 }
     *     
     */
    public ATMKeyDownloadRequest1 setATMSctyParams(SecurityParameters4 value) {
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
    public ATMKeyDownloadRequest1 setHstChllng(byte[] value) {
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
    public ATMKeyDownloadRequest1 addCmdRslt(ATMCommand2 cmdRslt) {
        getCmdRslt().add(cmdRslt);
        return this;
    }

}
