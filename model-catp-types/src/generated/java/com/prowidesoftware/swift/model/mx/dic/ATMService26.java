
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
 * Service provided by the ATM inside the session.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMService26", propOrder = {
    "svcRef",
    "atmSvcCd",
    "hstSvcCd",
    "svcTp",
    "svcVarntId"
})
public class ATMService26 {

    @XmlElement(name = "SvcRef")
    protected String svcRef;
    @XmlElement(name = "ATMSvcCd")
    protected String atmSvcCd;
    @XmlElement(name = "HstSvcCd")
    protected String hstSvcCd;
    @XmlElement(name = "SvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMServiceType12Code svcTp;
    @XmlElement(name = "SvcVarntId")
    protected List<String> svcVarntId;

    /**
     * Gets the value of the svcRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcRef() {
        return svcRef;
    }

    /**
     * Sets the value of the svcRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMService26 setSvcRef(String value) {
        this.svcRef = value;
        return this;
    }

    /**
     * Gets the value of the atmSvcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMSvcCd() {
        return atmSvcCd;
    }

    /**
     * Sets the value of the atmSvcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMService26 setATMSvcCd(String value) {
        this.atmSvcCd = value;
        return this;
    }

    /**
     * Gets the value of the hstSvcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstSvcCd() {
        return hstSvcCd;
    }

    /**
     * Sets the value of the hstSvcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMService26 setHstSvcCd(String value) {
        this.hstSvcCd = value;
        return this;
    }

    /**
     * Gets the value of the svcTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMServiceType12Code }
     *     
     */
    public ATMServiceType12Code getSvcTp() {
        return svcTp;
    }

    /**
     * Sets the value of the svcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMServiceType12Code }
     *     
     */
    public ATMService26 setSvcTp(ATMServiceType12Code value) {
        this.svcTp = value;
        return this;
    }

    /**
     * Gets the value of the svcVarntId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcVarntId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcVarntId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the svcVarntId property.
     */
    public List<String> getSvcVarntId() {
        if (svcVarntId == null) {
            svcVarntId = new ArrayList<>();
        }
        return this.svcVarntId;
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
     * Adds a new item to the svcVarntId list.
     * @see #getSvcVarntId()
     * 
     */
    public ATMService26 addSvcVarntId(String svcVarntId) {
        getSvcVarntId().add(svcVarntId);
        return this;
    }

}
