
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
 * Information related to the report from an ATM device.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDeviceReport1", propOrder = {
    "envt",
    "atmGblSts",
    "cmdRslt",
    "cmdCntxt",
    "atmSctyCntxt"
})
public class ATMDeviceReport1 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment6 envt;
    @XmlElement(name = "ATMGblSts", required = true)
    protected ATMStatus1 atmGblSts;
    @XmlElement(name = "CmdRslt")
    protected List<ATMCommand2> cmdRslt;
    @XmlElement(name = "CmdCntxt")
    protected ATMCommand3 cmdCntxt;
    @XmlElement(name = "ATMSctyCntxt")
    protected ATMSecurityContext1 atmSctyCntxt;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment6 }
     *     
     */
    public ATMEnvironment6 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment6 }
     *     
     */
    public ATMDeviceReport1 setEnvt(ATMEnvironment6 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the atmGblSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMStatus1 }
     *     
     */
    public ATMStatus1 getATMGblSts() {
        return atmGblSts;
    }

    /**
     * Sets the value of the atmGblSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMStatus1 }
     *     
     */
    public ATMDeviceReport1 setATMGblSts(ATMStatus1 value) {
        this.atmGblSts = value;
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
     * {@link ATMCommand2 }
     * 
     * 
     * @return
     *     The value of the cmdRslt property.
     */
    public List<ATMCommand2> getCmdRslt() {
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
    public ATMDeviceReport1 setCmdCntxt(ATMCommand3 value) {
        this.cmdCntxt = value;
        return this;
    }

    /**
     * Gets the value of the atmSctyCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityContext1 }
     *     
     */
    public ATMSecurityContext1 getATMSctyCntxt() {
        return atmSctyCntxt;
    }

    /**
     * Sets the value of the atmSctyCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityContext1 }
     *     
     */
    public ATMDeviceReport1 setATMSctyCntxt(ATMSecurityContext1 value) {
        this.atmSctyCntxt = value;
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
    public ATMDeviceReport1 addCmdRslt(ATMCommand2 cmdRslt) {
        getCmdRslt().add(cmdRslt);
        return this;
    }

}
