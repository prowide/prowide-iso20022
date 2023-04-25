
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
 * Information related to the response of an ATM key download from an ATM manager.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMKeyDownloadResponse4", propOrder = {
    "envt",
    "atmSctyCntxt",
    "atmChllng",
    "hstSctyParams",
    "cmd"
})
public class ATMKeyDownloadResponse4 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment7 envt;
    @XmlElement(name = "ATMSctyCntxt", required = true)
    protected ATMSecurityContext3 atmSctyCntxt;
    @XmlElement(name = "ATMChllng")
    protected byte[] atmChllng;
    @XmlElement(name = "HstSctyParams", required = true)
    protected SecurityParameters10 hstSctyParams;
    @XmlElement(name = "Cmd")
    protected List<ATMCommand13> cmd;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment7 }
     *     
     */
    public ATMEnvironment7 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment7 }
     *     
     */
    public ATMKeyDownloadResponse4 setEnvt(ATMEnvironment7 value) {
        this.envt = value;
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
    public ATMKeyDownloadResponse4 setATMSctyCntxt(ATMSecurityContext3 value) {
        this.atmSctyCntxt = value;
        return this;
    }

    /**
     * Gets the value of the atmChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getATMChllng() {
        return atmChllng;
    }

    /**
     * Sets the value of the atmChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public ATMKeyDownloadResponse4 setATMChllng(byte[] value) {
        this.atmChllng = value;
        return this;
    }

    /**
     * Gets the value of the hstSctyParams property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityParameters10 }
     *     
     */
    public SecurityParameters10 getHstSctyParams() {
        return hstSctyParams;
    }

    /**
     * Sets the value of the hstSctyParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityParameters10 }
     *     
     */
    public ATMKeyDownloadResponse4 setHstSctyParams(SecurityParameters10 value) {
        this.hstSctyParams = value;
        return this;
    }

    /**
     * Gets the value of the cmd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCommand13 }
     * 
     * 
     * @return
     *     The value of the cmd property.
     */
    public List<ATMCommand13> getCmd() {
        if (cmd == null) {
            cmd = new ArrayList<>();
        }
        return this.cmd;
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
     * Adds a new item to the cmd list.
     * @see #getCmd()
     * 
     */
    public ATMKeyDownloadResponse4 addCmd(ATMCommand13 cmd) {
        getCmd().add(cmd);
        return this;
    }

}
