
package com.prowidesoftware.swift.model.mx.sys.dic;

import com.prowidesoftware.swift.model.mx.sys.dic.SwAny;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for Authorisation complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authorisation", propOrder = {
    "snFRef",
    "copySnFRef",
    "service",
    "thirdPartyToReceiverInformation",
    "thirdPartyToSenderInformation",
    "thirdPartyRefusalReason",
    "signatureValue"
})
public class Authorisation
    extends AbstractAuthorisation
{

    @XmlElement(name = "SnFRef", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String snFRef;
    @XmlElement(name = "CopySnFRef", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String copySnFRef;
    @XmlElement(name = "Service", namespace = "urn:swift:snl:ns.SwInt", required = true)
    protected String service;
    @XmlElement(name = "ThirdPartyToReceiverInformation", namespace = "urn:swift:snl:ns.Sw")
    protected SwAny thirdPartyToReceiverInformation;
    @XmlElement(name = "ThirdPartyToSenderInformation", namespace = "urn:swift:snl:ns.Sw")
    protected SwAny thirdPartyToSenderInformation;
    @XmlElement(name = "ThirdPartyRefusalReason", namespace = "urn:swift:snl:ns.Sw")
    protected SwAny thirdPartyRefusalReason;
    @XmlElement(name = "SignatureValue", namespace = "urn:swift:snl:ns.SwSec")
    protected String signatureValue;

    /**
     * SnFRef
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFRef() {
        return snFRef;
    }

    /**
     * Sets the value of the snFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Authorisation setSnFRef(String value) {
        this.snFRef = value;
        return this;
    }

    /**
     * CopySnFRef
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopySnFRef() {
        return copySnFRef;
    }

    /**
     * Sets the value of the copySnFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Authorisation setCopySnFRef(String value) {
        this.copySnFRef = value;
        return this;
    }

    /**
     * Service
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Authorisation setService(String value) {
        this.service = value;
        return this;
    }

    /**
     * ThirdPartyToReceiverInformation
     * 
     * @return
     *     possible object is
     *     {@link SwAny }
     *     
     */
    public SwAny getThirdPartyToReceiverInformation() {
        return thirdPartyToReceiverInformation;
    }

    /**
     * Sets the value of the thirdPartyToReceiverInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAny }
     *     
     */
    public Authorisation setThirdPartyToReceiverInformation(SwAny value) {
        this.thirdPartyToReceiverInformation = value;
        return this;
    }

    /**
     * ThirdPartyToSenderInformation
     * 
     * @return
     *     possible object is
     *     {@link SwAny }
     *     
     */
    public SwAny getThirdPartyToSenderInformation() {
        return thirdPartyToSenderInformation;
    }

    /**
     * Sets the value of the thirdPartyToSenderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAny }
     *     
     */
    public Authorisation setThirdPartyToSenderInformation(SwAny value) {
        this.thirdPartyToSenderInformation = value;
        return this;
    }

    /**
     * ThirdPartyRefusalReason
     * 
     * @return
     *     possible object is
     *     {@link SwAny }
     *     
     */
    public SwAny getThirdPartyRefusalReason() {
        return thirdPartyRefusalReason;
    }

    /**
     * Sets the value of the thirdPartyRefusalReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAny }
     *     
     */
    public Authorisation setThirdPartyRefusalReason(SwAny value) {
        this.thirdPartyRefusalReason = value;
        return this;
    }

    /**
     * SignatureValue
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureValue() {
        return signatureValue;
    }

    /**
     * Sets the value of the signatureValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Authorisation setSignatureValue(String value) {
        this.signatureValue = value;
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
